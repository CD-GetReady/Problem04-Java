package cd.get.ready.algorithms;

import java.util.Arrays;


public class DogWalker {
    public int numberOfWalksCalculator(int[] dogSizes){
        Arrays.sort(dogSizes); // sort the array for easy coding
        int numberOfWalks = 1; // assume that there is at least one dog that will be walked and it will take an hour
        for (int i = 0; i < dogSizes.length-1;) //iterate through the array
        {
            numberOfWalks++; //increase the number of the walks needed 
            if (dogSizes[i] == dogSizes[i+1]) // if the elements next to each other are the same skip to the next two elements
            {
                i+=2;    
            }
            else  // if not only go to the next element 
            {
                i++;
            }
        }
        return numberOfWalks; // return the number of walks
    }
}
