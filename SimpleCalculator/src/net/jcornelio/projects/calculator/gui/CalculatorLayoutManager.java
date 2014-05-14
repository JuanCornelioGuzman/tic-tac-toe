package net.jcornelio.projects.calculator.gui;

import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Sep 17, 2013
 * @version: 1.0
 **************************************************/
public class CalculatorLayoutManager {
    
    private CalculatorWindow calcGUI;
    
    public CalculatorLayoutManager(CalculatorWindow calcGUI) {
        this.calcGUI = calcGUI;
    }
    
    public void performLayout(){
        GroupLayout layout = new GroupLayout(calcGUI.getContentPane());
        calcGUI.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(calcGUI.getTxtScreen())
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                        .addComponent(calcGUI.getBtnClear(), GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(calcGUI.getBtnNumber(1), GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(calcGUI.getBtnNumber(4), GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(calcGUI.getBtnNumber(7), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(calcGUI.getBtnNumber(0), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(calcGUI.getBtnNumber(2), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(calcGUI.getBtnNumber(8), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(calcGUI.getBtnNumber(5), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(calcGUI.getBtnDot(), GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(calcGUI.getBtnNumber(3), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(calcGUI.getBtnNumber(9), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(calcGUI.getBtnNumber(6), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(calcGUI.getBtnBackspace(), GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(calcGUI.getBtnOperator(1), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(calcGUI.getBtnOperator(2), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(calcGUI.getBtnOperator(0), GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                    .addComponent(calcGUI.getBtnOperator(3), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(calcGUI.getBtnEqual(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(calcGUI.getTxtScreen(), GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(calcGUI.getBtnClear())
                    .addComponent(calcGUI.getBtnBackspace())
                    .addComponent(calcGUI.getBtnOperator(0)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(calcGUI.getBtnNumber(7))
                    .addComponent(calcGUI.getBtnNumber(8))
                    .addComponent(calcGUI.getBtnNumber(9))
                    .addComponent(calcGUI.getBtnOperator(1)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(calcGUI.getBtnNumber(4))
                    .addComponent(calcGUI.getBtnNumber(5))
                    .addComponent(calcGUI.getBtnNumber(6))
                    .addComponent(calcGUI.getBtnOperator(2)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(calcGUI.getBtnNumber(1))
                    .addComponent(calcGUI.getBtnNumber(2))
                    .addComponent(calcGUI.getBtnNumber(3))
                    .addComponent(calcGUI.getBtnOperator(3)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(calcGUI.getBtnNumber(0))
                    .addComponent(calcGUI.getBtnDot())
                    .addComponent(calcGUI.getBtnEqual()))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        calcGUI.pack();
    }
}

