import javax.swing.*;

public class Calculator{
	
		private JFrame f;
		private JTextField t;
		private JButton b1;
		private JButton b2;
		private JButton b3;
		private JButton b4;
		private JButton b5;
		private JButton b6;
		private JButton b7;
		private JButton b8;
		private JButton b9;
		private JButton b0;
		private JButton bDot;
		private JButton bEqualTo;
		private JButton bAC;
		private JButton bRemove;
		private JButton bPlus;
		private JButton bMinus;
		private JButton bMultiplication;
		private JButton bDivision;
		
		
	public Calculator(){
		
		f = new JFrame();
		t = new JTextField();
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b0 = new JButton("0");
		bDot = new JButton(".");
		bEqualTo = new JButton("=");
		bAC = new JButton("AC");
		bRemove = new JButton("Remove");
		bPlus = new JButton("+");
		bMinus = new JButton("-");
		bMultiplication = new JButton("*");
		bDivision = new JButton("/");
		
		t.setBounds(50, 50, 400, 100);
		
		b1.setBounds(50, 200, 80, 80);
		b2.setBounds(150, 200, 80, 80);
		b3.setBounds(250, 200, 80, 80);
		bAC.setBounds(350, 200, 100, 80);
		
		b4.setBounds(50, 300, 80, 80);
		b5.setBounds(150, 300, 80, 80);
		b6.setBounds(250, 300, 80, 80);
		bRemove.setBounds(350, 300, 100, 80);
		
		b7.setBounds(50, 400, 80, 80);
		b8.setBounds(150, 400, 80, 80);
		b9.setBounds(250, 400, 80, 80);
		
		b0.setBounds(50, 500, 80, 80);
		bDot.setBounds(150, 500, 80, 80);
		bEqualTo.setBounds(250, 500, 80, 80);

		f.add(t);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b0);
		f.add(bDot);
		f.add(bEqualTo);
		f.add(bAC);
		f.add(bRemove);
		f.add(bPlus);
		f.add(bMinus);
		f.add(bMultiplication);
		f.add(bDivision);
		
		f.setSize(500, 800);
		f.setLayout(null);
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		public static void main(String[] args){
		new Calculator();
	}

}
