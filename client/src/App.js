import React, { useEffect } from 'react';
import './App.css';
import axios from 'axios';

function App() {
  useEffect(() => {
    axios('/api/users/current')
      .then(console.log)
  }, []);

  return (
    <div className="App">
      <header className="App-header">
        <h2>Learn React</h2>
      </header>
    </div>
  );
}

export default App;
