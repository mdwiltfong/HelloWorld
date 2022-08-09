
public class HelloWorld {
    public static void main(String[] args) {
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntvalue= Integer.MAX_VALUE;
        System.out.println("Integer Minimum value = "+myMinIntValue);
        System.out.println("Integer Maximum value = "+myMaxIntvalue);
        System.out.println("Busted MAX value" + (myMaxIntvalue+1));
        System.out.println("Busted MIN value" + (myMinIntValue-1));

        byte myMinByteValue=Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte minimum value = " +myMinByteValue);
        System.out.println("Byte maximum value = " +myMaxByteValue);
        short myMinShortValue=Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short minimum value = " +myMinShortValue);
        System.out.println("Short maximum value = " +myMaxShortValue);

        long myLongValue=100l;
        Long myMinLongValue=Long.MIN_VALUE;
        Long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long minimum value = " +myMinLongValue);
        System.out.println("Long maximum value = " +myMaxLongValue);

        int myTotal = (myMinIntValue/2);
        byte myNewByteValue = (byte) (myMinByteValue/2);
        short myNewShortValue = (short) (myMinShortValue/2);


    }
}
