




import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.paradigmas.gui.Gui;
import com.paradigmas.models.SocialNetwork;

import static java.lang.System.exit;

import java.awt.EventQueue;

public class Main extends MenuInteractivo {

    public static void main(String[] args) {
    	//lab 4	
    	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

    }
  
}







