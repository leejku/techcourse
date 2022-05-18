import java.util.Scanner;
import java.util.InputMismatchException;


public class Kiosk {
    public static void main(String[] args){

        String[][] menu = {{"김밥", "1000"}, {"계란 김밥", "1500"}, {"충무 김밥", "1000"}, {"떡볶이", "2000"}};

        System.out.println(
                "[안내]안녕하세요. 김밥천국에 오신 것을 환영합니다.\n" +
                "------------------------------\n"
        );


        System.out.println(
                "[안내]메뉴에 포함된 번호를 입력하여 주세요.\n\n" +
                "[안내]원하시는 메뉴의 번호를 입력하여 주세요.\n" +
                "1) 김밥(1000원) 2) 계란 김밥(1500원) 3) 충무 김밥(1000원) 4) 떡볶이(2000원)"
        );

//        try catch 로 예외처리 연습
//        Scanner scan = new Scanner(System.in);
//        int num = 0;
//
//        try{
//            num = scan.nextInt();
//            System.out.print(menu[num-1][1]);
//            System.out.println("[안내]원하시는 메뉴의 번호를 입력하여 주세요.\n" +
//                    "1) 김밥(1000원) 2) 계란 김밥(1500원) 3) 충무 김밥(1000원) 4) 떡볶이(2000원)");
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("[안내]메뉴에 포함된 번호를 입력하여 주세요.\n\n");
//        }



        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        while(num -1 < 0 || num > menu.length ){
            System.out.println(
                    "[안내]메뉴에 포함된 번호를 입력하여 주세요.\n" +
                            "[안내]원하시는 메뉴의 번호를 입력하여 주세요.\n" +
                            "1) 김밥(1000원) 2) 계란 김밥(1500원) 3) 충무 김밥(1000원) 4) 떡볶이(2000원)"
            );
            num = scan.nextInt();

        }

        System.out.println(
                "------------------------------\n"+
                "[안내]선택하신 메뉴의 수량을 입력하여 주세요.\n" +
                "(※ 최대 주문 가능 수량 : 99)"
        );

        int count = scan.nextInt();
        while(count < 1 || count > 99){
            System.out.printf("[경고]%d개는 입력하실 수 없습니다.\n" +
                    "[경고]수량 선택 화면으로 돌아갑니다\n", count);

            System.out.println(
                    "------------------------------\n" +
                    "[안내]선택하신 메뉴의 수량을 입력하여 주세요.\n" +
                            "(※ 최대 주문 가능 수량 : 99)"
            );
            count = scan.nextInt();
        }
        scan.close();
        System.out.printf("[안내]주문하신 메뉴의 총 금액은%d원 입니다.\n" +
                "[안내]이용해 주셔서 감사합니다", Integer.parseInt(menu[num-1][1])*count);
    }
}
