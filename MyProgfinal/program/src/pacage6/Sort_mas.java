package pacage6;

import java.util.ArrayList;

/**
 * Created by jarik on 27.09.2019.
 */

public class Sort_mas {
    ArrayList<Vesh> nabor=new ArrayList<Vesh>();
    public String st="";
    public int max_st=0;
    public int max_gruz=0;
    public Sort_mas(int max_g){
        this.max_gruz=max_g;
    }
    public void add_mas(int i,int v,int c){
        int ind=0;
        while ((ind<nabor.size())&&(nabor.get(ind).ves>v)){ind++;}
        nabor.add(ind,new Vesh(i,v,c));
    }
    public void variant(int i, int j, String s,int sum_v,int sum_c){
        for (int k=i;k<j;k++) {
            if (sum_v+nabor.get(k).ves < max_gruz) {
                sum_v=sum_v+nabor.get(k).ves;
                sum_c=sum_c+nabor.get(k).cen;
                s =s+ Integer.toString(nabor.get(k).id) + " ";
                if (k+1<j) {
                    variant(k+1, j, s, sum_v, sum_c);
                }else {if (sum_c>max_st) {max_st=sum_c;st=s;}}
            }else {if (sum_c>max_st) {max_st=sum_c;st=s;}}
        }
        return;
    }
    public String max_vmest(){
        String st2="";
        Vesh t;
        for (int i=0; i<nabor.size();i++){
            t=nabor.get(i);
            int sum_ves=t.ves;
            int sum_cen=t.cen;
            st2=Integer.toString(t.id)+" ";
            if(sum_ves<max_gruz){
                if (i+1<nabor.size()){
                variant(i+1,nabor.size(),st2,sum_ves,sum_cen);}}
                else {if (sum_cen>max_st) {max_st=sum_cen;st=st2;}}
        }
        return st;
    }

}
