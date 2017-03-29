package com.thoughtworks.concording.fixtures;

import com.thoughtworks.concording.extensions.ImpressExtension;
import org.concordion.api.ConcordionResources;
import org.concordion.api.extension.Extensions;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

import java.util.HashMap;
import java.util.Map;


@RunWith(ConcordionRunner.class)
@Extensions(ImpressExtension.class)
@ConcordionResources(includeDefaultStyling = false)
public class OrderFixture {

    private Map<String, Object> application;

    public Map products() {
        return new HashMap<String, String>();
    }
}
