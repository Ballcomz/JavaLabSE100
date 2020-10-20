public class StudentArray{
    public static void main(String[] args) {
        int[] student = new int[100];
        
        for(int i = 0;i<100;i++) // random score for student
        student[i] = (int)(Math.random() * 101);
        printArray(student);
        findMax(student);
        findMin(student);
        
    }
    public static void printArray(int[] array){
        for(int i = 0; i< array.length;i++)
        System.out.println("Student "+i+" score>> "+array[i]);
        }
    public static void findMax(int[] array){
        int max = 0;
        for(int i = 0; i< array.length;i++){
        if (array[i]>max)
        max = array[i];
        }
        System.out.println("Max score is "+max);
    }
    public static void findMin(int[] array){
        int min = 100;
        for(int i = 0; i< array.length;i++){
            if (array[i]<min)
            min = array[i];
        }
        System.out.print("Min score is "+min);
    }
}
