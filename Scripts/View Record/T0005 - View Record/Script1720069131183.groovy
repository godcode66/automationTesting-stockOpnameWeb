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

WebUI.navigateToUrl('http://127.0.0.1:8000/')

WebUI.click(findTestObject('Object Repository/View Record/Page_Recto Studies/a_Login'))

WebUI.setText(findTestObject('Object Repository/View Record/Page_Recto Studies/input__username'), 'manager2')

WebUI.setEncryptedText(findTestObject('Object Repository/View Record/Page_Recto Studies/input__password'), 'AA+K34o+HyZp/kPi54xAug==')

WebUI.click(findTestObject('Object Repository/View Record/Page_Recto Studies/button_Login'))

WebUI.click(findTestObject('Object Repository/View Record/Page_Recto Studies/a_View Book'))

WebUI.click(findTestObject('Object Repository/View Record/Page_Recto Studies/a_Return to Dashboard'))

WebUI.click(findTestObject('Object Repository/View Record/Page_Recto Studies/body_RectoStudies                          _35bed3'))

WebUI.click(findTestObject('Object Repository/View Record/Page_Recto Studies/a_Sign out'))

WebUI.closeBrowser()

