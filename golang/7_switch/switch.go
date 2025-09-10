package main

import (
	"fmt"
	"time"
)

func main() {
	i := 5
	switch i {
	case 1:
		fmt.Println("one")
	case 2:
		fmt.Print("two")
	default:
		fmt.Println("default")
	}

	switch time.Now().Weekday() {
	case time.Sunday, time.Saturday :
		fmt.Println("Its weekend") 
	default:
		fmt.Println("Its workday")
	}

	//type switch
	whoAmI := func(i interface{}) {
		switch i.(type) {
		case int:
			fmt.Println("Its a integer")
		case string :
			fmt.Println("Its a string")
		case bool :
			fmt.Println("Its a boolean")
		default:
			fmt.Println("Other")
		} 
	}
	
	whoAmI("golang")
}