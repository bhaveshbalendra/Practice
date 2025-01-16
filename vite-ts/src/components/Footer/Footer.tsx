import * as React from "react";
import { FooterLink, SocialIcon } from "../../types";

const footerLinks: FooterLink[] = [
  { label: "My Account", href: "/account" },
  { label: "Login / Register", href: "/login" },
  { label: "Cart", href: "/cart" },
  { label: "Wishlist", href: "/wishlist" },
  { label: "Shop", href: "/shop" },
];

const socialIcons: SocialIcon[] = [
  {
    src: "https://cdn.builder.io/api/v1/image/assets/78ae1903bc3e457e899a52867769208c/30ef1881c8ba382ad841b10dec22c4728e1ac56594cd8fd1b8fc54e4c0c91052?apiKey=78ae1903bc3e457e899a52867769208c&",
    alt: "Facebook",
  },
  {
    src: "https://cdn.builder.io/api/v1/image/assets/78ae1903bc3e457e899a52867769208c/b7d442769e110a431f098cf1826959404b67853bc2c1af2e1b6cd8af3c9c7499?apiKey=78ae1903bc3e457e899a52867769208c&",
    alt: "Twitter",
  },
  {
    src: "https://cdn.builder.io/api/v1/image/assets/78ae1903bc3e457e899a52867769208c/d0b67f52bb53b8c3b436cfc50867157e647c1cc5fa6f7cc373ba309b35f3d286?apiKey=78ae1903bc3e457e899a52867769208c&",
    alt: "Instagram",
  },
  {
    src: "https://cdn.builder.io/api/v1/image/assets/78ae1903bc3e457e899a52867769208c/017f03fd6271e23e94e189db8506f53ec67e53623ecac07e20b0cc0e64aa481c?apiKey=78ae1903bc3e457e899a52867769208c&",
    alt: "LinkedIn",
  },
];

export const Footer: React.FC = () => {
  return (
    <footer className="flex overflow-hidden flex-col justify-end pt-20 pb-6 mt-24 w-full bg-black max-md:mt-10 max-md:max-w-full">
      <div className="flex flex-wrap gap-10 justify-center items-start self-center max-md:max-w-full">
        <div className="flex flex-col text-neutral-50 w-[217px]">
          <div className="flex flex-col self-start">
            <div className="flex flex-col max-w-full whitespace-nowrap w-[118px]">
              <h2 className="w-full text-2xl font-bold tracking-wider leading-none">
                Exclusive
              </h2>
              <h3 className="mt-6 text-xl font-medium leading-snug">
                Subscribe
              </h3>
            </div>
            <p className="mt-6 text-base">Get 10% off your first order</p>
          </div>
          <form className="flex gap-8 items-center py-3 pl-4 mt-4 max-w-full text-base rounded border-solid border-[1.5px] border-neutral-50 w-[217px]">
            <label htmlFor="footerEmail" className="sr-only">
              Enter your email
            </label>
            <input
              type="email"
              id="footerEmail"
              placeholder="Enter your email"
              className="self-stretch my-auto bg-transparent opacity-40"
            />
            <button type="submit" aria-label="Subscribe">
              <img
                loading="lazy"
                src="https://cdn.builder.io/api/v1/image/assets/78ae1903bc3e457e899a52867769208c/6bac8a3a4556d00df359345f40c4304fa01a92d9d278e1cc8be218cdcd6e20d8?apiKey=78ae1903bc3e457e899a52867769208c&"
                alt=""
                className="object-contain shrink-0 self-stretch my-auto w-6 aspect-square"
              />
            </button>
          </form>
        </div>

        {/* Support Section */}
        <div className="flex flex-col text-neutral-50 w-[175px]">
          <h3 className="text-xl font-medium leading-snug">Support</h3>
          <address className="flex flex-col mt-6 max-w-full text-base w-[175px] not-italic">
            <p className="leading-6">
              111 Bijoy sarani, Dhaka, DH 1515, Bangladesh.
            </p>
            <p className="mt-4">exclusive@gmail.com</p>
            <p className="mt-4">+88015-88888-9999</p>
          </address>
        </div>

        {/* Account Links */}
        <nav className="flex flex-col text-neutral-50">
          <h3 className="text-xl font-medium leading-snug">Account</h3>
          <ul className="flex flex-col mt-6 text-base">
            {footerLinks.map((link) => (
              <li key={link.label} className="mt-4 first:mt-0">
                <a href={link.href}>{link.label}</a>
              </li>
            ))}
          </ul>
        </nav>

        {/* Download App Section */}
        <div className="flex flex-col">
          <div className="flex flex-col">
            <h3 className="text-xl font-medium leading-snug text-neutral-50">
              Download App
            </h3>
            <div className="flex flex-col mt-6">
              <p className="text-xs font-medium opacity-70 text-neutral-50">
                Save $3 with App New User Only
              </p>
              <div className="flex gap-2 items-center mt-2">
                <img
                  loading="lazy"
                  src="https://cdn.builder.io/api/v1/image/assets/78ae1903bc3e457e899a52867769208c/318eab6f820c56237ca220bfa13661aea13cd54a84302eb7e0150453eee7de84?apiKey=78ae1903bc3e457e899a52867769208c&"
                  alt="QR Code"
                  className="object-contain shrink-0 self-stretch my-auto w-20 aspect-square"
                />
                <div className="flex flex-col self-stretch my-auto w-[110px]">
                  <img
                    loading="lazy"
                    src="https://cdn.builder.io/api/v1/image/assets/78ae1903bc3e457e899a52867769208c/9609d84ff6b2a48f066237aa51e46748f10363b2a68201878dd128a06adfe6df?apiKey=78ae1903bc3e457e899a52867769208c&"
                    alt="Download on App Store"
                    className="object-contain max-w-full aspect-[2.75] w-[110px]"
                  />
                  <img
                    loading="lazy"
                    src="https://cdn.builder.io/api/v1/image/assets/78ae1903bc3e457e899a52867769208c/c3712826c87e4dff101cdacecb5b28e00fe08e16a137f394134f0f1f4cdf00fe?apiKey=78ae1903bc3e457e899a52867769208c&"
                    alt="Get it on Google Play"
                    className="object-contain mt-1 max-w-full aspect-[2.75] w-[110px]"
                  />
                </div>
              </div>
            </div>
          </div>
          <div className="flex gap-6 items-start self-start mt-6">
            {socialIcons.map((icon) => (
              <a
                key={icon.alt}
                href={`#${icon.alt.toLowerCase()}`}
                aria-label={`Follow us on ${icon.alt}`}
              >
                <img
                  loading="lazy"
                  src={icon.src}
                  alt=""
                  className="object-contain shrink-0 w-6 aspect-square"
                />
              </a>
            ))}
          </div>
        </div>
      </div>

      {/* Copyright Section */}
      <div className="flex flex-col items-center mt-16 w-full max-md:mt-10 max-md:max-w-full">
        <div className="w-full bg-white border border-white border-solid opacity-40 min-h-[1px] max-md:max-w-full" />
        <div className="flex gap-3 items-center mt-4 text-base text-white">
          <div className="flex gap-1.5 items-center self-stretch my-auto min-w-[240px]">
            <img
              loading="lazy"
              src="https://cdn.builder.io/api/v1/image/assets/78ae1903bc3e457e899a52867769208c/207c5d33f1e035178e0be8d020049bff7b4add721531f45a07670b638424cd03?apiKey=78ae1903bc3e457e899a52867769208c&"
              alt=""
              className="object-contain shrink-0 self-stretch my-auto w-5 aspect-square"
            />
            <p>Copyright Rimel 2022. All right reserved</p>
          </div>
        </div>
      </div>
    </footer>
  );
};
