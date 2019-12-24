
package restrauant1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import resturant.manggment.system.Employee;

public class EmployeeLog extends javax.swing.JFrame {

   
    public EmployeeLog() {

         JLabel nameLabel = new JLabel("Name");    
        JTextField name = new JTextField();                 
        JLabel passLabel = new JLabel("Password");                     
        JPasswordField passField = new JPasswordField();          
        JButton log = new JButton("LogIn");  
        JLabel user_info = new JLabel();                         
 
        
        nameLabel.setBounds(40, 40, 100, 300);                             
        name.setBounds(150, 180, 150, 30); 
        
        passLabel.setBounds(40, 100, 100, 305);                           
        passField.setBounds(150, 230, 150, 30);                      
 
        log.setBounds(150, 290, 150, 30);                   
        user_info.setBounds(150, 220, 300, 30);                     
 
        
        
        this.add(nameLabel);                                             
        this.add(name);                                       
        this.add(passLabel);                                             
        this.add(passField);                                       
        this.add(log);                                     
        this.add(user_info);   
        initComponents();
        
         // start background
        this.setSize(500,500);
          ImageIcon  image ; 
          JLabel label1 ; 
          image = new ImageIcon(getClass().getResource("background.jpg")); 
          label1 = new JLabel(image);
          label1.setBounds(0, 0, 500, 500);
         this.add(label1); 
          this.setResizable(false);  
          this.setLayout(null);
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          this.setVisible(true); 
          this.setLocationRelativeTo(null);    
          // End background 
          
           log.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  Employee employee=new Employee();
                  if(employee.login(name.getText(), passField.getText())){
                  new EmployeeBoard();
                  dispose();}
                   else{
                 JOptionPane.showMessageDialog(null, "Invalid UserName or Password");

                  }
              }
          });
          
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(EmployeeLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeLog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeLog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
