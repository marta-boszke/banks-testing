package pl.marta.banks;

import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by Marta on 12.04.2017.
 */
@Config(browser = Browser.CHROME, url="https://wnioski.getinbank.pl/wniosek/konto-getin-up/1?")
public class GetinBankTest extends Locomotive {

    @Test
    public void testForm() throws Exception {
        setText("#forename", "ania")
                .validateText("#forename", "ania");
        setText("#surname", "kowalska")
                .validateText("#surname", "kowalska");
        setText("#phone_no1", "789-456-123")
                .validateText("#phone_no1", "789-456-123");
        setText("#email", "vjniaevnqi@wp.pl")
                .validateText("#email", "vjniaevnqi@wp.pl");
        click(By.xpath("//*[@id=\"agreed_21_div\"]/label"))
                .validatePresent(By.xpath("//*[@id=\"agreed_21_div\"]/label"));
        click("#next")
                .validatePresent("#second_forename");
        setText("#second_forename", "kasia")
                .validateText("#second_forename", "kasia");

        setText("#mother_maiden_name", "nowak")
                .validateText("#mother_maiden_name", "nowak");

        click("#id_dict_countries_birth_div")
                .validatePresent("#id_dict_countries_birth_div");
        click(By.xpath("//*[@id=\"id_dict_countries_birth_div\"]/div[1]/div/ul/li[4]/a"))
                .validatePresent(By.xpath("//*[@id=\"id_dict_countries_birth_div\"]/div[1]/div/ul/li[4]/a"));
        setText("#place_of_birth", "tirana")
                .validateText("#place_of_birth", "tirana");
        setText("#document_no", "ADW 712436")
                .validateText("#document_no", "ADW 712436");
        setText("#document_date", "21.03.2014")
                .validateText("#document_date", "21.03.2014");
        setText("#document_expiration_date", "21.03.2018")
                .validateText("#document_expiration_date", "21.03.2018");
        setText("#personal_id", "03270307613")
                .validateText("#personal_id", "03270307613");
        setText("#identity_card_issuer", "vhjfbjsbvjh")
                .validateText("#identity_card_issuer", "vhjfbjsbvjh");
        setText("#address_street", "jgheigheo")
                .validateText("#address_street", "jgheigheo");
        setText("#address_house_no", "5")
                .validateText("#address_house_no", "5");
        setText("#address_apartments_no", "25")
                .validateText("#address_apartments_no", "25");
        setText("#address_post_code", "80-200")
                .validateText("#address_post_code", "80-200");
        setText("#address_city", "reda")
                .validateText("#address_city", "reda");
        click(By.xpath("//*[@id=\"agreed_18_div\"]"))
                .validatePresent(By.xpath("//*[@id=\"agreed_18_div\"]"));
        click(By.xpath("//*[@id=\"agreed_20_div\"]"))
                .validatePresent(By.xpath("//*[@id=\"agreed_20_div\"]"));
        click(By.xpath("//*[@id=\"agreed_19_div\"]"))
                .validatePresent(By.xpath("//*[@id=\"agreed_19_div\"]"));

        Thread.sleep(5000);
    }

}

