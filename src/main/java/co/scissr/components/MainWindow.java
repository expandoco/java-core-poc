package co.scissr.components;

import co.scissr.components.listereners.TabListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by regardt on 10-10-14.
 */
public class MainWindow extends JFrame {

    /* Listener that is fired by textarea when the tab key is pressed. */
    private final TabListener tabListener;

    public MainWindow(final TabListener tabListener) {
        this.tabListener = tabListener;
        setupLayout();
        JTextArea textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.addKeyListener(createKeyListener(textArea));
        add(new JScrollPane(textArea), BorderLayout.CENTER);
    }

    private KeyListener createKeyListener(final JTextArea textArea) {
        return new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // Do nothing
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == KeyEvent.VK_TAB) {
                    e.consume();
                    String newContent = tabListener.onTabPressed(textArea.getText());
                    textArea.setText(newContent);
                    textArea.selectAll();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // Do nothing
            }
        };
    }
    private void setupLayout() {
        setLayout(new BorderLayout());
        setSize(500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
