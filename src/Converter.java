import java.security.PrivateKey;

public class Converter {
    private int number;
    private String number1="";
    private StringBuilder input;
    private String temp;
    private int[] convert = new int[4];
    private int length;
    private String octal="";
    private String hex ="";
    private String binary="";
    private String sub;

    Converter (int number) {
        this.number = number;
        input = new StringBuilder();
        toBinary(this.number);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String toDecimal(){
        String decimal="";
        convert[0]=8;
        convert[1]=4;
        convert[2]=2;
        convert[3]=1;
        int dec = 0;
        for(int i=length, j=0; i<=3 ; i++,j++ ){
            int num = (int) sub.charAt(j);
            num-=48;
            if(num == 1){
                dec += convert[i];
            }
        }
        char init = 'A';
        if(dec<=9)
            decimal =  Integer.toString(dec);
        else
        {
            decimal = Character.toString(init+(dec-10));
        }
        return decimal;
    }
    public String toHex(){
        number1 = binary;
        length = number1.length();
        length%=4;
        if(length==1){
            number1 = "000" + number1;
        }
        if (length==2){
            number1 = "00" + number1;
        }
        if(length==3){
            number1 = "0" + number1;
        }
        length=0;
        for(int i=0; i<=number1.length()-4; i+=4){
            sub=number1.substring(i,i+4);
            hex += toDecimal();
        }
        return hex;
    }
    public String toOctal(){
        number1 = binary;
        length = number1.length();
        length%=3;
        if(length==1){
            number1 = "00" + number1;
        }
        if (length==2){
            number1 = "0" + number1;
        }
        length=1;
        for(int i=0; i<=number1.length()-3; i+=3){
            sub=number1.substring(i,i+3);
            octal += toDecimal();
        }
        return octal;
    }

    private void toBinary(int number){
        for(int i=number; i!=0; i/=2){
            temp = Integer.toString(i%2);
            binary += temp;
        }
        input.append(binary);
        input.reverse();
        binary = input.toString();
    }

    public String toBinary(){
        return binary;
    }

}
