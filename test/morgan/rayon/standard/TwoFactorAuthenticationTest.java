package morgan.rayon.standard;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import morgan.rayon.prodInterface.DbAuthenticate;

public class TwoFactorAuthenticationTest {
	
	TwoFactorAuthentication twofactorauthentication; 
	
	@Before 
	public void ExecuteBefore()
	{
		twofactorauthentication = new TwoFactorAuthentication(); 
		
		//creating mocking implementation for DBAuthenticate
		//DbAuthenticateInterface dbauthenticate = mock(DbAuthenticateInterface.class);
	}

	/**
	 * <h2>Execute test to validate generated code is of length 4 </h2>
	 * <p> </p>
	 */
	@Test
	public void testGenerateCode_sizeFour() {
		
		 int test_size = 4;
		 assertEquals(test_size, twofactorauthentication.generateCode(test_size).length() );
	}
	
	@Test
	public void testGenerateCode_alphanumeric_sizeFour()
	{
		int test_size = 4;
		String result = twofactorauthentication.generateCode(test_size);
		boolean isvalid = result.matches("^[^A-Za-z0-9]+$");		 
		assertFalse(isvalid);		
		
	}

}
