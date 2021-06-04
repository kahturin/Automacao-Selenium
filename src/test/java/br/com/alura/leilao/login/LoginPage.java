package br.com.alura.leilao.login;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

import br.com.alura.leilao.leiloes.LeiloesPage;
import br.com.alura.leilao.leiloes.PageObject;

public class LoginPage extends PageObject {
	
	private static final String URL_LOGIN = "http://localhost:8080/login";
	
	public LoginPage() {
		super(null);
		this.browser.navigate().to(URL_LOGIN);
	}

	public void preencheFormularioLogin(String username, String password) {
		browser.findElement(By.id("username")).sendKeys(username);
		browser.findElement(By.id("password")).sendKeys(password);
		
	}

	public LeiloesPage submeteFormulario() {
		browser.findElement(By.id("login-form")).submit();
		return new LeiloesPage(browser);
		
	}

	public boolean isPaginaDeLogin() {
		return browser.getCurrentUrl().equals(URL_LOGIN);
	}

	public Object NomeDousuarioEstaLogado() {
		try {
			return browser.findElement(By.id("usuarioLogado")).getText();
		} catch (NoSuchElementException e) {
			return null;
		}
	}

	public void navegaPaginaLeiloes() {
		browser.getCurrentUrl().equals("http://localhost:8080/leiloes/2");
	}

	public boolean contemTexto(String texto) {
		return browser.getPageSource().contains(texto);
	}

	public boolean isPaginaDeLoginComDadosInvalidos() {
		return browser.getCurrentUrl().equals(URL_LOGIN + "?error");
	}


}
