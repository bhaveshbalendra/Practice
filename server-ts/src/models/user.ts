// import { model, Schema } from "mongoose";

// interface IUser {
//   name: string;
//   age: number;
// }

// const userSchema = new Schema<IUser>(
//   {
//     name: { type: String, require: true },
//     age: { type: Number, require: true },
//   },
//   { timestamps: true }
// );

// const UserData = model<IUser>("UserData", userSchema);

import { prop, getModelForClass } from "@typegoose/typegoose";
class User {
  @prop({ required: true })
  public name!: string;

  @prop({ required: true })
  public age!: number;
}

const UserData = getModelForClass(User);

export default UserData;
