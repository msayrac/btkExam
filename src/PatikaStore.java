import java.util.Scanner;

public class PatikaStore {

    Scanner input = new Scanner(System.in);

    public void run(){

        System.out.println("PatikaStore Ürün Yönetim Paneli !");
        System.out.println(" 1 - Notebook Ýþlemleri\n"+
                " 2 - Cep Telefonu Ýþlemleri\n"+
                " 3 - Marka Listele\n" +
                " 4 - Çýkýþ Yap");

        System.out.println("Yapmak Ýstediðiniz Ýþlemi Seçiniz : ");

        switch (input.nextInt()){
            case 1 :
                System.out.println("Markalarýmýz");
                Notebook notebook = new Notebook();
                notebook.menu();

                break;

        }



    }


}
