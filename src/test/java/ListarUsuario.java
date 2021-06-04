//CLASSE DE TESTE
import org.junit.Test;

public class ListarUsuario extends Hooks{
	
	UserPage up = new UserPage();
	DeletarUsuario du = new DeletarUsuario();
	BotoesPage bp = new BotoesPage();
	
	@Test
	public void listarUsuarioComSucesso() {
		up.clicarBotaoFormulario();
		up.clicarBotaoListaUsuarios();
		du.clicarLixeira();		
	}
	
	@Test
	public void clicarNoBotao() {
		bp.clicarBuscaElementos();
	}
}