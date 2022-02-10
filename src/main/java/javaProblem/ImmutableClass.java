package javaProblem;

public final class ImmutableClass {

    public String getName() {
        return name;
    }

    public int getRegNo() {
        return regNo;
    }

    private final String name;
    private final int regNo;

    public ImmutableClass(String name, int regNo) {
        this.name = name;
        this.regNo = regNo;
    }

}
