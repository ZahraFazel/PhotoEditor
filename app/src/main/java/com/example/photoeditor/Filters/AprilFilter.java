package com.example.photoeditor.Filters;


import com.zomato.photofilters.geometry.Point;
import com.zomato.photofilters.imageprocessors.Filter;
import com.zomato.photofilters.imageprocessors.subfilters.BrightnessSubFilter;
import com.zomato.photofilters.imageprocessors.subfilters.ContrastSubFilter;
import com.zomato.photofilters.imageprocessors.subfilters.ToneCurveSubFilter;

public class AprilFilter
{
    public static String name = "April";

    public static Filter getFilter()
    {
        Point[] blueKnots = new Point[4];
        Point[] redKnots = new Point[4];

        blueKnots[0] = new Point(0f, 0f);
        blueKnots[1] = new Point(39f, 70f);
        blueKnots[2] = new Point(150f, 200f);
        blueKnots[3] = new Point(255f, 255f);

        redKnots[0] = new Point(0f, 0f);
        redKnots[1] = new Point(45f, 64f);
        redKnots[2] = new Point(170f, 190f);
        redKnots[3] = new Point(255f, 255f);

        Filter filter = new Filter();
        filter.addSubFilter(new ContrastSubFilter(1.5f));
        filter.addSubFilter(new BrightnessSubFilter(5));
        filter.addSubFilter(new ToneCurveSubFilter(null, redKnots, null, blueKnots));
        return filter;
    }
}
