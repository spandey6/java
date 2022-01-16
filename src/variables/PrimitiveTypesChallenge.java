package variables;

public class PrimitiveTypesChallenge {
    public static void main(String[] args) {
        byte myByteNumber = 100;
        short myShortNumber = 3275;
        int myIntNumber = 214748377;
        long myLongNumber = 50000L + 10L *(myByteNumber+myShortNumber+myIntNumber);

        System.out.println("Long number = " + myLongNumber);
    }
}
