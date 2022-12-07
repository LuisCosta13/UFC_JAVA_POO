/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5_poo;

import java.util.Random;

/**
 *
 * @author luis1
 */
public class Luta {
    private Profissional desafiado;
    private Profissional desafiante;
    private Amador desafiadoAmador;
    private Amador desafianteAmador;
    private int rondas;
    private boolean aprovada;

    
    //Getters e setters
    public Lutador getDesafiador() {
        return desafiado;
    }

    public void setDesafiador(Profissional desafiador) {
        this.desafiado = desafiador;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Profissional desafiante) {
        this.desafiante = desafiante;
    }

    public int getRondas() {
        return rondas;
    }

    public void setRondas(int rondas) {
        this.rondas = rondas;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public Profissional getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Profissional desafiado) {
        this.desafiado = desafiado;
    }

    public Amador getDesafiadoAmador() {
        return desafiadoAmador;
    }

    public void setDesafiadoAmador(Amador desafiadoAmador) {
        this.desafiadoAmador = desafiadoAmador;
    }

    public Amador getDesafianteAmador() {
        return desafianteAmador;
    }

    public void setDesafianteAmador(Amador desafianteAmador) {
        this.desafianteAmador = desafianteAmador;
    }
    
    
    
    
    //instancias

    @Override
    public String toString() {
        return "Luta{" + "desafiador=" + desafiado + ", desafiante=" + desafiante + ", rondas=" + rondas + ", aprovada=" + aprovada + '}';
    }
    
    //metodo luta aprovada sim ou nao
    public void marcarLutaPro(Profissional l1, Profissional l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1!=l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void lutarPro(){
        if(this.aprovada){
            System.out.println("Apresentando o Desafiado: ");
            System.out.println("");
            this.desafiado.print();
            System.out.println("-----------------------------------------------------------");
            System.out.println("Apresentar o Desafiante: ");
            System.out.println("");
            this.desafiante.print();
            System.out.println("");
            System.out.println("Luta vai ser realizada na Arena: "+this.desafiado.getArena());
            System.out.println("-----------------------------------------------------------");
            
            //Criar 3 situacoes random para decidir resultado da luta
            Random random = new Random();
            
            int winner = random.nextInt(3);//0 a 2
            
            switch(winner){
                case 0: //Empate
                    System.out.println("---------------------");
                    System.out.println(" Resultado da luta: EMPATE");
                    System.out.println("---------------------");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //Desafiado Ganha
                    System.out.println("---------------------");
                    System.out.println(" Resultado da luta: GANHOU DESAFIADO");
                    System.out.println("---------------------");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2://Desafiante Ganha
                    System.out.println("---------------------");
                    System.out.println(" Resultado da luta: GANHOU O DESAFIANTE");
                    System.out.println("---------------------");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
            
            statusDesafiado();
            statusDesafiante();
            
            
            
        }//aprovada = true
        else{
            System.out.println("Luta nao aprovada");
            
        }
    }
    public void marcarLutaAmador(Amador l1, Amador l2){
            this.desafiadoAmador = l1;
            this.desafianteAmador = l2; 
    }
    
    public void lutarAmador(){
            System.out.println("Apresentando o Desafiado: ");
            System.out.println("");
            this.desafiadoAmador.print();
            System.out.println("-----------------------------------------------------------");
            System.out.println("Apresentar o Desafiante: ");
            System.out.println("");
            this.desafianteAmador.print();
            System.out.println("");
            
            //Criar 3 situacoes random para decidir resultado da luta
            Random random = new Random();
            
            int winner = random.nextInt(3);//0 a 2
            
            switch(winner){
                case 0: //Empate
                    System.out.println("---------------------");
                    System.out.println(" Resultado da luta: EMPATE");
                    System.out.println("---------------------");
                    this.desafiadoAmador.empatarLuta();
                    this.desafianteAmador.empatarLuta();
                    break;
                case 1: //Desafiado Ganha
                    System.out.println("---------------------");
                    System.out.println(" Resultado da luta: GANHOU DESAFIADO");
                    System.out.println("---------------------");
                    this.desafiadoAmador.ganharLuta();
                    this.desafianteAmador.perderLuta();
                    break;
                case 2://Desafiante Ganha
                    System.out.println("---------------------");
                    System.out.println(" Resultado da luta: GANHOU O DESAFIANTE");
                    System.out.println("---------------------");
                    this.desafiadoAmador.perderLuta();
                    this.desafianteAmador.ganharLuta();
                    break;
            }
            statusDesafiadoAmador();
            statusDesafianteAmador();
    }
    
    public void statusDesafiado(){
        System.out.println("------------STATUS DESAFIADO ATUALIZADOS----------------");
        System.out.println("Vitorias: "+this.desafiado.getVitorias());
        System.out.println("Empates: "+this.desafiado.getEmpates());
        System.out.println("Derrotas: "+this.desafiado.getDerrotas());
    }
    public void statusDesafiante(){
        System.out.println("------------STATUS DESAFIANTE ATUALIZADOS---------------");
        System.out.println("Vitorias: "+this.desafiante.getVitorias());
        System.out.println("Empates: "+this.desafiante.getEmpates());
        System.out.println("Derrotas: "+this.desafiante.getDerrotas());
    }
        public void statusDesafiadoAmador(){
        System.out.println("------------STATUS DESAFIADO ATUALIZADOS----------------");
        System.out.println("Vitorias: "+this.desafiadoAmador.getVitorias());
        System.out.println("Empates: "+this.desafiadoAmador.getEmpates());
        System.out.println("Derrotas: "+this.desafiadoAmador.getDerrotas());
    }
    public void statusDesafianteAmador(){
        System.out.println("------------STATUS DESAFIANTE ATUALIZADOS---------------");
        System.out.println("Vitorias: "+this.desafianteAmador.getVitorias());
        System.out.println("Empates: "+this.desafianteAmador.getEmpates());
        System.out.println("Derrotas: "+this.desafianteAmador.getDerrotas());
    }
}
