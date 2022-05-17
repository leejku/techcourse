import java.util.Scanner;
import java.util.Arrays;

public class Subtitle {
    public static void main(String[] args) {

//        금칙어 리스트
        String[][] filter = {{"킹","열"}, {"시발", "사랑"}, {"꺼져", "사라져"}, {"미친", "희망"}};

        System.out.print("[시스템] 유튜브 계정의 아이디를 입력하세요 {Ex - admin} : ");
        Scanner scan1 = new Scanner(System.in);
        String id = scan1.nextLine();
        System.out.print("[시스템] 유튜브 계정의 비밀번호를 입력하세요{Ex - 0000} : ");
        Scanner scan2 = new Scanner(System.in);
        int pw = scan2.nextInt();

        if (!id.equals("admin") || pw != 0000){
            System.out.println("[경고] 유튜브 계정의 아이디 및 비밀번호를 다시 확인해 주세요.");
        } else {
            System.out.println("\n[안내] 안녕하세요 admin님.\n" +
                    "[안내] 유튜브 영상의 자막을 생성해 주세요.\n");

            Scanner scan3 = new Scanner(System.in);
            String subtitle = scan3.nextLine();

            System.out.println(
            "=".repeat(30) + "\n"
            + "[알림] 프로그램의 금칙어 리스트입니다.\n"
            );

            for (int i = 0; i < filter.length; i++ ) {
                System.out.print(filter[i][0]);
            } 


            System.out.println(
            "=".repeat(30) + "\n"
            + "[알림] 자막 순화 프로그램 결과입니다.\n"
            );

            for (int i = 0; i < filter.length; i++) {
                if(subtitle.contains(filter[i][0])){
                    subtitle = subtitle.replace(filter[i][0], filter[i][1]);
                }
            }
            System.out.println(subtitle);
            System.out.println("[안내] 프로그램을 종료합니다.");
        }


    }
}
