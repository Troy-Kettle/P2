import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Practical1 extends JFrame{
    public Practical1() {

        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.setPreferredSize(new Dimension(1200, 1200));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel controlPanel = new JPanel();
        controlPanel.setBorder(new TitledBorder(new EtchedBorder(), "Canvas"));
        controlPanel.setPreferredSize(new Dimension(200, 200));
        JRadioButton r1=new JRadioButton("A) Male");
        JRadioButton r2=new JRadioButton("B) Female");
        r1.setBounds(6,20,100,30);
        r2.setBounds(6,50,100,30);
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);bg.add(r2);
        controlPanel.add(r1);controlPanel.add(r2);
        controlPanel.setSize(300,300);
        controlPanel.setLayout(null);
        controlPanel.setVisible(true);
        frame.add(controlPanel, BorderLayout.LINE_START);
        SpinnerModel value =
                new SpinnerNumberModel(5, //initial value
                        0, //minimum value
                        10, //maximum value
                        1); //step
        JSpinner spinner = new JSpinner(value);
        spinner.setBounds(10,100,50,30);
        controlPanel.add(spinner);
        controlPanel.setSize(300,300);
        controlPanel.setLayout(null);
        controlPanel.setVisible(true);


        JPanel canvas = new JPanel();
        canvas.setBorder(new TitledBorder(new EtchedBorder(), "Control Panel"));
        canvas.setPreferredSize(new Dimension(10000,200));
        frame.add(canvas, BorderLayout.CENTER);


        JPanel messageArea = new JPanel();
        messageArea.setBorder(new TitledBorder(new EtchedBorder(), "Message Area"));
        messageArea.setPreferredSize(new Dimension(200, 200));
        messageArea(); {
            JTextArea area = new JTextArea("Type in message area");
            area.setBounds(10, 30, 500, 100);
            messageArea.add(area);
            messageArea.setSize(300, 100);
            messageArea.setLayout(null);
            messageArea.setVisible(true);
            Border border = BorderFactory.createLineBorder(Color.BLACK,1);
            area.setBorder(border);
            add(messageArea);
        }
        frame.add(messageArea,BorderLayout.PAGE_END);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu helpMenu = new JMenu("Help");
        JMenuItem fileSaveMenuItem = new JMenuItem("Save");
        JMenuItem fileLoadMenuItem = new JMenuItem("Load");
        JMenuItem fileExitMenuItem = new JMenuItem("Exit");
        JMenuItem helpAbout = new JMenuItem("About");
        fileMenu.add(fileSaveMenuItem);
        fileMenu.add(fileLoadMenuItem);
        fileMenu.add(fileExitMenuItem);
        helpMenu.add(helpAbout);
        menuBar.add(fileMenu);
        menuBar.add(helpMenu);
        frame.add(menuBar, BorderLayout.PAGE_START);


        frame.pack();
        frame.setVisible(true);
    }

    private void messageArea() {
    }

    public static void main(String[] args) {
        new Practical1();
        System.out.println("Hello World");
    }
}