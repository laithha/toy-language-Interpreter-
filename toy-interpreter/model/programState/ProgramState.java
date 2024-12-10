package model.programState;

import model.dataStructures.myStack.*;

import java.io.BufferedReader;

import model.dataStructures.myDictionary1.*;
import model.dataStructures.myList.*;
import model.values.*;
import model.statements.*;

public class ProgramState {
    MyIStack<IStatement> exeStack;
    MyIDictionary<String, Value> symbolTable;
    MyIList<Value> out;
    MyIDictionary<StringValue, BufferedReader> fileTable;

    IStatement originalProgram; // optional but good

    public ProgramState(MyIStack<IStatement> _exeStack, MyIDictionary<String, Value> _symbolTable, MyIList<Value> _out,
                        IStatement _originalProgram, MyIDictionary<StringValue, BufferedReader> _fileTable) {
        this.exeStack = _exeStack;
        this.symbolTable = _symbolTable;
        this.out = _out;
        this.originalProgram = deepCopy(_originalProgram); // recreate the entire original prg
        this.fileTable = _fileTable;
        this.exeStack.push(_originalProgram);
    }

    @Override
    public String toString() {
        return "+ - - - - - - - - PROGRAM STATE - - - - - - - - +\n\n" +
                " exeStack = " + this.exeStack +
                "\n\n symTable = " + this.symbolTable +
                "\n out = " + out +
                "\n filetable: "+ this.fileTable +"\n\n"+
                "\n\n+ - - - - - - - - - - - - - - - - - - - - - - - +";


    }


    public MyIStack<IStatement> getExeStack() {
        return this.exeStack;
    }

    public MyIDictionary<String, Value> getSymbolTable() {
        return this.symbolTable;
    }

    public MyIList<Value> getOut() {
        return this.out;
    }

    public MyIDictionary<StringValue, BufferedReader> getFileTable() {
        return this.fileTable;
    }

    public void setExeStack(MyIStack<IStatement> _exeStack) {
        this.exeStack = _exeStack;
    }

    public void setSymbolTable(MyIDictionary<String, Value> _symbolTable) {
        this.symbolTable = _symbolTable;
    }

    public void setOut(MyIList<Value> _out) {
        this.out = _out;
    }

    public IStatement deepCopy(IStatement stmt) {
        return stmt; // todo
    }

    public void init() {
    }
}