package bytebanc;

public class TesteReferencias {
   public static void main(String[] args) {
	   Conta primeiraConta = new Conta();
	   primeiraConta.saldo = 300;
	   
	   System.out.println("Daldo da primeira conta :" + primeiraConta.saldo);
	   
	   Conta segundaConta = primeiraConta;
	   
	   System.out.println("saldo da segunda conta :" + segundaConta.saldo);
	   
	   segundaConta.saldo += 100;
	   
	   System.out.println(primeiraConta.saldo);
	   
	   if(primeiraConta.saldo == segundaConta.saldo) {
		   System.out.println("São as mesmas coisas");
	   }
   }
}
