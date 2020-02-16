class Chr1 {
    public static void main(String[] args) {
        Chromosome one = new Chromosome();
        one.info = "Chromosome 1 is the designation for the largest human chromosome."
        + '\n' + "Humans have two copies of chromosome 1, as they do with all of the autosomes,"
        + '\n' + "which are the non-sex chromosomes. Chromosome 1 spans about"
        + '\n' + "249 million nucleotide base pairs, which are the basic units" 
        + '\n' + "of information for DNA. It represents about 8% of the total DNA in human cells."
        +'\n';

        one.number = 1;
        one.genes = 2000;
        one.base_pairs = 247199719;
        one.porcentage_of_bases = 8;
        one.sequence_base_pairs = 224999719;
        one.porcentage_sequence_base_pairs = 91.02;

        Chromosome two = new Chromosome();
        two.info = "Chromosome 2 is one of the twenty-three pairs of chromosomes in humans."
        + '\n' + "People normally have two copies of this chromosome. Chromosome 2 is the second-largest"
        + '\n' + "human chromosome, spanning more than 242 million base pairs and representing almost"
        + '\n' + "eight percent of the total DNA in human cells. Chromosome 2 contains the HOXD homeobox"
        + '\n' + "gene cluster."
        + '\n';
        
        two.number = 2;
        two.genes = 1300;
        two.base_pairs = 242751149;
        two.porcentage_of_bases = 7.9;
        two.sequence_base_pairs = 237712649;
        two.porcentage_sequence_base_pairs = 97.92;

        //Testing 
        one.display_all();
        two.display_all();

        /* Chromosome Template
        Chromosome one = new Chromosome();
        one.info = 
        one.number = 
        one.genes = 
        one.base_pairs = 
        one.porcentage_of_bases = 
        one.sequence_base_pairs = 
        one.porcentage_sequence_base_pairs = */
    }

}