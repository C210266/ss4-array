import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int[] arrInt = {1,2,3,4,5};
//
//        int arrInt1[];
//        System.out.println(Arrays.toString(arrInt));
//        test(arrInt);
//        System.out.println(Arrays.toString(arrInt));

        int[] array = {1, 2, 3, 2, 5, 6, 7, 8, 9};
//        int b = 10;
//        int index = 5;
//
//        int arrUpdate[] = new int[10];
//        for (int i = 0; i < arrUpdate.length; i++) {
//            if (i < index) {
//                arrUpdate[i] = array[i];
//            } else if (i == index) {
//                arrUpdate[i] = b;
//            } else {
//                arrUpdate[i] = array[i - 1];
//            }
//        }
//        System.out.println(Arrays.toString(arrUpdate));


//        BT


//        BT1 :
//        Scanner sc = new Scanner(System.in);
//        int m = sc.nextInt();
//        int[] newArr = remove(array, m);
//        for (int i = 0; i < newArr.length; i++) {
//            System.out.print(newArr[i] + " ");
//        }

//        BT2
//        int[] arr = {1, 5, 3, 7, 6};
//        int m = new Scanner(System.in).nextInt();
//        int index = new Scanner(System.in).nextInt();
//        int[] newArray =  insert(arr,m , index);
//        System.out.println(Arrays.toString(newArray));


//        BT3
//        int[] arr1 = {1,2,3};
//        int[] arr2 = {4,5,6};
//        int[] arr = new int[arr1.length + arr2.length];
//        for(int i = 0 ; i < arr.length ; i++){
//            if(i < arr1.length){
//                arr[i] = arr1[i];
//            }else{
//                arr[i] = arr2[i - arr1.length];
//            }
//        }
//        System.out.println(Arrays.toString(arr));

//        BT4
//        int[] arr = {1,23,4,7,11};
//        Arrays.sort(arr);
//        System.out.println(arr[arr.length -1 ]);

//        BT5
//        int[] arr = {1,23,4,7,11};
//        Arrays.sort(arr);
//        System.out.println(arr[0 ]);


//        BT7
        int[][] arr = new int[2][3];

        Scanner scanner = new Scanner(System.in);


    }


    //    tao method test
    public static void test(int[] arr) {
        arr[1] = 10;
    }


    //    tao method delete 1 phan tu
    public static int[] remove(int[] arr, int element) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                count++;
            }
        }

        int[] newArr = new int[arr.length - count];
        int newIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != element) {
                newArr[newIndex] = arr[i];
                newIndex++;
            }
        }
        return newArr;
    }

    //    tao method insertArray
    public static int[] insert(int[] arr, int m, int index) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            }
            if (i == index) {
                newArr[index] = m;
            }
            if (i > index) {
                newArr[i] = arr[i - 1];
            }
        }
        return newArr;

    }
}
