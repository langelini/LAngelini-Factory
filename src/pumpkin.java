public class pumpkin {
    int size;
    String color;
    String shape;
    boolean ishalloween;
    public pumpkin(String pShape, String pcolor, boolean pishalloween, int psize){
        System.out.println("making a pumpkin!");
        size = psize;
        color = pcolor;
        shape = pShape;
        ishalloween = pishalloween;
    }
    public pumpkin(){
        size = (50);
        color ="2";
        shape = "50";
        ishalloween = true;

    }
    public void printinfo() {
        System.out.println(size);
        System.out.println(shape);
        System.out.println(color);
        if(ishalloween){
            System.out.println("am halloween");
        } else {
            System.out.println("am regular");
        }
    }
}