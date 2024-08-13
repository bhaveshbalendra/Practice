import { useState } from "react";
const options = ["cricket", "football", "hockey"];
const days = ["weekday", "weekend"];

function App() {
  const [option, setOption] = useState("");
  const [day, setDay] = useState("");

  return (
    <div>
      {options.map((elem, index) => (
        <Option key={index} elem={elem} setOption={setOption} />
      ))}
      <br />
      {days.map((elem, index) => (
        <Day key={index} elem={elem} setDay={setDay} />
      ))}
      <br />
      {option && <span>Your Option is : {option}</span>}
      <br />
      {day && <span>Your Day is : {day}</span>}
    </div>
  );
}

function Option({ elem, setOption }) {
  function handleOption(e) {
    const { value } = e.target;
    setOption(value);
  }

  return (
    <>
      <input
        type="radio"
        id={elem}
        name="option"
        value={elem}
        onChange={(e) => handleOption(e)}
      />
      <label htmlFor={elem}>{elem.toUpperCase()}</label>;
    </>
  );
}

function Day({ elem, setDay }) {
  function handleOption(e) {
    const { value } = e.target;
    setDay(value);
  }

  return (
    <>
      <input
        type="radio"
        id={elem}
        name="day"
        value={elem}
        onChange={(e) => handleOption(e)}
      />
      <label htmlFor={elem}>{elem.toUpperCase()}</label>;
    </>
  );
}
export default App;
