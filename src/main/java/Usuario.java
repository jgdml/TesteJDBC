public class Usuario {

    private String nome;
    private String idade;

    Usuario(String nome, String idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public String getIdade(){
        return this.idade;
    }

}
