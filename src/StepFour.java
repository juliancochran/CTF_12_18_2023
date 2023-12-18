import java.util.ArrayList;
import java.util.Stack;

/**
 * IHOP's promotional Wonka's Perfectly Purple Pancakes contain 1160 calories. 9% of those calories come from protein,
 * 58% of the calories are carbohydrates, and 33% of the calories are from fats. There are 88 grams of sugar in a full
 * stack (4) of pancakes. To burn that amount of calories, the average human would have to walk at 3 mph for 312 minutes,
 * run at 6 mph for 112 minutes, or bike at 10 mph for 161 minutes.
 * @version 12.17.2023
 * @author Julian Cochran
 */
public class StepFour {
    private Stack<String> ihopIsSellingPurplePancakesToPromoteTheNewWillyWonkaMovie;

    public StepFour()   {
        ihopIsSellingPurplePancakesToPromoteTheNewWillyWonkaMovie = new Stack<>();
    }

    /**
     * I mean, let's get real here. Gene Wilder is and will always be the best Willy Wonka. I know Johnny
     * Depp tried to make it happen. Yeah, right. But now Timothee Chalamet? Seriously people? Get real.
     * @param clue More numbers to make you consumed. I mean confused.
     * @return Some important stuff
     */
    public String noOneCanTopGeneWilderAsTheOriginalWonkaTimotheeChalametIsASecondRateHasBeen(String clue) {
        String[] tokens = clue.split(" ");
        for(String token : tokens)  {
            ihopIsSellingPurplePancakesToPromoteTheNewWillyWonkaMovie.push(token);
        }
        GriddyMcGridface griddyFiddy = new GriddyMcGridface();
        griddyFiddy.iLikeTurtles();
        ArrayList<ArrayList<Integer>> stackWhatStackWaitWhat = griddyFiddy.isGabrielMartinelliREALLYTheKeyForArsenal();
        String perfectlyPurplePancakes = "", temp = "";
        while(!ihopIsSellingPurplePancakesToPromoteTheNewWillyWonkaMovie.isEmpty()) {
            temp = ihopIsSellingPurplePancakesToPromoteTheNewWillyWonkaMovie.pop();
            perfectlyPurplePancakes += stackWhatStackWaitWhat.get(Integer.valueOf(temp.substring(0,1))).get(Integer.valueOf(temp.substring(1)));
            perfectlyPurplePancakes += " ";
        }

        return perfectlyPurplePancakes;
    }
}
