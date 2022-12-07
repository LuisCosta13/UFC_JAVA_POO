/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5_poo;

/**
 *
 * @author luis1
 */
public class Amador extends Lutador {//Extends para conseguir utilizar herança e usar os atributos de Lutador
    
    private String distrito;
    boolean protecao;
    private int numeroLutas;
    private float taxaVit= 0;
    private float taxaEmp = 0;
    private float taxaDer = 0;

    public Amador(String distrito) {
        this.distrito = distrito;
    }

    public Amador( String nome, String nacionalidade, int idade, int peso, String categoria, int vitorias, int empates, int derrotas,String distrito,boolean protecao) {
        super(nome, nacionalidade, idade, peso, categoria, vitorias, empates, derrotas);
        this.distrito = distrito;
        this.protecao = protecao;//Protecao sera sempre falso, amador nao tem protecao para as lutas
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public boolean isProtecao() {
        return protecao;
    }

    public void setProtecao(boolean protecao) {
        this.protecao = protecao;
    }

    public int getNumeroLutas() {
        return numeroLutas;
    }

    public void setNumeroLutas(int numeroLutas) {
        this.numeroLutas = numeroLutas;
    }

    public double getTaxaVit() {
        return taxaVit;
    }

    public void setTaxaVit(float taxaVit) {
        this.taxaVit = taxaVit;
    }

    public double getTaxaEmp() {
        return taxaEmp;
    }

    public void setTaxaEmp(float taxaEmp) {
        this.taxaEmp = taxaEmp;
    }

    public double getTaxaDer() {
        return taxaDer;
    }

    public void setTaxaDer(float taxaDer) {
        this.taxaDer = taxaDer;
    }
    
    
    
   
    
    @Override
    public void print(){
        //super.print(); Metodo mais facil para printar os elementos do objeto criado com as instancias de lutador
        System.out.println(" Lutador com o nome: "+this.getNome()+ "\n Nacionalidade: "+this.getNacionalidade()+"\n Idade: "+this.getIdade()+"\n Peso: "+this.getPeso()+"\n Categoria: "+this.getCategoria()+"\n\n|||Status do Lutador|||\n Vitorias: "+this.getVitorias()+"\n Empates: "+this.getEmpates()+"\n Derrotas: "+this.getDerrotas()+"\n\n ||| Sobre Lutador ||| \n Distrito: "+distrito+"\n Protecao: "+protecao);        
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
