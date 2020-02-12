package cap02_fundamentosLinguagem;

public class CalculadoraProfessor {
    public static void main(String[] args) {
        // indica se a formula será exibida
        boolean exibirFormula = false;
        
        // constante PI
        float pi = 3.14f;

        // raio - informado pelo professor
        float raio = 5.3f;

        // area é igual ao raio ao quadrado multiplicado por PI
        float area = raio * raio * pi;
        int areaSemCasasDecimais = (int) area;

        if (exibirFormula) {
            System.out.println("Area = " + raio + " * " + raio + " * " + pi);
        }

        System.out.println("A área é: " + area);
        System.out.println("A área sem casas decimais é: " + areaSemCasasDecimais);
    }
}