import java.util.Scanner;

class DynamicArray{
    int size;
    int count;
    int[] array;
    public DynamicArray(){
        this.size = 1;
        this.array = new int[size];
        this.count = 0;
    }
    public void increase(){
        if(this.size == this.count){
            int[] newarray = new int[size+1];
            for (int i = 0; i< count; i++){
                newarray[i] = array[i];
            }
            array = newarray;
            size++;
        }
    }

    void insert(int element){
        increase();
            array[count] = element;
            count++;
    }
    void print(){
        for(int i: array){
            System.out.println(i+" ");
        }
    }

}
 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DynamicArray obj = new DynamicArray();
        System.out.println("Enter The Elements Of The Array ");
        System.out.println("Press 0 When You're Done: ");
        while (true) {
            int element = sc.nextInt();
            if(element == 0) {
                break;
            }
                obj.insert(element);
        }
        obj.print();
    }
}