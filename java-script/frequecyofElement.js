const name = [1, 2, 1, 1, 3, 4, 4, 6, 6, 8, 6, 7, 3, 3, 3, 3];

// Create an object to store frequencies
const frequencyMap = {};

name.forEach((element) => {
  if (frequencyMap[element]) {
    frequencyMap[element]++;
  } else {
    frequencyMap[element] = 1;
  }
});

Object.entries(frequencyMap).forEach(([key, value], index) => {
  console.log(`Key: ${key}, Value: ${value}`, index);
});

Object.keys(frequencyMap).forEach((key, index) => {
  console.log(key, index);
});
