package com.ithima.demo5fileoutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputStreamDemo1 {
    //目标学会使用文件字节输出流
    public static void main(String[] args) throws Exception {
        //1.创建文件字节输出流对象
        //2.调用write方法写数据
        //3.释放资源
        OutputStream os=new FileOutputStream("day03-file-io/src/com/ithima/demo5fileoutputStream/02-out.txt",true);
        os.write(97);
        os.write(98);

        os.write("\r\n".getBytes());
        byte[] bytes={97,98,99,100,101};
        os.write(bytes);

        os.write("\r\n".getBytes());
        os.write(bytes,1,3);

        byte[] strbytes="我".getBytes();
        os.write(strbytes,0,1);

        os.close();



    }
}
