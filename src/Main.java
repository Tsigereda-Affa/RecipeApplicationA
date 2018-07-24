import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // this is a recipy book application
        List<String> nameList =new ArrayList<String>();
        List<Integer> portionList =new ArrayList<Integer>();
        List<String> typeOfcuisineList=new ArrayList<String>();
        List<Double> timeToCookList= new ArrayList<Double>();
        List<String> difficultyLevelList= new ArrayList<String>();
        String result = "";
        String resultTop;
        //String Name,Portion,Time,cuisine;
        Scanner sca = new Scanner(System.in);
//        System.out.println("welcome to the recipe book application");

//        Random rand =new Random();
//        int   difficulty = 1+rand.nextInt(3);
//        // System.out.println("difficulty level: " + difficulty );
//        String difficultyLevel="";
//
//        if (difficulty==1){
//            difficultyLevel="easy";
//        }else if (difficulty==2){
//            difficultyLevel="medium";
//        }else if (difficulty==3){
//            difficultyLevel="hard";
//        }
        String userInput = "";

        while (!userInput.contains("quit")) {
            System.out.println("Enter the name of the item:");
            nameList.add(sca.next());
            System.out.println("Enter the serving size :");
            portionList.add(sca.nextInt());
            System.out.println("Enter the type of cusine :");
            typeOfcuisineList.add(sca.next());
            System.out.println("Enter the time it takes to cook :");
            timeToCookList.add(sca.nextDouble());

//            double sample = sca.nextDouble();
//            String formatTimeToCookList = String.format("%.02f", sample);
//            // add to your list

            System.out.println("How difficult is it? (easy,medium, hard)");
            difficultyLevelList.add(sca.next());

//            System.out.println("Do you want to add another item name ? (Type 'quit' to exit): ");
//            userInput = sca.next();
//            resultTop = "Name" + "\t\t" + "portion" + "\t\t\t" + "Time" + "sec\t\t" + "Cuisine";
//            System.out.println(resultTop);
//            result += name + "\t\t" + portion + "\t\t\t" + formatTimeToCook + "sec\t\t" + typeOfcuisine;
//            System.out.println(result);
            System.out.println("Do you want to add another item name ? (Type 'quit' to exit): ");
            userInput = sca.next();
//            userInput = sca.next(); resultTop = "Name" + "\t\t" + "portion" + "\t\t\t" + "Time" + "sec\t\t" + "Cuisine" + "\n";
//            System.out.println(resultTop);
            for (int i=0; i<nameList.size();i++){
                System.out.println("Name List"+ "\t\t" + "Portion List"+ "\t\t" + "CuisineList" + "\t\t" + "Time" + "\t\t" + "Difficulty" );
                System.out.println(nameList.get(i)+ "\t\t" + portionList.get(i)+ "\t\t" + typeOfcuisineList.get(i) + "\t\t" + timeToCookList.get(i) + "\t\t" + difficultyLevelList.get(i) );
//                System.out.println(portionList.get(i));
//                System.out.println(typeOfcuisineList.get(i));
//                System.out.println(timeToCookList.get(i));
//                System.out.println(difficultyLevelList.get(i));
            }

        }
//        resultTop = "Name" + "\t\t" + "portion" + "\t\t\t" + "Time" + "sec\t\t" + "Cuisine";
//        System.out.println(resultTop);
//        result += name + "\t\t" + portion + "\t\t\t" + timeToCook + "sec\t\t" + typeOfcuisine;
//        System.out.println(result);
     //  ArrayList<String> name =new ArrayList<String>("");
       // public static void
    }
}
