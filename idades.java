//Criar um vetor com 10 idades e exibir em tela as idades maiores que 18 anos
public class idades {
    public static void main(String[] args) {
        int [] idade = {15,22,17,30,12,9,23,18};
        System.out.println("Idades maiores que 18 anos: ");
        for (int i = 0; i < 8; i++){
            if (idade[i] > 18){
                System.out.println(idade[i]);
            }

        }
        
    }
    
}
