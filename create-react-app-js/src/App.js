import React, { useState } from "react";

const Table = () => {
  const initialGrid = Array.from({ length: 5 }, () =>
    Array(5).fill({ value: "", color: "#ffffff" })
  );

  const [grid, setGrid] = useState(initialGrid);
  const [selectedCell, setSelectedCell] = useState(null);
  const [color, setColor] = useState("#ffffff");

  function handleChange(rowIndex, colIndex, value) {
    const newGrid = grid.map((row, rIdx) =>
      row.map((cell, cIdx) =>
        rIdx === rowIndex && cIdx === colIndex ? { ...cell, value } : cell
      )
    );
    setGrid(newGrid);
  }

  function handleColorChange(e) {
    setColor(e.target.value);
    if (selectedCell) {
      const { rowIndex, colIndex } = selectedCell;
      const newGrid = grid.map((row, rIdx) =>
        row.map((cell, cIdx) =>
          rIdx === rowIndex && cIdx === colIndex
            ? { ...cell, color: e.target.value }
            : cell
        )
      );
      setGrid(newGrid);
    }
  }

  function handleCellSelect(rowIndex, colIndex) {
    setSelectedCell({ rowIndex, colIndex });
  }

  return (
    <>
      <input type="color" value={color} onChange={handleColorChange} />
      <table>
        <tbody>
          {grid.map((row, rowIndex) => (
            <tr key={rowIndex}>
              {row.map((cell, colIndex) => (
                <td key={colIndex}>
                  <input
                    style={{ backgroundColor: cell.color }}
                    type="text"
                    value={cell.value}
                    onChange={(e) =>
                      handleChange(rowIndex, colIndex, e.target.value)
                    }
                    onFocus={() => handleCellSelect(rowIndex, colIndex)}
                  />
                </td>
              ))}
            </tr>
          ))}
        </tbody>
      </table>
    </>
  );
};

export default Table;
