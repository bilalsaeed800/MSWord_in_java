/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mswordread;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

/**
 *
 * @author Bilal
 */
public class MSWordRead {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
        FileInputStream file  = new FileInputStream("E:\\5th semester\\OS\\Mid2_sol 2016.docx");
        XWPFDocument docx = new XWPFDocument(file);
        List<XWPFParagraph> para = docx.getParagraphs();
        
        for(XWPFParagraph xpara : para)
        {
            System.out.println(xpara.getText());
        }
        
        } catch (IOException ex) {
            Logger.getLogger(MSWordRead.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO code application logic here
    }
    
}
