package torpedojatek;

import java.util.Arrays;
import java.util.Scanner;

public class TorpedoJatek {

    public static String[] palya = new String[7];
    
    public String kiir(){

        //pálya legenerálása
        for (int i = 0; i < palya.length; i++) { 
            palya[i] = "_";
        }
        //pálya kiiratása
        System.out.println(Arrays.toString(palya));
  
        return "";
    }
    
    public String lovesBeker(){
    
        int hajoTalalat = 0;
        int loves = 0;
        boolean hajoEl = true;
        Hajo hajo = new Hajo(new int[]{2, 3, 4});
        Scanner sc = new Scanner(System.in);
        
        while(hajoEl == true){
            
            System.out.println("Lövés helye? (0-6): ");
            int beker = sc.nextInt();
            while (beker > 6 || beker < 0){
                
                System.out.println("HIBA: Nem megfelelő számot adott meg!");
                System.out.println("Lövés helye? (0-6): ");
                beker = sc.nextInt();
            }
            loves++;
            
            if (hajo.talalat(beker) == "talált"){
                hajoTalalat++;
                System.out.println("talált");
            }else{
            
                System.out.println("mellé");
            
            }
            if (hajoTalalat >= 3){
                hajoEl = false;
            }
        }
             
        System.out.printf("elsüllyedt a hajó %d lövésből!", loves);
        return "";
        
    }
    
    public static void main(String[] args) {
        
        TorpedoJatek t = new TorpedoJatek();
        
        t.kiir();
        t.lovesBeker();
            
    }
    
}
