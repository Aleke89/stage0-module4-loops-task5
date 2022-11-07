package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
//        Jinau
        String ff ="";
        StringBuffer sbFirst = new StringBuffer(ff);
        StringBuffer sbOrta = new StringBuffer(ff);
        for(int i = 0;i<length;i++){
            sbFirst.append("8");
            if(i==0){
                sbOrta.append("8");
            }else if(i==length-1){
                sbOrta.append("8");
            }else{
                sbOrta.append(" ");
            }
        }
//        **************
        for(int d = 0;d<height;d++){
            if(d==0 || d==height-1){
                System.out.println(sbFirst);
            }else{
                System.out.println(sbOrta);
            }
        }

    }
}
