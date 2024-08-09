import java.util.*;

public class Main {

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        Scanner myProduct = new Scanner(System.in);
        System.out.println("What kind of products do you buy?");


        HashMap<String, List<Item>> map = new HashMap<>();
        map.put("Toner", tonerProducts());
        map.put("Lipstick", tonerProducts());
        map.put("Foundation", tonerProducts());
        map.put("Serum", tonerProducts());
        int count = 1;
        for (Map.Entry<String, List<Item>> entry : map.entrySet()) {
            System.out.println(count + entry.getKey());
            count++;
        }

        Integer prodNo = convertToInt(myProduct.nextLine());
        switch (prodNo) {
            case 1:
                outputItem(map.get("Toner"));
                break;

            case 2:
                System.out.println("Switch 4");
                break;

            case 3:
                System.out.println("Switch 4");
                break;

            case 4:

                System.out.println("Switch 4");
                break;

            default:
                System.out.println("Invalid Input");
                menu();
                break;

        }
    }

    static ArrayList<Item> tonerProducts() {

        ArrayList<Item> tonerProd = new ArrayList<>();
        tonerProd.add(new Item("JM Solution", 10000));
        tonerProd.add(new Item("Wonder", 15000));
        tonerProd.add(new Item("Simple", 20000));
        tonerProd.add(new Item("Dr.G", 25000));
        return tonerProd;
    }

    static void outputItem(List<Item> data) {
        System.out.println("What Item do you want to buy?");
        for (int i = 0; i < data.size(); i++) {
            System.out.println(i + 1 + data.get(i).getName());
        }
        System.out.println(data.size() + 1 + "Back");
        Scanner myBrand = new Scanner(System.in);
        Integer input = convertToInt(myBrand.nextLine());
        if (data.size() + 1 == input) {
            menu();
        } else if (input <= 0 || input > data.size() + 1) {
            System.out.println("Invalid Input");
            outputItem(data);

        } else {
            buyItem(data.get(input - 1), data);

        }


    }

    static void buyItem(Item item, List<Item> data) {
        System.out.println("ItemName:" + item.getName());
        System.out.println("Price:" + item.getPrice());
        Scanner myItem = new Scanner(System.in);
        Integer input = convertToInt(myItem.nextLine());
        if (input <= 0) {
            System.out.println("Invalid Input");
            buyItem(item, data);
        } else {
            System.out.println("Your total is:" + input * item.getPrice());
            System.out.println("Do you want to confirm? (y/n)");
            Scanner confirmItem = new Scanner(System.in);
            String confirm = confirmItem.nextLine();
            if (confirm.equalsIgnoreCase("y")) {
                System.out.println("Thank you!");
                menu();
            } else if (confirm.equalsIgnoreCase("n")) {
                outputItem(data);
            } else {
                System.out.println("Invalid Input");
                buyItem(item, data);
            }
        }


    }
    static Integer convertToInt(String input){
        try {
            return Integer.parseInt(input);
        }catch (Exception e){
            System.out.println("error");
            return -1;
        }
    }


}

class Item {
    private String name;
    private Integer price;

    public Item(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}

