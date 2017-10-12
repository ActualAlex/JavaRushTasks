package com.javarush.task.task16.task1631;


import com.javarush.task.task16.task1631.common.*;

/**
 * Created by Alex on 09.10.2017.
 */
public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes a) throws IllegalArgumentException {

        if (a == ImageTypes.JPG)
            return new JpgReader();

        if (a == ImageTypes.BMP)
            return new BmpReader();

        if (a == ImageTypes.PNG)
            return new PngReader();

        throw new IllegalArgumentException("Unknown image type");
        }

    }

