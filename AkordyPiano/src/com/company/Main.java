package com.company;

import javax.sound.sampled.AudioSystem;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    Main() {
        this.setSize(600, 340);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.setTitle("Akordy");
        this.setResizable(false);
        initComponents();
        ImageIcon img = new ImageIcon("icon.jpg");
        this.setIconImage(img.getImage());
    }

    public void initComponents() {

        dodajPrzelacznikDurowy("C");
        dodajPrzelacznikDurowy("D");
        dodajPrzelacznikDurowy("E");
        dodajPrzelacznikDurowy("F");
        dodajPrzelacznikDurowy("G");
        dodajPrzelacznikDurowy("A");
        dodajPrzelacznikDurowy("H");
        dodajPrzelacznikDurowy("B");
        dodajPrzelacznikDurowy("Es");
        dodajPrzelacznikDurowy("As");
        dodajPrzelacznikDurowy("Des");
        dodajPrzelacznikDurowy("Ges");

        dodajPrzelacznikMolowy("Cm");
        dodajPrzelacznikMolowy("Dm");
        dodajPrzelacznikMolowy("Em");
        dodajPrzelacznikMolowy("Fm");
        dodajPrzelacznikMolowy("Gm");
        dodajPrzelacznikMolowy("Am");
        dodajPrzelacznikMolowy("Hm");
        dodajPrzelacznikMolowy("Bm");
        dodajPrzelacznikMolowy("Esm");
        dodajPrzelacznikMolowy("Asm");
        dodajPrzelacznikMolowy("Desm");
        dodajPrzelacznikMolowy("Gesm");

        dodajPrzelacznikSeptymowy("C7");
        dodajPrzelacznikSeptymowy("D7");
        dodajPrzelacznikSeptymowy("E7");
        dodajPrzelacznikSeptymowy("F7");
        dodajPrzelacznikSeptymowy("G7");
        dodajPrzelacznikSeptymowy("A7");
        dodajPrzelacznikSeptymowy("H7");
        dodajPrzelacznikSeptymowy("B7");
        dodajPrzelacznikSeptymowy("Es7");
        dodajPrzelacznikSeptymowy("As7");
        dodajPrzelacznikSeptymowy("Des7");
        dodajPrzelacznikSeptymowy("Ges7");

        durowe.setPreferredSize(new Dimension(80, 290));
        molowe.setPreferredSize(new Dimension(80, 290));
        septymowe.setPreferredSize(new Dimension(80, 290));
        durowe.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Durowe"));
        molowe.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Molowe"));
        septymowe.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Molowe"));

obrazki.setIcon(new ImageIcon("pustka.png"));
        wszystko.add(durowe);
        wszystko.add(molowe);
        wszystko.add(septymowe);
        fortepian.setIcon(new ImageIcon("fortepian.png"));

        wizualizacja.add(fortepian, BorderLayout.EAST);
        wizualizacja.add(obrazki, BorderLayout.SOUTH);



        this.getContentPane().add(wszystko, BorderLayout.WEST);
        this.getContentPane().add(wizualizacja, BorderLayout.CENTER);

    }

    private JPanel wszystko = new JPanel();
    private JPanel molowe = new JPanel(new GridLayout(12, 1));
    private JPanel durowe = new JPanel(new GridLayout(12, 1));
    private JPanel septymowe = new JPanel(new GridLayout(12, 1));
    private JPanel wizualizacja = new JPanel();
    private JLabel obrazki = new JLabel();
    private JLabel fortepian = new JLabel();
    private ButtonGroup akordy = new ButtonGroup();

    /**
     *  Funkcja tworzy przycisk durowy i wyswietla obraz jak go zagrac na fortepianie
     * @param nazwa - ustawia nazwe przycisku odpowiadajacego za akord durowy
     */
    public void dodajPrzelacznikDurowy(String nazwa) {

        JRadioButton przelacznik = new JRadioButton(nazwa);
        durowe.add(przelacznik);
        akordy.add(przelacznik);
        przelacznik.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                obrazki.setIcon(new ImageIcon(nazwa + ".png"));
            }
        });

    }

    /**
     *  Funkcja tworzy przycisk molowy i wyswietla obraz jak go zagrac na fortepianie
     * @param nazwa - ustawia nazwe przycisku odpowiadajacego za akord molowy
     */
    public void dodajPrzelacznikMolowy(String nazwa) {
        JRadioButton przelacznik = new JRadioButton(nazwa);
        molowe.add(przelacznik);
        akordy.add(przelacznik);
        przelacznik.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                obrazki.setIcon(new ImageIcon(nazwa + ".png"));
            }
        });
    }
    /**
     *  Funkcja tworzy przycisk septymowy i wyswietla obraz jak go zagrac na fortepianie
     * @param nazwa - ustawia nazwe przycisku odpowiadajacego za akord septymowy
     */
    public void dodajPrzelacznikSeptymowy(String nazwa) {
        JRadioButton przelacznik = new JRadioButton(nazwa);
        septymowe.add(przelacznik);
        akordy.add(przelacznik);
        przelacznik.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                obrazki.setIcon(new ImageIcon(nazwa + ".png"));
            }
        });
    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}
