import java.util.concurrent.TimeUnit;

public class Time {

    public static void main(String[] args) throws InterruptedException {

		//start
        long lStartTime = System.currentTimeMillis();

		//task
        for (int i=0;i<80000000 ;i++ )
        {
			;
        }

		//end
        long lEndTime = System.currentTimeMillis();

		//time elapsed
        long output = lEndTime - lStartTime;

        System.out.println("Elapsed time in milliseconds: " + output);

    }

    
}