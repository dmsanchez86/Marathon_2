/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import marathon_2.Queries;
import marathon_2.Timer;

/**
 *
 * @author Mauro
 */
public class Register_Event extends javax.swing.JFrame {
    public String emailUser;
    private String idRunner;
    Queries q;
    String[] idsCompetitionsEvents;
    String[] idsCharities;
    String[] idsKits;
    String[] costKits;
    String[] costEvents;
    String[] dataCharities;
    DefaultComboBoxModel combo;
    int amount;
    boolean control_radios;
    String last_radio;
    String currentDate;
    
    /**
     * Creates new form Register_Event
     */
    public Register_Event() {
        initComponents();
        
        // Set Date
        Calendar date = GregorianCalendar.getInstance();
        String hour = date.getTime().toString().split(" ")[3];
        String[] partsDate = date.getTime().toLocaleString().split(" ");
        String[] dateArray = partsDate[0].split("/");
        
        currentDate = dateArray[2]+"-"+dateArray[1]+"-"+dateArray[0]+" "+hour;
        
        /* Dialog */
        d_charity.setSize(556, 472);
        d_charity.setLocationRelativeTo(this);
        d_charity.setTitle("Data Charity");
        d_charity.setResizable(false);
        
        amount = 0;
        control_radios = false;
        last_radio = "3";
        
        combo = new DefaultComboBoxModel();
        
        Timer t = new Timer(lbl_time);
        q = new Queries();
        idsCompetitionsEvents = new String[3];
        idsKits = new String[3];
        costKits = new String[3];
        costEvents = new String[3];
        
        // get number charities
        int numberCharities = q.number_Charities();
        idsCharities = new String[numberCharities];
        dataCharities = new String[numberCharities];
        
        // load competitions events
        ResultSet dataCompetitions = q.getCompetitionsEvents();
        int numCompetitions = 0;
        
        try {
            while(dataCompetitions.next()){
                costEvents[numCompetitions] =  dataCompetitions.getString("Cost");
                
                if(numCompetitions == 0){
                    jcb_competition_1.setText(dataCompetitions.getString("EventTypeName")+ " ("+ dataCompetitions.getString("Cost") + ")" );
                }
                
                if(numCompetitions == 1){
                    jcb_competition_2.setText(dataCompetitions.getString("EventTypeName")+ " ("+ dataCompetitions.getString("Cost") + ")" );
                }
                
                if(numCompetitions == 2){
                    jcb_competition_3.setText(dataCompetitions.getString("EventTypeName")+ " ("+ dataCompetitions.getString("Cost") + ")" );
                }
                
                
                idsCompetitionsEvents[numCompetitions] = dataCompetitions.getString("EventId");
                numCompetitions++;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        // load charities
        combo.addElement("Select Charity");
        
        try {
            ResultSet informationCharities = q.get_Charities();
            int countCharities = 0;
            
            while(informationCharities.next()){
                idsCharities[countCharities] = informationCharities.getString("CharityId");
                dataCharities[countCharities] = informationCharities.getString("CharityName")+"//"+informationCharities.getString("CharityDescription")+"//"+informationCharities.getString("CharityLogo");
                
                combo.addElement(informationCharities.getString("CharityName"));
                
                countCharities++;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        jcb_charities.setModel(combo);
        
        // load Kits
        try {
            ResultSet dataKits = q.get_Kits();
            int countKits = 0;
            
            while(dataKits.next()){
                idsKits[countKits] = dataKits.getString("RaceKitOptionId");
                costKits[countKits] = dataKits.getString("Cost");
                
                if(countKits == 0){
                    jrb_kit_1.setText(dataKits.getString("RaceKitOption") + "("+dataKits.getString("Cost")+")");
                }
                
                if(countKits == 1){
                    jrb_kit_2.setText(dataKits.getString("RaceKitOption") + "("+dataKits.getString("Cost")+")");
                }
                
                if(countKits == 2){
                    jrb_kit_3.setText(dataKits.getString("RaceKitOption") + "("+dataKits.getString("Cost")+")");
                }
                
                countKits++;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void setEmail(String email){
        this.emailUser = email;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        d_charity = new javax.swing.JDialog();
        lbl_name_charity = new javax.swing.JLabel();
        lbl_logo_charity = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_description_charity = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lbl_time = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jcb_competition_1 = new javax.swing.JCheckBox();
        jcb_competition_2 = new javax.swing.JCheckBox();
        jcb_competition_3 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcb_charities = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_target_raise = new javax.swing.JTextField();
        btn_register = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jrb_kit_1 = new javax.swing.JRadioButton();
        jrb_kit_2 = new javax.swing.JRadioButton();
        jrb_kit_3 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbl_amount = new javax.swing.JLabel();

        lbl_name_charity.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_name_charity.setForeground(new java.awt.Color(153, 153, 153));
        lbl_name_charity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_name_charity.setText("REGISTER FOR EVENT");

        lbl_logo_charity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_logo_charity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arise-logo.png"))); // NOI18N

        jta_description_charity.setEditable(false);
        jta_description_charity.setColumns(20);
        jta_description_charity.setLineWrap(true);
        jta_description_charity.setRows(5);
        jta_description_charity.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jta_description_charity);

        javax.swing.GroupLayout d_charityLayout = new javax.swing.GroupLayout(d_charity.getContentPane());
        d_charity.getContentPane().setLayout(d_charityLayout);
        d_charityLayout.setHorizontalGroup(
            d_charityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d_charityLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(d_charityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_logo_charity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_name_charity, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        d_charityLayout.setVerticalGroup(
            d_charityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d_charityLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_name_charity)
                .addGap(18, 18, 18)
                .addComponent(lbl_logo_charity, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Marathon Skills 2016 - Register Event");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
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
                .addGap(76, 76, 76)
                .addComponent(lbl_time, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        jLabel2.setText("REGISTER FOR EVENT");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Competition Events");

        jcb_competition_1.setText("competiiton");
        jcb_competition_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_competition_1ActionPerformed(evt);
            }
        });

        jcb_competition_2.setText("competiiton");
        jcb_competition_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_competition_2ActionPerformed(evt);
            }
        });

        jcb_competition_3.setText("competiiton");
        jcb_competition_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_competition_3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Sponsorship Details");

        jLabel6.setText("Charity");

        jcb_charities.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 0));
        jLabel7.setText(" ? ");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 0), 2));
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setText("Target to Raise");

        btn_register.setText("Register");
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });

        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcb_competition_2)
                                    .addComponent(jcb_competition_1)
                                    .addComponent(jcb_competition_3)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcb_charities, 0, 139, Short.MAX_VALUE)
                                    .addComponent(txt_target_raise))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(btn_register)
                                .addGap(18, 18, 18)
                                .addComponent(btn_cancel)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcb_competition_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcb_competition_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcb_competition_3)
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcb_charities, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_target_raise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_register)
                    .addComponent(btn_cancel))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Race kit options");

        buttonGroup1.add(jrb_kit_1);
        jrb_kit_1.setText("kit");
        jrb_kit_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_kit_1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrb_kit_2);
        jrb_kit_2.setText("kit");
        jrb_kit_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_kit_2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrb_kit_3);
        jrb_kit_3.setSelected(true);
        jrb_kit_3.setText("kit");
        jrb_kit_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_kit_3ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Registration cost");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 54)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("$");

        lbl_amount.setFont(new java.awt.Font("Tahoma", 1, 54)); // NOI18N
        lbl_amount.setForeground(new java.awt.Color(153, 153, 153));
        lbl_amount.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(94, 94, 94))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrb_kit_3)
                            .addComponent(jrb_kit_2)
                            .addComponent(jrb_kit_1)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_amount)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrb_kit_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrb_kit_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrb_kit_3)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lbl_amount))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel2)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        if(jcb_charities.getSelectedIndex() != 0){
            String[] charity = dataCharities[jcb_charities.getSelectedIndex() - 1].split("//");
            lbl_name_charity.setText(charity[0]);
            jta_description_charity.setText(charity[1]);
            lbl_logo_charity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/"+charity[2])));
            d_charity.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, "Select first one charity!", "Marathon Skills 2016", JOptionPane.WARNING_MESSAGE);
            jcb_charities.requestFocus();
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Menu_Runner mr = new Menu_Runner();
        mr.setEmail(emailUser);
        mr.setVisible(true);
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        // TODO add your handling code here:
        if(!jcb_competition_1.isSelected() && !jcb_competition_2.isSelected() && !jcb_competition_3.isSelected()){
            JOptionPane.showMessageDialog(this, "Select one competitions event!", "Marathons Skills 2016", JOptionPane.WARNING_MESSAGE);
            jcb_competition_1.requestFocus();
        }else if(jcb_charities.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, "Select one charity!", "Marathons Skills 2016", JOptionPane.WARNING_MESSAGE);
            jcb_charities.requestFocus();
        }else if("".equals(txt_target_raise.getText())){
            JOptionPane.showMessageDialog(this, "Write one target to raise please!", "Marathons Skills 2016", JOptionPane.WARNING_MESSAGE);
            txt_target_raise.requestFocus();
        }else{
            int price = 0;
            
            try {
                price = Integer.parseInt(txt_target_raise.getText());
            } catch (NumberFormatException e) {
                txt_target_raise.setText(null);
                txt_target_raise.requestFocus();
                JOptionPane.showMessageDialog(this, "Write just numbers please", "Marathon Skills 2016", JOptionPane.ERROR_MESSAGE);
            }
            
            int selectedKit = 0;
            
            if(jrb_kit_1.isSelected()){
                selectedKit = 0;
            }else if(jrb_kit_2.isSelected()){
                selectedKit = 1;
            }else if(jrb_kit_3.isSelected()){
                selectedKit = 2;
            }
            
            int cost = Integer.parseInt(lbl_amount.getText());
            
            boolean response = q.registerToEvent(idRunner, currentDate, idsKits[selectedKit], 1, cost, idsCharities[jcb_charities.getSelectedIndex() - 1], price);
            
            if(response){
                this.setVisible(false);
                Confirmation_Register cr = new Confirmation_Register();
                cr.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(this, "Fail register!", "Marathon Skills 2016", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_registerActionPerformed

    private void jrb_kit_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_kit_1ActionPerformed
        // TODO add your handling code here:
        amount = Integer.parseInt(lbl_amount.getText());
        
        if("2".equals(last_radio)){
            amount -= 20;
            control_radios = false;
        }
        
        if(jrb_kit_1.isSelected() && control_radios == false){
            amount += 45;
            control_radios = true;
        }
        
        last_radio = "1";
        
        lbl_amount.setText(""+amount);
    }//GEN-LAST:event_jrb_kit_1ActionPerformed

    private void jrb_kit_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_kit_2ActionPerformed
        // TODO add your handling code here:
        amount = Integer.parseInt(lbl_amount.getText());
        
        if("1".equals(last_radio)){
            amount -= 45;
            control_radios = false;
        }
        
        if(jrb_kit_2.isSelected() && control_radios == false){
            amount += 20;
            control_radios = true;
        }
        
        last_radio = "2";
        lbl_amount.setText(""+amount);
    }//GEN-LAST:event_jrb_kit_2ActionPerformed

    private void jrb_kit_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_kit_3ActionPerformed
        // TODO add your handling code here:
        amount = Integer.parseInt(lbl_amount.getText());
        
        if("1".equals(last_radio)){
            amount -= 45;
            control_radios = false;
        }
        
        if("2".equals(last_radio)){
            amount -= 20;
            control_radios = false;
        }
        
        if(jrb_kit_2.isSelected() && control_radios == false){
            control_radios = true;
        }
        
        last_radio = "3";
        
        lbl_amount.setText(""+amount);
    }//GEN-LAST:event_jrb_kit_3ActionPerformed

    private void jcb_competition_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_competition_1ActionPerformed
        // TODO add your handling code here:
        amount = Integer.parseInt(lbl_amount.getText());
        
        if(jcb_competition_1.isSelected()){
            amount += Double.parseDouble(costEvents[0]); 
        }else{
            amount -= Double.parseDouble(costEvents[0]); 
        }
        
        lbl_amount.setText(""+amount);
    }//GEN-LAST:event_jcb_competition_1ActionPerformed

    private void jcb_competition_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_competition_2ActionPerformed
        // TODO add your handling code here:
        amount = Integer.parseInt(lbl_amount.getText());
        
        if(jcb_competition_2.isSelected()){
            amount += Double.parseDouble(costEvents[1]); 
        }else{
            amount -= Double.parseDouble(costEvents[1]); 
        }
        
        lbl_amount.setText(""+amount);
    }//GEN-LAST:event_jcb_competition_2ActionPerformed

    private void jcb_competition_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_competition_3ActionPerformed
        // TODO add your handling code here:
        amount = Integer.parseInt(lbl_amount.getText());
        
        if(jcb_competition_3.isSelected()){
            amount += Double.parseDouble(costEvents[2]); 
        }else{
            amount -= Double.parseDouble(costEvents[2]); 
        }
        
        lbl_amount.setText(""+amount);
    }//GEN-LAST:event_jcb_competition_3ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        idRunner = q.getIdRunner(emailUser);
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(Register_Event.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_Event.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_Event.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_Event.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_Event().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_register;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JDialog d_charity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jcb_charities;
    private javax.swing.JCheckBox jcb_competition_1;
    private javax.swing.JCheckBox jcb_competition_2;
    private javax.swing.JCheckBox jcb_competition_3;
    private javax.swing.JRadioButton jrb_kit_1;
    private javax.swing.JRadioButton jrb_kit_2;
    private javax.swing.JRadioButton jrb_kit_3;
    private javax.swing.JTextArea jta_description_charity;
    private javax.swing.JLabel lbl_amount;
    private javax.swing.JLabel lbl_logo_charity;
    private javax.swing.JLabel lbl_name_charity;
    private javax.swing.JLabel lbl_time;
    private javax.swing.JTextField txt_target_raise;
    // End of variables declaration//GEN-END:variables
}
