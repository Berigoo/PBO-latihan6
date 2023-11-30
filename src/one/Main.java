package one;

public class Main {
    public static void main (String[] args) {
        int iteration = 20;

        //Menghitung Deret bilangan prima dan bukan dari 0 – 20 dengan Hasilnya
        System.out.println("For loop");
        for (int i=1; i<=iteration; i++){
            for (int j=2; j<=i; j++){
                if (i%j == 0 && j!=i) break;
                else if (j == i) System.out.print(i + " ");
            }
        }

        System.out.println("\n\nWhile loop");
        int i=0;
        while (i<=iteration){
            int j=2;
            while (j<=i){
                if (i%j == 0 && j!=i) break;
                else if (j == i) System.out.print(i + " ");
                j++;
            }
            i++;
        }

        System.out.println("\n\nDo-While loop");
        i=0;
        do {
            int j=2;
            do{
                if (i%j == 0 && j!=i) break;
                else if (j == i) System.out.print(i + " ");
                j++;
            }while (j<=i);
            i++;
        }while (i<=iteration);

        //Menghitung Deret bilangan ganjil dan genap dari 0 – 20 dengan Hasilnya
        System.out.println("\n\nFor loop");
        String ganjil = "";
        String genap = "";
        for (i=1; i<=iteration; i++){
            if(i%2 == 0){
                genap+= i;
                genap+= " ";
            }
            else{
                ganjil+= i;
                ganjil+= " ";
            }
        }
        System.out.print("Ganjil : " + ganjil);
        System.out.print("\nGenap  : " + genap);

        System.out.println("\n\nWhile loop");
        ganjil = "";
        genap = "";
        i=1;
        while(i<=iteration){
            if(i%2 == 0){
                genap+= i;
                genap+= " ";
            }
            else{
                ganjil+= i;
                ganjil+= " ";
            }
            i++;
        }
        System.out.print("Ganjil : " + ganjil);
        System.out.print("\nGenap  : " + genap);

        System.out.println("\n\nDo-While loop");
        ganjil = "";
        genap = "";
        i=1;
        do{
            if(i%2 == 0){
                genap+= i;
                genap+= " ";
            }
            else{
                ganjil+= i;
                ganjil+= " ";
            }
            i++;
        }while (i<=iteration);
        System.out.print("Ganjil : " + ganjil);
        System.out.print("\nGenap  : " + genap);

        //Huruf Z – A
        System.out.println("\n\nFor loop");
        for(int c='Z'; c>='A'; c--){
            System.out.print((char)c + " ");
        }

        System.out.println("\n\nWhile loop");
        int c='Z';
        while (c >= (int)'A'){
            System.out.print((char)c + " ");
            c--;
        }

        System.out.println("\n\nDo-While loop");
        c='Z';
        do{
            System.out.print((char)c + " ");
            c--;
        }while(c >= (int)'A');

        //Lagu “Anak Ayam Turun N”
        System.out.println("\n\nFor Loop");
        for(i=6; i>0; i-=2){
            String[] a = {"Induknya", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam"};
            System.out.println("Anak ayam turunlah " + a[i] + "\n" +
                    "Pergi satu, tinggallah " + a[i-1] + "\n" +
                    "Anak ayam turunlah " + a[i-1] + "\n" +
                    "Pergi satu, tinggallah " +  a[i-2] + '\n');
        }

        System.out.println("\n\nWhile Loop");
        i=6;
        while(i>0){
            String[] a = {"Induknya", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam"};
            System.out.println("Anak ayam turunlah " + a[i] + "\n" +
                    "Pergi satu, tinggallah " + a[i-1] + "\n" +
                    "Anak ayam turunlah " + a[i-1] + "\n" +
                    "Pergi satu, tinggallah " +  a[i-2] + '\n');
            i-=2;
        }

        System.out.println("\n\nDo-While Loop");
        i=6;
        do{
            String[] a = {"Induknya", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam"};
            System.out.println("Anak ayam turunlah " + a[i] + "\n" +
                    "Pergi satu, tinggallah " + a[i-1] + "\n" +
                    "Anak ayam turunlah " + a[i-1] + "\n" +
                    "Pergi satu, tinggallah " +  a[i-2] + '\n');
            i-=2;
        }while(i>0);
    }
}
