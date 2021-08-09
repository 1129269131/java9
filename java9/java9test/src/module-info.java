module java9test {

    requires java9demo;//day01
    requires java.logging;//day01
    requires junit;//day01
    requires java.net.http;//day10

    exports com.koala.java;//暴露给@Test注解使用
    exports com.koala.java1;//暴露给@Test注解使用
}