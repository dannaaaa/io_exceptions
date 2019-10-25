package com.spartaglobal.io_exceptions;

import javax.imageio.IIOException;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
//        ByteReaderManager byteReaderManager = new ByteReaderManager();
//        //byteReaderManager.readStream();
//        byteReaderManager.charReader();

        BufferedFileManager bufferedFileManager = new BufferedFileManager();
        try{
            bufferedFileManager.readerWriter();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
