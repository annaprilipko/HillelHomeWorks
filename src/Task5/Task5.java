package Task5;

//5. Реализоватþ функøиĀ вýвода линейного массива ùисел с плаваĀûей запāтой с
//ограниùением до 2х знаков после запāтой. Обработатþ ситуаøиĀ с пустýм
//массивом. Пример вýвода: [3,14; 2.72; 6.72; -2.34; 1.2; 1235]

public class Task5 {
    public static void main(String[] args)throws Exception{

        double array1[] = new double[]{3.4584126, 6, 9.4112541};
        double array2[] = new double[0];
        outArray(array1);
        outArray(array2);

    }

    public static void outArray(double[] arr){
        if (arr.length == 0) System.out.println("[ ]");
        else {
            System.out.print("[");
            for (int i = 0; i < arr.length - 1; i++) {
                System.out.printf("%.2f", arr[i]);
                System.out.print("; ");
            }
            System.out.printf("%.2f",arr[arr.length-1]);
            System.out.print("]");
        }
    }
}
