import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class HomePage {
	
	protected static final String URL = "https://automacaocombatista.herokuapp.com/treinamento/home";
	public static WebDriver browser;
	
	public void iniciarNavegador() {
		System.setProperty("webdriver.chrome.driver", "C:/WebDriver/bin/operadriver.exe");
		OperaOptions opera = new OperaOptions();
		opera.addArguments("--start-maximized");
		
		browser = new OperaDriver(opera);
		browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //aguarda carregar completamente quando não acha nenhum elemento.
		browser.get(URL);
	}
	
	public void finalizarNavegador() {
		browser.quit();
	}
}
