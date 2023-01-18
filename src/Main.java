public class Main {
    public static void main(String[] args) {
        Cesta b = new Cesta(1);
        Producto paco = new Producto(b);
        Consumidor valle = new Consumidor(b);



        paco.start();
        valle.start();




    }
}