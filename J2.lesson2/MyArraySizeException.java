package J2.lesson2;

public class MyArraySizeException extends Throwable {
    public int i;
    public int j;

    MyArraySizeException(int i, int j){
        this.i = i;
        this.j = j;
    }


    public MyArraySizeException() {

    }
}
