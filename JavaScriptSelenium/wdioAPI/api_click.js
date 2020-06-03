describe('API Learning', () => {
    let indexPageURL = "https://the-internet.herokuapp.com/"; 
    let formAuthenticationLink = '=Form Authentication';
    let usernameField = '#username';
    let passwordField = '#password';
    let loginBtn = '[type="submit"]';
    const WAIT_CONTROL = 5000; //5000ms = 5s
    const IMPLICIT_WAIT = 2000;

    it('TC_clickLinkText', () => {
        //[1] open index page
        browser.url(indexPageURL);
        //[2] click link text has tagName = "Form Authentication"
        $(formAuthenticationLink).waitForDisplayed(WAIT_CONTROL);
        $(formAuthenticationLink).click();
        browser.pause(IMPLICIT_WAIT);
        $(usernameField).setValue("user01");
        $(passwordField).setValue("password");
        $(loginBtn).click();
    });


});


