public class Chromosome {
    String info;
    int number;
    int genes;
    int base_pairs;
    double porcentage_of_bases;
    int sequence_base_pairs;
    double porcentage_sequence_base_pairs;

    void display_info() {
        System.out.println(
            "Information about this chromosome: " 
            + info
        );
    }

    void display_number() {
        System.out.println(
            "This is the number of the chromosome: "
            + '\n' + number + '\n'
        );
    }

    void display_genes() {
        System.out.println(
        "This is the amount of genes: "
        + '\n' + genes + '\n'
        );
    }

    void display_base_pairs() {
        System.out.println(
        "This is the amount of base pairs: "
        + '\n' + base_pairs + '\n'
        );
    }

    void display_porcentage_of_bases() {
        System.out.println(
        "This is the percentage of bases: "
        + '\n' + porcentage_of_bases + '\n'
        );
    }

    void display_porcentage_sequence_base_pairs() {
        System.out.println(
        "This is the amount of sequence base pairs: "
        + '\n' + porcentage_sequence_base_pairs + '\n'
        );
    }
         
    void display_sequence_base_pairs() {
        System.out.println(
        "This is the sequence base pairs: "
        + '\n' + sequence_base_pairs + '\n'
        );
    }
    
    void display_all() {
        System.out.println(
            '\n' + "Information about this chromosome:" 
            + '\n' + info
        );

        System.out.println(
        "This is the amount of genes: "
        + '\n' + genes + '\n'
        );

        System.out.println(
        "This is the amount of genes: "
        + '\n' + genes + '\n'
        );

        System.out.println(
        "This is the amount of base pairs: "
        + '\n' + base_pairs + '\n'
        );

        System.out.println(
        "This is the percentage of bases: "
        + '\n' + porcentage_of_bases + '\n'
        );

        System.out.println(
        "This is the amount of sequence base pairs: "
        + '\n' + porcentage_sequence_base_pairs + '\n'
        );

        System.out.println(
        "This is the sequence base pairs: "
        + '\n' + sequence_base_pairs + '\n'
        );
    }
    
}