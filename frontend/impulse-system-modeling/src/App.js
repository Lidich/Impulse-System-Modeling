import { Route, Routes } from "react-router-dom";
import './App.css';
import React from "react";
import MainPage from "./pages/MainPage/MainPage";
import CreatePage from "./pages/CreatePage/CreatePage";
import Layout from "./components/Layout";


function App() {
  return (
    <Routes>
      <Route path="/" element={<Layout />}>
        <Route index element={<MainPage />} />
        <Route path="create" element={<CreatePage />}/>
      </Route>
    </Routes>
  );
}

export default App;
