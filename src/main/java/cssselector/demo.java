package cssselector;

public class demo {
public static void main(String[] args) {
	// css Seclectors are faster compare to xpath
	// css will not change with browser in xpath it will 

	// symbols used while writting css selector in selenium webdriver
	// using id -- use # symbol
	// classname -- use .symbol
	// attribute -- tagname[attribute='value']
	// using multiple attribute -- tagname[attribute='value'][attribute2='value2']
	// conatins -- *symbol
	// starts with -- ^symbol
	// Endswith --$symbol
	
//eg 1 input[id='user_login']
//eg 2 input[class='input'][name='pwd']
//eg 3 input#user_login // for id
//eg 4 input.button-primary // for class
//eg 5 input[id*='login']   //contains
//eg 6 id=customer345	
//eg 7 id=customer345	
//eg 8 id=customer345	
//eg 9 input[id^='user']
//eg 9 input[id^='user'][name='log']
//eg 10 input[id$='login']	
//eg 10 input[id$='pass']	

}
}
