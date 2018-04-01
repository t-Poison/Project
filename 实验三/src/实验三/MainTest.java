package 实验三;

import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class MainTest {
	public static  void main(String[] args) {
		MyFrame frame = new MyFrame("四则运算");
		CalTest calrandom= new CalTest();
		calrandom.random();
		//SubFrame subframe= new SubFrame("结果");
	}

}
