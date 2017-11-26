package pl.piotrswiatek.service;

import pl.piotrswiatek.model.data.Part;

public interface PartService {
    Part getPartById(Long id);
}
