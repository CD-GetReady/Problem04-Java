package cd.get.ready.algorithms;

import java.util.ArrayList;
import java.util.List;

public class DogWalker {
    public int numberOfWalksCalculator(int[] dogSizes){
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < dogSizes.length; i++) 
        {
            list.add(dogSizes[i]);
        }
        int numberOfWalks = list.size();
        return numberOfWalks;
    }
}
