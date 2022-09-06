package com.mycom.word;

// Interface of WordCRUD
public interface ICRUD {
    public Object add(); // Create
    public void selectOne(Object obj); // Read
    public int update(Object obj); // Update
    public int delete(Object obj); // Delete
}
