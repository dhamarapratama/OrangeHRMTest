import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_username'), 'Admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.sendKeys(findTestObject('Object Repository/Page_OrangeHRM/input_Password_password'), Keys.chord(Keys.ENTER))

'Click PIM at dashboard\r\n'
WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Admin_oxd-main-menu-item'))

'Click tab employee'
WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/li_Configuration_oxd-topbar-body-nav-tab'))

'Validation for "Add Employee" form\r\n'
WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_Configuration_orangehrm-card-container'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Employee Full Name_firstName'), 'qwer')

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Employee Full Name_lastName'), 'rtyu')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Cancel_oxd-button oxd-button--medium_160139'))

'Validation if member already added'
WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_OrangeHRM, Inc_oxd-toast oxd-toast--suc_e9b1cc'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button__oxd-button oxd-button--medium oxd-b_ad9c84'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/li__oxd-topbar-body-nav-tab'))

WebUI.closeBrowser()

