package com.javacource;

public class cwh_85_finally {
    public static int greet(){
        try{
            int a = 54;
            int b = 18;
            int c = a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("this is finally bock");
        }
        return -1;
    }

    public static void main(String[] args) {

        for(int i = 1 ;i<10;i++){
            try {
                float b = 2/i;
                break;
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("This is Finally block");
            }
        }
//        try{
//            int a = 5;
//            int b = 0;
//            int c = a/b;
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//        finally {
//            System.out.println("This is finally block");
//        }
    }
}
