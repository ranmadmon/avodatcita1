public class Main {
    public static String question1(String str){
        String newStr="";
        int index=0;
       while (index<str.length()){
            char a = str.charAt(index);
            int counter=0;
            do {
                index++;
                counter++;
                if (index==str.length()){
                    break;
                }
            }while (str.charAt(index)==a);

            newStr=newStr+a+counter;
        }
       if (newStr.length()>str.length()){
           return str;
       }else {
           return newStr;
       }
    }
    public static void question2(String str){
        String[] words=str.split(" ");
        int max=0;
        int index=0;
        String nameMax="";
        for (int i=0;i<words.length;i++){
            if (words[i].length()>max){
                max= words[i].length();
                nameMax=words[i];
                index=i+1;
            }
        }
        System.out.println("the longest word is : "+nameMax+ "\n" +
                "the word includ "+ max+" letters "+"\n" +
                "the index pf the word int the sentence is : "+index);

    }
    public static boolean question3(int[] arr){
        for (int i=0;i<arr.length;i++){
            while (arr[i]!=0){
                if (arr[i]%2==1){
                    return false;
                }
                arr[i]/=10;
            }
        }
        return true;
    }
    public static void main(String[] args) {

    }
}