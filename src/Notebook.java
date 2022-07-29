import java.util.ArrayList;

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
        System.out.println("Ýtem added");

    }

    @Override
    public void getProducts() {
        System.out.println("Ýtem listed");

    }

    @Override
    public void deleteItem() {
        System.out.println("Ýtem deleted");

    }

    public void brandFilter(){
        System.out.println("item filtered");

    }
}
