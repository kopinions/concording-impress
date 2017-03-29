package com.thoughtworks.concording.extensions;
import org.concordion.api.Resource;
import org.concordion.api.extension.ConcordionExtender;
import org.concordion.api.extension.ConcordionExtension;
public class ImpressExtension implements ConcordionExtension {
    @Override
    public void addTo(ConcordionExtender concordionExtender) {
        concordionExtender.withLinkedCSS("/styles.css", new Resource("/styles.css"));
        concordionExtender.withResource("/icon/menu.png", new Resource("/icon/menu.png"));
    }
}