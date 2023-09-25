import java.util.*;

public class classassigner {
    static int availableAclass = 1;
    static int availableBclass = 1;
    static int availableCclass = 1;
    static int availableWclass =1;


    //in here <Integer> it's teacher's id for identifying
    static Queue<Integer> waitingclass = new LinkedList<>();//Queue for Wclass bcs want to assign class orderly to teachers
    static List<Integer> assignedclassList = new ArrayList<>(); //it's for who confirm to assign in class, assignedclassList for their id stored

    //getting which class's type like example A7, A8, A9
    static List<Integer> AclassPosition = new ArrayList<>(Arrays.asList(1)); // now have one class so assigned 1
    static List<Integer> BclassPosition = new ArrayList<>(Arrays.asList(1));
    static  List<Integer> CclassPosition = new ArrayList<>(Arrays.asList(1));
    static List<Integer> WclassPosition = new ArrayList<>(Arrays.asList(1));

    //Map Created for teacher Id and teacher connected if click cancel remove teacher
    static Map<Integer, Teacher> Teachers = new HashMap<>();


}
