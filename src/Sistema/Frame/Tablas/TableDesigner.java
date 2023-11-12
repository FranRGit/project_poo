/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Sistema.Frame.Tablas;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class TableDesigner {
    public static void designTable(JTable table) {
        //TABLA
        table.setBorder(new EmptyBorder(0, 0, 0, 0));
        table.setShowHorizontalLines(true);
        table.setRowHeight(40);
        table.setGridColor(new Color(230, 230, 230));

        //HEADER
        table.getTableHeader().setReorderingAllowed(false);
        table.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bin, boolean b1n1, int i, int i1) {
                TableHeader header = new TableHeader(o + "");
                if (i1 == 4) {
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
        });
        table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean isSelected, boolean b1n1, int row, int column) {
                Component com = super.getTableCellRendererComponent(jtable, o, isSelected, b1n1, row, column);

                if (isSelected) {
                    com.setBackground(table.getSelectionBackground());
                    com.setForeground(table.getSelectionForeground());
                    setBorder(null);
                } else {
                    com.setBackground(table.getBackground());
                    com.setForeground(table.getForeground());
                    com.setBackground(Color.WHITE);
                }

                ((JLabel) com).setHorizontalAlignment(SwingConstants.CENTER);

                return com;
            }
        });
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
    }
}
