import java.util.Locale;
import java.util.Scanner;

public class larguraRet {
        public static void main(String[] args) {
            
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            double l, h, area, p, diag;

            System.out.println("Informe a altura e a largura do retangulo");
            l = sc.nextDouble();
            h = sc.nextDouble();

            area = l * h;
            p = (2*l) + (2*h);
            diag = Math.sqrt((l*l) + (h*h));

            System.out.printf("Area = %.2f\n", area);
            System.out.printf("Perimetro = %.2f\n", p);
            System.out.printf("Diagonal = %.2f\n", diag);
            
            
        sc.close();

    }
}
