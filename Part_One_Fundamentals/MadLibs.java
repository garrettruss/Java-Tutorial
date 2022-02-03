package Part_One_Fundamentals;
public class MadLibs {
    /*
     * This program generates a mad libbed story. Author: Garrett Date: 6/14/2021
     */
    public static void main(String[] args) {

        String name1 = "Garrett";
        String adjective1 = "great";
        String adjective2 = "fantastic";
        String adjective3 = "funny";
        String verb1 = "sing";
        String noun1 = "wasp";
        String noun2 = "honey";
        String noun3 = "song";
        String noun4 = "mouse";
        String noun5 = "maple syrup";
        String noun6 = "trees";
        String name2 = "Cathryn";
        int number = 27;
        String place1 = "Newport";

        // The template for the story
        String story = "This morning " + name1 + " woke up feeling " + adjective1 + ". 'It is going to be a "
                + adjective2 + " day!' Outside, a bunch of " + noun1 + "s were protesting to keep " + noun2
                + " in stores. They began to " + verb1 + " to the rhythm of the " + noun3 + ", which made all the "
                + noun4 + "s very " + adjective3 + ". Concerned, " + name1 + " texted " + name2 + ", who flew " + name1
                + " to " + place1 + " and dropped " + name1 + " in a puddle of frozen " + noun5 + ". " + name1
                + " woke up in the year " + number + ", in a world where " + noun6 + "s ruled the world.";

        System.out.println(story);
    }
}