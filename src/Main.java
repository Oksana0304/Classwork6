import com.brunotest.BrunoQueue;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        BrunoQueue<String> myQueue = new BrunoQueue<String>();

        myQueue.add("Billy");
        myQueue.add("Villy");
        myQueue.add("Dilly");
        myQueue.add("Ponka");

        for (String str : myQueue) {
            System.out.println(str);
        }
    }
}

