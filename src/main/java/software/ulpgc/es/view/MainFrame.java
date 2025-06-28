package software.ulpgc.es.view;

import software.ulpgc.es.control.Command;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class MainFrame extends JFrame {
    private final Map<String, Command> commands;

    public MainFrame() {
        this.setTitle("BarChart Football");
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(menu());
        this.commands = new HashMap<>();
    }

    public void put(String commandName, Command command) {
        this.commands.put(commandName, command);
    }

    private JPanel menu(){
        JPanel jPanel = new JPanel(new FlowLayout());
        jPanel.add(toggle());
        return jPanel;
    }

    private JButton toggle() {
        JButton toggle = new JButton("toggle");
        toggle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                commands.get("toggle").execute();
            }
        });
        return toggle;
    }
}
