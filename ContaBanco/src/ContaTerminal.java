import java.util.Scanner;

public class ContaTerminal 
{
    public static void main(String[] args) throws Exception 
    {
        //TO DO: 
                 //Conhecer e importar a classe scanner 
                 //Exibir as mensagens para o nosso usuário
                 //Obter pelo scanner os valores digitados no terminal 
                 //Exibir a mensagem conta criada

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome_cliente = entrada.nextLine();

        System.out.println("Digite a sua agência: ");
        String agencia_cliente = entrada.nextLine();

        System.out.println("Digite o número da agência: ");
        int numero_agencia_cliente = entrada.nextInt();

        System.out.println("Digite o seu saldo: ");
        double saldo_cliente = entrada.nextDouble();

        System.out.println("Olá " +nome_cliente+", obrigado por criar uma conta em nosso banco, sua agência é " 
        +agencia_cliente+ ", conta " +numero_agencia_cliente+ " e seu saldo " +saldo_cliente+ " já está disponível para saque");
    }
}
