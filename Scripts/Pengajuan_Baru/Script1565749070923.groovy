import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test.tunaiku.com/')

WebUI.dragAndDropToObject(findTestObject('HomePage/div_per bulan_mat-slider-thumb'), 
    findTestObject('HomePage/mat-slider_20000000'))

WebUI.click(findTestObject('HomePage/button_Ajukan_Pinjaman'))

WebUI.click(findTestObject('PagePernahatauBelum/button_BELUM_PERNAH'))

WebUI.setText(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru1_CreateAccount/input_Nama_Lengkap'), 'Tejo Sutaryo')

WebUI.setText(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru1_CreateAccount/input_Nomor_Handphone'), '89611543414')

WebUI.setText(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru1_CreateAccount/input_Alamat_Email'), 'TejoSutaryo@gmail.com')

WebUI.selectOptionByValue(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru1_CreateAccount/select_Pilih_Email'), 'Personal', 
    false)

WebUI.selectOptionByValue(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru1_CreateAccount/select_Pilih_Tujuan'), 'Holiday', 
    false)

WebUI.selectOptionByValue(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru1_CreateAccount/select_Pilih_Darimana'), 'Internet', 
    false)

WebUI.click(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru1_CreateAccount/button_Lanjut'))

WebUI.setText(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru2_DataDiri/field_Ktp'), '1231231231232312')

WebUI.selectOptionByValue(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru2_DataDiri/Dropdown_Bank'), 'AGRIS', false)

WebUI.setText(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru2_DataDiri/field_rek_acc'), '123456789')

WebUI.selectOptionByValue(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru2_DataDiri/Dropdown_education'), 'BachelorDegree', 
    false)

WebUI.click(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru2_DataDiri/button_Ya'))

WebUI.click(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru2_DataDiri/button_Selanjutnya'))

WebUI.selectOptionByValue(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru3_DataKtp/DropdownProvinsi'), '1', false)

WebUI.selectOptionByValue(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru3_DataKtp/DropdownKota'), '5', false)

WebUI.selectOptionByValue(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru3_DataKtp/DropdownDate'), '1', false)

WebUI.selectOptionByValue(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru3_DataKtp/DropdownMonth'), '2', false)

WebUI.selectOptionByValue(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru3_DataKtp/DropdownYears'), '1990', false)

WebUI.click(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru3_DataKtp/button_Laki-Laki'))

WebUI.click(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru3_DataKtp/button_Selanjutnya'))

WebUI.setText(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru4_DataKtp2/alamat_Ktp_textarea'), 'Samping Laut')

WebUI.selectOptionByValue(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru4_DataKtp2/Dropdown_jenis_tmpt_tinggal'), 
    'Rumah', false)

WebUI.setText(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru4_DataKtp2/field_Noblok'), '1')

WebUI.setText(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru4_DataKtp2/field_Norumah'), '10')

WebUI.setText(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru4_DataKtp2/field_Rt'), '01')

WebUI.setText(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru4_DataKtp2/field_Rw'), '05')

WebUI.selectOptionByValue(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru4_DataKtp2/Dropdown_Provinsiktp'), '1', false)

WebUI.selectOptionByValue(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru4_DataKtp2/Dropdown_kotaKtp'), '5', false)

WebUI.selectOptionByValue(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru4_DataKtp2/Dropdown_KecamatanKtp'), '1', false)

WebUI.selectOptionByValue(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru4_DataKtp2/Dropdown_Desa'), '1', false)

WebUI.selectOptionByValue(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru4_DataKtp2/Dropdown_Agama'), 'Muslim', false)

WebUI.selectOptionByValue(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru4_DataKtp2/Dropdown_Kewarganegaraan'), 'Indonesian', 
    false)

WebUI.click(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru4_DataKtp2/button_Selanjutnya'))

WebUI.selectOptionByValue(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru5_StatusTinggal/Dropdown_JenisTempatTinggal'), 
    'Apartment', false)

WebUI.selectOptionByValue(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru5_StatusTinggal/Dropdown_StatusKpemilikan'), 
    'Family', false)

WebUI.setText(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru5_StatusTinggal/Field_HargaSewa'), '100000')

WebUI.setText(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru5_StatusTinggal/Field_BiayaOperasional'), '1000000')

WebUI.setText(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru5_StatusTinggal/Field_JumlahPenghuni'), '5')

WebUI.setText(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru5_StatusTinggal/Field_JumlahTanggungan'), '3')

WebUI.setText(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru5_StatusTinggal/Field_NamaIbuKndung'), 'Tejo SUmarti')

WebUI.click(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru5_StatusTinggal/button_Selanjutnya'))

WebUI.click(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru6_AlamatTinggal/button_Berbeda'))

WebUI.setText(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru6_AlamatTinggal/Field_AlamatTinggal'), 'Pesisir laut')

WebUI.setText(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru6_AlamatTinggal/Field_NoBlok'), '01')

WebUI.setText(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru6_AlamatTinggal/Field_NoRumah'), '01')

WebUI.setText(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru6_AlamatTinggal/Field_Rt'), '01')

WebUI.setText(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru6_AlamatTinggal/Field_Rw'), '01')

WebUI.selectOptionByValue(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru6_AlamatTinggal/Dropdown_ProvinsiTinggal'), 
    '1', false)

WebUI.selectOptionByValue(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru6_AlamatTinggal/Dropdown_KotaTinggal'), '5', 
    false)

WebUI.selectOptionByValue(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru6_AlamatTinggal/Dropdown_KecamatanTinggal'), 
    '1', false)

WebUI.selectOptionByValue(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru6_AlamatTinggal/Dropdown_DesaTinggal'), '1', 
    false)

WebUI.click(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru6_AlamatTinggal/button_Selanjutnya'))

WebUI.selectOptionByValue(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru7_Pekerjaan/Dropdown_JenisPekerjaan'), 'PublicServant', 
    false)

WebUI.selectOptionByValue(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru7_Pekerjaan/Dropdown_StatusPekerjaan'), 'Permanent', 
    false)

WebUI.setText(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru7_Pekerjaan/Field_NamaPerusahaan'), 'Ulat Bulu')

WebUI.selectOptionByValue(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru7_Pekerjaan/Dropdown_Jabatan'), 'Staff', false)

WebUI.setText(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru7_Pekerjaan/Field_Penghasilan'), '1000000')

WebUI.setText(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru7_Pekerjaan/Field_PenghasilanBefore'), '1000000')

WebUI.click(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru7_Pekerjaan/button_Selanjutnya'))

WebUI.selectOptionByValue(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru8_Pernikahan/Dropdown_StatusPernikahan'), 
    'Married', false)

WebUI.setText(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru8_Pernikahan/Field_noKtp'), '1234567891011111')

WebUI.setText(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru8_Pernikahan/Field_NamaPas'), 'subagyi')

WebUI.selectOptionByValue(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru8_Pernikahan/Dropdown_DateMenikah'), '1', 
    false)

WebUI.selectOptionByValue(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru8_Pernikahan/Dropdown_MontMenikah'), '2', 
    false)

WebUI.selectOptionByValue(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru8_Pernikahan/Dropdown_TahunMenikah'), '1993', 
    false)

WebUI.click(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru8_Pernikahan/button_Ya Pisah'))

WebUI.click(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru8_Pernikahan/button_Selanjutnya'))

WebUI.setText(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru9_DataKerabat/Field_namaKerabat'), 'Tejo Subegyo')

WebUI.setText(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru9_DataKerabat/Field_Nohpkerbat'), '89611543415')

WebUI.setText(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru9_DataKerabat/Field_Alamatlengkapkerabat'), 'sampinng laut')

WebUI.click(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru9_DataKerabat/button_Selanjutnya'))

WebUI.check(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru10_ReviewForm/Checkbox_Aggrement'))

WebUI.click(findTestObject('Obj_pengajuan_Baru/FormPengajuanBaru10_ReviewForm/button_Kirim Formulir'))

