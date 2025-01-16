// Programming Question: Hash Tag Generator
// You are required to implement a function generateHash that generates a hash tag from a given input string.
// The hash tag should be constructed as follows:
// The input string should be converted to a hash tag format, where each word is capitalized and concatenated
// together without spaces.
// If the length of the input string is greater than 280 characters or if the input string is empty or
// contains only whitespace, the function should return false.
// Otherwise, the function should return the generated hash tag prefixed with #.
// Write a function generateHash to accomplish this task.

function hashTagGenerator(message) {
  if (message.length > 240 || message.trim().length === 0) {
    return false;
  }
  return (
    "#" +
    message
      .trim()
      .split(" ")
      .map((elem) => elem.charAt(0).toUpperCase() + elem.slice(1))
      .join("")
  );
}
console.log(hashTagGenerator(" My name is Bhavesh Balendra i am from raipur "));

function hashTagGenerator2(message) {
  if (message.length > 240 || message.trim().length === 0) {
    return false;
  }
  return (
    "#" +
    message
      .trim()
      .split(" ")
      .map((item) => item.replace(item.charAt(0), item.charAt(0).toUpperCase()))
      .join("")
  );
}
console.log(
  hashTagGenerator2(" My name is Bhavesh Balendra i am from raipur ")
);
