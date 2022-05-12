import java.util.Scanner;

public class AI1 {
    public static void main(String[] args){
        System.out.println("[인공지능 프로그램 V1]");
        System.out.println("=".repeat(30));
        System.out.print("[System] 예측에 영향을 주는 원인(광고비)의 값을 알려주세요 (단위 원))");
        Scanner A = new Scanner(System.in);
        int adp = A.nextInt();
        System.out.printf("[안내] 입력된 광고비는 %d 원 입니다.",adp);
        int a = 2;
        int b = 1;
        int eclink = a * adp + 1;

        System.out.printf("[안내] AI의 예측 (클릭 수)은 %d회 입니다.",eclink);

    }


}
