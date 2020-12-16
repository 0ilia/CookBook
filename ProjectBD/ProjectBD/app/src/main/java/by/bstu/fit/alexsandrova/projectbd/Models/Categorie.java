package by.bstu.fit.alexsandrova.projectbd.Models;

import android.database.Cursor;

public class Categorie {
    private int idCategorie;
    private String name;

    private int dateLastChange;
    private int timeLastChange;
    private String status;

    public Categorie(String name){
        this.idCategorie = 0;
        this.name = name;
    }
    public Categorie(int id, String name, int dateLastChange, int timeLastChange, String status){
        this.idCategorie = id;
        this.name = name;
        this.dateLastChange = dateLastChange;
        this.timeLastChange = timeLastChange;
        this.status = status;
    }
    public Categorie(Cursor cursor){
        this.idCategorie = cursor.getInt(0);
        this.name = cursor.getString(1);
        this.dateLastChange = cursor.getInt(2);
        this.timeLastChange = cursor.getInt(3);
        this.status = cursor.getString(4);
    }

    public int getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateLastChange() {
        return dateLastChange;
    }

    public void setDateLastChange(int dateLastChange) {
        this.dateLastChange = dateLastChange;
    }

    public int getTimeLastChange() {
        return timeLastChange;
    }

    public void setTimeLastChange(int timeLastChange) {
        this.timeLastChange = timeLastChange;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString(){
        return name;
    }
}