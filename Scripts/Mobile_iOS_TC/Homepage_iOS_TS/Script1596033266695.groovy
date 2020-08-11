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

WebUI.openBrowser('')

'Landing on Homepage'
WebUI.navigateToUrl('https://www.corsair.com/ww/en/')

'Click on Menu Icon'
WebUI.click(findTestObject('Mobile_iOS_OR/homepage_iOS_OR/a_My Account_menu-btn'))

'Click on \'Gaming Gear\' Link'
WebUI.click(findTestObject('Mobile_iOS_OR/menuHeaderNavigationLink_GamingGear/menu_GamingGear_Link'))

'Click in \'Keyboards\' category link'
WebUI.click(findTestObject('Mobile_iOS_OR/menuHeaderNavigationLink_GamingGear/li_Child1_Keyboards'))

'Click on \'All Keywords\' SubCategory Link'
WebUI.click(findTestObject('Mobile_iOS_OR/menuHeaderNavigationLink_GamingGear/li_SubChild1_All Keyboards'))

WebUI.closeBrowser()

