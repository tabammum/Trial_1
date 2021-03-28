
package problem2;

class Information{
    private String studentId;
    private int creditsCompleted;
    private double cgpa;
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public void setCreditsCompleted(int creditsCompleted) {
        this.creditsCompleted = creditsCompleted;
    }
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
    public String getStudentId() {
        return studentId;
    }
    public int getCreditsCompleted() {
        return creditsCompleted;
    }
    public double getCgpa() {
        return cgpa;
    }
}
public class Problem2 {

    public static void main(String[] args) {
        int numberOfStudents;
        Scanner input=new Scanner(System.in);
        Information[] student;
        System.out.print("Enter the number of students you wanna input: ");
        numberOfStudents=input.nextInt();
        student=new Information[numberOfStudents];
        for(int i=0;i<numberOfStudents;i++){
            student[i]=new Information();
        }
        String id;
        int credit;
        double cg;
        Scanner choice=new Scanner(System.in);
        while(true) {
            System.out.print("1) Add Student Information: \n2) Show information : \n0) Exit\n");
            int ch = choice.nextInt();
            switch (ch) {
                case 1:
                    for(int i=0;i<numberOfStudents;i++){
                           System.out.println("Enter Student Id : ");
                            id=input.next();
                            student[i].setStudentId(id);
                            System.out.println("Enter completed credit :  ");
                            credit=input.nextInt();
                            student[i].setCreditsCompleted(credit);
                            System.out.println("Enter the CGPA :  ");
                            cg=input.nextDouble();
                            student[i].setCgpa(cg);
                    }
                    break;
                case 2:
                        for (int i = 0; i<numberOfStudents; i++) {
                            if (student[i].getCgpa() > 3.75) {
                                System.out.println("Id of the  students that has CGPA more than 3.75:  " + student[i].getStudentId());
                            }
                        }
                    for (int i = 0; i<numberOfStudents; i++) {
                            if(student[i].getCreditsCompleted()>50){
                               System.out.println("Id of the students who has completed more than 50 credits: "+student[i].getStudentId());
                           }
                        }
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }
}
