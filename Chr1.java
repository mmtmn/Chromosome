class Chr1 {
    public static void main(String[] args) {
        Chromosome one = new Chromosome();
        one.info = "Chromosome 1 is the designation for the largest human chromosome."
        + '\n' + "Humans have two copies of chromosome 1, as they do with all of the autosomes,"
        + '\n' + "which are the non-sex chromosomes. Chromosome 1 spans about"
        + '\n' + "249 million nucleotide base pairs, which are the basic units" 
        + '\n' + "of information for DNA. It represents about 8% of the total DNA in human cells.";

        one.number = 1;
        one.genes = 2000;
        one.base_pairs = 247199719;
        one.porcentage_of_bases = 8;
        one.sequence_base_pairs = 224999719;
        one.porcentage_sequence_base_pairs = 91.02;

        one.display_all();

        
    }

}