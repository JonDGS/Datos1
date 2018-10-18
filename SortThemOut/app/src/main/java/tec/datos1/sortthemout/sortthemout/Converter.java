package tec.datos1.sortthemout.sortthemout;

public class Converter {
    public static String ArrayToString(int [] list){
        int n = list.length;
        String listString = "";
        for(int i = 0; i < n; i++){
            if(i == 0){
                listString = String.valueOf(list[i]);
            }else{
                listString += ',' + String.valueOf(list[i]);
            }
        }
        return listString;
    }

    public static int[] StringToArray(String list){
        int n = list.length();
        int[] listArray = new int[(n+1)/2];
        int j = 0;
        for(int i = 0; i < ((n+1)); i += 2){
            listArray[j] = Integer.parseInt(String.valueOf(list.charAt(i)));
            j++;
        }
        return listArray;
    }
}
