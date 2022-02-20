public class ClassExample {
    public static void main(String[] args) throws Exception {
        Box smallBox = new Box();
        smallBox.setDimension(10, 20, 30);
        smallBox.showDimension();
    }
}

class Box {
    private int length, breadth, height;

    public void setDimension(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    public void showDimension() {
        System.out.println("l = " + length);
        System.out.println("b = " + breadth);
        System.out.println("h = " + height);
    }
}
