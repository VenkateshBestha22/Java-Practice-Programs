package OOPs_Concepts.Interfaces;

public class User {
    public static void main(String[] args) {
        Lenovo lenovo = new Lenovo();
        lenovo.cut();
        lenovo.copy();
        lenovo.paste();
        lenovo.keyboard();
        lenovo.capture();

        HP hp =new HP();
        hp.Printers();

        Apple apple = new Apple();
        apple.keyboard();

        //untill the java 7 , java 8 come with  many new features like stream api, collections , list,
    }
}
