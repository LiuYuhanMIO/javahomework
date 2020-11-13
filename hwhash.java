package homework;

import java.util.ArrayList;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;

public class hwhash {
    public static byte[] SHA1Checksum(InputStream is) throws Exception {
        
        byte[] buffer = new byte[1024];
                
        MessageDigest complete = MessageDigest.getInstance("SHA-1");
        
        int numRead;
        do {
            
            numRead = is.read(buffer);

            if (numRead > 0) {
                
                complete.update(buffer, 0, numRead);
            }           
            
        } while (numRead != -1);
        
        is.close();      
        return complete.digest();
    }

    public static void dfs(String path) throws Exception {
        File dir = new File(path);
        File[] fs = dir.listFiles();
        for(int i = 0; i < fs.length; i++) {
            if(fs[i].isFile()) {
                System.out.println("file " + fs[i].getName());
                
                //求文件内容的哈希值
                FileInputStream is = new FileInputStream(fs[i]);
                byte[] sha1 = SHA1Checksum(is);

                String result = "";
                for (int j = 0; j < sha1.length; j++) {
                    result += Integer.toString(sha1[j], 16);
                }

                System.out.println(result+'\n');
            }
            if(fs[i].isDirectory()) {
                System.out.println("directory " + fs[i].getName());
                
                dfs(path + File.separator + fs[i].getName());
            }
        }
    }

    public static void main(String[] args) {
        try {
            dfs("src");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
