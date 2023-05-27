public class GlobalVersulLocalVariables {

    static int globalVariable = 1;

    static int anotherGlobalVariable = 2;

    static final int globalConstant = 3;


    public static void main(String[] args) {

        int localVariable = 4;
        final int localConstant = 5;


        System.out.println(":::GLOBAL:::");
        System.out.println(globalVariable);
        System.out.println(anotherGlobalVariable);
        System.out.println(globalConstant);

        System.out.println(":::LOCAL:::");
        System.out.println(localVariable);
        System.out.println(localConstant);

        System.out.println("New Global: " + newGlobal);

    }

    static int newGlobal = globalVariable;
}
