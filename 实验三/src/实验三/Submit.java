package ʵ����;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;

public class Submit {
	SubFrame subframe= new SubFrame("���");
}
class SubFrame extends JFrame{
	private JButton btn_again =null;//����һ��
	private JButton btn_js =null;//ͳ�ƽ��
	private JPanel p_left= null;
	private JPanel p_right= null;
	private JPanel p_south= null;
	
	public SubFrame(String title) {
		super(title);
		init();
	}
	public void init() {
		btn_again= new JButton("����һ��");
		btn_js = new JButton("ͳ�ƽ��");
		p_left = new JPanel();
		p_left.setBackground(Color.BLUE);
		p_right= new JPanel();
		p_south= new JPanel();
		
		p_south.setBackground(Color.LIGHT_GRAY);
		p_south.add(btn_again);
		p_south.add(btn_js);
		
		this.add(p_left,BorderLayout.EAST);
		this.add(p_right, BorderLayout.WEST);
		this.add(p_south, BorderLayout.SOUTH);
		this.setBounds(100,20,1000,700);
		this.setVisible(true);
		
	}
}
