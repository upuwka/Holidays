import holidays.Holidays;
import javax.swing.*;
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.showMenu();
    }
    public static void january() {
        Holidays holidays = new Holidays();
        ImageIcon icon = new ImageIcon("january.jpg");
        JOptionPane.showMessageDialog(null, holidays.januaryList, "Holidays in January", JOptionPane.INFORMATION_MESSAGE,icon);
    }
    public static void february() {
        Holidays holidays = new Holidays();
        ImageIcon icon = new ImageIcon("february.jpg");
        JOptionPane.showMessageDialog(null, holidays.februaryList, "Holidays in February", JOptionPane.INFORMATION_MESSAGE,icon);
    }
    public static void march() {
        Holidays holidays = new Holidays();
        ImageIcon icon = new ImageIcon("march.jpg");
        JOptionPane.showMessageDialog(null, holidays.marchList, "Holidays in March", JOptionPane.INFORMATION_MESSAGE,icon);
    }
    public static void april() {
        Holidays holidays = new Holidays();
        ImageIcon icon = new ImageIcon("april.jpg");
        JOptionPane.showMessageDialog(null, holidays.aprilList, "Holidays in April", JOptionPane.INFORMATION_MESSAGE,icon);
    }
    public static void may() {
        Holidays holidays = new Holidays();
        ImageIcon icon = new ImageIcon("may.jpg");
        JOptionPane.showMessageDialog(null, holidays.mayList, "Holidays in May", JOptionPane.INFORMATION_MESSAGE,icon);
    }
    public static void june() {
        Holidays holidays = new Holidays();
        ImageIcon icon = new ImageIcon("june.jpg");
        JOptionPane.showMessageDialog(null, holidays.juneList, "Holidays in June", JOptionPane.INFORMATION_MESSAGE,icon);
    }
    public static void july() {
        Holidays holidays = new Holidays();
        ImageIcon icon = new ImageIcon("july.jpg");
        JOptionPane.showMessageDialog(null, holidays.julyList, "Holidays in July", JOptionPane.INFORMATION_MESSAGE,icon);
    }
    public static void august() {
        Holidays holidays = new Holidays();
        ImageIcon icon = new ImageIcon("august.jpg");
        JOptionPane.showMessageDialog(null, holidays.augustList, "Holidays in August", JOptionPane.INFORMATION_MESSAGE,icon);
    }
    public static void september() {
        Holidays holidays = new Holidays();
        ImageIcon icon = new ImageIcon("september.jpg");
        JOptionPane.showMessageDialog(null, holidays.septemberList, "Holidays in September", JOptionPane.INFORMATION_MESSAGE,icon);
    }
    public static void october() {
        Holidays holidays = new Holidays();
        ImageIcon icon = new ImageIcon("october.jpg");
        JOptionPane.showMessageDialog(null, holidays.octoberList, "Holidays in October", JOptionPane.INFORMATION_MESSAGE,icon);
    }
    public static void november() {
        Holidays holidays = new Holidays();
        ImageIcon icon = new ImageIcon("november.jpg");
        JOptionPane.showMessageDialog(null, holidays.novemberList, "Holidays in November", JOptionPane.INFORMATION_MESSAGE,icon);
    }
    public static void december() {
        Holidays holidays = new Holidays();
        ImageIcon icon = new ImageIcon("december.jpg");
        JOptionPane.showMessageDialog(null, holidays.decemberList, "Holidays in December", JOptionPane.INFORMATION_MESSAGE,icon);
    }

    void showMenu() {

           try{
               int ch=Integer.parseInt(JOptionPane.showInputDialog(
                        null,
                        "\n1.January\n2.February\n3.March\n4.April\n5.May\n6.June\n7.July\n8.August\n9.September\n10.October\n11.November\n12.December\n13.End the Programm\n\nEnter your choice:",
                        "Welcome to Calendar of latvian Holidays in 2021",
                        JOptionPane.INFORMATION_MESSAGE));
             if (ch==1){
                 january();}
             else if (ch==2){
                 february();}
             else if (ch==3){
                 march();}
             else if (ch==4){
                 april();}
             else if (ch==5){
                 may();}
             else if (ch==6){
                 june();}
             else if (ch==7){
                 july();}
             else if (ch==8){
                 august();}
             else if (ch==9){
                 september();}
             else if (ch==10){
                 october();}
             else if (ch==11){
                 november();}
             else if (ch==12){
                 december();}
             else if (ch==13){
                 System.exit(0);
             }
             else {JOptionPane.showMessageDialog(null, "Invalid Choice Entered! Re-Input", "Error: Choice not found",JOptionPane.ERROR_MESSAGE); }

           }catch(Exception mn){JOptionPane.showMessageDialog(null,"Error Invalid choice. Enter Correct option.", "Error: Unlisted Option Selected", JOptionPane.INFORMATION_MESSAGE);}
            showMenu();
    }
}