public class Fruit {

    // variable declarations
    public String color;
    public String shape;
    public int numSeeds;
    public boolean isRipe;
    public int numBush;
    public void printInfo(){
        System.out.println("The fruit's color is: " + color);
        System.out.println("The fruit's shape is: " + shape);
        System.out.println("The fruit's seed count is: " + numSeeds);
        if (isRipe == true){
            System.out.println("The fruit is ripe");
        }
        else {
            System.out.println("The fruit is not ripe");
        }
        System.out.println("The fruit's number per bush is: " + numBush);
    }
    public Fruit(String paramColor, String paramShape, int paramNumSeeds, boolean paramIsRipe){
        color = paramColor;
        shape = paramShape;
        numSeeds = paramNumSeeds;
        isRipe = paramIsRipe;
        numBush = (int) (Math.random()*100);
    }
}
