---
name: Luminous Glass
colors:
  surface: '#f9f9ff'
  surface-dim: '#d3daef'
  surface-bright: '#f9f9ff'
  surface-container-lowest: '#ffffff'
  surface-container-low: '#f1f3ff'
  surface-container: '#e9edff'
  surface-container-high: '#e1e8fd'
  surface-container-highest: '#dce2f7'
  on-surface: '#141b2b'
  on-surface-variant: '#444748'
  inverse-surface: '#293040'
  inverse-on-surface: '#edf0ff'
  outline: '#747878'
  outline-variant: '#c4c7c8'
  surface-tint: '#5d5f5f'
  primary: '#5d5f5f'
  on-primary: '#ffffff'
  primary-container: '#ffffff'
  on-primary-container: '#747676'
  inverse-primary: '#c6c6c7'
  secondary: '#5c5f61'
  on-secondary: '#ffffff'
  secondary-container: '#e0e3e6'
  on-secondary-container: '#626567'
  tertiary: '#5a5f64'
  on-tertiary: '#ffffff'
  tertiary-container: '#ffffff'
  on-tertiary-container: '#72767c'
  error: '#ba1a1a'
  on-error: '#ffffff'
  error-container: '#ffdad6'
  on-error-container: '#93000a'
  primary-fixed: '#e2e2e2'
  primary-fixed-dim: '#c6c6c7'
  on-primary-fixed: '#1a1c1c'
  on-primary-fixed-variant: '#454747'
  secondary-fixed: '#e0e3e6'
  secondary-fixed-dim: '#c4c7ca'
  on-secondary-fixed: '#191c1e'
  on-secondary-fixed-variant: '#44474a'
  tertiary-fixed: '#dfe3e9'
  tertiary-fixed-dim: '#c3c7cd'
  on-tertiary-fixed: '#171c20'
  on-tertiary-fixed-variant: '#43474c'
  background: '#f9f9ff'
  on-background: '#141b2b'
  surface-variant: '#dce2f7'
typography:
  headline-xl:
    fontFamily: Plus Jakarta Sans
    fontSize: 40px
    fontWeight: '700'
    lineHeight: '1.2'
    letterSpacing: -0.02em
  headline-lg:
    fontFamily: Plus Jakarta Sans
    fontSize: 28px
    fontWeight: '600'
    lineHeight: '1.3'
    letterSpacing: -0.01em
  body-md:
    fontFamily: Plus Jakarta Sans
    fontSize: 16px
    fontWeight: '400'
    lineHeight: '1.6'
    letterSpacing: '0'
  label-sm:
    fontFamily: Plus Jakarta Sans
    fontSize: 12px
    fontWeight: '600'
    lineHeight: '1'
    letterSpacing: 0.05em
rounded:
  sm: 0.25rem
  DEFAULT: 0.5rem
  md: 0.75rem
  lg: 1rem
  xl: 1.5rem
  full: 9999px
spacing:
  unit: 4px
  xs: 0.5rem
  sm: 1rem
  md: 1.5rem
  lg: 2.5rem
  xl: 4rem
  container-padding: 2rem
  gutter: 1.5rem
---

## Brand & Style

This design system is defined by a state of ethereal clarity and weightlessness. Inspired by the refined translucency of modern iOS interfaces, it leverages **Glassmorphism** to create a sense of depth and hierarchy without the use of heavy colors or opaque surfaces.

The brand personality is premium, serene, and highly organized. It targets users who appreciate digital environments that feel breathable and calm. By prioritizing whites and subtle grays, the UI recedes into the background, allowing content to take center stage through layers of frosted glass and soft, ambient shadows.

## Colors

The palette is monochromatic and high-key. The "Primary" color is a pure white used for highlights and high-contrast text. The background is not a flat gray but a very subtle, cool-toned gradient to provide enough contrast for the white glass elements to "pop."

Translucency is the core "color" of this system. Surfaces use varying degrees of white alpha transparency combined with backdrop saturation and blur filters to differentiate layers.

## Typography

This design system utilizes **Plus Jakarta Sans** for its friendly yet sophisticated geometric construction. Typography should be treated as a structural element. 

Headlines use tighter letter spacing and heavier weights to maintain authority against the soft background effects. Body text maintains generous line height for maximum legibility. For a truly premium feel, use white text on slightly darker glass elements, and dark gray (`#4B5563`) for text on lighter surfaces.

## Layout & Spacing

The layout philosophy follows a **Fluid Grid** with generous safe areas. Elements are grouped into "Glass Containers" that act as the primary structural units. 

Spacing is airy; nothing should feel cramped. Use larger-than-standard margins (`xl`) between major sections to emphasize the minimalist aesthetic. Alignment should be centered for hero components (like the "JUGAR" button) to evoke the symmetric, balanced feel seen in the reference sketch.

## Elevation & Depth

Depth is achieved through a combination of three effects:
1.  **Backdrop Blur:** A standard `blur(20px)` or higher is applied to all container surfaces.
2.  **Inner Glow / Border:** Every glass element features a 1px solid border at `rgba(255, 255, 255, 0.6)` to simulate the edge of a glass pane catching the light.
3.  **Soft Ambient Shadows:** Shadows are extremely diffused with low opacity (e.g., `box-shadow: 0 10px 30px rgba(0, 0, 0, 0.04)`).

Stacked layers should increase in brightness and blur intensity as they move "closer" to the user.

## Shapes

The shape language is "Rounded," favoring organic, squircle-like corners that feel soft to the touch. 

- **Primary Cards/Containers:** Use `rounded-xl` (1.5rem) to create a friendly, approachable frame.
- **Buttons & Chips:** Use `rounded-lg` (1rem) or full pills for high-action items.
- **Icons:** Should reside within rounded-square glass containers as shown in the top navigation row of the sketch.

## Components

- **Glass Cards:** The foundational component. They feature a semi-transparent white background, high backdrop blur, and the signature 1px white border.
- **Primary Action (JUGAR):** Large, pill-shaped or highly rounded glass container. Text should be all-caps with generous letter spacing to denote its importance.
- **Icon Buttons:** Small, square-ish glass tiles with `backdrop-filter: blur(10px)`. The icon inside should be a simple, thin-stroke glyph.
- **Lists:** Items within glass cards are separated by thin, low-opacity white lines (`rgba(255, 255, 255, 0.2)`), rather than dark borders.
- **Inputs:** Sunken glass effect, achieved by reversing the shadow to an internal `inset` shadow, making the field feel etched into the surface.