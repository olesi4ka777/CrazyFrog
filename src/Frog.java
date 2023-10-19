import java.util.Random;

public class Frog {
    public void catchMosq(Mosquito[] mosqArray)
    {
        int staja = mosqArray.length-1;
        int count=0;
        while (staja>0) {
            Random ran = new Random();
            int k = ran.nextInt(mosqArray.length);
            if (mosqArray[k].alive) {
                System.out.println("Ква" + k);
                mosqArray[k].alive = false;
                staja--;
                count++;
            }
        }
        System.out.println("Всех съела за " + count + " приемов ");

    }
}
