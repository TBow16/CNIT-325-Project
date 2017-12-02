/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPackage;

/**
 *
 * @author trevor
 */
public class DemoGUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public DemoGUI() {
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

        jRadioButton16 = new javax.swing.JRadioButton();
        btnDefend = new javax.swing.JButton();
        btnMove = new javax.swing.JButton();
        btnAttack = new javax.swing.JButton();
        btnSpecial = new javax.swing.JButton();
        pos1 = new javax.swing.JRadioButton();
        pos2 = new javax.swing.JRadioButton();
        pos3 = new javax.swing.JRadioButton();
        pos4 = new javax.swing.JRadioButton();
        pos5 = new javax.swing.JRadioButton();
        pos6 = new javax.swing.JRadioButton();
        pos7 = new javax.swing.JRadioButton();
        pos8 = new javax.swing.JRadioButton();
        pos9 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtSelf = new javax.swing.JTextArea();
        pos10 = new javax.swing.JRadioButton();
        pos11 = new javax.swing.JRadioButton();
        pos12 = new javax.swing.JRadioButton();
        pos13 = new javax.swing.JRadioButton();
        pos14 = new javax.swing.JRadioButton();
        pos15 = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtEnemy = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAction = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newGame = new javax.swing.JMenuItem();
        login = new javax.swing.JMenuItem();
        save = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        summon1 = new javax.swing.JMenuItem();
        summon2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        howTo = new javax.swing.JMenuItem();
        about = new javax.swing.JMenuItem();

        jRadioButton16.setText("jRadioButton16");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDefend.setText("Defend");
        btnDefend.setToolTipText("");
        btnDefend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefendActionPerformed(evt);
            }
        });

        btnMove.setText("Move");
        btnMove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoveActionPerformed(evt);
            }
        });

        btnAttack.setText("Attack");
        btnAttack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttackActionPerformed(evt);
            }
        });

        btnSpecial.setText("Special");
        btnSpecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpecialActionPerformed(evt);
            }
        });

        jLabel1.setText("Your Stats:");

        jLabel2.setText("Your Enemy:");
        jLabel2.setToolTipText("");

        jScrollPane2.setHorizontalScrollBar(null);

        txtSelf.setEditable(false);
        txtSelf.setColumns(20);
        txtSelf.setRows(5);
        jScrollPane2.setViewportView(txtSelf);

        jScrollPane3.setHorizontalScrollBar(null);

        txtEnemy.setEditable(false);
        txtEnemy.setColumns(20);
        txtEnemy.setRows(5);
        jScrollPane3.setViewportView(txtEnemy);

        jScrollPane4.setHorizontalScrollBar(null);

        txtAction.setEditable(false);
        txtAction.setColumns(20);
        txtAction.setRows(5);
        jScrollPane4.setViewportView(txtAction);

        jLabel3.setText("Previous Actions");

        jMenu1.setText("File");

        newGame.setText("New Game");
        newGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameActionPerformed(evt);
            }
        });
        jMenu1.add(newGame);

        login.setText("Login");
        jMenu1.add(login);

        save.setText("Save");
        jMenu1.add(save);

        exit.setText("Exit");
        jMenu1.add(exit);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Summon");

        summon1.setText("Enemy 1");
        summon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                summon1ActionPerformed(evt);
            }
        });
        jMenu3.add(summon1);

        summon2.setText("Enemy 2");
        jMenu3.add(summon2);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Info");

        howTo.setText("How to Play");
        jMenu2.add(howTo);

        about.setText("About");
        jMenu2.add(about);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 264, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(412, 412, 412))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pos1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pos2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pos3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pos4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pos5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pos6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pos7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pos8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pos9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pos10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pos11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pos12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pos13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pos14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pos15))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(71, 71, 71)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnAttack, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnSpecial, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnDefend, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(btnMove, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(122, 122, 122)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pos2)
                    .addComponent(pos1)
                    .addComponent(pos3)
                    .addComponent(pos4)
                    .addComponent(pos5)
                    .addComponent(pos6)
                    .addComponent(pos7)
                    .addComponent(pos8)
                    .addComponent(pos9)
                    .addComponent(pos10)
                    .addComponent(pos11)
                    .addComponent(pos12)
                    .addComponent(pos13)
                    .addComponent(pos14)
                    .addComponent(pos15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAttack, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDefend)
                            .addComponent(btnMove))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSpecial))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDefendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefendActionPerformed
        // TODO add your handling code here:
        //will either reduce or negate damage dependant on class
    }//GEN-LAST:event_btnDefendActionPerformed

    private void btnMoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoveActionPerformed
        // TODO add your handling code here:
        //Player movement
        playerMovement();
        enemyReaction();

    }//GEN-LAST:event_btnMoveActionPerformed

    private void btnAttackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttackActionPerformed
        // TODO add your handling code here:
        if (pos1.isSelected()) {
            if (pos2.isSelected()) {
                txtAction.append("You attacked the enemy. \n");
            } else {
                txtAction.append("You attemted to attack the air. \n    ...It did nothing \n");
            }
        } else if (pos2.isSelected()) {
            if (pos3.isSelected()) {
                txtAction.append("You attacked the enemy. \n");
            } else {
                txtAction.append("You attemted to attack the air. \n    ...It did nothing \n");
            }
        } else if (pos3.isSelected()) {
            if (pos4.isSelected()) {
                txtAction.append("You attacked the enemy. \n");
            } else {
                txtAction.append("You attemted to attack the air. \n    ...It did nothing \n");
            }
        } else if (pos4.isSelected()) {
            if (pos5.isSelected()) {
                txtAction.append("You attacked the enemy. \n");
            } else {
                txtAction.append("You attemted to attack the air. \n    ...It did nothing \n");
            }
        } else if (pos5.isSelected()) {
            if (pos6.isSelected()) {
                txtAction.append("You attacked the enemy. \n");
            } else {
                txtAction.append("You attemted to attack the air. \n    ...It did nothing \n");
            }
        } else if (pos6.isSelected()) {
            if (pos7.isSelected()) {
                txtAction.append("You attacked the enemy. \n");
            } else {
                txtAction.append("You attemted to attack the air. \n    ...It did nothing \n");
            }
        } else if (pos7.isSelected()) {
            if (pos8.isSelected()) {
                txtAction.append("You attacked the enemy. \n");
            } else {
                txtAction.append("You attemted to attack the air. \n    ...It did nothing \n");
            }
        } else if (pos8.isSelected()) {
            if (pos9.isSelected()) {
                txtAction.append("You attacked the enemy. \n");
            } else {
                txtAction.append("You attemted to attack the air. \n    ...It did nothing \n");
            }
        } else if (pos9.isSelected()) {
            if (pos10.isSelected()) {
                txtAction.append("You attacked the enemy. \n");
            } else {
                txtAction.append("You attemted to attack the air. \n    ...It did nothing \n");
            }
        } else if (pos10.isSelected()) {
            if (pos11.isSelected()) {
                txtAction.append("You attacked the enemy. \n");
            } else {
                txtAction.append("You attemted to attack the air. \n    ...It did nothing \n");
            }
        } else if (pos11.isSelected()) {
            if (pos12.isSelected()) {
                txtAction.append("You attacked the enemy. \n");
            } else {
                txtAction.append("You attemted to attack the air. \n    ...It did nothing \n");
            }
        } else if (pos12.isSelected()) {
            if (pos12.isSelected()) {
                txtAction.append("You attacked the enemy. \n");
            } else {
                txtAction.append("You attemted to attack the air. \n    ...It did nothing \n");
            }
        } else if (pos13.isSelected()) {
            if (pos14.isSelected()) {
                txtAction.append("You attacked the enemy. \n");
            } else {
                txtAction.append("You attemted to attack the air. \n    ...It did nothing \n");
            }
        } else if (pos14.isSelected()) {
            if (pos15.isSelected()) {
                txtAction.append("You attacked the enemy. \n");
            } else {
                txtAction.append("You attemted to attack the air. \n    ...It did nothing \n");
            }
        } else {
            txtAction.append("Can not move. \n");
        }
    }//GEN-LAST:event_btnAttackActionPerformed

    private void btnSpecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpecialActionPerformed
        // TODO add your handling code here:
        //Class based special move
    }//GEN-LAST:event_btnSpecialActionPerformed

    private void newGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameActionPerformed
        // TODO add your handling code here:
        pos1.setSelected(true);
        pos2.setSelected(false);
        pos3.setSelected(false);
        pos4.setSelected(false);
        pos5.setSelected(false);
        pos6.setSelected(false);
        pos7.setSelected(false);
        pos8.setSelected(false);
        pos9.setSelected(false);
        pos10.setSelected(false);
        pos11.setSelected(false);
        pos12.setSelected(false);
        pos13.setSelected(false);
        pos14.setSelected(false);
        pos15.setSelected(false);

        txtSelf.setText("");
        txtEnemy.setText("");
        txtAction.setText("");


    }//GEN-LAST:event_newGameActionPerformed

    private void summon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_summon1ActionPerformed
        // TODO add your handling code here:
        pos15.setSelected(true);
    }//GEN-LAST:event_summon1ActionPerformed

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
            java.util.logging.Logger.getLogger(DemoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DemoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DemoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DemoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DemoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem about;
    private javax.swing.JButton btnAttack;
    private javax.swing.JButton btnDefend;
    private javax.swing.JButton btnMove;
    private javax.swing.JButton btnSpecial;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenuItem howTo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JMenuItem login;
    private javax.swing.JMenuItem newGame;
    private javax.swing.JRadioButton pos1;
    private javax.swing.JRadioButton pos10;
    private javax.swing.JRadioButton pos11;
    private javax.swing.JRadioButton pos12;
    private javax.swing.JRadioButton pos13;
    private javax.swing.JRadioButton pos14;
    private javax.swing.JRadioButton pos15;
    private javax.swing.JRadioButton pos2;
    private javax.swing.JRadioButton pos3;
    private javax.swing.JRadioButton pos4;
    private javax.swing.JRadioButton pos5;
    private javax.swing.JRadioButton pos6;
    private javax.swing.JRadioButton pos7;
    private javax.swing.JRadioButton pos8;
    private javax.swing.JRadioButton pos9;
    private javax.swing.JMenuItem save;
    private javax.swing.JMenuItem summon1;
    private javax.swing.JMenuItem summon2;
    private javax.swing.JTextArea txtAction;
    private javax.swing.JTextArea txtEnemy;
    private javax.swing.JTextArea txtSelf;
    // End of variables declaration//GEN-END:variables

    private void playerMovement() {
        if (pos1.isSelected()) {
            if (!pos2.isSelected()) {
                pos1.setSelected(false);
                pos2.setSelected(true);
            } else {
                txtAction.append("The enemy is in the way. \n");
            }
        } else if (pos2.isSelected()) {
            if (!pos3.isSelected()) {
                pos2.setSelected(false);
                pos3.setSelected(true);
            } else {
                txtAction.append("The enemy is in the way. \n");
            }
        } else if (pos3.isSelected()) {
            if (!pos4.isSelected()) {
                pos3.setSelected(false);
                pos4.setSelected(true);
            } else {
                txtAction.append("The enemy is in the way. \n");
            }
        } else if (pos4.isSelected()) {
            if (!pos5.isSelected()) {
                pos4.setSelected(false);
                pos5.setSelected(true);
            } else {
                txtAction.append("The enemy is in the way. \n");
            }
        } else if (pos5.isSelected()) {
            if (!pos6.isSelected()) {
                pos5.setSelected(false);
                pos6.setSelected(true);
            } else {
                txtAction.append("The enemy is in the way. \n");
            }
        } else if (pos6.isSelected()) {
            if (!pos7.isSelected()) {
                pos6.setSelected(false);
                pos7.setSelected(true);
            } else {
                txtAction.append("The enemy is in the way. \n");
            }
        } else if (pos7.isSelected()) {
            if (!pos8.isSelected()) {
                pos7.setSelected(false);
                pos8.setSelected(true);
            } else {
                txtAction.append("The enemy is in the way. \n");
            }
        } else if (pos8.isSelected()) {
            if (!pos9.isSelected()) {
                pos8.setSelected(false);
                pos9.setSelected(true);
            } else {
                txtAction.append("The enemy is in the way. \n");
            }
        } else if (pos9.isSelected()) {
            if (!pos10.isSelected()) {
                pos9.setSelected(false);
                pos10.setSelected(true);
            } else {
                txtAction.append("The enemy is in the way. \n");
            }
        } else if (pos10.isSelected()) {
            if (!pos11.isSelected()) {
                pos10.setSelected(false);
                pos11.setSelected(true);
            } else {
                txtAction.append("The enemy is in the way. \n");
            }
        } else if (pos11.isSelected()) {
            if (!pos12.isSelected()) {
                pos11.setSelected(false);
                pos12.setSelected(true);
            } else {
                txtAction.append("The enemy is in the way. \n");
            }
        } else if (pos12.isSelected()) {
            if (!pos13.isSelected()) {
                pos12.setSelected(false);
                pos13.setSelected(true);
            } else {
                txtAction.append("The enemy is in the way. \n");
            }
        } else if (pos13.isSelected()) {
            if (!pos14.isSelected()) {
                pos13.setSelected(false);
                pos14.setSelected(true);
            } else {
                txtAction.append("The enemy is in the way. \n");
            }
        } else {
            txtAction.append("Can not move. \n");
        }

    }

    private void enemyReaction() {
        if (pos15.isSelected()) {
            if (!pos14.isSelected()) {
                pos15.setSelected(false);
                pos14.setSelected(true);
                txtAction.append("You see the enemy move forward. \n");
            } else {
                txtAction.append("You have been attacked. \n");

            }
        } else if (pos14.isSelected()) {
            if (!pos13.isSelected()) {
                pos14.setSelected(false);
                pos13.setSelected(true);
                txtAction.append("You see the enemy move forward. \n");
            } else {
                txtAction.append("You have been attacked. \n");
            }
        } else if (pos13.isSelected()) {
            if (!pos12.isSelected()) {
                pos14.setSelected(false);
                pos13.setSelected(true);
                txtAction.append("You see the enemy move forward. \n");
            } else {
                txtAction.append("You have been attacked. \n");
            }
        } else if (pos12.isSelected()) {
            if (!pos11.isSelected()) {
                pos12.setSelected(false);
                pos11.setSelected(true);
                txtAction.append("You see the enemy move forward. \n");
            } else {
                txtAction.append("You have been attacked. \n");
            }
        } else if (pos11.isSelected()) {
            if (!pos10.isSelected()) {
                pos11.setSelected(false);
                pos10.setSelected(true);
                txtAction.append("You see the enemy move forward. \n");
            } else {
                txtAction.append("You have been attacked. \n");
            }
        } else if (pos10.isSelected()) {
            if (!pos9.isSelected()) {
                pos10.setSelected(false);
                pos9.setSelected(true);
                txtAction.append("You see the enemy move forward. \n");
            } else {
                txtAction.append("You have been attacked. \n");
            }
        } else if (pos9.isSelected()) {
            if (!pos8.isSelected()) {
                pos9.setSelected(false);
                pos8.setSelected(true);
                txtAction.append("You see the enemy move forward. \n");
            } else {
                txtAction.append("You have been attacked. \n");
            }
        } else if (pos8.isSelected()) {
            if (!pos7.isSelected()) {
                pos8.setSelected(false);
                pos7.setSelected(true);
                txtAction.append("You see the enemy move forward. \n");
            } else {
                txtAction.append("You have been attacked. \n");
            }
        } else if (pos7.isSelected()) {
            if (!pos6.isSelected()) {
                pos7.setSelected(false);
                pos6.setSelected(true);
                txtAction.append("You see the enemy move forward. \n");
            } else {
                txtAction.append("You have been attacked. \n");
            }
        } else if (pos6.isSelected()) {
            if (!pos5.isSelected()) {
                pos6.setSelected(false);
                pos5.setSelected(true);
                txtAction.append("You see the enemy move forward. \n");
            } else {
                txtAction.append("You have been attacked. \n");
            }
        } else if (pos5.isSelected()) {
            if (!pos4.isSelected()) {
                pos5.setSelected(false);
                pos4.setSelected(true);
                txtAction.append("You see the enemy move forward. \n");
            } else {
                txtAction.append("You have been attacked. \n");
            }
        } else if (pos4.isSelected()) {
            if (!pos3.isSelected()) {
                pos4.setSelected(false);
                pos3.setSelected(true);
                txtAction.append("You see the enemy move forward. \n");
            } else {
                txtAction.append("You have been attacked. \n");
            }
        } else if (pos3.isSelected()) {
            if (!pos2.isSelected()) {
                pos3.setSelected(false);
                pos2.setSelected(true);
                txtAction.append("You see the enemy move forward. \n");
            } else {
                txtAction.append("You have been attacked. \n");
            }
        } else {

        }

    }
}
