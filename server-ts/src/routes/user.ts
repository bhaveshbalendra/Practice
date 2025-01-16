import express from "express";
import { handleUserData } from "../controllers/user";

const router = express.Router();

router.get("/user-data", handleUserData);

export default router;
