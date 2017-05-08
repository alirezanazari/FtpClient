package com.mobasherin.porsoon.handler;

import android.util.Log;

import org.jibble.simpleftp.SimpleFTP;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Alireza on 3/13/17.
 */
public class FtpClient {

    String url , user , pass , data , directoty;
    File file;
    int flag ;

    public FtpClient(String tmpUrl , String tmpUser  , String tmpPass , String tmpDirectory ,String filePath , File tmpFile) {

        url = tmpUrl;
        user= tmpUser;
        pass= tmpPass;
        data= filePath;
        directoty = tmpDirectory;
        file =tmpFile;
    }

    public void upload(){


        try {
            SimpleFTP ftp = new SimpleFTP();

            ftp.connect(url , 21 , user , pass);
            ftp.bin();
            ftp.cwd(directoty);
            ftp.stor(file);
            ftp.disconnect();
            flag = 1;

        } catch (IOException e) {
            flag = 0;
            e.printStackTrace();
        }

    }

    public boolean getResult(){

        try {
            if (flag == 0)
                return false;
            else if (flag == 1)
                return true;
            else
                return false;
        }catch (Exception e){
            return  false;
        }
    }
}
