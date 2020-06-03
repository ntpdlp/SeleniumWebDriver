describe('API Learning', () => {
    it('TC_selectBy', () => {
        let pageURL = "https://the-internet.herokuapp.com/dropdown";
        let optionSelected2 = "Option 2";
        let dropdownCSSSelector = '#dropdown';
        const WAIT_CONTROL = 5000; //5000ms = 5s
        const WAIT_TO_SEE_RESULT = 2000; //2s

        browser.url(pageURL);
        $(dropdownCSSSelector).waitForDisplayed(WAIT_CONTROL);
        $(dropdownCSSSelector).selectByVisibleText(optionSelected2);
        browser.pause(WAIT_TO_SEE_RESULT);

        $(dropdownCSSSelector).selectByAttribute('value', '1');
        browser.pause(WAIT_TO_SEE_RESULT);

    });
});