package com.JavaUnit5.Unit5;

import static org.junit.Assert.*;



import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
class ParameterizedTest {
    private String input;
    private boolean expectedOutput;
    balancedBrackets bb = new balancedBrackets();

    public ParameterizedTest(String input, boolean expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameterized.Parameters
            public  static Collection<Object[]> testConditions() {
        String balancedParens = "(1)";
        String tooManyOpenParens = "((1";
        String tooManyOpenParens1 = "(1)(";
        String tooManyClosedParens = "(1))";
        String startClosedParens = ")(";
        String emptyString = "";
        String balancedAngleBrackets = "<<>>";
        String mismatchedBrackets = "<({)}>";
        String balancedComboBrackets ="<({})>" ;

        Object[][] expectedOutputs = {
                { balancedParens, true },
                { balancedAngleBrackets, true },
                { balancedComboBrackets, true },
                { emptyString, true },
                { tooManyOpenParens, false },
                { tooManyOpenParens1, false },
                { tooManyClosedParens, false },
                { startClosedParens, false },
                { mismatchedBrackets, false }
        };

        return Arrays.asList(expectedOutputs);


    }




    @Test
    public void testBalancedBrackets() {
        assertEquals(expectedOutput, balancedBrackets.balancedBrackets(input));
    }
}
