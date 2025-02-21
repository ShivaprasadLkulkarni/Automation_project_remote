package Assertions;

import org.testng.asserts.SoftAssert;

public class demo3_Softassertions {
    // if any validation fails it will continue
    //the rest of script and once scripts completes thenm it fails the test
	
	// it mean evne if single validation fails 
    //script will be failed at last but execution will not stop
   // do not forget to call assert() methd at last
    
	public void testsoft() {
		SoftAssert assertion = new SoftAssert();
	}

}

