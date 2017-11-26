package pl.piotrswiatek.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.piotrswiatek.dao.PartDao;
import pl.piotrswiatek.model.data.Part;
import pl.piotrswiatek.service.PartService;

@Service
public class PartServiceImpl implements PartService {

    private PartDao partDao;

    @Autowired
    public PartServiceImpl (PartDao partDao){
        this.partDao = partDao;
    }

    @Override
    public Part getPartById(Long id) {
        return partDao.get(id);
    }
}
