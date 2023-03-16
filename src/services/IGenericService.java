package services;

import java.util.List;

public interface IGenericService<T> {
    // in danh sach
    List<T> findAll();

    // Luu
    void save(T t);

    // xoa
    void deleteById(int id);

    // tim kiem theo ID
    T findId(int id);


}
