import javax.swing.*;
public class CollegeFeeCalculator {
    
    /**
 * CS 180 - Lab 08 - CollegeFeeCalculator
 * 
 * (Brief description of the class file)
 * 
 * @ Shreyaansh Bassi sbassi@purdue.edu
 * 
 * @lab08
 *
 * @date (November 5th 2014)
 */
    
    public static void main(String[] args) {
        int c = 1;
        do {
            try {
                int totalfee = 0;
                int tuition = 0;
                int expense = 0;
                JOptionPane.showMessageDialog (null, "Welcome to CollegeFeeCalculator!",
                                               "CollegeFeeCalculator", JOptionPane.INFORMATION_MESSAGE);
                
                String name = JOptionPane.showInputDialog(null,"Please enter your name, then press OK",
                                                          "Name", JOptionPane.QUESTION_MESSAGE);
                if(name == null||name.equals("")){
                    break;
                }
                
                
                String[] a = {"Part-time", "Full-time"};
                int choice = JOptionPane.showOptionDialog(null, "Please select your enrollment", 
                                                          "Enrollment",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, a, a[0]);
                
                
                String numcredits = JOptionPane.showInputDialog(null,"Please enter the no. of credit hours, then press OK",
                                                                "Credit Hours", JOptionPane.QUESTION_MESSAGE);
                int credits = Integer.parseInt(numcredits);
                
                while(!((a[choice].equals("Part-time") && credits < 8)||(a[choice].equals("Full-time") && credits >= 8))){
                    
                    JOptionPane.showMessageDialog (null, "Please enter valid credit hours for the current enrollment",
                                                   "Invalid no. of credits", JOptionPane.ERROR_MESSAGE);
                    numcredits = JOptionPane.showInputDialog(null,"Please enter the no. of credit hours, then press OK",
                                                             "Credit Hours", JOptionPane.INFORMATION_MESSAGE);
                    credits = Integer.parseInt(numcredits);
                    
                    
                    
                }
                String[] residency = {"In-state", "Out-of-state", "International"};
                
                String resichoice = (String)JOptionPane.showInputDialog(null, "Please select the appropriate residency", "Residency", 
                                                                        JOptionPane.QUESTION_MESSAGE, null, residency, residency[0]);
                if(resichoice == null){
                    break;
                }
                
                String[] state = {"ON-Campus", "OFF-Campus"};
                
                String statechoice = (String)JOptionPane.showInputDialog(null, "Please select your housing", "Housing", 
                                                                         JOptionPane.QUESTION_MESSAGE, null, state, state[0]);
                String resihallchoice = "";
                if(statechoice.equals("ON-Campus")) {
                    
                    String[] resihall = {"Earhart", "Hillenbrand", "Owen", "Windsor"};
                    
                    resihallchoice = (String)JOptionPane.showInputDialog(null, "Please select the residence hall", "Residence-Hall", 
                                                                         JOptionPane.QUESTION_MESSAGE, null, resihall, resihall[0]);
                }
                
                if(a[choice].equals("Full-time")) {
                    if(resichoice.equals("In-state"))
                        tuition = 4996;
                    if(resichoice.equals("Out-of-state"))
                        tuition = 4996 + 9401;
                    if(resichoice.equals("International"))
                        tuition = 4996 + 9401 + 1000;
                }
                
                else if(a[choice].equals("Part-time")) {
                    if(resichoice.equals("In-state"))
                        tuition = 350 * credits;
                    if(resichoice.equals("Out-of-state"))
                        tuition = (350 + 600) * credits;
                    if(resichoice.equals("International"))
                        tuition = (350 + 600 + 70) * credits;
                }
                if(statechoice.equals("OFF-Campus")) 
                    expense = 0;
                else {
                    if(resihallchoice.equals("Earhart"))
                        expense = 4745;
                    if(resihallchoice.equals("Hillenbrand"))
                        expense = 5307;
                    if(resihallchoice.equals("Owen"))
                        expense = 4130;
                    if(resihallchoice.equals("Windsor"))
                        expense = 4150;
                }
                totalfee = tuition + expense;
                
                JOptionPane.showMessageDialog (null, "Name: " + name + "\nCredit Hours: " + credits +"\nEnrollment: "
                                                   + a[choice] + "\nResidency: " + resichoice + "\nTuition fee: "
                                                   + tuition + "\nHousing Expense: " + expense + "\nTotal Sem. Fee: "
                                                   + totalfee,
                                               "CollegeFeeCalculator", JOptionPane.INFORMATION_MESSAGE);
                
                
                c = JOptionPane.showConfirmDialog(null, "Would you like to perform another fee calculation?",
                                                  "Are you done?", JOptionPane.YES_NO_OPTION);
            }
            catch(Exception e){
                c = 1;
            }
        }
        
        while(c==0);
        
        
    }
    
}