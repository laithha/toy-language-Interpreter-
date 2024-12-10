package model.dataStructures.myDictionary1;

import MyException.MyException;

// in this myidctionary we have the following methods:
// isDefined - checks if a key is defined in the dictionary
// lookup - returns the value associated with a key
// put - adds a key-value pair to the dictionary
// update - updates the value associated with a key
// K - key type
// V - value type


public interface MyIDictionary<K, V> {
    boolean isDefined(K key);

    V lookup(K key) throws MyException;

    void put(K key, V value);

    void update(K key, V val) throws MyException;
}