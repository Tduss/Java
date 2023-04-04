import java.util.Scanner;

public class PessoaTeste
{
    public static void main(String[] args)
    {
        Pessoa person = new Pessoa("Arnaldo", 1.62F, 58.8F, 32, "Afro", "Master", "Solteiro", "Null", "Partido do povo");
        
        person.imprimir();

        Scanner sc = new Scanner(System.in);
        System.out.print("Partido: ");
        String party = sc.next();

        person.setPartidoPolitico(party);

        person.imprimir();        
    }
}