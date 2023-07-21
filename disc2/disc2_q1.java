package disc2;

public class disc2_q1 {

    private static class Dog {

        private String name;
        private int size;

        public Dog(String name, int size){
            this.name = name;
            this.size = size;
        }

        public void bark(int number) {

        }

    }

    public static void main(String[] args) {

        /**
         * Those are the corrected lines
         */

        int size = 27;
        String name = "Fido";
        Dog myDog = new Dog(name, size);
        Dog yourDog = new Dog("Scruffy", 1000);

        Dog[] dogList = new Dog[3];

        dogList[0] = myDog;
        dogList[1] = yourDog;
        dogList[2] = new Dog("Jessy", 5);

        //dogList[3] = new Dog("Cutie", 8)

        int x;
        x = size - 5;
        if (x < 15) {
            myDog.bark(8);
            }

    }
}
