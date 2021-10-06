package JavaOdev1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int toplamDeger,ortalama,fizikNotu,matNotu,kimyaNotu,muzikNotu,turkceNotu,tarihNotu;

        System.out.println("Matematik notunuz ? ");
        matNotu = scanner.nextInt();
        System.out.println("Fizik notunuz ? ");
        fizikNotu = scanner.nextInt();
        System.out.println("Kimya notunuz ? ");
        kimyaNotu = scanner.nextInt();
        System.out.println("Muzik notunuz ? ");
        muzikNotu = scanner.nextInt();
        System.out.println("Türkçe notunuz ? ");
        turkceNotu = scanner.nextInt();
        System.out.println("Tarih notunuz ? ");
        tarihNotu = scanner.nextInt();

        toplamDeger = matNotu + fizikNotu + kimyaNotu + tarihNotu + turkceNotu + muzikNotu;
        ortalama = toplamDeger/6;

        String sonuc = (ortalama > 60) ? "sinifi gecti" : "sinifta kaldi";

        System.out.println(sonuc);

    }
}
