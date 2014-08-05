package Gui;

import java.awt.event.*;
import javax.swing.*;

public class Gui extends JFrame {
	
	public Gui(){
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //ウィンドウの閉じ方
		setBounds(100,100,640,480);
		
		//ボタン作成
		JButton btn1 = new JButton("ボタン1");
		add(btn1); 
	
		//クリック時の処理
		btn1.addActionListener(new ActionListener(){
		
			@Override
			public void actionPerformed(ActionEvent e){
				System.out.println("クリック");
			}
		});
	}
	
	public static void main(String[] args){
		Gui frm = new Gui();
		frm.setVisible(true);
	}
}

