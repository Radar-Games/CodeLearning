///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package gameenginev2;
//
//import java.awt.event.MouseListener;
//import java.awt.Component; 
//import java.awt.event.MouseEvent;
//
///**
// *
// * @author 154015
// */
//public class MouseHandler implements MouseListener 
//{
//        //where initialization occurs:
//        //Register for mouse events on blankArea and the panel.
//
//    public void mousePressed(MouseEvent e) {
//       saySomething("Mouse pressed; # of clicks: "
//                    + e.getClickCount(), e);
//    }
//
//    public void mouseReleased(MouseEvent e) {
//       saySomething("Mouse released; # of clicks: "
//                    + e.getClickCount(), e);
//    }
//
//    public void mouseEntered(MouseEvent e) {
//       saySomething("Mouse entered", e);
//    }
//
//    public void mouseExited(MouseEvent e) {
//       saySomething("Mouse exited", e);
//    }
//
//    public void mouseClicked(MouseEvent e) {
//       saySomething("Mouse clicked (# of clicks: "
//                    + e.getClickCount() + ")", e);
//    }
//
//    void saySomething(String eventDescription, MouseEvent e) {
//        textArea.append(eventDescription + " detected on "
//                        + e.getComponent().getClass().getName()
//                        + "." + newline);
//    }
//}
