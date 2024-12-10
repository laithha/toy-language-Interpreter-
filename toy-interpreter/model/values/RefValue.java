package model.values;

import model.types.RefType;
import model.types.Type;

public class RefValue implements Value {
    int address;
    Type locationType;
    public RefValue(int address, Type _locationType){
        this.address = address;
        this.locationType = _locationType;
    }
    public int getAddr(){
        return this.address;
    }

    public Type GetType(){
        return new RefType(this.locationType);
    }

    public Type getLocationType(){
        return this.locationType;
    }

    public Boolean equals(Value another) {
        if (another instanceof RefValue refValue) {
            return this.address == refValue.getAddr()
                    && this.locationType.equals(refValue.getType());
        }
        return false;
    }

    public String toString(){
        return "(" + this.address + ", " + this.locationType.toString() + ")";
    }

    public RefValue deepCopy(){
        return new RefValue(this.address, this.locationType);
    }
}
