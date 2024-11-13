import javax.swing.*;
public class factory{
    //made variable of type string
    String nameoffactory;
    int yearmade;
    boolean inuse;
    public static void main(String[] args) {
        System.out.println("Hello world!");
        new factory();
    }
    public factory(){
        nameoffactory = "pumpkin factory";
        int yearmade = 1;
        inuse = false;
        pumpkin spookly = new pumpkin("square","blue",true, 30);
        pumpkin kat = new pumpkin("round","red",false, 40);
        pumpkin boom = new pumpkin ("circle", "blue", true, 20);
        kat.printinfo();
        spookly.printinfo();
        boom.printinfo();
        pumpkin ghost = new pumpkin();
        ghost.printinfo();
        for (int x=0;x<10;x=x+1){
            pumpkin sammy = new pumpkin();
            sammy.size = (int)(Math.random()*100);
            if (sammy.size <50){
                sammy.ishalloween = true;
            }
            else
            {sammy.ishalloween = false;}
            sammy.printinfo();

        }
        nameoffactory = "P.C. factory";
        System.out.println(nameoffactory);
        cookie noah = new cookie();
        noah.printinfo();
        for (int x=0;x<10;x=x+1) {

            noah.size = (int) (Math.random() * 100);
            noah.price = (int) (Math.random() * 1000);

        }
    }

}