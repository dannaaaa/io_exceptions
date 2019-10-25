package com.spartaglobal.io_exceptions;

import java.io.*;

public class BufferedFileManager {

    public void readerWriter() throws IOException {
        //will manager the file
        File file = new File("resources/TestFile.txt");
        //using the buffer reader to parse the new reader which is the file
        //the buffer is a memory block
        BufferedReader reader = new BufferedReader(new FileReader(file));

        //create new file
        File newFile = new File("resources/newFile.txt");
        //create writer for the newfile
        BufferedWriter writer = new BufferedWriter(new FileWriter(newFile));
        //writer will overwrite very time 

        String line;

        while(( line = reader.readLine()) != null){
            if(!line.equals("")){
                writer.append(line.trim() + "\n");
                System.out.println("friyay I've added a new line. Its lit!");

            }
        }

        writer.flush();
        writer.close();
        reader.close();
    }
}
