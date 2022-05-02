public class Numero {
    public static int resultado = 0;
    public static void dividir(int a, int b){
        try {
             resultado = a / b;
        } catch (Exception ex) {
            System.out.println("Nao eh possivel dividir por zero");
            resultado = 0;
        } finally {
            System.out.println(a + " / " + b + " = " + resultado);
        }
    }
}
