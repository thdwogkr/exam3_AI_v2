public class AI3 {
    public static void main(String[] args) {
        System.out.println("[인공지능 프로그램 V3]");
        System.out.println("=".repeat(35));
        System.out.println("[안내] 인공지능 프로그램에 할당된 데이터");

        float[][] data = { {374,385,375,401}, {1161, 1401, 1621,1681} };
        float[] gap = new float[4];
        float[] gap_square = new float[4];

        for(int i = 0; i<4 ; i++) {
            System.out.printf("%d번 째 데이터) [실제값] 웹 페이지 방문자 수 : %,.1f [인공지능 예측값] 웹 페이지 방문자 수 : %,.1f%n",i+1,data[0][i],data[1][i]);

       }
            System.out.println("");
        for(int i = 0; i<4 ; i++) {
            gap[i] = data[0][i] - data[1][i];
            gap_square[i] = gap[i] * gap[i];
            System.out.printf("[%d 번째 데이터] 실제 값과 예측값의 오차 : %,.1f%n",i+1,gap[i]);
            System.out.printf("[안내] 오차의 제곱 : %,.1f%n%n",gap_square[i]);
        }

        float perform = 0;
        for (int i = 0; i<gap_square.length ; i++){
            perform += gap_square[i];
        }

        System.out.println("=".repeat(35));
        System.out.printf("[안내] 인공지능 프로그램 성능(오차의 제곱 합) : %,.1f",perform);






    }



}
