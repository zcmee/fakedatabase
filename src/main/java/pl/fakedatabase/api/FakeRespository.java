package pl.fakedatabase.api;

import java.util.List;

/**
 * Created by SkyNET on 2017-10-29.
 */
public interface FakeRespository<T> {
    T find(Integer id);
    List<T> find(String id);
    List<T> findAll();
}

