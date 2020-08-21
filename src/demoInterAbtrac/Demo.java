package demoInterAbtrac;

public interface Demo<T> extends demo2  { // interface cung  la class, chi tiet hon => interface la 1 abstract class
    void di(int a);
    void ngu();
    T  get();
}
interface  demo2 {
    void chay2();
}

interface SuVat {
    void di();
    void ngu();
}