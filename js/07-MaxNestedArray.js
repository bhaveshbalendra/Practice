function MaxNestedArray(nestedArray) {
  let largest = nestedArray[0][0];

  for (let arr of nestedArray) {
    for (let num of arr) {
      if (num > largest) largest = num;
    }
  }
  return largest;
}

const nestedArray = [
  [1, 5, 3],
  [9, 2, 8],
  [4, 6, 7],
];

console.log(MaxNestedArray(nestedArray));
