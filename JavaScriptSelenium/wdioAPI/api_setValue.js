describe('API Learning',()=>{
    it('TC_setValue',()=>{
        // [1] open page
        // [2] input username, password
        // [3] click Login button
        browser.url("https://the-internet.herokuapp.com/login");
        let usernameField = "#username";
        let passwordField = "#password";
        let loginBtn = ".radius";

        $(usernameField).setValue("user01");
        $(passwordField).setValue("password");
        $(loginBtn).click();
    });
});