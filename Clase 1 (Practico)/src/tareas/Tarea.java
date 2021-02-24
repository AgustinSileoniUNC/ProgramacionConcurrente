package tareas;

public class Tarea {
    
    public Tarea(){

        System.out.printf("En Tarea thread \"%s\":", Thread.currentThread().getName());

        Calculator calc1 = new Calculator(4);
        Calculator calc2 = new Calculator(5);
        Thread h1 = new Thread(calc1);
        Thread h2 = new Thread(calc2);
        System.out.print("\n");
        h1.start();
        h2.start();

    }

}
