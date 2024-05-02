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

WebUI.setText(findTestObject('Object Repository/Trademark_Registration_02/Page_TrademarkTrademark Online Filing  Cali_32bac1/input_element5'), 
    'John Doe')

WebUI.setText(findTestObject('Object Repository/Trademark_Registration_02/Page_TrademarkTrademark Online Filing  Cali_32bac1/input_element443'), 
    '555 California Street')

WebUI.setText(findTestObject('Object Repository/Trademark_Registration_02/Page_TrademarkTrademark Online Filing  Cali_32bac1/input_element446'), 
    'Sacramento')

WebUI.setText(findTestObject('Object Repository/Trademark_Registration_02/Page_TrademarkTrademark Online Filing  Cali_32bac1/input_element445'), 
    'CA')

WebUI.setText(findTestObject('Object Repository/Trademark_Registration_02/Page_TrademarkTrademark Online Filing  Cali_32bac1/input_element444'), 
    'US')

WebUI.setText(findTestObject('Object Repository/Trademark_Registration_02/Page_TrademarkTrademark Online Filing  Cali_32bac1/input_element447'), 
    '95819')

WebUI.click(findTestObject('Object Repository/Trademark_Registration_02/Page_TrademarkTrademark Online Filing  Cali_32bac1/input_element474'))

WebUI.setText(findTestObject('Object Repository/Trademark_Registration_02/Page_TrademarkTrademark Online Filing  Cali_32bac1/input_element526'), 
    'Jane Doe')

WebUI.setText(findTestObject('Object Repository/Trademark_Registration_02/Page_TrademarkTrademark Online Filing  Cali_32bac1/input_element327'), 
    'Jane Doe')

WebUI.click(findTestObject('Object Repository/Trademark_Registration_02/Page_TrademarkTrademark Online Filing  Cali_32bac1/span_select2-selection__arrow'))

WebUI.setText(findTestObject('Object Repository/Trademark_Registration_02/Page_TrademarkTrademark Online Filing  Cali_32bac1/input_select2-search__field'), 
    'cor')

WebUI.sendKeys(findTestObject('Object Repository/Trademark_Registration_02/Page_TrademarkTrademark Online Filing  Cali_32bac1/input_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Trademark_Registration_02/Page_TrademarkTrademark Online Filing  Cali_32bac1/b'))

WebUI.setText(findTestObject('Object Repository/Trademark_Registration_02/Page_TrademarkTrademark Online Filing  Cali_32bac1/input_select2-search__field'), 
    'ca')

WebUI.sendKeys(findTestObject('Object Repository/Trademark_Registration_02/Page_TrademarkTrademark Online Filing  Cali_32bac1/input_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Trademark_Registration_02/Page_TrademarkTrademark Online Filing  Cali_32bac1/input_element2'))

WebUI.delay(2)

