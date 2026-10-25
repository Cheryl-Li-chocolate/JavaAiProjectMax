package com.ithiema.demo2reflect;

import java.io.*;
import java.lang.reflect.Field;
import java.util.stream.Stream;

public class SaveObjectFrameWork {
    public static void saveObject(Object obj) throws Exception {
        OutputStream is= new FileOutputStream("object.txt",true);
        PrintStream ps = new PrintStream(is);
        Class c1 = obj.getClass();
        ps.println("======" + c1.getSimpleName() + "======");
        Field[] fields = c1.getDeclaredFields();
        for (Field field : fields){
            field.setAccessible(true);
            String fieldname=field.getName();
            Object fieldvalue=field.get(obj);
            ps.println(fieldname+":"+fieldvalue);

        }
        ps.close();



    }

    }
