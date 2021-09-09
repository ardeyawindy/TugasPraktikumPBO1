public class praktikum3 {
    int binarySearch(int arr[], int a, int b, int c){

        if (b >= a){
            int mid = a + (b - a)/2;
            if (arr[mid] == c)
                return mid;

            if (arr[mid] > c)
            return binarySearch(arr, a, mid-1, c);
            
        return binarySearch(arr, mid+1, b, c);
        }

        return -1;
    }

    public static void main(String args[]){
        BinarySearch ob = new BinarySearch();
        int arr[] = {5, 6, 7, 8, 9, 10};
        int n = arr.length;
        int c = 8;
        int hasil = ob.binarySearch(arr, 0, n-1, c);

        if (hasil == -1)
            System.out.println("Angka tidak ditemukan");
        else
            System.out.println("Angka ditemukan pada index " + hasil);

    }

}
