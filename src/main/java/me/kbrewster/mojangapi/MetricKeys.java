package me.kbrewster.mojangapi;

import lombok.Getter;

public enum MetricKeys {

    ITEM_MINECRAFT("item_sold_minecraft"),
    ITEM_COBOLT("item_sold_cobalt"),
    ITEM_SCROLLS("item_sold_scrolls"),
    PREPAID_MINECRAFT("prepaid_card_redeemed_minecraft");

    @Getter
    private String key;

    MetricKeys(String key) {
        this.key = key;
    }
}
