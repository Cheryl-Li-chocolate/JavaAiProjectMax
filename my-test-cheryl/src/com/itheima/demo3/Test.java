package com.itheima.demo3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Test {
    public static void main(String[] args) throws Exception {
        String info = "10001,张无忌,男,2023-07-22 11:11:12,东湖-黄鹤楼#10002,赵敏,女,2023-07-22 11:11:12,东湖#10003,周芷若,女,2023-07-22 11:11:12,东湖-黄鹤楼#10004,小昭,女,2023-07-22 11:15:12,东湖-木兰文化区#10005,殷离,女,2023-07-22 14:10:08,归元禅寺-黄鹤楼#10006,韦一笑,男,2023-07-22 12:18:19,归元禅寺#10007,谢逊,男,2023-07-22 22:14:19,木兰文化区-黄鹤楼#10008,范遥,男,2023-07-22 17:12:56,归元禅寺-木兰文化区#10009,灭绝师太,女,2023-07-22 22:22:19,东湖-归元禅寺#10010,张三丰,男,2023-07-22 22:22:19,木兰文化区";

        List<Student> students = getInfo(info);
        Map<String,Integer> posMap=getPos(students);
        System.out.println(posMap);
        List<Student> otherPosStudents=getMaxPos(posMap,students);
        System.out.println("不在最多人数位置的学生有:"+otherPosStudents);


    }

    public static List<Student> getInfo(String info) {
        String[] infos = info.split("#");
        List<Student> students = new ArrayList<>();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        for (String s : infos) {
            String[] studentinfo = s.split(",");
            students.add(new Student(Long.parseLong(studentinfo[0]), studentinfo[1], studentinfo[2], LocalDateTime.parse(studentinfo[3], fmt), List.of(studentinfo[4].split("-"))));
        }
        return students;

    }

    public static Map<String, Integer> getPos(List<Student> students) {
        Map<String, Integer> posMap = new HashMap<>();
        for (Student student : students) {
            for (int i = 0; i < student.getAddress().size(); i++) {
                String pos = student.getAddress().get(i);
                if (posMap.containsKey(pos)) {
                    posMap.put(pos, posMap.get(pos) + 1);
                } else {
                    posMap.put(pos, 1);
                }
            }
        }
        return posMap;
    }
    public static List<Student> getMaxPos(Map<String,Integer> posMap, List<Student> students){
        List<Student> otherPosStudents =new ArrayList<>();
        Map.Entry<String, Integer> maxPos=posMap.entrySet().stream().max(Map.Entry.comparingByValue()).orElse(null);
        System.out.println("人数最多"+maxPos.getKey()+"，出现次数为"+maxPos.getValue());
        for(Student student:students){
            if (!student.getAddress().contains(maxPos.getKey())){
                otherPosStudents.add(student);
            }
        }


        return otherPosStudents;
    }
}


@Data
@AllArgsConstructor
@NoArgsConstructor
class Student {
    private long id;
    private String name;
    private String sex;
    private LocalDateTime birthday;
    private List<String> address;


    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address=" + address +
                '}';
    }
}

//return students.stream().filter(!student->getAddress().contains(maxPos.getKey())).forEach(student->System.out.println(student.getName()+"不在最多人数位置"+maxPos.getKey()));