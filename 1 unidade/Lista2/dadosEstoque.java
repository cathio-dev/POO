import java.util.Locale;
import java.util.Scanner;

public class dadosEstoque {
        public static void main(String[] args) {
            
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            
            String nome;
            int qntd, resp = 0, add, rem;
            double valorTotal = 0, preco;

            System.out.println("Informe os dados do produto: ");

            System.out.print("Nome: ");
            nome = sc.nextLine();
            
            System.out.print("Preco: ");
            preco = sc.nextDouble();

            System.out.print("Quantidade no estoque: ");
            qntd = sc.nextInt();

            valorTotal = qntd * preco;

        

         while (resp != 4) {
            System.out.println();
            System.out.println("========================================");
            System.out.println("Escolha uma opcao:");
            System.out.println("1 - Adicionar produtos");
            System.out.println("2 - Remover produtos");
            System.out.println("3 - Conferir dados do produto");
            System.out.println("4 - Sair");
            System.out.println("========================================");
            System.out.print("Resposta: ");
            resp = sc.nextInt();
            System.out.println();

            switch (resp) {
                case 1:
                    
                    System.out.print("Informe o número de produtos a serem adicionados no estoque: ");
                    add = sc.nextInt();
                    System.out.println();

                    valorTotal = (add + qntd) * preco;
                    qntd = qntd + add;
            

                    break;
                
                case 2:
                    
                    System.out.print("Informe o número de produtos a serem removidos no estoque: ");
                    rem = sc.nextInt();
                    System.out.println();

                    if (qntd < rem) {
                        System.out.println("Não é possivel remover essa quantidade de produtos, escolhauma quantidade que deixe a quantidade positiva.");
                        System.out.println();
                        return;
                    }

                    valorTotal = (qntd - rem) * preco;
                    qntd = qntd - rem;

                    break;
                
                case 3:
                    
                    System.out.println("Dados atualizados: " + nome + ", " + String.format("%.2f", preco) +  ", " + qntd + " unidades, Total: R$ " + String.format("%.2f", valorTotal));
                    System.out.println();

                    break;
                
                case 4:
                    
                    resp = 4;
                
                    break;
                
                default:
                    break;
                
            }
        }
        sc.close();

    }
}
