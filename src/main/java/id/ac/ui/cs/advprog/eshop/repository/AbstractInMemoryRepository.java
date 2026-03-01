package id.ac.ui.cs.advprog.eshop.repository;

import id.ac.ui.cs.advprog.eshop.util.IdGenerator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class AbstractInMemoryRepository<T> implements BaseRepository<T> {

    protected final List<T> dataStore = new ArrayList<>();

    protected abstract String getId(T item);
    protected abstract void setId(T item, String id);
    protected abstract void copyField(T existingItem, T updatedItem);

    @Override
    public T create(T item){
        if (getId(item) == null){
            setId(item, IdGenerator.generateId());
        }
        dataStore.add(item);
        return item;
    }

    @Override
    public Iterator<T> findAll(){
        return dataStore.iterator();
    }

    @Override
    public T findById(String id){
        for (T item : dataStore){
            if (getId(item).equals(id)){
                return item;
            }
        }
        return null;
    }

    @Override
    public T update(String id, T updatedItem){
        T existingItem = findById(id);
        if (existingItem != null){
            copyField(existingItem, updatedItem);
            return existingItem;
        }
        return null;
    }

    @Override
    public void deleteById(String id){
        dataStore.removeIf(item -> getId(item).equals(id));
    }
}
