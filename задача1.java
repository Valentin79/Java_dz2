public class задача1 {
    public static void main(String[] args) {
        String str = "aaaabbcdddde";
        str = str + " "; // пробел в конец сторки, что бы код "видел" последний символ
        System.out.println(str);
        int count = 1;
        String str_code = "";
        String prev = String.valueOf(str.charAt(0));
        for(int i = 1; i < str.length(); i++){
            String current = String.valueOf(str.charAt(i));
            if(current.equals(prev)){
                count++;
                if(i+1 == str.length()){ // для записи последнего символа
                str_code = str_code + String.valueOf(count) + str.charAt(i-1);
            }
            }
            else{
                str_code = str_code + String.valueOf(count) + str.charAt(i-1);
                count = 1;
                prev = String.valueOf(str.charAt(i));
                
            }
            }
            System.out.println(str_code);
        }
    }