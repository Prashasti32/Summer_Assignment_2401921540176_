package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {
        
        // a. Create an instance of Veena and call play() method
        System.out.println("--- Testing Veena Instance ---");
        Veena veena = new Veena();
        veena.play();

        /
        System.out.println("\n--- Testing Saxophone Instance ---");
        Saxophone saxophone = new Saxophone();
        saxophone.play();

      
        System.out.println("\n--- Testing Playable Reference ---");
        Playable playable1 = veena; 
        playable1.play();

        Playable playable2 = saxophone; 
        playable2.play();
    }
}