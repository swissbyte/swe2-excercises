package ch.juventus.javadoc;

import java.util.List;

/**
 *
 * @author C. Hediger
 * @version 1.0
 * @since 27.02.2020
 */
public class MathUtils
{
    /**
     * This method adds all the given numbers to a total
     *
     * @param numbers a list, containing all numbers
     * @return The sum of all given numbers
     */
    public double addition(List<Double> numbers)
    {
        double tmpValue = numbers.stream().mapToDouble(number -> number).sum();

        return tmpValue;
    }

    /**
     * The HelloWorld program implements an application that
     * simply displays "Hello World!" to the standard output.
     *
     * @author  Zara Ali
     * @version 1.0
     * @since   2014-03-31
     */
    public double  substraction(double a, double b)
    {
        return a - b;
    }

    /**
     * The HelloWorld program implements an application that
     * simply displays "Hello World!" to the standard output.
     *
     * @author  Zara Ali
     * @version 1.0
     * @since   2014-03-31
     */
    public double division(double a, double b)
    {
        return a / b;
    }

    /**
     * The HelloWorld program implements an application that
     * simply displays "Hello World!" to the standard output.
     *
     * @author  Zara Ali
     * @version 1.0
     * @since   2014-03-31
     */
    public double multiplication(double a, double b)
    {
        return a * b;
    }
    
    
}

