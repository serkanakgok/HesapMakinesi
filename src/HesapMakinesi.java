import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        double n1, n2;
        int process;

        Scanner data = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        n1 = data.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        n2 = data.nextInt();

        System.out.println("1=Toplama\n2=Çarpma\n3=Çıkarma\n4=Bölme");
        System.out.println();
        System.out.print("İşlem numarası seçiniz : ");
        process = data.nextInt();

        double result1 = n1 + n2;
        double result2 = n1 * n2;
        double result3 = n1 - n2;
        double result4 = n1 / n2;

        switch (process) {
            case 1:
                System.out.println(result1);
                break;
            case 2:
                System.out.println(result2);
                break;
            case 3:
                System.out.println(result3);
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("Girdiğiniz ikinci sayı paydadır ve payda sıfır olamaz.");
                } else {
                    System.out.println(result4);
                }
                break;
            default:
                System.out.println("Geçerli bir işlem numarası seçiniz.");
                break;
        }
    }
}
