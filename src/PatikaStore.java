import java.util.Scanner;

public class PatikaStore {

    Scanner input = new Scanner(System.in);

    public void run(){

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

        }



    }


}
