package com.example.demo.db;

import java.util.List;
import java.util.Optional;

public interface DataRepostiory<T, ID> extends Repostory<T, ID> {





    // create, update



    T save(T data); // 기존 데이터가 없으면 업데이트 해주고 있으면 세이브 해주곘다.

    // read
    Optional<T> findById(ID id);

    List<T> findAll();

    // delete

    void delete(ID id);



}
