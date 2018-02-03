package com.company;

import java.util.ArrayList;
import java.util.List;

public interface ICapability {
    List<String> write();
    void populate(List<String> savedValues);
}
