import java.util.concurrent.TimeUnit;
class Main
 {
    public static void main(String[] args)
   { 
     long milliseconds = 1000000;
     long seconds = TimeUnit.MILLISECONDS.toSeconds(milliseconds);
     System.out.println(milliseconds + " Milliseconds = " + seconds + " Seconds"); 
     long minutes = TimeUnit.MILLISECONDS.toMinutes(milliseconds);
     System.out.println(milliseconds + " Milliseconds = " + minutes + " Minutes");
   } 
 }