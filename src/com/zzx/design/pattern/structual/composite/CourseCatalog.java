package com.zzx.design.pattern.structual.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CourseCatalog
 * @Description
 * @Author zhangzx
 * @Date 2019/5/6 11:42
 * Version 1.0
 **/
public class CourseCatalog extends CatalogComponent {
    private List<CatalogComponent> items = new ArrayList<CatalogComponent>();
    private String name;

    public CourseCatalog(String name) {
        this.name = name;
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public void print() {
        for (CatalogComponent catalogComponent : items) {
            catalogComponent.print();
        }
    }
}
