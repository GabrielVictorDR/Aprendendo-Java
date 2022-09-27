package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
    public static void main(String[] args) {

        // Não comparar Strings com ==
        System.out.println("2" == "2");

        String s1 = new String();
        System.out.println("2" == s1);
        System.out.println("2".equals(s1));

        Scanner insert = new Scanner(System.in);

        String s2 = insert.next();
        System.out.println("2" == s2.trim());
        System.out.println("2".equals(s2));

        insert.close();
        
    }
}
