//Number pyramid
import java.util.*;
public class Numberpyramid {
    public void main(String args[]){
        int n=5;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}