/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_12;

import javax.swing.JCheckBox;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Juan Avila
 */
public class ActionsTask {
    
    JPanel containerTask;
    
    public ActionsTask(JPanel containerTask)
    {
        this.containerTask = containerTask;
    }
    
    public void createTask(String nameTask) 
    {
        JPanel newTask = new JPanel();        
        JCheckBox newCheckBoxTask = new JCheckBox(nameTask);
        //JTextField textField = new JTextField(nameTask);
        JButton deleteButton = new JButton("edit"),
                editButton = new JButton("del");
        
        newTask.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        newCheckBoxTask.addActionListener(l -> {
            changeState(newTask, !newCheckBoxTask.isSelected());});
        deleteButton.addActionListener(e -> {deleteTask(newTask);});
        editButton.addActionListener(e -> {editTask();});
        
        newTask.add(newCheckBoxTask);
        //newTask.add(textField);
        newTask.add(deleteButton);
        newTask.add(editButton);

        containerTask.add(newTask);
        
        containerTask.revalidate();
        containerTask.repaint();
    }
    
    void editTask()
    {}
    
    void saveTask(JPanel task)
    {}
    
    void changeState(JPanel task, boolean state)
    {
        task.setEnabled(state);
        containerTask.revalidate();
        containerTask.repaint();
    }
    
    void deleteTask(JPanel task)
    {
        containerTask.remove(task);
        containerTask.revalidate();
        containerTask.repaint();
    }
    
}
