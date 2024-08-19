package com.gildedrose;

/**
 * The type Default item.
 */
public class DefaultItem implements IUpdateItem {
    private final Item item;

    /**
     * Instantiates a new Default item.
     *
     * @param item the item
     */
    public DefaultItem(Item item) {
        this.item = item;
    }

    @Override
    public void updateQuality() {
        if (item.quality > 0) {
            item.quality--;
        }
        item.sellIn--;
        if (item.sellIn < 0 && item.quality > 0) {
            item.quality--;
        }
        if (item.quality < 0) {
            item.quality = 0;
        }
    }
}
