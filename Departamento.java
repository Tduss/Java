public class Departamento
{
    private int numeroDeDepartamento;
    private String nomeDeDepartamento;
    private String chefeDePartamento;
    private String cadeiras; //Converter para String[]
 
    public Departamento()
    {
        /* 
        numeroDeDepartamento = 3;
        nomeDeDepartamento = "DMI";
        chefeDePartamento = " Frenque Sitoe";
        cadeiras = "Informatica, Estatistica, Matematica, CIG";
        */
    }


    //Set Methods
    public void setNumeroDeDepartamento(int depNumber)
    {
        numeroDeDepartamento = depNumber;
    }

    public void setNomeDeDepartamento(String depName)
    {
        nomeDeDepartamento = depName;
    }

    public void setChefeDePartamento(String bossName)
    {
        chefeDePartamento = bossName;
    }

    public void setCadeiras(String cadeiras)
    {
        this.cadeiras = cadeiras;
    }


    //Get Methods
    public int getNumeroDeDepartamento()
    {
        return numeroDeDepartamento;
    }

    public String getNomeDeDepartamento()
    {
        return nomeDeDepartamento;
    }

    public String getChefeDePartamento()
    {
        return chefeDePartamento;
    }
    
    public String getCadeiras()
    {
        return cadeiras;
    }



    //Metodo para imprimr nome e o numero do departamento
    public void Imprimir()
    {
        System.out.println("Nome do dep: "+getNomeDeDepartamento()+"\nNr do dep: "+ getNumeroDeDepartamento());
    }

    //Metodo arcaico que verifica se dois dep tem um mesmo chefe
    public void mesmoChefe(String chefe1, String chefe2)
    {
        if ( chefe1.equals(chefe2))
        {
            System.out.println("Os dep tem o mesmo chefe.");
        }
        else
        {
            System.out.println("Chefes diferentes!");
        }
    }

}