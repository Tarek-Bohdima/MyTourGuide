


package com.example.android.mytourguide;


/**
 * {@Link Attraction} represent the Attraction or site or location or place that the user wants
 * to know about with this guide.
 * It contains image of the attraction , and more details like description, phone , website ,
 * hours of business(if applicable),and location on map
 */
public class Attraction {

    /**
     * String Resource ID for Name of the Attraction
     */
    private int mAttractionNameId;

    /**
     * String Resource ID for Description for the Attraction
     */
    private int mDescriptionId;

    /**
     * String Resource ID for Website address
     */
    private int mWebsiteId;

    /**
     * String Resource ID for phone number
     */
    private int mPhoneId;

    /**
     * String Resource ID for Hours of Business
     */
    private int mBusinessHoursId;

    /**
     * double longitude location on map
     */
    private double mLongitudeId;

    /**
     * double latitude location on map
     */
    private double mLatitudeId;

    /**
     * Image resource ID for the Attraction
     */
    private int mImageResourceId;


    /**
     * Constructor to Create Attraction Object for MuseumsFragment, Restaurants, and Shopping Malls.
     *
     * @param attractionNameId is th String Resource ID for Name of the Attraction.
     * @param descriptionId    is the String Resource ID for Description for the Attraction.
     * @param websiteId        is the String Resource ID for Website address.
     * @param phoneId          is the  String Resource ID for phone number.
     * @param businessHoursId  is the String Resource ID for Hours of Business.
     * @param latitudeId       is the double latitude location on map.
     * @param longitudeId      is the double longitude location on map.
     * @param imageResourceId  is the Image resource ID for the Attraction.
     */

    public Attraction(int attractionNameId, int descriptionId, int websiteId, int phoneId, int businessHoursId,
                      double latitudeId, double longitudeId, int imageResourceId) {

        mAttractionNameId = attractionNameId;
        mDescriptionId = descriptionId;
        mWebsiteId = websiteId;
        mPhoneId = phoneId;
        mBusinessHoursId = businessHoursId;
        mLatitudeId = latitudeId;
        mLongitudeId = longitudeId;
        mImageResourceId = imageResourceId;


    }

    /**
     * Constructor to Create Attraction Object for parks.
     *
     * @param attractionNameId is the String Resource ID for Name of the Attraction.
     * @param descriptionId    is the String Resource ID for Description for the Attraction.
     * @param latitudeId       is the double latitude location on map.
     * @param longitudeId      is the double longitude location on map.
     * @param imageResourceId  is the Image resource ID for the Attraction.
     */

    public Attraction(int attractionNameId, int descriptionId, double latitudeId, double longitudeId,
                      int imageResourceId) {

        mAttractionNameId = attractionNameId;
        mDescriptionId = descriptionId;
        mLatitudeId = latitudeId;
        mLongitudeId = longitudeId;
        mImageResourceId = imageResourceId;
    }

    /**
     * Return the String Resource ID for Name of the Attraction
     */
    public int getmAttractionNameId() {
        return mAttractionNameId;
    }

    /**
     * Return the String Resource ID for Description for the Attraction
     */
    public int getmDescriptionId() {
        return mDescriptionId;
    }

    /**
     * Return the String Resource ID for Website address
     */
    public int getmWebsiteId() {
        return mWebsiteId;
    }

    /**
     * Return the  String Resource ID for phone number
     */
    public int getmPhoneId() {
        return mPhoneId;
    }

    /**
     * Return the String Resource ID for Hours of Business
     */
    public int getmBusinessHoursId() {
        return mBusinessHoursId;
    }

    /**
     * Return the double latitude location on map
     */
    public double getmLatitudeId() {
        return mLatitudeId;
    }

    /**
     * Return the double longitude location on map
     */
    public double getmLongitudeId() {
        return mLongitudeId;
    }

    /**
     * Return the Image resource ID for the Attraction
     */
    public int getmImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Return the string representation of the {@link Attraction} object
     */


    @Override
    public String toString() {


        return "\n Attraction{" +
                "mAttractionNameId='" + getmAttractionNameId() + '\'' +
                ",   mDescriptionId='" + String.valueOf(getmDescriptionId()) + '\'' +
                ",   mWebsiteId=" + getmWebsiteId() +
                ", mPhoneId=" + getmPhoneId() +
                ",   mBusinessHoursId=" + getmBusinessHoursId() +
                ",   mLatitudeId=" + (mLatitudeId) +
                ", mLongitudeId=" + (mLongitudeId) +
                ",   mImageResourceId=" + getmImageResourceId() +
                '}' + "\n";
    }
}
