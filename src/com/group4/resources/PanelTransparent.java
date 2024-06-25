package com.group4.resources;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

// to make the Jpanel transparent, designed for use as placeholders in forms.
public class PanelTransparent extends JPanel {

    public void setAlpha(float alpha) {
        this.alpha = alpha; // fully opaque
        repaint();
    }

    private float alpha = 1f;

    public PanelTransparent() {
        setOpaque(false); // set to be transparent
    }

    @Override
    public void paint(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
        super.paint(grphcs);
    }
}