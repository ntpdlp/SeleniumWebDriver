require "selenium-webdriver"
require "rspec"
require_relative "signup_page.rb"
require_relative "users_page.rb"

timestamp = Time.now.to_i
username = "user#{timestamp}"
email = "user#{timestamp}@test.com"
password = "password"
expected_banner_text = "Welcome to the alpha blog user#{timestamp}"

Selenium::WebDriver::Chrome.driver_path="/Users/phuong/Documents/MUM/MUM_08_Courses/09.AutomationTesting/SeleniumWebDriver/chromedriver"

# TEST: Sign up for blog
describe "Blog application" do
  describe "when signing up a new user"	do
    it "creates a new user account successfully" do
      @driver = Selenium::WebDriver.for :chrome
      # Go to signup form
      @driver.navigate.to "https://selenium-blog.herokuapp.com/signup"
      # Fill out and submit form
      signupPage = SignupPage.new(@driver)
      signupPage.enter_username(username)
      signupPage.enter_email_address(email)
      signupPage.enter_password(password)
      signupPage.submit_form()
      # Confirm user is signed up successfully
      usersPage = UsersPage.new(@driver)
      banner_text = usersPage.get_banner_text()
      expect(banner_text).to eq(expected_banner_text)
      @driver.quit
    end
  end
end
