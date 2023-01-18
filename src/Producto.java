import javax.print.DocFlavor;
import java.util.Random;

public class Producto extends Thread{
 private Cesta cesta;

 public String name;
 public  String [] vegetable = {"lettuce", "cabbage", "onion" ,"spincha", "potato", "celery","asparagus",
         "radish","brocoli", "artichoke", "tomato", "cucumber", "eggplant", "carrot", "green bean" };

 public Producto( String name){
  this.name = name;

 }

 public void run(){
  while(true){
    try {
     int a = (int)(Math.random()*vegetable.length);


     System.out.println(name + " ha depositado " + vegetable[a] + " en la cesta");
     sleep((int) (Math.random()*4000));
    } catch (InterruptedException e) {
     throw new RuntimeException(e);
    }

 }


 


}
}



