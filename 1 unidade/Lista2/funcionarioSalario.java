import java.util.Locale;
import java.util.Scanner;

public class funcionarioSalario {
        public static void main(String[] args) {
            
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            String nome;
            double salBruto = 0, imposto, percentual = 0, salLiq = 0, salImposto;

            System.out.print("Nome: ");
            nome = sc.nextLine();

            System.out.print("Salario bruto: ");
            salBruto = sc.nextDouble();

            System.out.print("Imposto: ");
            imposto = sc.nextDouble();

            salImposto = salBruto - imposto;
            System.out.println();

            System.out.println("Empregado: " + nome + ", R$ " + String.format("%.2f", salImposto));
            System.out.println();

            System.out.print("Qual o percentual de aumento do salário?: ");
            percentual = sc.nextDouble();
            salLiq = salImposto + (salBruto * 0.1);

            System.out.printf("Dados atualizados: %s, R$ %.2f", nome, salLiq);
            
            
        sc.close();

    }
}
