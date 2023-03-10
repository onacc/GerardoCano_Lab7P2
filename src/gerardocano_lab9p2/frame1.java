/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gerardocano_lab9p2;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.DefaultListModel;

/**
 *
 * @author gcano
 */
public class frame1 extends javax.swing.JFrame {

    /**
     * Creates new form frame1
     */
    public frame1() {
        initComponents();
        pack();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupmenu = new javax.swing.JPopupMenu();
        jmi_creararchivo = new javax.swing.JMenuItem();
        jmi_crearcarpeta = new javax.swing.JMenuItem();
        jd_creararchivo = new javax.swing.JDialog();
        comboextension = new javax.swing.JComboBox<>();
        jtxt_nombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        js_tam = new javax.swing.JSpinner();
        btn_creararchivo = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();
        jprogress2 = new javax.swing.JProgressBar();
        jProgressBar3 = new javax.swing.JProgressBar();
        jprogress1 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_dir = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_archives = new javax.swing.JList<>();

        jmi_creararchivo.setText("Crear Archivo");
        jmi_creararchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_creararchivoActionPerformed(evt);
            }
        });
        popupmenu.add(jmi_creararchivo);

        jmi_crearcarpeta.setText("Crear Carpeta");
        popupmenu.add(jmi_crearcarpeta);

        comboextension.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".mp4", ".pdf", ".docx", ".zip", ".mp3" }));

        jLabel1.setText("Crear Archivo");

        js_tam.setModel(new javax.swing.SpinnerNumberModel(1.0d, 1.0d, 100.0d, 1.0d));

        btn_creararchivo.setText("Crear Archivo");
        btn_creararchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_creararchivoActionPerformed(evt);
            }
        });

        btn_regresar.setText("Regresar");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_creararchivoLayout = new javax.swing.GroupLayout(jd_creararchivo.getContentPane());
        jd_creararchivo.getContentPane().setLayout(jd_creararchivoLayout);
        jd_creararchivoLayout.setHorizontalGroup(
            jd_creararchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_creararchivoLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jd_creararchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_creararchivoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_creararchivoLayout.createSequentialGroup()
                        .addGroup(jd_creararchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxt_nombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_creararchivoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_creararchivo))
                            .addGroup(jd_creararchivoLayout.createSequentialGroup()
                                .addComponent(btn_regresar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                                .addComponent(comboextension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(js_tam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19))))
        );
        jd_creararchivoLayout.setVerticalGroup(
            jd_creararchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_creararchivoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_creararchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_regresar)
                    .addComponent(comboextension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(js_tam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_creararchivo)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jl_dir.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Mi Unidad", "Destacados", "Papelera" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jl_dir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_dirMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jl_dirMousePressed(evt);
            }
        });
        jl_dir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jl_dirKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jl_dirKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jl_dir);

        jl_archives.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(jl_archives);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jprogress1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jprogress2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jprogress1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jprogress2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jl_dirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_dirMouseClicked
        DefaultListModel modelo = (DefaultListModel) jl_archives.getModel();
        if(jl_dir.getSelectedIndex()==0){
            System.out.println(0);
            for (int i = 0; i < archivos.size(); i++) {
                modelo.addElement(archivos.get(i));
            }
            
        }else if(jl_dir.getSelectedIndex()==1){
            System.out.println(1);
        }else if(jl_dir.getSelectedIndex()==2){
            System.out.println(2);
        }
    }//GEN-LAST:event_jl_dirMouseClicked

    private void jl_dirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jl_dirKeyPressed
        
    }//GEN-LAST:event_jl_dirKeyPressed

    private void jl_dirKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jl_dirKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jl_dirKeyReleased

    private void jl_dirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_dirMousePressed
        if(evt.getButton()==3){
            popupmenu.show(jl_dir, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jl_dirMousePressed

    private void jmi_creararchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_creararchivoActionPerformed
        jd_creararchivo.pack();
        jd_creararchivo.setModal(true);
        
        jd_creararchivo.setLocationRelativeTo(this);
        jd_creararchivo.setVisible(true);
    }//GEN-LAST:event_jmi_creararchivoActionPerformed

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
        jd_creararchivo.setVisible(false);
        jtxt_nombre.setText("");
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void btn_creararchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_creararchivoActionPerformed
        String link="";
        
        archivos.add(new Archivo( randomstr(link), jtxt_nombre.getText(), (String) comboextension.getSelectedItem(), (double) js_tam.getValue()));
        jd_creararchivo.setVisible(false);
        jtxt_nombre.setText("");
    }//GEN-LAST:event_btn_creararchivoActionPerformed

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
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame1().setVisible(true);
            }
        });
    }
     public String randomstr(String retorno){
        char randomchar;
        Random r = new Random();
         for (int i = 0; i < 9; i++) {
             randomchar = (char)(r.nextInt(26)+'a');
            retorno+=randomchar;
        }
        return retorno;
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_creararchivo;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JComboBox<String> comboextension;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JDialog jd_creararchivo;
    private javax.swing.JList<String> jl_archives;
    private javax.swing.JList<String> jl_dir;
    private javax.swing.JMenuItem jmi_creararchivo;
    private javax.swing.JMenuItem jmi_crearcarpeta;
    private javax.swing.JProgressBar jprogress1;
    private javax.swing.JProgressBar jprogress2;
    private javax.swing.JSpinner js_tam;
    private javax.swing.JTextField jtxt_nombre;
    private javax.swing.JPopupMenu popupmenu;
    // End of variables declaration//GEN-END:variables
ArrayList<Carpeta> carpetas =new ArrayList();
ArrayList<Archivo> archivos = new ArrayList();
ArrayList<Carpeta> papelera = new ArrayList();
}
