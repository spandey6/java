package variables;

public class ByteShortInt {
    public static void main(String[] args) {
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer min value = " + myMaxIntValue);
        System.out.println("Integer maz value = " + myMaxIntValue);
        System.out.println("Busted Max value = " + (myMaxIntValue + 1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte min value = " + myMinByteValue);
        System.out.println("Byte Max value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short min value = " + myMinShortValue);
        System.out.println("Short Max value = " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long min value = " + myMinLongValue);
        System.out.println("Long Max value = " + myMaxLongValue);

        //casting

        byte myNewByteValue = (byte) (myMinByteValue/2);
        short myNewShortValue = (short) (myMaxShortValue/2);
        System.out.println("New Byte value = " + myNewByteValue);
        System.out.println("New Short Value = " + myNewShortValue);

    }
}
