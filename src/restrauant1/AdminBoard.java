

      package restrauant1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import resturant.manggment.system.Admin;
import resturant.manggment.system.Employee;
import resturant.manggment.system.myExceptions;

public class AdminBoard extends javax.swing.JFrame {

   
    public AdminBoard() {
        JMenuBar menuBar = new JMenuBar();
 
        
        
        //  Things that Admin Manage 
        
        JMenu employee = new JMenu("Employee");
        JMenu meals = new JMenu("Meals ");
        JMenu others = new JMenu("others");
        JMenuItem report = new JMenuItem("report");

 
        // All the inner items   
        
        JMenuItem Add = new JMenuItem("Add");
        JMenuItem Delate = new JMenuItem("Delete or update");
        JMenuItem List = new JMenuItem("List");
        JMenuItem Search = new JMenuItem("Search");
        JMenuItem AddM = new JMenuItem("add");
        JMenuItem delateM = new JMenuItem("delate");
        JMenuItem listM = new JMenuItem("list");
        JMenuItem searchM = new JMenuItem("search");

 
        //  3 main items elly gwa el menue 
        
        menuBar.add(employee);
        menuBar.add(meals);
        menuBar.add(others);
 
        //  Employee Actions 
        employee.add(Add);
        employee.add(Delate);
        employee.add(List);
        employee.add(Search);
 
       //Meals Actions 
        meals.add(AddM);
        meals.add(delateM);
        meals.add(listM);
        meals.add(searchM);
  
        others.add(report); 
    
 
        this.setJMenuBar(menuBar);
   // Employee Add 
        JPanel panel_E_add = new JPanel(null);
        panel_E_add.setBorder(BorderFactory.createTitledBorder("Add Employee"));
        panel_E_add.setBounds(50, 30, 290, 400);
 
        this.add(panel_E_add);
 
        // Panel items
        JLabel label1 = new JLabel("First Name");
        JLabel label2 = new JLabel("Last Name");
        JLabel label3 = new JLabel("ID");
        JLabel label4 = new JLabel("User Name");
        JLabel label7 = new JLabel("Address");
        JLabel label8 = new JLabel("Password");
        JTextField field1 = new JTextField();
        JTextField field2 = new JTextField();
        JTextField field3 = new JTextField();
        JTextField field4 = new JTextField();
        JTextField field7 = new JTextField();
        JPasswordField field8 = new JPasswordField();
        JComboBox comboBox = new JComboBox(new String[]{ "Male", "Female"});
        JButton button = new JButton("Add User");
 
        // Panel  item Position
        label1.setBounds(30, 50, 100, 25);
        label2.setBounds(30, 90, 100, 25);
        label3.setBounds(30, 130, 100, 25);
        label4.setBounds(30, 170, 100, 25);
        label7.setBounds(30, 210, 100, 25);
        label8.setBounds(30, 250, 100, 25);
        field1.setBounds(120, 50, 130, 25);
        field2.setBounds(120, 90, 130, 25);
        field3.setBounds(120, 130, 130, 25);
        field4.setBounds(120, 170, 130, 25);
        field7.setBounds(120, 210, 130, 25);
        field8.setBounds(120, 250, 130, 25);
        comboBox.setBounds(120, 290, 130, 25);
        button.setBounds(120, 330, 130, 25);
 
        // 
        panel_E_add.add(label1);
        panel_E_add.add(label2);
        panel_E_add.add(label3);
        panel_E_add.add(label4);
        panel_E_add.add(label7);
        panel_E_add.add(label8);
        panel_E_add.add(field1);
        panel_E_add.add(field2);
        panel_E_add.add(field3);
        panel_E_add.add(field4);
        panel_E_add.add(field7);
        panel_E_add.add(field8);
        panel_E_add.add(comboBox);
        panel_E_add.add(button);
 
        /////////////// Delate
      
         // ? ????? ?? ???? ? ????? Layout Manager ?? ?????? ?? Panel ??? ???? ??????
        JPanel panel2 = new JPanel(null);
        panel2.setBorder(BorderFactory.createTitledBorder("Search Employee"));
        panel2.setBounds(50, 30, 290, 400);
 
        // Frame ?? ??? Panel ??? ????? ???
        this.add(panel2);
 
        // Panel ??? ???? ?????? ???? ??????? ???? ?????? ?? ???
        JButton buttonsearch0 = new JButton("Search");
        JLabel label11 = new JLabel("First Name");
        JLabel label22= new JLabel("Last Name");
        JLabel label33 = new JLabel("ID");
        JLabel label44 = new JLabel("Username");
        JLabel label55 = new JLabel("Gender");
        JTextField field0 = new JTextField();
        JTextField field11 = new JTextField();
        JTextField field22= new JTextField();
        JTextField field33 = new JTextField();
        JTextField field44 = new JTextField();
        JComboBox comboBox0 = new JComboBox(new String[]{ "Male", "Female"});
        JButton button0 = new JButton("Delete");
        JButton buttonupdate0 = new JButton("Update");
 
        // Panel ??? ???? ?????? ???? ?? ??? ?????? ????? ???
        buttonsearch0.setBounds(30, 50, 80, 25);
        label11.setBounds(30, 90, 100, 25);
        label22.setBounds(30, 130, 100, 25);
        label33.setBounds(30, 170, 100, 25);
        label44.setBounds(30, 210, 100, 25);
        label55.setBounds(30, 250, 100, 25);
        field0.setBounds(120, 50, 135, 25);
        field11.setBounds(120, 90, 130, 25);
        field22.setBounds(120, 130, 130, 25);
        field33.setBounds(120, 170, 130, 25);
        field44.setBounds(120, 210, 130, 25);
        comboBox0.setBounds(120, 250, 130, 25);
        button0.setBounds(120, 285, 130, 25);
        buttonupdate0.setBounds(120, 310, 130, 25);
 
        // Panel ?? ??? Buttons ??? ???? ???? ???
        panel2.add(buttonsearch0);
        panel2.add(label11);
        panel2.add(label22);
        panel2.add(label33);
        panel2.add(label44);
        panel2.add(label55);
        panel2.add(field0);
        panel2.add(field11);
        panel2.add(field22);
        panel2.add(field33);
        panel2.add(field44);
        panel2.add(comboBox0);
        panel2.add(button0);
        panel2.add(buttonupdate0);
        
        
        // List option 
        
//            String columns[] = {"ID", "First Name", "Last Name"};     
//        String data[][] = {                                       
//            {"1", "Mhamad", "Harmush" },
//            {"2", "Ahmad", "Mousally" },
//            {"3", "Hala", "Hassan" },
//            {"4", "Rim", "Al Mouhandes" },
//            {"5", "Said", "Al Kurdy" },
//            {"6", "Abdullah", "Saadi" },
//            {"7", "Ibrahim", "Marhaba" },
//            {"8", "Omar", "El Koussa" },
//            {"9", "Riad", "Asaad" },
//            {"10", "Rawan", "Hoblos" },
//            {"11", "magdy", "bassant" },
//            {"12", "nasser", "asmaa" },
//            {"13", "essam", "sara" },
//            {"14", "ragb", "Abdelrahman" },
//            {"14", "ahmed", "fady" }
//            
//           
//        };
// 
//        DefaultTableModel model = new DefaultTableModel();       
//        model.setDataVector(data, columns);                      
//        JTable table = new JTable(model);                        
//        JScrollPane tableScroller= new JScrollPane(table);       
// 
//        tableScroller.setBounds(50, 30, 290, 400);  
//        
//
//          this.setResizable(false);  
//          this.setLayout(null);
//         
//        this.add(tableScroller);
        
        /// Delate w serach meal 
         JPanel mmpanel = new JPanel(null);
        mmpanel.setBorder(BorderFactory.createTitledBorder("dealte & Serach for meal "));
        mmpanel.setBounds(50, 30, 290, 400);
 
        // Frame ?? ??? Panel ??? ????? ???
        this.add(mmpanel);
 
        // Panel ??? ???? ?????? ???? ??????? ???? ?????? ?? ???
        JButton buttonsearch = new JButton("Search");
        JLabel mmlabel1 = new JLabel("First Name");
        JLabel mmlabel2 = new JLabel("Last Name");
        JLabel mmlabel3 = new JLabel("ID");
        JLabel mmlabel4 = new JLabel("Username");
        JLabel mmlabel5 = new JLabel("Gender");
        JTextField mmfield = new JTextField();
        JTextField mmfield1 = new JTextField();
        JTextField mmfield2 = new JTextField();
        JTextField mmfield3 = new JTextField();
        JTextField mmfield4 = new JTextField();
        JComboBox mmcomboBox = new JComboBox(new String[]{ "Male", "Female"});
        JButton mmbutton = new JButton("Delete");
        JButton mmbuttonupdate = new JButton("Update");
 
        // Panel ??? ???? ?????? ???? ?? ??? ?????? ????? ???
        buttonsearch.setBounds(30, 50, 80, 25);
        mmlabel1.setBounds(30, 90, 100, 25);
        mmlabel2.setBounds(30, 130, 100, 25);
        mmlabel3.setBounds(30, 170, 100, 25);
        mmlabel4.setBounds(30, 210, 100, 25);
        mmlabel5.setBounds(30, 250, 100, 25);
        mmfield.setBounds(120, 50, 135, 25);
        mmfield1.setBounds(120, 90, 130, 25);
        mmfield2.setBounds(120, 130, 130, 25);
        mmfield3.setBounds(120, 170, 130, 25);
        mmfield4.setBounds(120, 210, 130, 25);
        mmcomboBox.setBounds(120, 250, 130, 25);
        mmbutton.setBounds(120, 285, 130, 25);
        mmbuttonupdate.setBounds(120, 310, 130, 25);
 
        // Panel ?? ??? Buttons ??? ???? ???? ???
        mmpanel.add(buttonsearch);
        mmpanel.add(mmlabel1);
        mmpanel.add(mmlabel2);
        mmpanel.add(mmlabel3);
        mmpanel.add(mmlabel4);
        mmpanel.add(mmlabel5);
        mmpanel.add(mmfield);
        mmpanel.add(mmfield1);
        mmpanel.add(mmfield2);
        mmpanel.add(mmfield3);
        mmpanel.add(mmfield4);
        mmpanel.add(mmcomboBox);
        mmpanel.add(mmbutton);
        mmpanel.add(mmbuttonupdate);
        
     
        // start of adding meal 
        // Meal  Add 
        JPanel mpanel_E_add = new JPanel(null);
        mpanel_E_add.setBorder(BorderFactory.createTitledBorder("Add Meal"));
        mpanel_E_add.setBounds(50, 30, 290, 300);
 
        this.add(mpanel_E_add);
 
        // Panel items
        JLabel amlabel1 = new JLabel("Meal Name ");
        JLabel amlabel2 = new JLabel("Price");
        JLabel amlabel3 = new JLabel("ID");
       
        JTextField amfield1 = new JTextField();
        JTextField amfield2 = new JTextField();
        JTextField amfield3 = new JTextField();
        JButton ambutton = new JButton("Add Meal");
 
        // Panel  item Position
        amlabel1.setBounds(30, 50, 100, 25);
        amlabel2.setBounds(30, 90, 100, 25);
        amlabel3.setBounds(30, 130, 100, 25);
        
        amfield1.setBounds(120, 50, 130, 25);
        amfield2.setBounds(120, 90, 130, 25);
        amfield3.setBounds(120, 130, 130, 25);
        
        ambutton.setBounds(120, 255, 130, 25);
 
        // Panel ?? ??? Buttons ??? ???? ???? ???
        mpanel_E_add.add(amlabel1);
        mpanel_E_add.add(amlabel2);
        mpanel_E_add.add(amlabel3);
       
        mpanel_E_add.add(amfield1);
        mpanel_E_add.add(amfield2);
        mpanel_E_add.add(amfield3);
        
        mpanel_E_add.add(ambutton);
       
   
          
        initComponents();
        
                 // start background
          this.setSize(500,500);
          ImageIcon  image ; 
          JLabel labe ; 
          image = new ImageIcon(getClass().getResource("background.jpg")); 
          labe = new JLabel(image);
          labe.setBounds(0, 0, 500, 500);
          this.add(labe); 
          this.setResizable(false);  
          this.setLayout(null);
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          this.setVisible(true); 
          this.setLocationRelativeTo(null);    
          // End background
          
          // Hidding Pannels 
            panel_E_add.setVisible(false);
            panel2.setVisible(false);
            mpanel_E_add.setVisible(false);
           // table.setVisible(false);
             mmpanel.setVisible(false);
          // Actions   
            Add.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                 panel_E_add.setVisible(true);
                 panel2.setVisible(false);
                 //table.setVisible(false);
                 mmpanel.setVisible(false);
                 mpanel_E_add.setVisible(false);


              }
          });
                Delate.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
               //   table.setVisible(false);
                 panel_E_add.setVisible(false);
                 panel2.setVisible(true);
                 mmpanel.setVisible(false);
                 mpanel_E_add.setVisible(false);


              }
          });
                       Search.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  //table.setVisible(false);
                 panel_E_add.setVisible(false);
                 panel2.setVisible(true);
                mmpanel.setVisible(false);
                 mpanel_E_add.setVisible(false);


              }
          });
            List.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  
                 panel_E_add.setVisible(false);
                 panel2.setVisible(false);
                 //table.setVisible(true); 
                 mmpanel.setVisible(false); 
                 mpanel_E_add.setVisible(false);

                 

              }
          });
                  delateM.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  
                 panel_E_add.setVisible(false);
                 panel2.setVisible(false);
                // table.setVisible(true); 
                 mmpanel.setVisible(true);  
                 mpanel_E_add.setVisible(false);


              }
          });
                      searchM.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  
                 panel_E_add.setVisible(false);
                 panel2.setVisible(false);
                 //table.setVisible(true); 
                 mmpanel.setVisible(true);
                 mpanel_E_add.setVisible(false);

              }
          });
                      
                           AddM.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
               //   table.setVisible(false);
                 panel_E_add.setVisible(false);
                 panel2.setVisible(false);
                 mmpanel.setVisible(false);
                  mpanel_E_add.setVisible(true);
              }
          });
            
             button.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  Admin admin= new Admin();
                  Employee employee= new Employee();
                  myExceptions ex=new myExceptions();
                
               
                  if(employee.search_employee(Integer.parseInt(field3.getText()))==null){
                    int  validation1=0; int validation2=0;  int validation3=0;
                    
                       if(ex.CheckPassword(field8.getText())==false){ validation1=1;}
                       if(ex.CheckPostive(field3.getText())==false){ validation2=1;}
                       if(ex.Checkmail(field4.getText())==false){validation3=1;}

             if(employee.search_employee(Integer.parseInt(field3.getText()))==null){

              if(validation1==1){JOptionPane.showMessageDialog(null, " Invalid password!");}
             if(validation2==1){JOptionPane.showMessageDialog(null, "ID must be positive!");}
             if(validation3==1){JOptionPane.showMessageDialog(null, "Invalid Mail!");}
             }
             
              if(validation1==0&&validation2==0&&validation3==0){
               admin.addNewEmployee(field1.getText()+field2.getText(),Integer.parseInt(field3.getText()), field4.getText(), field7.getText(), field8.getText());
                  field1.setText("");field2.setText("");field3.setText("");field4.setText("");field7.setText("");field8.setText("");
                          JOptionPane.showMessageDialog(null, "added Succesfuly!");
              }
                   }
                  
                      else{
                          JOptionPane.showMessageDialog(null, "added Before");
                           }
                          
                      
                 
              }
          });
              
            buttonsearch0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Admin admin=new Admin();
                Employee employee=new Employee();
employee=admin.searchForEmployee(Integer.parseInt(field0.getText()));

                //بوكس السيرش
                
                field0.getText();
                //first name
                field11.setText(employee.getName());
                //last name
                field22.setText("Ragab");
                //id
                field33.setText(String.valueOf(employee.getId()));
                //username
                field44.setText(employee.getUsername());
                //
               // field55.getText();
            }
        });
            
        mmbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Admin admin=new Admin();
                admin.deleteEmployee(Integer.parseInt(field33.getText()));
                 field0.setText("");field11.setText("");field22.setText("");field33.setText("");field44.setText("");
                          JOptionPane.showMessageDialog(null, "Deleted Succesfuly!");

                
                
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        mmbuttonupdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Admin admin=new Admin();
                Employee employee=new Employee();
               employee= admin.searchForEmployee(Integer.parseInt(field33.getText()));
                admin.updateEmployee(Integer.parseInt(field33.getText()),employee);
                 field0.setText("");field11.setText("");field22.setText("");field33.setText("");field44.setText("");
                          JOptionPane.showMessageDialog(null, "Updatesd Succesfuly!");
                
                
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
    }

  
      
                     
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
























                 
      
