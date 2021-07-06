import logo from './logo.svg';
import './App.css';
import axios from "axios";
import React, {useState, useEffect} from "react";

const UserProfiles = () => {
  const getRecipeById =() => {
    axios.get("http://localhost:8080/food").then(res=>{
      console.log(res,"hey")
    });
  }

  useEffect(() =>{
    getRecipeById();
  },[])

  return <h1>Hello</h1>
}

function App() {
  return (
    <div className="App">
     <UserProfiles></UserProfiles>
    </div>
  );
}

export default App;
