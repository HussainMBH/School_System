import java.util.Scanner;

public class Main {
    public static void assignclass(Teacher t){
        //want to call function from classassigner so created object as a assigner
        classassigner assigner = new classassigner();
        //if no WC is available, means all class are filled. so no class available
        if(classassigner.availableWclass == 0){
            System.out.println("Sorry, No Class Available.");
            return;
        }
        //check if preferred class is available
    }



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean loop = true;
        //loop to get choices from user until he stops
        while (loop){
            System.out.println("1. Assign Class \n 2. Cancel Class \n 3.Available CLass \n 4.Assigned Class \n 5. Exit");
            int choice = s.nextInt();
            switch (choice){
                //assign class
                case 1:{
                    //get details from teacher
                    System.out.println("Enter Teacher name, grade, Class Preference(A, B, C, W)");
                    String name = s.next();
                    String grade = s.next();
                    //get class preference(A, B, C, W)
                    String classPreference = s.next();

                    //create a teacher object. we got details so with that details create teacher object t
                    Teacher t = new Teacher(name, grade, classPreference);
                    //assigning
                    assignclass(t);
                }
            }
        }
    }
}