package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        if(sideLength==0){

        }
//        Prosto Jinau***********
        else{
        String ff ="";
        StringBuffer sbFirst = new StringBuffer(ff);
        for(int i = 0;i<sideLength;i++){
            sbFirst.append("8");
        }
//      Ekinshi jinau
        String dd ="";
        StringBuffer sbOrta = new StringBuffer(dd);
        for(int a = 0;a<sideLength;a++){
            if(a==0){
                sbOrta.append("8");
            }else if(a==sideLength-1){
                sbOrta.append("8");
            }else{
                sbOrta.append(" ");
            }
        }
        for(int d = 0;d<sideLength;d++){
            if(d>0 && d<sideLength-1){
                System.out.println(sbOrta);
            }else{
                System.out.println(sbFirst);
            }
        }
        }
    }
}
