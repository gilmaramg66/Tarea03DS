/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.List;

/**
 *
 * @author maycmont
 */

public abstract class Notifier<T> {
    private List<Listener<T>> listeners;
    
    public void subscribe(Listener<T> listener) {
        listeners.add(listener);
    }
    
    public void unsubscribe(Listener<T> listener) {
        listeners.remove(listener);
    }
    
    abstract protected void notifyListeners();
}
