public class Visit3 {
    public static void main(String[] args) {
        System.out.println("[인공지능 프로그램 V3]");
        System.out.println("=".repeat(30));


//        2차원 배열에 웹 페이지 방문자 수의 실제 값과 인공지능 예측 값을 정의
        double[][] xy_lists = new double[][]
                {
                {374.0, 1161.0},
                {385.0, 1401.0},
                {375.0, 1621.0},
                {401.0, 1681.0}
                };

        System.out.println("[안내] 인공지능 프로그램에 할당된 데이터");
        for (int i = 0; i < xy_lists.length; i++) {
            System.out.printf("%d번 째 데이터) [실제값] 웹 페이지 방문자 수 " +
                    ": %.1f [인공지능 예측값] 웹 페이지 방문자 수 : %.1f\n",
                    i+1, xy_lists[i][0],xy_lists[i][1]);
        }


//        오차 계산
        double error ; // 오차 error 변수 정의
        for (int i = 0; i < xy_lists.length; i++) {
            System.out.printf("\n[%d 번째 데이터] 실제 값과 예측값의 오차 : %.1f\n",
                    i+1, xy_lists[i][0] - xy_lists[i][1]);
            System.out.printf("[안내] 오차의 제곱 : %.1f\n",
                    Math.pow(xy_lists[i][0] - xy_lists[i][1], 2));
        }


//        인공지능 프로그램 성능 계산
        double ai = 0;
        for (int i = 0; i < xy_lists.length; i++) {
            ai += Math.pow(xy_lists[i][0] - xy_lists[i][1], 2);
        }

        System.out.println("\n" + "=".repeat(30));
        System.out.printf("[안내] 인공지능 프로그램의 성능(오차의 제곱 합) : %.1f", ai);

    }
}
