package com.amazon.ata.unittesting.texttruncator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Test the <code>TextTruncator</code> behavior.
 */
public class TextTruncatorTest {
    @Test
    public void truncateTo_stringLongerThanNumChars_shortensToFirstNumChars() {
        // GIVEN
        String original = "One two three four five";
        TextTruncator truncator = new TextTruncator(original);

        // WHEN
        String truncatedString = truncator.truncateTo(7);

        // THEN
        Assertions.assertEquals("One two", truncatedString,
                                "Expected to truncate to the first 7 characters");

    }

    /* ADD YOUR TESTS HERE */
    @Test
    public void methodUnderTest_descriptiveTestCondition_expectedBehavior() {
        // GIVEN
        TextTruncator truncator = new TextTruncator(null);
        // WHEN
        String truncatedString = truncator.truncateTo(10);
        // THEN
        Assertions.assertEquals("", truncatedString,
                "Expected doesn't fail on a null String");

    }

    @Test
    public void methodUnderTest_descriptiveTestCondition_expectedBehavior2() {
        // GIVEN
        String name = "ives";
        TextTruncator truncator = new TextTruncator(name);
        // WHEN
        String truncatedString = truncator.truncateTo(4);
        // THEN
        Assertions.assertEquals("ives", truncatedString,
                "Expected to returns a truncated string of the desired length");

    }
    @Test
    public void methodUnderTest_descriptiveTestCondition_expectedBehavior3() {
        // GIVEN
        String quick = "quickly";
        TextTruncator truncator = new TextTruncator(quick);
        // WHEN
        String truncatedString = truncator.truncateTo(8,"quickly");
        // THEN
        Assertions.assertEquals("quickly", truncatedString,
                "Expected doesn't append suffix if the original String is short enough");

    }

}

