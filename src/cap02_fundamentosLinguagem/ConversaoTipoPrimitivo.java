package cap02_fundamentosLinguagem;

public class ConversaoTipoPrimitivo {
    public static void main(String[] args) {        
        long x = 9300000035L;
        // casting
        int y = (int) x;
        System.out.println(y);

        double a = 20.5;
        float b = (float) a;
        System.out.println(b);

        float c = 934.5f;
        // casting automática, pois double é maior que float
        double d = c;
        System.out.println(d);

        double largura = 100.37;
        int tamanho = (int) largura;
        System.out.println(tamanho);
    }
}