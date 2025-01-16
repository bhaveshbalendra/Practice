export interface NavItem {
  label: string;
  href: string;
}

export interface SocialIcon {
  src: string;
  alt: string;
}

export interface FooterLink {
  label: string;
  href: string;
}

export interface ProductImage {
  src: string;
  alt: string;
}

export interface ColorOption {
  color: string;
  selected?: boolean;
}

export interface SizeOption {
  label: string;
  selected?: boolean;
}
