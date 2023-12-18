import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * You might need this StepTwo class to solve step two. That's it. Have fun with Maps mm'k?
 * Maps help us get from point A to point B. It's that simple.
 * @version 12.17.2023
 * @author Julian Cochran
 */
public class StepTwo {
    private static Map<Integer, String> iAlwaysThoughtTheGuyWasCaryElwes;

    /**
     * Constructor for class StepTwo. That's it. Good luck.
     */
    public StepTwo()    {
        iAlwaysThoughtTheGuyWasCaryElwes = new HashMap<>();
        String url = GriddyMcGridface.apparently("sggkh://trgsfy.xln/qforzmxlxsizm/XGU_12_18_2023/yoly/nzrm/ihixh/tirwdliow.gcg?izd=gifv");
        try {
            Document doccyMcDocFace = Jsoup.connect(url).get();
            String[] thingyMajiggy = doccyMcDocFace.text().split(" ");
            for (String holyCowWhyDidIDoThis : thingyMajiggy) {
                iAlwaysThoughtTheGuyWasCaryElwes.put(Integer.parseInt(holyCowWhyDidIDoThis),
                        Character.toString(Integer.parseInt(holyCowWhyDidIDoThis)));
            }
        }
        catch(Exception e)  {
            e.printStackTrace();
        }
    }

    /**
     * What's it like when your face becomes world-famous?
     *
     * "It's been weirder for the people who know me than it has been for me," Scanlon, 31, tells Thrillist over the
     * phone. When the meme exploded in February, his friends, family, and followers freaked. Some were stunned. Some
     * applauded his comedic timing. Others wondered if he was Michael C. Hall or Cary Elwes from The Princess Bride.
     * ("Nope, that's just my dumb face.")
     * @param ohYesIDidYouKnowILoveTheMemes On occasion, I get accused by my children of being a Boomer. Clearly, my
     *                                      children are idiots.
     * @return whatever, bro
     */
    public String holyCowDidYouHonestlyDoInternetResearchOnDrewScanlon(String ohYesIDidYouKnowILoveTheMemes)    {
        String[] tokens = ohYesIDidYouKnowILoveTheMemes.replace("."," ").split(" ");
        StringBuilder gunners = new StringBuilder();
        GriddyMcGridface griddyFiddy = new GriddyMcGridface();
        griddyFiddy.iLikeTurtles();
        ArrayList<ArrayList<Integer>> mapWhatMapWaitWhat = griddyFiddy.isGabrielMartinelliREALLYTheKeyForArsenal();

        for (String item : tokens) {
            String encryptedChar = iAlwaysThoughtTheGuyWasCaryElwes.get(mapWhatMapWaitWhat.get(Integer.valueOf(item.substring(0,1))).get(Integer.valueOf(item.substring(1))));
            gunners.append(encryptedChar);
        }

        return gunners.toString();
    }
}
