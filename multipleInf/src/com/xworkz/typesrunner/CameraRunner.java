package com.xworkz.typesrunner;

public class CameraRunner
{
    public static void main(String[] args) 
    {
        Camera camera = () -> {
            int photoSize = 12; 
            System.out.println("Photo captured Size: " + photoSize + " MP");
            return photoSize;
        };

        int photoSize = camera.capturePhoto();
        System.out.println("Photo size returned: " + photoSize + " MP");
    }
}


