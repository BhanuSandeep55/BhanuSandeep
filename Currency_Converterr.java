import javax.swing.*;
import java.awt.event.*;
public class Currency_Converterr {
  
   
    public static void converter()
    {
  
// Creating a new frame using JFrame
        JFrame f = new JFrame("CONVERTER");
  
// Creating two text fields.// One for t1 for user currency and t2 for resultant currency
       
        JTextField t1, t2;
        String country[]={"US Dollar","Rupees","Euro","Pound"};        
        JComboBox list11=new JComboBox(country);    
        list11.setBounds(50,50,90,20);  
        
        
        String country1[]={"US Dollar","Rupees","Euro","Pound"};        
        JComboBox list12=new JComboBox(country1);    
        list12.setBounds(210,50,90,20);  
// Creating buttons
        JButton b1,b2;
  
// Initializing the text fields with 0 by default and setting the
// bounds for the text fields
        t1 = new JTextField("0");
        t1.setBounds(150,50, 50, 30);
        t2 = new JTextField("0");
        t2.setBounds(310, 50, 50, 30);
  
       
// one button for the convert
// and one button to close
// and setting the bounds
        b1 = new JButton("CONVERT");
        b1.setBounds(150, 100, 160, 30);
        b2 = new JButton("close");
        b2.setBounds(150, 150, 160, 30);
  
// Adding action listener
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	
            	String s=""+list11.getItemAt(list11.getSelectedIndex());
                // Converting to double
            	String s1=""+list12.getItemAt(list12.getSelectedIndex());
            	double d;
// Dollar combinations
            	
            	if(s.equals("US Dollar"))
            	{
            		
            	  if(s1.equals("Rupees"))
            	  {
                    d= Double.parseDouble(t1.getText());
                    
                // Converting dollars to Rupees
                  double d1 = (d*76.50);
  
                // Getting the string value of the
                // calculated value
                String str1 = String.valueOf(d1);
  
                // Placing it in the text box
                t2.setText(str1.substring(0,5));
            	  }
            	  
            	  else if(s1.equals("Euro"))
            	  {
                    d= Double.parseDouble(t1.getText());
                    
                // Converting dollars to euro
                  double d1 = (d*0.93);
  
                // Getting the string value of the
                // calculated value
                String str1 = String.valueOf(d1);
  
                // Placing it in the text box
                t2.setText(str1.substring(0,4));
            	  }
            	  else if(s.equals("Pound"))
            	  {
                      d= Double.parseDouble(t1.getText());
                      
                  // Converting dollars to pound
                    double d1 = (d*0.77);
    
                  // Getting the string value of the
                  // calculated value
                  String str1 = String.valueOf(d1);
    
                  // Placing it in the text box
                  t2.setText(str1.substring(0,4));
              	  }
            	  else
            	  {
            		  d= Double.parseDouble(t1.getText());
                      
                      // Converting dollars to dollars
                        double d1 = (d);
        
                      // Getting the string value of the
                      // calculated value
                      String str1 = String.valueOf(d1);
        
                      // Placing it in the text box
                      t2.setText(str1.substring(0,4));
            	  }
               }
            	
 //Rupees Combinations 
            	
            	if(s.equals("Rupees"))
            	{
            		
            	  if(s1.equals("Pound"))
            	  {
                    d= Double.parseDouble(t1.getText());
                    
                // Converting Rupees to pound
                  double d1 = (d*0.01);
  
                // Getting the string value of the
                // calculated value
                String str1 = String.valueOf(d1);
  
                // Placing it in the text box
                t2.setText(str1.substring(0,4));
            	  }
            	  
            	  else if(s1.equals("Euro"))
            	  {
                    d= Double.parseDouble(t1.getText());
                    
                // Converting Rupees to Euro
                  double d1 = (d*0.012);
  
                // Getting the string value of the
                // calculated value
                String str1 = String.valueOf(d1);
  
                // Placing it in the text box
                t2.setText(str1.substring(0,4));
            	  }
            	  else if(s1.equals("US Dollar"))
            	  {
                      d= Double.parseDouble(t1.getText());
                      
                  // Converting Rupees to US Dollar
                    double d1 = (d*0.0132);
    
                  // Getting the string value of the
                  // calculated value
                  String str1 = String.valueOf(d1);
    
                  // Placing it in the text box
                  t2.setText(str1.substring(0,4));
              	  }
            	  else
            	  {
            		  d= Double.parseDouble(t1.getText());
                      
                      // Converting dollars to rupees
                        double d1 = (d);
        
                      // Getting the string value of the
                      // calculated value
                      String str1 = String.valueOf(d1);
        
                      // Placing it in the text box
                      t2.setText(str1.substring(0,3));
            	  }
               }
            	
//Pound Combibnations
            	 
            	
            	if(s.equals("Pound"))
            	{
            		
            	  if(s1.equals("Euro"))
            	  {
                    d= Double.parseDouble(t1.getText());
                    
                // Converting dollars to rupees
                  double d1 = (d*1.20);
  
                // Getting the string value of the
                // calculated value
                String str1 = String.valueOf(d1);
  
                // Placing it in the text box
                t2.setText(str1.substring(0,4));
            	  }
            	  
            	  else if(s1.equals("US Dollar"))
            	  {
                    d= Double.parseDouble(t1.getText());
                    
                // Converting dollars to rupees
                  double d1 = (d*1.30);
  
                // Getting the string value of the
                // calculated value
                String str1 = String.valueOf(d1);
  
                // Placing it in the text box
                t2.setText(str1.substring(0,4));
            	  }
            	  else if(s1.equals("Rupees"))
            	  {
                      d= Double.parseDouble(t1.getText());
                      
                  // Converting dollars to rupees
                    double d1 = (d*99.47);
    
                  // Getting the string value of the
                  // calculated value
                  String str1 = String.valueOf(d1);
    
                  // Placing it in the text box
                  t2.setText(str1.substring(0,4));
              	  }
            	  else
            	  {
            		  d= Double.parseDouble(t1.getText());
                      
                      // Converting dollars to rupees
                        double d1 = (d);
        
                      // Getting the string value of the
                      // calculated value
                      String str1 = String.valueOf(d1);
        
                      // Placing it in the text box
                      t2.setText(str1.substring(0,3));
            	  }
               }
//Euro Combinations
            	if(s.equals("Euro"))
            	{
            		
            	  if(s1.equals("Rupees"))
            	  {
                    d= Double.parseDouble(t1.getText());
                    
                // Converting dollars to rupees
                  double d1 = (d*82.65);
  
                // Getting the string value of the
                // calculated value
                String str1 = String.valueOf(d1);
  
                // Placing it in the text box
                t2.setText(str1.substring(0,4));
            	  }
            	  
            	  else if(s1.equals("US Dollar"))
            	  {
                    d= Double.parseDouble(t1.getText());
                    
                // Converting dollars to rupees
                  double d1 = (d*1.08);
  
                // Getting the string value of the
                // calculated value
                String str1 = String.valueOf(d1);
  
                // Placing it in the text box
                t2.setText(str1.substring(0,4));
            	  }
            	  else if(s1.equals("Pounds"))
            	  {
                      d= Double.parseDouble(t1.getText());
                      
                  // Converting dollars to rupees
                    double d1 = (d*0.83);
    
                  // Getting the string value of the
                  // calculated value
                  String str1 = String.valueOf(d1);
    
                  // Placing it in the text box
                  t2.setText(str1.substring(0,4));
              	  }
            	  else
            	  {
            		  d= Double.parseDouble(t1.getText());
                      
                      // Converting dollars to rupees
                        double d1 = (d);
        
                      // Getting the string value of the
                      // calculated value
                      String str1 = String.valueOf(d1);
        
                      // Placing it in the text box
                      t2.setText(str1.substring(0,3));
            	  }
               }
            }
        });
  
       
  
// Action listener to close the frame by  the close button
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                f.dispose();
            }
        });
  
// Default method for closing the frame by the cross button
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
  
        // Adding the created objects frame
        f.add(t1);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(list11);
        f.add(list12);
        f.setLayout(null);
        f.setSize(550,350);
        f.setVisible(true);
    }
  
 //Code execution starts here
    public static void main(String args[])
    {
        converter();
    }
}