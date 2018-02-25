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
import java.awt.Desktop;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class JpgToHtml {
    
    String outputFile = "zz";
    String folderContainingIages = ""; // System.getProperty("user.dir")+"\\"+"00_Externo"
    
    public JpgToHtml( String folderContainingIages2, String outputFile2 ) {
        
        outputFile = outputFile2+".html";
        folderContainingIages = folderContainingIages2;
    }
    
    Exportando Exportando;
    StringBuilder sb;
    public void JpgToHtml() {
        new Thread() {   @Override public void run() { try {
            
            sb = new StringBuilder();
                sb.append(
                "<html>"
                    + "<head> <title> HOME </title>"
                    + "<meta charset=\"UTF-8\">"
                    + "</head>"
                    
                + "<body style=\"width: 100%; height: 100%; padding: 0; margin: 0;\">" 
                );
////////////////////////////////////////////////////////////////////////////////
            
            Exportando = new Exportando("ABRINDO...");
            Exportando.setVisible(true);Exportando.pbg.setMinimum(0);
            Exportando.pbg.setMaximum( 100 );
            Exportando.pbg.setValue( 50 );
            
            listarDiretorios_html( folderContainingIages );
            
            Exportando.fechar();
////////////////////////////////////////////////////////////////////////////////
            sb.append(
                    "</body>"
                +"</html>"
                );
            
            String arq_html = System.getProperty("user.dir") + "\\" + outputFile;
            try{ 
                File f = new File(arq_html);
                Arquivo_Ou_Pasta.deletar(f); 
                Thread.sleep( 100 );
            }catch( Exception e ){}                
                
            String conteudo = sb.toString();
                
            if ( Arquivo_Ou_Pasta.criar_Arquivo_Iso_Boo( arq_html, conteudo ) == true ) {
                    
                ////////////////////////////////////////////////////////////////////////
                /*new Thread() {   @Override public void run() {*/ try { 
                    File f_arq_html = new File( arq_html );
                    
                    if(f_arq_html.exists() == true ){
                        
                        if (Desktop.isDesktopSupported()) {
                            System.out.println( "URL: " + arq_html);
                            Desktop.getDesktop().open( f_arq_html );
                        } 
                    }
                } catch( Exception e ){ } /*} }.start();*/
                ////////////////////////////////////////////////////////////////////////
            } 

        } catch( Exception e ){ Exportando.fechar(); } } }.start();
    }
    
    private void listarDiretorios_html(String strdevolvida){        
        try{        
            File f  = new File( strdevolvida );
            
            File[] listaDosArquivos = f.listFiles(); 
            
            if ( listaDosArquivos != null ) {
                                                
                for (int j=0; j < listaDosArquivos.length; j++) {
                
                    File diretorio = new File( listaDosArquivos[j].getPath() );
                
                    if ( diretorio.isDirectory()  ) {
                    
                        // Todas as subpastas
                        //listarDiretorios_html( diretorio.getPath() );   
                    }
                    else{
                        String extencao = diretorio.getPath().substring( diretorio.getPath().lastIndexOf('.') + 1 );                     
                        capturarTodasImagens_html( diretorio.getPath(), extencao );
                    }
                }                                 
            }
        } catch( Exception e ){ System.out.println( "Zero - Diretórios - Home - listarDiretorios()" ); }
    }
    
    private void capturarTodasImagens_html( String endereco, String extencao ){        
        try{              
            switch( extencao ){                
                case "jpg": /*System.out.println( endereco );*/ listarArquivos_img_html( endereco,extencao ); break; 
                case "JPG": /*System.out.println( endereco );*/ listarArquivos_img_html( endereco,extencao ); break; 
                case "gif": /*System.out.println( endereco );*/ listarArquivos_img_html( endereco,extencao ); break; 
                case "GIF": /*System.out.println( endereco );*/ listarArquivos_img_html( endereco,extencao ); break; 
                case "png": /*System.out.println( endereco );*/ listarArquivos_img_html( endereco,extencao ); break; 
                case "PNG": /*System.out.println( endereco );*/ listarArquivos_img_html( endereco,extencao ); break; 
                case "bmp": /*System.out.println( endereco );*/ listarArquivos_img_html( endereco,extencao ); break; 
                case "BMP": /*System.out.println( endereco );*/ listarArquivos_img_html( endereco,extencao ); break; 
                case "dib": /*System.out.println( endereco );*/ listarArquivos_img_html( endereco,extencao ); break;
                case "DIB": /*System.out.println( endereco );*/ listarArquivos_img_html( endereco,extencao ); break;
                case "tiff":/*System.out.println( endereco );*/ listarArquivos_img_html( endereco,extencao ); break;
                case "TIFF":/*System.out.println( endereco );*/ listarArquivos_img_html( endereco,extencao ); break;
                case "raw": /*System.out.println( endereco );*/ listarArquivos_img_html( endereco,extencao ); break;
                case "RAW": /*System.out.println( endereco );*/ listarArquivos_img_html( endereco,extencao ); break;
                case "svg": /*System.out.println( endereco );*/ listarArquivos_img_html( endereco,extencao ); break;
                case "SVG": /*System.out.println( endereco );*/ listarArquivos_img_html( endereco,extencao ); break;
                case "webp":/*System.out.println( endereco );*/ listarArquivos_img_html( endereco,extencao ); break;
                case "WEBP":/*System.out.println( endereco );*/ listarArquivos_img_html( endereco,extencao ); break;
                case "exif":/*System.out.println( endereco );*/ listarArquivos_img_html( endereco,extencao ); break;
                case "EXIF":/*System.out.println( endereco );*/ listarArquivos_img_html( endereco,extencao ); break;
            }                        
        } catch( Exception e ){ System.out.println( "Zero - Diretórios - Home - filtrarTipoArquivos( File diretório, File arquivo )" ); }
    }
    
    int atual_html = 0;
    private void listarArquivos_img_html( String endereco, String extencao ){        
        try{ 
            //System.out.println( endereco );            
            File img = new File( endereco );
            
            BufferedImage bufImg = null;
            ImageIcon     icon   = null;
            Image         image  = null;
            try{
                bufImg = ImageIO.read( img );
                icon   = new ImageIcon(bufImg);
                image  = icon.getImage();//ImageIO.read(f);  
            } catch (IOException ex) {}  
            
            try {  
                image = icon.getImage();//ImageIO.read(f);  
                int widith = image.getWidth(icon.getImageObserver() );
                int height = image.getHeight(icon.getImageObserver() );
                
                sb.append(
                "<div style=\"width: 100%;\">  \n" +
"                    <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"> \n" +
"                        <tr><td align=\"center\"> "
                            + "<img width=\""+widith+"\" height=\""+height+"\" title=\"\" src=\""
                                + "00_Externo/" +img.getName()
                +"\"> </td></tr>\n" + " </table>\n" + "</div> <p>&nbsp;</p>"
                );
            }catch(Exception ex){}

        } catch( Exception e ){ System.out.println( "Zero - Diretórios - Home - deletarArquivo()" ); }
    }
}