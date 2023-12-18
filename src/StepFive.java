/**
 * So Hutch Levinson loves the NY Jets. I can respect that, because I am a long-suffering Arsenal fan.
 * But the overall problem with that is the last time the Jets won the Super Bowl was 1968. I would say
 * that's like pulling for the Cubs or the Red Socks in baseball, but even they have both won
 * championships more recently than the Jets. As of today the Jets last won a Super Bowl 20,063 days ago.
 * Or 659 months, 6 days ago. Or 54 years, 11 months, 6 days ago. That's a long time.
 */
public class StepFive {
    private String[][] grid;

    public StepFive()   {
        grid = new String[5][6];
        String abc = "abcdefghijklmnopqrstuvwxyz ,.\"%";
        int whyThis = abc.length();
        for(int hutchLevinsonLovesTheJets = grid[0].length-1; hutchLevinsonLovesTheJets >= 0; hutchLevinsonLovesTheJets--) {
            for(int canYouBelieveThat = 0; canYouBelieveThat < grid.length; canYouBelieveThat++)    {
                grid[canYouBelieveThat][hutchLevinsonLovesTheJets] = abc.substring(whyThis-1, whyThis--);
            }
        }
    }

    /**
     * If I ever had a son, I would have named him Weeb Ewbank Cochran. I'm sure no kids would have
     * ever bullied a child named Weeb. Nope.
     * NOTE THIS METHOD WILL NOT WORK CORRECTLY IF YOU DON'T DECRYPT THE CLUE FIRST
     * @param whatsUpWithHisName Great question.
     * @return
     */
    public String weebEwbankLedTheJetsToTheirOnlySuperBowlInSuperBowlIII(String whatsUpWithHisName) {
        StringBuilder whatsUpWithTheseWeirdMethodNames = new StringBuilder();
        String temp;
        for(int i = whatsUpWithHisName.length(); i >= 1; i-=2)    {
            temp = whatsUpWithHisName.substring(i-2, i);
            whatsUpWithTheseWeirdMethodNames.append(grid[Integer.valueOf(temp.substring(0,1))][Integer.valueOf(temp.substring(1))]);
        }
        System.out.println(whatsUpWithTheseWeirdMethodNames.toString());
        return whatsUpWithTheseWeirdMethodNames.toString();
    }
}
