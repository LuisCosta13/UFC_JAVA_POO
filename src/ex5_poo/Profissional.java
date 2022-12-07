/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5_poo;

/**
 *
 * @author luis1
 */
public class Profissional extends Lutador{
    private int numeroAtleta;
    private String arena;
    private String ginasio;
    private String patrocinador;
    private int numeroLutas;
    private double taxaVit;
    private double taxaEmp;
    private double taxaDer;
    
    //Construtor

    public Profissional(String nome, String nacionalidade, int idade, int peso, String categoria, int vitorias, int empates, int derrotas,int numeroAtleta, String arena, String ginasio, String patrocinador) {
        super(nome, nacionalidade, idade, peso, categoria, vitorias, empates, derrotas);
        this.numeroAtleta = numeroAtleta;
        this.arena = arena;
        this.ginasio = ginasio;
        this.patrocinador = patrocinador;
    }
    

    //Getters e setters

    public int getNumeroAtleta() {
        return numeroAtleta;
    }

    public void setNumeroAtleta(int numeroAtleta) {
        this.numeroAtleta = numeroAtleta;
    }

    public String getArena() {
        return arena;
    }

    public void setArena(String arena) {
        this.arena = arena;
    }

    public String getGinasio() {
        return ginasio;
    }

    public void setGinasio(String ginasio) {
        this.ginasio = ginasio;
    }

    public String getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(String patrocinador) {
        this.patrocinador = patrocinador;
    }
    
    

    @Override
    public String toString() {
        return  "\n |||Sobre Atleta ||| \n Tipo de Atleta: Profissional \n" + " Arena: " + arena + "\n Ginasio: " + ginasio + "\n Patrocinador: " + patrocinador;
    }
    
    @Override
    public void print(){
        System.out.print("Id do Atleta: "+numeroAtleta);
        System.out.println("");
        super.print();
        System.out.println(this.toString());
    }
    
    
     @Override
    void totalLutas() {
        this.numeroLutas = this.getVitorias() + this.getEmpates() + this.getDerrotas();
         
    }

    @Override
    void taxaVitorias() {
        this.taxaVit = (this.getVitorias() *100) / this.numeroLutas;
    }

    @Override
    void taxaEmpates() {
        this.taxaEmp = (this.getEmpates() * 100) / this.numeroLutas;
    }

    @Override
    void taxaDerrotas() {
        this.taxaDer = (this.getDerrotas() * 100) / this.numeroLutas;
    }
    
    
    
    
}
