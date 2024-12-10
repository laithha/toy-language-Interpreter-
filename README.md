ToyLanguage Interpreter - Java Implementation
This repository contains the implementation of a ToyLanguage Interpreter developed using Java. The ToyLanguage is a simple, custom-designed programming language aimed at providing a basic understanding of language parsing, interpretation, and execution.

Features:
Lexical Analysis: Tokenizes input source code into a series of language elements, such as keywords, operators, and identifiers.
Syntax Parsing: Interprets the grammar of ToyLanguage and generates an Abstract Syntax Tree (AST) to represent the program structure.
Semantic Analysis: Verifies the consistency of the program's operations according to the ToyLanguage rules.
Execution: Executes the parsed program and produces output based on defined operations.
Error Handling: Detects and reports syntax, lexical, and runtime errors in the program.


Key Components:
Lexer: A lexer that converts input code into tokens to be processed by the parser.
Parser: A parser that interprets tokens based on ToyLanguage grammar and produces an AST.
Interpreter: Executes the program based on the AST, managing memory, variables, and program control flow.
Execution Environment: Handles the execution of ToyLanguage programs, simulating the environment where the language is run.
