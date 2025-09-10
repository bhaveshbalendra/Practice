package main

import (
    "fmt"
    "sync"
)

// display is a function that will be run as a goroutine.
// It prints the given message 3 times and then signals completion to the WaitGroup.
func display(message string, wg *sync.WaitGroup) {
    // Loop to print the message multiple times
    for i := 0; i < 3; i++ {
        fmt.Println(message)
    }

    // Notify the WaitGroup that this goroutine has finished its work.
    // This decrements the internal counter by 1.
    wg.Done()
}

func main() {
    // Declare a WaitGroup variable to manage concurrency synchronization.
    var wg sync.WaitGroup

    // Adding "1" to the WaitGroup counter.
    // This indicates we are going to wait for one goroutine to finish.
    wg.Add(1)

    // Start the display function as a goroutine.
    // The WaitGroup is passed by pointer so the goroutine can signal when done.
    go display("Hello", &wg)

    // The Wait method blocks the main goroutine.
    // It waits here until the WaitGroup counter is reduced to zero,
    // meaning all goroutines have completed.
    wg.Wait()

    // This print statement will only execute once all goroutines have finished.
    fmt.Println("All goroutines have completed")
}
