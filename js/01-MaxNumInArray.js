const arr = [10, 20, 30, 40, 50];

function findMaxNumber(arr) {
  return Math.max(...arr);
}

const maxNumber = findMaxNumber(arr);

console.log(maxNumber);
