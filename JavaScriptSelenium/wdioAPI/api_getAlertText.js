describe('API Learning', () => {
    let pageURL = 'https://the-internet.herokuapp.com/';
    let WAIT_CONTROL = 1000;
    let JavascriptAlertCSSSelector = '=JavaScript Alerts';
    let clickForJSAlertCSSSelector = '[onclick="jsAlert()"]';
    let resultCSSSelector = '#result';
    it('TC_AlertDialog', () => {
        browser.url(pageURL);
        $(JavascriptAlertCSSSelector).waitForDisplayed(WAIT_CONTROL);
        $(JavascriptAlertCSSSelector).click();
        $(clickForJSAlertCSSSelector).waitForDisplayed(WAIT_CONTROL);
        $(clickForJSAlertCSSSelector).click();
        let alertText = browser.getAlertText();
        browser.pause(WAIT_CONTROL);
        browser.acceptAlert();
        browser.pause(WAIT_CONTROL);
    });
});