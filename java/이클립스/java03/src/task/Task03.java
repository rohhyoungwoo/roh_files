package task;

public class Task03 {
   public static void main(String[] args) {
      //int, long, double, float, boolean, char
//	   int num = 10;
//	   long num = 10L;
//	   double num = 3.14;
//	   float num = 3.14f;
//	   boolean num = true;
	   char num = 'a';
	   System.out.println((boolean) num);
	   
      //1. 정수(int) -> 모든 자료형 강제형변환 가능여부 확인
//    long result = Long.parseLong(num);
//	  double result2 = Double.parseDouble(num);
//      float result3 = Float.parseFloat(num);
//	   boolean result4 = Boolean.parseBoolean(num);
//	   char result5 = "abc".charAt(num);
	   
//      System.out.println((char) num);
//	  long, double, float 가능
	   
      //2. 정수(long) -> 모든 자료형 강제형변환 가능여부 확인
//	   int, double, float 가능
	   
	   //3. 실수(double) -> 모든 자료형 강제형변환 가능여부 확인
//	   int, double, float 가능
	   
      //4. 실수(float) -> 모든 자료형 강제형변환 가능여부 확인
//	   int, long, double 가능
	   
      //5. 논리형 (boolean) -> 모든 자료형 강제형변환 가능여부 확인
//      불가능
      //6. 문자형(char) -> 모든 자료형 강제형변환 가능여부 확인
//	   int, long, double, float 가능
   }
}
