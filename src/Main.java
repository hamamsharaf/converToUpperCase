import java.util.Scanner;

public class Main {
    public static void converToUpperCase(String[]arr){
        int num= arr.length;
        for(int i=0;i<num;i++){
            arr[i]=arr[i].toUpperCase();
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in) ;
        System.out.println("Enter siz for this Array : ");
        int siz= in.nextInt();
        System.out.println("please enter the string :");
        String[]arr=new String[siz];
        for(int i=0;i<siz;i++){
            arr[i]= in.nextLine();
        }
        converToUpperCase(arr);
        System.out.println("Array after modification :");
        for(String name:arr)
            System.out.println(name+" ");
    }
}