package main

import "fmt"

/*
Different Ways to Declare Functions in Go

1. Basic Function Declaration:
// Named function with parameters and optional return type
func add(a int, b int) int {
    return a + b
}

2. Multiple Return Values:
// Function returning two values of the same type
func swap(x, y string) (string, string) {
    return y, x
}

3. No Parameters or Return Values:
// Simple function with no input or output
func greet() {
    fmt.Println("Hello!")
}

4. Named Return Values:
// Return values named for easier return usage
func split(sum int) (x, y int) {
    x = sum * 4 / 9
    y = sum - x
    return
}

5. Anonymous Functions (Function Literals):
// Function without a name, assigned to a variable
f := func(a int, b int) int {
    return a + b
}
result := f(3, 4)

6. Named Function Types:
// Creating an alias for a function signature
type binOp func(int, int) int
func add(a, b int) int { return a + b }
var f binOp = add

7. Functions as Parameters:
// Higher-order functions accepting functions
func compute(a, b int, op func(int, int) int) int {
    return op(a, b)
}
output := compute(5, 6, add)

8. Methods (Functions with Receiver):
// Function with receiver ties behavior to types (like OOP methods)
type Rectangle struct {
    Width, Height float64
}
func (r Rectangle) Area() float64 {
    return r.Width * r.Height
}

9. Function Returning Another Function:
// Functions can return functions for flexible behavior
func makeMultiplier(factor int) func(int) int {
    return func(x int) int {
        return x * factor
    }
}
multBy3 := makeMultiplier(3)
fmt.Println(multBy3(5)) // 15

10. Variadic Functions:
// Accepts variable number of arguments
func sum(nums ...int) int {
    total := 0
    for _, num := range nums {
        total += num
    }
    return total
}

Summary:
- Go supports multiple styles of declaring functions covering basic to advanced needs.
- Functions can be first-class citizens: assigned to variables, passed as arguments, and returned.
- Methods add behavior to user-defined types.
- Closure support allows functions to return other functions, often used for configuration or state.
- Variadic functions accept flexible numbers of parameters.

This flexibility lets Go programmers write clear, modular, and reusable code.

*/


// func add(a, b int) int {
// 	return a + b
// }

// func getLanguages() (string, string, bool) {
// 	return "golang", "javascript", true
// }

//fist class function
// func processIt(fn func(a int) int) {
// 	fn(1)
// }

// func processIt() func(a int) int {
// 	return func(a int) int {
// 		return 4
// 	}
// }

func add() int {
	return 3;
}
func main() {
	// fn := func(a int) int {
	// 	return 2
	// }
	val := add()
	fmt.Print(val)
	// fn := processIt()
	// fn(6)

	// lang1, lang2, _ := getLanguages()
	// fmt.Println(lang1, lang2)
	// result := add(3, 5)
	// fmt.Println(result)
}
// anonymous function 
//   greet := func(name string) {
//         fmt.Printf("Hello, %s!\n", name)
//     }

//     greet("Alice")  // Output: Hello, Alice!

//     func(msg string) {
//         fmt.Println(msg)
//     }("This is an anonymous function called immediately")

/*
Detailed Notes on Function Types and Usage in Go with Examples

1. Function Types in Go:
   - Define the signature of a function: parameter and return types.
   - Example:
     type orderFunc func(*order)
     // 'orderFunc' is any function taking pointer to 'order' and returning nothing.

2. Defining Named Function Types:
   - Using 'type' creates a named alias for reuse and clarity.
   - Example:
     type orderFunc func(*order)

3. Using Functions Without 'type' Keyword:
   - Use function signatures directly without naming the type.
   - Example:
     func apply(f func(int) int, val int) int {
         return f(val)
     }

4. Function Parameter Naming:
   - Function type declarations only specify types.
   - Actual function definitions require parameter names.
   - Example of type declaration:
     type intFunc func(int) int
   - Example of function definition:
     func double(x int) int {
         return x * 2
     }

5. Pointer Parameters in Function Types:
   - Allows functions to modify the original value.
   - Example:
     type orderFunc func(*order)

6. Creating and Using Function Variables:
   - Assign anonymous or named functions.
   - Example:
     var f orderFunc = func(o *order) {
         o.status = "paid"
     }
     f(&myOrder)

7. Practical Senior Use Cases:
   - Middleware pipelines:
     funcs := []orderFunc{
         func(o *order) { o.amount *= 0.9 },           // discount
         func(o *order) { o.status = "confirmed" },    // confirm order
     }
     for _, fn := range funcs {
         fn(&orderInstance)
     }

   - Callbacks in async code:
     func asyncProcess(o *order, callback orderFunc) {
         // process order ...
         callback(o) // notify when done
     }

8. Named Types from Built-in Types:
   - Example:
     type Age int
     type Name string

9. Example Code Combining Concepts:

   type order struct {
       id     string
       amount float32
       status string
   }

   type orderFunc func(*order)

   func changeStatus(o *order) {
       o.status = "shipped"
   }

   func applyDiscount(o *order) {
       o.amount *= 0.9
   }

   func processOrder(o *order, actions []orderFunc) {
       for _, fn := range actions {
           fn(o)
       }
   }

   func main() {
       o := &order{id: "123", amount: 100, status: "received"}
       
       // Define actions pipeline
       actions := []orderFunc{applyDiscount, changeStatus}
       
       processOrder(o, actions)
       
       fmt.Println(o.status)  // Output: shipped
       fmt.Println(o.amount)  // Output: 90
   }

Summary:
- Use 'type' to name function types for clarity and reuse.
- Function types describe inputs and outputs of functions.
- Functions can take pointers to structs to modify data in place.
- Function variables and slices support flexible, composable code.
- Parameter names required only in function definitions, not in type declarations.
*/
