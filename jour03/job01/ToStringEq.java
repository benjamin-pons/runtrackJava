public class ToStringEq {
    public static void main(String[] args) {
        System.out.println("Test 1 :");
        Rectangle rect = new Rectangle(12.5, 4.0);
        System.out.println(rect);
        System.out.println();

        System.out.println("Test 2: ");
        RectangleColore rect1 = new RectangleColore(12.5, 4.0, "rouge");
        System.out.println(rect1);
        System.out.println();

        System.out.println("Test 3 :");
        Rectangle rect2 = new RectangleColore(25.0 / 2, 8.0 / 2, new String("rouge"));
        System.out.println(rect2);
        System.out.println(rect1.equals(rect2));  // 1
        System.out.println(rect2.equals(rect1));  // 2
        System.out.println(rect1.equals(null));   // 3
        System.out.println(rect.equals(rect1));   // 4
        System.out.println(rect1.equals(rect));   // 5
    }
}
