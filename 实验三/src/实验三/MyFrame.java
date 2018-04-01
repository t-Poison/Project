package 实验三;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class MyFrame extends JFrame {
		private JTextArea area=null;
		public JTextField field[];
		private JButton btn_tj =null;
		private JButton btn_begin =null;
		private JButton btn_js =null;
		private JPanel p_area = null;
		private JPanel p_btn = null;
		private GridLayout layout =null;
		
		public MyFrame(String title) {
			super(title);
			init();
			registerListener();
		}
		public void init() {
			area=new JTextArea("计算下面算式，在等号后输入答案\n");
			area.setFont(new Font("宋体",Font.BOLD,20));
		
			layout = new GridLayout();

			btn_tj = new JButton("提交");
			btn_js = new JButton("统计结果");
			btn_begin = new JButton("开始测试");
			
			p_area= new JPanel();
			p_btn=new JPanel();
			p_btn.setBackground(Color.LIGHT_GRAY);
			
			p_area.setLayout(layout);
			p_area.add(area);
			
			this.add(p_area,BorderLayout.NORTH);
			
			p_btn.add(btn_begin);
			p_btn.add(btn_tj);
			p_btn.add(btn_js);
			this.add(p_btn,BorderLayout.SOUTH);
			
			this.setBackground(Color.BLUE);
			this.setBounds(100,20,1000,700);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setVisible(true);
		}
		
		//注册监听
		private void registerListener() {
			btn_begin.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					//开始测试
					begin();	
				}				
			});
			btn_tj.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					submit();
				}
				
			});
		}
		//开始测试函数
		public void begin() {
			File file = new File("suanshi.txt");
		    if (file.exists() && file.isFile()) {
		    	try {
		            BufferedReader input = new BufferedReader(new FileReader(file));
		            String text;
		            while ((text = input.readLine()) != null)
		            	area.setText(area.getText() + text + "\n");
		    	} catch (IOException ioException) {
		    	System.err.println("File Error!");
		       }
			
		    }
		}
		
		//提交函数
		public void submit() {
			SubFrame subframe= new SubFrame("结果");
		}
		
	}
