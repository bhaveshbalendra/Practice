import express from "express";

const app = express();
const PORT = process.env.PORT || 4000;
app.use("/", (req, res) => {
  res.json({ message: "Success", status: true });
});

app.listen(PORT, () => {
  console.log(`server started at ${PORT}`);
});
