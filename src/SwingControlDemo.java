import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingControlDemo  implements ActionListener, AbTest {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;
    private JMenuBar mb;
    private JMenu file, edit, help;
    private JMenuItem cut, copy, paste, selectAll;
    private JTextArea ta;
    private int WIDTH = 800;
    private int HEIGHT = 700;


    public SwingControlDemo() {
        prepareGUI5();
    }

    public static void main(String[] args) {
        SwingControlDemo swingControlDemo = new SwingControlDemo();
        swingControlDemo.showEventDemo();
    }
    private void prepareGUI5() {
        mainFrame = new JFrame("Hard");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new GridLayout(2,1));

        JPanel top = new JPanel(new GridLayout(1,2));

        JPanel split = new JPanel(new GridLayout(1, 2));
        JPanel grid = new JPanel(new GridLayout(3,3));
        grid.add(new JLabel("Top 0", SwingConstants.CENTER));
        grid.add(new JButton("Top 1"));
        grid.add(new JLabel("Top 0", SwingConstants.CENTER));
        grid.add(new JButton("Top 2"));
        grid.add(new JLabel("Top 0", SwingConstants.CENTER));
        grid.add(new JButton("Top 3"));
        grid.add(new JLabel("Top 0", SwingConstants.CENTER));
        grid.add(new JButton("Top 4"));
        grid.add(new JLabel("Top 0", SwingConstants.CENTER));


        JPanel small = new JPanel(new GridLayout(2,1));
        small.add(new JLabel("TopRight", SwingConstants.CENTER));
        small.add(new JButton("1"));
        split.add(grid);
        split.add(small);
        top.add(split);





        JPanel bottom = new JPanel(new BorderLayout());

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(1,9));
        p.add(new JLabel("0", SwingConstants.CENTER));
        JButton j = new JButton("1");
        j.setBackground(Color.blue);
        p.add(j);
        p.add(new JLabel("0", SwingConstants.CENTER));
        p.add(new JButton("2"));
        p.add(new JLabel("0", SwingConstants.CENTER));
        p.add(new JButton("3"));
        p.add(new JLabel("0", SwingConstants.CENTER));
        p.add(new JButton("4"));
        p.add(new JLabel("0", SwingConstants.CENTER));
        bottom.add(p, BorderLayout.SOUTH);
        ta = new JTextArea();
        bottom.add(ta, BorderLayout.CENTER);

        cut = new JMenuItem("cut");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        selectAll = new JMenuItem("selectAll");
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);

        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);
        mb.add(file);
        mb.add(edit);
        mb.add(help);


        mainFrame.add(mb);
        mainFrame.add(top);
        mainFrame.add(bottom);
        mainFrame.setJMenuBar(mb);

//        headerLabel = new JLabel("", JLabel.CENTER);
//        statusLabel = new JLabel("", JLabel.CENTER);
//        statusLabel.setSize(350, 100);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        // mainFrame.add(headerLabel);
//        mainFrame.add(controlPanel);
//        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }
    private void prepareGUI4() {
        mainFrame = new JFrame("Border inside grid");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new GridLayout(3, 3));

        JButton b1 = new JButton("button 1");
        JButton b2 = new JButton("button 2");
        JButton b3 = new JButton("button 3");
        JButton b4 = new JButton("button 4");
        JButton b5 = new JButton("button 5");
        JButton b6 = new JButton("button 6");
        JButton b7 = new JButton("button 7");
        JButton b8 = new JButton("button 8");
        JButton b9 = new JButton("button 9");
        JButton b10 = new JButton("button 10");

        mainFrame.add(b1);
        mainFrame.add(b2);mainFrame.add(b3);
        mainFrame.add(b4);

        controlPanel = new JPanel();
        controlPanel.setLayout(new BorderLayout());
        controlPanel.add(b9, BorderLayout.EAST);
        controlPanel.add(b10, BorderLayout.SOUTH);
        controlPanel.add(new JLabel("label", SwingConstants.CENTER), BorderLayout.CENTER);

        mainFrame.add(controlPanel);
        mainFrame.add(b5);
        mainFrame.add(b6);mainFrame.add(b7);
        mainFrame.add(b8);
        cut = new JMenuItem("cut");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        selectAll = new JMenuItem("selectAll");
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);

        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);
        mb.add(file);
        mb.add(edit);
        mb.add(help);

        ta = new JTextArea();
        ta.setBounds(50, 5, WIDTH-100, HEIGHT-50);
//        mainFrame.add(mb);
//        mainFrame.add(ta);
//        mainFrame.setJMenuBar(mb);

//        headerLabel = new JLabel("", JLabel.CENTER);
//        statusLabel = new JLabel("", JLabel.CENTER);
//        statusLabel.setSize(350, 100);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        // mainFrame.add(headerLabel);
//        mainFrame.add(controlPanel);
//        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }
    private void prepareGUI3() {
        mainFrame = new JFrame("Example with grid layout inside border layout");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new BorderLayout());

        JButton okButton = new JButton("button 1");
//        okButton.setSize(100, 70);
        JButton submitButton = new JButton("button 2");
        JButton cancelButton = new JButton("button 3");
        JButton b4 = new JButton("button 4");
        JButton b5 = new JButton("button 5");

        mainFrame.add(okButton, BorderLayout.NORTH);
//        mainFrame.add(submitButton, BorderLayout.EAST);
        mainFrame.add(cancelButton, BorderLayout.SOUTH);
//        mainFrame.add(b4, BorderLayout.WEST);
//        mainFrame.add(b5, BorderLayout.CENTER);
        controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(2,3));
        controlPanel.add(submitButton);
        JLabel l1 = new JLabel("label 1", SwingConstants.CENTER);
        controlPanel.add(l1);
        controlPanel.add(b4);
        JLabel l2 = new JLabel("label 2", SwingConstants.CENTER);
        controlPanel.add(l2);
        controlPanel.add(b5);
        mainFrame.add(controlPanel);
        cut = new JMenuItem("cut");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        selectAll = new JMenuItem("selectAll");
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);

        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);
        mb.add(file);
        mb.add(edit);
        mb.add(help);

        ta = new JTextArea();
        ta.setBounds(50, 5, WIDTH - 100, HEIGHT - 50);
//        mainFrame.add(mb);
//        mainFrame.add(ta);
//        mainFrame.setJMenuBar(mb);

//        headerLabel = new JLabel("", JLabel.CENTER);
//        statusLabel = new JLabel("", JLabel.CENTER);
//        statusLabel.setSize(350, 100);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });


        // mainFrame.add(headerLabel);
//        mainFrame.add(controlPanel);
//        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }
    private void prepareGUI2() {
        mainFrame = new JFrame("Example with border layout");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new BorderLayout());

        JButton okButton = new JButton("button 1");
//        okButton.setSize(100, 70);
        JButton submitButton = new JButton("button 2");
        JButton cancelButton = new JButton("button 3");
        JButton b4 = new JButton("button 4");
        JButton b5 = new JButton("button 5");

        mainFrame.add(okButton, BorderLayout.NORTH);
        mainFrame.add(submitButton, BorderLayout.EAST);
        mainFrame.add(cancelButton, BorderLayout.SOUTH);
        mainFrame.add(b4, BorderLayout.WEST);
        mainFrame.add(b5, BorderLayout.CENTER);

        cut = new JMenuItem("cut");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        selectAll = new JMenuItem("selectAll");
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);

        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);
        mb.add(file);
        mb.add(edit);
        mb.add(help);

        ta = new JTextArea();
        ta.setBounds(50, 5, WIDTH - 100, HEIGHT - 50);
//        mainFrame.add(mb);
//        mainFrame.add(ta);
//        mainFrame.setJMenuBar(mb);

//        headerLabel = new JLabel("", JLabel.CENTER);
//        statusLabel = new JLabel("", JLabel.CENTER);
//        statusLabel.setSize(350, 100);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        // mainFrame.add(headerLabel);
//        mainFrame.add(controlPanel);
//        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void prepareGUI1() {
        mainFrame = new JFrame("Example with grid layout");
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLayout(new GridLayout(2, 3));

        JButton okButton = new JButton("button 1");
        JButton submitButton = new JButton("button 2");
        JButton cancelButton = new JButton("button 3");
        JButton b4 = new JButton("button 4");
        JButton b5 = new JButton("button 5");

        mainFrame.add(okButton);
        mainFrame.add(submitButton);mainFrame.add(cancelButton);
        mainFrame.add(b4);mainFrame.add(b5);

        cut = new JMenuItem("cut");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        selectAll = new JMenuItem("selectAll");
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);

        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);
        mb.add(file);
        mb.add(edit);
        mb.add(help);

        ta = new JTextArea();
        ta.setBounds(50, 5, WIDTH-100, HEIGHT-50);
//        mainFrame.add(mb);
//        mainFrame.add(ta);
//        mainFrame.setJMenuBar(mb);

//        headerLabel = new JLabel("", JLabel.CENTER);
//        statusLabel = new JLabel("", JLabel.CENTER);
//        statusLabel.setSize(350, 100);

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

       // mainFrame.add(headerLabel);
//        mainFrame.add(controlPanel);
//        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showEventDemo() {
        headerLabel.setText("Control in action: Button");

        JButton okButton = new JButton("OK");
        JButton submitButton = new JButton("Submit");
        JButton cancelButton = new JButton("Cancel");

        okButton.setActionCommand("OK");
        submitButton.setActionCommand("Submit");
        cancelButton.setActionCommand("Cancel");

        okButton.addActionListener(new ButtonClickListener());
        submitButton.addActionListener(new ButtonClickListener());
        cancelButton.addActionListener(new ButtonClickListener());

        controlPanel.add(okButton);
        controlPanel.add(submitButton);
        controlPanel.add(cancelButton);

        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cut)
            ta.cut();
        if (e.getSource() == paste)
            ta.paste();
        if (e.getSource() == copy)
            ta.copy();
        if (e.getSource() == selectAll)
            ta.selectAll();
    }

    @Override
    public void test() {
        
    }

    @Override
    public int test2(int x) {
        return 0;
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.equals("OK")) {
                statusLabel.setText("Ok Button clicked.");
            } else if (command.equals("Submit")) {
                statusLabel.setText("Submit Button clicked.");
            } else {
                statusLabel.setText("Cancel Button clicked.");
            }
        }
    }
}