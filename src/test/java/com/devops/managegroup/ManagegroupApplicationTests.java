package com.devops.managegroup;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ManagegroupApplicationTests {

	Calculator cal = new Calculator();
	@Test
	void itShouldBeNumbers() {
		//given
		int numberOne = 10;
		int numberTwo = 25;

		//When
		int result = cal.add(numberOne, numberTwo);
		//Then
		assertThat(result).isEqualTo(35);
	}

	class Calculator{
		int add(int a, int b){
			return a + b;
		}

	}

}
