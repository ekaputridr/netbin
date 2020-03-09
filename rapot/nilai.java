package rapot;
import java.util.Scanner;
public class nilai extends awal{
    
    void rapot(){
        String nama[][] = new String[4][4];
        String mapel[][] = new String[4][4];
        int nilai[][] = new int[4][4];
        
        Scanner bayu = new Scanner(System.in);
       
        for(int a=0; a<nama.length; a++){
            for(int p=0; p<nama.length; p++){
                System.out.print("nama: ");
                nama[a][p] = bayu.next();
            }
        }
        
        System.out.println("");
        for(int b=0; b<mapel.length; b++){
            for(int k=0; k<mapel.length; k++){
                System.out.print("mapel: ");
                mapel[b][k] = bayu.next();
            }
        }
        
        System.out.println("");
        for(int c=0; c<nilai.length; c++){
            for(int l=0; l<nilai.length; l++){
                System.out.print("nilai: ");
                nilai[c][l] = bayu.nextInt();
            }
        }
        
        System.out.println("");
        
        BUUUUUUU SAYA MENTOK BUUUUUU pUSINGGG
    }

}