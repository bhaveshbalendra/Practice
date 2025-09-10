package main

import "fmt"

// Encapsulation: Struct holds data and methods operate on that data
type Person struct {
    name string // private field (unexported due to lowercase)
    Age  int    // public field (exported due to uppercase)
}

// Method on struct Person demonstrating encapsulated behavior
func (p *Person) Greet() {
    fmt.Println("Hello, my name is", p.name) // accessing private field within the struct method
}

// Abstraction: Interface defines behavior without specifying implementation
type Shape interface {
    Area() float64 // method that any Shape must implement
}

// Circle struct implements Shape interface
type Circle struct {
    radius float64 // radius of the circle
}

// Area method for Circle that satisfies Shape interface
func (c Circle) Area() float64 {
    return 3.14 * c.radius * c.radius // Area formula for circle
}

// Rectangle struct implements Shape interface
type Rectangle struct {
    width, height float64 // dimensions of rectangle
}

// Area method for Rectangle that satisfies Shape interface
func (r Rectangle) Area() float64 {
    return r.width * r.height // Area formula for rectangle
}

// Function demonstrating polymorphism: accepts any Shape
func printArea(s Shape) {
    fmt.Println("Area:", s.Area()) // Calls the appropriate Area() depending on concrete type
}

// Inheritance via Composition (embedding)
type Animal struct {
    Name string // name of the animal
}

// Method owned by Animal
func (a Animal) Speak() {
    fmt.Println(a.Name, "makes a sound") // generic animal sound
}

// Dog struct embeds Animal to inherit its fields and methods
type Dog struct {
    Animal      // embedding Animal for reuse of fields and methods
    Breed string // specific field for Dog
}

// Dog overrides Speak method of Animal
func (d Dog) Speak() {
    fmt.Println(d.Name, "barks") // specific behavior for Dog
}

// Polymorphism example with Vehicle interface
type Vehicle interface {
    Move() // all vehicles must implement Move()
}

type Car struct{}

func (Car) Move() {
    fmt.Println("Car drives on the road") // Car's implementation of Move
}

type Plane struct{}

func (Plane) Move() {
    fmt.Println("Plane flies in the sky") // Plane's implementation of Move
}

// Function demonstrating use of polymorphism with Vehicle interface
func travel(v Vehicle) {
    v.Move() // dynamic dispatch: calls Move of concrete type assigned to v
}

// Factory function replacing constructor concept (Go does not have constructors)
func NewPerson(name string, age int) Person {
    return Person{name: name, Age: age} // returns initialized Person struct
}

// func main() {
//     // Encapsulation example
//     p := NewPerson("Alice", 25)
//     p.Greet() // calls method accessing encapsulated private field
//
//     // Abstraction and Polymorphism examples
//     c := Circle{radius: 5}
//     r := Rectangle{width: 4, height: 6}
//
//     printArea(c) // Circle's Area()
//     printArea(r) // Rectangle's Area()
//
//     // Inheritance via composition example
//     d := Dog{Animal: Animal{Name: "Buddy"}, Breed: "Labrador"}
//
//     d.Speak()        // Calls Dog's overridden Speak method
//     d.Animal.Speak() // Calls embedded Animal's Speak method explicitly
//
//     // More polymorphism example with Vehicle interface
//     var v Vehicle
//
//     v = Car{}
//     travel(v)  // Output: Car drives on the road
//
//     v = Plane{}
//     travel(v)  // Output: Plane flies in the sky
// }