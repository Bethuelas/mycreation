/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WEB;

public class EncryptDecryptpass {

    public static void main(String[] args) {
        try {
        String password = "Beth1290";
            System.out.println("plain pass="+password);
        String encryptedPassword = AESCrypt.encrypt(password);
            System.out.println("encrypted pass="+encryptedPassword);
        String decryptedPassword = AESCrypt.decrypt(encryptedPassword);    
                System.out.println("decrypted pass="+decryptedPassword);
        } catch(Exception e) { System.out.println("bug"+e.getMessage()); }
    }
    
}
