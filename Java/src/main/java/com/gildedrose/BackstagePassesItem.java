package com.gildedrose;

/**
 * The type Backstage passes.
 */
public class BackstagePassesItem implements IUpdateItem {
    private final Item item;

    /**
     * Instantiates a new Backstage passes.
     *
     * @param item the item
     */
    public BackstagePassesItem(Item item) {
        this.item = item;
    }
    @Override
    public void updateQuality() {
        if (item.quality < 50) {
            item.quality++;
            if (item.sellIn < 11 && item.quality < 50) {
                item.quality++;
            }
            if (item.sellIn < 6 && item.quality < 50) {
                item.quality++;
            }
        }
        item.sellIn--;
        // Prevents quality from becoming negative
        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }
}
