// MethodOverride...
class MethodOverriding {

     void run() {
         System.out.println("car is running...");
     }
 }
    class HeroHonda extends MethodOverriding {
        void run() {
            System.out.println("HeroHonda car is running...");
        }


    public static void main(String[] args) {
        HeroHonda h= new HeroHonda();
        h.run();


    }
}
