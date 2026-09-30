/*Begin by using the attached zipped folder to create a project in VS code. 
Then write the Rotate class from scratch which contains the static rotateArraymethod.  
rotateArray accepts a square (number of rows equals number of columns) two-dimensional 
integer array as a parameter, and then returns a properly rotated two-dimensional 
array of the same size.

When you are finished, demonstrate your work to me by successfully running the RotateTest class.
Note that while the array to be rotated will always be square, it will not necessarily be 3 x 3. 
In fact, both the size of the array, and the individual integer values themselves are randomly
generated each time the tester runs.

 */
public class Rotate {
    public static void main(String[] args)
    {
         int[][] array = new int[3][3];
         int count=1;
         for(int i = 0; i<3; i++){
            for (int j = 0; j<3; j++)
            {
                array[i][j]=count;
                count++;
            }
         }
         for(int i = 0; i<3; i++){
            System.out.println("");
            for (int j = 0; j<3; j++)
            {
                System.out.print(array[i][j]+" ");
            }
         }
         System.out.println("");
         array = rotateArray(array);
         for(int i = 0; i<3; i++){
            System.out.println("");
            for (int j = 0; j<3; j++)
            {
                System.out.print(array[i][j]+" ");
            }
         }


         int[][] array1 = new int[5][5];
         int count1=1;
         for(int i = 0; i<5; i++){
            for (int j = 0; j<5; j++)
            {
                array1[i][j]=count1;
                count1++;
            }
         }
         for(int i = 0; i<5; i++){
            System.out.println("");
            for (int j = 0; j<5; j++)
            {
                System.out.print(array1[i][j]+" ");
            }
         }
         System.out.println("");
         array1 = rotateArray(array1);
         for(int i = 0; i<5; i++){
            System.out.println("");
            for (int j = 0; j<5; j++)
            {
                System.out.print(array1[i][j]+" ");
            }
         }

    }
    public static int[][] rotateArray(int[][] ogArray)
    {
        int[][] tempArray = new int[ogArray.length][ogArray[0].length];
        for (int i = 0; i < ogArray.length; i++)
        {
            int[] line = new int[ogArray.length]; 
            for (int j = 0; j < ogArray.length; j++)
            {
                line[j]=ogArray[i][j];
            }
            for (int j = 0; j < ogArray.length; j++)
            {
                tempArray[j][ogArray.length-1-i] = line[j];
            }
        }
        return tempArray;
        
    }

}


