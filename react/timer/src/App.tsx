import { ChangeEvent, useEffect, useState } from "react";

const App = () => {
  const [toggleStart, setToggleStart] = useState<boolean>(false);
  const [hours, setHours] = useState<number>(0);
  const [minutes, setMinutes] = useState<number>(0);
  const [seconds, setSeconds] = useState<number>(0);

  // Handle user input (Allow deleting zeros)
  const handleInput = (event: ChangeEvent<HTMLInputElement>) => {
    const { id, value } = event.target;
    const numValue = value === "" ? 0 : Math.max(0, Number(value)); // Allow empty input

    if (id === "hours") setHours(numValue);
    if (id === "minutes") setMinutes(numValue);
    if (id === "seconds") setSeconds(numValue);
  };

  // Ensure two-digit format when input loses focus
  const formatInput = (
    setter: React.Dispatch<React.SetStateAction<number>>,
    value: number
  ) => {
    setter(Math.max(0, value)); // Prevents negative values
  };

  // Timer countdown logic
  useEffect(() => {
    if (!toggleStart) return;

    const interval = setInterval(() => {
      setSeconds((prevSeconds) => {
        if (prevSeconds > 0) return prevSeconds - 1;

        if (minutes > 0) {
          setMinutes((prevMinutes) => prevMinutes - 1);
          return 59;
        }

        if (hours > 0) {
          setHours((prevHours) => prevHours - 1);
          setMinutes(59);
          return 59;
        }

        setToggleStart(false);
        alert("Time has completed!");
        return 0;
      });
    }, 1000);

    return () => clearInterval(interval);
  }, [toggleStart, minutes, hours]);

  // Reset function
  const handleReset = () => {
    setToggleStart(false);
    setHours(0);
    setMinutes(0);
    setSeconds(0);
  };

  return (
    <div className="container">
      <h1>Count Down Timer</h1>

      {toggleStart ? (
        // Timer display
        <div className="timer">
          <div className="box">{hours.toString().padStart(2, "0")}</div>:
          <div className="box">{minutes.toString().padStart(2, "0")}</div>:
          <div className="box">{seconds.toString().padStart(2, "0")}</div>
        </div>
      ) : (
        // Input fields for hours, minutes, seconds
        <div className="inputfield">
          <input
            type="number"
            id="hours"
            value={hours || ""} // Show empty if 0 is deleted
            onChange={handleInput}
            onBlur={() => formatInput(setHours, hours)}
            placeholder="HH"
            min="0"
          />
          <input
            type="number"
            id="minutes"
            value={minutes || ""}
            onChange={handleInput}
            onBlur={() => formatInput(setMinutes, minutes)}
            placeholder="MM"
            min="0"
          />
          <input
            type="number"
            id="seconds"
            value={seconds || ""}
            onChange={handleInput}
            onBlur={() => formatInput(setSeconds, seconds)}
            placeholder="SS"
            min="0"
          />
        </div>
      )}

      {/* Buttons for Start, Pause, Reset */}
      <div className="btncontainer">
        {toggleStart ? (
          <>
            <button className="pause" onClick={() => setToggleStart(false)}>
              Pause
            </button>
            <button className="reset" onClick={handleReset}>
              Reset
            </button>
          </>
        ) : (
          <button className="start" onClick={() => setToggleStart(true)}>
            Start
          </button>
        )}
      </div>
    </div>
  );
};

export default App;
