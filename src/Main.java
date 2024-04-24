public class Main {
    public static void main(String[] args) {
        int oldPlace = 34;
        int newPlace = 0;
        int actualContentTruck = 0;
        int maxContentTruck = 9;
        while (oldPlace > 0){
            if(actualContentTruck == maxContentTruck){
                newPlace = actualContentTruck;
                actualContentTruck = 0;
                System.out.println("There is " + newPlace + "in the new place");
            }
            else{
                actualContentTruck++;
                oldPlace--;
                System.out.println("There is " + oldPlace + "in the old place");
            }
        }
        System.out.println("Hello world!");
    }
}