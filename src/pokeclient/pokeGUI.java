/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokeclient;

import irPokemon.irPokemon;
import java.awt.Window;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Pipe_
 */
public class pokeGUI extends javax.swing.JFrame {

    private final String nombre = "Pokemon";

    public pokeGUI() {
        initComponents();
        initMyComponents();
        initLista();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogPokeHoroscopo = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxPokeHoroscopo = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaPokeHoroscopo = new javax.swing.JTextField();
        jButtonPokeHoroscopo_svc = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jDialogPokeConsulta = new javax.swing.JDialog();
        jLabelPokeConsulta = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaPokeConsulta = new javax.swing.JTextArea();
        jButtonPokeConsulta_svc = new javax.swing.JButton();
        jTextPokeConsulta = new javax.swing.JTextField();
        jDialogSafari = new javax.swing.JDialog();
        jBu = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaSafari = new javax.swing.JTextArea();
        jButtonSafari_Pokebola_svc = new javax.swing.JButton();
        jButtonSafari_Piedra_svc = new javax.swing.JButton();
        jButtonSafari_Cebo_svc = new javax.swing.JButton();
        jButtonSafari_Huir = new javax.swing.JButton();
        jDialogBatalla = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxBatalla = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaBatalla = new javax.swing.JTextArea();
        jButtonIniciarBatalla = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonPokeHoroscopo = new javax.swing.JButton();
        jButtonPokeConsulta = new javax.swing.JButton();
        jButtonSafari = new javax.swing.JButton();
        jButtonBatalla = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Poke Horóscopo");

        jComboBoxPokeHoroscopo.setModel(modelAnho);

        jScrollPane1.setViewportView(jTextAreaPokeHoroscopo);

        jButtonPokeHoroscopo_svc.setText("Consultar");
        jButtonPokeHoroscopo_svc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPokeHoroscopo_svcActionPerformed(evt);
            }
        });

        jLabel3.setText("Año de nacimiento");

        javax.swing.GroupLayout jDialogPokeHoroscopoLayout = new javax.swing.GroupLayout(jDialogPokeHoroscopo.getContentPane());
        jDialogPokeHoroscopo.getContentPane().setLayout(jDialogPokeHoroscopoLayout);
        jDialogPokeHoroscopoLayout.setHorizontalGroup(
            jDialogPokeHoroscopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jDialogPokeHoroscopoLayout.createSequentialGroup()
                .addGroup(jDialogPokeHoroscopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialogPokeHoroscopoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jDialogPokeHoroscopoLayout.createSequentialGroup()
                        .addGroup(jDialogPokeHoroscopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDialogPokeHoroscopoLayout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(jButtonPokeHoroscopo_svc))
                            .addGroup(jDialogPokeHoroscopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDialogPokeHoroscopoLayout.createSequentialGroup()
                                    .addGap(83, 83, 83)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxPokeHoroscopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDialogPokeHoroscopoLayout.createSequentialGroup()
                                    .addGap(142, 142, 142)
                                    .addComponent(jLabel1))))
                        .addGap(0, 132, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jDialogPokeHoroscopoLayout.setVerticalGroup(
            jDialogPokeHoroscopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogPokeHoroscopoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialogPokeHoroscopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxPokeHoroscopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(23, 23, 23)
                .addComponent(jButtonPokeHoroscopo_svc)
                .addGap(32, 32, 32)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jDialogPokeConsulta.setTitle("Poke Servicios - Consulta Pokemon");

        jLabelPokeConsulta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPokeConsulta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPokeConsulta.setText("Poke Consulta");

        jTextAreaPokeConsulta.setEditable(false);
        jTextAreaPokeConsulta.setColumns(20);
        jTextAreaPokeConsulta.setRows(5);
        jScrollPane2.setViewportView(jTextAreaPokeConsulta);

        jButtonPokeConsulta_svc.setText("Consultar");
        jButtonPokeConsulta_svc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPokeConsulta_svcActionPerformed(evt);
            }
        });

        jTextPokeConsulta.setToolTipText("Consulta Pokemon");
        jTextPokeConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextPokeConsultaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jDialogPokeConsultaLayout = new javax.swing.GroupLayout(jDialogPokeConsulta.getContentPane());
        jDialogPokeConsulta.getContentPane().setLayout(jDialogPokeConsultaLayout);
        jDialogPokeConsultaLayout.setHorizontalGroup(
            jDialogPokeConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogPokeConsultaLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(jDialogPokeConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelPokeConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextPokeConsulta)
                    .addComponent(jButtonPokeConsulta_svc))
                .addGap(135, 135, 135))
            .addGroup(jDialogPokeConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addComponent(jSeparator2)
        );
        jDialogPokeConsultaLayout.setVerticalGroup(
            jDialogPokeConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogPokeConsultaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelPokeConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextPokeConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPokeConsulta_svc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jTextPokeConsulta.getAccessibleContext().setAccessibleName("");

        jDialogSafari.setTitle("Poke Servicios - Safari Pokemon");

        jBu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jBu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jBu.setText("Safari Pokémon");

        jTextAreaSafari.setEditable(false);
        jTextAreaSafari.setColumns(20);
        jTextAreaSafari.setRows(5);
        jScrollPane3.setViewportView(jTextAreaSafari);

        jButtonSafari_Pokebola_svc.setText("Tirar Pokebola");
        jButtonSafari_Pokebola_svc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSafari_Pokebola_svcActionPerformed(evt);
            }
        });

        jButtonSafari_Piedra_svc.setText("Tirar Piedra");
        jButtonSafari_Piedra_svc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSafari_Piedra_svcActionPerformed(evt);
            }
        });

        jButtonSafari_Cebo_svc.setText("Tirar Cebo");
        jButtonSafari_Cebo_svc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSafari_Cebo_svcActionPerformed(evt);
            }
        });

        jButtonSafari_Huir.setText("Huir");
        jButtonSafari_Huir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSafari_HuirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialogSafariLayout = new javax.swing.GroupLayout(jDialogSafari.getContentPane());
        jDialogSafari.getContentPane().setLayout(jDialogSafariLayout);
        jDialogSafariLayout.setHorizontalGroup(
            jDialogSafariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogSafariLayout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addGroup(jDialogSafariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jBu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jDialogSafariLayout.createSequentialGroup()
                        .addGroup(jDialogSafariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonSafari_Pokebola_svc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSafari_Cebo_svc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6)
                        .addGroup(jDialogSafariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonSafari_Piedra_svc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSafari_Huir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(135, Short.MAX_VALUE))
            .addComponent(jSeparator3)
            .addGroup(jDialogSafariLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jDialogSafariLayout.setVerticalGroup(
            jDialogSafariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogSafariLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jBu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialogSafariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSafari_Pokebola_svc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSafari_Piedra_svc))
                .addGap(15, 15, 15)
                .addGroup(jDialogSafariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSafari_Cebo_svc)
                    .addComponent(jButtonSafari_Huir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        jDialogBatalla.setSize(new java.awt.Dimension(240, 1020));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Batalla Pokemon");

        jLabel4.setText("Seleccione su pokemon:");

        jComboBoxBatalla.setModel(modelListaPokemon);

        jTextAreaBatalla.setColumns(20);
        jTextAreaBatalla.setRows(5);
        jScrollPane4.setViewportView(jTextAreaBatalla);

        jButtonIniciarBatalla.setText("Comenzar");
        jButtonIniciarBatalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarBatallaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialogBatallaLayout = new javax.swing.GroupLayout(jDialogBatalla.getContentPane());
        jDialogBatalla.getContentPane().setLayout(jDialogBatallaLayout);
        jDialogBatallaLayout.setHorizontalGroup(
            jDialogBatallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4)
            .addGroup(jDialogBatallaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jDialogBatallaLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(jComboBoxBatalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogBatallaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonIniciarBatalla)
                .addGap(116, 116, 116))
        );
        jDialogBatallaLayout.setVerticalGroup(
            jDialogBatallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogBatallaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(jDialogBatallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxBatalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jButtonIniciarBatalla)
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("PokeServicios");
        jLabelTitulo.setToolTipText("");
        jLabelTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButtonPokeHoroscopo.setText("Poke Horóscopo");
        jButtonPokeHoroscopo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPokeHoroscopoActionPerformed(evt);
            }
        });

        jButtonPokeConsulta.setText("Poke Consulta");
        jButtonPokeConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPokeConsultaActionPerformed(evt);
            }
        });

        jButtonSafari.setText("Safari Pokemon");
        jButtonSafari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSafariActionPerformed(evt);
            }
        });

        jButtonBatalla.setText("Batalla Pokemon");
        jButtonBatalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBatallaActionPerformed(evt);
            }
        });

        jButton5.setText("jButton5");

        jButton6.setText("jButton6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton6)
                    .addComponent(jButton5)
                    .addComponent(jButtonBatalla)
                    .addComponent(jButtonSafari)
                    .addComponent(jButtonPokeConsulta)
                    .addComponent(jButtonPokeHoroscopo))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addGap(18, 18, 18)
                .addComponent(jButtonPokeHoroscopo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPokeConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSafari)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBatalla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void initMyComponents(){
        for (int i = 2021; i >= 1930; i--) {
            modelAnho.addElement(i);
        }
        
        
    }
    private void initLista(){
        modelListaPokemon.removeAllElements();
        try {
            Registry registry = LocateRegistry.getRegistry("localhost");
            irPokemon poke = (irPokemon) registry.lookup(nombre);
            //Luego rescatar lista del servidor
            ArrayList<String> listaPokemon = poke.getListaPokemon();
            for (int i = 0; i < listaPokemon.size(); i++) {
                modelListaPokemon.addElement(listaPokemon.get(i));
            }
            if(modelListaPokemon.getSize()==0) modelListaPokemon.addElement("CHARMANDER");
        } catch (Exception e) {
            errorMsg(e);
        }
    }
    private final DefaultComboBoxModel modelAnho = new DefaultComboBoxModel();
    private final DefaultComboBoxModel modelListaPokemon = new DefaultComboBoxModel();
    private void jButtonPokeHoroscopo_svcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPokeHoroscopo_svcActionPerformed
        try {
            Registry registry = LocateRegistry.getRegistry("localhost");
            irPokemon poke = (irPokemon) registry.lookup(nombre);
            int anhoIngresado = (int)this.jComboBoxPokeHoroscopo.getSelectedItem();

            this.jTextAreaPokeHoroscopo.setText(poke.pokeHoroscopo(anhoIngresado));
        } catch (Exception e) {
            errorMsg(e);
        }
    }//GEN-LAST:event_jButtonPokeHoroscopo_svcActionPerformed
    
    private void jButtonPokeHoroscopoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPokeHoroscopoActionPerformed
        JButton parent = (JButton) evt.getSource();
        Window window = SwingUtilities.windowForComponent(parent);
        this.jDialogPokeHoroscopo.setBounds(window.getBounds());
        this.jDialogPokeHoroscopo.setVisible(true);
        this.jDialogPokeHoroscopo.setLocationRelativeTo(null);
        this.jDialogPokeHoroscopo.setResizable(false);

        this.jTextAreaPokeHoroscopo.setText("");
    }//GEN-LAST:event_jButtonPokeHoroscopoActionPerformed

    private void jButtonPokeConsulta_svcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPokeConsulta_svcActionPerformed
        try {
            Registry registry = LocateRegistry.getRegistry("localhost");
            irPokemon poke = (irPokemon) registry.lookup(nombre);
            int numero = Integer.valueOf(this.jTextPokeConsulta.getText().toString());

            if (numero <= 0 || numero > 721) {
                System.out.println(numero);
                errorMsg(new Exception("Sólo se admiten números entre 0 y 721"));
            } else {
                this.jTextAreaPokeConsulta.setText(poke.consultaPokemon(this.jTextPokeConsulta.getText().toString()));
            }

        } catch (Exception e) {
            errorMsg(e);
        }
    }//GEN-LAST:event_jButtonPokeConsulta_svcActionPerformed

    private void jTextPokeConsultaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPokeConsultaKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextPokeConsultaKeyTyped

    private void jButtonPokeConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPokeConsultaActionPerformed

        JButton parent = (JButton) evt.getSource();
        Window window = SwingUtilities.windowForComponent(parent);
        this.jDialogPokeConsulta.setBounds(window.getBounds());
        this.jDialogPokeConsulta.setVisible(true);
        this.jDialogPokeConsulta.setLocationRelativeTo(null);
        this.jDialogPokeConsulta.setResizable(false);

        this.jTextPokeConsulta.setText("");
        this.jTextAreaPokeConsulta.setText("");


    }//GEN-LAST:event_jButtonPokeConsultaActionPerformed

    private void jButtonSafari_Pokebola_svcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSafari_Pokebola_svcActionPerformed

        try {
            Registry registry = LocateRegistry.getRegistry("localhost");
            irPokemon poke = (irPokemon) registry.lookup(nombre);
            String respuesta = poke.arrojarPokebola();
            boolean servidor = booleanServidor(respuesta);
            this.jTextAreaSafari.setText("Arrojaste Pokebola!\n" + stringServidor(respuesta));

            if (!servidor) {
                safariButtons(false);
                initLista();
            }
            
        } catch (Exception e) {
            errorMsg(e);
        }

    }//GEN-LAST:event_jButtonSafari_Pokebola_svcActionPerformed

    private void jButtonSafari_Piedra_svcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSafari_Piedra_svcActionPerformed
        try {
            Registry registry = LocateRegistry.getRegistry("localhost");
            irPokemon poke = (irPokemon) registry.lookup(nombre);

            String respuesta = poke.arrojarPiedra();
            boolean servidor = booleanServidor(respuesta);

            this.jTextAreaSafari.setText("Arrojaste una piedra!\n" + stringServidor(respuesta));

            if (!servidor) {
                safariButtons(false);
            }

        } catch (Exception e) {
            errorMsg(e);
        }
    }//GEN-LAST:event_jButtonSafari_Piedra_svcActionPerformed

    private void jButtonSafariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSafariActionPerformed

        try {
            Registry registry = LocateRegistry.getRegistry("localhost");
            irPokemon poke = (irPokemon) registry.lookup(nombre);

            this.jTextAreaSafari.setText(poke.safariPokemon());
            JButton parent = (JButton) evt.getSource();
            Window window = SwingUtilities.windowForComponent(parent);
            this.jDialogSafari.setBounds(window.getBounds());
            this.jDialogSafari.setVisible(true);
            this.jDialogSafari.setLocationRelativeTo(null);
            this.jDialogSafari.setResizable(false);

            safariButtons(true);

        } catch (Exception e) {
            errorMsg(e);
        }

    }//GEN-LAST:event_jButtonSafariActionPerformed

    private void jButtonSafari_Cebo_svcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSafari_Cebo_svcActionPerformed
        try {
            Registry registry = LocateRegistry.getRegistry("localhost");
            irPokemon poke = (irPokemon) registry.lookup(nombre);

            String respuesta = poke.arrojarCebo();
            boolean servidor = booleanServidor(respuesta);

            this.jTextAreaSafari.setText("Arrojaste un Cebo!\n" + stringServidor(respuesta));

            if (!servidor) {
                safariButtons(false);
            }

        } catch (Exception e) {
            errorMsg(e);
        }
    }//GEN-LAST:event_jButtonSafari_Cebo_svcActionPerformed

    private void jButtonSafari_HuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSafari_HuirActionPerformed
        this.jTextAreaSafari.setText("Has huído!\n");
        safariButtons(false);
    }//GEN-LAST:event_jButtonSafari_HuirActionPerformed

    private void jButtonBatallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBatallaActionPerformed
        JButton parent = (JButton) evt.getSource();
        Window window = SwingUtilities.windowForComponent(parent);
        this.jDialogBatalla.setBounds(window.getBounds());
        this.jDialogBatalla.setVisible(true);
        this.jDialogBatalla.setLocationRelativeTo(null);
        this.jDialogBatalla.setResizable(false);
        this.jButtonIniciarBatalla.setEnabled(true);
        this.jTextAreaBatalla.setText("");
    }//GEN-LAST:event_jButtonBatallaActionPerformed

    private void jButtonIniciarBatallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarBatallaActionPerformed
        try {
            Registry registry = LocateRegistry.getRegistry("localhost");
            irPokemon poke = (irPokemon) registry.lookup(nombre);
            String pokemonSeleccionado = this.jComboBoxBatalla.getSelectedItem().toString();
            ArrayList<String> batalla = poke.batalla(pokemonSeleccionado);
            
            for (int i = 0; i < batalla.size(); i++) {
                this.jTextAreaBatalla.setText(jTextAreaBatalla.getText()+""+batalla.get(i));
            }
            this.jButtonIniciarBatalla.setEnabled(false);
            
        } catch (Exception e) {
            errorMsg(e);
        }
    }//GEN-LAST:event_jButtonIniciarBatallaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pokeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pokeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pokeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pokeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pokeGUI().setVisible(true);
            }
        });
    }

    private void errorMsg(Exception e) {
        JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private static Boolean booleanServidor(String respuesta) {
        return Boolean.valueOf(respuesta.split("-")[0]);
    }

    private static String stringServidor(String respuesta) {
        return respuesta.split("-")[1];
    }

    private void safariButtons(boolean valor) {
        this.jButtonSafari_Pokebola_svc.setEnabled(valor);
        this.jButtonSafari_Piedra_svc.setEnabled(valor);
        this.jButtonSafari_Cebo_svc.setEnabled(valor);
        this.jButtonSafari_Huir.setEnabled(valor);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jBu;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonBatalla;
    private javax.swing.JButton jButtonIniciarBatalla;
    private javax.swing.JButton jButtonPokeConsulta;
    private javax.swing.JButton jButtonPokeConsulta_svc;
    private javax.swing.JButton jButtonPokeHoroscopo;
    private javax.swing.JButton jButtonPokeHoroscopo_svc;
    private javax.swing.JButton jButtonSafari;
    private javax.swing.JButton jButtonSafari_Cebo_svc;
    private javax.swing.JButton jButtonSafari_Huir;
    private javax.swing.JButton jButtonSafari_Piedra_svc;
    private javax.swing.JButton jButtonSafari_Pokebola_svc;
    private javax.swing.JComboBox<String> jComboBoxBatalla;
    private javax.swing.JComboBox<String> jComboBoxPokeHoroscopo;
    private javax.swing.JDialog jDialogBatalla;
    private javax.swing.JDialog jDialogPokeConsulta;
    private javax.swing.JDialog jDialogPokeHoroscopo;
    private javax.swing.JDialog jDialogSafari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelPokeConsulta;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextArea jTextAreaBatalla;
    private javax.swing.JTextArea jTextAreaPokeConsulta;
    private javax.swing.JTextField jTextAreaPokeHoroscopo;
    private javax.swing.JTextArea jTextAreaSafari;
    private javax.swing.JTextField jTextPokeConsulta;
    // End of variables declaration//GEN-END:variables
}
