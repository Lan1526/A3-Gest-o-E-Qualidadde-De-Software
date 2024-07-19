import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ListarDespesas;

public class listarTeste extends BaseTest {

    @Test
    public void validarlista(){
        ListarDespesas page=new ListarDespesas(getDriver());
        String resultadoFinal=page.informarBaseFísica1("POA").informarMes1("JANEIRO").informarCredor1("CEEE").informarDespesa1("ENERGIA ELÉTRICA ").informarValor1("180").informarVencimento1("12/12/2024").resultadoLista();

        Assert.assertTrue(resultadoFinal.contains("POA"));
        Assert.assertTrue(resultadoFinal.contains("CEEE"));
        Assert.assertTrue(resultadoFinal.contains("ENERGIA ELÉTRICA "));
        Assert.assertTrue(resultadoFinal.contains("180"));
        Assert.assertTrue(resultadoFinal.contains("12/12/2024"));
        Assert.assertTrue(resultadoFinal.contains("JANEIRO"));
    }
}
