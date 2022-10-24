import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int girilenSayi, adet = 0, toplam = 0;
        double ortalama;
        Scanner sc = new Scanner(System.in);

        System.out.print("Lutfen Bir Sayi Giriniz : ");
        girilenSayi = sc.nextInt();

        for(int i = 0; i < girilenSayi; i++){
            if(i%3==0 && i%4==0){
                toplam += i;
                adet++;
            }
        }

        ortalama = toplam/adet;
        System.out.print("0'dan girilen sayiya kadar olan sayilardan 3 ve 4'e tam bolunen sayilarin ortalamasi  :"+ortalama);
        sc.close();



    }
}