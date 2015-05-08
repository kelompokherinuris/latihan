/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pengurangan;

/**
 *
 * @author SBC4
 */
public class Pengurangan {

    
public static void main(String[] args) {
System.out.print("Masukkan bilangan a: ");
String str1 = System.console().readLine();
System.out.print("Masukkan bilangan b: ");
String str2 = System.console().readLine();
// method parseInt() digunakan untuk mengkonversi
// ke tipe integer
int a = Integer.parseInt(str1);
int b = Integer.parseInt(str2);

System.out.println("a - b = " + (a - b));

}
}

