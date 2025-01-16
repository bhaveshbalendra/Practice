import * as React from "react";
import { ProductImage } from "../../types";

const thumbnails: ProductImage[] = [
  {
    src: "https://cdn.builder.io/api/v1/image/assets/78ae1903bc3e457e899a52867769208c/5ff58a315ae76c092e4308f9e1dd636e14dff898d550453232b2df9619740c99?apiKey=78ae1903bc3e457e899a52867769208c&",
    alt: "Product view 1",
  },
  {
    src: "https://cdn.builder.io/api/v1/image/assets/78ae1903bc3e457e899a52867769208c/846b04a32465038d31c7eebb8207360b937f24ee6e001125f678465a5dae8af0?apiKey=78ae1903bc3e457e899a52867769208c&",
    alt: "Product view 2",
  },
  {
    src: "https://cdn.builder.io/api/v1/image/assets/78ae1903bc3e457e899a52867769208c/bfe5f7ca2fb1b090aaa31900efe3fded42ca5586c5dea7a3fc44e288ab7aa6b5?apiKey=78ae1903bc3e457e899a52867769208c&",
    alt: "Product view 3",
  },
  {
    src: "https://cdn.builder.io/api/v1/image/assets/78ae1903bc3e457e899a52867769208c/362103a03f54be471e065d362aafa804ca7e4c2406a09fd960d3ef8a81cc4e0c?apiKey=78ae1903bc3e457e899a52867769208c&",
    alt: "Product view 4",
  },
];

export const ProductGallery: React.FC = () => {
  return (
    <div className="flex gap-5 max-md:flex-col">
      <div className="flex flex-col w-3/12 max-md:ml-0 max-md:w-full">
        <div className="flex flex-col grow max-md:mt-8">
          {thumbnails.map((image, index) => (
            <div
              key={index}
              className="flex overflow-hidden flex-col justify-center px-6 py-3 rounded bg-neutral-100 max-md:px-5"
            >
              <img
                loading="lazy"
                src={image.src}
                alt={image.alt}
                className="object-contain w-full aspect-[1.06]"
              />
            </div>
          ))}
        </div>
      </div>
      <div className="flex flex-col ml-5 w-9/12 max-md:ml-0 max-md:w-full">
        <div className="flex overflow-hidden flex-col grow justify-center px-7 py-36 w-full rounded bg-neutral-100 max-md:px-5 max-md:py-24 max-md:mt-8 max-md:max-w-full">
          <img
            loading="lazy"
            src="https://cdn.builder.io/api/v1/image/assets/78ae1903bc3e457e899a52867769208c/2e0fb45ef738ddce3471cc209033d00d2fe1bea6dc52358f55df055db788b713?apiKey=78ae1903bc3e457e899a52867769208c&"
            alt="Main product view"
            className="object-contain w-full aspect-[1.42] max-md:max-w-full"
          />
        </div>
      </div>
    </div>
  );
};
