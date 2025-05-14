// BookPanel.java

// BookPanel.java
package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookPanel extends JPanel {
    private JTable bookTable;
    private JButton addButton, editButton, deleteButton;
    
    public BookPanel() {
        setLayout(new BorderLayout());
        
        // Table
        bookTable = new JTable();
        JScrollPane scrollPane = new JScrollPane(bookTable);
        add(scrollPane, BorderLayout.CENTER);
        
        // Buttons panel
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        addButton = new JButton("Add Book");
        editButton = new JButton("Edit Book");
        deleteButton = new JButton("Delete Book");
        
        buttonPanel.add(addButton);
        buttonPanel.add(editButton);
        buttonPanel.add(deleteButton);
        
        add(buttonPanel, BorderLayout.SOUTH);
        
        // Add action listeners
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showAddBookDialog();
            }
        });
    }
    
    private void showAddBookDialog() {
        JDialog dialog = new JDialog();
        dialog.setTitle("Add New Book");
        dialog.setSize(400, 300);
        dialog.setModal(true);
        dialog.setLocationRelativeTo(this);
        
        JPanel panel = new JPanel(new GridLayout(5, 2, 5, 5));
        
        JLabel titleLabel = new JLabel("Title:");
        JTextField titleField = new JTextField();
        
        JLabel authorLabel = new JLabel("Author:");
        JTextField authorField = new JTextField();
        
        JLabel isbnLabel = new JLabel("ISBN:");
        JTextField isbnField = new JTextField();
        
        JLabel yearLabel = new JLabel("Published Year:");
        JTextField yearField = new JTextField();
        
        JLabel quantityLabel = new JLabel("Quantity:");
        JTextField quantityField = new JTextField();
        
        panel.add(titleLabel);
        panel.add(titleField);
        panel.add(authorLabel);
        panel.add(authorField);
        panel.add(isbnLabel);
        panel.add(isbnField);
        panel.add(yearLabel);
        panel.add(yearField);
        panel.add(quantityLabel);
        panel.add(quantityField);
        
        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(e -> {
            // Save book logic here
            dialog.dispose();
        });
        
        dialog.add(panel, BorderLayout.CENTER);
        dialog.add(saveButton, BorderLayout.SOUTH);
        dialog.setVisible(true);
    }
}
