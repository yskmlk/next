public class ArrayType {
    public static void main(String args[]){

        int score = 40;

        int[] scoreArray = new int[10];

        int[] anotherArray = {1,2,4,2,5,8,7,9,5,4,6,4,5,8,4,5,2,};



        scoreArray[0] =  5;
        scoreArray[2] =  7;

//        System.out.println(scoreArray[2]);


        for (int i=0; 1<scoreArray.length; i++){
            scoreArray[i] = i*10;
        }

//        System.out.println(scoreArray[0]);
//        System.out.println(scoreArray[0]);


        for (int i = 0; i< scoreArray.length; i++){
            System.out.println(scoreArray[i]);
        }







    }

}
