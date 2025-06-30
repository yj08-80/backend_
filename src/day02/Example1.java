package day02; // 패키지명

public class Example1 { // class start
    public static void main(String[] args) {

        // (변수)타입변환 , 캐스팅 , *다형성*(하나의 자료가 여러 개 타입으로 변환이 가능하다)
        // 1.자동 타입변환 (묵시적)
        //  byte -> short/char -> int -> long -> float -> double
        // (1) 메모리 크기가 작은 것에서 큰 것으로 변환 가능
        // (2) 데이터의 손실이 적다
        byte byteValue = 10;
        short shortValue = byteValue; // byte -> short 가능!
        int intValue = shortValue; // short -> int 가능!
        long longValue = intValue; // int -> long 가능!
        float floatValue = longValue; // long -> float 가능!
        double doubleValue = floatValue; // float -> double 가능! , 10 자료를 double 타입으로 분류

        // 2.강제 타입변환 (명시적)
        // double -> float -> long -> int -> short/char -> byte
        //(1) 메모리 크기기ㅏ 큰 것에서 작은 것으로 변환 가능
        //(2) 데이터의 손실이 크다
        //(3) (변환할 타입명)변수명;
        double dvalue = 3.14;
        //float fvalue = dvalue; xx
        float fvalue = (float) dvalue; // double -> float 강제 가능!
        long lvalue = (long) fvalue;  // float -> long 강제 가능!  손실 발생 3.14 -> 3
        int ivalue = (int) lvalue; // long -> int 강제 가능!
        short svalue = (short) ivalue; // int -> short 강제 가능!
        byte bvalue = (byte) svalue; // short -> byte 강제 가능!

        // 3.연산 타입변환
        byte b1 = 10;
        byte b2 = 20;
        short s1 = 30;
        int i1 = 40;
        float f1 = 3.14f;
        double d1 = 41.25;
        long l1 = 50L;

        // byte + byte = int
        // byte + short = int
        // 1. int 이하 연산은 모두 결과가 int이다.
        // 2. 연산결과는 두 개 항 중에 더 큰 항으로 자동 타입변환
        int result = b1 + b2;
        int result2 = b1 + s1;
        int result3 = i1 + i1;
        long result4 = i1 +l1;      // int + long -> long
        float result5 = i1 + f1;    // int + float -> float
        double result6 = i1 + d1;   // int + double -> double

    }
} //class end
