import java.util.ArrayList;
import java.util.HashMap;

public class WhiskyCollector {
    private String name;
    private ArrayList<Whisky> collection;

    public WhiskyCollector(String name){
        this.name = name;
        this.collection = new ArrayList<Whisky>();
    }

    public void addWhisky(Whisky whisky) {
        this.collection.add(whisky);
    }

    public int numberOfWhiskys() {
        return this.collection.size();
    }

    public ArrayList<Whisky> findAllWhiskyByType(WhiskyType whiskyType) {
        ArrayList<Whisky> foundWhiskys = new ArrayList<Whisky>();

        for(Whisky whisky : this.collection){
            if(whisky.getWhiskyType() == whiskyType){
                foundWhiskys.add(whisky);
            }
        }
        return foundWhiskys;
    }

    public HashMap<WhiskyType, Integer> countWhiskysByType() {
        // create empty result hashmap
        HashMap<WhiskyType, Integer> stock = new HashMap<WhiskyType, Integer>();
        //loop through all whiskys
        for(Whisky whisky : this.collection){
            //if it is already there, then increment the value by 1
            if(stock.containsKey(whisky.getWhiskyType())){
                WhiskyType whiskyType = whisky.getWhiskyType();
                Integer updatedCount = stock.get(whisky.getWhiskyType()) +1;
                stock.put(whiskyType, updatedCount);
            } else {
                //if the whiskytype is not present in the hashmap, add it a key with a value of 1
                stock.put(whisky.getWhiskyType(), 1);
            }
        }
        System.out.println(stock);
        return stock;

    }
}
