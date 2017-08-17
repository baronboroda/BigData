package com.zelenin.labs.lab_5_Generics;

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 8/17/2017.
 */
public abstract class Media {
}

class Book extends Media {}

class Video extends Media {}

class Newspaper extends Media {}

class Library<T extends Media> {
    private List<T> folder = new ArrayList<T>();

    public void addMedia(T media) {
        folder.add(media);
    }

    public T retrieveLast() {
        if(folder.size() > 0) {
            return folder.get(folder.size() - 1);
        }
        return null;
    }
}

class Library2 {
    private Collection<Media> folder;
}