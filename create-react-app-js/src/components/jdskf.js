import React, { useState } from "react";

const options = [
  {
    label: "Sports",
    value: "sports",
    subOptions: [
      { label: "Cricket", value: "cricket" },
      { label: "Football", value: "football" },
      { label: "Hockey", value: "hockey" },
    ],
  },
  {
    label: "Days",
    value: "days",
    subOptions: [
      { label: "Weekday", value: "weekday" },
      { label: "Weekend", value: "weekend" },
    ],
  },
];

function App() {
  const [selectedOption, setSelectedOption] = useState("");
  const [selectedSubOption, setSelectedSubOption] = useState("");
  const [hoveredOption, setHoveredOption] = useState(null);

  function handleOptionHover(option) {
    setHoveredOption(option);
  }

  function handleSubOptionClick(subOption) {
    setSelectedSubOption(subOption);
  }

  const subOptions = options.find(
    (option) => option.value === hoveredOption
  )?.subOptions;

  return (
    <div className="menu">
      {options.map((option) => (
        <div
          key={option.value}
          className="menu-item"
          onMouseEnter={() => handleOptionHover(option.value)}
          onMouseLeave={() => handleOptionHover(null)}
        >
          {option.label}
          {hoveredOption === option.value && (
            <div className="submenu">
              {subOptions.map((subOption) => (
                <div
                  key={subOption.value}
                  className="submenu-item"
                  onClick={() => handleSubOptionClick(subOption.value)}
                >
                  {subOption.label}
                </div>
              ))}
            </div>
          )}
        </div>
      ))}
      <div className="selection">
        <p>Selected Option: {selectedOption}</p>
        <p>Selected Sub-Option: {selectedSubOption}</p>
      </div>
    </div>
  );
}

export default App;
