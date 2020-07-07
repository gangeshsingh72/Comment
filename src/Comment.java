public class Comment {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // single line comment;
        //
        //
        System.out.println("Hello comments"); //ctrl+slash ctrl+shift+slash

        /*
        System.out.println("Comment 1");
        System.out.println("Comment 2");
        System.out.println("Comment 3");
        System.out.println("Comment 4");
        System.out.println("Comment 5");
        System.out.println("Comment 6");
        System.out.println("Comment 7");
        */
        System.out.println("sum of 3 & 4 is " + sum(3, 4));
        //System.out.println("sum of 8 & 8 is " + anotherSum(8, 8));
       // System.out.println("sum of 8 & 8 is " + newMethod(8,8));
        //System.out.println("sum of 8 & 8 is " + myBadMethod());   // returns 55

    }

    public int myBadMethod() {
        int something;
        something = 25;
        something = something + 30;
        return something;
    }

    public int anotherSum(int a, int b) {
        return a + b;
    }

    /**
     * @param a this is first parameter
     * @param b this is second parameter
     * @return this is sum of a & b
     */
    public static int sum(int a, int b) {
        return (a + b);
    }

    /**
     * @param x
     * @param y
     */

    public static void newMethod(int x, int y) {

    }
}




