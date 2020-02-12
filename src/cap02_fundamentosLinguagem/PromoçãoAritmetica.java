package cap02_fundamentosLinguagem;

public class PromoçãoAritmetica {
    public static void main(String[] args) {
        int x = 3;
        int y = 2;
        
        // A divisão irá retornar um inteiro, com isso o resultado será truncado
        // float z = x / y;

        // Para o resultado sair corretamente, é preciso converter um dos valores
        float z = x / (float) y;

        System.out.println(z);
    }
}