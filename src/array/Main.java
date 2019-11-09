package array;

public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(4);
        myArrayList.add(7);
        myArrayList.add(3);
        myArrayList.add(2);
        myArrayList.add(5);
        myArrayList.add(8);
        myArrayList.add(1);
        myArrayList.add(6);
 //       myArrayList.resizeUp();
        myArrayList.add(9);
        myArrayList.show();
        myArrayList.showProperties();
    }
}
