/*
 * Breshna Rahimzy
 * Student ID: 991487145
 *     SYST10199 - WEB Programming
 */
package arrayobject1;

public class ArrayObject1 {

    public static void main(String[] args) {
        student1 students[] = new student1[4];

        students[0] = new student1("harsh", 12);
        students[1] = new student1("harsh", 10);
        students[2] = new student1("harsh", 13);
        students[3] = new student1("harsh", 15);

        for (int sub = 0; sub < students.length; sub++) {
            System.out.println("name:" + students[sub].name + "age:"
                    + students[sub].age);
        }
    }

}

class student1 {

    String name;
    int age;

    public student1(String name, int age) {
        this.name = name;
        this.age = age;
    }
   public class vicheles{
        private double gollonsOfGass;
        private int mpg;

        /**
         * @return the gollonsOfGass
         */
        public double getGollonsOfGass() {
            return gollonsOfGass;
        }

        /**
         * @param gollonsOfGass the gollonsOfGass to set
         */
        public void setGollonsOfGass(double gollonsOfGass) {
            this.gollonsOfGass = gollonsOfGass;
        }

        /**
         * @return the mpg
         */
        public int getMpg() {
            return mpg;
        }

        /**
         * @param mpg the mpg to set
         */
        public void setMpg(int mpg) {
            this.mpg = mpg;
        }
        
    }
}
