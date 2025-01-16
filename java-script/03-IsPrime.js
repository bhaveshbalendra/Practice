let count = 0;
const num = 12;

if (num <= 1) {
  console.log("not a");
}

for (let i = 2; i <= num; i++) {
  if (num % i === 0) {
    count++;
  }
}

if (count === 1) {
  console.log(true, "Its a prime");
} else false;
