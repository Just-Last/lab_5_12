import java.util.Arrays;

public class lab_5_12 {
    public static void main(String[] args) throws Exception {


        //№1
        System.out.println("Завдання № 1");
        int y[] = new int[50];
        int num = 1;
        for ( int x = 0; x < 50; x++ ){
            if ( num < 100 ){
                y[x] = num;
                num += 2;
            }
            System.out.println(y[x]);
        }
        System.out.println(" ");


        //№2
        System.out.println("Завдання № 2");
        int q[] = new int[20];
        for ( int x = 0; x <20; x++ ){
            q[x] =(int)(Math.random() * 9);
        }
        System.out.println(Arrays.toString(q));
        for ( int x = 0; x < 20; x++ ){
            if ( x % 2 > 0 ){
                q[x] = 0;
            }
        }
        System.out.println(Arrays.toString(q) + "\n");


        //№3
        System.out.println("Завдання № 3");
        int r_1[] = new int [5];
        int r_2[] = new int [5];
        int r_3[] = new int [5];
        int s_r_1 = 0, s_r_2 = 0, s_r_3 = 0;
        for ( int x = 0; x < 5; x++){
            r_1[x] = (int)(Math.random() * 5);
            r_2[x] = (int)(Math.random() * 5);
            r_3[x] = (int)(Math.random() * 5);
        }
        System.out.println(Arrays.toString(r_1) + "\n" + Arrays.toString(r_2) + "\n" + Arrays.toString(r_3) + "\n");
        for (int x = 0; x < 5; x++ ){
            s_r_1 += r_1[x];
            s_r_2 += r_2[x];
            s_r_3 += r_3[x];
        }
        System.out.println("s_r_1: " + s_r_1 + "\ns_r_2: " + s_r_2 + "\ns_r_3: " + s_r_3 + "\n");
        if ( s_r_1 > s_r_2 && s_r_1 > s_r_3 ){
            System.out.println( "Найбільше значення: " + s_r_1 + "\n");
        }if ( s_r_2 > s_r_1 && s_r_2 > s_r_3){
            System.out.println( "Найбільше значення: " + s_r_2 + "\n");
        }if ( s_r_3 > s_r_1 && s_r_3 > s_r_2){
            System.out.println( "Найбільше значення: " + s_r_3 + "\n");
        }if ( s_r_1 == s_r_2 && s_r_2 == s_r_3){
            System.out.println( "Значення середніх арнифметичних дорівнюють: " + s_r_1 + "\n" );
        }


        //№4
        System.out.println("Завдання № 4");
        int ar_1[] = new int[10];
        int ar_2[] = new int[10];
        int ar_3[] = new int[10];
        for ( int x = 0; x < 10; x++ ){
            ar_1[x] = (int)(Math.random() * 10); 
            ar_2[x] = (int)(Math.random() * 10); 
        }
        for ( int x = 0; x < 10; x++ ){
            ar_3[x] = ar_1[x] + ar_2[x];
        }
        System.out.println(Arrays.toString(ar_1) + "\n" + Arrays.toString(ar_2) + "\nСума відповідних елементів першого та другого масивів: " + Arrays.toString(ar_3) + "\n");


        //№5
        System.out.println("Завдання № 5");
        int arr_1[] = new int[15];
        int c = 0;
        for ( int x = 0; x < 15; x++ ){
            arr_1[x] = (int)(Math.random() * 10 );
            if ( arr_1[x] % 2 == 0 ){
                c += 1;
            }
        }   
        System.out.println( Arrays.toString(arr_1) + "\nКількість парних елементів: " + c + "\n" );     


        //№6
        System.out.println("Завдання № 6");
        int array[][] = new int[15][];
        for ( int x = 0; x < 15; x++ ){
            if ( x <= 3 ){
                array[x] = new int[5];
            }if ( x > 3 && x <= 7 ){
                array[x] = new int[8];
            }if ( x > 7 && x <= 11 ){
                array[x] = new int[3];
            }if ( x > 11 && x <= 14 ){
                array[x] = new int[9];
            }
        }for ( int x = 0; x < 15; x++ ){
            for ( int z = 0; z < array[x].length; z++ ){
                array[x][z] = (int)(Math.random() * 15);
            }
            System.out.println(Arrays.toString(array[x]));
        }
    }
}
