/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5_poo;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luis1
 */
public class Main{

    
    //ArrayList para guardar os lutadores
    public static   ArrayList <Profissional> proFighters = new ArrayList<> ();
    public static   ArrayList <Amador> amadorFighters = new ArrayList<> ();
    public static   ArrayList <Integer> atletasId = new ArrayList<> ();//Para guardar os ids dos atletas
    public static void main(String[] args) throws CloneNotSupportedException{
        // TODO code application logic here
        
        //Variaveis
        String nome = null,nacionalidade=null,distrito=null,arena=null,ginasio=null,patrocinador=null;
        int idade=0,peso=0,vitorias=0,empates=0,derrotas=0,id=0;
        final boolean protec = false; //Final porque para amador nao ha protecao nenhuma
        boolean flag = false;
        
        
        //Inserção de lutadores ja predefinidos pelo sistema
        
        Profissional default1 = new Profissional("Khabib","Russo",32,75,"Peso medio",29,0,0,304,"Eagle Arena","The Eagles","Gatorade");
        Profissional default2 = new Profissional("Mcgregor","Irlandes",30,70,"Peso medio",21,0,4,343,"Irish Arena","SBG Gym","MyProtein");
        Profissional default3 = new Profissional("Hasbulla","Russo",20,55,"Peso leve",10,3,1,404,"Spetsnaz Arena","The Eagles","UFC");
        Profissional default6 = new Profissional("John","Ingles",24,90,"Peso pesado",7,1,1,707,"Cambridge Arena","The Foxes","PFC");
        Amador default4 = new Amador("Putin","Russo",40,60,"Peso leve",2,0,1,"Moscovo",protec);
        Amador default5 = new Amador("Biden","Ingles",55,57,"Peso leve",1,1,3,"Washington",protec);
        //default1.print();
        
        //Adicionar os lutadores predefinidos ao programa
        proFighters.add(default1);
        proFighters.add(default2);
        proFighters.add(default3);
        proFighters.add(default6);
        amadorFighters.add(default4);
        amadorFighters.add(default5);

        atletasId.add(304);
        atletasId.add(343);
        atletasId.add(404);
        System.out.println(atletasId);

        //Apresentação do que se vai realizar ao utilizador
        bars();
        space();
        System.out.println("Vamos criar o seu primeiro Lutador!");
        space();
        bars();
        
        //Perguntar se é um lutador profissional a ser criado ou amador
        
        System.out.println("Qual lutador pretende criar?");
        space();
        System.out.println("[1] Amador         [2] Profissional");
        int modo = new Scanner(System.in).nextInt();//Ler de 1 a 2 qual o modo do lutador
        verificarModo(modo);//Verificação do modo
        
        //Apos verificar o modo vamos passar para a devida criação de cada lutador
        //Se amador
        if(modo == 1){
            
            //Tudo o que herda de lutador 
            String nomeLutador = knowName(nome); //Como retorno um valor no metodo, guardo na variavel
            //System.out.println("Nome:" +nomeLutador);
            String nacionalidadeLutador = knowNac(nacionalidade);
            //System.ou.printLn("Nacionalidade: "+nacionalidadeLutador);
            int idadeLutador = knowIdade(idade);
            //System.out.println("Idade: "+idadeLutador);
            int pesoLutador = knowPeso(peso);
            //System.out.println("Peso: "+pesoLutador);
            String categoriaLutador = knowCat(pesoLutador);
            //System.out.println("Categoria: "+categoriaLutador);
            int vitoriasLutador = knowVit(vitorias);
            //System.out.println("Vitorias: "+vitoriasLutador);
            int empatesLutador = knowEmp(empates);
            //System.out.println("Empates: "+empatesLutador);
            int derrotasLutador = knowDer(derrotas);
            //System.out.println("Derrotas: "+derrotasLutador);
            //Fim do que herda de lutador
            
            //Proprios atributos de um lutador amador
            String distritoAmador = knowDis(distrito);
            //System.out.println("Distrito: "+distritoAmador);
            
            
            //Criar o Lutador amador
            Amador amador = new Amador(nomeLutador,nacionalidadeLutador,idadeLutador,pesoLutador,categoriaLutador,vitoriasLutador,empatesLutador,derrotasLutador,distritoAmador, protec);
            //System.out.println(amador.toString());
            amador.print();//Apresentar o Lutador Criado pelo utilizador
            amadorFighters.add(amador);//Adicionar na nossa devida arraylist o lutador criado
            
             //Selecionar quem vai lutar
            System.out.println("Selecione o Amador Desafiado: ");
            for(Amador p : amadorFighters){
                System.out.println("["+amadorFighters.indexOf(p)+"] ||| Nome: "+p.getNome()+"||| Categoria: "+p.getCategoria());
            }
            
            System.out.print("A Selecionar: ");
            int s = new Scanner(System.in).nextInt();
            while(s<0 || s>amadorFighters.size()+1){
                System.out.println("Insira um numero Valido.");
                System.out.print("A Selecionar: ");
                s = new Scanner(System.in).nextInt();
            }
            space();
            equalBars();
            System.out.println("Selecione o Amador Desafiante: ");
            for(Amador p : amadorFighters){
                System.out.println("["+amadorFighters.indexOf(p)+"] ||| Nome: "+p.getNome()+"||| Categoria: "+p.getCategoria());
            }
            System.out.print("A Selecionar: ");
            int f = new Scanner(System.in).nextInt();
            while(f<0 || f>proFighters.size()+1){
                System.out.println("Insira um numero Valido.");
                System.out.print("A Selecionar: ");
                f = new Scanner(System.in).nextInt();
            }
            
            equalBars();
            Luta lutaAmador = new Luta();
            lutaAmador.marcarLutaAmador(amadorFighters.get(s),amadorFighters.get(f));
            lutaAmador.lutarAmador();
            
            
        }
        
        //Se lutador Profissional
        if(modo == 2){
            
            //Tudo o que herda de lutador 
            String nomeLutador = knowName(nome); //Como retorno um valor no metodo, guardo na variavel
            //System.out.println("Nome:" +nomeLutador);
            String nacionalidadeLutador = knowNac(nacionalidade);
            //System.ou.printLn("Nacionalidade: "+nacionalidadeLutador);
            int idadeLutador = knowIdade(idade);
            //System.out.println("Idade: "+idadeLutador);
            int pesoLutador = knowPeso(peso);
            //System.out.println("Peso: "+pesoLutador);
            String categoriaLutador = knowCat(pesoLutador);
            //System.out.println("Categoria: "+categoriaLutador);
            int vitoriasLutador = knowVit(vitorias);
            //System.out.println("Vitorias: "+vitoriasLutador);
            int empatesLutador = knowEmp(empates);
            //System.out.println("Empates: "+empatesLutador);
            int derrotasLutador = knowDer(derrotas);
            //System.out.println("Derrotas: "+derrotasLutador);
            //Fim do que herda de lutador
            
            //Proprios atributos de um lutador profissional
            int numeroLutador = knowId(id);
            //System.out.println("Numero Atleta: "+numeroLutador);
            
            String arenaLutador = knowArena(arena);
            //System.out.println("Arena do Lutador: "+arenaLutador);
            String ginasioLutador = knowGym(ginasio);
            //System.out.println("Ginasio: "+ginasioLutador);
            String patrocinadorLutador = knowPatrono(patrocinador);
            //System.out.println("Patrocinador: "+patrocinadorLutador);
            
            
            
            //Criar o Lutador Profissional
            Profissional profissional = new Profissional(nomeLutador,nacionalidadeLutador,idadeLutador,pesoLutador,categoriaLutador,vitoriasLutador,empatesLutador,derrotasLutador,numeroLutador,arenaLutador,ginasioLutador,patrocinadorLutador);
            //System.out.println(profissional.toString());
            profissional.print();//Apresentar o Lutador Criado pelo utilizador
            proFighters.add(profissional);//Adicionar na nossa arraylist o lutador criado
            space();
            space();
            equalBars();
            //Selecionar quem vai lutar
            System.out.println("Selecione o Profissional Desafiado: ");
            for(Profissional p : proFighters){
                System.out.println("["+proFighters.indexOf(p)+"] ||| Id Atleta: "+p.getNumeroAtleta()+"||| Nome: "+p.getNome()+"||| Categoria: "+p.getCategoria());
            }
            
            System.out.print("A Selecionar: ");
            int s = new Scanner(System.in).nextInt();
            while(s<0 || s>proFighters.size()+1){ //Verificacao de numero valido
                System.out.println("Insira um numero Valido.");
                System.out.print("A Selecionar: ");
                s = new Scanner(System.in).nextInt();
            }
            space();
            equalBars();
            System.out.println("Selecione o Profissional Desafiante: ");
            for(Profissional p : proFighters){//for-each
                System.out.println("["+proFighters.indexOf(p)+"] ||| Id Atleta: "+p.getNumeroAtleta()+"||| Nome: "+p.getNome()+"||| Categoria: "+p.getCategoria());
            }
            System.out.print("A Selecionar: ");
            int f = new Scanner(System.in).nextInt();
            while(f<0 || f>proFighters.size()+1){//Verificacao de numero valido
                System.out.println("Insira um numero Valido.");
                System.out.print("A Selecionar: ");
                f = new Scanner(System.in).nextInt();
            }
            
            equalBars();
            Luta lutaPro = new Luta();
            lutaPro.marcarLutaPro(proFighters.get(s),proFighters.get(f));
            lutaPro.lutarPro();
            

            
            
        }
        
        //Demonstrar o que é pedido no ficheiro de exercicios (equals e clone method)
        
        //Vamos agora verificar se um lutador Profissional é igual ao que selecionamos
        equalBars();
        System.out.println("Selecione 2 Profissionais para ver se eles sao iguais: ");
        System.out.println("Selecione 2 Atletas!");
        
        for(Profissional p : proFighters){ 
                System.out.println("["+proFighters.indexOf(p)+"] ||| Id Atleta: "+p.getNumeroAtleta()+"||| Nome: "+p.getNome()+"||| Categoria: "+p.getCategoria());
        }
        
        System.out.print("A selecionar 1 lutador: ");
        int first = new Scanner(System.in).nextInt();
        while(first<0 || first>proFighters.size()+1){
                System.out.println("Insira um numero Valido.");
                System.out.print("A Selecionar: ");
                first = new Scanner(System.in).nextInt();
        }
        
        System.out.print("A selecionar 2 lutador: ");
        int sec = new Scanner(System.in).nextInt();
        while(sec<0 || sec>proFighters.size()+1){
                System.out.println("Insira um numero Valido.");
                System.out.print("A Selecionar: ");
                sec = new Scanner(System.in).nextInt();
        }
        System.out.print("Os Lutadores sao iguais: "+proFighters.get(first).equals(proFighters.get(sec)));
        /*
            Metodo alternativo ao de cima com dois For
        for(Lutador p : proFighters){
            for(int i = first ; i<first; i++){
                System.out.println(p.equals(proFighters.get(sec)));
            }
        }*/
        
        space();
        
        //Fazer clone de um objeto ja criado
        equalBars();
        System.out.println("Vamos clonar um objeto");
        System.out.println("Selecione um objeto: ");
        for(Profissional p : proFighters){ 
                System.out.println("["+proFighters.indexOf(p)+"] ||| Id Atleta: "+p.getNumeroAtleta()+"||| Nome: "+p.getNome()+"||| Categoria: "+p.getCategoria());
        }
        System.out.print("A selecionar lutador: ");
        int clonar = new Scanner(System.in).nextInt();
        Profissional c = proFighters.get(clonar);
        Profissional clone = (Profissional)c.clone();
        
        proFighters.add(clone);//Adicionar na arraylist
        
        //Apresentar arraylist com o clone adicionado
        equalBars();
        for(Profissional p : proFighters){ //Shallow Copy
                System.out.println("["+proFighters.indexOf(p)+"] ||| Id Atleta: "+p.getNumeroAtleta()+"||| Nome: "+p.getNome()+"||| Categoria: "+p.getCategoria());
        }
        
        //Como foi um shallow Copy ele vai indicar para os apontadores do elemento clonado copiando assim tambem o seu id no arrayList
        
        
        //Apresentar a utilzação dos metdos abstratos
        //Pedir para selecionar um lutador Amador para verificar as suas taxas de vitorias, empate e derrota
        equalBars();
        System.out.println("Selecione um Lutador Amador para verificar as suas taxas(Vitorias, Empate e Derrotas");
        for(Amador a: amadorFighters){
            System.out.println("["+amadorFighters.indexOf(a)+"] ||| Nome: "+a.getNome()+"||| Categoria: "+a.getCategoria());
        }
        System.out.print("A Selecionar: ");
        int abs = new Scanner(System.in).nextInt();
        while(abs<0 || abs>amadorFighters.size()+1){
            System.out.println("Insira um numero Valido.");
            System.out.print("A Selecionar: ");
            abs = new Scanner(System.in).nextInt();
        }
        equalBars();
        Amador selecao = amadorFighters.get(abs);
        selecao.totalLutas();
        selecao.taxaVitorias();
        selecao.taxaEmpates();
        selecao.taxaDerrotas();
        System.out.println("Numero Total de Lutas: "+selecao.getNumeroLutas());
        System.out.println("Porcentagem de Vitorias: "+selecao.getTaxaVit());
        System.out.println("Porcentagem de Empates: "+selecao.getTaxaEmp());
        System.out.println("Porcentagem de Derrotas: "+selecao.getTaxaDer());
        
        //Para ser criado para profissional basta apenas adaptar o codigo de cima para lutadores profissionais
    }
    
    
    private static void space(){
        System.out.println("");
    }
    
    private static void bars(){
        System.out.println("---------------------");
    }
    private static void equalBars(){
        space();
        bars();
        space();
    }
    
    private static void verificarModo(int modo){//Metodo para verificar qual o modo do atleta amador ou pro
        while(modo>2 || modo<1){
        System.out.println("Erro no valor atribuido!");
        bars();
        System.out.println("Digite novamente");
        space();
        System.out.println("Qual lutador pretende criar?");
        space();
        System.out.println("[1] Amador         [2] Profissional");
        modo = new Scanner(System.in).nextInt();
        }
    } //Metodo para verificar o modo do Lutador que estamos a criar

    private static String knowName(String nome){//saber o nome do lutador 
        equalBars();
        System.out.print("Qual o nome do seu primeiro lutador :");
        nome = new Scanner(System.in).nextLine();
        return nome;
    }
    
    private static String knowNac(String nacionalidade){//saber nacionalidade
        equalBars();
        System.out.print("Qual a sua nacionalidade: ");
        nacionalidade = new Scanner(System.in).nextLine();
        return nacionalidade;
    }
    
    private static int knowIdade(int idade){//Saber a idade do lutador
        equalBars();
        System.out.println("Idades compreendidas entre os 18-40 anos");
        System.out.print("Qual a sua idade: ");
        idade = new Scanner(System.in).nextInt();
        int idadeVerified = verificarIdade(idade);
        return idadeVerified;
    }
    
    private static int verificarIdade(int idade){//Verificar se a idade do Lutador é valida
        while(idade<18 || idade>40){
            equalBars();
            System.out.println("Erro a atribuir o valor!");
            System.out.println("Digite novamente uma idade correta.");
            System.out.println("Idades compreendidas entre os 18-40 anos");
            System.out.print("Qual a sua idade: ");
            idade = new Scanner(System.in).nextInt();
        }
        return idade;
    }
    
    private static int knowPeso(int peso){//Saber o peso do lutador
        equalBars();
        System.out.println("Peso compreendido entre 55kg - 120kg");
        System.out.print("Qual o peso do seu lutador: ");
        peso = new Scanner(System.in).nextInt();
        int pesoVerified = verificarPeso(peso);
        return pesoVerified;
    }
    
    private static int verificarPeso(int peso){//VERIFICAR SE O PESO É UM NUMERO VALIDO
        while(peso<55 || peso>120){
            equalBars();
            System.out.println("Erro a atribuir valor!");
            System.out.println("Peso compreendido entre 55kg- 120kg");
            System.out.print("Digite novamente o peso de forma correta.");
            System.out.print("Qual o peso do seu lutador: ");
            peso = new Scanner(System.in).nextInt();
        }
        return peso;
    }
    
    private static String knowCat(int pesoLutador){//Saber a categoria do lutador atraves do peso que declaramos
        equalBars();
        //A categoria é atribuida conforme o peso que introduzimos no lutador
        if(pesoLutador>=55 && pesoLutador<70){
           String categoria = "Peso leve";
           return categoria;
        }
        else if(pesoLutador>=70 && pesoLutador<90){
           String categoria = "Peso medio";
           return categoria;
        }
        else{
           String categoria = "Peso pesado";
           return categoria;
        }
        
    }
    
    private static int knowVit(int vitorias){//Saber o numiero de vitorias
        equalBars();
        System.out.println("Vitorias Default compreendidas entre 0-15");
        System.out.print("Quantas vitorias tem o seu lutador: ");
        vitorias = new Scanner(System.in).nextInt();
        int vitoriasVerified = verificarVit(vitorias);
        return vitoriasVerified;
    }
    
    private static int verificarVit(int vitorias){//Verificacao para um a insercao de um numero valido de vitorias
        equalBars();
        while(vitorias<0 || vitorias>15){
            System.out.println("Erro a atribuir o valor!");
            System.out.println("Digite um numero valido para vitorias.");
            System.out.println("Vitorias Default compreendidas entre 0-15");
            System.out.print("Quantas vitorias tem o seu lutador: ");
            vitorias = new Scanner(System.in).nextInt();
        }
        return vitorias;
    }
    
    private static int knowEmp(int empates){//Saber os empates do lutador
        equalBars();
        System.out.println("Empates Default compreendidos entre 0-5");
        System.out.print("Quantos empates tem o seu lutador: ");
        empates = new Scanner(System.in).nextInt();
        int empatesVerified = verificarEmp(empates);
        return empatesVerified;
    }
    
    private static int verificarEmp(int empates){//Fazer com que seja inserido um valor valido para os empates 
        equalBars();
        while(empates<0 || empates>5){
            System.out.println("Erro a atribuir valor!");
            System.out.println("Digite um numero valido para os empates.");
            System.out.println("Empates Default compreendidos entre 0-5");
            System.out.print("Quantos empates tem o seu lutador: ");
            empates = new Scanner(System.in).nextInt();
        }
        return empates;
    }
    
    private static int knowDer(int derrotas){//Saber derrotas do lutador
        equalBars();
        System.out.println("Derrotas Default compreendidos entre 0-10");
        System.out.print("Qual o numero de derrotas: ");
        derrotas = new Scanner(System.in).nextInt();
        int derrotasVerified = verificarDer(derrotas);
        return derrotasVerified;
    }
    
    private static int verificarDer(int derrotas){//Verificar derrotas para ser um numero valido para ser inserido no prgrama
        equalBars();
        while(derrotas<0 || derrotas>10){
            System.out.println("Erro a atribuir valor!");
            System.out.println("Digite um numero valido para as derrotas.");
            System.out.println("Derrotas Default compreendidos entre 0-10");
            System.out.print("Quantas derrotas tem o seu lutador: ");
            derrotas = new Scanner(System.in).nextInt();
        }
        return derrotas;
    }
    
    private static String knowDis(String distrito){//Saber o distrito do lutador amador
        equalBars();
        System.out.print("Em que distrito atua o seu lutador: ");
        distrito = new Scanner(System.in).nextLine();
        return distrito;
    }
    
    private static int knowId(int id){//Saber o id do atleta com a devida verificaçºao para nao haver ids repetidos
        int confirmedId = 0;
        equalBars();
        System.out.println("Id atleta compreendido entre 1-999");
        System.out.print("Digite o Id do seu atleta: ");
        id = new Scanner(System.in).nextInt();
        boolean match = atletasId.contains(id);
        if(match){
            //System.out.println("Match: "+match);
            confirmedId = knowId(id);//Recursivo entra novamente no loop quando o id ja esta relacionado a um atletas
            return confirmedId;
        }
        else{
            //System.out.println("Match: "+match);
            atletasId.add(id);
            //System.out.println(atletasId);//Adiciona para o arraylist para saber que ja existe o Id quando criar um novo atleta profissional
            return id;
        }
    }
    
    private static String knowArena(String arena){
        equalBars();
        System.out.println("Digite a Arena em que o seu lutador atua!");
        System.out.print("Nome da Arena: ");
        arena = new Scanner(System.in).nextLine();
        return arena;
    }
    
    private static String knowGym(String ginasio){
        equalBars();
        System.out.println("Digite o Ginasio que o seu lutador treina!");
        System.out.print("Nome do Ginasio: ");
        ginasio = new Scanner(System.in).nextLine();
        return ginasio;
    }

    private static String knowPatrono(String patrocinador){
        equalBars();
        System.out.println("Digite o Patrocinador do seu lutador!");
        System.out.print("Patrocinador: ");
        patrocinador = new Scanner(System.in).nextLine();
        return patrocinador;
    }
    
    
}


