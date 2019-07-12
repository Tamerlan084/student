public enum StudentEnum {
    STUDENTS("students"),
    LOGIN("login"),
    FACILITY("facility"),
    STUDENT("student"),
    NAME("name"),
    TELEPHONE("telephone"),
    COUNTRY("country"),
    CITY("city"),
    STREET("street"),
    ADDRESS("address")
    ;
    private String value;

    StudentEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
