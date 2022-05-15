import java.util.Scanner;
//java.util 패키지의 Scanner 클래스 호출

public class Visit2 {
    public static void main(String[] args){
        System.out.println("[인공지능 프로그램 V2]");
        System.out.println("=".repeat(30));

//        예측 알고리즘의 독립변수 a, b 값을 입력
        System.out.print("[System] a 값을 입력하여 주세요 : ");
        Scanner scan1 = new Scanner(System.in);
        int a = scan1.nextInt();

        System.out.print("[System] b 값을 입력하여 주세요 : ");
        Scanner scan2 = new Scanner(System.in);
        int b = scan2.nextInt();

        System.out.println("=".repeat(30) + "\n");


//        광고비 및 방문자 수 정의
        double[] arr = {580.0, 700.0, 810.0, 840.0}; // 광고비 배열
        double y; // 방문자 수
//        double로 정의한 이유는? 값을 넣을 때 f를 포함하지 않기 때문에 편리함
//        double은 8바이트까지 수를 표현하기 때문에 메모리 관점에서 더 안좋지 않을까?


        System.out.printf("[안내] 입력된 '광고비'는 다음과 같습니다.\n");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d 번째) %.1f원 ", i+1, arr[i]);
        }
        System.out.print("\n\n");
        System.out.println("[안내] AI의 '웹 페이지 방문자' 예측 결과는 다음과 같습니다.");

//       광고비 별로, 방문자 수를 예측한 결과 출력
        for (int i = 0; i < arr.length; i++) {
            y = a * arr[i] + b;
//            방문자 수 예측 알고리즘 : 웹페이지 방문자 수 = (2 * 광고비) + 1
            System.out.printf("%d 번째 예측) %.1f회 방문\n", i+1, y);
        }
    }
}