package Task4;

//4. Заполнитþ одномернýй øелоùисленнýй массив знаùениāми от 1 до 10 вклĀùителþно.

public class Task4 {
    public static void main(String[] args)throws Exception{
        int arr[] = new int[10];

        for( int i = 0; i < arr.length; i++){
            arr[i] = i+1;
        }

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
