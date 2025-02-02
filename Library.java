

class Library
 {
    String t, a;
    double p;
    boolean avl;

    Library(String t, String a, double p, boolean avl) {
        this.t = t;
        this.a = a;
        this.p = p;
        this.avl = avl;
    }

    boolean borrow() {
        if (avl) {
            avl = false;
            return true;
        }
        return false;
    }
}
