import java.util.Scanner;
public class FuncionarioTeste
{
    public static void main(String[] args)
    {
        /* 
        Funcionario novo = new Funcionario("Arnaldo", "DMI", "Estudante", true, 72_000.0);
        novo.imprimir();

        novo.setAumentoSalarial(2000);
        novo.setDemitir();
        novo.setRadDemitir();
        novo.setStatus(false);
        novo.setAumentoSalarial(300);
        novo.setRadDemitir();
*/

        Funcionario[] funcionario = new Funcionario[2];
        funcionario[0] = new Funcionario("Arnaldo Titos", "DMI", "Eng. de Software", true, 302_000);
        funcionario[1] = new Funcionario("Stella", "Financas", "Economista", false, 75_000);
        
        Scanner sc = new Scanner(System.in);

       // for(int i = 0; i < pessoa.length; i++)
       // {
            System.out.print("Proposta de aumento salarial: ");
            double aumento = sc.nextDouble();
            funcionario[0].setAumentoSalarial(aumento);

            funcionario[0].setSalario(702_000);
        //    sc.next();    

            funcionario[0].setDemitir();
            System.out.println("=================+=========================+================");

            funcionario[0].imprimir();
            System.out.println("=================+=========================+================");
            funcionario[1].imprimir();

            funcionario[1].setRadDemitir();
            funcionario[1].setDemitir();
     //   }

        

        System.out.println("=================+=========================+================");

        

        for(int i = 0; i < funcionario.length; i++)
            {
                Funcionario f = funcionario[i];
                System.out.println("Nome: "+f.getNome()+ "\nDep: "+f.getDepartamento()+ "\nCateg: "+f.getCategoria()+
                "\nStatus: "+f.getStatus()+"\nSalario: "+f.getSalario());
                System.out.println("=================+=========================+================");

            }    
    }
}
    
