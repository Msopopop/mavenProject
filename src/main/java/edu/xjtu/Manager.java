package edu.xjtu;

import edu.xjtu.Utils.PRIVILEGE;
import org.jetbrains.annotations.NotNull;

public class Manager extends Person{
    public Manager(int _ID, @NotNull String _name, int _salary, int _rank, PRIVILEGE privilege) {
        super(_ID, _name, _salary, _rank);
        this.privilege = privilege;
    }
    public Manager(@NotNull Person p, PRIVILEGE privilege) {
        super(p.getID(), p.getName(), p.getSalary(), p.getRank());
        this.privilege = privilege;
    }
    public PRIVILEGE getPrivilege() {
        return privilege;
    }

    public void setPrivilege(PRIVILEGE privilege) {
        this.privilege = privilege;
    }

    private PRIVILEGE privilege = PRIVILEGE.NON;

}
