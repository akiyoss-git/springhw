package springhw.beans;

@Scope("singleton")
public class PrinterBean {
    private static PrinterBean instance;

    public static synchronized PrinterBean getInstance() {
        if (instance == null) {
            instance = new PrinterBean();
        }
        return instance;
    }

    private PrinterBean(){}

    public void print(Object object){
        System.out.println(object);
    }
}

