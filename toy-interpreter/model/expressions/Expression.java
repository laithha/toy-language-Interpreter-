package model.expressions;

import model.dataStructures.myDictionary1.*;
import MyException.InvalidOperation;
import MyException.MyException;
import model.values.*;

public interface Expression {
    Value eval(MyIDictionary<String, Value> table) throws MyException, InvalidOperation;

    String toString();

    Expression deepCopy();
}