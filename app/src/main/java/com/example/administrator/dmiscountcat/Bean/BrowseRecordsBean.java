package com.example.administrator.dmiscountcat.Bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;

public class BrowseRecordsBean implements MultiItemEntity {
    public static final int TYPE_TIME = 1;
    public static final int TYPE_DATA = 2;

    private int itemType;

    public BrowseRecordsBean(int itemType) {
        this.itemType = itemType;
    }

    @Override
    public int getItemType() {
        return itemType;
    }
}
