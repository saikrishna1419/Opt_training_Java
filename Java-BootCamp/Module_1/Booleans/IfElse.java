public class IfElse {

    public static void main(String[] args) {

        int chemistryGrade = 95;
        int biologyGrade = 75;
        System.out.println("Me: Hi Java, did I score better in biology?");
        // Add if-else statement here
        if(biologyGrade > chemistryGrade){
            System.out.println("Yes you did, congrats!");
        }else{
            System.out.println("Not his time");
        }

        double sales = 37.55;
        double costs = 5.55;
        System.out.println("Me: Hi Java, did we make money?");
        // Add if-else statement here
        if(sales> costs){
            System.out.println("Yes your are rich!");
        }else{
            System.out.println("Not his time");
        }


        double temperature = 15.5;
        double targetTemperature = 20.0;
        System.out.println("Me: Hi Java, is the temperature colder than our target?");
        // Add if-else statement here
        if(temperature < targetTemperature){
            System.out.println("Yes, its freezing cold");
        }else{
            System.out.println("No, it's hot");
        }


        int currentSpeed = 60;
        int speedLimit = 70;
        System.out.println("Me: Hi Java, am I driving slower than the speed limit?");
        // Add if-else statement here
        if(currentSpeed < speedLimit){
            System.out.println("Yes you are too slow");
        }else{
            System.out.println("No, you are in speed limit");
        }


        int age = 45;
        int retirementAge = 65;
        System.out.println("Me: Hi Java, am I old enough to retire?");
        // Add if-else statement here
        if(age >= retirementAge){
            System.out.println("Yes, you can retire");
        }else{
            System.out.println("No, you can still work");
        }


        char myGrade = 'A';
        char bestGrade = 'A';
        System.out.println("Me: Hi Java, did I get the best possible grade?");
        // Add if-else statement here
        if(myGrade == bestGrade){
            System.out.println("Yes you are the best");
        }else{
            System.out.println("Not his time");
        }


        String word = "hello";
        String secondWord = "hello";
        System.out.println("Me: Are the two words the same?");
        // Add if-else statement here
        if(word.equals(secondWord)){
            System.out.println("Yes, both are same!");
        }else{
            System.out.println("Nope!");
        }


        String thirdWord = "hello";
        String fourthWord = "goodbye";
        System.out.println("Me: Are the two words different");
        // Add if-else statement here
        if(!thirdWord.equals(fourthWord)){
            System.out.println("Yes, different");
        }else{
            System.out.println("Not same");
        }

    }
}
