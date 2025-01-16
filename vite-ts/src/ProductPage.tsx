import * as React from "react";
import { TopBanner } from "./components/Header/TopBanner";
import { Navigation } from "./components/Header/Navigation";
import { ProductGallery } from "./components/Product/ProductGallery";
import { ProductDetails } from "./components/Product/ProductDetails";
import { Footer } from "./components/Footer/Footer";

export const ProductPage: React.FC = () => {
  return (
    <div className="flex overflow-hidden flex-col bg-white">
      <TopBanner />
      <Navigation />
      <div className="mt-4 w-full bg-black border border-black border-solid opacity-30 min-h-[1px] max-md:max-w-full" />

      <main className="flex flex-col self-center mt-20 w-full max-w-[1171px] max-md:mt-10 max-md:max-w-full">
        <nav
          aria-label="Breadcrumb"
          className="flex gap-3 items-center self-start text-sm text-black"
        >
          <a href="/account" className="self-stretch my-auto opacity-50">
            Account
          </a>
          <span className="self-stretch my-auto opacity-50">Gaming</span>
          <span className="self-stretch my-auto">Havic HV G-92 Gamepad</span>
        </nav>

        <div className="mt-20 w-full max-md:mt-10 max-md:max-w-full">
          <div className="flex gap-5 max-md:flex-col">
            <div className="flex flex-col w-[64%] max-md:ml-0 max-md:w-full">
              <ProductGallery />
            </div>
            <div className="flex flex-col ml-5 w-[36%] max-md:ml-0 max-md:w-full">
              <ProductDetails />
            </div>
          </div>
        </div>
      </main>

      <Footer />
    </div>
  );
};
