import java.util.Scanner;
public class Daireninalani {
 public static void main(String[] args) {
Scanner inp = new Scanner(System.in); 
double 𝜋 ,  r , a , Daireninalani,daireninçevresi,merkezaçısınınölçüsü;

𝜋 = 3.14 ; a=70; 

System.out.print("Pi  sayısını giriniz :" );
𝜋  = inp.nextDouble();
 
System.out.print("Yarıçapını giriniz :");
  r = inp.nextDouble();
  Daireninalani = 𝜋*r*r; daireninçevresi = 2*𝜋*r;
  merkezaçısınınölçüsü=(𝜋*(r*r)*a)/360;
System.out.println("Dairenin alanı : "+Daireninalani);

System.out.println("Dairenin çevresi :"+daireninçevresi);

System.out.println("Merkez açısının ölçüsü alfa kabul edilmiştir ");

System.out.println("Daire diliminin alanı :"+merkezaçısınınölçüsü);
}   
}
