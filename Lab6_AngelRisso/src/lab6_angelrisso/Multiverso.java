/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_angelrisso;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author HP_AMD_64
 */
public class Multiverso extends javax.swing.JFrame {

    /**
     * Creates new form Multiverso
     */
    public Multiverso() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_cUni = new javax.swing.JDialog();
        bt_seres = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tf_raza = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        sp_edad = new javax.swing.JSpinner();
        sp_ki = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        tf_planeta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jd_eliiminar = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_seres = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        pp_menu = new javax.swing.JPopupMenu();
        jmi_modificar = new javax.swing.JMenuItem();
        jmi_eliminar = new javax.swing.JMenuItem();
        jd_modificar = new javax.swing.JDialog();
        tf_raza1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        sp_edad1 = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        sp_ki1 = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        cb_seres = new javax.swing.JComboBox<>();
        tf_planeta1 = new javax.swing.JTextField();
        bt_modificar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jd_cargar = new javax.swing.JDialog();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_1 = new javax.swing.JTextArea();
        bt_universo = new javax.swing.JButton();
        bt_LoE = new javax.swing.JButton();
        bt_crear = new javax.swing.JButton();
        bt_crearArch = new javax.swing.JButton();
        bt_cargar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jd_cUni.setTitle("Crear seres");
        jd_cUni.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jd_cUni.setMinimumSize(new java.awt.Dimension(618, 492));
        jd_cUni.setModal(true);

        bt_seres.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_seres.setText("Crear Seres");
        bt_seres.setOpaque(false);
        bt_seres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_seresActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Raza del ser");

        tf_raza.setText(" ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Edad");

        sp_edad.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ki");

        tf_planeta.setText(" ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("planeta ");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab6_angelrisso/epic space face.jpg"))); // NOI18N

        javax.swing.GroupLayout jd_cUniLayout = new javax.swing.GroupLayout(jd_cUni.getContentPane());
        jd_cUni.getContentPane().setLayout(jd_cUniLayout);
        jd_cUniLayout.setHorizontalGroup(
            jd_cUniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_cUniLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(tf_raza, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jd_cUniLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jd_cUniLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(sp_ki, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jd_cUniLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tf_planeta, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jd_cUniLayout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(bt_seres, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jd_cUniLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(sp_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1)
        );
        jd_cUniLayout.setVerticalGroup(
            jd_cUniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_cUniLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jd_cUniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_cUniLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3))
                    .addComponent(tf_raza, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jLabel4)
                .addGap(28, 28, 28)
                .addGroup(jd_cUniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(sp_ki, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jd_cUniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(tf_planeta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jd_cUniLayout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(bt_seres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jd_cUniLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(sp_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jd_eliiminar.setTitle("Listar o Eliminar");

        jl_seres.setModel(new DefaultListModel());
        jl_seres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_seresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jl_seres);

        jLabel7.setText("Seres existentes");

        javax.swing.GroupLayout jd_eliiminarLayout = new javax.swing.GroupLayout(jd_eliiminar.getContentPane());
        jd_eliiminar.getContentPane().setLayout(jd_eliiminarLayout);
        jd_eliiminarLayout.setHorizontalGroup(
            jd_eliiminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_eliiminarLayout.createSequentialGroup()
                .addGroup(jd_eliiminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_eliiminarLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_eliiminarLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jd_eliiminarLayout.setVerticalGroup(
            jd_eliiminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_eliiminarLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        jmi_modificar.setText("modificar");
        jmi_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_modificarActionPerformed(evt);
            }
        });
        pp_menu.add(jmi_modificar);

        jmi_eliminar.setText("eliminar");
        pp_menu.add(jmi_eliminar);

        jd_modificar.getContentPane().setLayout(null);

        tf_raza1.setText(" ");
        jd_modificar.getContentPane().add(tf_raza1);
        tf_raza1.setBounds(140, 110, 190, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Raza del ser");
        jd_modificar.getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 120, 110, 22);

        sp_edad1.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jd_modificar.getContentPane().add(sp_edad1);
        sp_edad1.setBounds(140, 150, 60, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Edad");
        jd_modificar.getContentPane().add(jLabel9);
        jLabel9.setBounds(80, 150, 50, 22);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ki");
        jd_modificar.getContentPane().add(jLabel10);
        jLabel10.setBounds(110, 200, 20, 22);
        jd_modificar.getContentPane().add(sp_ki1);
        sp_ki1.setBounds(140, 200, 120, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("planeta ");
        jd_modificar.getContentPane().add(jLabel11);
        jLabel11.setBounds(60, 260, 80, 22);

        jd_modificar.getContentPane().add(cb_seres);
        cb_seres.setBounds(350, 50, 150, 20);

        tf_planeta1.setText(" ");
        jd_modificar.getContentPane().add(tf_planeta1);
        tf_planeta1.setBounds(140, 260, 190, 30);

        bt_modificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_modificar.setText("modificar");
        bt_modificar.setOpaque(false);
        bt_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_modificarActionPerformed(evt);
            }
        });
        jd_modificar.getContentPane().add(bt_modificar);
        bt_modificar.setBounds(160, 350, 120, 50);
        jd_modificar.getContentPane().add(jLabel12);
        jLabel12.setBounds(250, 101, 0, 0);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("MODIFICAR");
        jd_modificar.getContentPane().add(jLabel14);
        jLabel14.setBounds(140, 40, 109, 22);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab6_angelrisso/epic space face.jpg"))); // NOI18N
        jd_modificar.getContentPane().add(jLabel13);
        jLabel13.setBounds(0, 0, 580, 470);

        jButton1.setText("cargar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ta_1.setColumns(20);
        ta_1.setRows(5);
        jScrollPane2.setViewportView(ta_1);

        javax.swing.GroupLayout jd_cargarLayout = new javax.swing.GroupLayout(jd_cargar.getContentPane());
        jd_cargar.getContentPane().setLayout(jd_cargarLayout);
        jd_cargarLayout.setHorizontalGroup(
            jd_cargarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_cargarLayout.createSequentialGroup()
                .addGroup(jd_cargarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_cargarLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_cargarLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jd_cargarLayout.setVerticalGroup(
            jd_cargarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_cargarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        bt_universo.setText("CREAR UNIVERSO ");
        bt_universo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_universoMouseClicked(evt);
            }
        });
        getContentPane().add(bt_universo);
        bt_universo.setBounds(330, 260, 160, 80);

        bt_LoE.setText("listar y/o eliminar seres");
        bt_LoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_LoEActionPerformed(evt);
            }
        });
        getContentPane().add(bt_LoE);
        bt_LoE.setBounds(530, 350, 170, 70);

        bt_crear.setText("crear seres");
        bt_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_crearActionPerformed(evt);
            }
        });
        getContentPane().add(bt_crear);
        bt_crear.setBounds(140, 370, 180, 70);

        bt_crearArch.setText("crear archivo");
        bt_crearArch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_crearArchActionPerformed(evt);
            }
        });
        getContentPane().add(bt_crearArch);
        bt_crearArch.setBounds(640, 50, 100, 50);

        bt_cargar.setText("cargar archivo");
        bt_cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cargarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_cargar);
        bt_cargar.setBounds(640, 110, 110, 50);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("SISTEMA DE ZENO SAMA");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(280, 20, 230, 50);

        jButton2.setText("salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(50, 30, 51, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lab6_angelrisso/fourstar.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 10, 760, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_universoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_universoMouseClicked
        String nombre = " ";

        nombre = JOptionPane.showInputDialog("Ingrese el nombre de este universo");

        u.setNombre(nombre);
        ban = true;

    }//GEN-LAST:event_bt_universoMouseClicked

    private void bt_seresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_seresActionPerformed

        if (tf_raza.getText().equals(" ") || tf_raza.getText().equals(" ")) {
            JOptionPane.showMessageDialog(this, "No puede tener espacios sin nada");

        } else {

            String raza = "";
            int años = 0;
            int ki = 0;
            String planeta = "";

            raza = tf_raza.getText();
            años = (Integer) sp_edad.getValue();
            ki = (Integer) sp_ki.getValue();
            JOptionPane.showMessageDialog(this.jd_cUni, "Guardado exitosamente");
            u.setHabitantes(new Ser_vivo(raza, ki, años, planeta));

            tf_raza.setText(" ");
            sp_edad.setValue(0);
            sp_ki.setValue(0);
            tf_planeta.setText(" ");
            DefaultListModel modL
                    = (DefaultListModel) jl_seres.getModel();
            modL.addElement(new Ser_vivo(raza, ki, años, planeta));
            Ser_vivo sb = new Ser_vivo(raza, ki, años, planeta);
            DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_seres.getModel();
            modelo.addElement(sb);

        }

        System.out.println(u.getHabitantes());

    }//GEN-LAST:event_bt_seresActionPerformed

    private void jmi_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_modificarActionPerformed
        if (!ban) {
            JOptionPane.showMessageDialog(this, "no puede entrar sin crear un universo");
        } else {
            jd_modificar.pack();
            jd_modificar.setModal(true);
            jd_modificar.setVisible(true);
            jd_modificar.setLocationRelativeTo(this);
        }
    }//GEN-LAST:event_jmi_modificarActionPerformed

    private void jl_seresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_seresMouseClicked
        if (evt.isMetaDown()) {
            pp_menu.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jl_seresMouseClicked

    private void bt_LoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_LoEActionPerformed
        if (!ban) {
            JOptionPane.showMessageDialog(this, "no puede entrar sin crear un universo");
        } else {
            jd_eliiminar.pack();
            jd_eliiminar.setModal(true);
            jd_eliiminar.setVisible(true);
            jd_eliiminar.setLocationRelativeTo(this);
        }
    }//GEN-LAST:event_bt_LoEActionPerformed

    private void bt_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_modificarActionPerformed
        if (!ban) {
            JOptionPane.showMessageDialog(this, "no puede entrar sin crear un universo");
        } else {
            int cosa = cb_seres.getSelectedIndex();
            String raza = " ";
            int años = 0;
            int ki = 0;
            String planeta = " ";

            raza = tf_raza1.getText();
            años = (Integer) sp_edad1.getValue();
            ki = (Integer) sp_ki1.getValue();
            planeta = tf_planeta1.getText();

            JOptionPane.showMessageDialog(jd_modificar, "Modificado a la perfeccion");

            tf_raza1.setText("");
            sp_edad1.setValue(0);
            sp_ki1.setValue(0);
            tf_planeta1.setText("");

            Ser_vivo sv = new Ser_vivo(raza, ki, años, planeta);
            u.habitantes.set(cosa, sv);
            DefaultListModel modL
                    = (DefaultListModel) jl_seres.getModel();
            modL.addElement(sv);
            modL.remove(cosa - 1);
        }
    }//GEN-LAST:event_bt_modificarActionPerformed

    private void bt_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_crearActionPerformed
        if (!ban) {
            JOptionPane.showMessageDialog(this, "no puede entrar sin crear un universo");
        } else {
            jd_cUni.pack();
            jd_cUni.setModal(true);
            jd_cUni.setVisible(true);
            jd_cUni.setLocationRelativeTo(this);
        }
    }//GEN-LAST:event_bt_crearActionPerformed

    private void bt_crearArchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_crearArchActionPerformed
        if (!ban) {
            JOptionPane.showMessageDialog(this, "no puede entrar sin crear un universo");
        } else {
            ArrayList univ = new ArrayList();
            univ.addAll(u.habitantes);
            File f = null;
            JFileChooser jfc = new JFileChooser();
            FileNameExtensionFilter filtro
                    = new FileNameExtensionFilter("Archivos de texto", "txt");
            int s = jfc.showSaveDialog(this);

            if (jfc.getFileFilter().getDescription().equals("Archivos de Texto")) {
                f = new File(jfc.getSelectedFile().getPath() + ".txt");

            } else {
                f = jfc.getSelectedFile();
            }

            u.escribir(univ, f);
        }
    }//GEN-LAST:event_bt_crearArchActionPerformed

    private void bt_cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cargarActionPerformed
        if (!ban) {
            JOptionPane.showMessageDialog(this, "no puede entrar sin crear un universo");
        } else {
            jd_cargar.pack();
            jd_cargar.setModal(true);
            jd_cargar.setVisible(true);
            jd_cargar.setLocationRelativeTo(this);
        }
    }//GEN-LAST:event_bt_cargarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!ban) {
            JOptionPane.showMessageDialog(this, "no puede entrar sin crear un universo");
        } else {
            u.abrir();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int r = JOptionPane.showConfirmDialog(this, "seguro salir del universo?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (r == JOptionPane.OK_OPTION) {
            ban = false;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Multiverso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Multiverso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Multiverso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Multiverso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Multiverso().setVisible(true);
            }
        });
    }
    Universo uni;
    Universo u = new Universo();

    boolean ban = false;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_LoE;
    private javax.swing.JButton bt_cargar;
    private javax.swing.JButton bt_crear;
    private javax.swing.JButton bt_crearArch;
    private javax.swing.JButton bt_modificar;
    private javax.swing.JButton bt_seres;
    private javax.swing.JButton bt_universo;
    private javax.swing.JComboBox<String> cb_seres;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JDialog jd_cUni;
    private javax.swing.JDialog jd_cargar;
    private javax.swing.JDialog jd_eliiminar;
    private javax.swing.JDialog jd_modificar;
    private javax.swing.JList<String> jl_seres;
    private javax.swing.JMenuItem jmi_eliminar;
    private javax.swing.JMenuItem jmi_modificar;
    private javax.swing.JPopupMenu pp_menu;
    private javax.swing.JSpinner sp_edad;
    private javax.swing.JSpinner sp_edad1;
    private javax.swing.JSpinner sp_ki;
    private javax.swing.JSpinner sp_ki1;
    private javax.swing.JTextArea ta_1;
    private javax.swing.JTextField tf_planeta;
    private javax.swing.JTextField tf_planeta1;
    private javax.swing.JTextField tf_raza;
    private javax.swing.JTextField tf_raza1;
    // End of variables declaration//GEN-END:variables
}
