public class StudentArrayGrade {
    public static void main(String[] args) {
        int[] student = new int[100];
        char grade;
        int A =0;
        int B =0;
        int C =0;
        int D =0;
        int F =0;

        for(int i = 0;i<100;i++) // random score for student
        student[i] = (int)(Math.random() * 101);

        for(int i=0;i<100;i++){
            grade = grading(student[i]);
            if (grade=='A')
            A++;
            else if (grade=='B')
            B++;
            else if (grade=='C')
            C++;
            else if (grade=='D')
            D++;
            else
            F++;
        }
        System.out.println("Student got A >>"+A);
        System.out.println("Student got B >>"+B);
        System.out.println("Student got C >>"+C);
        System.out.println("Student got D >>"+D);
        System.out.println("Student got F >>"+F);
        System.out.println("Total student>>"+(A+B+C+D+F));
    }

    public static char grading(int score){
        char grade;
        if (score>=80)
        grade = 'A';
        else if(score>=70 &&score<80)
        grade = 'B';
        else if (score>=60 && score<70)
        grade = 'C';
        else if(score>=50 && score<60)
        grade = 'D';
        else
        grade = 'F';
        return grade;


    }
    
}