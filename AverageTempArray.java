
import java.util.Arrays;
import java.util.Scanner;

public class AverageTempArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("How many days temperature are we calculating ? ");
        int days=sc.nextInt();

        int []temps=new int[days];

        // record temp and find average temperature

        int sum=0;
        for(int i=0;i<days;i++){
            System.out.print("Enter day "+(i+1)+"'s temperature: ");
            temps[i]=sc.nextInt();
            sum+=temps[i];
        }
        double averageTemp=(sum/days);

        sc.close();
        
        // count days above average temperature
        int above =0;
        int []higher=new int[days];
        for(int i=0;i<temps.length;i++){
            if(temps[i]>averageTemp){
                above++;
                higher[i]=temps[i];
            }
        }
        
        System.out.println("Average temperature of "+days+" days is: "+averageTemp);
        System.out.println("Number of days having temperature above average are: "+above);
        System.out.println("Temperature more than average temperatures are: "+Arrays.toString(higher));

    }
}
