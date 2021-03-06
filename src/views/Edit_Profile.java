/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import models.Queries;
import models.Timer;

/**
 *
 * @author Mauro
 */
public class Edit_Profile extends javax.swing.JFrame {
    public String emailUser;
    DefaultComboBoxModel combo;
    String[] codeCountries;
    Queries q;
    boolean controlUpdatePassword = false;
    
    /**
     * Creates new form Edit_Profile
     */
    public Edit_Profile() {
        initComponents();
        
        Timer t = new Timer(lbl_time);
        
        combo = new DefaultComboBoxModel();
        q = new Queries();
        
        int numCountries = q.countCountries();
        codeCountries = new String[numCountries];
        
        combo.addElement("Select Country");
        
        ResultSet countriesData = q.getCountries();
        int n = 0;
        
        try {
            while(countriesData.next()){
                codeCountries[n] = countriesData.getString("CountryCode");
                combo.addElement(countriesData.getString("CountryName"));
                n++;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        jcb_country.setModel(combo);
    }
    
    void setEmail(String emailUser) {
        this.emailUser = emailUser;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbl_time = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        txt_first_name = new javax.swing.JTextField();
        txt_last_name = new javax.swing.JTextField();
        jcb_gender = new javax.swing.JComboBox();
        jdc_date_birth = new com.toedter.calendar.JDateChooser();
        jcb_country = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        txt_password_again = new javax.swing.JPasswordField();
        btn_save = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Marathon Skills 2016 - Edit Profile");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MARATHON SKILLS 2016");

        btn_back.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btn_back.setText("Back");
        btn_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_back)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        lbl_time.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        lbl_time.setForeground(new java.awt.Color(255, 255, 255));
        lbl_time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_time.setText("0d days 0h hours 0m minutes 0s seconds until to race starts!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(lbl_time)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("EDIT PROFILE");

        jLabel3.setText("Email");

        jLabel4.setText("First Name");

        jLabel5.setText("Last Name");

        jLabel6.setText("Gender");

        jLabel7.setText("Date of Birth");

        jLabel8.setText("Country");

        lbl_email.setText("email@email.com");

        jcb_gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select gender", "Male", "Female" }));

        jdc_date_birth.setDateFormatString("yyyy-MM-d");

        jcb_country.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(jLabel4))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbl_email)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_first_name, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcb_country, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jdc_date_birth, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_last_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(jcb_gender, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lbl_email))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_first_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_last_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jcb_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addComponent(jdc_date_birth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jcb_country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Change Password");

        jLabel10.setText("New Password");

        jLabel11.setText("Password Again");

        txt_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_passwordFocusLost(evt);
            }
        });
        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_passwordKeyPressed(evt);
            }
        });

        txt_password_again.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_password_againFocusLost(evt);
            }
        });
        txt_password_again.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_password_againKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(24, 24, 24)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_password_again, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_password_again, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_save)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cancel))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_save)
                    .addComponent(btn_cancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Menu_Runner mr = new Menu_Runner();
        mr.setEmail(emailUser);
        mr.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Menu_Runner mr = new Menu_Runner();
        mr.setEmail(emailUser);
        mr.setVisible(true);
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:
        if(controlUpdatePassword){
            String password = txt_password.getText();
            String password_again = txt_password_again.getText();
            
            int numberCharacteresUppercase = 0;
            int numberDigits = 0;
            int numberCharacters = 0;
            
            // validate
            for (int i = 0; i < password.length(); i++) {
                if(Character.isUpperCase(password.charAt(i))){
                    numberCharacteresUppercase++;
                }
                
                if(Character.isDigit(password.charAt(i))){
                    numberDigits++;
                }
                
                if(
                        password.charAt(i) == '!' || 
                        password.charAt(i) == '@' || 
                        password.charAt(i) == '#' || 
                        password.charAt(i) == '$' || 
                        password.charAt(i) == '%' || 
                        password.charAt(i) == '^'
                ){
                    numberCharacters++;
                }
            }
            
            if(password.length() < 6){
                JOptionPane.showMessageDialog(this, "The password is invalid, must be major to 6 characteres!", "Marathon Skills 2016", JOptionPane.WARNING_MESSAGE);
                txt_password.requestFocus();
            }else if(numberCharacteresUppercase < 1){
                JOptionPane.showMessageDialog(this, "The password require minimun one letter in uppercase!", "Marathon Skills 2016", JOptionPane.WARNING_MESSAGE);
                txt_password.requestFocus();
            }else if(numberDigits < 1){
                JOptionPane.showMessageDialog(this, "The password require minimun one digit o number!", "Marathon Skills 2016", JOptionPane.WARNING_MESSAGE);
                txt_password.requestFocus();
            }else if(numberCharacters < 1){
                JOptionPane.showMessageDialog(this, "Verify if the password contains some of this characteres '!@#$%^'!", "Marathon Skills 2016", JOptionPane.WARNING_MESSAGE);
                txt_password.requestFocus();
            }else{
                if(password.equals(password_again)){
                    boolean response = q.changePassword(lbl_email.getText(), password);
                    
                    if(response){
                        System.out.println("update password");
                        updateProfile();
                        txt_password.setText(null);
                        txt_password_again.setText(null);
                    }else{
                        JOptionPane.showMessageDialog(this, "Error!", "Marathon Skills 2016", JOptionPane.WARNING_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "The passwords are not equals!", "Marathon Skills 2016", JOptionPane.WARNING_MESSAGE);
                    txt_password.requestFocus();
                }
            }
        }else{
            updateProfile();
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void txt_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyPressed
        // TODO add your handling code here:
        controlUpdatePassword = true;
    }//GEN-LAST:event_txt_passwordKeyPressed

    private void txt_password_againKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_password_againKeyPressed
        // TODO add your handling code here:
        controlUpdatePassword = true;
    }//GEN-LAST:event_txt_password_againKeyPressed

    private void txt_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_passwordFocusLost
        // TODO add your handling code here:
        if("".equals(txt_password.getText()) && "".equals(txt_password_again.getText()))
            controlUpdatePassword = false;
    }//GEN-LAST:event_txt_passwordFocusLost

    private void txt_password_againFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_password_againFocusLost
        // TODO add your handling code here:
        if("".equals(txt_password.getText()) && "".equals(txt_password_again.getText()))
            controlUpdatePassword = false;
    }//GEN-LAST:event_txt_password_againFocusLost

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try {
            lbl_email.setText(emailUser);
            
            String[] datauser = q.dataUser(emailUser);

            txt_first_name.setText(datauser[0]);
            txt_last_name.setText(datauser[1]);
            jcb_gender.setSelectedItem(datauser[2]);

            SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
            Date date = formatDate.parse(datauser[3]);
            jdc_date_birth.setDate(date);
            
            jcb_country.setSelectedItem(datauser[4]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Edit_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit_Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox jcb_country;
    private javax.swing.JComboBox jcb_gender;
    private com.toedter.calendar.JDateChooser jdc_date_birth;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_time;
    private javax.swing.JTextField txt_first_name;
    private javax.swing.JTextField txt_last_name;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JPasswordField txt_password_again;
    // End of variables declaration//GEN-END:variables

    private void updateProfile() {
        String name = txt_first_name.getText();
        String lastname = txt_last_name.getText();
        String dateBirth = "";
        int currentYear = 2016;
        int yearBirth = 0;
        
        try{
            String[] partsDate = jdc_date_birth.getDate().toLocaleString().split(" ")[0].split("/");
            dateBirth = partsDate[2]+"-"+partsDate[1]+"-"+partsDate[0];
            yearBirth = Integer.parseInt(partsDate[2]);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        if("".equals(name)){
            JOptionPane.showMessageDialog(this, "The name can't be empty!", "Marathon Skills 2016", JOptionPane.WARNING_MESSAGE);
            txt_first_name.requestFocus();
        }else if("".equals(lastname)){
            JOptionPane.showMessageDialog(this, "The lastname can't be empty!", "Marathon Skills 2016", JOptionPane.WARNING_MESSAGE);
            txt_last_name.requestFocus();
        }else if(jcb_gender.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, "Select one gender!", "Marathon Skills 2016", JOptionPane.WARNING_MESSAGE);
            jcb_gender.requestFocus();
        }else if("".equals(dateBirth)){
            JOptionPane.showMessageDialog(this, "The date of birth can't be empty!", "Marathon Skills 2016", JOptionPane.WARNING_MESSAGE);
            jdc_date_birth.getDateEditor().getUiComponent().requestFocus();
        }else if(jcb_country.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, "Select one country!", "Marathon Skills 2016", JOptionPane.WARNING_MESSAGE);
            jcb_country.requestFocus();
        }else if((currentYear - yearBirth) < 10){
            JOptionPane.showMessageDialog(this, "your age must be major to 10 years old!", "Marathon Skills 2016", JOptionPane.WARNING_MESSAGE);
            jdc_date_birth.getDateEditor().getUiComponent().requestFocus();
        }else{
            String gender = jcb_gender.getSelectedItem().toString();
            String codeCountry = codeCountries[jcb_country.getSelectedIndex() - 1];
            
            boolean response = q.updateProfile(lbl_email.getText(), name, lastname, gender, dateBirth, codeCountry);
            
            if(response){
                JOptionPane.showMessageDialog(this, "Profile updated succesfull!", "Marathon Skills 2016", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Error!", "Marathon Skills 2016", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }
}
