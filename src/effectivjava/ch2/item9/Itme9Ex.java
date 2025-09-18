package effectivjava.ch2.item9;

import java.io.*;

public class Itme9Ex {

    // 자원이 하나인
    static String firstLinoOfFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try{
            return br.readLine();
        }finally {
            br.close();
        }
    }

    static void copy(String src, String dst) throws  IOException{
        InputStream in = new FileInputStream(src);
        try {
            OutputStream out = new FileOutputStream(dst);
            try {
                byte[] buf = new Byte[BUFFER_SIZE];
                int n;
                while ((n = in.read(buf)) >= 0)
                    out.write(buf,0,n);
            } finally {
                out.close();
            }
        }finally {
            in.close();
        }
    }

}
