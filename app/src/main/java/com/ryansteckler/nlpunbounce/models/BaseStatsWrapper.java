package com.ryansteckler.nlpunbounce.models;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Created by rsteckler on 10/3/14.
 */
class BaseStatsWrapper implements Serializable {
    long mRunningSince = -1;
    HashMap<String, BaseStats> mStats = null;
}
