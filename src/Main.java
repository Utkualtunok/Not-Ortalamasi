import java.sql.SQLOutput;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float mat, fizik, turkce, kimya, muzik, ort;
        int counter = 5;

        Scanner input = new Scanner(System.in);
        // Kullanıcının veri girişleri if ile birlikte 0 ve 100 girişi durumunu kontrol ediyoruz.
        System.out.println("Matematik Notunuz : ");
        mat = input.nextFloat();
        if (mat<=0 || mat>=100){
            mat = 0;
            counter -= 1;
        }
        System.out.println("Fizik Notunuz : ");
        fizik = input.nextFloat();
        if (fizik<=0 || fizik>=100) {
            fizik = 0;
            counter -= 1;
        }
        System.out.println("Türkçe Notunuz : ");
        turkce = input.nextFloat();
        if (turkce<=0 || turkce>=100) {
            turkce = 0;
            counter -= 1;
        }
        System.out.println("Kimya Notunuz : ");
        kimya = input.nextFloat();
        if (kimya<=0 || kimya>=100) {
            kimya = 0;
            counter -= 1;
        }
        System.out.println("Müzik Notunuz : ");
        muzik = input.nextFloat();
        if (muzik<=0 || muzik>=100) {
            muzik = 0;
            counter -= 1;
        }
        // Derslerin ortalama hesapları
        if(counter<=0) {
            ort = (mat + fizik + turkce + kimya + muzik);
        }else {
            ort = (mat + fizik + turkce + kimya + muzik) / counter;
        }
        if(ort>= 55){
            System.out.println("Tebrikler ortalamanız " + ort + "sınıfı geçtiniz.");
        }else {
            System.out.println("Ortalamanız " + ort + " sınıfta kaldınız.");
        }
    }
}