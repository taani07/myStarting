package blind75;

import java.util.ArrayList;
import java.util.List;

public class kidsWithCandies {


    public List<Boolean> kidswithCandies(int[] candies, int extracandies) {
        List<Boolean> listofbooleans = new ArrayList<>();
        int greatest = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > greatest) {
                greatest = candies[i];

            }
        }
        for (int candy : candies) {
            if (extracandies + candy >= greatest) {
                listofbooleans.add(true);
            } else {
                listofbooleans.add(false);
            }
        }


       return listofbooleans;
    }

}
