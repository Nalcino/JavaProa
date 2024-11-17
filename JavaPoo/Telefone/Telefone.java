package JavaPoo;
import java.util.Scanner;

public class Telefone {

    private String modelo;
    private String marca;
    private String numero;
    private boolean temCamera;
    private double tamanhoTela;
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public boolean isTemCamera() {
        return temCamera;
    }

    public void setTemCamera(boolean temCamera) {
        this.temCamera = temCamera;
    }

    public double getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(double tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public String toString() {
        return "Telefone [modelo=" + modelo + ", marca=" + marca + ", numero=" + numero +
                ", temCamera=" + temCamera + ", tamanhoTela=" + tamanhoTela + "]";
    }
}



