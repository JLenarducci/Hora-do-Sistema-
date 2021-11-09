
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Proanooooooo
 */
public class HoraDoSistema {
    public static void main(String[] args){
        Date relogio = new Date();
        System.out.println("A hora do sistema é");
        System.out.println(relogio.toString());
        Locale loc = Locale.getDefault();
        System.out.print("O idioma do sistema é ");
        System.out.println (loc.getDisplayLanguage());
        Toolkit tela = Toolkit.getDefaultToolkit();
        Dimension d = tela.getScreenSize();
        System.out.println("A resolução do seu sistema é: " + d.width +" X " + d.height);
    }
}
