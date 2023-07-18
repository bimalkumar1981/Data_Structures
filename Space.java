import java.util.ArrayList;
import java.util.List;

public class Space {
    private static final long MEGABYTE = 1024L * 1024L;

    public static long bytesToMegabytes(long bytes) {
        return bytes / MEGABYTE;
    }

    public static void main(String[] args) {
      
		// I assume you will know how to create a object Person yourself...
       int[] arr = new int[8000000];

        for (int i = 0; i < 8000000; i++) {
            arr[i] = i;
        }
        // Get the Java runtime
        Runtime runtime = Runtime.getRuntime();
        // Run the garbage collector
        runtime.gc();
        // Calculate the used memory
        long memory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Used memory is bytes: " + memory);
           }
}