import React, { Component } from 'react';
import "bootstrap/dist/css/bootstrap.min.css";
import './App.css';
class App extends Component {
  constructor(props) {
    super(props);
  }
  render(){
    return (
      <div className='bg'>
        <h1 className='text-success'>Hello, {this.props.stuname}</h1>
        <h2>you are {this.props.stuage}</h2>
      </div>
    );
  }
}
export default App;