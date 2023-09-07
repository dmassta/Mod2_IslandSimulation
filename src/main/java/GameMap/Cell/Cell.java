package GameMap.Cell;

import Abstraction.Bio.Bio;

import java.lang.reflect.Type;
import java.util.*;
import java.util.concurrent.ConcurrentMap;

public class Cell {
    private final int id;
    private final ConcurrentMap<Type, Set<? extends Bio>> localMembers;
    private final List<Cell> neighbors = new ArrayList<>();

    public Cell(ConcurrentMap<Type, Set<? extends Bio>> localMembers) {
        this.localMembers = localMembers;
        int count = 0;
        this.id = count++;
    }

    public int getId() {
        return id;
    }

    public List<Cell> getNeighbors() {
        return neighbors;
    }

    public ConcurrentMap<Type, Set<? extends Bio>> getLocalMembers() {
        return localMembers;
    }

    public void addMember() {
        Bio bio;
        Set<? extends Bio> members = new HashSet<>();
//        ThreadLocalRandom random = ThreadLocalRandom.current().nextInt();
    }

    public void addMembers() {
        Set<? extends Bio> members = new HashSet<>();
        Type bioType = members.getClass();
        localMembers.put(bioType, members);
    }
}
