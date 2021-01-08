// MethodOverride...
class MethodOverriding {

     void car() {
         System.out.println("car is moving...");
     }
 }
    class HeroHonda extends MethodOverriding {
        void car() {
            System.out.println("car was left...");
        }


    public static void main(String[] args) {
        HeroHonda h= new HeroHonda();
        h.car();


    }
}
