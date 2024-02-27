import React from "react";
import { Outlet } from "react-router-dom";
import "../App.css";

function Layout() {
  return (
    <>
      <div>
        <Outlet />
      </div>
    </>
  );
}

export default Layout;