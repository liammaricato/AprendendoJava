public class TestaMetodo{
    public static void main(String[] args){
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 100;
        
        primeiraConta.deposita(50);
        System.out.println(primeiraConta.saldo);
        
        boolean conseguiuRetirar = primeiraConta.saca(20);
        System.out.println(conseguiuRetirar);
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.deposita(1000);

        if (segundaConta.transfere(300, primeiraConta)) {
            System.out.println("Transferência com sucesso!");
        } else {
            System.out.println("Faltou dinheiro!!");
        }

        System.out.println("Saldo da primeira conta = " + primeiraConta.saldo);
        System.out.println("Saldo da segunda conta = " + segundaConta.saldo);
    }
}