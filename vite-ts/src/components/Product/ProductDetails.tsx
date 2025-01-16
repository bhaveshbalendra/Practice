import * as React from "react";
import { ColorOption, SizeOption } from "../../types";

const colors: ColorOption[] = [
  { color: "bg-indigo-300", selected: true },
  { color: "bg-red-400" },
];

const sizes: SizeOption[] = [
  { label: "XS" },
  { label: "S" },
  { label: "M", selected: true },
  { label: "L" },
  { label: "XL" },
];

export const ProductDetails: React.FC = () => {
  return (
    <div className="flex flex-col items-start w-full max-md:mt-10">
      <h1 className="text-2xl font-semibold tracking-wider leading-none text-black">
        Havic HV G-92 Gamepad
      </h1>
      <div className="flex gap-4 items-start mt-4 text-sm">
        <div className="flex gap-2 items-start text-black">
          <img
            loading="lazy"
            src="https://cdn.builder.io/api/v1/image/assets/78ae1903bc3e457e899a52867769208c/c35d903ef32712f74f1d691c7776b06b738b9c9c861a4482d47d9f9e4b9b6d4a?apiKey=78ae1903bc3e457e899a52867769208c&"
            alt="Product rating"
            className="object-contain shrink-0 aspect-[5] w-[100px]"
          />
          <span className="opacity-50">(150 Reviews)</span>
        </div>
        <div className="flex gap-4 items-center text-green-500">
          <div className="shrink-0 self-stretch my-auto w-0 h-4 bg-black border border-black border-solid opacity-50" />
          <span className="self-stretch my-auto opacity-60">In Stock</span>
        </div>
      </div>
      <div className="mt-4 text-2xl tracking-wider leading-none text-black">
        $192.00
      </div>
      <p className="self-stretch mt-6 mr-7 text-sm leading-5 text-black max-md:mr-2.5">
        PlayStation 5 Controller Skin High quality vinyl with air channel
        adhesive for easy bubble free install & mess free removal Pressure
        sensitive.
      </p>
      <div className="shrink-0 self-stretch mt-6 w-full h-px bg-black border border-black border-solid" />

      {/* Color Selection */}
      <div className="flex gap-6 items-start mt-6">
        <span className="text-xl tracking-wide leading-none text-black">
          Colours:
        </span>
        <div className="flex gap-2 items-start">
          {colors.map((color, index) => (
            <button
              key={index}
              className={`flex flex-col w-5 h-5 rounded-full ${
                color.selected ? "border-2 border-black" : ""
              }`}
              aria-label={`Select color ${index + 1}`}
            >
              <div
                className={`flex shrink-0 w-3 h-3 ${color.color} rounded-full`}
              />
            </button>
          ))}
        </div>
      </div>

      {/* Size Selection */}
      <div className="flex gap-6 items-center mt-6 whitespace-nowrap">
        <span className="self-stretch my-auto text-xl tracking-wide leading-none text-black">
          Size:
        </span>
        <div className="flex gap-4 items-start self-stretch my-auto text-sm font-medium text-black">
          {sizes.map((size) => (
            <button
              key={size.label}
              className={`overflow-hidden px-2 pt-1.5 pb-4 w-8 rounded border border-solid ${
                size.selected
                  ? "bg-red-500 text-neutral-50"
                  : "border-black border-opacity-50"
              }`}
            >
              {size.label}
            </button>
          ))}
        </div>
      </div>

      {/* Quantity and Actions */}
      <div className="flex gap-4 self-stretch mt-6 w-full font-medium">
        <div className="flex gap-0 items-start text-xl leading-snug text-black whitespace-nowrap min-h-[44px]">
          <button aria-label="Decrease quantity">
            <img
              loading="lazy"
              src="https://cdn.builder.io/api/v1/image/assets/78ae1903bc3e457e899a52867769208c/ed9ed51dc91da1a317a6ec57e005b4e5f8a1b0bff1721c29819dbbc2af1e9ae3?apiKey=78ae1903bc3e457e899a52867769208c&"
              alt=""
              className="object-contain shrink-0 w-10 rounded aspect-[0.91]"
            />
          </button>
          <span className="overflow-hidden px-9 py-2 w-20 border-t border-b border-black border-opacity-50 max-md:px-5">
            2
          </span>
          <button aria-label="Increase quantity">
            <img
              loading="lazy"
              src="https://cdn.builder.io/api/v1/image/assets/78ae1903bc3e457e899a52867769208c/a09c076caa5a0aa0236a51fa2801afde79e8017a579e89aa6abb403c0af33200?apiKey=78ae1903bc3e457e899a52867769208c&"
              alt=""
              className="object-contain shrink-0 aspect-[0.93] w-[41px]"
            />
          </button>
        </div>
        <button className="gap-2.5 self-stretch px-12 py-2.5 text-base bg-red-500 rounded text-neutral-50 max-md:px-5">
          Buy Now
        </button>
        <button aria-label="Add to wishlist">
          <img
            loading="lazy"
            src="https://cdn.builder.io/api/v1/image/assets/78ae1903bc3e457e899a52867769208c/96b388edb85323f98c8e7e985856939fb1e202a7b2c62362d9367fbfb2293b30?apiKey=78ae1903bc3e457e899a52867769208c&"
            alt=""
            className="object-contain shrink-0 self-start rounded aspect-square w-[42px]"
          />
        </button>
      </div>
    </div>
  );
};
