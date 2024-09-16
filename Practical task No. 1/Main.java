import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91;
        int yuan, digit;
        double roubles;
        Scanner input = new Scanner(System.in);
        yuan = input.nextInt();
        digit = yuan % 10;
        if (((yuan / 10) % 10) == 1) System.out.println("У вас " + yuan + " китайских юаней");
        else if (digit == 1 && ((yuan / 10) % 10) != 1) System.out.println("У вас " + yuan + " китайский юань");
        else if (digit == 2 || digit == 3 || digit == 4 ||digit == 7) System.out.println("У вас " +yuan + " китайских юаня");
        else if (digit == 0 || digit == 5 ||digit == 6  ||digit == 8 || digit == 9) System.out.println("У вас " + yuan + " китайских юаней");
        roubles = ROUBLES_PER_YUAN * yuan;
        System.out.println("Сумма денег в российских рублях: " + Math.ceil(roubles));
    }
}