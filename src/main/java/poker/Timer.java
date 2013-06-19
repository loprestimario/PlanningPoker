package poker;


public class Timer {

    Timer(){
        System.out.println("\nNew game, starts in 5 seconds:");
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("" + i);
                Thread.sleep(1000);
            }
        }      catch (InterruptedException e) {
            System.out.println(e);
        }

    }
}
