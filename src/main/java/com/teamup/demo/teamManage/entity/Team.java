package com.teamup.demo.teamManage.entity;

public class Team {
    int teamId;
    String varchar;
    int classId;
    String leader;
    int number;
    int teacherId;

    public Team(int teamId, String varchar, int classId, String leader, int number, int teacherId) {
        this.teamId = teamId;
        this.varchar = varchar;
        this.classId = classId;
        this.leader = leader;
        this.number = number;
        this.teacherId = teacherId;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getVarchar() {
        return varchar;
    }

    public void setVarchar(String varchar) {
        this.varchar = varchar;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
}
