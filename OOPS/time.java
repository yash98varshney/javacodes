package OOPS;

public class time {
    private int min;
    private int hour;
    private int sec;
    final int MAX_HOUR=23;
    final int MAX_SEC=59;

    //Constructor 

    public time(){
    
    }

    public void setTime(int hour,int min,int sec){
        if(hour >=0 && hour<=MAX_HOUR){
            this.hour=hour;
        }

        if(min >=0 && min<=MAX_SEC){
            this.min=min;
        }

        if(sec >=0 && sec<=MAX_SEC){
            this.sec=sec;
        }
        else{
            this.sec=0;
        }
    }

    public int[] getTime(){
        return new int[]{this.hour,this.min,this.sec};
    }

    public void incrementTime(){
        this.sec=++this.sec%(MAX_SEC+1);
        if(sec==0){
            this.min=++this.min%(MAX_SEC+1);
        }
        if(min==0){
            this.hour=++this.hour%(MAX_HOUR+1);
        }
    }
}
