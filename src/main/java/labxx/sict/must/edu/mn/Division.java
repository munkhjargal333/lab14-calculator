package labxx.sict.must.edu.mn;

/**
 * Хуваах үйлдлийг гүйцэтгэдэг класс.
 * Hotfix v1.0.1: NaN болон Infinity шалгалт нэмсэн.
 */
public class Division {
    
    /**
     * Хоёр тоог хуваана.
     *
     * @param a эхний тоо
     * @param b хоёрдугаар тоо
     * @return хуваарь
     * @throws IllegalArgumentException хэрэв b нь 0 эсвэл NaN бол
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Тэгээр хуваах боломжгүй");
        }
        if (Double.isNaN(a) || Double.isNaN(b)) {
            throw new IllegalArgumentException("NaN утга хүлээн авах боломжгүй");
        }
        if (Double.isInfinite(a) || Double.isInfinite(b)) {
            throw new IllegalArgumentException("Infinity утга хүлээн авах боломжгүй");
        }
        return a / b;
    }
}