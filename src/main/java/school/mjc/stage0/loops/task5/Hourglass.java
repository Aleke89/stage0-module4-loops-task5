package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {

        String ff = "";
        StringBuffer sbFirst = new StringBuffer(ff);
        for (int i =0;i<height;i++){
            sbFirst.append("8");
        }
        String dd = "";
        StringBuffer sbElse = new StringBuffer(dd);
        for (int i =0;i<height;i++){
            sbElse.append("8");
        }
        if(height==0){

        }else{
            for(int i =0;i<height;i++){
                if(i==0){
                    System.out.println(sbFirst);
                }else if(i==height-1){
                    System.out.println(sbFirst);
                }else {
                    for(int j = i;j<i+1;j++){
                        sbElse.replace(i-1,i," ");
                        sbElse.replace(height-i,height," ");
                        System.out.println(sbElse);
                    }

                }

            }
        }
    }
}
