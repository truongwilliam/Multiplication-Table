import java.util.Scanner;  
package multiplication.table;

public class MultiplicationTable {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);  
        System.out.print("Nhap mot so tu 1 den 10 de in ra ban cuu chuong: ");  
        int number = scanner.nextInt();  
        if (number < 1 || number > 10) {  
            System.out.println("Vui long nhap mot so trong khoan tu 1 den 10.");  
        } else {  
            System.out.println("Bang cuu chuong cho so " + number + ":");   
            for (int i = 1; i <= 10; i++) {  
                System.out.println(number + " x " + i + " = " + (number * i));  
            }  
        }  
        scanner.close();  
    }
}
