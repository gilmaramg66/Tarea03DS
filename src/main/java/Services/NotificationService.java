/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

/**
 *
 * @author elmay
 */

@FunctionalInterface
public interface NotificationService {
    
    <T> void sendNotification(T emiter, T destinatary, String msg);
    
}
