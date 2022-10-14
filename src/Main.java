import java.util.Scanner;

public class Main {
    String r,s,p;
    private static void game(String player1, String player2){
        if(player1==player2){}

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에 입력하세요.");
        System.out.print("player1 >>");
        String p1 = sc.next();

        System.out.print("player2 >>");
        String p2 = sc.next();

        game(p1,p2);

    }
}