//CLASSE DE TESTE
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class ListarUsuario extends Hooks{
	
	UserPage up = new UserPage();
	DeletarUsuario du = new DeletarUsuario();
	BotoesPage bp = new BotoesPage();
	
	@Test
	public void listarUsuarioComSucesso() {
		up.clicarBotaoFormulario();
		up.clicarBotaoListaUsuarios();
		du.clicarLixeira();	
		String elementText = browser.findElement(By.id("notice")).getText();
		Assert.assertEquals("Seu Usuário foi removido com sucesso!", elementText);
	
	}
	
	@Test
	public void clicarNoBotao() {
		bp.clicarBuscaElementos();
		String clicou = browser.findElement(By.xpath("//*[@id=\'div1\']/h5")).getText();
		Assert.assertEquals("Você Clicou no Botão!", clicou);

	}
}