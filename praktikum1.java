import java.util.*;

public class praktikum1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Masukkan bilangan: ");
        int bilangan = sc.nextInt();
        boolean bilanganPrima = true;

        for (int i = 2; i <= bilangan/2; i++){
            if (bilangan % i == 0){
                bilanganPrima = false;
                break;
            }
        }

        if (bilanganPrima){
            System.out.println(bilangan + " adalah bilangan prima");
        }
        else{
            System.out.println(bilangan + " bukan bilangan prima");
        }
        sc.close();
    }
}