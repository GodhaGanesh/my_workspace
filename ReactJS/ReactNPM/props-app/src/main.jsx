import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import App from './App.jsx'

createRoot(document.getElementById("root")).render(
  <StrictMode>
    <App stuname="Ganesh Viswanadham" stuage={20} />
    <App stuname="Akepogu Upendra" stuage={23} />
    <App stuname="Ammineni Charan Teja" stuage={60} />
    <App stuname="Dudekula Afrouz" stuage={22} />
  </StrictMode>
);
