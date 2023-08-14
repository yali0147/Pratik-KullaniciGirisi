import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Pratik-Kullanıcı Girişi");
        String userName,password;
        String mail,newpassword;
        boolean devam=true;
        while (devam) {

            System.out.print("Kullanıcı adı : ");
            userName = inp.nextLine();
            System.out.print("Şifremiz:");
            password = inp.nextLine();

            if (userName.equals("patika") && password.equals("java123")) {
                System.out.println("Giriş yaptınız.");

            } else {
                System.out.println("Bilgileriniz Yanlış! ");

                System.out.print("Şifrenizi sıfırlamak istiyorsanız 1'e basın.\nTekrar giriş yapmak istiyorsanız 2'e basın.\nArdından Enter'e basın\n   ");
                int select = inp.nextInt();
                switch (select) {
                    case 1 -> {
                        System.out.print("e-Mailiniz : ");
                        inp.nextLine();
                        mail = inp.nextLine();
                        System.out.print("Yeni Şifreniz : ");
                        newpassword = inp.nextLine();

                        if (mail.equals("patika@java.com") && !newpassword.equals("java123")) {
                            System.out.println("Yeni şifreniz oluşturuldu. ");
                        } else if (!mail.equals("patika@java.com") && !newpassword.equals("java123")) {
                            System.out.println("Mailinizi kontrol ediniz");
                        } else {
                            System.out.println("Eski şifrenizden farklı bir şifre seçin.");
                        }
                    }

                    case 2 -> {
                    }
                    case 10 -> devam = false;
                    default ->
                        System.out.println("Yanlış seçim yaptınız.Lütfen tekrar deneyin");
                }

            }
        }

    }
}