package com.ithiema.demo4proxy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Star implements StarService {
    String name;
    @Override
    public void sing(String name) {
        System.out.println("明星 正在唱歌 " + name);
    }

    @Override
    public String dance() {
        System.out.println("明星 正在跳舞 ");
        return "跳舞很专业";
    }
}
