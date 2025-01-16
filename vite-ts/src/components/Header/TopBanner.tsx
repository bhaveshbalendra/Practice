import * as React from "react";

export const TopBanner: React.FC = () => {
  return (
    <div className="flex overflow-hidden flex-col justify-center items-end px-16 py-3 w-full text-sm bg-black text-neutral-50 max-md:px-5 max-md:max-w-full">
      <div className="flex flex-wrap gap-10 items-start max-md:max-w-full">
        <div className="flex flex-wrap gap-2 items-center min-w-[240px] max-md:max-w-full">
          <div className="self-stretch my-auto w-[474px] max-md:max-w-full">
            Summer Sale For All Swim Suits And Free Express Delivery - OFF 50%!
          </div>
          <button className="self-stretch my-auto font-semibold leading-6 text-center underline decoration-auto decoration-solid underline-offset-auto">
            ShopNow
          </button>
        </div>
        <div className="flex gap-1.5 justify-center items-center whitespace-nowrap">
          <div className="self-stretch my-auto">English</div>
          <img
            loading="lazy"
            src="https://cdn.builder.io/api/v1/image/assets/78ae1903bc3e457e899a52867769208c/8c458026ddcb4daaaca9291897ab1b8ab8e65bd1233e48db8bbc95eb90ee3e16?apiKey=78ae1903bc3e457e899a52867769208c&"
            alt=""
            className="object-contain shrink-0 self-stretch my-auto w-6 aspect-square"
          />
        </div>
      </div>
    </div>
  );
};
