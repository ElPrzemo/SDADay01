
    public class ComparingString {
        public static void main(String[] args) {
            String andrew = "Andrew";
            String andrzej = "Andrzej";

            //do typow obiektowych uzywamy equals nie ==
            boolean result = andrew.equals(andrzej);
            System.out.println("andrew equals andrzej: " + result);

            result = andrzej.equals(andrew);
            System.out.println("andrzej equals andrew: " + result);

            result = andrew.equals(andrew);
            System.out.println("andrew equals andrew: " + result);

            //porownywanie ignorujac wielkosc liter
            result = andrew.equalsIgnoreCase("andrew");
            System.out.println(result);

            String prefix = "Andre";
            result = andrew.startsWith(prefix);
            System.out.println("andrew starts with prefix: " + result);

            result = andrzej.startsWith(prefix);
            System.out.println("andrzej starts with prefix: " + result);

            result = andrzej.endsWith("zej");
            System.out.println("andrzej ends with zej: " + result);

            result = andrew.contains("dre");
            System.out.println("andrew contains dre:" + result);
        }
    }

