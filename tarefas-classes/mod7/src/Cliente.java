
public class Cliente {
 
    private String nome;
    private int cpf;
    private int cep;
    private int idade; 

    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getCpf(){
        return cpf;
    }
    public void setCpf(int cpf){
        this.cpf = cpf;
    }
    public int getCep(){
        return cep;
    }
    public void setCep(int cep){
        this.cep = cep;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }


}
