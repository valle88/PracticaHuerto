import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumidor extends Thread{
    private Cesta cesta;
    private String name;

    public Consumidor( String name){

        this.name = name;

    }

    public void run() {
        while (true) {
            try {
                String valor = this.cesta.consumir();
                System.out.println(name +" ha recogido el producto"+ valor+ "del huerto");
                sleep((int) (Math.random() * 400));
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
}
