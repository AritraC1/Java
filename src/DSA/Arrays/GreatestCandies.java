package DSA.Arrays;

// LC Ques: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/

import java.util.ArrayList;
import java.util.List;

public class GreatestCandies {
    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        List<Boolean> result = maxCandies(candies, extraCandies);
        System.out.println(result);
    }

    static List<Boolean> maxCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int maxCandy = maximum(candies);

        for (int candy : candies) {
            if (extraCandies + candy >= maxCandy) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }

        return ans;
    }

    static int maximum(int[] candies){
        int max = candies[0];

        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        return max;
    }
}
