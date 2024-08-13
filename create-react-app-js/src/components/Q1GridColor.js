import React, { useState } from "react";

const App = () => {
  const intialGrid = [
    ["1", "1", "1"],
    ["1", "0", "0"],
    ["1", "1", "1"],
  ];

  const [grid, setGrid] = useState(intialGrid);
  const arrColor = Array.from({ length: 3 }, () =>
    Array(3).fill({ color: "", value: 0 })
  );

  const [count, setCount] = useState(0);
  const [color, setColor] = useState(arrColor);

  function handleChangeColor(colIndex, rowIndex) {
    let newCount = count + 1;

    if (newCount === 7) {
      setCount(0);
      setColor(arrColor);
    } else {
      let x = color.map((newRow, newRowIndex) =>
        newRow.map((newCell, newColIndex) => {
          if (colIndex === newColIndex && rowIndex === newRowIndex) {
            return { ...newCell, color: "red", value: newColIndex + 1 };
          } else {
            return { ...newCell };
          }
        })
      );
      setCount(newCount);
      setColor(x);
    }
  }

  return (
    <div
      style={{
        display: "flex",
        flexDirection: "column",
        gap: "5px",
      }}
    >
      {grid.map((row, rowIndex) => (
        <div
          key={rowIndex}
          style={{
            display: "flex",
            gap: "5px",
          }}
        >
          {row.map((cell, colIndex) => (
            <div
              onClick={() => handleChangeColor(colIndex, rowIndex)}
              key={colIndex}
              className={`${
                color[rowIndex][colIndex] &&
                color[rowIndex][colIndex]["color"] === "red"
                  ? "active"
                  : ""
              }`}
              style={{
                width: "50px",
                height: "50px",
                border: "1px solid black",
                backgroundColor: `${color[rowIndex][colIndex]["color"]}`,
                display: `${cell === "0" ? "none" : "block"} `,
              }}
            ></div>
          ))}
        </div>
      ))}
    </div>
  );
};

// import React, { useState } from "react";

// const App = () => {
//   const intialGrid = [
//     ["1", "1", "1"],
//     ["1", "0", "0"],
//     ["1", "1", "1"],
//   ];

//   const [grid, setGrid] = useState(intialGrid);
//   const arrColor = Array.from({ length: 3 }, () =>
//     Array(3).fill({ color: "" })
//   );

//   const [count, setCount] = useState(0);
//   const [color, setColor] = useState(arrColor);

//   const changeColor = async (i, j) => {
//     console.log(i, j);
//     return new Promise((resolve) => {
//       setTimeout(() => {
//         let box = document.getElementById(`box-${i}-${j}`);
//         box.style.backgroundColor = "";
//         resolve();
//       }, 1000);
//     });
//   };

//   async function handleAllFilled() {
//     for (let i = 2; i >= 0; i--) {
//       for (let j = 2; j >= 0; j--) {
//         await changeColor(i, j);
//       }
//     }
//   }

//   function handleChangeColor(colIndex, rowIndex) {
//     let newCount = count + 1;

//     if (newCount === 7) {
//       setCount(0);
//       // setColor(arrColor);
//       handleAllFilled();
//     } else {
//       let x = color.map((newRow, newRowIndex) =>
//         newRow.map((newCell, newColIndex) => {
//           if (colIndex === newColIndex && rowIndex === newRowIndex) {
//             return { ...newCell, color: "red" };
//           } else {
//             return { ...newCell };
//           }
//         })
//       );
//       setCount(newCount);
//       setColor(x);
//     }
//   }

//   return (
//     <div
//       style={{
//         display: "flex",
//         flexDirection: "column",
//         gap: "5px",
//       }}
//     >
//       {grid.map((row, rowIndex) => (
//         <div
//           key={rowIndex}
//           style={{
//             display: "flex",
//             gap: "5px",
//           }}
//         >
//           {row.map((cell, colIndex) => (
//             <div
//               onClick={() => handleChangeColor(colIndex, rowIndex)}
//               id={`box-${rowIndex}-${colIndex}`}
//               key={colIndex}
//               style={{
//                 width: "50px",
//                 height: "50px",
//                 border: "1px solid black",
//                 backgroundColor: `${color[rowIndex][colIndex]["color"]}`,
//                 display: `${cell === "0" ? "none" : "block"} `,
//               }}
//             ></div>
//           ))}
//         </div>
//       ))}
//     </div>
//   );
// };

// import React, { useEffect, useState } from "react";

// const App = () => {
//   const intialGrid = [
//     ["1", "1", "1"],
//     ["1", "0", "0"],
//     ["1", "1", "1"],
//   ];

//   const [grid, setGrid] = useState(intialGrid);
//   const arrColor = Array.from({ length: 3 }, () =>
//     Array(3).fill({ color: "" })
//   );

//   const [count, setCount] = useState(0);
//   const [color, setColor] = useState(arrColor);

//   function handleChangeColor(colIndex, rowIndex) {
//     let x = color.map((newRow, newRowIndex) =>
//       newRow.map((newCell, newColIndex) => {
//         if (colIndex === newColIndex && rowIndex === newRowIndex) {
//           return { ...newCell, color: "red" };
//         } else {
//           return { ...newCell };
//         }
//       })
//     );
//     setCount((count) => count + 1);
//     setColor(x);
//   }
//   useEffect(() => {
//     if (count === 7) {
//       setCount(0);
//       setColor(arrColor);
//     }
//   }, [count]);
//   console.log("hello0 ", count);
//   return (
//     <div
//       style={{
//         display: "flex",
//         flexDirection: "column",
//         gap: "5px",
//       }}
//     >
//       {grid.map((row, rowIndex) => (
//         <div
//           key={rowIndex}
//           style={{
//             display: "flex",

//             gap: "5px",
//           }}
//         >
//           {row.map((cell, colIndex) => (
//             <div
//               onClick={() => handleChangeColor(colIndex, rowIndex)}
//               key={colIndex}
//               style={{
//                 width: "50px",
//                 height: "50px",
//                 border: "1px solid black",
//                 // backgroundColor: "red",
//                 backgroundColor: `${color[rowIndex][colIndex]["color"]}`,
//                 display: `${cell === "0" ? "none" : "block "} `,
//               }}
//             ></div>
//           ))}
//         </div>
//       ))}
//     </div>
//   );
// };

// src/App.jsx
// import React, { useState } from "react";

// const App = () => {
//   const intialGrid = [
//     ["1", "1", "1"],
//     ["1", "0", "0"],
//     ["1", "1", "1"],
//   ];

//   const [grid, setGrid] = useState(intialGrid);

//   const arrColor = Array.from({ length: 3 }, () =>
//     Array(3).fill({ id: crypto.UUID(), color: "" })
//   );
//   const [color, setColor] = useState(arrColor);
//   console.log(arrColor);
//   function handleChangeColor(colIndex, rowIndex) {
//     color.map((newRow, newRowIndex) =>
//       newRow.map((newCell, newColIndex) => {
//         if (colIndex === newColIndex && rowIndex === newRowIndex) {
//           setColor([...color, { id: newCell.id, color: "red" }]);
//         }
//       })
//     );
//   }

//   return (
//     <div
//       style={{
//         display: "flex",
//         flexDirection: "column",
//         gap: "5px",
//       }}
//     >
//       {grid.map((row, rowIndex) => (
//         <div
//           key={rowIndex}
//           style={{
//             display: "flex",

//             gap: "5px",
//           }}
//         >
//           {row.map((cell, colIndex) => (
//             <div
//               onClick={() => handleChangeColor(colIndex, rowIndex)}
//               key={colIndex}
//               style={{
//                 width: "50px",
//                 height: "50px",
//                 border: "1px solid black",
//                 backgroundColor: `${color[rowIndex][colIndex].color}`,
//                 display: `${cell === "0" ? "none" : "block "} `,
//               }}
//             ></div>
//           ))}
//         </div>
//       ))}
//     </div>
//   );
// };

export default App;
