package erwin.suarez.Lab3;

/**
 * Created by t00189596 on 17/02/2017.
 */
public class TextMyArrays {

    public static void main(String[] args) {

        int currentSize = 4;
        int position = 1;
        int numInsert = 2;
        int[] number = new int[10];

        number[0] = 3;
        number[1] = 1;
        number[2] = 4;
        number[3] = 2;

        number[4] = 7;
        number[5] = 5;
        number[6] = 6;
        number[7] = 7;
        number[8] = 8;
        number[9] = 9;

        int[] list1 = {4,6,8,12,3}; //sum should be 33

        int[] list2 = new int[100];

        list2[0] = 3;
        list2[1] = 12;
        list2[2] = 4;
        list2[3] = 3;
        list2[4] = 1;


        System.out.println("Array values in number");
        for(int x = 0; x < number.length; x++){
            System.out.print(number[x] + ", ");//expect: 3, 1, 4, 2,
        }
        System.out.println();

        System.out.println("The sum of Array values is: " + MyArrays.sum(number, currentSize)); //expect: 10

        System.out.println("Biggest number in Array is: " + MyArrays.maxNumber(number, currentSize)); //expect: 4

        System.out.println("Smallest number in Array is: " + MyArrays.minNumber(number, currentSize)); //expect: 1

        System.out.println("Remove a number in Array: " + MyArrays.remove(number, currentSize, position)); //expect: 1

        System.out.println("Array values in number");
        for(int x = 0; x < currentSize; x++){
            System.out.print(number[x] + ", ");//expect: 3, 1, 4, 2,
        }



    }


}
