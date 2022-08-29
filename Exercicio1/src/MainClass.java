import java.util.Scanner;
import java.lang.Math;

public class MainClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int escolha;

        System.out.println("Escolha a operacao: ");
        System.out.println("0 - soma ");
        System.out.println("1 - subtracao");
        System.out.println("2 - multiplicacao");
        System.out.println("3 - divisao");
        System.out.println("4 - exponencial");
        escolha = in.nextInt();

        float x,y;

        System.out.println("Insira dois valores para a operacao");
        x = in.nextFloat();
        y = in.nextFloat();

        switch (escolha){
            case 0:
                System.out.printf("%.2f + %.2f = %.2f %n",x,y,x+y);
                break;
            case 1:
                System.out.printf("%.2f - %.2f = %.2f %n",x,y,x-y);
                break;
            case 2:
                System.out.printf("%.2f * %.2f = %.2f %n",x,y,x*y);
                break;
            case 3:
                System.out.printf("%.2f / %.2f = %.2f %n",x,y,x/y);
                break;
            case 4:
                System.out.printf("%.2f^%.2f = %.2f %n",x,y,Math.pow(x,y));
                break;
        }

    }
}
