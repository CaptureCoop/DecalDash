package org.capturecoop.decaldash;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;

public class DecalDash extends JFrame {

    public DecalDash() {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        setTitle("DecalDash");
        setSize(512, 512);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
