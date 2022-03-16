import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import java.lang.Integer as Integer
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

WebUI.click(findTestObject('Web/Scenario1/btnShopbyCategory'))

WebUI.waitForElementPresent(findTestObject('Web/Scenario1/linkCellPhonesandCategories'), GlobalVariable.timeout)

WebUI.click(findTestObject('Web/Scenario1/linkCellPhonesandCategories'))

WebUI.verifyElementPresent(findTestObject('Web/Scenario1/verifyTextShopbyCategory'), GlobalVariable.timeout)

WebUI.click(findTestObject('Web/Scenario1/linkCellPhonesandSmartphones'))

WebUI.verifyElementPresent(findTestObject('Web/Scenario1/verifyTextStayInTouch'), GlobalVariable.timeout)

WebUI.scrollToElement(findTestObject('Web/Scenario1/btnFilter'), GlobalVariable.timeout)

WebUI.click(findTestObject('Web/Scenario1/btnFilter'))

WebUI.waitForElementPresent(findTestObject('Web/Scenario1/linkScreenSize'), GlobalVariable.timeout)

WebUI.click(findTestObject('Web/Scenario1/linkScreenSize'))

WebUI.click(findTestObject('Web/Scenario1/checkBoxScreenType'))

WebUI.scrollToElement(findTestObject('Web/Scenario1/linkToScroll'), GlobalVariable.timeout)

WebUI.click(findTestObject('Web/Scenario1/linkPrice'))

WebUI.setText(findTestObject('Web/Scenario1/textPriceFrom'), from)

WebUI.setText(findTestObject('Web/Scenario1/textPriceTo'), to)

WebUI.click(findTestObject('Web/Scenario1/linkItemLocation'))

WebUI.click(findTestObject('Web/Scenario1/rbItemLocation'))

WebUI.click(findTestObject('Web/Scenario1/btnApplyFilter'))

String countFilter = WebUI.getText(findTestObject('Web/Scenario1/verifyFilter'))

countFilterInt = countFilter.replaceAll('[^0-9]', '')

countFilterInteger = Integer.parseInt(countFilterInt)

WebUI.verifyEqual(countFilterInteger, filter)

