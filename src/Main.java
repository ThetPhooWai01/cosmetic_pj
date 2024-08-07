import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myProduct = new Scanner(System.in);
        System.out.println("What kind of products do you buy?");
        ArrayList<String> products = new ArrayList<String>();
        products.add("Toner");
        products.add("LipStick");
        products.add("Foundation");
        products.add("Serum");
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i+1)+"  "+products.get(i));
        }

        Integer prodNo = myProduct.nextInt();
       selectProduct(prodNo+1);


//        System.out.println("Products are: " + prodName);
    }
    static String selectProduct(Integer data){
        String toner="";
        switch (data){
            case 1:
                toner= tonerProducts();
                break;

            case 2:
                toner= tonerProducts();
                break;

            case 3:
                toner= tonerProducts();
                break;

            case 4:
                toner= tonerProducts();
                break;

            default:
                System.out.println("Ending story");
                break;

        }
        return toner;

    }
    static String tonerProducts(){
        Scanner tonerCosmatic = new Scanner(System.in);

        System.out.println("What kind of products do you buy?");
        ArrayList<String> tonerProd = new ArrayList<String>();
        tonerProd.add("JM Solution");
        tonerProd.add("Wonder");
        tonerProd.add("Simple");
        tonerProd.add("Dr.G");
        tonerProd.add("Back");
        for (int i = 0; i < tonerProd.size(); i++) {
            System.out.println((i+1)+"  "+tonerProd.get(i));
        }

        String prodName = tonerCosmatic.nextLine();
        System.out.println("Toner Brands are: " + prodName);
        return prodName;
    }

    static String tonerBrand(String name){
//        Scanner tonerBrand = new Scanner(System.in);
        System.out.println("Item Name :"+name);
 }
}

