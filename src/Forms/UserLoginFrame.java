/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author mohos
 */
public class UserLoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form UserLoginFrame
     */
    public UserLoginFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jButton2 = new javax.swing.JButton();
        LoginPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        LogInButton = new javax.swing.JButton();
        AccNo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ContNo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Ans = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(58, 14, 18));
        jButton2.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Log In as an admin");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 560, -1, -1));

        LoginPanel.setBackground(new java.awt.Color(58, 14, 18));
        LoginPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));
        LoginPanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("User Login");

        LogInButton.setBackground(new java.awt.Color(88, 48, 50));
        LogInButton.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        LogInButton.setForeground(new java.awt.Color(255, 255, 255));
        LogInButton.setText("Log In");
        LogInButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        LogInButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LogInButtonFocusGained(evt);
            }
        });
        LogInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInButtonActionPerformed(evt);
            }
        });

        AccNo.setBackground(new java.awt.Color(58, 14, 18));
        AccNo.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        AccNo.setForeground(new java.awt.Color(255, 255, 255));
        AccNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AccNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        AccNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AccNoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AccNoFocusLost(evt);
            }
        });
        AccNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccNoActionPerformed(evt);
            }
        });
        AccNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AccNoKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Account No");

        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Contact No");

        ContNo.setBackground(new java.awt.Color(58, 14, 18));
        ContNo.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        ContNo.setForeground(new java.awt.Color(255, 255, 255));
        ContNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ContNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        ContNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ContNoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ContNoFocusLost(evt);
            }
        });
        ContNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContNoActionPerformed(evt);
            }
        });
        ContNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ContNoKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Choose Security Question");

        jLabel6.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Answer");

        Ans.setBackground(new java.awt.Color(58, 14, 18));
        Ans.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        Ans.setForeground(new java.awt.Color(255, 255, 255));
        Ans.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Ans.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        Ans.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AnsFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AnsFocusLost(evt);
            }
        });
        Ans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnsActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(58, 14, 18));
        jComboBox1.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is your favourite color?", "What is your favourite pet animal?", "What is your favourite food item?", "What is your favourite hobby?" }));

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(LogInButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AccNo)
                            .addComponent(jLabel4)
                            .addComponent(ContNo)
                            .addComponent(Ans)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(82, 82, 82))))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(1, 1, 1)
                .addComponent(AccNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(1, 1, 1)
                .addComponent(ContNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(10, 10, 10)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(1, 1, 1)
                .addComponent(Ans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(LogInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jPanel1.add(LoginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 320, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/front33.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        jLabel7.setBackground(new java.awt.Color(226, 199, 178));
        jLabel7.setFont(new java.awt.Font("Cambria", 1, 40)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(226, 199, 178));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Banking Management System");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        jLabel14.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(226, 199, 178));
        jLabel14.setText("Hridita Barua");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 580, -1, 20));

        jLabel15.setText("jLabel15");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 630, -1, -1));

        jLabel16.setText("jLabel16");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 630, -1, -1));

        jTextField1.setText("jTextField1");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 620, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogInButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LogInButtonFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_LogInButtonFocusGained

    private void LogInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInButtonActionPerformed

        PreparedStatement st;
        ResultSet rs;
        //get the username and password
        String acc = AccNo.getText();
        String ContactNo = ContNo.getText();
        String SQ = (String)jComboBox1.getSelectedItem();
        String SQA = Ans.getText();
        

        // create a select query to check if the username and the password exist in the database
        String query = "SELECT * FROM `customer` WHERE `ACNo`= ? AND `ContactNo`= ? AND `SQ`= ? AND `SQans`= ?  ";
        if( acc.trim().equals("") ||
             ContactNo .trim().equals("") ||
             SQ.trim().equals("") ||
             SQA .trim().equals("") )
        {
            JOptionPane.showMessageDialog(null, "Please fill up the all fields. ", "Error",2);
        }
        else
        {
            try {
            st = Database_Connection.getConnectoin().prepareStatement(query);

            st.setString(1, acc);
            st.setString(2, ContactNo);
            st.setString(3, SQ);
            st.setString(4, SQA);
            rs = st.executeQuery();

            if (rs.next()){
                // show a new form
                UserMainFrame mm = new UserMainFrame();
                mm.setVisible(true);
                mm.pack();
                mm.setLocationRelativeTo(null);
                
                
                // close the current form
                this.dispose();
                
                AccNo.setText("");
                ContNo.setText("");
                jComboBox1.setSelectedItem("What is your favourite color?");
                Ans.setText("");
            }else{
                //Show error message
                JOptionPane.showMessageDialog(null, "Invalid information\nPlease, Try again...","Login error",2);
                AccNo.setText("");
                ContNo.setText("");
                jComboBox1.setSelectedItem("What is your favourite color?");
                Ans.setText("");
            }

        } catch (SQLException ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    }//GEN-LAST:event_LogInButtonActionPerformed
  
    public String getAccount (){
        String acc = AccNo.getText();
      return acc;
  }
    private void AccNoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AccNoFocusGained
        
    }//GEN-LAST:event_AccNoFocusGained

    private void AccNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AccNoFocusLost
        
    }//GEN-LAST:event_AccNoFocusLost

    private void AccNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccNoActionPerformed

    private void ContNoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ContNoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_ContNoFocusGained

    private void ContNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ContNoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_ContNoFocusLost

    private void ContNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContNoActionPerformed

    private void AnsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AnsFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_AnsFocusGained

    private void AnsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AnsFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_AnsFocusLost

    private void AnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnsActionPerformed

    private void AccNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AccNoKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_AccNoKeyTyped

    private void ContNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ContNoKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_ContNoKeyTyped

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        LoginFrame lf = new LoginFrame();
        lf.setVisible(true);
        lf.pack();
        lf.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(UserLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccNo;
    private javax.swing.JTextField Ans;
    private javax.swing.JTextField ContNo;
    private javax.swing.JButton LogInButton;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
