import javax.print.DocFlavor;
import java.util.Random;

public class Producto extends Thread{
 private Cesta cesta;
 public  String [] vegetable = {"lettuce", "cabbage", "onion" ,"spincha", "potato", "celery","asparagus",
         "radish","brocoli", "artichoke", "tomato", "cucumber", "eggplant", "carrot", "green bean" };

 public Producto(Cesta vegetal){
  this.cesta = vegetal;

 }

 public void run(){
  while(true){
    try {
     int a = (int)(Math.random()*vegetable.length);


     System.out.println( vegetable[a] + " es despositado la verdura a la cesta");
     sleep((int) (Math.random()*4000));
    } catch (InterruptedException e) {
     throw new RuntimeException(e);
    }

 }


 


}
}



