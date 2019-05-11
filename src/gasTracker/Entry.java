package gasTracker;

import java.util.ArrayList;

public class Entry {

    private int currKM;
    private int prevKM;
    private float cost;
    private float litres;

    public Entry(int currKM, int prevKM, float cost, float litres) {
        this.currKM = currKM;
        this.prevKM = prevKM;
        this.cost = cost;
        this.litres = litres;

    }

    protected float printAvg(ArrayList<Entry> entries) {
        float entryCost = 0;
        for (int i = 0; i < entries.size(); i++) {
            entryCost = entryCost + entries.get(i).cost;
        }
        int size = entries.size();
        entryCost = entryCost / size;
        return entryCost;
    }

    protected float printConsumption(ArrayList<Entry> entries) {
        float entryConsumption = 0;
        for (int i = 0; i < entries.size(); i++) {

        }
        return 0;
    }
}