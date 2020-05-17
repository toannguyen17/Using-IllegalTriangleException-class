package app;

public class Main {
    public static void main(String[] args) {
        AppEx app = new AppEx();
        try{
            app.start();
        }catch (IllegalTriangleException e){
            e.printStackTrace();
        }

    }
}
