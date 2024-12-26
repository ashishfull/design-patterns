package com.ashishrai.design_patterns.behavioral.interpretor.roman;

import java.util.Arrays;
import java.util.List;

public class RomanRuleProvider {

    public static List<RomanExpression> getRomanRules() {
        return Arrays.asList(
            new RomanExpression("M", 1000),
            new RomanExpression("CM", 900),
            new RomanExpression("D", 500),
            new RomanExpression("CD", 400),
            new RomanExpression("C", 100),
            new RomanExpression("XC", 90),
            new RomanExpression("L", 50),
            new RomanExpression("XL", 40),
            new RomanExpression("X", 10),
            new RomanExpression("IX", 9),
            new RomanExpression("V", 5),
            new RomanExpression("IV", 4),
            new RomanExpression("I", 1)
        );
    }}
