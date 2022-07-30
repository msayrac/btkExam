import java.util.Scanner;

public class PatikaStore {

    Scanner input = new Scanner(System.in);

    public void run(){

        while(true){
            System.out.println("PatikaStore �r�n Y�netim Paneli !");
            System.out.println(" 1 - Notebook ��lemleri\n"+
                    " 2 - Cep Telefonu ��lemleri\n"+
                    " 3 - Marka Listele\n" +
                    " 4 - ��k�� Yap");
            System.out.println("Yapmak �stedi�iniz ��lemi Se�iniz : ");

            switch (input.nextInt()){
                case 1 :
                    System.out.println("Markalar�m�z");
                    Notebook notebook = new Notebook();
                    notebook.menu();
                    break;
                case 2 :
                    System.out.println("Cep telefonu markalar�");
                    MobilePhone mobilePhone = new MobilePhone();
                    mobilePhone.menu();
                case 3 :
                    Brand.printBrands();
                    break;
                case 4 :
                    System.out.println("��k�� yap�l�yor");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Yanl�� de�er girdiniz.");
                    break;
            }
        }

    }

}
