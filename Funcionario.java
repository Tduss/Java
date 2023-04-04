class Funcionario
{
    private String nome;
    private String departamento;
    private String categoria;
    private boolean status;
    private double salario;

    public Funcionario( String nome, String departamento, String categoria, Boolean        status, double salario)
    {
        this.nome = nome;
        this.departamento = departamento;
        this.categoria = categoria;
        this.status = status;
        this.salario = salario;
    }

    //SET METHODS
    public void setNome(String name)
    {
        //nome = "Arnaldo Titos";
        nome = name;
    }

    public void setDepartamento(String dep)
    {
        //departamento = "DMI";
        departamento = dep;
    }
    public void setCategoria(String cat)
    {
        //categoria = "Estudante";
        categoria = cat;
    }

    public void setStatus(Boolean status)
    {
        //status = true;
        this.status = status;
        
    }

    public void setSalario(double salary)
    {
        //salario = 702_000.0;
        salario = salary;
    }


    //GET METHODS

    public String getNome()
    {
        return nome;
    }
    public String getDepartamento()
    {
        return departamento;
    }
    public String getCategoria()
    { 
        return categoria;
    }
    public boolean getStatus()
    {
        return status;
    }
    public double getSalario()
    {
        return salario;
    }

    
    public void setAumentoSalarial(double aumento)
    {
        if (salario < 5_000.0 && status == true) 
        {
            salario = salario + salario * 0.1;
        }
        else
        {
            System.out.println("Sem direito a aumento salarial");
        }
    }

    public void imprimir()
    {
        System.out.println("Nome: "+nome+"\nDep. "+ departamento+"\nCat. "+ categoria+"\nStatus: "+ status+"\nSalario: "+ salario);
    }

    boolean setDemitir()
    {
        if (status == true)
        {
            System.out.println("Funcionario demitido hoje");
            status = false;
            return status;
        }
        else
        {
            System.out.println("O funcionario ja foi demitido antes!");
            status = false;
            return status;
        }
    }
    boolean setRadDemitir()
    {
        if (status == true)
        {
            System.out.println("O funcionario ainda e' activo!");
            return false;
        }
        else
        {
            status = true;
            System.out.println("Funcionaro readmitido hoje");
            return true;
        }
    }
}