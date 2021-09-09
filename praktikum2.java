public class praktikum2 {
    public static void main(String[] args){
        int[] bilangan = {1, 2, 3, 123124235, 4364123, 263464585, 1382460, 192,
        109273890, 10974, 5, 1, 7, 4,
        2390, 984091, 983407,
        23870592, 38267502, 897430985, 23897091,
        28365, 3962098,23857206,
        283572093, 2358720};

        System.out.print("Bilangan genap: ");
        for (int i = 0; i < bilangan.length; i++){
            if(bilangan[i] % 2 == 0){
                System.out.println(bilangan[i] + " ");
            }
        }

        System.out.print("Bilangan ganjil: ");
        for (int i = 0; i < bilangan.length; i++){
            if(bilangan[i] % 2 != 0){
                System.out.println(bilangan[i] + " ");
            }
        }
    }

    
}

