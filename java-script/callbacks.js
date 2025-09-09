function getUser(id, callback) {
  setTimeout(() => {
    callback({ name: "bhavesh", id });
  }, 2000);
}

getUser(1, (user) => {
  console.log(user);
});
