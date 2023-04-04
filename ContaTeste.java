public class ContaTeste
{
    public static void main(String[] args)
    {
        //Creating accounts
        Conta std = new Conta("Titos", 192_309_009, true);
        Conta bim = new Conta("Titos", 222_309_009, false);
        Conta bci = new Conta("Titos", 882_309_009, true);

        //Playing with the account
        std.setDepositar(22_000);
        bci.setDepositar(5_000);
        bim.setDepositar(600);

        bci.getBalance();
        bci.setLevantar(270);
        bci.getBalance();
        std.getDadosDaConta();

        bim.ActivarConta();
        bim.getDadosDaConta();

        /*
         
        Conta[] pessoa = new Conta[3];
       
        pessoa[0] = new Conta("Titos", 233_000_444, false);
        pessoa[1] = new Conta("Arnaldo", 101_2017_404, true);
        pessoa[2] = new Conta("Arnaldo", 222_333_555, false);

        Scanner sc = new Scanner(System.in);

       // for(int i = 0; i < pessoa.length; i++)
       // {
            System.out.print("Titular: ");
            String titular = sc.nextLine();
            pessoa[0].setTitular(sc.nextLine());
        //    sc.next();    

            System.out.print("Conta: ");
            int conta = sc.nextInt();
            pessoa[0].setConta(conta);

            System.out.print("Status: ");
            boolean status = sc.nextBoolean();
            pessoa[0].ActivarConta(status);
     //   }

        

        System.out.println("=================+=========================+================");

        for(int i = 0; i < pessoa.length; i++)
            {
                Conta a = pessoa[i];
                System.out.println("Titular: "+a.getNome()+ "\nConta: "+a.getConta()+ "\nStatus: "+a.getStatus());
                System.out.println("=================+=========================+================");

            }    
            
         */
    }
}