package jsonstart;

import cn.afterturn.easypoi.excel.annotation.Excel;

public class Caseinfo {
        @Excel(name = "序号")
        private int id ;
        @Excel(name = "用户名")
        private String username;
        @Excel(name = "密码")
        private String password;
        @Excel(name = "预期结果")
        private String expectedresults;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getExpectedresults() {
        return expectedresults;
    }

    public void setExpectedresults(String expectedresults) {
        this.expectedresults = expectedresults;
    }

    @Override
    public String toString() {
        return "Caseinfo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", expectedresults='" + expectedresults + '\'' +
                '}';
    }
}
