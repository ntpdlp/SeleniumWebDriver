describe('API Learning', () => {
    let pageURL = "https://the-internet.herokuapp.com/dropdown";
    let dropdownTitleCSSSelector = 'h3';
    const WAIT_CONTROL = 2000; //2000ms = 2s
    const IMPLICIT_WAIT = 2000;

    it('TC_getText', () => {
        browser.url(pageURL);
        $(dropdownTitleCSSSelector).waitForDisplayed(WAIT_CONTROL);
        let dropdownTitle = $(dropdownTitleCSSSelector).getText();
        console.log(dropdownTitle);
    });
});