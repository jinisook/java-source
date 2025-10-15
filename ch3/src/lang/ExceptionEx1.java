package lang;

// Throwable - Exception, Error 부모
// Exception(예외) 클래스
// - 종류
//  1) 컴파일 예외 : ClassNotFoundException -> 실행안하고 작성 중 알 수 있음
//  2) 런타임 예외 : ArithmeticException -> 실행해야 알 수 있음
// - 처리 방법
//  1) 예외 처리 : try {} catch {} 
//  2) 예외 던지기 : throws ClassNotFoundException
// Error 클래스

public class ExceptionEx1 {
    public static void main(String[] args) {
        System.out.println(4 / 0); // java.lang.ArithmeticException: / by zero

        // Class.forName("null"); : ClassNotFoundException 컴파일 예외
        try {
            // 예외가 발생할 수 있는 코드를 try 안에 작성
            Class.forName("null");
        } catch (ClassNotFoundException e) {
            e.printStackTrace(); // 개발자 확인용(예외발생이 어디서 났는지 추적)
        }
    }

}
