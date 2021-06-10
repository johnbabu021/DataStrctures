public class SameString {
     public static String newString(String str){
         int letterCount=1;
         char letterString;

         char[] charArray=new char[str.length()];
         for(int i=0;i<str.length();i++){
             int letterPosition=str.charAt(i);
             charArray[i]=(char) letterPosition;
int length=str.length()-1;
             if (i<length&&str.charAt(i)==str.charAt(i+1))
             {

                 letterCount=letterCount+1;



               continue;

             }
             if(i<length&&letterCount!=1&&str.charAt(i)!=str.charAt(i+1)){
                 System.out.print(letterCount+" ");
                 letterString=charArray[i];
                 System.out.print(letterString+" ");
                 letterCount=1;
                 continue;

             }

             if(i==length&&letterCount!=1){
                 System.out.print(letterCount+" ");
                 letterString=charArray[i];
                 System.out.println(letterString);

                 continue;
             }

         }


         return new String(charArray);


     }



    public static void main(String[] args) {
        String value="JOHN aaa bbb yuuuukkasfkskfkkkkkkkkkkkkkkkkkkkkkku";
        System.out.println("");
        System.out.println(newString(value));


    }


}