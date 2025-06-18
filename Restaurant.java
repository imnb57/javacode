// 4. You are working on a restaurant ordering system. There are different types of menu items, such as appetizers, main courses, and beverages. Each menu item has its own preparation and serving methods. Implement a Java program using polymorphism to handle the ordering and preparation of different types of menu items.
abstract class Restaurant {
    
    abstract void preparation();
    abstract void serving();
}
class Appetizers extends Restaurant{
    private final String name;
    public Appetizers(String name ){
        this.name = name;

    }
    @Override
    public void preparation(){
        System.out.println("preparing appetizer :"+name);

    }@Override
    public void serving(){
        System.out.println("you are being served : "+name);

    }

}
class MainCourse extends Restaurant {
    private final String name;

    public MainCourse(String name) {
        this.name = name;
    }

    @Override
    public void preparation() {
        System.out.println("Cooking main course: " + name);
    }

    @Override
    public void serving() {
        System.out.println("Serving main course: " + name);
    }
}

class Beverages extends Restaurant {
    private final String name;

    public Beverages(String name) {
        this.name = name;
    }

    @Override
    public void preparation() {
        System.out.println("Pouring beverage: " + name);
    }

    @Override
    public void serving() {
        System.out.println("Serving beverage: " + name);
    }
     public static void main(String[] args) {
        Restaurant appetizer = new Appetizers("Spring Rolls");
        Restaurant mainCourse = new MainCourse("Grilled Chicken");
        Restaurant beverage = new Beverages("Lemonade");

        appetizer.preparation();
        appetizer.serving();

        mainCourse.preparation();
        mainCourse.serving();

        beverage.preparation();
        beverage.serving();
    }
}
