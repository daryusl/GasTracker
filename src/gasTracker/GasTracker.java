package gasTracker;

import java.util.ArrayList;
import java.util.Scanner;

public class GasTracker {
    private ArrayList<Entry> entries = new ArrayList<>();
    private int done = 0;

    public GasTracker() {
        while (done == 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("What is your current KM on car?");
            String KM = input.nextLine();
            int currKM = Integer.parseInt(KM);
            System.out.println("What is the cost of your fuel?");
            String c = input.nextLine();
            float cost = Float.parseFloat(c);
            System.out.println("How many litres of gas did you fill?");
            String l = input.nextLine();
            float litres = Float.parseFloat(l);
            Entry entry = new Entry(currKM, 0, cost, litres); // set up the entry

            // want to add object to arraylist
            entries.add(entry);

            // print the avg of fuel cost
            System.out.println("Your fuel cost average is: ");
            System.out.println(entry.printAvg(entries));

            // print avg price/L
            System.out.println("Your avg L/100KM is: ");

            }
        }
    }


