describe('API Learning', () => {

    let webURL = "https://the-internet.herokuapp.com/login";
    let usernameCSSSelector = '#username';
    let passwordCSSSelector = '#password';
    let loginBtnCSSSelector = '.radius';
    const WAIT_CONTROL = 2000; //2000ms

    it('TC_waitFor', () => {
        browser.url(webURL);
        $(usernameCSSSelector).waitForDisplayed(WAIT_CONTROL);
        $(usernameCSSSelector).setValue("user01");
        $(passwordCSSSelector).setValue("password");
        $(loginBtnCSSSelector).click();        
    });
});