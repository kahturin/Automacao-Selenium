//HOOKS DOS EXERCICIOS

import org.junit.After;
import org.junit.Before;

public class Hooks extends HomePage{
	
	HomePage hp = new HomePage();
	
	@Before
	public void before(){
		hp.iniciarNavegador();
	}
	
	@After
	public void after() {
		hp.finalizarNavegador();
	}
}