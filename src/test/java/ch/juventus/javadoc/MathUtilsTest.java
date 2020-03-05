package ch.juventus.javadoc;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import ch.juventus.javadoc.MathUtils;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {

    private final MathUtils mathUtil = new MathUtils();

    @Test
    public void testSubstraction(){
        assertEquals(5, mathUtil.substraction(9, 4));
    }

    @Test
    public void testDivision(){
        assertEquals(2.5, mathUtil.division(10, 4));
    }

    @Test
    public void testMultiply(){
        assertEquals(36, mathUtil.multiplication(9, 4));
    }

    @Test
    public void testAddition(){
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(0d);
        numbers.add(1d);
        numbers.add(2d);
        numbers.add(3d);
        numbers.add(4d);

        assertEquals(10, mathUtil.addition(numbers));
    }
}
