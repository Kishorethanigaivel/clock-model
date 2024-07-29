import java.time.LocalTime;
import java.time.format.DateTimeFormatter;;
public class imple implements Runnable{
     public void run(){
        DateTimeFormatter d = DateTimeFormatter.ofPattern("HH:mm:ss");
        while(true){

            try{
            Thread.sleep(1000);
            LocalTime CurrentTime = LocalTime.now();
            System.out.println(d.format(CurrentTime));
            System.out.flush();
        }
        catch(InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
    }

    }
public static void main(String[]args){
    imple clockobj =new imple();
    Thread t =new Thread(clockobj);
    t.start();
}
}
