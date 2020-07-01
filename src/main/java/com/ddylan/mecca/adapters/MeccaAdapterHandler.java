package com.ddylan.mecca.adapters;

import com.ddylan.mecca.Mecca;

public class MeccaAdapterHandler {

    public MeccaAdapterHandler(Mecca mecca) {
        mecca.getLibraryPlugin().getNametagHandler().registerProvider(new MeccaNametagAdapter());
        mecca.getLibraryPlugin().getScoreboardHandler().setConfiguration(MeccaScoreboardAdapter.create());
//        mecca.getXLib().getTabHandler().setLayoutProvider(new MeccaLayoutProvider());
    }

}
