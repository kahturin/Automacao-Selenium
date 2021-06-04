package br.com.alura.leilao.leiloes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.leilao.login.LoginPage;

public class LeiloesTest {

	private LeiloesPage paginaLeiloes;
	private CadastroLeilaoPage paginaDeCadastro;
		
	@BeforeEach
	public void beforeEach() {
		LoginPage paginLoginPage = new LoginPage();
		paginLoginPage.preencheFormularioLogin("fulano", "pass");
		this.paginaLeiloes = paginLoginPage.submeteFormulario();
		this.paginaDeCadastro = paginaLeiloes.carregarFormulario();

	}
		
	@AfterEach
	public void afterEach() {
		this.paginaLeiloes.fechar();
	}
	
	@Test
	public void deveriaCadastrarLeilao() {
		String hoje = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		String nome = "Leilão do dia " + hoje;
		String valor = "500.00";
		
		this.paginaLeiloes = paginaDeCadastro.cadastrarLeilao(nome, valor, hoje);
		Assert.assertTrue(paginaLeiloes.isLeilaoCadastrado(nome, valor, hoje));
	}
	
	@Test
	public void validarCadastroDeLeilao() {
		this.paginaLeiloes = paginaDeCadastro.cadastrarLeilao("", "", "");
		Assert.assertTrue(this.paginaLeiloes.isPaginaAtual());
		Assert.assertTrue(this.paginaDeCadastro.isMensagensDeValidacaoVisiveis());

	}
}
