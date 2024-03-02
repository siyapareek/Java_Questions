

class ArrayEX   {
    void demoArrays() {
        int[] ages=new int[3];
        String[] name=new String[3];
        float[] weight=new float[3];
        ages[1]=5;
        ages[2]=79;
        name[0]="hello";
        weight[1]=1;


        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(name[0]);
        System.out.println(weight[1]);

    }
}
public class ArrayExample{
    public static void main(String[] args) {

        ArrayEX obj = new ArrayEX();
        obj.demoArrays();


    }
}
