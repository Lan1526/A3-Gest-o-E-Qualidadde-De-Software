package pages;

import org.example.CadastrarDespesas;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;



public class ListarDespesas extends BasePage {



    @FindBy(id="basefísica1")
    private WebElement basefísica1;

    @FindBy(id="mes1")
    private WebElement mes1;


    @FindBy(id="credor1")
    private WebElement credor1;

    @FindBy(id="despesa1")
    private WebElement despesa1;

    @FindBy(id="valor1")
    private WebElement valor1;

    @FindBy(id="vencimento1")
    private WebElement vencimento1;

    @FindBy(id="credor2")
    private WebElement credor2;

    @FindBy(id="despesa2")
    private WebElement despesa2;

    @FindBy(id="valor2")
    private WebElement valor2;

    @FindBy(id="vencimento2")
    private WebElement vencimento2;

    @FindBy(id="credor3")
    private WebElement credor3;

    @FindBy(id="despesa3")
    private WebElement despesa3;

    @FindBy(id="valor3")
    private WebElement valor3;

    @FindBy(id="vencimento3")
    private WebElement vencimento3;


    public ListarDespesas informarBaseFísica1(String basefísica){
   basefísica1.sendKeys(basefísica);
        return this;
    }


    public ListarDespesas informarMes1(String mes){
        mes1.sendKeys(mes);
        return this;
    }

    public ListarDespesas informarCredor1(String credor){
        credor1.sendKeys(credor);
        return this;
    }
    public ListarDespesas informarDespesa1(String despesa){
        despesa1.sendKeys(despesa);
        return this;
    }
    public ListarDespesas informarValor1(String valor){
        valor1.sendKeys(valor);
        return this;
    }
    public ListarDespesas informarVencimento1(String vencimento){
        vencimento1.sendKeys(vencimento);
        return this;
    }

    public ListarDespesas informarCredor2(String credor){
        credor2.sendKeys(credor);
        return this;
    }
    public ListarDespesas informarDespesa2(String despesa){
        despesa2.sendKeys(despesa);
        return this;
    }
    public ListarDespesas informarValor2(String valor){
        valor2.sendKeys(valor);
        return this;
    }
    public ListarDespesas informarVencimento2(String vencimento){
        vencimento2.sendKeys(vencimento);
        return this;
    }

    public ListarDespesas informarCredor3(String credor){
        credor3.sendKeys(credor);
        return this;
    }
    public ListarDespesas informarDespesa3(String despesa){
        despesa3.sendKeys(despesa);
        return this;
    }
    public ListarDespesas informarValor3(String valor){
        valor3.sendKeys(valor);
        return this;
    }
    public ListarDespesas informarVencimento3(String vencimento){
        vencimento3.sendKeys(vencimento);
        return this;
    }


    public ListarDespesas(WebDriver driver){
        super(driver);
    }
    public String resultadoLista(){
        return driver.getPageSource();
    }









}
