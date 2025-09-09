package main

import "fmt"

//for -> only construct in go for looping
func main() {

	//while loop
	// i := 1
	// for i <=3 {
	// 	fmt.Println(i)
	// 	i = i+1
	// }

	//infinite loop
	// for {

	// }

	//classic for
	for i:=0; i< 3; i++ {
		fmt.Println(i)
	}

	//or 

	// for i:=range 3 {
	// 	fmt.Println(i)
	// }

	// continue and break
	// for i:=0; i< 3; i++ {
	// 	if i==2 {
	// 		continue
	// 	}
	// 	fmt.Println(i)
	// }

}