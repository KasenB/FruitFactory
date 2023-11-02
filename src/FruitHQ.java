public class FruitHQ {

    public static void main(String[] args) {
        FruitHQ myFactory = new FruitHQ();
    }

    // constructor method
    // a constructor is a method with no return type
    // that has the same name as the class it's in
    public FruitHQ(){
        // strawberry: red, triangle, 200, yes, 20
//        Fruit strawberry; // declaring strawberry
//        strawberry = new Fruit(); // constructing strawberry
//        strawberry.color = "red";
//        strawberry.shape = "triangle";
//        strawberry.numBush = 200;
//        strawberry.isRipe = true;
//        strawberry.numSeeds = 20;
//        strawberry.printInfo();

        // orange: orange, sphere, 10, yes, 20
        Fruit orange;
        orange = new Fruit();
        orange.color = "well, orange...";
        orange.shape = "sphere";
        orange.numBush = 10;
        orange.isRipe = false;
        orange.numSeeds = 20;
        orange.printInfo();

    }

}
