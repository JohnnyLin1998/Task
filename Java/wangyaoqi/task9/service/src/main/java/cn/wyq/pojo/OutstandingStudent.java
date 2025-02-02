package cn.wyq.pojo;

import org.oasisopen.sca.annotation.Remotable;

import java.io.Serializable;

public class OutstandingStudent implements Serializable {
    private static final long serialVersionUID = 1883838732853579826L;

    public int id;
    public String name;
    public String note;
    public String photo;

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "OutstandingStudent{"+
                "id="+id+
                ",name='"+name+'\''+
                ",note="+note+'\"'+
                ",photo="+photo+'\''+
                "}";
    }
}
