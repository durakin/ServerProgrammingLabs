package com.github.durakin.serverprogramming.lab4.service.impl;

import com.github.durakin.serverprogramming.lab4.entity.Apparel;
import com.github.durakin.serverprogramming.lab4.repository.ApparelRepository;
import com.github.durakin.serverprogramming.lab4.service.ApparelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApparelServiceImpl implements ApparelService {
    @Autowired
    private ApparelRepository apparelRepository;

    @Override
    public Integer add(Apparel apparel) {
        this.apparelRepository.save(apparel);
        return apparel.getId();
    }

    @Override
    public boolean delete(Integer id) {
        if (!checkId(id)) {
            return false;
        }
        this.apparelRepository.deleteById(id);
        return true;
    }

    @Override
    public boolean update(Integer id, Integer newInStock, Double newPrice) {
        var oldApparel = this.findById(id);
        if (oldApparel == null) return false;
        if (newPrice != null) {
            oldApparel.setPrice(newPrice);
        }
        if (newInStock != null) {
            oldApparel.setInStock(newInStock);
        }
        this.apparelRepository.save(oldApparel);
        return true;
    }

    @Override
    public List<Apparel> findByMaxPrice(Double maxPrice) {
        return this.apparelRepository.findDistinctByPriceLessThan(maxPrice);
    }

    @Override
    public List<Apparel> findAll() {
        return this.apparelRepository.findAll(Sort.by("id"));
    }

    @Override
    public Apparel findById(Integer id) {
        return this.apparelRepository.findById(id).orElse(null);
    }

    private boolean checkId(Integer id) {
        return id != null && this.apparelRepository.existsById(id);
    }
}
