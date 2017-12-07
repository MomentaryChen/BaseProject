package Moty;

import  java.util.*;

public class Check {
    int code ;

    public Check(){
        this.code=0;
    }

    public Check(int code){
        this.code =code ;
    }

    public void setCode(int code) {
        if(code>0){
            this.code = code;
        }else{
            this.code = 0;
        }

    }

    public int getCode(){
        if(code>0){
            return code ;
        }
        else return 0;
    }

}

