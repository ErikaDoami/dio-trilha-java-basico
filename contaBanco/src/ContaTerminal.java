import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try ( // TODO: Conhecer e importar a classe Scanner
        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        //Exibir a mensagem conta criada
                Scanner sc = new Scanner(System.in)) {
            int numero;
            String agencia;
            String nomeCliente;
            float saldo;
            
            System.out.println("--CONTA BANCÁRIA--");
            System.out.println("Por Favor, digite o número da Agência!");
            agencia = sc.next();
            
            System.out.println("Agora digite a sua conta!");
            numero = sc.nextInt();
            
            System.out.println("Agora informe seu primeiro Nome!");
            nomeCliente = sc.next();
            sc.nextLine();
            
            System.out.println("Informe seu saldo atual");
            saldo = sc.nextFloat();
            
            System.err.println();
            System.out.printf("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
            sc.close();
            
        }
    }
}
