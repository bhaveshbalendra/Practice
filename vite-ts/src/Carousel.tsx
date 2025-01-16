import { slides } from "./data.json";
import "./Carousel.css";
import { useState } from "react";
function Carousel() {
  const [slideCount, setSlide] = useState<number>(0);
  function handleSlideRight() {
    setSlide((s) => (s === slides.length - 1 ? 0 : s + 1));
  }
  function handleSlideLeft() {
    setSlide((s) => (s === 0 ? slides.length - 1 : s - 1));
  }
  return (
    <div className="slide">
      {slides.map((slide, idx) => (
        <div
          className={
            slideCount === idx ? "carousel-item" : "carousel-item hide"
          }
        >
          <div className="arrow arrow-left" onClick={handleSlideLeft}>
            {"<-"}
          </div>
          <div className="arrow arrow-right" onClick={handleSlideRight}>
            {"->"}
          </div>
          <img src={slide.image} key={idx} alt={slide.alt} />
          <div className="indicator">
            {slides.map((_, index) => (
              <div key={index} className="indicator-item"></div>
            ))}
          </div>
        </div>
      ))}
    </div>
  );
}

export default Carousel;
