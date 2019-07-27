/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialog;

import controller.ListAllController;
import entity.Course;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

/**
 *
 * @author MSI
 */
public class ListCourse extends javax.swing.JDialog {

    /**
     * Creates new form DisplayDialog
     */
    ListAllController control;
    
    public ListCourse(java.awt.Frame parent, boolean modal, ArrayList<Course> list) {
        super(parent, modal);
        initComponents();
        control = new ListAllController(this, list);
    }

    public JTextArea getAreaDisplay() {
        return areaDisplay;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new JLabel();
        jScrollPane1 = new JScrollPane();
        areaDisplay = new JTextArea();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("List of all courses (order by Credit)");

        areaDisplay.setEditable(false);
        areaDisplay.setColumns(20);
        areaDisplay.setFont(new Font("Consolas", 0, 14)); // NOI18N
        areaDisplay.setRows(5);
        jScrollPane1.setViewportView(areaDisplay);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel1)
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JTextArea areaDisplay;
    private JLabel jLabel1;
    private JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}