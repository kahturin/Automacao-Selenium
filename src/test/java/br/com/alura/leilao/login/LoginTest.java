package br.com.alura.leilao.login;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class LoginTest {

	private LoginPage paginaLogin;
	
	@BeforeEach
	public void beforeEach() {
		this.paginaLogin = new LoginPage();
	}
	
	@AfterEach
	public void afterEach() {
		this.paginaLogin.fechar();
	}

	@Test
	public void deveriaEfetuarLoginComDadosValidos() {
		paginaLogin.preencheFormularioLogin("fulano", "pass");
		paginaLogin.submeteFormulario();
		
		//String nomeUsuarioLogado = browser.findElement(By.id("usuarioLogado")).getText();
		Assert.assertFalse(paginaLogin.isPaginaDeLogin());
		Assert.assertEquals("fulano", paginaLogin.NomeDousuarioEstaLogado());
	}

	@Test
	public void naoDeveriaEfetuarLoginComDadosInvalidos() {
		paginaLogin.preencheFormularioLogin("invalid", "errorpass");
		paginaLogin.submeteFormulario();
		
		Assert.assertTrue(paginaLogin.isPaginaDeLoginComDadosInvalidos());
		Assert.assertNull(paginaLogin.NomeDousuarioEstaLogado());
		Assert.assertTrue(paginaLogin.contemTexto("Usuário e senha inválidos."));
//		Assert.assertThrows(NoSuchElementException.class, () -> browser.findElement(By.id("usuarioLogado")));
//		Assert.assertTrue(browser.getCurrentUrl().contains(URL_LOGIN));
//		Assert.assertTrue(browser.getPageSource().contains("Usuário e senha inválidos"));
	}
	
	@Test
	public void naoDeveriaLogarseNaPaginaRestrita() {
		paginaLogin.navegaPaginaLeiloes();
		Assert.assertTrue(paginaLogin.isPaginaDeLogin()); //browser.getCurrentUrl().equals("http://localhost:8080/login")
		Assert.assertFalse(paginaLogin.contemTexto("Dados do Leilão"));
	}

}

