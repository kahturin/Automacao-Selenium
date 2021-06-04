//EXERICIO LISTAS USUARIOS
import org.openqa.selenium.By;

public class UserPage extends HomePage{
	
	public void clicarBotaoFormulario() {
		browser.findElement(By.className("collapsible-header")).click();
	}
	
	public void clicarBotaoListaUsuarios() {
		browser.findElement(By.linkText("Lista de Usuários")).click();
	}
	
	
	
	

}