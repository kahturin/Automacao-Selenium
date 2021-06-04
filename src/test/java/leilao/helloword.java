package leilao;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class helloword {
	
	@Test
	public void hello() {
		System.setProperty("webdriver.opera.driver", "C:\\WebDriver\\bin\\operadriver.exe"); //informa o caminho do driver do navegador opera
		WebDriver browser = new OperaDriver(); //abre o navegador
		browser.navigate().to("http://localhost:8080/leiloes"); //navega até a pagina
		
	}
	
}
