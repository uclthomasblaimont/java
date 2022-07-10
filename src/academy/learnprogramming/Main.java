package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);

        short shortTotal = (short) (1000 + 10 *
                (byteValue + shortValue + intValue));

        float myMinFloatValue=Float.MIN_VALUE;
        float myMaxFloatValue=Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);
        
        double myMindoubleValue=Double.MIN_VALUE;
        double myMaxdoubleValue=Double.MAX_VALUE;
        System.out.println("double minimum value = " + myMindoubleValue);
        System.out.println("double maximum value = " + myMaxdoubleValue);

        float myFloatValue= (float) 5.25;


        double numberOfPounds = 200d;
        double converterKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converter kilograms= "+ converterKilograms +" kg");


        double pi= 3.1415927d;
        double anotherNumber = 3_000_000.4_567_8901d;
        System.out.println(pi);
        System.out.println(anotherNumber);
        
    }
}


