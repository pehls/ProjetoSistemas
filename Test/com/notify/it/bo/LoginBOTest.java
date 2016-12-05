package com.notify.it.bo;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.notify.it.exceptions.ValidacaoLoginException;
import com.notify.it.managedbean.LoginMB;
import com.notify.it.model.Login;
import com.notify.it.rules.LocaleRule;
import com.notify.it.util.ItensEstaticos;
import com.notify.it.util.JpaUtil;

@RunWith(Parameterized.class)
public class LoginBOTest {

	@Rule
	public LocaleRule localeRule = new LocaleRule();

	@Mock
	JpaUtil jpa = ItensEstaticos.getJpautil();
	
	private LoginBO loginBO;

	@Before
	public void setUp() {
		loginBO = new LoginBO();
	}

	private static Login loginEsperadoJoao = new Login("Joao", "123"); 
	private static Login loginEsperadojoao = new Login("joao", "123");
	private static Login loginEsperadoMaria = new Login("Maria", "abc123");
	private static Login loginEsperadomaria = new Login("maria", "abC123");
	
	@Parameters(name = "Teste nro {index} : procurando por usuário {0} com senha {1}")
	public static Collection<?> getCasosTeste() {
		return Arrays
				.asList(new Object[][] { 
					{ "Joao", "123", loginEsperadoJoao}, 
					{ "joao", "123",  loginEsperadojoao},
					{ "Maria", "abc123", loginEsperadoMaria}, 
					{ "maria", "abC123", loginEsperadomaria} 
					});
	}

	// Parameter(0)
	public String user;

	// Parameter(1)
	public String password;

	// Parameter(2)
	private static Login loginEsperado ;

	public LoginBOTest(String user, String password, Login loginEsperado) {
		super();
		this.user = user;
		this.password = password;
		this.loginEsperado = loginEsperado;
	}

	@Test
	public void testGetLoginValido() throws ValidacaoLoginException {
		List<Login> result = new ArrayList<Login>() ;
		result.add(loginEsperadoJoao);
		result.add(loginEsperadojoao);
		result.add(loginEsperadoMaria);
		result.add(loginEsperadomaria);
		Mockito.when(jpa.buscarQuery("login.byUser", this.user)).thenReturn(result);
		
		assertThat(loginBO.getLogin(user, password), equalTo(LoginBOTest.loginEsperado));
	}

	

}
