public class Main {
    public static void main(String[] args) {
        Cesta b = new Cesta(1);
        Producto paco = new Producto("Paco");
        Consumidor valle = new Consumidor(b,"valle");



        paco.start();
        valle.start();




    }
}