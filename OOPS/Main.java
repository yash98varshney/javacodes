package OOPS;

public class Main {
    public static void main(String[] args){
        time t=new time();
        int hr;
        int min;
        int sec;

        int[] temp;

        t.setTime(23, 58, 59);
        // temp=t.getTime();
        // hr=temp[0];
        // min=temp[1];
        // sec=temp[2];
        // System.out.println(hr);
        // System.out.println(min);
        // System.out.println(sec);

        t.incrementTime();
        temp=t.getTime();
        hr=temp[0];
        min=temp[1];
        sec=temp[2];
        System.out.println(hr);
        System.out.println(min);
        System.out.println(sec);
    }
}
