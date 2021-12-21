package com.github.durakin.isdlabs.lab6.service.impl;

import com.github.durakin.isdlabs.lab6.entity.Apparel;
import com.github.durakin.isdlabs.lab6.entity.Faction;
import com.github.durakin.isdlabs.lab6.repository.ApparelRepository;
import com.github.durakin.isdlabs.lab6.service.ApparelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
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
    public Integer add(String apparelType, BigDecimal price, Integer inStock, String size, String sex) {
        var apparel = new Apparel();
        apparel.setApparelType(apparelType);
        apparel.setPrice(price);
        apparel.setInStock(inStock);
        apparel.setSize(size.trim().equals("") ? null : size.trim());
        apparel.setSex(sex.trim().equals("") ? null : sex);
        return this.add(apparel);
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
    public boolean update(Integer id, Integer newInStock, BigDecimal newPrice) {
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
    public List<Faction> findByMaxPrice(Double maxPrice) {
        return this.apparelRepository.findDistinctByPriceLessThan(maxPrice);
    }

    @Override
    public List<Faction> findAll() {
        return this.apparelRepository.findAll(Sort.by("id"));
    }

    @Override
    public Faction findById(Integer id) {
        return this.apparelRepository.findById(id).orElse(null);
    }

    private boolean checkId(Integer id) {
        return id != null && this.apparelRepository.existsById(id);
    }
}
