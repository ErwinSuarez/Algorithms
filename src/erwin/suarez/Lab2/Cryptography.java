package erwin.suarez.Lab2;

public class Cryptography {

    private static String ciphertext;
    private static String text;
    private static String text1;
    private static int pad;
    private static int numRows;

    //number of pad space needed
    public static String padX(String plaintext, int numColumns){

        if((plaintext.length() % numColumns)==0){return plaintext;}

        else
        {
            text = plaintext;
            int pad = numColumns - (plaintext.length() % numColumns);

            for(int x = 0; pad > x; x++){text += "X";}

            return text;
        }
    }

    //create number of rows from the length of text via numColumns required
    public static int numberOfRows(String plaintext, int numColumns){

        int temp = (plaintext.length() % numColumns);

        if(temp == 0){numRows = (plaintext.length() / numColumns);}
        else{numRows = (int)(plaintext.length() / numColumns) + 1;}

        return numRows;
    }


    //encrypt the message via numColumns
    public static String encrypt(String plaintext, int numColumns){

        ciphertext = "";

        //removes the spaces in the text
        text1 = plaintext.replace(" ","");

        text = padX(text1, numColumns);
        int numRows = numberOfRows(text, numColumns);

        for(int x = 0; numColumns > x; x++)
        {
            int index = x;

            for(int y = 0; numRows > y; y++){
                ciphertext += text.charAt(index);
                index += numColumns;
            }
        }

        return ciphertext;
    }

    //decrypt the message
    public static String decrypt(String plaintext, int numColumns){
        numRows = (int)(plaintext.length() / numColumns);
        return encrypt(plaintext, numRows);
    }
}
