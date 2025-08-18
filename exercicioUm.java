//Crie um programa que armazene as notas de 10 alunos recebidas pelo usuário. O programa deve retornar a maior nota em tela.
import java.util.Scanner;
public class exercicioUm {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double [] notas = new double [10];
        double maiorNota = 0;
        for (int i = 0; i < 10; i++){
            System.out.println("Digite sua nota: ");
            notas [i] = entrada.nextDouble();
            if (notas[i]> maiorNota){
                maiorNota = notas[i];
            }
        }
        System.out.println("\nA maior nota é: " + maiorNota);
        entrada.close();
    }
    
}
