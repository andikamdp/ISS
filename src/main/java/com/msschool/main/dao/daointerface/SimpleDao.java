package com.msschool.main.dao.daointerface;

import java.text.ParseException;
import java.util.List;

public interface SimpleDao <N,I> {

    I create(N data);
    N read(I id);
    List<N> read();
    I update(N data);
    void delete(I id);
}
