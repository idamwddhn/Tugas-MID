/* Nama : Ida Mawaddah Nur
   NIM  : 13020210026 */

public class TestErr20026 {
    public static void main(String[] args) {
        int tot = 0;
        int j = 5;
        for (int i = 0; i < 10; i++) {
            tot += i;
            if (i < j) {
                System.out.println(i);
            } else {
                System.out.println(j);
            }
        }
        do {
            j++;
        } while (j < 10);
        while (j < 15) {
            j++;
        }
    }
}
