import mongoose from "mongoose";
export default function connectMongoDB(url: string) {
  return mongoose.connect(url);
}
