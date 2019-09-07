package com.example.ganga.capemay;

public class Places {


        /** Image resource ID for the word */
        private int mImageResourceId = NO_IMAGE_PROVIDED;

        /** Constant value that represents no image was provided for this word */
        private static final int NO_IMAGE_PROVIDED = -1;

        int mAddressID;

    /** String resource ID for the place ID */

        int mPlaceTitleID;


        public Places(int address, int placetitle) {
          mAddressID= address;
          mPlaceTitleID = placetitle;
        }


        public Places(int address, int placetitle, int imageResourceId) {

            mAddressID= address;
            mPlaceTitleID = placetitle;
            mImageResourceId = imageResourceId;

        }

        /**
         * Get the string resource ID for the default translation of the word.
         */
        public int getmAddressID() {
            return mAddressID;
        }

        /**
         * Get the string resource ID for the Miwok translation of the word.
         */
        public int getmPlaceTitleID() {
            return mPlaceTitleID;
        }

        /**
         * Return the image resource ID of the word.
         */
        public int getImageResourceId() {
            return mImageResourceId;
        }

        /**
         * Returns whether or not there is an image for this word.
         */
        public boolean hasImage() {
            return mImageResourceId != NO_IMAGE_PROVIDED;
        }

}
