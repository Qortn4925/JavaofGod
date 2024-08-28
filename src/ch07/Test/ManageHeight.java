package ch07.Test;

public class ManageHeight {
    int [][] gradeHeight =new int[5][];
    public static void main(String[] args) {
        ManageHeight mg = new ManageHeight();
        mg.setData();
//        mg.printHeight(4);
        for (int i =0; i<5;i++){
        mg.printAverage(i);
        }


    }
    public void  setData(){
        
        // sibal 왜 아까 오류난거지 개 븅신같이 집ㅇ넣네
        gradeHeight[0] = new int[]{170,180,173,175,177};
        gradeHeight[1]= new int[4];
        gradeHeight[1][0]=160;
        gradeHeight[1][1]=165;
        gradeHeight[1][2]=167;
        gradeHeight[1][3]=186;
        gradeHeight[2] = new int[4];
        gradeHeight[2][0]=158;
        gradeHeight[2][1]=177;
        gradeHeight[2][2]=187;
        gradeHeight[2][3]=176;
        gradeHeight[3] = new int[3];
        gradeHeight[3][0]=173;
        gradeHeight[3][1]=182;
        gradeHeight[3][2]=181;
        gradeHeight[4] = new int[5];
        gradeHeight[4][0]=170;
        gradeHeight[4][1]=180;
        gradeHeight[4][2]=165;
        gradeHeight[4][3]=177;
        gradeHeight[4][4]=172;

    }

    public void printHeight(int classNo){
        ManageHeight mgh=new ManageHeight();
        mgh.setData();
        System.out.println(classNo+1);
        for(int i=0;  i<gradeHeight[classNo].length; i++ ){
            System.out.println(gradeHeight[classNo][i]);
        }

    }

    public void printAverage(int classNo){
        ManageHeight mg = new ManageHeight();
    double average ;
    int hap =0;

    mg.setData();
        for(int i =0; i<gradeHeight[classNo].length ; i++){
            hap= hap+gradeHeight[classNo][i];
        }
         average =((double) (hap))/gradeHeight[classNo].length;
        System.out.println(classNo+1);
        System.out.println(average);
    }
}
