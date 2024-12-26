package com.ashishrai.design_patterns.behavioral.interpretor.roman;

import java.util.List;

public class RomanInterpreter {

    private List<RomanExpression> rules;

    public RomanInterpreter() {
        this.rules = RomanRuleProvider.getRomanRules();
    }

    public int interpret(String input) {
        int total = 0;

        while (!input.isEmpty()) {
            boolean matched = false;

            // Iterate over the rules to find a match for the current input
            for (RomanExpression rule : rules) {
                System.out.println(rule.toString()); // Logs the Roman expression being evaluated
                int value = rule.interpret(input);
                if (value > 0) {
                    total += value;
                    input = input.substring(rule.getSymbol().length()); // Update the input string after a match
                    matched = true;
                    break; // Exit the loop since we've matched a Roman numeral
                }
            }

            if (!matched) {
                throw new IllegalArgumentException("Invalid Roman numeral sequence: " + input);
            }
        }

        return total;
    }
}
