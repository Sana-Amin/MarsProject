public class Mars {
    public static void main(String[] args) throws InterruptedException {
        String colonyName = "redTown";
        int shipPopulation = 300;
        double shipFood = 4000.00;
        boolean landing = true;
        String landingLocation = "The Ocean";

        if (landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzz Landing on the Plain");
        } else {
            System.out.println("Error!!!! Flight plan already set. Landing on the Plain");
        }

        landing = landingCheck(100);

        new GuessingGame();
        new MarsExpedition();
        new FindingsLists();

        shipFood = (shipFood - (shipPopulation * 0.75)) * 2;
        System.out.println("The amount of food that is left is:" + shipFood);

        double extraCrate = .50;

        shipFood = shipFood + (shipFood * extraCrate);

        shipPopulation = shipPopulation + 5;




    }

        public static boolean landingCheck(int loops) throws InterruptedException {
            for (int i =0; i <= loops; i++){
                if(i % 3 ==0 && i % 5 ==0){
                    System.out.println("Keep Center");
                }else if(i % 5 == 0){
                    System.out.println("Right");
                }else{
                    System.out.println("Calculating");
                }
                Thread.sleep(250);
            }
            System.out.println("landed");

            return false;

        }


}