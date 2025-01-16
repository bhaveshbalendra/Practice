import { Request, Response } from "express";
import UserData from "../models/user";

async function handleUserData(req: Request, res: Response) {
  try {
    const data = req.body;
    const newUser = await UserData.create(data);
    return res.status(201).json(newUser); // Use 201 status code for successful creation
  } catch (error) {
    console.error("Error creating user:", error);
    return res.status(500).json({ message: "Internal Server Error", error });
  }
}

export { handleUserData };
