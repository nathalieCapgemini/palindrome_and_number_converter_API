package com.testcases.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	@Test
	public void TestIsPalindrome(){
		Service service = new Service();
		// Test for isPalindrome(int num)
		assert service.isPalindrome(121) == true;
		assert service.isPalindrome(10) == false;
		assert service.isPalindrome(1221) == true;
		assert service.isPalindrome(1234) == false;
		assert service.isPalindrome(12321) == true;

	}

	@Test
	public void TestRomanNumberToInteger(){
		Service service = new Service();
		// Test for romanNumberToInteger(String romanNumber)
		assert service.romanNumberToInteger("XIV") == 14;
		assert service.romanNumberToInteger("XX") == 20;
		assert service.romanNumberToInteger("III") == 3;
		assert service.romanNumberToInteger("IV") == 4;
		assert service.romanNumberToInteger("IX") == 9;
		assert service.romanNumberToInteger("LVIII") == 58;
		assert service.romanNumberToInteger("MCMXCIV") == 1994;
	}

}
