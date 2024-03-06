class xyz {
    int i;
    double d;
    String s;
    float f;

    xyz(int a, double e, float c, String t) {
        f = c;
        d = e;
        i = a;
        s = t;
    }

    xyz() {
        i = 800;
        d = 900.00;
    }

    public static void main(String[] args) {
        xyz c1 = new xyz(100, 130.666, 55.6f, "abcdef");
        xyz c2 = new xyz();
        c1.display();
        c2.dis();

/*object c1 object print function */
        void display(){                                 
        System.out.println("int=" + c1.i);
        System.out.println("double=" + c1.d);
        System.out.println("string=" + c1.s);
        System.out.println("float=" + c1.f);
        }
        System.out.println("-------------------------------------");


        /*object c2 object print function */
        void dis(){
        System.out.println("int=" + c2.i);
        System.out.println("double=" + c2.d);
        System.out.println("string=" + c2.s);
        System.out.println("float=" + c2.f);
        }
    }
}