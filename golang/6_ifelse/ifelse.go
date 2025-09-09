package main

import "fmt"

func main() {
	age :=18

	if age>=18 {
		fmt.Println("person is an adult")
	}else if age >=12 {
		fmt.Println("person is an teenager")
		
	}else {
		fmt.Println("person is not adult")
	}
	
	//we can declare a variable inside if and check condition and use inside it
	if weight :=20; weight>=18 {
		fmt.Println("person is not adult",weight)
		
	}

	//go does not have ternary you will have to use norma if else
}