const arrays = [1, 2, 3, 4, 5];

const result = arrays.map((item) => item > 2);

const slicedResult = arrays.slice(2);

console.log(result); // Output: [false, false, true, true, true]

console.log(slicedResult); // Output: [3, 4, 5]
