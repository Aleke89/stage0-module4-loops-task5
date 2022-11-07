package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        String ff = "" ;
        StringBuffer stringBuffer = new StringBuffer(ff);
        for(int d = 1;d<sideLength;d++){
            if(d==(sideLength/2)+1){
                stringBuffer.append("8");
            }
            stringBuffer.append(" ");
        }
        String center ="";
        StringBuffer stringBufferCenter = new StringBuffer(center);
        for(int d = 1;d<=sideLength;d++){
            stringBufferCenter.append("8");
        }
        if(sideLength==0){

        }else{
            for(int i =1;i<sideLength;i++){
                if(i==(sideLength/2)+1){
                    System.out.println(stringBufferCenter);
                }
                System.out.println(stringBuffer);
            }
        }
    }
}
