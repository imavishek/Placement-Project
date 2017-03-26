/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placement_project;

import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.Format;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static placement_project.Student_Details.pst;

/**
 *
 * @author Avishek
 */
public class Eligible_Student extends javax.swing.JFrame {

    /**
     * Creates new form Eligible_Student
     */
    static Connection con = null;
    static PreparedStatement pst = null;
    ImageIcon img = new ImageIcon("/Debian/PROJECTS/NETBEANS/placement_project/src/placement_project/1.jpg");

    public Eligible_Student() {
        initComponents();
        con = Connection_Provider.getOracleConnection();
        getContentPane().setBackground(Color.PINK);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Search Eligible Student");
        setIconImage(img.getImage());
        setLocation(new java.awt.Point(438, 96));
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("BRANCH :-");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Eligible 10th % :-");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Eligible 12th % :-");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Eligible CGPA :-");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("BACKLOG :-");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "branch", "ALL BRANCH", "CSE", "ME", "EE", "CIVIL", "IT", "I&E", "FT" }));

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cgpa", "0", "5.0", "5.1", "5.2", "5.3", "5.4", "5.5", "5.6", "5.7", "5.8", "5.9", "6.0", "6.1", "6.2", "6.3", "6.4", "6.5", "6.6", "6.7", "6.8", "6.9", "7.0", "7.1", "7.2", "7.3", "7.4", "7.5", "7.6", "7.7", "7.8", "7.9", "8.0", "8.1", "8.2", "8.3", "8.4", "8.5", "8.6", "8.7", "8.8", "8.9", "9.0", "9.1", "9.2", "9.3", "9.4", "9.5", "9.6", "9.7", "9.8", "9.9", "10.0" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "backlog", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("BATCH :-");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(52, 52, 52))
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(74, 74, 74))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(89, 89, 89)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(110, 110, 110)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField1)
                                .addComponent(jTextField2)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, 130, Short.MAX_VALUE))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jButton1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int batch = Integer.parseInt((String) jComboBox5.getSelectedItem());
        String branch = jComboBox2.getSelectedItem().toString();
        String ten = jTextField1.getText();
        String twelve = jTextField2.getText();
        String cgpa = jComboBox3.getSelectedItem().toString();
        String back = jComboBox4.getSelectedItem().toString();

        if (batch == 0) {
            JOptionPane.showMessageDialog(rootPane, "Enter Batch ...", "Search Eligible Student", JOptionPane.ERROR_MESSAGE);
        } else if (branch.equals("branch")) {
            JOptionPane.showMessageDialog(rootPane, "Enter Branch ...", "Search Eligible Student", JOptionPane.ERROR_MESSAGE);
        } else if (ten.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Enter Eligible 10th % ...", "Search Eligible Student", JOptionPane.ERROR_MESSAGE);
        } else if (twelve.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Enter Eligible 12th % ...", "Search Eligible Student", JOptionPane.ERROR_MESSAGE);
        } else if (cgpa.equals("cgpa")) {
            JOptionPane.showMessageDialog(rootPane, "Enter Eligible CGPA ...", "Search Eligible Student", JOptionPane.ERROR_MESSAGE);
        } else if (back.equals("backlog")) {
            JOptionPane.showMessageDialog(rootPane, "Enter Eligible BACKLOG ...", "Search Eligible Student", JOptionPane.ERROR_MESSAGE);
        } else if (branch.equals("ALL BRANCH")) {
            String[] columnNames = {"REGD_NO", "NAME", "GENDER","BRANCH", "DOB", "EMAIL", "MOB"};

            JFrame frame1 = new JFrame("Student Details");
            frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
             frame1.setTitle("Eligible Student");
        frame1.setIconImage(img.getImage());
        
            JButton button = new JButton("SAVE AS PDF");
        button.setFont(new Font("Tahoma", Font.BOLD, 14));
        button.setBackground(Color.DARK_GRAY);
        button.setForeground(Color.GREEN);

            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(columnNames);

            JTable table = new JTable() {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            table.setModel(model);
            table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            table.setFillsViewportHeight(true);
            table.setForeground(Color.red);
            //table.setSelectionBackground(Color.green);

            JScrollPane scroll = new JScrollPane(table);
            scroll.setHorizontalScrollBarPolicy(
                    JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            scroll.setVerticalScrollBarPolicy(
                    JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
            
            
        int regd1 ;
        String name1 = "";
        String gender1 = "";
        String branch1 = "";
        String dob1 = "";
        String email1 = "";
        Long mob1;
            
         try {
            pst = con.prepareStatement("select regd_no,name,gender,branch,dob,email,mob from placement where batch=? and ten>=? and twelve>=? and cgpa>=? and back<=?");
            pst.setInt(1, batch);
            pst.setFloat(2, Float.parseFloat(ten));
            pst.setFloat(3, Float.parseFloat(twelve));
            pst.setFloat(4, Float.parseFloat(cgpa));
            pst.setInt(5, Integer.parseInt(back));
            ResultSet rs = pst.executeQuery();
            int i = 0;
            while (rs.next()) {
                regd1 = rs.getInt(1);
                name1 = rs.getString(2);
                gender1 = rs.getString(3);
                branch1 = rs.getString(4);
                Format formatter = new SimpleDateFormat("dd-MM-yyyy");
                String s = formatter.format(rs.getDate(5)); 
                dob1 = s;
                email1 = rs.getString(6);
                mob1= rs.getLong(7);

                model.addRow(new Object[]{regd1, name1, gender1, branch1, dob1, email1, mob1});
                i++;
            }
            if (i < 1) {
                JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);

            } else {
                ActionListener printAction = new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        try {
                            int count=table.getRowCount();
                            Document document=new Document();
                            PdfWriter.getInstance(document,new FileOutputStream("/Debian/PROJECTS/NETBEANS/placement_project/pdf/Eligible_Student/ALL BRANCH/data.pdf"));
                            document.open();
                            PdfPTable tab=new PdfPTable(7);
                            tab.addCell("REGD_NO");
                            tab.addCell("NAME");
                            tab.addCell("GENDER");                           
                            tab.addCell("BRANCH");
                            tab.addCell("DOB");
                            tab.addCell("EMAIL");
                            tab.addCell("MOB");   
                            System.out.println("");
                            for(int i=0;i<count;i++){
                            Object obj1 = GetData(table, i, 0);
                            Object obj2 = GetData(table, i, 1);
                            Object obj3 = GetData(table, i, 2);
                            Object obj4 = GetData(table, i, 3);
                            Object obj5 = GetData(table, i, 4);
                            Object obj6 = GetData(table, i, 5);
                            Object obj7 = GetData(table, i, 6);
                            
                            
                            String value1=obj1.toString();
                            String value2=obj2.toString();
                            String value3=obj3.toString();
                            String value4=obj4.toString();
                            String value5=obj5.toString();
                            String value6=obj6.toString();
                            String value7=obj7.toString();
                           

                            tab.addCell(value1);
                            tab.addCell(value2);
                            tab.addCell(value3);
                            tab.addCell(value4);
                            tab.addCell(value5);
                            tab.addCell(value6);
                            tab.addCell(value7);
                            
        
                            }
                            document.add(tab);
                            
                            document.close();
                            JOptionPane.showMessageDialog(rootPane, "Saved As Pdf", "Eligible_Student_Details", JOptionPane.INFORMATION_MESSAGE);
                        } catch (Exception pe) {
                            System.err.println("Error printing: " + pe.getMessage());
                        }
                    }
                };
                button.addActionListener(printAction);

                frame1.setIconImage(img.getImage());
                frame1.add(scroll, BorderLayout.CENTER);
                frame1.add(button, BorderLayout.NORTH);
                // frame1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                frame1.setSize(1280, 750);
                frame1.setResizable(false);
                frame1.setVisible(true);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }                                          
        
       else {
               String[] columnNames = {"REGD_NO", "NAME", "GENDER","BRANCH", "DOB", "EMAIL", "MOB"};

            JFrame frame1 = new JFrame("Student Details");
            frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            frame1.setTitle("Eligible Student");
        frame1.setIconImage(img.getImage());
        
            JButton button = new JButton("SAVE AS PDF");
        button.setFont(new Font("Tahoma", Font.BOLD, 14));
        button.setBackground(Color.DARK_GRAY);
        button.setForeground(Color.GREEN);

            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(columnNames);

            JTable table = new JTable() {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            table.setModel(model);
            table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            table.setFillsViewportHeight(true);
            table.setForeground(Color.red);
            //table.setSelectionBackground(Color.green);

            JScrollPane scroll = new JScrollPane(table);
            scroll.setHorizontalScrollBarPolicy(
                    JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            scroll.setVerticalScrollBarPolicy(
                    JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
            
            
        int regd1 ;
        String name1 = "";
        String gender1 = "";
        String branch1 = "";
        String dob1 = "";
        String email1 = "";
        
        Long mob1;
            
         try {
            pst = con.prepareStatement("select regd_no,name,gender,branch,dob,email,mob from placement where batch=? and branch=? and ten>=? and twelve>=? and cgpa>=? and back<=?");
            pst.setInt(1, batch);
            pst.setString(2, branch);
            pst.setFloat(3, Float.parseFloat(ten));
            pst.setFloat(4, Float.parseFloat(twelve));
            pst.setFloat(5, Float.parseFloat(cgpa));
            pst.setInt(6, Integer.parseInt(back));
            ResultSet rs = pst.executeQuery();
            int i = 0;
            while (rs.next()) {
                regd1 = rs.getInt(1);
                name1 = rs.getString(2);
                gender1 = rs.getString(3);
                branch1 = rs.getString(4);
                
                Format formatter = new SimpleDateFormat("dd-MM-yyyy");
                String s = formatter.format(rs.getDate(5)); 
                dob1 = s;
                email1 = rs.getString(6);
                mob1= rs.getLong(7);

                model.addRow(new Object[]{regd1, name1, gender1, branch1, dob1, email1, mob1});
                i++;
            }
            if (i < 1) {
                JOptionPane.showMessageDialog(null, "No Record Found", "Error", JOptionPane.ERROR_MESSAGE);

            } else {
               ActionListener printAction;
                printAction = new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        try {
                            int count=table.getRowCount();
                            Document document=new Document();
                            PdfWriter.getInstance(document,new FileOutputStream("/Debian/PROJECTS/NETBEANS/placement_project/pdf/Eligible_Student/branch_data.pdf"));
                            document.open();
                            PdfPTable tab=new PdfPTable(7);
                            tab.addCell("REGD_NO");
                            tab.addCell("NAME");
                            tab.addCell("GENDER");                           
                            tab.addCell("BRANCH");
                            tab.addCell("DOB");
                            tab.addCell("EMAIL");
                            tab.addCell("MOB");   
                            System.out.println("");
                            for(int i=0;i<count;i++){
                                Object obj1 = GetData(table, i, 0);
                                Object obj2 = GetData(table, i, 1);
                                Object obj3 = GetData(table, i, 2);
                                Object obj4 = GetData(table, i, 3);
                                Object obj5 = GetData(table, i, 4);
                                Object obj6 = GetData(table, i, 5);
                                Object obj7 = GetData(table, i, 6);
                                
                                
                                String value1=obj1.toString();
                                String value2=obj2.toString();
                                String value3=obj3.toString();
                                String value4=obj4.toString();
                                String value5=obj5.toString();
                                String value6=obj6.toString();
                                String value7=obj7.toString();
                                
                                
                                tab.addCell(value1);
                                tab.addCell(value2);
                                tab.addCell(value3);
                                tab.addCell(value4);
                                tab.addCell(value5);
                                tab.addCell(value6);
                                tab.addCell(value7);
                                
                                
                            }
                            document.add(tab);
                            
                            document.close();
                            JOptionPane.showMessageDialog(rootPane, "Saved As Pdf", "Eligible_Student_Details", JOptionPane.INFORMATION_MESSAGE);
                        
                        } catch (Exception pe) {
                            System.err.println("Error printing: " + pe.getMessage());
                        }
                    }
                };
                button.addActionListener(printAction);

                frame1.setIconImage(img.getImage());
                frame1.add(scroll, BorderLayout.CENTER);
                frame1.add(button, BorderLayout.NORTH);
                // frame1.setExtendedState(JFrame.MAXIMIZED_BOTH);
                frame1.setSize(1280, 750);
                frame1.setResizable(false);
                frame1.setVisible(true);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
        char vChar = evt.getKeyChar(); 
        if (!(Character.isDigit(vChar) 
                || (vChar == KeyEvent.VK_BACK_SPACE) 
                || (vChar == KeyEvent.VK_DELETE))) 
        {
            evt.consume(); 
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
        char vChar = evt.getKeyChar(); 
        if (!(Character.isDigit(vChar) 
                || (vChar == KeyEvent.VK_BACK_SPACE) 
                || (vChar == KeyEvent.VK_DELETE))) 
        {
            evt.consume(); 
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    
    public Object GetData(JTable table, int row_index, int col_index){
return table.getModel().getValueAt(row_index, col_index);
}
    
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
            java.util.logging.Logger.getLogger(Eligible_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eligible_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eligible_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eligible_Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eligible_Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}