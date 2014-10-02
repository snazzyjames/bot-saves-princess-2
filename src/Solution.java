import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by Snazzyjames on 10/2/14.
 */
public class Solution {
    static void nextMove(int n, int r, int c, String [] grid){

        Integer[] princessPosition = null;
        Integer[] playerPosition = new Integer[]{r,c};
        Integer horizontalDifference = null;
        Integer verticalDifference = null;

        for(int i = 0; i < grid.length; i++) {
            String row = grid[i];
            if (row.contains("p")) {
                princessPosition = new Integer[]{i, row.indexOf("p")};
            }
        }

        if(princessPosition != null){
            verticalDifference = playerPosition[0] - princessPosition[0];
            horizontalDifference = princessPosition[1] - playerPosition[1];
        }

        if(verticalDifference != null && verticalDifference != 0) {
            if (verticalDifference < 0) {
                System.out.println("DOWN");
                return;
            } else {
                System.out.println("UP");
                return;
            }
        }

        if(horizontalDifference != null && horizontalDifference != 0) {
            if (horizontalDifference < 0){
                System.out.println("LEFT");
            }else{
                System.out.println("RIGHT");
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,r,c;
        n = in.nextInt();
        r = in.nextInt();
        c = in.nextInt();
        in.useDelimiter("\n");
        String grid[] = new String[n];


        for(int i = 0; i < n; i++) {
            grid[i] = in.next();
        }

        nextMove(n,r,c,grid);
    }
}
