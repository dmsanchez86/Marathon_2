package models;

import Views.Home;
import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 * @author Mao
 */
public class Timer implements Runnable{
    Thread hilo;
    JLabel lbl_time;
    
    public Timer(JLabel lbl){
        this.lbl_time = lbl;
        hilo = new Thread(this);
        hilo.start();
    }

    @Override
    public void run() {
        Calendar future_time = Calendar.getInstance();
        future_time.set(2016, Calendar.JUNE, 15, 12, 0, 0);
        long future_time_in_miliseconds = future_time.getTimeInMillis();
        
        String txt_time = lbl_time.getText();
        
        while(true){
            Calendar current_time = Calendar.getInstance();
            
            long current_time_in_miliseconds = current_time.getTimeInMillis();
            long diff_miliseconds = future_time_in_miliseconds - current_time_in_miliseconds;
            
            int days = (int) (diff_miliseconds)  / ( 1000 * 60 * 60 * 24);
            diff_miliseconds = diff_miliseconds - (days * (1000 * 60 * 60 * 24));
            int hours = (int) (diff_miliseconds) / (1000 * 60 * 60);
            diff_miliseconds = diff_miliseconds - (hours * (1000 * 60 * 60));
            int minutes = (int) diff_miliseconds / (1000 * 60);
            diff_miliseconds = diff_miliseconds - (minutes * (1000 * 60));
            int seconds = (int) diff_miliseconds / (1000);
            
            String text;
            
            if(days <= 0 && hours <= 0 && minutes <= 0){
                lbl_time.setText("The race start now!");
                lbl_time.setForeground(Color.green);
                lbl_time.setFont(new Font("Helvetica", Font.BOLD, 12));
                this.hilo.stop();
            }else{
                if(seconds < 10)
                    text = txt_time.replace("0d", ""+days).replace("0h", ""+hours).replace("0m", ""+minutes).replace("0s", "0"+seconds);
                else
                    text = txt_time.replace("0d", ""+days).replace("0h", ""+hours).replace("0m", ""+minutes).replace("0s", ""+seconds);  

                lbl_time.setText(text);
            }
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
