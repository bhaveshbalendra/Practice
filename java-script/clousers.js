// In JavaScript a closure is a function that remembers the environment in which it was created even after the outer
// function has finished executing. This allows the closure to access variables from its outer scope even when it is executed outside of that scope.

function counter() {
  let count = 0;

  return {
    increment: function () {
      count++;
      return count;
    },
    decrement: function () {
      count--;
      return count;
    },
    getCount: function () {
      return count;
    },
  };
}

console.log("Creating a counter...");
const myCounter = counter();

console.log(myCounter.increment()); // 1
console.log(myCounter.increment()); // 2
console.log(myCounter.decrement()); // 1
console.log(myCounter.getCount()); // 1
