import java.util.Arrays;

public class praktikum4 {
    public static void main(String[] args) {
         //list diameter kepala dragon
         int[] kepalaNaga = {5,4};
         Arrays.sort(kepalaNaga);
         int indeksKepalaNaga  = 0;

        //list tinggi ksatria        
        int[] tinggiKsatria = {7,8,4};
        Arrays.sort(tinggiKsatria);
        int z = 0;

        for (int x : tinggiKsatria ){
            if (indeksKepalaNaga < kepalaNaga.length){
                if (x >= kepalaNaga[indeksKepalaNaga]){
                    z += x;
                    indeksKepalaNaga++;
                }
            }
        }

        if (indeksKepalaNaga == kepalaNaga.length){
            System.out.println(z);
        } 
        else {
            System.out.println("Knight Fall");
        }
    }

}

