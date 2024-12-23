package model.statements;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import MyException.InvalidOperation;
import MyException.MyException;
import model.dataStructures.myDictionary1.MyIDictionary;
import model.expressions.*;
import model.programState.ProgramState;
import model.types.StringType;
import model.values.StringValue;
import model.values.Value;

public class OpenRFile implements IStatement {
    Expression exp;

    public OpenRFile(Expression _exp) {
        this.exp = _exp;
    }

    @Override
    public ProgramState execute(ProgramState state) throws MyException, InvalidOperation {
        MyIDictionary<String, Value> symTable = state.getSymbolTable();
        Value val = exp.eval(symTable);

        if (!val.getType().equals(new StringType())) {
            throw new MyException("OpenRFile must be given a string!");
        }
        StringValue stringValue = (StringValue) val;
        if (state.getFileTable().isDefined(stringValue)) {
            throw new MyException("File already opened");
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader(stringValue.getVal()));//opening the file
            state.getFileTable().put(stringValue, br);// add to file
        } catch (IOException e) {
            throw new MyException(e.getMessage());
        }
        return state;
    }

    @Override
    public OpenRFile deepCopy() {
        return new OpenRFile(exp.deepCopy());
    }

    @Override
    public String toString() {
        return "openRFile{" + exp.toString() + "}";
    }
}