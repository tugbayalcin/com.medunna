package stepdefinitions.uiStepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.US05_pages;
import pages.US16_pages;
import pages.US27_WebTablePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;

import static pages.ObjectInitializer.us05_pages;
import static pages.US16_pages.selectDropdownItem;
import static pages.US16_pages.selectNavigationBarItem;

public class US27_stepDefinitions
{


    US05_pages us05_pages = new US05_pages();
    US16_pages us16_pages = new US16_pages();
    US27_WebTablePage us27_webTablePage = new US27_WebTablePage();
    public static Faker faker = new Faker();


    @Given("TY Kullanici URL Adresine Gider ve {string} Olarak Sign In Olur")
    public void tyKullaniciURLAdresineGiderVeOlarakSignInOlur(String role)
    {
        us05_pages.login("TY"+role+"Username","TY"+role+"Password");
    }
    @Then("TY Kullanici Sign-In Isleminin Basarili Olarak Gerceklestigini Dogrular")
    public void ty_kullanici_sign_ın_ısleminin_basarili_olarak_gerceklestigini_dogrular()
    {
        JSUtils.clickElementByJS(us05_pages.profileIcon);
        us05_pages.profileIcon.click();
        Assert.assertTrue(us05_pages.loginPageSignOutButton.isDisplayed());
    }
    @Then("TY Kullanici Navigation Bar'dan {string} a Tiklar")
    public void tyKullaniciNavigationBarDanATiklar(String item)
    {
        selectNavigationBarItem(item);
    }
    @Then("TY Kullanici Acilan Dropdown Menuden {string} Secenegine Tiklar")
    public void tyKullaniciAcilanDropdownMenudenSecenegineTiklar(String item)
    {
        selectDropdownItem(item);
    }
    @And("TY Kullanici {string} Sayfasinin Acildigini Dogrular")
    public void tyKullaniciSayfasininAcildiginiDogrular(String secim)
    {
        String expectedHeader = ConfigReader.getProperty("TY" + secim + "ExpectedHeader");
        String actualHeader = us16_pages.header.getText();
        Assert.assertEquals(expectedHeader,actualHeader);
    }
    @Then("TY Kullanici Messages Tablosunda {string}, {string}, {string}, {string}, {string} Basliklarinin Oldugunu Dogrular")
    public void tyKullaniciMessagesTablosundaBasliklarininOldugunuDogrular(String arg0, String arg1, String arg2, String arg3, String arg4)
    {

        // varargs yap web table konusunun notlarına bak
        // dongu yap her eleman list.contains mi baksin
    }
    @Then("TY Kullanici Yeni Mesaj Olusturur")
    public void ty_kullanici_yeni_mesaj_olusturur()
    {

    }
    @Then("TY Kullanici  Olusturulan Bu Mesajin ID Numarasini Kaydeder")
    public void ty_kullanici_olusturulan_bu_mesajin_ıd_numarasini_kaydeder()
    {

    }
    @Then("TY Kullanici Message Table Header'da ID Alanina Tiklayarak Mesajlari En Son Olusturulandan Baslayarak Siralar")
    public void ty_kullanici_message_table_header_da_ıd_alanina_tiklayarak_mesajlari_en_son_olusturulandan_baslayarak_siralar()
    {

    }
    @Then("TY Kullanici Message Table'da Ilk Satirdaki Mesajin ID Sutununda Yer Alan Degerin, Mesaj Olusturuken Girdigi ID Oldugunu Dogrular")
    public void ty_kullanici_message_table_da_ılk_satirdaki_mesajin_ıd_sutununda_yer_alan_degerin_mesaj_olusturuken_girdigi_ıd_oldugunu_dogrular()
    {

    }
    @Then("TY Kullanici Message Table'da Ilk Satirdaki Mesajin Name Sutununda Yer Alan Degerin, Mesaj Olusturuken Girdigi Name Oldugunu Dogrular")
    public void ty_kullanici_message_table_da_ılk_satirdaki_mesajin_name_sutununda_yer_alan_degerin_mesaj_olusturuken_girdigi_name_oldugunu_dogrular()
    {

    }
    @Then("TY Kullanici Message Table'da Ilk Satirdaki Mesajin Email Sutununda Yer Alan Degerin, Mesaj Olusturuken Girdigi Email Oldugunu Dogrular")
    public void ty_kullanici_message_table_da_ılk_satirdaki_mesajin_email_sutununda_yer_alan_degerin_mesaj_olusturuken_girdigi_email_oldugunu_dogrular()
    {

    }
    @Then("TY Kullanici Message Table'da Ilk Satirdaki Mesajin Subject Sutununda Yer Alan Degerin, Mesaj Olusturuken Girdigi Subject Oldugunu Dogrular")
    public void ty_kullanici_message_table_da_ılk_satirdaki_mesajin_subject_sutununda_yer_alan_degerin_mesaj_olusturuken_girdigi_subject_oldugunu_dogrular()
    {

    }
    @Then("TY Kullanici Message Table'da Ilk Satirdaki Mesajin Message Sutununda Yer Alan Degerin, Mesaj Olusturuken Girdigi Message Oldugunu Dogrular")
    public void ty_kullanici_message_table_da_ılk_satirdaki_mesajin_message_sutununda_yer_alan_degerin_mesaj_olusturuken_girdigi_message_oldugunu_dogrular()
    {

    }
    @Then("TY Kullanici Message Table Header'da ID Alanina Tiklayarak Mesajlari Ilk Olusturulandan Baslayarak Siralar")
    public void ty_kullanici_message_table_header_da_ıd_alanina_tiklayarak_mesajlari_ılk_olusturulandan_baslayarak_siralar()
    {

    }
    @Then("TY Kullanici Sayfayi, Olusturdugu Yeni Mesajin ID Numarasini Gorene Kadar Kaydirir ve Kaydirirken Olusturulmus Tum Mesajlari Goruntuler")
    public void ty_kullanici_sayfayi_olusturdugu_yeni_mesajin_ıd_numarasini_gorene_kadar_kaydirir_ve_kaydirirken_olusturulmus_tum_mesajlari_goruntuler()
    {

    }
    @Then("TY Kullanici SignOut Olur")
    public void ty_kullanici_sign_out_olur()
    {

    }
    @Given("TY Kullanici Create a New Message Butonuna Tiklar")
    public void ty_kullanici_create_a_new_message_butonuna_tiklar()
    {

    }
    @Then("TY Kullanici Create or edit a Message Sayfasinin Açildigini Dogrular")
    public void ty_kullanici_create_or_edit_a_message_sayfasinin_açildigini_dogrular()
    {

    }
    @Then("TY Kullanici Name TextBox'ina Tiklar")
    public void ty_kullanici_name_text_box_ina_tiklar()
    {

    }
    @Then("TY Kullanici Email TextBox'ina Tiklar")
    public void ty_kullanici_email_text_box_ina_tiklar()
    {

    }
    @Then("TY Kullanici Subject TextBox'ina Tiklar")
    public void ty_kullanici_subject_text_box_ina_tiklar()
    {

    }
    @Then("TY Kullanici Name TextBox'inin Altinda 'This field is required.' Yazisinin Gorundugunu Dogrular")
    public void ty_kullanici_name_text_box_inin_altinda_this_field_is_required_yazisinin_gorundugunu_dogrular()
    {

    }
    @Then("TY Kullanici Email TextBox'inin Altinda 'Your email is required.' Yazisinin Gorundugunu Dogrular")
    public void ty_kullanici_email_text_box_inin_altinda_your_email_is_required_yazisinin_gorundugunu_dogrular()
    {

    }
    @Then("TY Kullanici Subject TextBox'inin Altinda 'This field is required.' Yazisinin Gorundugunu Dogrular")
    public void ty_kullanici_subject_text_box_inin_altinda_this_field_is_required_yazisinin_gorundugunu_dogrular()
    {

    }
    @Then("TY Kullanici Name TextBox'ina Tiklar ve Isim Girer")
    public void ty_kullanici_name_text_box_ina_tiklar_ve_ısim_girer()
    {

    }
    @Then("TY Kullanici Email TextBox'ina Tiklar @mail.com Icermeyen Bir Mail Girer")
    public void ty_kullanici_email_text_box_ina_tiklar_mail_com_ıcermeyen_bir_mail_girer()
    {

    }
    @Then("TY Kullanici Email TextBox'inin Altinda 'This field is invalid' Yazisinin Gorundugunu Dogrular")
    public void ty_kullanici_email_text_box_inin_altinda_this_field_is_invalid_yazisinin_gorundugunu_dogrular()
    {

    }
    @Then("TY Kullanici Subject TextBox'ina Tiklar ve Konuyu Girer")
    public void ty_kullanici_subject_text_box_ina_tiklar_ve_konuyu_girer()
    {

    }
    @Then("TY Kullanici Message TextBox'ina Tiklar ve Mesaji Girer")
    public void ty_kullanici_message_text_box_ina_tiklar_ve_mesaji_girer()
    {

    }
    @Then("TY Kullanici Save Butonuna Tiklar")
    public void ty_kullanici_save_butonuna_tiklar()
    {

    }
    @Then("TY Kullanici Gelen PopUp Mesajinin Yesil Renkte Oldugunu Dogrulamak Icin Ekran Resmi Alir")
    public void ty_kullanici_gelen_pop_up_mesajinin_yesil_renkte_oldugunu_dogrulamak_ıcin_ekran_resmi_alir()
    {

    }
    @Then("TY Kullanici PopUp Uzerinde Yer Alan Mesajin {string}  Icerdigini Dogrular")
    public void ty_kullanici_pop_up_uzerinde_yer_alan_mesajin_ıcerdigini_dogrular(String string)
    {

    }
    @Then("TY Kullanici Room Table Header'da ID Alanina Tiklayarak Mesajlari En Son Olusturulandan Baslayarak Siralar")
    public void ty_kullanici_room_table_header_da_ıd_alanina_tiklayarak_mesajlari_en_son_olusturulandan_baslayarak_siralar()
    {

    }
    @Given("TY Kullanici Room Table'da Ilk Satirda Yer Alan Mesajin View Butonuna Basar")
    public void ty_kullanici_room_table_da_ılk_satirda_yer_alan_mesajin_view_butonuna_basar()
    {

    }
    @Given("TY Kullanici Acilan Message Sayfasinda Edit Butonuna Tiklar")
    public void ty_kullanici_acilan_message_sayfasinda_edit_butonuna_tiklar()
    {

    }
    @Given("TY Kullanici Create or edit a Message Sayfasinin Acildigini Dogrular")
    public void ty_kullanici_create_or_edit_a_message_sayfasinin_acildigini_dogrular()
    {

    }
    @Then("TY Kullanici Name TextBox'ina Tiklar, Temizler Ve Yeni Name'i Girer")
    public void ty_kullanici_name_text_box_ina_tiklar_temizler_ve_yeni_name_i_girer()
    {

    }
    @Then("TY Kullanici Email TextBox'ina Tiklar, Temizler Ve Yeni Email'i Girer")
    public void ty_kullanici_email_text_box_ina_tiklar_temizler_ve_yeni_email_i_girer()
    {

    }
    @Then("TY Kullanici Subject TextBox'ina Tiklar, Temizler Ve Yeni Suject'i Girer")
    public void ty_kullanici_subject_text_box_ina_tiklar_temizler_ve_yeni_suject_i_girer()
    {

    }
    @Then("TY Kullanici Message TextBox'ina Tiklar, Temizler Ve Yeni Message'i Girer")
    public void ty_kullanici_message_text_box_ina_tiklar_temizler_ve_yeni_message_i_girer()
    {

    }
    @Then("TY Kullanici Save Butonuna Basar")
    public void ty_kullanici_save_butonuna_basar()
    {
    }
    @Then("TY Kullanici Gelen PopUp Mesajinin Yesil Renkte Oldugunu Dogrulamak Icin Ekran Resmi Alinir")
    public void ty_kullanici_gelen_pop_up_mesajinin_yesil_renkte_oldugunu_dogrulamak_ıcin_ekran_resmi_alinir()
    {

    }
    @Given("TY Kullanici Room Table'da Ilk Satirda Yer Alan Mesajin Edit Butonuna Basar")
    public void ty_kullanici_room_table_da_ılk_satirda_yer_alan_mesajin_edit_butonuna_basar()
    {

    }
    @Given("TY Kullanici Room Table'da Ilk Satirda Yer Alan Mesajin Delete Butonuna Basar")
    public void ty_kullanici_room_table_da_ılk_satirda_yer_alan_mesajin_delete_butonuna_basar()
    {

    }
    @Then("TY Kullanici Acilan PopUp'da Delete Butonuna Tiklar")
    public void ty_kullanici_acilan_pop_up_da_delete_butonuna_tiklar()
    {

    }



}