/**
 * Well young Padwan, we've reached the end of this crazy journey together. Have you had fun? I sure hope so.
 * Enjoy this fun while it lasts, and please, have a lovely winter break. Be safe. Make good decisions.
 * Come back to school in January ready to rock and roll in AP Comp Sci!
 * @version 12.17.2023
 * @author Julian Cochran
 */
public class StepSix {
    /**
     * This is a comment. I would describe this method using something about Arsenal or the New York Jets, but it's
     * late and honestly, I'm out of ideas.
     * @param ciphertext You can probably guess what this is
     * @param keyword Now why would an encryption scheme need a keyword?
     * @return
     */
    public String iWouldGiveThisMethodACrazyNameButIveRunOutOfIdeas(String ciphertext, String keyword) {
        StringBuilder letsHideThisRizz = new StringBuilder();

        for (int i = 0; i < ciphertext.length(); i++) {
            char cipherChar = ciphertext.charAt(i);
            char keyChar = keyword.charAt(i % keyword.length());
            char decryptedChar = decryptChar(cipherChar, keyChar);
            letsHideThisRizz.append(decryptedChar);
        }
        return letsHideThisRizz.toString();
    }

    /**
     * This should be pretty obvious.
     * @param cipherChar
     * @param keyChar
     * @return
     */
    private static char decryptChar(char cipherChar, char keyChar) {
        if (Character.isUpperCase(cipherChar)) {
            int result = (cipherChar - keyChar + 26) % 26 + 'A';
            return (char) result;
        } else if (Character.isLowerCase(cipherChar)) {
            int result = (cipherChar - keyChar + 26) % 26 + 'a';
            return (char) result;
        } else {
            return cipherChar;
        }
    }

    /**
     * Steganography is the practice of concealing messages, information, or objects within other non-secret data.
     * The idea is to make the hidden content blend in with its surroundings, making it less noticeable to the
     * casual observer. In the physical world, hiding something in plain sight might involve disguising it as an
     * everyday object or incorporating it into a common environment. This could range from hiding valuables in
     * plain-looking containers to using camouflage or clever disguises.
     * @param iWonderWhatAllThoseNumbersMean They are rather plain-looking containers, aren't they?
     * @param keyword
     * @return
     */
    public String canYouHideIt(String iWonderWhatAllThoseNumbersMean, String keyword)    {
        GriddyMcGridface griddyFiddy = new GriddyMcGridface();
        griddyFiddy.iLikeTurtles();
        return iWouldGiveThisMethodACrazyNameButIveRunOutOfIdeas(griddyFiddy.imJustHereForTheComments(iWonderWhatAllThoseNumbersMean),
                keyword.substring(1,3)+keyword.substring(3,keyword.length()-keyword.substring(7).length()));
    }
}
