/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FORMULARIOS;

/**
 *
 * @author DELL
 */
public class MENU extends javax.swing.JFrame {

    /**
     * Creates new form MENU
     */
    public MENU() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        MENU_ADMIN = new javax.swing.JPanel();
        BUTTON_ADMIN = new javax.swing.JButton();
        MENU_VENTAS = new javax.swing.JPanel();
        BUTTON_VENTAS = new javax.swing.JButton();
        MENU_PRODUC = new javax.swing.JPanel();
        BUTTON_PROD = new javax.swing.JButton();
        MENU_FACTURA = new javax.swing.JPanel();
        BUTTON_FACTURA = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        BUTTON_SOPOPRT = new javax.swing.JButton();
        MENU_CLIENTES = new javax.swing.JPanel();
        BUTTON_CLIENTES = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(178, 235, 242));

        jPanel2.setBackground(new java.awt.Color(240, 244, 195));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-visual-studio-logo-100.png"))); // NOI18N
        jLabel10.setText("TECNO_STORE");

        MENU_ADMIN.setBackground(new java.awt.Color(169, 50, 38));
        MENU_ADMIN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MENU_ADMIN.setPreferredSize(new java.awt.Dimension(221, 77));

        BUTTON_ADMIN.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BUTTON_ADMIN.setForeground(new java.awt.Color(240, 240, 240));
        BUTTON_ADMIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-herramientas-del-administrador-48.png"))); // NOI18N
        BUTTON_ADMIN.setText("Empleados");
        BUTTON_ADMIN.setBorderPainted(false);
        BUTTON_ADMIN.setContentAreaFilled(false);
        BUTTON_ADMIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTON_ADMINActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MENU_ADMINLayout = new javax.swing.GroupLayout(MENU_ADMIN);
        MENU_ADMIN.setLayout(MENU_ADMINLayout);
        MENU_ADMINLayout.setHorizontalGroup(
            MENU_ADMINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MENU_ADMINLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(BUTTON_ADMIN)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        MENU_ADMINLayout.setVerticalGroup(
            MENU_ADMINLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MENU_ADMINLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BUTTON_ADMIN)
                .addGap(21, 21, 21))
        );

        MENU_VENTAS.setBackground(new java.awt.Color(36, 113, 163));
        MENU_VENTAS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BUTTON_VENTAS.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BUTTON_VENTAS.setForeground(new java.awt.Color(240, 240, 240));
        BUTTON_VENTAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/negocios-y-finanzas.png"))); // NOI18N
        BUTTON_VENTAS.setText("Ventas");
        BUTTON_VENTAS.setBorderPainted(false);
        BUTTON_VENTAS.setContentAreaFilled(false);
        BUTTON_VENTAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTON_VENTASActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MENU_VENTASLayout = new javax.swing.GroupLayout(MENU_VENTAS);
        MENU_VENTAS.setLayout(MENU_VENTASLayout);
        MENU_VENTASLayout.setHorizontalGroup(
            MENU_VENTASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MENU_VENTASLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(BUTTON_VENTAS)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MENU_VENTASLayout.setVerticalGroup(
            MENU_VENTASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MENU_VENTASLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(BUTTON_VENTAS)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        MENU_PRODUC.setBackground(new java.awt.Color(202, 111, 30));
        MENU_PRODUC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BUTTON_PROD.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BUTTON_PROD.setForeground(new java.awt.Color(240, 240, 240));
        BUTTON_PROD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/paquete.png"))); // NOI18N
        BUTTON_PROD.setText("Inventario");
        BUTTON_PROD.setBorderPainted(false);
        BUTTON_PROD.setContentAreaFilled(false);
        BUTTON_PROD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTON_PRODActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MENU_PRODUCLayout = new javax.swing.GroupLayout(MENU_PRODUC);
        MENU_PRODUC.setLayout(MENU_PRODUCLayout);
        MENU_PRODUCLayout.setHorizontalGroup(
            MENU_PRODUCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MENU_PRODUCLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(BUTTON_PROD)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        MENU_PRODUCLayout.setVerticalGroup(
            MENU_PRODUCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MENU_PRODUCLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(BUTTON_PROD)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MENU_FACTURA.setBackground(new java.awt.Color(46, 64, 83));
        MENU_FACTURA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BUTTON_FACTURA.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BUTTON_FACTURA.setForeground(new java.awt.Color(240, 240, 240));
        BUTTON_FACTURA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-factura-64.png"))); // NOI18N
        BUTTON_FACTURA.setText("Factura");
        BUTTON_FACTURA.setBorderPainted(false);
        BUTTON_FACTURA.setContentAreaFilled(false);
        BUTTON_FACTURA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTON_FACTURAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MENU_FACTURALayout = new javax.swing.GroupLayout(MENU_FACTURA);
        MENU_FACTURA.setLayout(MENU_FACTURALayout);
        MENU_FACTURALayout.setHorizontalGroup(
            MENU_FACTURALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MENU_FACTURALayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(BUTTON_FACTURA)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MENU_FACTURALayout.setVerticalGroup(
            MENU_FACTURALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MENU_FACTURALayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(BUTTON_FACTURA)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(136, 78, 160));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BUTTON_SOPOPRT.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BUTTON_SOPOPRT.setForeground(new java.awt.Color(240, 240, 240));
        BUTTON_SOPOPRT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/lupa (2).png"))); // NOI18N
        BUTTON_SOPOPRT.setText("Productos");
        BUTTON_SOPOPRT.setBorderPainted(false);
        BUTTON_SOPOPRT.setContentAreaFilled(false);
        BUTTON_SOPOPRT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTON_SOPOPRTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(BUTTON_SOPOPRT)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(BUTTON_SOPOPRT)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        MENU_CLIENTES.setBackground(new java.awt.Color(212, 172, 13));
        MENU_CLIENTES.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MENU_CLIENTES.setToolTipText("");

        BUTTON_CLIENTES.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BUTTON_CLIENTES.setForeground(new java.awt.Color(240, 240, 240));
        BUTTON_CLIENTES.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/hombre.png"))); // NOI18N
        BUTTON_CLIENTES.setText("Clientes");
        BUTTON_CLIENTES.setBorderPainted(false);
        BUTTON_CLIENTES.setContentAreaFilled(false);
        BUTTON_CLIENTES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTON_CLIENTESActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MENU_CLIENTESLayout = new javax.swing.GroupLayout(MENU_CLIENTES);
        MENU_CLIENTES.setLayout(MENU_CLIENTESLayout);
        MENU_CLIENTESLayout.setHorizontalGroup(
            MENU_CLIENTESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MENU_CLIENTESLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(BUTTON_CLIENTES)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MENU_CLIENTESLayout.setVerticalGroup(
            MENU_CLIENTESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MENU_CLIENTESLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(BUTTON_CLIENTES)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Tecnologia y Calidad Al Mejor Precio");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MENU_VENTAS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MENU_ADMIN, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MENU_PRODUC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MENU_FACTURA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MENU_CLIENTES, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(244, 244, 244))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(222, 222, 222))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MENU_PRODUC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MENU_ADMIN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(MENU_CLIENTES, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MENU_FACTURA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MENU_VENTAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//metodo para poder abrir el siguiente jframe por medio de un set visible
    private void BUTTON_FACTURAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_FACTURAActionPerformed
      FACTURA ver=new FACTURA();
     ver.setVisible(true);
    }//GEN-LAST:event_BUTTON_FACTURAActionPerformed
//metodo para poder abrir el siguiente jframe por medio de un set visible
    private void BUTTON_CLIENTESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_CLIENTESActionPerformed
        REGISTRO_CLIENTE ver=new REGISTRO_CLIENTE();
     ver.setVisible(true);
    }//GEN-LAST:event_BUTTON_CLIENTESActionPerformed
//metodo para poder abrir el siguiente jframe por medio de un set visible
    private void BUTTON_ADMINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_ADMINActionPerformed
    REGISTRARSSE_ADMIN ver=new REGISTRARSSE_ADMIN();
     ver.setVisible(true);
    }//GEN-LAST:event_BUTTON_ADMINActionPerformed
//metodo para poder abrir el siguiente jframe por medio de un set visible
    private void BUTTON_PRODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_PRODActionPerformed
        LOGIN_PRO ver=new LOGIN_PRO();
     ver.setVisible(true);
    }//GEN-LAST:event_BUTTON_PRODActionPerformed
//metodo para poder abrir el siguiente jframe por medio de un set visible
    private void BUTTON_VENTASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_VENTASActionPerformed
        VENTAS ver=new VENTAS();
     ver.setVisible(true);
    }//GEN-LAST:event_BUTTON_VENTASActionPerformed
//metodo para poder abrir el siguiente jframe por medio de un set visible
    private void BUTTON_SOPOPRTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_SOPOPRTActionPerformed
          Porductos ver=new Porductos();
     ver.setVisible(true);
    }//GEN-LAST:event_BUTTON_SOPOPRTActionPerformed

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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUTTON_ADMIN;
    private javax.swing.JButton BUTTON_CLIENTES;
    private javax.swing.JButton BUTTON_FACTURA;
    private javax.swing.JButton BUTTON_PROD;
    private javax.swing.JButton BUTTON_SOPOPRT;
    private javax.swing.JButton BUTTON_VENTAS;
    private javax.swing.JPanel MENU_ADMIN;
    private javax.swing.JPanel MENU_CLIENTES;
    private javax.swing.JPanel MENU_FACTURA;
    private javax.swing.JPanel MENU_PRODUC;
    private javax.swing.JPanel MENU_VENTAS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    // End of variables declaration//GEN-END:variables
}
