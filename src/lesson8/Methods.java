package lesson8;

public class Methods {
    public static int summaChiselBy5(int[] massive) {
        int sumChiselBy5 = 0;
        for (int i = 0; i<massive.length;i++){
            if(massive[i]%5==0){
                sumChiselBy5 += massive[i];
            }
        }
        return sumChiselBy5;
    }
    public static int [] massivWithNums (int[] massiv, char chislo){
        int countChisla = 0;

        for (int i = 0; i < massiv.length;i++){
            char[] chars = ("" + massiv[i]).toCharArray();
            for (int j = 0; j < chars.length; j++){
                if (chars[j]==chislo){
                    countChisla++;
                    break;
                }
            }
        }
        int[] result = new int[countChisla];
        int index = 0;
        for (int i = 0; i < massiv.length;i++){
            char[] chars = ("" + massiv[i]).toCharArray();
            for (int j = 0; j < chars.length; j++){
                if (chars[j]==chislo){
                    result[index]=chars[j];
                    index++;
                    break;
                }
            }
        }
        return result;
    }

    public static String getEqualChar(String text1, String text2){
        char[] charsFromText1 = text1.toCharArray();
        char[] charsFromText2 = text2.toCharArray();
        String result = "";
        for (int i = 0; i < charsFromText1.length; i++){
            for (int j = 0; j < charsFromText2.length;j++){
                if (charsFromText1[i]==charsFromText2[j]){
                    result+=charsFromText1[i];
                    break;
                }
            }
        }
        return result;
    }
}
