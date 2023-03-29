/* Nama : Ida Mawaddah Nur
   NIM  : 13020210026 */

interface A { public void aaa(); }
interface B extends A {
}

class Central0026 implements B {
   public void aaa() {
      System.out.println("aaa");
   }
   
   public static void main(String arg[]) {
      Central0026 obj = new Central0026();
      System.out.println("main");
      obj.aaa();
   }
}
