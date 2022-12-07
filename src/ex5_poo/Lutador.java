/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5_poo;

import java.util.Objects;

/**
 *
 * @author luis1
 */
abstract class Lutador implements Cloneable{
    //Variaveis e encapsulamento
    private String nome;
    private String nacionalidade;
    private int idade;
    private int peso;
    private String categoria;
    private int vitorias;
    private int empates;
    private int derrotas;
    
    
    //Metodos Abstratos
    //Genericos em cada uma das subclasses para calcular as suas taxas
    abstract void totalLutas();
    abstract void taxaVitorias();
    abstract void taxaEmpates();
    abstract void taxaDerrotas();
    
    //Nos metodos construtores como estamos dentro da mesma classe, temos polimorfismo de sobrecarga
    
    //Construtor sem Parametros
    public Lutador() {
    }
    
    //Construtor com parametros

    public Lutador(String nome, String nacionalidade, int idade, int peso, String categoria, int vitorias, int empates, int derrotas) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.peso = peso;
        this.categoria = categoria;
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
    }
    
    
    //Getters

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public int getPeso() {
        return peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public int getDerrotas() {
        return derrotas;
    }
    
    //Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    
    //toString

    @Override
    public String toString() {
        return "Lutador{" + "nome=" + nome + ", nacionalidade=" + nacionalidade + ", idade=" + idade + ", peso=" + peso + ", categoria=" + categoria + ", vitorias=" + vitorias + ", empates=" + empates + ", derrotas=" + derrotas + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Lutador other = (Lutador) obj;
        if (this.idade != other.idade) {
            return false;
        }
        if (this.peso != other.peso) {
            return false;
        }
        if (this.vitorias != other.vitorias) {
            return false;
        }
        if (this.empates != other.empates) {
            return false;
        }
        if (this.derrotas != other.derrotas) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.nacionalidade, other.nacionalidade)) {
            return false;
        }
        return Objects.equals(this.categoria, other.categoria);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    public void print(){
        System.out.println("Lutador com o nome: "+nome+ "\n Nacionalidade: "+nacionalidade+"\n Idade: "+idade+"\n Peso: "+peso+"\n Categoria: "+categoria+"\n Vitorias: "+vitorias+"\n Empates: "+empates+"\n Derrotas: "+derrotas);        
    }
    
    public void printTaxas(){
        System.out.println("Taxas foram calculadas");
    }
    
    public void empatarLuta(){
        this.empates = this.empates + 1; 
    }
    public void ganharLuta(){
        this.vitorias = this.vitorias + 1;
    }
    
    public void perderLuta(){
        this.derrotas = this.derrotas + 1;
    }
    
    

}
