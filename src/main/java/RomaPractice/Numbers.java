package RomaPractice;

public class Numbers {
    // x+3=5

    static byte a = 126;                 //2^8 = 256                             (от -128 до 127)
    static short b = 777;                //2^16 = 65.538                         (от -32768 до 32767)
    static int c = 35000;                  //2^32 = 4.294.967.896                  (от -2147483648 до 2147483647)
    static long d = 1_000_000_000_000_000L;                 //2^64 = 18.446.744.073.709.551.616     (от -9223372036854775808L до 9223372036854775807L)

    static char e = 'C';                 //2^16 = 65.538                     (от 0 до 65537) кодирока Unicode

    static float f = 7.1f;               //2^32    *в конце f для обозначения типа float (от ~-1.4*10^45 до ~3.4*10&38)
    static double g = 6.3;               //2^64    *  конце ничего не ставим             (от ~-4.9*10^324 до ~1.8*10*38)

    static boolean h = true;                  //8 bit   (в массивах), и 32 bit (не в массивах)


}
