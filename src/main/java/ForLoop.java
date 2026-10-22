public class ForLoop {

    public static void main(String[] args) throws InterruptedException {
        //title
        System.out.println("*** For Loop ***\nStarting countdown...");

        for (int i = 10; i > 0; --i) { //set counter 10, as long as number is greater than 0, keep running the loop and subtract 1 each time
            System.out.println(i + "..."); //print loop with update -1 10,9,8../ added more console display
            Thread.sleep(1000); //pause 1 sec per each number-counter/countdown effect
        }

        System.out.println("Launch!!!"); //after countdown display message
    }
}
