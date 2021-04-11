public class DynamicArraylist {

    int[] array;
    int i=0;
    int[] dynArray;
    int j=0;

// Initiate
    public DynamicArraylist(int length){
        if (length > 0) {
            this.array = new int[length];
        }
    }

// ADD
    public void add(int element){
        if(i < array.length) {
            array[i] = element;
            i++;
        }
        else {
            if(dynArray==null){
                dynArray = new int[16];
                for (j=0;j<array.length;j++) {
                    dynArray[j] = array[j];
                }
            }
            if (i<dynArray.length){
                dynArray[i] = element;
                i++;
            }
        }
    }

// GET
    public int get(int index){
        if (index < dynArray.length) {
            for (int j=0;j<dynArray.length;j++) {
                System.out.println("Get element at index "+ index + " is : " + dynArray[index]);
                return dynArray[index];
            }
        }
        else {
            System.out.println("GET REQUEST :: Enter valid index !!");
        }
        return 0;
    }

// REMOVE
    public void remove(int index){
        if (index < dynArray.length) {
            for (int j=index-1; j<dynArray.length; j--) {
                int temp = index+1;
                if (temp != dynArray.length) {
                    dynArray[index] = dynArray[temp];
                    index++;
                }
            }
        }
        else {
            System.out.println("REMOVE REQUEST :: Enter valid index !!");
        }
    }


// PRINT LIST
    public void printList(){
        if (array.length > 0 && dynArray.length > 0){

            for (int k=0;k<array.length;k++) {
                System.out.println("Default array :: "+array[k]);
            }
            System.out.println();
            for (int k=0;k<dynArray.length;k++) {
                System.out.println("Dynamic array :: "+dynArray[k]);
            }
        }
    }

    public static void main(String[] args) {
        DynamicArraylist dynamicArraylist = new DynamicArraylist(10);
        dynamicArraylist.add(21);
        dynamicArraylist.add(22);
        dynamicArraylist.add(23);
        dynamicArraylist.add(24);
        dynamicArraylist.add(25);
        dynamicArraylist.add(26);
        dynamicArraylist.add(27);
        dynamicArraylist.add(28);
        dynamicArraylist.add(29);
        dynamicArraylist.add(30);
        dynamicArraylist.add(31);
        dynamicArraylist.add(32);
        dynamicArraylist.add(33);
        dynamicArraylist.add(34);
        dynamicArraylist.add(35);
        dynamicArraylist.add(36);
        dynamicArraylist.add(37);
        dynamicArraylist.add(38);
        dynamicArraylist.add(39);


        dynamicArraylist.printList();
    }
}
