public class contaIndividual {

    public static double taxa = 0.05;
    public static double gorjeta = 0.15;
    public static double total;

    public static void findTotal() {
        total =  1 + taxa + gorjeta;
        System.out.println(total);
    }

    public static void main(String[] args) {
    
            double pes01, pes02, pes03, pes04, pes05, pes06, pes07, pes08;

                pes01 = 10;
                double total01 = pes01*( 1 + taxa + gorjeta );
                pes02 = 12;
                pes03 = 9;
                pes04 = 8;
                pes05 = 7;
                pes06 = 15;
                pes07 = 11;
                pes08 = 30;

            System.out.println(total01);

    }

        
}
