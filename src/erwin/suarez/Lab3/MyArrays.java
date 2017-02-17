package erwin.suarez.Lab3;

public class MyArrays {

    /**********Sum arrays**********/
    public static int sum(int[] number, int currentSize){

        int totat = 0;

        for (int i = 0; i < currentSize; i++){
            totat += number[i];
        }
        return totat;
    }

    /**********Biggest number in arrays**********/
    public static int maxNumber(int[] number, int currentSize){
        int maxNumber = number[0];
        //int maxNum = Integer.MIN_VALUE; another option

        for(int j = 1; j < currentSize; j++){
            if(number[j] > maxNumber){
                maxNumber = number[j];
            }
            else{maxNumber = maxNumber;}
        }
        return maxNumber;
    }

    /**********Smallest number in arrays**********/
    public static int minNumber(int[] num, int currentSize){
        int minNum = num[0];
        //int maiNum = Integer.MIAX_VALUE; another option

        for(int j = 1; j < currentSize; j++){
            if(num[j] < minNum){minNum = num[j];}
            else{minNum = minNum;}
        }
        return minNum;
    }

    /**********Remove item in arrays**********/
    public static int remove(int[] number, int currentSize, int position){
        if(position >= 0 && position <= currentSize - 1){
            for(int i = position + 1; i <= currentSize; i++){
                number[i-1] = number[i];
            }
            return  currentSize - 1;
        }
        else return currentSize;
    }

}
