package com.ithima.demo14commonsIO;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class CommonsDemo1 {
    public static void main(String[] args) throws Exception {
        FileUtils.copyFile(new File("day03-file-io/src/com/ithima/demo14commonsIO/1.txt"), new File("day03-file-io/src/com/ithima/demo14commonsIO/2.txt"));
        Files.copy(Path.of("day03-file-io/src/com/ithima/demo14commonsIO/1.txt"), Path.of("day03-file-io/src/com/ithima/demo14commonsIO/2.txt"));

        //FileUtils.deleteDirectory(new File("day03-file-io/src/com/ithima/demo14commonsIO/1.txt"));
    }
}
