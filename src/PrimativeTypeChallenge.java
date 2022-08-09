/*
Goal:
- create a byte variable and set it to any byte number
- create a short variable and set it to any short number
- create an int variable and set it to any valid int number
- create a long variable and set it to 50000 plus 10 times the sum of the byte
variable plus the short variable and the integer variable
 */

public class PrimativeTypeChallenge {
    public static void main(String[] args) {
        byte myByte= 10;
        short myShort = 20;
        int myInt= 50;
        long myLong= (50000+10*(myByte+myInt+myShort));
        System.out.println((myLong));
    }
}
