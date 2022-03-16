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

WebUI.setText(findTestObject('Web/Scenario2/txtSearch'), text)

WebUI.selectOptionByValue(findTestObject('Web/Scenario2/selectCategory'), category, false)

WebUI.click(findTestObject('Web/Scenario2/btnSearch'))

WebUI.waitForElementPresent(findTestObject('Web/Scenario2/verifyTextLoadingSearch'), GlobalVariable.timeout)

WebUI.verifyElementPresent(findTestObject('Web/Scenario2/verifyTextLoadingSearch'), GlobalVariable.timeout)

def textSearch = WebUI.getText(findTestObject('Web/Scenario2/verifyTextLoadingSearch'))

textSearch.contains(textSearch)

WebUI.verifyElementPresent(findTestObject('Web/Scenario2/verifyTextItems'), GlobalVariable.timeout)

def text = WebUI.getText(findTestObject('Web/Scenario2/verifyTextItems'))

text.contains(text)

