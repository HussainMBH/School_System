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
        if ((t.classpreference.equals("A") && classassigner.availableAclass > 0)||
        (t.classpreference.equals("B") && classassigner.availableBclass > 0)||
                (t.classpreference.equals("C") && classassigner.availableCclass > 0)){
            System.out.println("Preferred Class Available");
            if(t.classpreference.equals("A")){
                System.out.println("A Class Assigned");
                //call assigning function in the classassigner class
                assigner.assignclass(t, (classassigner.AclassPosition.get(0)),"A");
                //remove the assigned position from available position and also decrease available class of that
                //particular type
                classassigner.AclassPosition.remove(0);
                classassigner.availableAclass --;
            }
            else if(t.classpreference.equals("B")){
                System.out.println("B Class Given");
                //call assigning function in the classassigner class
                assigner.assignclass(t,(classassigner.BclassPosition.get(0)), "B");
                classassigner.BclassPosition.remove(0);
                classassigner.availableBclass --;
            } else if (t.classpreference.equals("C")) {
                System.out.println("C Class Given");
                //call assigning function in the classassigner class
                assigner.assignclass(t,(classassigner.CclassPosition.get(0)), "C");
                classassigner.CclassPosition.remove(0);
                classassigner.availableCclass --;

            }
        } else if (classassigner.availableAclass > 0) {
            System.out.println("A Class Given");
            //call assigning function in the Classassigner class
            assigner.assignclass(t, (classassigner.AclassPosition.get(0)),"A");
            //remove the assigned position from available positions and also decrease available seat of that
            classassigner.AclassPosition.remove(0);
            classassigner.availableAclass--;

        } else if (classassigner.availableBclass > 0) {
            System.out.println(" Class Given");
            //call assigning function in the Classassigner class
            assigner.assignclass(t, (classassigner.BclassPosition.get(0)),"B");
            //remove the assigned position from available positions and also decrease available seat of that
            classassigner.BclassPosition.remove(0);
            classassigner.availableBclass--;
        } else if (classassigner.availableCclass > 0) {
            System.out.println("C Class Given");
            //call assigning function in the Classassigner class
            assigner.assignclass(t, (classassigner.CclassPosition.get(0)),"C");
            //remove the assigned position from available positions and also decrease available seat of that
            classassigner.CclassPosition.remove(0);
            classassigner.availableCclass--;
           }
        //if no class available go to waiting class
        else if (classassigner.availableWclass > 0) {
            System.out.println("Waiting class is here");
            assigner.addTowait(t, (classassigner.WclassPosition.get(0)), "WL");
            }

    }
    //cancel class function




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
                break;
                //Cancel
                case 2:{
                    //get Teacher id to cancel
                    System.out.println("Enter Teacher Id to Cancel");
                    int id = s.nextInt();
                    //cancelClass(id);
                }
                break;
            }
        }
    }
}