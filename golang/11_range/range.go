package main

import "fmt"
//note in map i get k and v using range but in struct i dont and in slice i get
// iterating over data structures
func main() {

	type human struct {
		name string
		age int
	}

	persons := []human{}


	person1 := human{"bhavesh",20}
	person2 := human{"vipul",21}
	person3 := human{"vedant",22}
	person4 := human{"chandan",23}

	//The append function returns a new slice containing the appended elements; you must assign it back to persons.
	persons = append(persons,person1,person2,person3,person4)

	for i,v := range  persons {
		fmt.Print(i,v)
	}
	// nums := []int{6, 7, 8}

	// for i, num := range nums {
	// 	fmt.Println(num, i)
	// }


	// m := map[string]string{"fname": "john", "lname": "doe"}

	// for k, v := range m {
	// 	fmt.Println(k, v)
	// 	fmt.Println(k, v)
	// }

	// for k := range m {
	// 	fmt.Println(k)
	// }

	// unicode code point rune
	// starting byte of rune
	// 300 -> 1 byte , 2 byte
	// for i, c := range "golang" {
	// 	fmt.Println(i, string(c))
	// }

}