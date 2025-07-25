import React, { Component } from 'react'

export default class Card extends Component {
  render() {
    return (
      <>
        <div className="card">
          <img src={this.props.image} alt="" />
          <div className="card-data">
            <h5>{this.props.title}</h5>
            <p>{this.props.subtitle}</p>
            <a href="">Veiw Details</a>
            <button>Apply Offer</button>
          </div>
        </div>
      </>
    )
  }
}
