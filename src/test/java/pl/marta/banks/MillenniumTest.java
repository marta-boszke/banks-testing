package pl.marta.banks;

import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;
import org.junit.Test;
import org.openqa.selenium.By;

@Config(browser = Browser.CHROME, url="https://www.bankmillennium.pl/wniosek-o-konto?portalId=223")
public class MillenniumTest extends Locomotive {

    @Test
    public void testForm() throws Exception {
        setText("#names", "marta janina")
                .validateText("#names", "marta janina");

        setText("#lastName", "nowak")
                .validateText("#lastName", "nowak");
        setText("#pesel", "84040603207")
                .validateText("#pesel", "84040603207");
        setText("#email", "gfhjffjfho@com.pl")
                .validateText("#email", "gfhjffjfho@com.pl");
        setText("#mobile", "456123789")
                .validateText("#mobile", "456123789");

        click(By.xpath("//*[@id=\"newAgreements-0\"]/div[2]/div/div/label"))
         .validatePresent(By.xpath("//*[@id=\"newAgreements-0\"]/div[2]/div/div/label"));
        click("#next")
                .validatePresent("#documentIDType1");
        setText("#documentIDNumber", "ADY215445")
                .validateText("#documentIDNumber", "ADY215445");
        setText("#documentIDExpirationDate", "12.02.2018")
                .validateText("#documentIDExpirationDate", "12.02.2018");
        setText("#birthPlace", "Reda")
                .validateText("#birthPlace", "Reda");
        setText("#motherMaidenName", "kowalska")
                .validateText("#motherMaidenName", "kowalska");
        setText("#city", "Reda")
                .validateText("#city", "Reda");
        setText("#street", "prosta")
                .validateText("#street", "prosta");
        setText("#streetNo", "1")
                .validateText("#streetNo", "1");
        setText("#flatNo", "5")
                .validateText("#flatNo", "5");
        click(By.xpath("//*[@id=\"_currentaccountapplicationportlet_WAR_currentaccountapplicationportlet_caaForm\"]/fieldset[4]/div[2]/div[1]/div[2]/div/label"));
        click("#next");

        // 5 sekund przerwy aby przyjrzec sie wynikowi testu
        Thread.sleep(5000);
    }


    @Test
    public void testNationalitySelect() throws Exception {

        selectOptionByValue("#nationalityPlaceOfLiving", "NAT_FOREIGN_ADDRESS_PL")
                .validateText("#nationalityPlaceOfLiving", "NAT_FOREIGN_ADDRESS_PL")
                .validatePresent("#nationality");
        selectOptionByText("#nationality", "angolskie")
                .validateText("#nationality", "AO");
        Thread.sleep(5000);


    }

    @Test
    public void testHoursSelectAndCheckboxes() throws Exception {
        click(By.xpath("//*[@id=\"benefits-agreements\"]/div/div[1]/div[2]/label"))
                .validatePresent(By.xpath("//*[@id=\"benefits-agreements\"]/div/div[1]/div[2]/label"));
        click(By.xpath("//*[@id=\"p-2\"]"))
                .validatePresent(By.xpath("//*[@id=\"p-2\"]"));
        click(By.xpath("//*[@id=\"newAgreements-0\"]/div[2]/div/div/div[1]/div/div[1]/div"))
                .validatePresent(By.xpath("//*[@id=\"newAgreements-0\"]/div[2]/div/div/div[1]/div/div[1]/div"));
        click(By.xpath("//*[@id=\"newAgreements-0\"]/div[2]/div/div/div[1]/div/div[2]/div/label"))
                .validatePresent(By.xpath("//*[@id=\"newAgreements-0\"]/div[2]/div/div/div[1]/div/div[2]/div/label"));
        selectOptionByValue("#contactHourFrom", "13:00")
                .validateText("#contactHourFrom", "13:00");
        selectOptionByValue("#contactHourTo", "15:00")
                .validateText("#contactHourTo", "15:00");

        Thread.sleep(5000);


    }

    @Test
    public void testForeignPerson() throws Exception {
        setText("#names", "ania")
                .validateText("#names", "ania");
        setText("#lastName", "nowak")
                .validateText("#lastName", "nowak");
        selectOptionByValue("#nationalityPlaceOfLiving", "NAT_FOREIGN_ADDRESS_PL")
                .validateText("#nationalityPlaceOfLiving", "NAT_FOREIGN_ADDRESS_PL");
        selectOptionByValue("#nationality", "AD")
                .validateText("#nationality", "AD");
        click(By.xpath("//*[@id=\"_currentaccountapplicationportlet_WAR_currentaccountapplicationportlet_caaForm\"]/fieldset[2]/div[2]/div[5]/div[2]/label"))
                .validatePresent(By.xpath("//*[@id=\"_currentaccountapplicationportlet_WAR_currentaccountapplicationportlet_caaForm\"]/fieldset[2]/div[2]/div[5]/div[2]/label"));
        setText("#birthday", "12.02.1995")
                .validateText("#birthday", "12.02.1995");
        click(By.xpath("//*[@id=\"_currentaccountapplicationportlet_WAR_currentaccountapplicationportlet_caaForm\"]/fieldset[2]/div[2]/div[8]/fieldset/div[2]/label[1]"))
                .validatePresent(By.xpath("//*[@id=\"_currentaccountapplicationportlet_WAR_currentaccountapplicationportlet_caaForm\"]/fieldset[2]/div[2]/div[8]/fieldset/div[2]/label[1]"));

        Thread.sleep(5000);

    }

}