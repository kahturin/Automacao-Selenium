package br.com.alura.leilao.leiloes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class PageObject {
	
	protected WebDriver browser;
	
	public PageObject(WebDriver browser) {
		System.setProperty("webdriver.opera.driver", "C:\\WebDriver\\bin\\operadriver.exe");
		
		if(browser == null) {
			this.browser = new OperaDriver();
		} else {
			this.browser = browser;
		}
	}
	
	public void fechar() {
		this.browser.quit();		
	}
}
