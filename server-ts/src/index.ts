import express from "express";
import connectMongoDB from "./connect";
import dotenv from "dotenv";
import userRouter from "./routes/user";
import bodyParser from "body-parser";
import cors from "cors";

dotenv.config();

const URL = process.env.MONGODB_URL;
const PORT = process.env.PORT || 4000;

if (!URL) {
  console.error("Mongodb env is not defined");
  process.exit(1);
}

connectMongoDB(URL).then(() => console.log("MongoDb connect successfully"));

const app = express();
app.use(
  cors({
    credentials: true,
    origin: ["http//localhost:5173"],
  })
);

app.use(express.json());
app.use(express.urlencoded({ extended: true }));
app.use(bodyParser.json());

app.use("/", userRouter);

app.listen(PORT, () => console.log("Server started"));
