package net.jcornelio.projects.crud.io;

import java.io.File;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Oct 23, 2013
 * @version: 1.0
 **************************************************/
public class FileManager {
    
    private static FileManager fm;
    private String filename;
    private String directory;
    private String filePath;
    private File file;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public static FileManager getInstance(){
        if(fm==null){
            fm = new FileManager();
        }
        return fm;
    }
    
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

}

