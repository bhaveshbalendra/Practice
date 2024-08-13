import { useQuery } from "@tanstack/react-query";

function App() {
  const {
    data: commentData,
    error,
    isError,
    isLoading,
  } = useQuery({
    queryKey: ["comments"],
    queryFn: async () => {
      const res = await fetch("http://localhost:3000/comments", {
        method: "GET",
        headers: {
          "Content-Type": "application/json",
        },
      });

      const commentData = await res.json();
      return commentData;
    },
  });

  return (
    <div>
      {isLoading && <p>Loading...</p>}
      {isError && <p>{error.message}</p>}
      {commentData &&
        commentData.map((comment, index) => (
          <div key={index}>{comment.text}</div>
        ))}
    </div>
  );
}

export default App;

// import { useQuery } from "@tanstack/react-query";

// function App() {
//   const {
//     data: commentData,
//     error,
//     isError,
//     isLoading,
//   } = useQuery({
//     queryKey: ["comments"],
//     queryFn: async () => {
//       const res = await fetch("http://localhost:3000/comments", {
//         method: "GET",
//         headers: {
//           "Content-Type": "application/json",
//         },
//       });
//       const commentData = await res.json();
//       return commentData;
//     },
//   });
//   console.log(commentData);
//   return (
//     <div>
//       {isLoading && <p>Loading.....</p>}
//       {isError && <p>{error?.message}</p>}
//       {commentData.map((comment, index) => {
//         <div key={index}>{comment.text}</div>;
//       })}
//     </div>
//   );
// }

// export default App;
