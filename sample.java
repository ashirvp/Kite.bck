public class sample {

    public static void main(String[] args) {

        Happy H1 = new Happy();
        Happy H2 = new Happy();

        H1.a = 10;
        H2.b = 20;
        H1.b = 30;
        H2.a = 40;

        H1.display();

    }

}

class Happy {

    int a;
    int b;

    void display() {
        System.out.println(a);
    }
}