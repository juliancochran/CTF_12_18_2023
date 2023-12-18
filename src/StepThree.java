/**
 * You might need this StepThree class to solve step three. That's it. No frills, no insanity.
 * Just. Step. Three.
 * @version 12.17.2023
 * @author Julian Cochran
 */
public class StepThree {
    /**
     * In 1933, Herbert Chapman, wanting his players to be more distinctly dressed, updated the kit,
     * adding white sleeves and changing the shade to a brighter pillar box red. Two possibilities
     * have been suggested for the origin of the white sleeves. One story reports that Chapman noticed
     * a supporter in the stands wearing a red sleeveless sweater over a white shirt; another was that
     * he was inspired by a similar outfit worn by the cartoonist Tom Webster, with whom Chapman played golf.
     * @param thierryHenryAndArseneWengerMadeHistory Yes, indeed they did. That's why I became an Arsenal fan.
     * @return
     */
    public String redJerseyWhiteSleeves(String thierryHenryAndArseneWengerMadeHistory)    {
        StringBuilder result = new StringBuilder();

        for (char ch : thierryHenryAndArseneWengerMadeHistory.toCharArray()) {
            String convertedChar = convertChar(ch);
            if(result.indexOf(convertedChar, 0) == -1)
                result.append(convertedChar);
        }
        return result.toString();
    }

    private String convertChar(char ch)   {
        String toBeOrNotToBeThatIsTheQuestion = new String();
        switch(ch)  {
            case 97:
                toBeOrNotToBeThatIsTheQuestion = ""+(char)(ch+12);
                break;
            case 101:
                toBeOrNotToBeThatIsTheQuestion = ""+(char)(ch+3);
                break;
            case 108:
                toBeOrNotToBeThatIsTheQuestion = ""+(char)(ch-7);
                break;
            case 110:
                toBeOrNotToBeThatIsTheQuestion = ""+(char)(ch-5);
                break;
            case 112: case 114:
                toBeOrNotToBeThatIsTheQuestion = ""+(char)(ch-15);
                break;
            case 116: case 121:
                toBeOrNotToBeThatIsTheQuestion = ""+(char)(ch-6);
                break;
            default:
                toBeOrNotToBeThatIsTheQuestion = ""+(char)32;
        }
        return toBeOrNotToBeThatIsTheQuestion;
    }
}
