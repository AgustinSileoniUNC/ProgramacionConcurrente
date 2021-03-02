import java.nio.Buffer;
import java.util.Random;

public class Consumidor implements Runnable{
    
    private final Random random = new Random();
    private final Buffer<Character> buffer;

    public Consumidor (Buffer<Character> buffer){
        this.buffer = buffer;
    }

    public void run(){
        while(true){
            try{
                Character msg = buffer.get();
                Thread.sleep(random.nextInt(2)*1000);
            }
            catch(InterruptedException e){

            }
        }
    }

}
