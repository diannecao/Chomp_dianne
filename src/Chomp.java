import java.util.ArrayList;

public class Chomp {
    static void list() {

    }


    static void Organizer(int i, int j, int k) {
        ArrayList<Boards> losingBoard = new ArrayList<Boards>();
        losingBoard.add(new Boards(1,0,0));
//        losingBoard.add(new Boards(2,1,0));
//        losingBoard.add(new Boards(3,1,1));

        ArrayList<Boards> winningBoard = new ArrayList<Boards>();
        boolean isNoLosingBoard=false;
        for(int p=0; p<losingBoard.size();p++ ) {
            System.out.println("starttest "+ losingBoard.get(p).x+ " "+losingBoard.get(p).y+" "+losingBoard.get(p).z);
        }

        // System.out.println(i + " " + j + " " + k);
        System.out.println("Organized boards");
        int f = i, s=j, t=k;

        for(int c=0; c<t; c++){
            k--;
            if(i==0 && j==0 && k==0){
                System.out.println("game over");
                 break;
            }
            for(int p=0; p< losingBoard.size(); p++) {
                if (i == losingBoard.get(p).x && j == losingBoard.get(p).y && k == losingBoard.get(p).z) {
                    winningBoard.add(new Boards(i, j, k));
                    isNoLosingBoard = true;
                }
            }
            if(isNoLosingBoard==false){
                System.out.println("Adding a losing board: "+ i+" "+j+ " "+k);
                losingBoard.add(new Boards(i,j,k));
            }

            System.out.println(i+" "+j+ " "+k);

        }
        k=t;
        for(int b=0; b<s; b++){
            j--;
            if(j<t) {
                k = j;
                if(i==0 && j==0 && k==0){
                    System.out.println("game over");
                    break;
                }
                System.out.println(i+" "+j+" "+j);
            }else {
                //System.out.println(k);
                if(i==0 && j==0 && k==0){
                    System.out.println("game over");
                    break;
                }
                for(int p=0; p< losingBoard.size(); p++) {
                    if (i == losingBoard.get(p).x && j == losingBoard.get(p).y && k == losingBoard.get(p).z) {
                        winningBoard.add(new Boards(i, j, k));
                        isNoLosingBoard = true;
                    }
                }
                if(isNoLosingBoard==false){
                    System.out.println("Adding a losing board: "+i+" "+j+ " "+k);
                    losingBoard.add(new Boards(i,j,k));
                }
                System.out.println(i + " " + j + " " + k);
            }
        }
        j=s;
        k=t;
        for(int a=0; a<f; a++){
            i--;
            if(i<s && i<t){
                j=i;
                k=i;

            }else if(i<s && i>t){
                j=i;

            }else if(i<s && i==t){
                j=i;
            }
            if(i==0 && j==0 && k==0){
                System.out.println("game over");
                break;

            }
            for(int p=0; p< losingBoard.size(); p++) {
                if (i == losingBoard.get(p).x && j == losingBoard.get(p).y && k == losingBoard.get(p).z) {
                    winningBoard.add(new Boards(i, j, k));
                    isNoLosingBoard = true;
                }
            }
            if(isNoLosingBoard==false){
                System.out.println("Adding a losing board: "+i+" "+j+ " "+k);
                losingBoard.add(new Boards(i,j,k));
            }
            System.out.println(i+" "+j+" "+k);

        }

//        for (int a=0; a <= i; a++) {

//            for (int b =0; b <= j; b++) {
//                    for (int c=0; c<=k; c++) {
//                        if(i==1 && j==0 && k==0){
//                         //   System.out.println("losing board");
//                        }
//
//                     //   System.out.println(i + " " + j + " " + k);
//                }

            //}
        for(int p=0; p<losingBoard.size();p++ ) {
            System.out.println("test "+ losingBoard.get(p).x+ " "+losingBoard.get(p).y+" "+losingBoard.get(p).z);
        }
        }


    public static void main(String[] args) {


        boolean gameOver = false;
        int cnt = 0;
        for(int i=0; i<=3; i++){
            for(int j=0; j<=i; j++){
                for (int k = 0; k<=j; k++) {
                    if(i==0 && j==0 && k==0) {
                        continue;
                    }
                    cnt ++;
                    System.out.println("Possible board Number " + cnt);
                        System.out.println(i + " " + j + " " + k);
                        Organizer(i, j, k);

                }
            }
        }

    }
}
