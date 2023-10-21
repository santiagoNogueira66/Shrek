package padrao;

import java.util.Scanner;

public class AgenteJaChegou {
    public static void main(String[] args) {
        String resp= "nao";
        Scanner ent = new Scanner(System.in);
        System.out.println("BURRO: a gente já chegou ?");
        resp = ent.next();
        while (resp.equals("nao") ){
            System.out.println("SHREK: não");
            System.out.print("\n");
            System.out.println("BURRO: a gente já chegou ?");
            resp = ent.next();
        }
    }
}
