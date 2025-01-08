import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Flow {
    public static void main(String[] args) {
        Frame frame = new Frame();
        CardLayout cardLayout = new CardLayout();
        
        frame.setLayout(cardLayout); // Set the layout to CardLayout
        
        // Create buttons for the cards
        Button b1 = new Button("Card 1");
        Button b2 = new Button("Card 2");
        Button b3 = new Button("Card 3");
        Button b4 = new Button("Card 4");
        Button b5 = new Button("Card 5");

        // Add buttons to the frame with unique identifiers
        frame.add(b1, "Card1");
        frame.add(b2, "Card2");
        frame.add(b3, "Card3");
        frame.add(b4, "Card4");
        frame.add(b5, "Card5");

        // Set frame properties
        frame.setSize(400, 300);
        frame.setVisible(true);

        // Add action listeners to switch cards
        ActionListener cardSwitcher = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(frame); // Switch to the next card
            }
        };

        // Attach the listener to all buttons
        b1.addActionListener(cardSwitcher);
        b2.addActionListener(cardSwitcher);
        b3.addActionListener(cardSwitcher);
        b4.addActionListener(cardSwitcher);
        b5.addActionListener(cardSwitcher);
    }
}
