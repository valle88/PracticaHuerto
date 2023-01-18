public class Main {
    public static void main(String[] args) {
        Cesta b = new Cesta(6);
        Producto paco = new Producto("Paco");
        Consumidor valle = new Consumidor("valle");



        try {
            paco.start();
            Thread.sleep(3000);
            valle.start();

            paco.join();
            valle.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }





    }
}