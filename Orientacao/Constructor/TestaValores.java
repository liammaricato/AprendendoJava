public class TestaValores {
    public static void main(String[] args) {
         Conta conta = new Conta(1337, 24644);

         System.out.println("Agência da nova conta: " + conta.getAgencia());
         System.out.println("Número da nova conta: " + conta.getNumero());

         Conta conta2 = new Conta(1234, 39583);
         Conta conta3 = new Conta(9238, 99128);

         System.out.println("O total de contas criadas é: " + Conta.getTotal());
    }
}