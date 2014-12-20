package hackaroomie.att.com.hackaroomie.model;

/**
 * Created by Rohith Ravindranath on 12/20/14.
 * Represents the base user for the app
 */


public class User {

    private int id;
    private String mSocialId;

    private String mDisplayName = "";
    private String mPublicProfileUrl = "";
    private String mPublicProfilePhoto= "";
    private String mCurrentLocation = "";
    private String mProfileType = "";
    private String mEmail = "";
    private String mName = "";
    private String mPublicProfile = "";
    private String mCoverPhoto = "";


    public User(){

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSocialId(String id) { this.mSocialId = id; }

    public void setDisplayName(String displayName) {
        this.mDisplayName = displayName;
    }

    public void setLocation(String location) {
        this.mCurrentLocation = location;
    }

    public void setPhotoUrl(String photoUrl) {
        this.mPublicProfilePhoto = photoUrl;
    }

    public void setPublicProfile(String profile) {
        this.mPublicProfile = profile;
    }

    public void setEmail(String email) {
        this.mEmail = email;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public String getCoverPhoto() {
        return mCoverPhoto;
    }

    public void setCoverPhoto(String coverPhoto) {
        this.mCoverPhoto = coverPhoto;
    }

}
