// Copyright 2017 Yahoo Holdings. Licensed under the terms of the Apache 2.0 license. See LICENSE in the project root.
package com.yahoo.prelude.query.parser;

import com.yahoo.collections.Tuple2;
import com.yahoo.component.Version;
import com.yahoo.language.Linguistics;
import com.yahoo.language.detect.Detector;
import com.yahoo.language.process.*;
import com.yahoo.language.simple.SimpleLinguistics;

/**
 * @author <a href="mailto:simon@yahoo-inc.com">Simon Thoresen</a>
 */
public class TestLinguistics implements Linguistics {

    public static final Linguistics INSTANCE = new TestLinguistics();
    private final Linguistics linguistics = new SimpleLinguistics();

    private TestLinguistics() {
        // hide
    }

    @Override
    public Stemmer getStemmer() {
        return linguistics.getStemmer();
    }

    @Override
    public com.yahoo.language.process.Tokenizer getTokenizer() {
        return linguistics.getTokenizer();
    }

    @Override
    public Normalizer getNormalizer() {
        return linguistics.getNormalizer();
    }

    @Override
    public Transformer getTransformer() {
        return linguistics.getTransformer();
    }

    @Override
    public Segmenter getSegmenter() {
        return new TestSegmenter();
    }

    @Override
    public Detector getDetector() {
        return linguistics.getDetector();
    }

    @Override
    public GramSplitter getGramSplitter() {
        return linguistics.getGramSplitter();
    }

    @Override
    public CharacterClasses getCharacterClasses() {
        return linguistics.getCharacterClasses();
    }

    @Override
    public Tuple2<String, Version> getVersion(Linguistics.Component component) {
        return linguistics.getVersion(component);
    }

}


