/**
 * Storage.java
 * Created on 12.02.2003, 0:58:42 Alex
 * Package: net.sf.memoranda.util
 * 
 * @author Alex V. Alishevskikh, alex@openmechanics.net
 * Copyright (c) 2003 Memoranda Team. http://memoranda.sf.net
 */
package main.java.memoranda.util;

import interfaces.INote;
import interfaces.INoteList;
import interfaces.IProject;
import interfaces.ResourcesList;
import interfaces.TaskList;
/**
 * 
 */
/*$Id: Storage.java,v 1.4 2004/01/30 12:17:42 alexeya Exp $*/
public interface Storage {
            
    TaskList openTaskList(IProject prj);    
    void storeTaskList(TaskList tl, IProject prj);
    
    INoteList openNoteList(IProject prj);
    void storeNoteList(INoteList nl, IProject prj);
    
    void storeNote(INote note, javax.swing.text.Document doc);    
    javax.swing.text.Document openNote(INote note);
    void removeNote(INote note);
    
    String getNoteURL(INote note);
    
    void openProjectManager();    
    void storeProjectManager();
    
    void openEventsManager();
    void storeEventsManager();
    
    void openMimeTypesList();
    void storeMimeTypesList();
    
    void createProjectStorage(IProject prj);
    void removeProjectStorage(IProject prj);
   
    ResourcesList openResourcesList(IProject prj);
    void storeResourcesList(ResourcesList rl, IProject prj);
    
    void restoreContext();
    void storeContext(); 
       
}
