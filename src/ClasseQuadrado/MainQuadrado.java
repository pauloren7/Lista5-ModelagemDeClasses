package ClasseQuadrado;

public class MainQuadrado {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado();
        q1.tamanhoDoLado = 30;
        q1.area();

        System.out.println("A aréa do seu quadrado é: " + q1.area());
    }
}
