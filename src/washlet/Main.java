package washlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        Washlet washlet = new Washlet();

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("トイレに入りました");
        String s;
        while ((s = in.readLine()) != null) { // ユーザの一行入力を待つ
            wash(s, washlet);
        }
        in.close();
        System.out.println("トイレから出ました");
    }

    private static void wash(String s, Washlet washlet) {
        switch (s) {
            case "立つ":
                washlet.立つ();
                break;
            case "座る":
                washlet.座る();
                break;
            case "ビデ":
                washlet.ビデを押す();
                break;
            case "おしり":
                washlet.おしりを押す();
                break;
            case "とめる":
                washlet.とめる();
                break;
            default:
                System.out.println("そんな命令しらない");
        }
    }
}
