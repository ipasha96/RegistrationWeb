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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev.p2p.alamisharia.co.id/')

WebUI.click(findTestObject('Object Repository/Page_Login  ALAMI Peer-to-Peer Lending Syariah/a_Daftar disini'))

WebUI.click(findTestObject('Object Repository/Page_ALAMI Daftar  ALAMI Peer-to-Peer Lendi_33cbd2/div_Pemberi Dana'))

WebUI.setText(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/input_Nama Lengkap_name'), 
    'Dona')

int Number = new Random().nextInt((1000 - 1) + 1) + 10

String Counter1 = 'ipasha96' + Number

String Counter = Counter1 + '@dispostable.com'

GlobalVariable.Counter = Counter
GlobalVariable.Counter2 = Counter1

WebUI.setText(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/input_Email_email', [
            (GlobalVariable.Counter) : GlobalVariable.Counter]), GlobalVariable.Counter)

//WebUI.setText(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/input_Email_email'),'ipasha96@gmail.com')
int Number1 = new Random().nextInt((999999999 - 10) + 1) + 10

String Phone = '0812678' + Number

GlobalVariable.Phone = Phone

WebUI.setText(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/input_No. Handphone_phone', 
        [(GlobalVariable.Phone) : GlobalVariable.Phone]), GlobalVariable.Phone)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/input_Password_password'), 
    'Xq+Grj40a3e0nkYhGIsjqg==')

WebUI.click(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/label_Individual'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/select_-- Silahkan Pilih --                _9f24ad'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/button_Lanjutkan'))

WebUI.click(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/div_Kebijakan Privasi  Ketentuan Pengguna  _ea668f'))

WebUI.click(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/p_Bismillahirrahmanirrahim'))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ALT, Keys.DOWN))

WebUI.click(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/input_Saya sudah membaca dan setuju dengan._c5cbb7'))

WebUI.click(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/button_Lanjutkan_1'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.dispostable.com/')

WebUI.setText(findTestObject('Object Repository/Page_Dispostable - Disposable email/input_Dispostable_m'), GlobalVariable.Counter2)

WebUI.click(findTestObject('Object Repository/Page_Dispostable - Disposable email/input_Dispostable_submitinbox'))

WebUI.click(findTestObject('Object Repository/Page_Dispostable - Inbox for ipasha96910dis_37ee88/a_ALAMI Sharia - Aktivasi Akun'))

WebUI.click(findTestObject('Object Repository/Page_Dispostable - Message ALAMI Sharia - A_670385/a_Klik Untuk Aktivasi Email  Log-in'))

WebUI.click(findTestObject('Object Repository/Page_Daftar Sebagai Pemberi Dana  ALAMI Pee_40e437/a_Masuk ke Akun Saya'))

WebUI.setText(findTestObject('Object Repository/Page_Login  ALAMI Peer-to-Peer Lending Syariah/input_Assalamualaikum_username'), 
    'ipasha96910@dispostable.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  ALAMI Peer-to-Peer Lending Syariah/input_Assalamualaikum_password'), 
    'Xq+Grj40a3e0nkYhGIsjqg==')

WebUI.click(findTestObject('Object Repository/Page_Login  ALAMI Peer-to-Peer Lending Syariah/a_Masuk Ke Akun Saya'))
WebUI.delay(2)
WebUI.closeBrowser()
