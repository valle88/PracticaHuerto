import java.util.logging.Level;
import java.util.logging.Logger;

public class Cesta {

    private String[] cesta;
    private int siguiente;
    private boolean estaLlena;
    private boolean estaVacia;


    public Cesta(int tamano){
        this.cesta = new String[tamano];
        this.siguiente = 0;
        this.estaVacia = true;
        this.estaLlena = false;

    }

    public synchronized String consumir(){
        while (this.estaVacia){
            try{
                wait();
            }catch(InterruptedException ex){
                Logger.getLogger(Cesta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        siguiente--;
        this.estaLlena = false;
        if (siguiente == 0){
            this.estaVacia = true;
        }
        notifyAll();
        return this.cesta[this.siguiente];
    }
    public synchronized void producir(String vegetal) {
        while (this.estaLlena){
            try {
               wait();
            }catch (InterruptedException ex){
                Logger.getLogger(Cesta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        cesta[siguiente]= vegetal;
        siguiente ++;
        this.estaVacia= false;
        if (siguiente == this.cesta.length){
            this.estaLlena = true;
        }
        notifyAll();
    }
}
