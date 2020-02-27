package ch.juventus.javadoc;

import java.util.List;

public class MathUtils
{
    /**
     * The HelloWorld program implements an application that
     * simply displays "Hello World!" to the standard output.
     *
     * @author  Zara Ali
     * @version 1.0
     * @since   2014-03-31
     */
    public double addition(List<Double> numbers)
    {
        double tmpValue = 0;
        while(numbers.hasNext())
        {
            tmpValue += numbers.next();
        }
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
    public double  subtraction(double a, double b)
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

