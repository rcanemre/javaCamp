public class Main {

    public static void main(String[] args) {

        char grade = 'D';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel Geçtiniz Notunuz : " + grade);
                break;

            case 'B':
                System.out.println("İyi Geçtiniz Notunuz : " + grade);
                break;

            case 'C':
                System.out.println("Ortalama Geçtiniz Notunuz : " + grade);
                break;

            case 'D':
                System.out.println("Şartlı Geçtiniz Notunuz : " + grade);
                break;

            case 'F':
                System.out.println("Kaldınız Notunuz : " + grade);
                break;
            default:
                System.out.println("Geçersiz Not Girdiniz");
        }
    }
}
