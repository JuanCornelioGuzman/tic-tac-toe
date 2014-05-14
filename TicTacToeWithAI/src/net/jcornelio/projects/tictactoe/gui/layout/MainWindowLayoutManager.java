package net.jcornelio.projects.tictactoe.gui.layout;

import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import net.jcornelio.projects.tictactoe.gui.MainWindow;
import net.jcornelio.projects.tictactoe.util.WindowHelper;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Oct 2, 2013
 * @version: 1.0
 **************************************************/
public class MainWindowLayoutManager implements LayoutManager{
    
    private MainWindow mainWindow;
    
    public MainWindowLayoutManager(MainWindow mainWindow){
        this.mainWindow = mainWindow;
    }
    
    @Override
    public void performLayout(){
        layoutSlotsBoard();
        layoutSideBar();
        layoutGameArea();
        layoutContentPane();
        mainWindow.pack();
        WindowHelper.setStartUpLocationToCenter(mainWindow);
    }

    private void layoutSlotsBoard() {
        GroupLayout pnlBoardLayout = new GroupLayout(mainWindow.getPnlBoard());
        mainWindow.getPnlBoard().setLayout(pnlBoardLayout);
        pnlBoardLayout.setHorizontalGroup(
            pnlBoardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlBoardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBoardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBoardLayout.createSequentialGroup()
                        .addComponent(mainWindow.getSlot(6), GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mainWindow.getSlot(7), GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mainWindow.getSlot(8), GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBoardLayout.createSequentialGroup()
                        .addComponent(mainWindow.getSlot(3), GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mainWindow.getSlot(4), GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mainWindow.getSlot(5), GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBoardLayout.createSequentialGroup()
                        .addComponent(mainWindow.getSlot(0), GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mainWindow.getSlot(1), GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mainWindow.getSlot(2), GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBoardLayout.setVerticalGroup(
            pnlBoardLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, pnlBoardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBoardLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(mainWindow.getSlot(0), GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainWindow.getSlot(1), GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainWindow.getSlot(2), GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBoardLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(mainWindow.getSlot(3), GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainWindow.getSlot(4), GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainWindow.getSlot(5), GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBoardLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(mainWindow.getSlot(6), GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainWindow.getSlot(7), GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainWindow.getSlot(8), GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }

    private void layoutSideBar() {
        GroupLayout pnlSideBarLayout = new GroupLayout(mainWindow.getPnlSideBar());
        mainWindow.getPnlSideBar().setLayout(pnlSideBarLayout);
        pnlSideBarLayout.setHorizontalGroup(
            pnlSideBarLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlSideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSideBarLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(mainWindow.getScoreBoardLabel(0), GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(mainWindow.getScoreBoardLabel(1), GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(mainWindow.getScoreBoardLabel(2), GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(mainWindow.getScoreBoardLabel(3), GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlSideBarLayout.setVerticalGroup(
            pnlSideBarLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlSideBarLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainWindow.getScoreBoardLabel(0), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainWindow.getScoreBoardLabel(1), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainWindow.getScoreBoardLabel(2), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainWindow.getScoreBoardLabel(3), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }

    private void layoutGameArea() {
        GroupLayout pnlGameAreaLayout = new GroupLayout(mainWindow.getPnlGameArea());
        mainWindow.getPnlGameArea().setLayout(pnlGameAreaLayout);
        pnlGameAreaLayout.setHorizontalGroup(
            pnlGameAreaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlGameAreaLayout.createSequentialGroup()
                .addComponent(mainWindow.getPnlSideBar(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(pnlGameAreaLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(mainWindow.getPnlBoard(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainWindow.getLblStatusMsg(), GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        pnlGameAreaLayout.setVerticalGroup(
            pnlGameAreaLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlGameAreaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(mainWindow.getPnlBoard(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mainWindow.getLblStatusMsg(), GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addComponent(mainWindow.getPnlSideBar(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }

    private void layoutContentPane() {
        GroupLayout layout = new GroupLayout(mainWindow.getContentPane());
        mainWindow.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(mainWindow.getPnlGameArea(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(mainWindow.getPnlGameArea(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }
    

    

}

