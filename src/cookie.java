public class cookie {
    int size;
    int price;
    String type;
    public cookie(){
        System.out.println("making a cookie!");
        size = 10;
        price = 1000;
        type = "double chunky";

    }
    public cookie(int csize, int cprice, String ctype){
        size = csize;
        price = cprice;
        type = ctype;
    }
    public void printinfo() {
        System.out.println(size);
        System.out.println(type);
        System.out.println(price);
    }
}

