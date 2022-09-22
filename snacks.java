import java.util.*;

class snacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pizza = 100;
        int puff = 20;
        int coolDrink = 10;
        
        System.out.println("Enter the no of pizzas bought:");
        int pizzaCount = sc.nextInt();
        System.out.println("Enter the no of puffs bought:");
        int puffCount = sc.nextInt();
        System.out.println("Enter the no of cool drinks bought:");
        int coolDrinkCount = sc.nextInt();
        
        long price = pizza * pizzaCount + puff * puffCount + coolDrink * coolDrinkCount;
        
        System.out.println("Bill Details");
        System.out.println("No of pizzas:" + pizzaCount);
        System.out.println("No of puffs:" + puffCount);
        System.out.println("No of cooldrinks:" + coolDrinkCount);
        System.out.println("Total price=" + price);
        System.out.println("ENJOY THE SHOW!!!");
    }
}