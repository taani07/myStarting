package DesignPattern;

public class singleton {

    private static singleton instance ;

    private singleton(){};

    public static synchronized singleton getInstance(){
        if(instance ==null)
        {
            instance = new singleton();
        }

        return  instance;
    }

}
