package pl.marta.banks;

import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by Marta on 12.04.2017.
 */
@Config(browser = Browser.CHROME, url="https://wniosekonline.eurobank.pl/konto/step2")
public class EurobankTest extends Locomotive {

    @Test
    public void testForm() throws Exception {
        click(By.xpath("//*[@id=\"step1\"]/div[2]/div[2]/button"))
                .validatePresent("#uniform-accountType");
        click("#uniform-accountType")
                .validatePresent("#uniform-accountType");
        click(By.xpath("//*[@id=\"accountType\"]/option[2]"))
                .validatePresent(By.xpath("//*[@id=\"accountType\"]/option[2]"));
        click(By.xpath("//*[@id=\"uniform-statementDeliveryMethod\"]"))
                .validatePresent(By.xpath("//*[@id=\"uniform-statementDeliveryMethod\"]"));
        click(By.xpath("//*[@id=\"statementDeliveryMethod\"]/option[2]"))
                .validatePresent(By.xpath("//*[@id=\"statementDeliveryMethod\"]/option[2]"));
        click(By.xpath("//*[@id=\"uniform-additionalInternetTransactionSecurity\"]"))
                .validatePresent(By.xpath("//*[@id=\"uniform-additionalInternetTransactionSecurity\"]"));
        click(By.xpath("//*[@id=\"additionalInternetTransactionSecurity\"]/option[2]"))
                .validatePresent(By.xpath("//*[@id=\"additionalInternetTransactionSecurity\"]/option[2]"));
        click(By.xpath("//*[@id=\"uniform-accountMotion.debitCardType1\"]"))
                .validatePresent(By.xpath("//*[@id=\"uniform-accountMotion.debitCardType1\"]"));
        click("#uniform-phoneAppType")
                .validatePresent("#uniform-phoneAppType");
        click(By.xpath("//*[@id=\"phoneAppType\"]/option[3]"))
                .validatePresent(By.xpath("//*[@id=\"phoneAppType\"]/option[3]"));
        click(By.xpath("/html/body/article/section/div/div[1]/div[1]/form/div[2]/div/button"))
                .validatePresent(By.xpath("/html/body/article/section/div/div[1]/div[1]/form/div[1]/div[1]/div[1]"));
        setText("#firstName", "ania")
                .validateText("#firstName", "ania");
        setText("#lastName", "nowak")
                .validateText("#lastName", "nowak");
        setText("#pesel", "51021600661")
                .validateText("#pesel", "51021600661");
        setText("#motherFirstName", "kasia")
                .validateText("#motherFirstName", "kasia");
        setText("#fatherFirstName", "adam")
                .validateText("#fatherFirstName", "adam");
        setText("#motherMaidenName", "kowalska")
                .validateText("#motherMaidenName", "kowalska");
        setText("#birthPlace", "gdansk")
                .validateText("#birthPlace", "gdansk");
        click("#uniform-birthCountry")
                .validatePresent("#uniform-birthCountry");
        click(By.xpath("//*[@id=\"birthCountry\"]/option[46]"))
                .validatePresent(By.xpath("//*[@id=\"birthCountry\"]/option[46]"));
        click("#uniform-nationality")
                .validatePresent("#uniform-nationality");
        click("#uniform-countryOfResidence")
                .validatePresent("#uniform-countryOfResidence");
        click("#uniform-sourceOfIncome")
                .validatePresent("uniform-sourceOfIncome");
        click(By.xpath("//*[@id=\"sourceOfIncome\"]/option[2]"))
                .validatePresent(By.xpath("//*[@id=\"sourceOfIncome\"]/option[2]"));

        Thread.sleep(5000);
    }

}
