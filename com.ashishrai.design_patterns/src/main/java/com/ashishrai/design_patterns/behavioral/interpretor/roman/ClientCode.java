package com.ashishrai.design_patterns.behavioral.interpretor.roman;

public class ClientCode {

	public static void main(String[] args) {

        // Create the interpreter with the provided rules
        RomanInterpreter interpreter = new RomanInterpreter();

        // Input Roman numeral
        String roman = "MCMXCIV";

        // Interpret and print the result
        int result = interpreter.interpret(roman);
        System.out.println("Roman numeral " + roman + " is " + result);
	}

}
