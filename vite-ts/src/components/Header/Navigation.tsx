import * as React from "react";
import { NavItem } from "../../types";

const navItems: NavItem[] = [
  { label: "Home", href: "/" },
  { label: "Contact", href: "/contact" },
  { label: "About", href: "/about" },
  { label: "Sign Up", href: "/signup" },
];

export const Navigation: React.FC = () => {
  return (
    <div className="flex flex-wrap gap-10 items-center self-center mt-10 max-md:max-w-full">
      <div className="flex flex-wrap gap-10 items-start self-stretch my-auto text-black min-w-[240px] max-md:max-w-full">
        <div className="text-2xl font-bold tracking-wider leading-none whitespace-nowrap w-[118px]">
          Exclusive
        </div>
        <nav className="flex gap-10 items-start text-base text-center min-w-[240px]">
          {navItems.map((item) => (
            <a key={item.label} href={item.href} className="whitespace-nowrap">
              {item.label}
            </a>
          ))}
        </nav>
      </div>
      <div className="flex gap-6 items-center self-stretch my-auto min-w-[240px]">
        <form className="flex flex-col justify-center items-center self-stretch py-2 pr-3 pl-5 my-auto text-xs text-black rounded bg-neutral-100 min-w-[240px]">
          <div className="flex gap-9 justify-center items-center">
            <label htmlFor="search" className="sr-only">
              Search
            </label>
            <input
              type="search"
              id="search"
              placeholder="What are you looking for?"
              className="self-stretch my-auto bg-transparent opacity-50 outline-none"
            />
            <button type="submit" aria-label="Search">
              <img
                loading="lazy"
                src="https://cdn.builder.io/api/v1/image/assets/78ae1903bc3e457e899a52867769208c/7a36546edd30f9649053810fdbf6c98d92541e863e7b8b10ab13af855343b34e?apiKey=78ae1903bc3e457e899a52867769208c&"
                alt=""
                className="object-contain shrink-0 self-stretch my-auto w-6 aspect-square"
              />
            </button>
          </div>
        </form>
        <div className="flex gap-4 justify-center items-center self-stretch my-auto">
          {[3, 4, 5].map((num) => (
            <button
              key={num}
              aria-label={`Navigation action ${num}`}
              className="focus:outline-none"
            >
              <img
                loading="lazy"
                src={`http://b.io/ext_${num}-`}
                alt=""
                className="object-contain shrink-0 self-stretch my-auto w-8 aspect-square"
              />
            </button>
          ))}
        </div>
      </div>
    </div>
  );
};
