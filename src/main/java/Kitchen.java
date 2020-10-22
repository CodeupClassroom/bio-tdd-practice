import java.util.Arrays;

public class Kitchen {

    private String[] tortillas;

    public Kitchen(){
        this.tortillas = new String[0];
    }

    public boolean isEmpty(){
        return tortillas.length == 0;
    }

    public void add(String tortilla){
        String[] copy = Arrays.copyOf(tortillas, tortillas.length+1);
        copy[tortillas.length] = tortilla;
        tortillas = copy;
    }

    public void pop(){
        tortillas[tortillas.length-1] = null;
        String[] copy = Arrays.copyOf(tortillas, tortillas.length-1);
        tortillas = copy;
    }

    public boolean contains(String tortilla){
        for (int i = 0; i < tortillas.length; i++){
            if(tortillas[i].equals(tortilla))
                return true;
        }
        return false;
    }

    public void printAll(){
        for (int i = tortillas.length-1; i >= 0; i--){
            System.out.println("tortillas["+i+"] " + tortillas[i]);
        }
    }

    public int size(){
        return tortillas.length;
    }

}