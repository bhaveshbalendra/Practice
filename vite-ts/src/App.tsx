import { useEffect, useState } from "react";
import Left from "./Left";
import Right from "./Right";

function App() {
  const [postData, setPostData] = useState([]);
  useEffect(() => {
    fetch("https://jsonplaceholder.typicode.com/posts")
      .then((res) => res.json())
      .then((data) => setPostData(data))
      .catch((err) => console.log(err));
  }, []);
  console.log(postData);
  return (
    <div style={{ height: "100vh", backgroundColor: "red", display: "flex" }}>
      <Left />
      <Right />
    </div>
  );
}

export default App;
