import java.util.Scanner;
//java.util 패키지의 Scanner 클래스 호출

public class Visit1 {
    public static void main(String[] args){
        System.out.println("[인공지능 프로그램 V1]");
        System.out.println("=".repeat(30));
        System.out.print("[System] 예측에 영향을 주는 원인(광고비)의 값을 알려주세요 (단위 원) : ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.printf("[안내] 입력된 광고비는 %d원 입니다. \n", x);

        int y = 2*x + 1;
//        방문자 수 예측 알고리즘 : 웹페이지 방문자 수 = (2 * 광고비) + 1
        System.out.printf("[안내] AI의 예측(클릭 수)은  %d회 입니다.\n", y);
    }
}
