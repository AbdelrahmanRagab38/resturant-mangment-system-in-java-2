/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturant.manggment.system;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dell
 */

public abstract class fileManger implements Serializable {

    public static boolean write(String FilePath, Object data) {
        ObjectOutputStream writter = null;

        try {
            writter = new ObjectOutputStream(new FileOutputStream(FilePath));

            writter.writeObject(data);

            return true;

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                if (writter != null) {
                    writter.close();
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }

        return false;
    }

    public static Object read(String FilePath) {

        Object Result = null;
        ObjectInputStream Reader=null;
        try {
            Reader = new ObjectInputStream(new FileInputStream(FilePath));
            Result = Reader.readObject();

        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(fileManger.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                if(Reader!=null)
                    Reader.close();
            }
            catch(IOException e){
                System.out.println(e);
            }
        }

        return Result;

    }

    public static boolean valid(String FilePath) {
        File x = new File(FilePath);
        return x.length() != 0;

    }

}