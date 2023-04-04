import java.util.Scanner;
public class DepartamentoTeste
{
    public static void main (String[] args)
    {       
        Departamento dep1 = new Departamento();
        Departamento dep2 = new Departamento();
        Departamento dep3 = new Departamento();
        Departamento dep4 = new Departamento();
        Departamento dep5 = new Departamento();
        Departamento dep6 = new Departamento();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nome do dep: ");
        String depNome = sc.nextLine();

        dep1.setNomeDeDepartamento(depNome);

        System.out.print("Chefe do dep: ");
        String chefeDep1 = sc.nextLine();
        dep1.setChefeDePartamento(chefeDep1);

        System.out.print("Chefe do dep: ");
        String chefeDep2 = sc.nextLine();
        dep2.setNomeDeDepartamento(chefeDep2); 

        System.out.print("Cadeiras: ");
        String cadeirasDep = sc.nextLine();
        dep1.setCadeiras(cadeirasDep);

        System.out.print("Numero de dep: ");
        int depNumber = sc.nextInt();
        dep1.setNumeroDeDepartamento(depNumber);

        System.out.println("=======================+==================+==================");
        dep1.Imprimir();
        System.out.println("=======================+==================+==================");

        dep1.mesmoChefe(chefeDep1, chefeDep2);


        /*
        Departamento[] dep = new Departamento[5];

        dep[0] = new Departamento();
        dep[1] = new Departamento();
        dep[2] = new Departamento();
        dep[3] = new Departamento();
        dep[4] = new Departamento();

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do dep: ");
        String depNome = sc.nextLine();
        dep[0].setNomeDeDepartamento(depNome);
        System.out.print("Chefe do dep: ");
        dep[0].setChefeDePartamento(sc.nextLine());
        System.out.print("Cadeiras: ");
        dep[0].setCadeiras(sc.nextLine());
        System.out.print("Numero de dep: ");
        dep[0].setNumeroDeDepartamento(sc.nextInt());

        dep[0].Imprimir();

        for (int i = 0; i < dep.length; i++);
        {
            Departamento dmi = dep[i];   
            dmi.getNomeDeDepartamento();
        }
        */
    }
}