package vn.iotstar.tuan10_bai1;

public class Response {
    private int id;
    private int position;
    private String avatar;

    public Response(int id, int position, String avaatar) {
        this.id = id;
        this.position = position;
        this.avatar = avaatar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
