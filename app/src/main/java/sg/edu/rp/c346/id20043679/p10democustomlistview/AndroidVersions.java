package sg.edu.rp.c346.id20043679.p10democustomlistview;

public class AndroidVersions {

    String name;
    String version;

    public AndroidVersions(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Version: " + version;
    }
}
