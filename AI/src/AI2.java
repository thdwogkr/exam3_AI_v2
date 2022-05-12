import java.util.Scanner;

public class AI2 {
    public static void main(String[] args) {

        System.out.println("[인공지능 프로그램 V2]");
        System.out.println("=".repeat(30));
        System.out.print("[System] a 값을 입력하여 주세요 : ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.print("[System] b 값을 입력하여 주세요 : ");
        int b = scanner.nextInt();
        System.out.print("=".repeat(30));
        System.out.println("");
        System.out.println("[안내] 입력된 '광고비'는 다음과 같습니다.");
        System.out.print("1 번째) ");
        float adp1 = scanner.nextFloat();
        System.out.print("원");
        System.out.print("  2 번째) ");
        float adp2 = scanner.nextFloat();
        System.out.print("원");
        System.out.print("  3 번째) ");
        float adp3 = scanner.nextFloat();
        System.out.print("원");
        System.out.print("  4 번째) ");
        float adp4 = scanner.nextFloat();
        System.out.println("원");
        System.out.println("");
        System.out.println("[안내] AI의 '웹 페이지 방문자' 예측 결과는 다음과 같습니다.");

        float[] adp = {adp1, adp2, adp3, adp4};
        float[] evisitor = new float[4];
        for(int i = 0; i<4 ; i++){
            evisitor[i] = a*adp[i]+b;
            System.out.printf("$d 번째 에측) %,.1f회 방문",evisitor[i]);
        }










    }





}





