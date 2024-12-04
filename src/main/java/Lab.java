
/**
 * In order to make our programs even more impressive and interactive, we need to learn how to better leverage
 * boolean expressions. This will allow our programs to follow their own logic. For this example, you should look into
 * the different operators for basic boolean expressions.
 * 
 * More resources: https://www.freejavaguide.com/boolean_operators.htm
 * 
 * NOTE: All of these problems can be solved with one line with boolean operators - eg, 'return !b;'
 */
public class Lab {
    /**
     * @param b a true/false value.
     * @return if b is true, return true. if b is false, return false.
     */
    public boolean returnBoolean(boolean b){
        return b;
    }

    /**
     * @param b a true/false value.
     * @return if b is true, return false. if b is false, return true.
     * look into boolean operations to do this without using if/else statements.
     */
    public boolean returnNot(boolean b){
        return (!b);
    }

    /**
     * @param b1 a true/false value.
     * @param b2 a true/false value.
     * @return true if both b1 and b2 are true. false otherwise.
     * look into boolean operations to do this without using if/else statements.
     */
    public boolean returnAnd(boolean b1, boolean b2){
        // using bitwise AND & operator as it will compare both b1 and b2 values
        return (b1 & b2);
    }

    /**
     * @param b1 a true/false value.
     * @param b2 a true/false value.
     * @return true if either b1 or b2 are true. false if both are false.
     * look into boolean operations to do this without using if/else statements.
     */
    public boolean returnOr(boolean b1, boolean b2){
        // once again using bitwise OR | operator over logical OR as bitwise will look at both b1 and b2 (logical will halt if b1 is false & not check other)
        return (b1 | b2);
    }


}
