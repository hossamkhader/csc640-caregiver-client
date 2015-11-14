package gui;

import java.security.MessageDigest;
import ws.Caregiverws;



public class Main {
    
    private static String serverURL;
    private static String username;
    private static String password;
    public static CaregiverGUI caregiverGUI;
    private static Caregiverws caregiverwsProxy;
    
    

    public static void setServerURL(String url)
    {
        serverURL= url;
    }
    
    public static String getServerURL()
    {
        return serverURL;
    }
    
    public static void setUsername (String user)
    {     
        username = user;  
    }
    
    public static String getUsername ()
    {     
        return username;  
    }
    
    public static String getPassword ()
    {     
        return password;  
    }
    public static void setPassword (char [] pass)
    {
        password = MD5Hash(pass);
        
    }
    
    public static String MD5Hash (char [] pass)
    {
        MessageDigest md;
        byte [] byteData = new byte[pass.length];
        for(int i=0;i<pass.length;i++)
        {
            byteData[i] = (byte) pass[i];
        }
        try
        {
            md = MessageDigest.getInstance("MD5");
            
            md.update(byteData);
            
            byteData = md.digest();
        }
        catch (Exception e)
        {
            return null;
        }
        
        StringBuilder hexString = new StringBuilder();
    	for (int i=0;i<byteData.length;i++) 
		{
    		String hex=Integer.toHexString(0xff & byteData[i]);
   	     	if(hex.length()==1) hexString.append('0');
   	     	hexString.append(hex);
    	}
	return hexString.toString();
    }
    
    
    
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
            java.util.logging.Logger.getLogger(CaregiverGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CaregiverGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CaregiverGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CaregiverGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
}
