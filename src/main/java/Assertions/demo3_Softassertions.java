//package Assertions;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import org.testng.asserts.SoftAssert;
//
//public class demo3_Softassertions {
//    // if any validation fails it will continue
//    //the rest of script and once scripts completes thenm it fails the test
//	
//	// it mean evne if single validation fails 
//    //script will be failed at last but execution will not stop
//   // do not forget to call assert() methd at last
//    
//	//soft assert use asserall
//	public void testsoft() {
//		SoftAssert assertion = new SoftAssert();//import or repair
//		System.out.println("test started");
//		assertion.assertEquals(12,13,"count does not match");
//		assertion.assertall();
//		System.out.println("test comp..");
//		
//		// test strt completes but fails due to cond
//
//	}
//
//	//hasrd ssert
//	public void testsoft2() {
//		
//		System.out.println("test started");
//		assert.assertEquals(12,13);
//		
//		System.out.println("test comp..");
//		//teststarted but fails due to cond
//	}
//}
//
