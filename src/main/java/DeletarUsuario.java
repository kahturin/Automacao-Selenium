import org.junit.Assert;
import org.openqa.selenium.By;

public class DeletarUsuario extends HomePage {
	
	public void clicarLixeira() {
		
		browser.getCurrentUrl().equals("https://automacaocombatista.herokuapp.com/users");
		browser.findElement(By.linkText("delete")).click();
		browser.switchTo().alert().accept();
		String elementText = browser.findElement(By.id("notice")).getText();
		Assert.assertEquals("Seu Usu�rio foi removido com sucesso!", elementText);
	}
}
