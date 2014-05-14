package net.jcornelio.projects.tictactoe.gui.layout;

import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import net.jcornelio.projects.tictactoe.gui.ColorPickerWindow;
import net.jcornelio.projects.tictactoe.util.WindowHelper;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Oct 3, 2013
 * @version: 1.0
 **************************************************/
public class ColorPickerWindowLayoutManager implements LayoutManager {

    private ColorPickerWindow cpFrame;

    public ColorPickerWindowLayoutManager(ColorPickerWindow cpFrame) {
        this.cpFrame = cpFrame;
    }
    
    @Override
    public void performLayout() {
        GroupLayout layout = new GroupLayout(cpFrame.getContentPane());
        cpFrame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(cpFrame.getColorChooser(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cpFrame.getBtnSelect(), GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpFrame.getBtnCancel(), GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cpFrame.getColorChooser(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(cpFrame.getBtnSelect(), GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(cpFrame.getBtnCancel(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        cpFrame.pack();
        WindowHelper.setStartUpLocationToCenter(cpFrame);
    }

}

