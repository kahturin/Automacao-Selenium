//EXERCICIO CLICAR NOS BOT�ES

import org.junit.Assert;
import org.openqa.selenium.By;

public class BotoesPage extends HomePage{
	
	public void clicarBuscaElementos() {
		browser.findElement(By.xpath("/html/body/div[2]/div[1]/ul/li[2]/a")).click();
		browser.findElement(By.linkText("Bot�es")).click();
		browser.getCurrentUrl().equals("https://automacaocombatista.herokuapp.com/buscaelementos/botoes");
		browser.findElement(By.id("teste")).click();
		
	}
	
	
	
	
}
