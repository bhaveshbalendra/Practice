//! Task:
//? Write a function called countChar that takes two parameters: a string and a character
//to count. The function should return the number of times the specified character appears in
//the string.
//console.log(countChar("MissIssippi", "I")); // Output: 4
//todo Constraints:
//? The function should be case-sensitive.
//? The function should handle both lowercase and uppercase characters.
//? The character parameter can be any printable ASCII character (the function sho
//accept any character that is part of the ASCII character set and is printable).

function countChar(sentence, character) {
  // Use a case-insensitive comparison by converting both to lowercase
  const lowerSentence = sentence.toLowerCase();
  const lowerCharacter = character.toLowerCase();

  // Use reduce to count occurrences
  const result = lowerSentence.split("").reduce((acc, item) => {
    return item === lowerCharacter ? acc + 1 : acc;
  }, 0);

  return result;
}

console.log(countChar("MissIssippi", "I")); // Output: 4

function countChar2(str, char) {
  str = str.toLowerCase();
  char = char.toLowerCase();
  let count = 0;
  for (let i = 0; i < str.length; i++) {
    if (str[i] === char) {
      count++;
    }
  }
  return count;
}

console.log(countChar2("MissIssippi", "I"));

function countChar3(string, symbol) {
  return string
    .toLowerCase()
    .split("")
    .filter((i) => i == symbol.toLowerCase()).length;
}

console.log(countChar3("missIssipi", "i"));
