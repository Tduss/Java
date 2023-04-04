public class Pessoa
{
    private String nome;
    private float altura;
    private float peso;
    private float imc;
    private int idade;
    private String raca;
    private String escolaridade;
    private String estadoCivil;
    private String religiao;
    private String partidoPolitico;

    //Constructor
    public Pessoa(String nome, float altura, float peso, int idade, String raca, String escolaridade, String estadoCivil, String religiao, String partidoPolitico)
    {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.idade = idade;
        this.raca = raca;
        this.escolaridade = escolaridade;
        this.estadoCivil = estadoCivil;
        this.religiao = religiao;
        this.partidoPolitico = partidoPolitico;
    }

    //Set Methods
    public void setName(String name)
    {
        if (name != null)
        {
            nome = name;
        }
        
    }
    public void setAltura(float height)
    {
        if (height > 0.0 && height < 3.0)
        {
            altura = height;
    }
        }
        
    public void setPeso(float weight)
    {
        if (weight > 0.0 && weight < 720)
        {
            peso = weight;
        }
    }
     
    public void setIMC(float height, float weight)
    {
        imc = getPeso()/(getAltura() * getAltura());
    }
    
    public void setIdade(int age)
    {
        if (age >= 0)
        {
            idade = age;
        }
        
    }
    public void setRaca(String race)
    {
        raca = race;
    }
    public void setEscolaridade(String nivelAcademico)
    {
        escolaridade = nivelAcademico;
    }
    public void setEstadoCivil(String status)
    {
        estadoCivil = status;
    }
    public void setReligiao(String religion)
    {
        religiao = religion;
    }
    public void setPartidoPolitico(String partido)
    {
        if (!partido.equals("Frelimo"))
        {
            partidoPolitico = partido;
        }
    }

    //Get Methods
    public String getName()
    {
        return nome;
    }
    public float getAltura()
    {
       return altura;
    }
    public float getPeso()
    {
        return peso;
    }
    public float getIMC()
    {
        return imc;
    }
    public int getIdade()
    {
        return idade;
    }
    public String getRaca()
    {
       return raca;
    }
    public String getEscolaridade()
    {
        return escolaridade;
    }
    public String getEstadoCivil()
    {
        return estadoCivil;
    }
    public String getReligiao()
    {
        return religiao;
    }
    public String getPartidoPolitico()
    {
        return partidoPolitico;
    }

    //Method to print all attributes of the class
    public void imprimir()
    {
        System.out.println("Nome: " +nome+ "\n Idade: " +idade+ "\n Raca: "+ raca+ 
        "\n Escolaridade: " + escolaridade+ "\n Estado Civil: "+estadoCivil+ 
        "\n Religiao: "+ religiao+ "\n Partido Politco: "+ partidoPolitico+ "\n Altura: " +altura+ 
        "\n Peso: "+peso +"\n IMC: " +imc + "\n" );
    }
}