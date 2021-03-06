package org.northshore.cbri.phrase;

import static org.junit.Assert.*

import org.junit.Ignore
import org.junit.Test
import org.northshore.cbri.dict.phrase.PhraseTree
import org.northshore.cbri.dict.phrase.PhraseTreeElement

import com.wcohen.ss.AbstractStringDistance
import com.wcohen.ss.JaroWinkler
import com.wcohen.ss.SoftTFIDF
import com.wcohen.ss.api.Tokenizer
import com.wcohen.ss.tokens.SimpleTokenizer

class PhraseTreeTest {

	@Ignore
	@Test
	public void testApproximateMatches() {
		PhraseTree phrases = new PhraseTree()
		phrases.addPhrase('tubular adenoma'.split(' '))
		phrases.addPhrase('tubular villous adenoma'.split(' '))
		
		Tokenizer tokenizer = new SimpleTokenizer(false,true);
		AbstractStringDistance dist = new SoftTFIDF(tokenizer, new JaroWinkler(), 0.8);
		
		Collection<PhraseTreeElement> matches = phrases.getApproximateMatches('tubuolar adenoma'.split(' '), dist, 0.9)
		matches.each { println "Match found: $it.word" }
	}
}
