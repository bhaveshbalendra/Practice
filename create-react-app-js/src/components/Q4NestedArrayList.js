const fileSystem = [
  {
    name: "Folder 1",
    files: [
      {
        name: "Subfolder 1.1",
        files: [{ name: "File 1.1.1" }, { name: "File 1.1.2" }],
      },
      { name: "File 1.1" },
    ],
  },
  {
    name: "Folder 2",
    files: [{ name: "File 2.1" }, { name: "File 2.2" }],
  },
];

function App() {
  return (
    <div>
      <FileTree data={fileSystem} />
    </div>
  );
}

function FileNode({ node }) {
  return (
    <li>
      {node.name}
      {node.files && node.files.length > 0 && (
        <ul>
          {node.files.map((file, index) => (
            <FileNode key={index} node={file} />
          ))}
        </ul>
      )}
    </li>
  );
}

function FileTree({ data }) {
  return (
    <ul>
      {data.map((node, index) => (
        <FileNode key={index} node={node} />
      ))}
    </ul>
  );
}

export default App;
