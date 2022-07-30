import java.util.ArrayList;

public class MobilePhone extends Product{
    private static int pId=1;
    private int battery;
    private String color;
    private int camResolution;
    private static ArrayList<MobilePhone> phones=new ArrayList<>();

    public MobilePhone(){

    }

    public MobilePhone(String name, double price, int discountRate, int amount,
                       Brand brand, double screenSize, int ram, int memory,
                       int battery, String color, int camResolution) {
        super(pId,name, price, discountRate, amount, brand, screenSize, ram, memory);
        pId++;
        this.battery=battery;
        this.color=color;
        this.camResolution=camResolution;
    }

    @Override
    public void menu() {
        System.out.println("1- Yeni Telefon ekle\n" +
                "2- Telefon listesini görüntüle\n" +
                "3- Telefon sil\n" +
                "4- Telefonlarý id numarasýna göre sýrala\n" +
                "5- Telefonlarý markaya göre filtrele");
        System.out.print("Yapmak istediðiniz iþlemi seçiniz : ");
        int value=scanner.nextInt();
        if(value==1) addItem();
        if(value==2 || value==4) getProducts();
        if(value==3) deleteItem();
        if(value==5) brandFilter();
    }

    @Override
    public void addItem() {
        System.out.print("Ürünün fiyatý : ");
        double price= scanner.nextDouble();
        System.out.print("Ürünün adý : ");
        scanner.nextLine();
        String name=scanner.nextLine();
        System.out.print("Ürünün indirim oraný : ");
        int discountRate= scanner.nextInt();
        System.out.print("Ürünün stoðu : ");
        int amount= scanner.nextInt();
        System.out.print("Ürünün rami : ");
        int ram= scanner.nextInt();
        System.out.print("Ürünün ekraný : ");
        double screenSize= scanner.nextDouble();
        System.out.print("Ürünün hafýzasý :");
        int memory= scanner.nextInt();
        System.out.print("Ürünün pili : ");
        int battery= scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ürünün rengi : ");
        String color= scanner.nextLine();
        System.out.print("Kamera çözünürlüðü : ");
        int camResolution= scanner.nextInt();
        Brand.printBrands();
        System.out.print("Marka Seçiniz : ");
        Brand brand=Brand.getBrand(scanner.nextInt());
        MobilePhone phone=new MobilePhone(name,price,discountRate,amount,brand,screenSize,ram,memory,battery,color,camResolution);
        phones.add(phone);
        System.out.println("Eklenen telefonun id'si :"+phone.getId());
    }

    public void getProducts() {
        print(null);
    }

    public void print(ArrayList<MobilePhone> phoneList){
        if(phoneList==null) phoneList=this.phones;
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adý                  | Fiyatý          | Markasý         | Stoðu        | Ýndirim Oraný      | RAM    | Ekran Boyutu      | Hafýzasý   | Pil Kapasitesi  | Renk           | Kamera    |");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        for (MobilePhone n:phoneList){
            System.out.printf("| %-2s | %-25s | %-15s | %-15s | %-12s | %-18s | %-6s | %-17s | %-10s | %-15s | %-14s | %-9s | \n",
                    n.getId(),n.getName(),n.getPrice(),n.getBrand().getName(),n.getAmount(),
                    n.getDiscountRate(),n.getRam(),n.getScreenSize(),n.getMemory(),n.getBattery(),n.getColor(),n.getCamResolution());
        }
    }

    @Override
    public void deleteItem(){
        getProducts();
        System.out.print("Silinmesini istediðiniz telefonun Id numarasýný giriniz : ");
        int id=scanner.nextInt();
        phones.remove(id-1);
        System.out.println("Güncel telefon listesi ");
        getProducts();
    }

    public void brandFilter(){
        scanner.nextLine();
        System.out.print("Filtrelemek istediðiniz ürün markasýný giriniz :");
        String filter= scanner.nextLine();
        ArrayList<MobilePhone> filterPhones=new ArrayList<>();
        for (MobilePhone n:phones){
            if(filter.equals(n.getBrand().getName())){
                filterPhones.add(n);
            }
        }
        print(filterPhones);
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCamResolution() {
        return camResolution;
    }

    public void setCamResolution(int camResolution) {
        this.camResolution = camResolution;
    }

    public static int getpId() {
        return pId;
    }
}