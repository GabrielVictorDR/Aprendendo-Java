package fundamentos.operadores;

public class Unarios {

    public static void main(String[] args) {
        
        int a = 1;
        int b = 2;
        
        a++;
        a--;
        
        ++b;
        --b;
        
        System.out.println(a);
        System.out.println(b);

        System.out.println("Mini Desafio...");
        System.out.println(++a == b++);
        System.out.println(a == b);
        System.out.println(a);
        System.out.println(b);


    }
}
