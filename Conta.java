public class Conta
{
    private String titular;
    private int numeroDeConta;
    private double saldo = 300.0; //Minimum Balance
    private static final short TAXA_DE_OPERACAO = 8; //Tax for each operation
    boolean status; //to check to se if the account is Active or desactive

    //Constructor
    public Conta (String titular, int numeroDeConta, boolean status)
    {
        this.titular = titular;
        this.numeroDeConta = numeroDeConta;
        this.status = status;
    }

    //set methods
    public void setTitular(String titular)
    {
        this.titular = titular;
    }
    public void setNumeroDeConta(int numeroDeConta)
    {
        this.numeroDeConta = numeroDeConta;
    }
    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }
    public void setStatus(boolean status)
    {
        this.status = status;
    }

    //Get methods
    public String getTitular()
    {
        return this.titular;
    }
    public int getNumeroDeConta()
    {
        return this.numeroDeConta;
    }
    public double getSaldo()
    {
        return saldo;
    }
    public boolean getStatus()
    {
        return status;
    }
    public static double getTaxaDeOperacao()
    {
        return TAXA_DE_OPERACAO;
    }

    //Method to deposit money
    public void setDepositar(double valor)
    {
        if (status == true)
        {
            //this.saldo -= TAXA_DE_OPERACAO;
            if (valor > 0.0)
            {
                this.saldo += valor ;
                System.out.println("Successfully!");
            }
            else
            {
                System.out.println("Nao ha txuna!");
            }
        }
        else 
        {
            System.out.println("Conta desactivada!");
        }
        

    }

    //Method to withdraw money
    public void setLevantar( double levantamento)
    {
        if (status == true && saldo >= 8)
        {
            //this.saldo -= TAXA_DE_OPERACAO;
            if (this.saldo >= levantamento)
            {
                this.saldo -= levantamento;
                System.out.println("O saldo actual eh: "+ saldo);
            }
            else
            {
                System.out.println("Saldo inferior"+ saldo);
            }
        }
        else 
        {
            System.out.println("Conta desactivada!");
        }
        //this.saldo -= TAXA_DE_OPERACAO;
    }

    //Method to print balance
    public void getBalance()
    {
        if (status == true)
        {
            System.out.println("O seu saldo actual e: "+ saldo);
        }
        else 
        {
            System.out.println("Conta desactivada!");
        }
        this.saldo -= TAXA_DE_OPERACAO;
    }

    //Method to retrieve account data
    public void getDadosDaConta()
    {
        if (status == true)
        {
            System.out.println("Titular: "+titular+"\n" + " Conta: "+ numeroDeConta +"\n"+
        " Status: "+status +" \n" + " Saldo: "+ saldo);
        }
        else 
        {
            System.out.println("Conta Desactivada!");
        }
        this.saldo -= TAXA_DE_OPERACAO;
    }

    //Method to desactivate account
    public boolean DesactivarConta()
    {
        if (status == true)
        {
            status = false;
            System.out.println("Desactivada succesfully!");
            //return false;
            return status;
        }
        else
        {
            //status = false;
            System.out.println("A conta ja estava desactivada!");
            //return false;
            return status;
        }
    }

    //Method to activate account
    public boolean ActivarConta()
    {
        if (status == false)
        {
            status = true;
            System.out.println("Conta activada com sucesso!");
        }
        return true;
    }

}