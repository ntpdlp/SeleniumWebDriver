from selenium import webdriver
from selenium.webdriver.common.keys import Keys

import time

# driver = webdriver.Firefox()
# driver = webdriver.Edge()
# driver = webdriver.Safari()
driver = webdriver.Chrome()
driver.get ('https://www.google.com/')
searchField = driver.find_element_by_name('q')
searchField.send_keys('Selenium Python')
searchField.send_keys(Keys.RETURN)
time.sleep(5)
driver.close()