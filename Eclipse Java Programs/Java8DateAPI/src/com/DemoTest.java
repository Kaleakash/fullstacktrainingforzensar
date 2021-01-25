package com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DemoTest {

	public static void main(String[] args) {
		//LocalDate ld1 = LocalDate.now();
		//System.out.println(ld1);
		//LocalTime lt1 = LocalTime.now();
		//System.out.println(lt1);
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt.of(2022, 12, 22, 7, 30));
							
	}

}
