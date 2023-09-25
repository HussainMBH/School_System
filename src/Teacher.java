public class Teacher {
    static int id = 1;//static variable to give for every new teacher
    String name; //instance variable
    String grade;
    String classpreference; // A, B, C
    int teacherId;//id of teacher automatically created
    String alloted; // alloted type class(A, B, C, WC)
    int number; //class number

    /*using Constructor, it's means class name assigned to method name. and
    can assign value in object directly
    */
    public Teacher(String name, String grade, String classpreference){
        this.name = name;
        this.grade = grade;
        this.classpreference = classpreference;
        this.teacherId = id++; //automatically increment by static variable
        alloted = ""; // Dummy Value assigned to it
        number = -1;// Dummy Value assigned to it
    }

}
