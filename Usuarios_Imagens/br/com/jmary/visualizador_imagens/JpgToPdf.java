/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jmary.visualizador_imagens;

/**
 *
 * @author NewUser
 */
import br.com.jmary.utilidades.Arquivo_Ou_Pasta;
import br.com.jmary.utilidades.Exportando;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class JpgToPdf {
    
    String outputFile = "zz";
    String folderContainingIages = "";
    
    public JpgToPdf( String folderContainingIages2, String outputFile2 ) {
        
        outputFile = outputFile2+".pdf";
        folderContainingIages = folderContainingIages2;
    }
    
    public void JpgParaPdf() {
        try{
            
            try{ 
                File f = new File(System.getProperty("user.dir")+"\\"+outputFile);
                Arquivo_Ou_Pasta.deletar(f); 
                Thread.sleep( 100 );
            }catch( Exception e ){}
                
            Exportando = new Exportando("Convertendo...");
            Exportando.setVisible(true);Exportando.pbg.setMinimum(0);
            Exportando.pbg.setMaximum( 100 );
            Exportando.pbg.setValue( 50 );
            
            List<String> files = new ArrayList<String>();
            
            File root = new File(folderContainingIages);
            if ( root.isDirectory()  ){
                File[] listaDosArquivos = root.listFiles();
                for (int j=0; j < listaDosArquivos.length; j++) {
                    
                    String extencao = listaDosArquivos[j].getPath().substring( listaDosArquivos[j].getPath().lastIndexOf('.') + 1 );
                            
                    if ( extencao.equalsIgnoreCase("JPG") ) {
                        
                        System.out.println( listaDosArquivos[j].getPath()  ); 
                        files.add( listaDosArquivos[j].getName() );
                    }
                }
        
                Document document = new Document();
                PdfWriter.getInstance(document, new FileOutputStream(new File(System.getProperty("user.dir"), outputFile)));
                document.open();
                for (String f : files) {
                    document.newPage();
                    Image image = Image.getInstance(new File(root, f).getAbsolutePath());
                    image.setAbsolutePosition(0, 0);
                    image.setBorderWidth(0);
                    image.scaleAbsolute(PageSize.A4);
                    document.add(image);
                }
                document.close();
            }
            
            if (Desktop.isDesktopSupported()) {
                //System.out.println( "URL: " + url);
                File f = new File(System.getProperty("user.dir")+"\\"+outputFile);
                if(f.exists() == true ){
                    Desktop.getDesktop().open( f );
                }
            } 
            
            Exportando.fechar();
        } catch( Exception e ){
            Exportando.fechar();
        }
    }
    
    Exportando Exportando;
    private void JpgParaPdf2() {                                     
        //setarImagemExterna(img_Atual);
        new Thread() {   @Override public void run() { try { Thread.sleep( 1 );
            
            
            File diretorio = new File( folderContainingIages ); 
            if ( diretorio.isDirectory()  ){ 
                
                File[] listaDosArquivos = diretorio.listFiles(); 
                Document document = new Document();
                
                for (int j=0; j < listaDosArquivos.length; j++) {
                    try{

                        if ( listaDosArquivos[j].isFile() == true ) {
                            System.out.println( listaDosArquivos[j].getPath()  );
                            
                            String extencao = listaDosArquivos[j].getPath().substring( listaDosArquivos[j].getPath().lastIndexOf('.') + 1 );
                            
                            if ( extencao.equalsIgnoreCase("JPG") ) {
                                System.out.println( extencao  );                                
                                
                                PdfWriter.getInstance(document, new FileOutputStream(new File(diretorio, outputFile)));
                                document.open();
                                document.newPage();
                                Image image = Image.getInstance(new File(diretorio, listaDosArquivos[j].getName()).getAbsolutePath());
                                image.setAbsolutePosition(0, 0);
                                image.setBorderWidth(0);
                                image.scaleAbsolute(PageSize.A4);
                                document.add(image);                                
                            }
                        }
                    } catch( Exception e ){ 
                        e.printStackTrace(); 
                    }
                }
                
                document.close();
                /*
                Document document = new Document();
                PdfWriter.getInstance(document, new FileOutputStream(new File(diretorio, outputFile)));
                document.open();
                for (String f : listaDosNomes) {
                    document.newPage();
                    Image image = Image.getInstance(new File(diretorio, f).getAbsolutePath());
                    image.setAbsolutePosition(0, 0);
                    image.setBorderWidth(0);
                    image.scaleAbsolute(PageSize.A4);
                    document.add(image);
                }
                document.close();
                */
            }

            Exportando.fechar();
        } catch( Exception e ){ 
            Exportando.fechar(); e.printStackTrace(); 
        } } }.start();
    }    
}