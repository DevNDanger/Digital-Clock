package DigiClock;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {

    Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    JLabel timeLabel;
    String time;
    JLabel dayLabel;
    String day;
    JLabel dateLabel;
    String date;
    SimpleDateFormat dateFormat;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Digi Clock");
        this.setLayout(new FlowLayout());
        this.setSize(450,250);

        timeFormat = new SimpleDateFormat("hh.mm.ss a");
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat("MMMMM dd, yyyy ");



        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Helvetica", Font.PLAIN, 75));
        timeLabel.setForeground(Color.red);
        timeLabel.setBackground(Color.BLACK);
        timeLabel.setOpaque(true);

        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Helvetica", Font.BOLD, 60));
        dayLabel.setForeground(Color.red);

        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Helvetica", Font.BOLD, 40));
        dateLabel.setForeground(Color.red);

        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);

        setTime();
    }

    public void setTime(){

        while(true){
        time = timeFormat.format(Calendar.getInstance().getTime());
        timeLabel.setText(time);

        day = dayFormat.format(Calendar.getInstance().getTime());
        dayLabel.setText(day);

        date = dateFormat.format(Calendar.getInstance().getTime());
        dateLabel.setText(date);

            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }




}
