import java.util.Scanner;

public class money {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("nhap so tien ");
        double money=input.nextDouble();

        System.out.println("nhap so thang");
        int month=input.nextInt();

        System.out.println("nhap lai suat");
        double interestRate=input.nextDouble();

        double totalInterestRate=0;
        for (int i=0;i<month;i++){
            totalInterestRate = money * (interestRate/100)/ 12 *month;
        }
        System.out.println("totalInterestRate" + totalInterestRate);






    }
}
