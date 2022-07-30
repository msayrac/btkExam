import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Notebook extends Product{



    private static int nId=1;
    private static ArrayList<Notebook> notebooks = new ArrayList<>();

    public Notebook(String name, double price, int discountRate, int amount,
                    Brand brand, double screenSize, int ram, int memory) {
        super(nId, name, price, discountRate, amount, brand, screenSize, ram, memory);
        nId++;
    }

    public Notebook() {

    }

    @Override
    public void menu() {

        System.out.println("1- Add new notebook\n"+
                "2- Notebook list\n"+
                "3- Delete notebook\n"+
                "4- List according to noteBook id number\n"+
                "5-List notebook according to brands"
                );
        System.out.println("Please select : ");

        switch (scanner.nextInt()){
            case 1 :
                addItem();
                break;
            case 2 :
            case 4 :
                getProducts();
                break;
            case 3 :
                deleteItem();
                break;
            case 5 :
                brandFilter();
                break;
        }
    }

    @Override
    public void addItem() {
        System.out.println("Ürünün fiyatý : ");
        double price = scanner.nextDouble();

        System.out.println("Ürünün adý : ");
        String name = scanner.next();

        System.out.println("Ürünün indirim oraný : ");
        int discountRate = scanner.nextInt();

        System.out.println("Ürünün adeti");
        int amount = scanner.nextInt();

        System.out.println("Ürünün rami : ");
        int ram = scanner.nextInt();

        System.out.println("Ürünün ekraný : ");
        double screenSize = scanner.nextDouble();

        System.out.println("Ürünün hafýzasý : ");
        int memory = scanner.nextInt();

        Brand.printBrands();

        System.out.println("marka id' si Seçiniz : ");
        Brand brand = Brand.getBrand(scanner.nextInt());
        Notebook notebook = new Notebook(name,price,discountRate,amount,brand,screenSize,ram,memory);
        this.notebooks.add(notebook);
        System.out.println("Eklenen notebook'un id'si : "+notebook.getId());
        getProducts();
    }

    @Override
    public void getProducts() {
        System.out.println("Ýtem listed");
        print(null);
    }
    public void print(ArrayList<Notebook> notebookList){
        if(notebookList==null){
            notebookList=this.notebooks;
        }
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adý                  | Fiyatý          | Markasý         | Stoðu        | Ýndirim Oraný      | RAM    | Ekran Boyutu      | Hafýzasý   |");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");

        for (Notebook n:notebookList){
            System.out.printf("| %-2s | %-25s | %-15s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | \n",
                    n.getId(),n.getName(),n.getPrice(),n.getBrand().getName(),n.getAmount(),
                    n.getDiscountRate(),n.getRam(),n.getScreenSize(),n.getMemory());
        }
    }
    @Override
    public void deleteItem() {
        System.out.println("Ýtem deleted");
        getProducts();
        System.out.println("Silmek istediðiniz notebook id numarasýný giriniz");
        int id = scanner.nextInt();
        notebooks.remove(id-1);
        System.out.println("Güncel notebook listesi");
        getProducts();
    }

    public void brandFilter(){
        System.out.println("item filtered");
        scanner.nextLine();
        System.out.println("Filtrelemek istediðiniz ürün markasýný giriniz : ");
        String filter = scanner.nextLine();
        ArrayList<Notebook> filterNotebook = new ArrayList<>();
        for(Notebook n : notebooks){
            if(filterNotebook.equals(n.getBrand().getName())){
                filterNotebook.add(n);
            }
        }
        print(filterNotebook);

    }

    public static int getnId() {
        return nId;
    }

    public static void setnId(int nId) {
        Notebook.nId = nId;
    }
}
