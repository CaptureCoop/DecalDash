package org.capturecoop.decaldash;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class DecalRenderer extends JPanel {
    private BufferedImage image;

    public DecalRenderer() {

    }

    @Override
    public void paint(Graphics g) {
        if(image != null) {
            g.drawImage(image, 0, 0, this);
        }
    }
}
