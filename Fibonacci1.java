import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci1 {
    public static void main(String[] args){

//        입력 값 저장을 위한 inputValue 정의
        int inputValue;


//        while(true)를 통해 무한 루프를 형성
        while(true) {
//            발생할 수 있는 예외 케이스 : 정수가 아닌 값이 들어온다면?
            try {
//                Scanner
                Scanner scan = new Scanner(System.in);
                System.out.print(
                        "[안내]피보나치 수열 프로그램 시작.\n" +
                                "원하는 수열의 개수를 입력해 주세요 : ");
                inputValue = scan.nextInt();
//                break로 빠져나가기 전에 할당된 스캐너 클래스를 close 해준다.
               scan.close();
//               예외가 발생하지 않는 경우, break를 통해서 무한 루프를 빠져나간다.
                break;

//                스캐너 입력값이 형식에 맞지 않거나 범위에 벗어나는 경우,
            } catch (InputMismatchException e) {
//                경고 문구 출력 및 무한 루프이기 때문에, while 문 맨위로 이동한다.
                System.out.println("\n[경고]숫자를 입력해주세요.\n");
            }
        }


        System.out.printf("\n입력하신 값은 %d입니다.\n", inputValue);
        System.out.printf("[피보나치 수열 출력]\n");


//      inputValue 만큼의 빈 배열 생성
        int[] arr = new int[inputValue];

//      첫 번째 항과 두 번째 항은 1로 둔다.
        arr[0] = 1;
        arr[1] = 1;

//      inputValue가 6인 경우? {1, 1, 0, 0, 0, 0}


//      for 문을 활용해서 배열의 값을 하나씩 확인한다.
        for (int i = 0; i < arr.length; i ++){

//          첫 번째 항과 두번째 항은 값이 존재하기 때문에 바로 출력
            if (arr[i] != 0) {
                System.out.println(arr[i]);
            } else{
//              나머지 항은 더한 값을 넣고 출력
                arr[i] = arr[i-1] + arr[i-2];
                System.out.println(arr[i]);
            }
        }
    }
}
