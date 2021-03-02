import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class Buffer1 implements Buffer<E>{
    
    private final List<E> data;
    private final int SIZE;

    public Buffer1 (int size){
        this.SIZE = size;
        data = new ArrayList<E>();
    }

}
