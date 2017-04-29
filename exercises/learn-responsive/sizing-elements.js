// RESPONSIVE DESIGN

// RESIZING ELEMENTS

// 1. INTRO

// 2. EM
//Today, the em represents the size of the base font being used. For example,
//if the base font of a browser is 16 pixels (which is normally the default
//size of text in a browser), then 1 em is equal to 16 pixels. 2 ems would
//equal 32 pixels, and so on.

bannerH1-- font-size: 1.5em;
postH2--   font-size: 1.75em;
postH3--   font-size: 1.25em;
footer--   font-size: 0.75em;

// 3. REM
//Rem stands for root em. It acts similar to em, but instead of checking parent
//elements to size font, it checks the root element.
html {
  font-size: 16px;
}
bannerH1--  font-size: 3.75rem;
postH2--    font-size: 1.875rem;
postH3--    font-size: 1.125rem;
footer--    font-size: 1.125rem;

// 4. Percentages
