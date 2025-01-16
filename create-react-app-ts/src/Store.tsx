import { createContext } from "react";
type Cart = {
  itemsPrice: number;
  shippingPrice: number;
  taxPrice: number;
  totalPrice: number;
};

type AppState = {
  cart: Cart;
};

const initialState: AppState = {
  cart: {
    itemsPrice: localStorage.getItem("cartItems"),
  },
};
const Store = createContext();

export default function Store() {
  return <div>Store</div>;
}
