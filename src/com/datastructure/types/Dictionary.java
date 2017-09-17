/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datastructure.types;

/**
 *
 * @author derickfelix
 */
public class Dictionary {

    private Object[] items;

    /**
     * This adds a new item to the dictionary.
     *
     * @param key the key
     * @param Value the value
     */
    public void set(Object key, Object Value) {
    }

    /**
     * This removes the value from the dictionary using the key.
     *
     * @param key the key
     */
    public void remove(Object key) {
    }

    /**
     * This checks if there is a key in the dictionary.
     *
     * @param key the key
     * @return - true if the key exists in the dictionary and false otherwise
     */
    public boolean has(Object key) {
        return false;
    }

    /**
     * This returns a specific value searched by the key.
     *
     * @param key the key
     * @return - the value of a specific key
     */
    public Object get(Object key) {
        return null;
    }

    /**
     * This removes all the items from the dictionary
     */
    public void clear() {
    }

    /**
     * It is similar to the length property of the array.
     *
     * @return - How many elements the dictionary contains
     */
    public int size() {
        return -1;
    }

    /**
     * This gets all the keys of the dictionary.
     *
     * @return - An array of all the keys the dictionary contains
     */
    public Object[] keys() {
        return null;
    }
    
    /**
     * This gets all the values of the dictionary
     * 
     * @return - An array of all the values the dictionary contains
     */
    public Object[] values() {
        return null;
    }
}