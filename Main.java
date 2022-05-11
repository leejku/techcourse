import java.util.Scanner;
//Scanner를 사용하기 위해서는 자바 util 클래스에서 import 해야 함

public class Main {
    public static void main(String[] args) {

        System.out.print("사용량을 입력하세요 : ");

//        1. Scanner를 이용해서 전력 사용량을 input 으로 받는다.
        Scanner scan = new Scanner(System.in);

//        2. 사용량을 정수형태로 정의하고 Scanner를 통해서 받은 값을 넣는다.
        int using = scan.nextInt();

//        3. 총 요금은 0원으로 초기화 한다.
        int totalCharge = 0;

//        4.사용량이 500kWh를 초과한 경우, 초과분에 대해서만 전력량 요금을 계산한다.
        if (using > 500) {
            totalCharge += (using - 500)*670.6;
            using = 500;
        }

//        5. 사용량이 400kWh를 초과한 경우, 초과분에 대해서만 전력량 요금을 계산한다.
        if (using > 400) {
            totalCharge += (using - 400)*417.7;
            using = 400;
        }

//        6. 사용량이 300kWh를 초과한 경우, 초과분에 대해서만 전력량 요금을 계산한다.
        if (using > 300) {
            totalCharge += (using - 300)*280.6;
            using = 300;
        }

//        7. 사용량이 200kWh를 초과한 경우, 초과분에 대해서만 전력량 요금을 계산한다.
        if (using > 200) {
            totalCharge += (using - 200)*187.9;
            using = 200;
        }

//        8. 사용량이 100kWh를 초과한 경우, 초과분에 대해서만 전력량 요금을 계산한다.
        if (using > 100) {
            totalCharge += (using - 100)*125.9;
            using = 100;
        }

//        9. 사용량이 100kWh를 초과한 경우, 초과분에 대해서만 전력량 요금을 계산한다.
        if (using <= 100) {
            totalCharge += using*60.7;
        }
        System.out.println("총 요금 : " + totalCharge);
    }
}
