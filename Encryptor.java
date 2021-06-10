public class Encryptor {

    public static String newString(String str,int key){

        int newKey=key%26;
        char[] charArray=new char[str.length()];
for(int i=0;i<str.length();i++){

    int letterposition= str.charAt(i)+newKey;
    if(letterposition<=122){
        charArray[i]=(char) letterposition;
    }
    else{
        charArray[i]=(char) (96+letterposition%122);
    }
        }
        return new String(charArray);

    }

    public static void main(String[] args) {
        String value="hai";
        System.out.println(newString(value,2));
    }



}