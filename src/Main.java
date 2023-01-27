public class Main {
    public static void main(String[] args) throws Exception {
    
            System.out.println("Exercicio retornos");
           
            double areaQuadrado = Quadrilatero.area(3);
            double areaRetangulo = Quadrilatero.area(5, 5);
            double areaTrapezio = Quadrilatero.area(7, 8, 9);
            double areaLosangulo = Quadrilatero.area(5, 5);

            System.out.println("A Area do Quadrado é: " + areaQuadrado);
            System.out.println("A Area do Retangulo é: " + areaRetangulo);
            System.out.println("A Area do Trapézio é: " + areaTrapezio);
            System.out.println("A Area do Losangulo é: " + areaLosangulo);

    }
}
