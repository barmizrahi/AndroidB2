package com.example.textformatter;

import android.graphics.Color;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;

public class TextFormatter {

    /**
     * Formats the input text based on specified rules and options.
     *
     * @param input      The input text to be formatted.
     * @param uppercase  Whether to convert the text to uppercase.
     * @param lowercase  Whether to convert the text to lowercase.
     * @param capitalize Whether to capitalize the first letter of each word.
     * @param color      The color code (e.g., #RRGGBB) to apply to the text. Use null for default color.
     * @return The formatted text.
     */
    public Spannable formatText(String input, boolean uppercase, boolean lowercase, boolean capitalize, String color) {
        if (uppercase) {
            input = input.toUpperCase();
        }
        if (lowercase) {
            input = input.toLowerCase();
        }
        if (capitalize) {
            input = capitalizeText(input);
        }

        SpannableStringBuilder spannableBuilder = new SpannableStringBuilder(input);

        applyBoldStyle(spannableBuilder);
        applyItalicStyle(spannableBuilder);
        applyStrikeThroughStyle(spannableBuilder);
        applyUnderlineStyle(spannableBuilder);


        if (color != null) {
            applyTextColor(spannableBuilder, color);
        }

        return spannableBuilder;
    }

    private void applyBoldStyle(SpannableStringBuilder spannableBuilder) {
        applyStyle(spannableBuilder, "*", new StyleSpan(android.graphics.Typeface.BOLD));
    }

    private void applyItalicStyle(SpannableStringBuilder spannableBuilder) {
        applyStyle(spannableBuilder, "_", new StyleSpan(android.graphics.Typeface.ITALIC));
    }

    private void applyStrikeThroughStyle(SpannableStringBuilder spannableBuilder) {
        applyStyle(spannableBuilder, "~", new StrikethroughSpan());
    }

    private void applyUnderlineStyle(SpannableStringBuilder spannableBuilder) {
        applyStyle(spannableBuilder, "^", new UnderlineSpan());
    }

    private void applyStyle(SpannableStringBuilder spannableBuilder, String symbol, Object span) {
        String text = spannableBuilder.toString();
        int startIndex = -1;
        int endIndex = -1;

        while ((startIndex = text.indexOf(symbol, startIndex + 1)) != -1) {
            endIndex = text.indexOf(symbol, startIndex + 1);

            if (endIndex != -1) {
                spannableBuilder.setSpan(span, startIndex + 1, endIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                spannableBuilder.delete(endIndex, endIndex + 1);
                spannableBuilder.delete(startIndex, startIndex + 1);
                text = spannableBuilder.toString();
            } else {
                break;
            }
        }
    }

    private String capitalizeText(String input) {
        StringBuilder output = new StringBuilder();
        boolean capitalizeNext = true;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isLetter(c) && capitalizeNext) {
                output.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                output.append(c);
            }

            if (!Character.isLetter(c)) {
                capitalizeNext = true;
            }
        }

        return output.toString();
    }

    private void applyTextColor(SpannableStringBuilder spannableBuilder, String color) {
        int startIndex = 0;
        int endIndex = spannableBuilder.length();

        spannableBuilder.setSpan(new ForegroundColorSpan(Color.parseColor(color)),
                startIndex, endIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
    }
}
