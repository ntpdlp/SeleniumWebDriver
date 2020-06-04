
describe('API Learning', () => {
    let pageURL = "https://the-internet.herokuapp.com/";
    let headingCSSSelector = '.heading';
    const WAIT_CONTROL = 5000;
    it('TC_getUrl', () => {
        browser.url(pageURL);       
        $(headingCSSSelector).waitForDisplayed(WAIT_CONTROL);
        console.log(browser.getUrl());
        console.log(browser.getTitle());
    });
});