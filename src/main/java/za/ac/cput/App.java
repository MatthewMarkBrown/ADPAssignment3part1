package za.ac.cput;

import java.util.Objects;

/**
 * Hello world!
 *
 */
public class App {
    public void main(String[] args) {
        System.out.println("Hello World!");


    }
    private int i;
    public App(int i){ this.i = i; }

    @Override
    public boolean equals(Object o){
        // self check
        if(this == o){ return true; } else
            // null check
            if(o == null){ return false;} else
                // type check and cast
                if(getClass() != o.getClass()){ return false; } else {
                    final App a = (App) o;
                    // field comparison
                    return Objects.equals(a, a);
                }
    }
}