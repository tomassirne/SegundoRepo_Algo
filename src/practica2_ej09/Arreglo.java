package practica2_ej09;

public class Arreglo {
    public static boolean sonIguales (Integer[] arr1,Integer[] arr2){
        boolean sonIguales = true;
        if( arr1.length == arr2.length){
            int i = 0;
            while (sonIguales && i < arr1.length ){
                if(arr1[i] != arr2[i]){
                    sonIguales = false;
                }
                i++;
            }
        }else{
            sonIguales = false;
        }
        return sonIguales;
    }


    public static void main(String[] args) {
        Integer[] num1 = {1,2,3,4,5};
        Integer[] num2 = {1,2,3,4,5};

        boolean sonIguales = sonIguales(num1, num2);

        System.out.println(sonIguales);
    }
}
