package main

import "fmt"

// Dereferencing means accessing the value stored at the memory address that a pointer is pointing to.

// In Go, a pointer holds the memory address of a variable.

// To get the value stored at that address, you use the dereference operator *.

// This allows you to read or modify the actual data stored at that memory location.

// Define a struct named 'person' with three fields
type person struct {
    name   string
    age    int
    gender string
}

// Function to change the age field of a person
// Takes a pointer to a person struct as an argument
func changeAge(person1 *person) {
    // In Go, you can access struct fields through pointers without explicit dereferencing.
    // This line increases the age by 3 for the person pointed to by person1.
    person1.age = person1.age + 3
}

// Function to change the value of an integer via its pointer
func changeNum(num *int) {
    // Dereference the pointer and assign the new value 5
    *num = 5
    fmt.Println("In changeNum", *num)  // Print the updated value inside the function
}

func main() {
    num := 1                 // Integer variable with initial value 1
    person1 := person{"aman", 11, "male"}  // Create a person struct instance

    // Pass the address of person1 to changeAge; modifies the original person1
    changeAge(&person1)

    // Pass the address of num to changeNum; modifies the original num
    changeNum(&num)

    // Print the updated person and num values
    fmt.Println(person1, num)
}
