public class ArrayExcercise {
    public static void main(String args[]){

//        declare int array

        int[] excerciseArray = {5,6,8,7,4,9,4,56,75498};


//        print array eliment

        for( int i = 0; i< excerciseArray.length; i++){

            System.out.println(excerciseArray[i]);

        }


//        find out the largest number

        int largest = excerciseArray[0];
        for (int i = 1; i < excerciseArray.length; i++){
            if (excerciseArray[i] > largest){

                largest = excerciseArray[i];

            }



        }

        System.out.println(" largest number is " + largest);



//        sum up all the elements

        int sum = 0;
        for (int i = 0;  i < excerciseArray.length;   i++  ){
            sum = sum + excerciseArray[i];

        }


        System.out.println(sum);





    }




}
