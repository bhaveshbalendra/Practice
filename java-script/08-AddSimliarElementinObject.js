let obj1 = { a: 10, b: 20 };
let obj2 = { a: 3, c: 10 };

let result = { ...obj1 };

Object.keys(obj2).forEach((key) => {
  if (result[key] !== undefined) {
    console.log(result[key]);
    // If the property exists in both objects, add their values
    result[key] += obj2[key];
  } else {
    // If the property exists only in obj2, add it to the result
    result[key] = obj2[key];
  }
});

console.log(result);
// Output: { a: 13, b: 20, c: 10 }
