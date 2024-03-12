import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Exercicio 1
        System.out.println(" ---------- Exercício 1 ---------- ");

        Main.exercicio1();

        System.out.println(" ---------- Exercício 1 ---------- ");

        //Exercicio 2
        System.out.println(" ---------- Exercício 2 ---------- ");

        Main.exercicio2();

        System.out.println(" ---------- Exercício 2 ---------- ");

        //Exercicio 3
        System.out.println(" ---------- Exercício 3 ---------- ");

        Main.exercicio3();

        System.out.println(" ---------- Exercício 3 ---------- ");

        //Exercicio 4
        System.out.println(" ---------- Exercício 4 ---------- ");

        Main.exercicio4();

        System.out.println(" ---------- Exercício 4 ---------- ");

        //Exercicio 3
        System.out.println(" ---------- Exercício 5 ---------- ");

        Main.exercicio5();

        System.out.println(" ---------- Exercício 5 ---------- ");

        //System.out.println("Hello world!");
    }
    public static void exercicio1(){
       int soma = 0, k = 0 ,indice = 13;

       while (k < indice){
            k+=1;
            soma = soma + k;
       }
        System.out.println("O valor da Soma é: " + soma);

    }

    public static void exercicio2(){
        Scanner entrada = new Scanner(System.in);
        int indiceFibonacci;
        ArrayList<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);
        System.out.print("Informe um Numero: ");
        indiceFibonacci = entrada.nextInt();

        for (int i = 2; i<indiceFibonacci; i++){
            fibonacci.add(fibonacci.get(i-1) + fibonacci.get(i-2));
            if (indiceFibonacci == fibonacci.get(i)){
                System.out.println("Soma Fibonacci: " + fibonacci);
                System.out.println("O número informado está na sequencia Fibonacci e se encontra na posição: " + (i+1));
            }
        }
    }

    public static void exercicio3(){
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB= new ArrayList<>();
        ArrayList<Integer> listC = new ArrayList<>();
        ArrayList<Integer> listD = new ArrayList<>();
        ArrayList<Integer> listE = new ArrayList<>();
        ArrayList<Integer> listImpar = new ArrayList<>();
        ArrayList<Integer> listDSoma = new ArrayList<>();
        ArrayList<Integer> listEFib = new ArrayList<>();

        listA.add(1);
        listB.add(2);
        listC.add(0);
        listC.add(1);
        listD.add(4);
        listDSoma.add(12);
        listE.add(1);
        listEFib.add(0);
        listEFib.add(1);

        for (int a = 0; a < 5; a++){
            listA.add(listA.get(a) + 2);
        }
        System.out.println("A: " + listA);

        for (int b = 0; b < 7; b++){
            listB.add(listB.get(b) * 2);
        }
        System.out.println("B: " + listB);

        for (int c = 0 ; c < 17; c++){
            if (c % 2 != 0){
                listImpar.add(c);
            }
        }
        for (int c = 2; c < 9; c++){
            listC.add(listC.get(c-1) + listImpar.get(c-1));
        }
        System.out.println("C: " + listC);

        for (int d = 0; d < 5; d++){
            listD.add(listD.get(d) + listDSoma.get(d));
            listDSoma.add(listDSoma.get(d) + 8);
        }
        System.out.println("D: " + listD);

        for (int e = 2; e < 9; e++){
            listEFib.add(listEFib.get(e-1) + listEFib.get(e-2));
            listE.add(listE.get(e-2) + listEFib.get(e-2));
        }
        System.out.println("E: " + listE);

        int ultimoPar = 18;
        int ultimoImpar = 19;

        int proximoPar = ultimoPar + 8;
        System.out.println("Próximo número par: " + proximoPar);

        int proximoImpar = ultimoImpar - 1;
        System.out.println("Próximo número ímpar: " + proximoImpar);
    }

    private static boolean interruptor1Ligado;
    private static boolean interruptor2Ligado;
    private static boolean interruptor3Ligado;
    private static int tempo;
    private static boolean lampada1Acesa;
    private static boolean lampada1Quente;
    private static boolean lampada2Acesa;
    private static boolean lampada2Quente;
    private static boolean lampada3Acesa;
    private static boolean lampada3Quente;
    public static void exercicio4(){

        boolean interruptor1Ligado = false;
        boolean interruptor2Ligado = false;
        boolean interruptor3Ligado = false;

        // Primeira ida:
        // Ligando o interruptor 1 por 10 minutos
        interruptor1Ligado = true;
        tempo = 10;
        interruptor1Ligado = false;

        // Ligando o interruptor 2 por 5 minutos
        interruptor2Ligado = true;
        tempo = 5;

        // Segunda ida:
        // Verificando o estado das lâmpadas
        if (lampada1Acesa) {
            // Interruptor 3 controla a lâmpada 1
            System.out.println("Interruptor 3 controla a lâmpada 1");
        } else if (lampada1Quente) {
            // Interruptor 1 controla a lâmpada 1
            System.out.println("Interruptor 1 controla a lâmpada 1");
        } else {
            // Interruptor 2 controla a lâmpada 1
            System.out.println("Interruptor 2 controla a lâmpada 1");
        }

        if (lampada2Acesa) {
            // Interruptor 2 controla a lâmpada 2
            System.out.println("Interruptor 2 controla a lâmpada 2");
        } else if (lampada2Quente) {
            // Interruptor 3 controla a lâmpada 2
            System.out.println("Interruptor 3 controla a lâmpada 2");
        } else {
            // Interruptor 1 controla a lâmpada 2
            System.out.println("Interruptor 1 controla a lâmpada 2");
        }

        if (lampada3Acesa) {
            // Interruptor 1 controla a lâmpada 3
            System.out.println("Interruptor 1 controla a lâmpada 3");
        } else if (lampada3Quente) {
            // Interruptor 2 controla a lâmpada 3
            System.out.println("Interruptor 2 controla a lâmpada 3");
        } else {
            // Interruptor 3 controla a lâmpada 3
            System.out.println("Interruptor 3 controla a lâmpada 3");
        }
    }

    public static void exercicio5(){
        String str = "Olá, mundo!";
        StringBuilder strInvertida = new StringBuilder();

        // Percorrendo a string original de trás para frente
        for (int i = str.length() - 1; i >= 0; i--) {
            // Concatenando cada caractere à string invertida
            strInvertida.append(str.charAt(i));
        }

        // Imprimindo a string invertida
        System.out.println(strInvertida);
    }

}