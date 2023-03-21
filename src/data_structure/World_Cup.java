
package data_structure;
import static com.sun.org.apache.regexp.internal.RETest.test;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.eclipse.persistence.internal.jpa.rs.metadata.model.Link;
import static org.eclipse.persistence.internal.sessions.coordination.corba.sun.CommandDataHelper.insert;
import static org.omg.CORBA.BooleanSeqHelper.insert;

public class World_Cup extends javax.swing.JFrame{

    String name , link;
    LinkedList vedio=new LinkedList();

public World_Cup() 
{
    initComponents();
    this.setLocationRelativeTo(null);
}         
          
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jFrame1 = new javax.swing.JFrame();
        jMenuItem1 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu1 = new javax.swing.JMenu();
        Play = new javax.swing.JButton();
        Insert = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        Name = new javax.swing.JLabel();
        Tname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Tlink = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        Next = new javax.swing.JButton();
        Update = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenuItem1.setText("jMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Play.setText("Play");
        Play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayActionPerformed(evt);
            }
        });

        Insert.setText("Insert");
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        Name.setText("Name");

        Tname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TnameActionPerformed(evt);
            }
        });

        jLabel3.setText("Link");

        Tlink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TlinkActionPerformed(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Play List"
            }
        ));
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        Next.setText("Next");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tname, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Play, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Tlink, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Next, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name)
                    .addComponent(Tname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Tlink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Next))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Play)
                    .addComponent(Insert)
                    .addComponent(Delete)
                    .addComponent(Search)
                    .addComponent(Update))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TlinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TlinkActionPerformed
    }//GEN-LAST:event_TlinkActionPerformed

    private void PlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayActionPerformed

        name=Tname.getText();
        try
        {
            Desktop.getDesktop().open(new File(link));
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "No Vedio");                 
        }                               
    }//GEN-LAST:event_PlayActionPerformed

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed

        name=Tname.getText();
        link=Tlink.getText();
        if(name.equals("") || link.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Invalid Insertion");           
        }
        else
        {
            vedio.insert(Tname.getText(), Tlink.getText());
            String data[]={Tname.getText()};
            DefaultTableModel Model=(DefaultTableModel) Table.getModel();
            Model.addRow(data);
            vedio.print();
            Tname.setText("");
            Tlink.setText("");
            JOptionPane.showMessageDialog(this, "Inserted");
        }       
    }//GEN-LAST:event_InsertActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel Model=(DefaultTableModel) Table.getModel();
        if(Table.getSelectedRowCount()==1)
        {
            String test=Model.getValueAt(Table.getSelectedRow(), 0).toString();
            Model.removeRow(Table.getSelectedRow());
            vedio.delete(test);
            JOptionPane.showMessageDialog(this, "Deleted");
            Tname.setText("");
            Tlink.setText("");
        }
        else if(Table.getSelectedRowCount()>1)
        {
            JOptionPane.showMessageDialog(this, "Select Single Row for Delete..");
        }
        vedio.print();       
    }//GEN-LAST:event_DeleteActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:   
        name=Tname.getText();
        if(name.equals(""))
            JOptionPane.showMessageDialog(this, "Enter Vedio Name");
        String test=vedio.search(name);
        if(test==null)
        {
            JOptionPane.showMessageDialog(this, "Not Found");
        }
        else
        {
            Tlink.setText(link);
            link=test;
            Update.setEnabled(true);
        }

    }//GEN-LAST:event_SearchActionPerformed

    private void TnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TnameActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_TnameActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel Model=(DefaultTableModel) Table.getModel();
        String name=Model.getValueAt(Table.getSelectedRow(), 0).toString();
        String test=vedio.search(name);
    }//GEN-LAST:event_TableMouseClicked

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        // TODO add your handling code here:
        vedio.next();
        Tname.setText("");
        Tlink.setText("");
    }//GEN-LAST:event_NextActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        name=Tname.getText();
        if(name.equals(""))
            JOptionPane.showMessageDialog(this, "Empty Name");
        else
        {
            vedio.update(name, link);
            JOptionPane.showMessageDialog(this, "Updated");
            Tname.setText("");
            Tlink.setText("");
        }
        vedio.print();
    }//GEN-LAST:event_UpdateActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(World_Cup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(World_Cup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(World_Cup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(World_Cup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                new World_Cup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton Insert;
    private javax.swing.JLabel Name;
    private javax.swing.JButton Next;
    private javax.swing.JButton Play;
    private javax.swing.JButton Search;
    private javax.swing.JTable Table;
    private javax.swing.JTextField Tlink;
    private javax.swing.JTextField Tname;
    private javax.swing.JButton Update;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
