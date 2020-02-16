public class Chromosome {
    String info;
    int number;
    int genes;
    long base_pairs;
    double porcentage_of_bases;
    long sequence_base_pairs;
    double porcentage_sequence_base_pairs;

    void display_info() {
        System.out.println(
            '\n' + "Information about this chromosome: " 
            + '\n' + info
        );
    }

    void display_number() {
        System.out.println(
            '\n' + "This is the number of the chromosome: "
            + '\n' + number + " is the number of the chromosome"
            + '\n'
        );
    }

    void display_genes() {
        System.out.println(
            '\n' + "This is the amount of genes: "
            + '\n' + genes 
            + " genes"
            + '\n'
        );
    }

    void display_base_pairs() {
        System.out.println(
            '\n' + "This is the amount of base pairs: "
            + '\n' + base_pairs 
            + " base pairs"
            + '\n'
        );
    }

    void display_porcentage_of_bases() {
        System.out.println(
            '\n' + "This is the percentage of bases: "
            + '\n' + porcentage_of_bases 
            + "% of bases"
            + '\n'
        );
    }

    void display_porcentage_sequence_base_pairs() {
        System.out.println(
            '\n' + "This is the amount of sequence base pairs: "
            + '\n' + porcentage_sequence_base_pairs 
            + "% of sequence base pairs"
            + '\n'
        );
    }
         
    void display_sequence_base_pairs() {
        System.out.println(
            '\n' + "This is the sequence base pairs: "
            + '\n' + sequence_base_pairs 
            + " sequence base pairs"
            + '\n'
        );
    }
    
    void display_all() {
        display_info();
        display_number();
        display_genes();
        display_base_pairs();
        display_porcentage_of_bases();
        display_porcentage_sequence_base_pairs();
        display_sequence_base_pairs();
    }
    
}