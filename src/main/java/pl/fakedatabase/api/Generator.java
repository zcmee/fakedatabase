package pl.fakedatabase.api;

import java.util.List;

/**
 * Created by SkyNET on 2017-10-29.
 */
public interface Generator<T> {
    List<T> generate();
}
