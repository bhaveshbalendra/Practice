package main

import (
	"fmt"
	"time"
)

// The commented out processNum function is a simple example of
// launching a goroutine to receive data from a channel and process it.
func processNum(chan1 chan int) {
	val := <-chan1                  // Receive integer from channel (blocks until data arrives)
	fmt.Print("process ", val)     // Process (print) the received integer
}

// emailService processes incoming email messages concurrently.
// It reads from the email channel until the channel is closed.
// After processing all messages, it signals completion by sending true on the done channel.
// The deferred done signaling ensures it's sent even if the function exits unexpectedly.
func emailService(email chan string, done chan bool) {
	defer func() { done <- true }()    // Signal completion when exiting
	for e := range email {              // continuously receive from email channel until closed
		fmt.Println(e)                  // print each email message
		time.Sleep(time.Second * 1)    // simulate processing delay
	}
}

func main() {
	// Create a buffered email channel with capacity 100.
	// Buffered means sends do not block immediately.
	email := make(chan string, 100)
	done := make(chan bool)             // channel to receive completion signal

	go emailService(email, done)        // Launch emailService goroutine

	// Send 5 emails concurrently; buffered channel prevents blocking on send.
	for i := 0; i < 5; i++ {
		email <- fmt.Sprintf("%d email id", i) // send formatted strings
	}

	fmt.Println("completed") // prints immediately after sending emails

	close(email)  // close channel to signal no more emails
	<-done        // wait for emailService goroutine to finish

	// Demonstrate select statement usage with multiple channels:

	chan1 := make(chan int)      // unbuffered int channel
	chan2 := make(chan string)   // unbuffered string channel

	// Launch two goroutines that send data on chan1 and chan2 respectively
	go func() {
		chan1 <- 10
	}()
	go func() {
		chan2 <- "pong"
	}()

	for i := 0; i < 2; i++ {      // wait for 2 messages total
		select {                  // wait on multiple channels simultaneously
		case chan1Val := <-chan1:
			fmt.Println("received data from chan1", chan1Val)
		case chan2Val := <-chan2:
			fmt.Println("received data from chan2", chan2Val)
		}
	}

	// Now, showing the previously commented out example integrated:
	// Creating an unbuffered int channel
	chan3 := make(chan int)
	// Launching processNum as a goroutine to process incoming integers from chan3
	go processNum(chan3)

	// Send an integer to chan3, this will unblock processNum which receives and processes it
	chan3 <- 12

	// Sleep to allow goroutine time to process (not ideal in real code - better to sync properly)
	time.Sleep(time.Second * 2)
}

// secondary main2 function shows similar email processing but using an unbuffered channel
func main2() {
	email := make(chan string)     // unbuffered channel: send blocks until receive is ready
	done := make(chan bool)

	go emailService(email, done)   // launch emailService goroutine

	// Send 5 emails; each send will block until emailService receives it due to unbuffered channel
	for i := 0; i < 5; i++ {
		email <- fmt.Sprintf("%d email id", i)
	}

	fmt.Println("completed")       // prints after all sends succeed

	close(email)                   // close channel signaling no more emails
	<-done                         // wait for emailService to finish processing
}
