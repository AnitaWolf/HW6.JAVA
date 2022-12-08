import java.util.Random;
import java.util.Scanner;

public class Main {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       while (true) {

            System.out.println("Введите операцию: \n" +
                    "Умножение - *\n" +
                    "Деление - /\n" +
                    " Сложение- +\n" +
                    "Разность -\n" +
                    "Выход - e \n");
            char ch = scanner.next().charAt(0);
            if (ch == '*') {
               System.out.println( multiply());


            } else if (ch == '/') {
               System.out.println( div());

            } else if (ch == '+') {
               System.out.println( add());

            } else if (ch == '-') {
                System.out.println(sub());

            }

            if (ch == 'e') {
                break;
            }






            }
       int[] arr1 = newArray(10, 20);
        System.out.println("массив случайных чисел:");
        printArr(arr1);

        arr1 =SortIn(arr1);
        System.out.println(" ");
        System.out.println("Массив по убыванию ");
        printArr(arr1);

        arr1=sortDec(arr1);
        System.out.println(" ");
        System.out.println(" Массив по возрастанию");
        printArr(arr1);

        System.out.println(" ");
        System.out.println("корень третьей степени: " +sqrt());
        System.out.println(" ");
        System.out.println("Степень: " +pow());
    }


    private static int multiply() {
        System.out.println("введите первое число");
        int i = scanner.nextInt();
        System.out.println("введите второе число");
        int i1 = scanner.nextInt();
        return i*i1;


    }

    private static int add() {
                System.out.println("введите первое число");
                int i = scanner.nextInt();
                System.out.println("введите второе число");
                int i1 = scanner.nextInt();
               return i+i1;
    }

    private static int div() {
     System.out.println("введите первое число");
                int i = scanner.nextInt();
                System.out.println("введите второе число");
                int i1 = scanner.nextInt();
                return i/i1;
    }

    private static int sub () {
   System.out.println("введите первое число");
                int i = scanner.nextInt();
                System.out.println("введите второе число");
                int i1 = scanner.nextInt();
                 return i-i1;


    }
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] + " ");

        }
    }
    public static int[] newArray(int size,int bound) {
        int [] arr =new int [size];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]= random.nextInt( bound);
        }
        return arr;
    }
private static int[] SortIn (int[] arr) {
        int temp;
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length ; j++) {
            if (arr[i]>arr[j]) {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }

    }
    return arr;
}

private static int[] sortDec (int [] arr){
        int temp;
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length ; j++) {
            if( arr[i]<arr[j]) {
                temp=arr[i];
                arr[i] =arr[j];
                arr[j]=temp;
            }
        }
    }
    return arr;
}



    private static double sqrt() {
        int i= scanner.nextInt();

        return  Math.pow(i,1./3);


    }

        private static double pow() {
            int i =scanner.nextInt();
            int i1= scanner.nextInt();
            return  Math.pow(i,i1);
}




}


 /*1) Создать калькулятор(+, -, *, /) в бесконечном цикле, но считать в функции
         2) Создать методы, для создания массива, заполнения его случайными числами и вывода на консоль.
         3) Метод для сортировки массива пузырьком по возрастанию и убыванию
         4) Создать метод для возведения в степень числа и *извлечения корня 3 степени из числа.
         5*) Реализовать игру "Камень, ножницы, бумага"*/