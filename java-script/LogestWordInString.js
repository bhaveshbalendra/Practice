/**
 * Question: How does this function find the longest word in a given sentence?
 *
 * Explanation: The function splits the sentence into an array of words,
 * iterates over each word, and compares its length to the longest word found so far.
 * If a longer word is found, it updates the `ans` variable.
 */

function longestWord(sentence) {
  let ans = "";
  sentence.split(" ").forEach((word) => {
    if (word.length > ans.length) {
      ans = word;
    }
  });
  return ans;
}

console.log(
  longestWord("hello my name is Bhavesh Balendra and i am from raipur")
);

function longestWord2(sentence) {
  return sentence
    .split(" ")
    .reduce(
      (accumulator, word) =>
        word.length > accumulator.length ? word : accumulator,
      ""
    );
}

console.log(
  longestWord2("hello my name is Bhavesh Balendra and i am from raipur")
);

function longestWord3(sentence) {
  return sentence
    .split(" ")
    .sort((a, b) => a.length - b.length)
    .at(-1);
}

console.log(
  longestWord3("hello my name is Bhavesh Balendra and i am from raipur")
);


// Snippet 1: Case-Insensitive Sorting
const mixedCaseWords = ["Banana", "apple", "Cherry", "banana"];

/**
 * Sorts the array in ascending order, ignoring case sensitivity.
 * 
 * - `a.toLowerCase()` and `b.toLowerCase()`:
 *   Converts both strings to lowercase for case-insensitive comparison.
 * - `localeCompare`:
 *   Compares two strings based on Unicode values.
 *   - Returns `-1` if `a` should come before `b`.
 *   - Returns `1` if `a` should come after `b`.
 *   - Returns `0` if `a` and `b` are equal.
 */
console.log(mixedCaseWords.sort((a, b) => a.toLowerCase().localeCompare(b.toLowerCase())));
// Output: ["apple", "Banana", "banana", "Cherry"]

// Snippet 2: Descending Order Sorting
const words = ["banana", "apple", "cherry", "date"];

/**
 * Sorts the array in descending order.
 * 
 * - `localeCompare`:
 *   Compares strings based on Unicode values.
 *   - Using `b.localeCompare(a)` reverses the default order, sorting in descending order.
 *   - Returns `-1` if `b` should come before `a`.
 *   - Returns `1` if `b` should come after `a`.
 *   - Returns `0` if `a` and `b` are equal.
 */
console.log(words.sort((a, b) => b.localeCompare(a)));
// Output: ["date", "cherry", "banana", "apple"]
