package com.ashishrai.design_patterns.behavioral.interpretor.roman;

public class RomanExpression {

	private final String symbol;
	private final int value;

	public RomanExpression(String symbol, int value) {
		this.symbol = symbol;
		this.value = value;
	}

	public String getSymbol() {
		return symbol;
	}

	// @Override
	public int interpret(String input) {
		//System.out.println(symbol);
		if (input.startsWith(symbol)) {
			//System.out.println(value);
			return value;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "RomanExpression [symbol=" + symbol + ", value=" + value + "]";
	}

}
