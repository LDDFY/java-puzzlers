import java.io.*;

/**
 * 由in.close()引起的异常导致流无法关闭。
 */
public class Copy {
    static void copy(String src, String dest) throws IOException {
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(src);
            out = new FileOutputStream(dest);
            byte[] buf = new byte[1024];
            int n;
            while ((n = in.read(buf)) > 0)
                out.write(buf, 0, n);
        } finally {
            if (in != null) {
                in.close();
                //修改为
                try {
                    in.close();
                } catch (IOException e) {

                }
            }

            if (out != null) {
                out.close();
                //修改为
                try {
                    out.close();
                } catch (IOException e) {

                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        if (args.length != 2)
            System.out.println("Usage: java Copy <source> <dest>");
        else
            copy(args[0], args[1]);
    }
}
