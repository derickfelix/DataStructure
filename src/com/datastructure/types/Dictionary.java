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

    private Node[] items;
    private int size;

    public Dictionary(int initialLength) {
        this.items = new Node[initialLength];
        this.size = 0;
    }

    /**
     * This adds a new item to the dictionary.
     *
     * @param key the key
     * @param value the value
     */
    public void set(Object key, Object value) {
        this.items[size].key = key;
        this.items[size].value = value;
        this.size++;
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
        for (int i = 0; i < this.items.length; i++) {
            if(this.items[i].key.equals(key)) {
                return true;
            }
        }
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
        Object[] keys = new Object[this.items.length];
        for (int i = 0; i < this.items.length; i++) {
            keys[i] = this.items[i].key;
        }
        return keys;
    }

    /**
     * This gets all the values of the dictionary
     *
     * @return - An array of all the values the dictionary contains
     */
    public Object[] values() {
        Object[] values = new Object[this.items.length];
        for (int i = 0; i < this.items.length; i++) {
            values[i] = this.items[i].value;
        }
        return values;
    }

    public void growArray() {
        if (this.size >= this.items.length) {
            Node[] newArray = new Node[(this.size * 3) / 2];
            // Copy the this.array to the newArray
            System.arraycopy(this.items, 0, newArray, 0, this.items.length);
            this.items = newArray;
        }
    }

    @Override
    public String toString() {
        String output = "{";
        for (int i = 0; i < this.items.length; i++) {
            output += this.items[i].key + "=> " + this.items[i].value;
            if(i < this.items.length) {
                output += ", \n";
            }
        }
        
        output += "}";
        return output;
    }
    
    

    private class Node {

        protected Object key;
        protected Object value;

        public Node(Object key, Object value) {
            this.key = key;
            this.value = value;
        }
    }
}
