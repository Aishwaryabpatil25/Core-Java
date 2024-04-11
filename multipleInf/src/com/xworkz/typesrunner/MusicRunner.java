package com.xworkz.typesrunner;

import com.xworkz.differenttypesinfc.Music;

public class MusicRunner {

	
	    public static void main(String[] args)
	     {
	        Music music = (song, artist, durationInSeconds) -> {
	            System.out.println("Playing " + song + " by " + artist + " for " + durationInSeconds + " seconds.");
	            
	        };
	        music.play("Shape of You", "Ed Sheeran", 250);
	    }
	}

