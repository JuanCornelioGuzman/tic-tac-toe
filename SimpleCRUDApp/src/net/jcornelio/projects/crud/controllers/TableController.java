package net.jcornelio.projects.crud.controllers;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.jcornelio.projects.crud.domain.Contact;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Oct 23, 2013
 * @version: 1.0
 **************************************************/
public class TableController {

    private static TableController tbctrl;
    private DefaultTableModel myTableModel;
    private JTable controlledTbl;
    
    public static TableController getInstance(){
        if(tbctrl==null){
            tbctrl = new TableController();
        }
        return tbctrl;
    }
    
    public void setControlledTable(JTable tbl){
        controlledTbl = tbl;
        myTableModel = new DefaultTableModel();
    }
    
    public JTable getTable(){
        return controlledTbl;
    }
    
    public void refreshTable(List<Contact> contacts){
        refreshTableModel();
        controlledTbl.updateUI();
        controlledTbl.setModel(myTableModel);
        myTableModel.addColumn("Contact ID");
        myTableModel.addColumn("Name");
        myTableModel.addColumn("Number"); 
        myTableModel.addColumn("Address");
        myTableModel.addColumn("E-mail");
        for(Contact c: contacts){
            myTableModel.addRow(new Object[]{
                    c.getContactID(),
                    c.getName(),
                    c.getNumber(),
                    c.getAddress(),
                    c.getEmail(),
            });
        }
    }
    
    public void populateTable(List<Contact> contacts){
        
        controlledTbl.updateUI();
        controlledTbl.setModel(myTableModel);
        myTableModel.addColumn("Contact ID");
        myTableModel.addColumn("Name");
        myTableModel.addColumn("Number"); 
        myTableModel.addColumn("Address");
        myTableModel.addColumn("E-mail");
        for(Contact c: contacts){
            myTableModel.addRow(new Object[]{
                    c.getContactID(),
                    c.getName(),
                    c.getNumber(),
                    c.getAddress(),
                    c.getEmail(),
            });
        }
    }

    private void refreshTableModel() {
        myTableModel = null;
        myTableModel = new DefaultTableModel();
    }
}

