import { useState } from "react";

function App() {
  const [on, setOn] = useState(0);
  return (
    <div>
      <form method="get">
        <label htmlFor="fname">first name:</label>
        <input type="text" id="fname" name="fname" placeholder="name" />

        <label htmlFor="lname">first name:</label>
        <input
          type="password"
          id="lname"
          name="lname"
          placeholder="last name"
          maxLength="12"
        />
        <input type="email" />
        <input type="submit" />

        <div>
          <label htmlFor="title"> title</label>

          <label htmlFor="">Mr.</label>
          <input type="radio" name="title" value="Mr." />

          <label htmlFor="">Mr.s</label>
          <input type="radio" name="title" value="Mr." />

          <label htmlFor="">PhD.</label>
          <input type="radio" name="title" value="Mr." />
        </div>

        <div>
          <label htmlFor="payment">payment:</label>
          <select name="payment" id="payment">
            <option value="visa">visa</option>
            <option value="mastercard">mastercard</option>
            <option value="rupay">rupay</option>
          </select>
        </div>
      </form>
    </div>
  );
}

export default App;
