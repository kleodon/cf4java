package gr.aueb.cf.ch2;

public class IntTypesApp {
    public static void main(String[] args) {

        System.out.printf("Type: %s,\t Size %d bits,\t Min: %,d,\t Max: %,d \n",
                Byte.TYPE,
                Byte.BYTES * 8,
                Byte.MIN_VALUE,
                Byte.MAX_VALUE );

        System.out.printf("Type: %s,\t Size %d bits,\t Min: %,d,\t Max: %,d \n",
                Short.TYPE,
                Short.BYTES * 8,
                Short.MIN_VALUE,
                Short.MAX_VALUE );

        System.out.printf("Type: %s,\t Size %d bits,\t Min: %,d,\t Max: %,d \n",
                Integer.TYPE,
                Integer.BYTES * 8,
                Integer.MIN_VALUE,
                Integer.MAX_VALUE );

        System.out.printf("Type: %s,\t Size %d bits,\t Min: %,d,\t Max: %,d \n",
                Long.TYPE,
                Long.BYTES * 8,
                Long.MIN_VALUE,
                Long.MAX_VALUE );



    }
}
