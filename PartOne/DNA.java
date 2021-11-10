// dna
public class DNA {

    public static void main(String[] args) {

        // -. .-. .-. .-. .
        // \ \ / \ \ /
        // / \ \ / \ \
        // ~ `-~ `-` `-~ `-
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";
        String dna = dna3;
        int length = dna.length();
        int start = dna.indexOf("ATG");
        int end = dna.indexOf("TGA");
        System.out.println(end);

        if (start != -1 && end != -1 && (end - start) % 3 == 0) {
            System.out.println("Conditions met");
            String protein = dna.substring(3, 12);
            // String protein2 = dna.substring(start, end+3);
            System.out.println(protein);
            // System.out.println(protein2);
        } else {
            System.out.println("No protein");
        }

    }

}