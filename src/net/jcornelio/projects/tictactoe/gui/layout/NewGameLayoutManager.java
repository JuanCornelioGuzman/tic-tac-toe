package net.jcornelio.projects.tictactoe.gui.layout;

import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import net.jcornelio.projects.tictactoe.gui.NewGameWindow;
import net.jcornelio.projects.tictactoe.util.WindowHelper;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Oct 3, 2013
 * @version: 1.0
 **************************************************/
public class NewGameLayoutManager implements LayoutManager {

    private NewGameWindow frame;

    public NewGameLayoutManager(NewGameWindow frame) {
        this.frame = frame;
    }
    
    @Override
    public void performLayout() {
        layoutPnlTop();
        layoutPnlBottom();
        layoutContentPane();
        frame.pack();
        WindowHelper.setStartUpLocationToCenter(frame);
    }

    private void layoutPnlTop() {
        GroupLayout pnlTopLayout = new GroupLayout(frame.getPnlTop());
        frame.getPnlTop().setLayout(pnlTopLayout);
        pnlTopLayout.setHorizontalGroup(
            pnlTopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addGroup(pnlTopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTopLayout.createSequentialGroup()
                        .addContainerGap(22, Short.MAX_VALUE)
                        .addComponent(frame.getLblUsername())
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(frame.getTxtName(), GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlTopLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(pnlTopLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(frame.getLblDifficulty())
                            .addComponent(frame.getLblMarkColor())
                            .addComponent(frame.getLblMarkSymbol()))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlTopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(frame.getCmbSymbol(), GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                            .addComponent(frame.getTxtColor(), GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                            .addComponent(frame.getCmbDifficulty(), GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlTopLayout.setVerticalGroup(
            pnlTopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTopLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(frame.getLblUsername())
                    .addComponent(frame.getTxtName(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTopLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(frame.getCmbSymbol(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(frame.getLblMarkSymbol()))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTopLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(frame.getTxtColor(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(frame.getLblMarkColor()))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlTopLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(frame.getCmbDifficulty(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(frame.getLblDifficulty()))
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }

    private void layoutPnlBottom() {
        GroupLayout pnlBottomLayout = new GroupLayout(frame.getPnlBottom());
        frame.getPnlBottom().setLayout(pnlBottomLayout);
        pnlBottomLayout.setHorizontalGroup(
            pnlBottomLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, pnlBottomLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(frame.getBtnStartGame())
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frame.getBtnCancel())
                .addContainerGap())
        );
        pnlBottomLayout.setVerticalGroup(
            pnlBottomLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(pnlBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBottomLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(frame.getBtnStartGame(), GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                    .addComponent(frame.getBtnCancel(), GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }

    private void layoutContentPane() {
        GroupLayout layout = new GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(239, 239, 239))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                    .addComponent(frame.getPnlBottom(), GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(frame.getPnlTop(), GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(frame.getPnlTop(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(frame.getPnlBottom(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
    }
    
}

