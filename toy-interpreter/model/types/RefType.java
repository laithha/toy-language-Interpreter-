package model.types;


import model.values.RefValue;
import model.values.Value;


public class RefType implements Type{

    Type inner;
    RefType(Type inner){
        this.inner = inner;
    }
    Type getInner(){
        return inner;
    }
    public boolean equals(Object another){
        if(another instanceof RefType){
            return inner.equals((another).getInner());
        }
        return false;
    }
    String toString(){
        return "Ref(" + inner.toString() + ")";
    }
    Value defaultValue(){
        return new RefValue(0, inner);
    }
}



