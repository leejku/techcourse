import java.util.Scanner;
//util 패키지의 Scanner 클래스를 호출한다.

//구구단 예제 풀이
public class Timestable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        Scanner 객체 생성
//        클래스 객체 = new 클래스();
//        System.in은 사용자로부터 입력을 받기 위해서 사용하는 입력 스트림

        System.out.print("[안내]희망하는 구구단을 숫자로 입력해 주세요 (2 ~ 9) : ");

        int inputValue = scan.nextInt();
//        inputValue에 입력받은 값을 넣는다.
//        정수 타입으로 받기 위해, nextInt()를 사용한다.

        System.out.printf("%d단이 입력되었습니다.\n", inputValue);

        if (inputValue < 2 || inputValue > 9) {
//            inputValue가 2보다 작거나, 9보다 큰 경우
            System.out.println("[경고]구구단은 2단 ~ 9단 까지만 선택할 수 있습니다." +
                    "\n프로그램을 종료합니다.");
        }else{
//            inputValue가 2~9 사이인 경우 for문 수행
            for (int i = 1; i < 10 ; i++){
//                1부터 9까지 1씩 증가시키며
                System.out.printf("%d * %d = %d\n", inputValue, i, inputValue*i);
//                inputValue에 곱한다.
            }
        }
    }
}
