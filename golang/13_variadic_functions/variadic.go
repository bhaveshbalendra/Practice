package main

import "fmt"

//In Go, a variadic function is a function that can accept a variable number of arguments of the same type. This is useful when the number of inputs is not known beforehand.
//The ...Type means the function can be called with zero or more arguments of that type.
//Inside the function, the variadic parameter acts like a slice of that type.
func sum(nums ...int) int {
	total := 0

	for _, num := range nums {
		total = total + num
	}

	return total
}

func greet(prefix string, names ...string) {
    fmt.Println(prefix)
    for _, name := range names {
        fmt.Println(name)
    }
}

func main() {
	nums := []int{3, 4, 5, 6}
	//You can also pass a slice by using ellipsis ... to expand it:
	result := sum(nums...)
	fmt.Println(result)
	greet("Hello", "Alice", "Bob", "Charlie")
}

// func foo() (int, string) {
//     return 1, "two"
// }

// a, b := foo()  // assigns multiple return values to variables

