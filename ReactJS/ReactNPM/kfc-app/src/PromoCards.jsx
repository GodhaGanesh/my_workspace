import React, { Component } from "react";
import data from "./cardData";
import Card from "./Card";
export default class PromoCards extends Component {
  render() {
    return (
      <>
        <div className="promo-card-container">
          <div className="heading-promo">
            <svg
              xmlns="http://www.w3.org/2000/svg"
              width="94"
              height="33"
              viewBox="0 0 80 42"
              fill="none"
              data-src="https://online.kfc.co.in/static/media/Stripes_OffersIcon.891e24c1.svg"
              xmlns:xlink="http://www.w3.org/1999/xlink"
            >
              <rect width="16.4103" height="41.0256" fill="#E4002B"></rect>
              <rect
                x="32.8203"
                width="16.4103"
                height="41.0256"
                fill="#E4002B"
              ></rect>
              <rect
                x="63.5898"
                width="16.4103"
                height="41.0256"
                fill="#E4002B"
              ></rect>
            </svg>
            <h2>Save More as you order</h2>
          </div>
          <div className="card-container">
            <div className="slick-track">
              {data.map((item, index) => (
                <Card
                  key={index}
                  image={item.image}
                  title={item.title}
                  subtitle={item.subtitle}
                />
              ))}
            </div>
          </div>
        </div>
      </>
    );
  }
}
