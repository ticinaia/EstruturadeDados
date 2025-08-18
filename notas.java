//Criar um vetor com 4 notas e exibir em tela a média aritmética das notas
public class notas {
    public static void main(String[] args) {
        double[] notas = {7.5, 8.0, 6.5, 9.0};
        double soma = 0;
        for (int i = 0; i < 4; i++){
            soma += notas[i];
        double media = (soma / notas.length);
        System.out.println("Média das notas: "+ media);
        }

    }

    }
    

