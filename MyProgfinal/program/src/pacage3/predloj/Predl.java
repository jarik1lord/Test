package pacage3.predloj;
import java.util.Arrays;
import java.util.stream.Collectors;
/**
 * Created by jarik on 27.09.2019.
 */
public class Predl {
    private static String st;

    public Predl(){
    }
    public String getST(){
        return this.st.toString();
    }
    public void setST(String s){
        this.st=new String(s.toString());
    }
    public short colslov(){
        short c=0,ind=-1;
        short i=0;
        for (i=0;i<st.length();i++){
            if(st.charAt(i)==' ') {if ((i-1!=ind)) c++; ind=i;}
        }
        if (ind<i-1) c++;
        return c;
    }
    private String[] masSt(){
        String[] slovArray= new String[colslov()];
        short c=0,ind=-1;
        short i=0;
        for (i=0;i<st.length();i++){
            if(st.charAt(i)==' ') {if ((i-1!=ind)) {slovArray[c]=st.substring(ind+1,i); c++;} ind=i;}
        }
        if (ind<i-1) slovArray[c]=st.substring(ind+1,i);;
        return slovArray;
    }
    public String sortST(){
        String[] slovArray= masSt();
        Arrays.sort(slovArray);
        return Arrays.stream(slovArray).collect(Collectors.joining(" "));
    }
    public String capsST(){
        String[] slovArray =masSt();
        for (int i=0; i<slovArray.length; i++) {
            slovArray[i]=slovArray[i].replaceFirst(slovArray[i].substring(0,1).toString(),slovArray[i].substring(0,1).toUpperCase());/**/
        }
        return Arrays.stream(slovArray).collect(Collectors.joining(" "));
    }
}
