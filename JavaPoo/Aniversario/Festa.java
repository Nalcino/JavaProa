package JavaPoo2;
import java.util.Scanner;

class Festa {

    private String nome;
    private int idade;
    private String local;
    private String tema;
    private boolean decoracao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public boolean isDecoracao() {
        return decoracao;
    }

    public void setDecoracao(boolean decoracao) {
        this.decoracao = decoracao;
    }

    public boolean temDecoracao() {
        return decoracao;
    }
}



