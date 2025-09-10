package main

import (
    "fmt"
    "time"
)

// Define a 'customer' struct representing customer information
// It contains fields for name and phone number
type customer struct {
    name  string
    phone string
}

// Define an 'order' struct representing an order placed by a customer
// It uses struct composition by embedding the 'customer' struct.
// This means 'order' will have access to all fields of 'customer' as if they belong to 'order'.
// Other fields include order id, amount, status and createdAt timestamp
type order struct {
    id        string    // unique identifier for the order
    amount    float32   // total amount for the order
    status    string    // current status, e.g., "received", "paid"
    createdAt time.Time // timestamp for when the order was created with nanosecond precision
    customer             // embedded struct (composition) - represents who placed the order
}

// Method on order: changeStatus updates the order's status field
// Shows how functions can be associated with structs using method receivers
func (o *order) changeStatus(newStatus string) {
    o.status = newStatus
}

// Method on order: setCreatedAt sets the current time as the order creation time
func (o *order) setCreatedAt() {
    o.createdAt = time.Now()
}

// Function type representing a function that takes an order pointer and modifies it in some way
type orderFunc func(*order)

func main() {
    // Creating a new instance of order with embedded customer details
    newOrder := order{
        id:     "1",         // order id
        amount: 30,          // order amount in float, 30.00
        status: "received",  // order status
        customer: customer{   // customer details embedded inline
            name:  "john",
            phone: "1234567890",
        },
    }

    // Change the customer's name to "robin"
    newOrder.customer.name = "robin"

    // Print the full newOrder struct with updated customer name
    fmt.Println(newOrder)

    // Using the method to change status of order
    newOrder.changeStatus("paid")
    fmt.Println("Status after change:", newOrder.status)

    // Using the method to set creation time of order
    newOrder.setCreatedAt()
    fmt.Println("Created at:", newOrder.createdAt)

    // Example using function type (orderFunc) to perform actions on order
    // Define some functions matching the orderFunc type
    discount := func(o *order) {
        o.amount = o.amount * 0.9 // apply 10% discount
    }
    updateStatus := func(o *order) {
        o.status = "shipped"
    }

    // Apply the functions on newOrder
    var actions []orderFunc = []orderFunc{discount, updateStatus}

    for _, action := range actions {
        action(&newOrder) // call each function passing pointer to newOrder
    }

    fmt.Println("After applying functions with orderFunc type:", newOrder)
}

