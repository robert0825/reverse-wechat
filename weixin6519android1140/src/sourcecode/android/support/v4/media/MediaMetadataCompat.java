package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.e.a;

public final class MediaMetadataCompat
  implements Parcelable
{
  public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = new Parcelable.Creator() {};
  public static final a<String, Integer> ue;
  private static final String[] uf;
  private static final String[] ug;
  private static final String[] uh;
  public final Bundle ui;
  
  static
  {
    a locala = new a();
    ue = locala;
    locala.put("android.media.metadata.TITLE", Integer.valueOf(1));
    ue.put("android.media.metadata.ARTIST", Integer.valueOf(1));
    ue.put("android.media.metadata.DURATION", Integer.valueOf(0));
    ue.put("android.media.metadata.ALBUM", Integer.valueOf(1));
    ue.put("android.media.metadata.AUTHOR", Integer.valueOf(1));
    ue.put("android.media.metadata.WRITER", Integer.valueOf(1));
    ue.put("android.media.metadata.COMPOSER", Integer.valueOf(1));
    ue.put("android.media.metadata.COMPILATION", Integer.valueOf(1));
    ue.put("android.media.metadata.DATE", Integer.valueOf(1));
    ue.put("android.media.metadata.YEAR", Integer.valueOf(0));
    ue.put("android.media.metadata.GENRE", Integer.valueOf(1));
    ue.put("android.media.metadata.TRACK_NUMBER", Integer.valueOf(0));
    ue.put("android.media.metadata.NUM_TRACKS", Integer.valueOf(0));
    ue.put("android.media.metadata.DISC_NUMBER", Integer.valueOf(0));
    ue.put("android.media.metadata.ALBUM_ARTIST", Integer.valueOf(1));
    ue.put("android.media.metadata.ART", Integer.valueOf(2));
    ue.put("android.media.metadata.ART_URI", Integer.valueOf(1));
    ue.put("android.media.metadata.ALBUM_ART", Integer.valueOf(2));
    ue.put("android.media.metadata.ALBUM_ART_URI", Integer.valueOf(1));
    ue.put("android.media.metadata.USER_RATING", Integer.valueOf(3));
    ue.put("android.media.metadata.RATING", Integer.valueOf(3));
    ue.put("android.media.metadata.DISPLAY_TITLE", Integer.valueOf(1));
    ue.put("android.media.metadata.DISPLAY_SUBTITLE", Integer.valueOf(1));
    ue.put("android.media.metadata.DISPLAY_DESCRIPTION", Integer.valueOf(1));
    ue.put("android.media.metadata.DISPLAY_ICON", Integer.valueOf(2));
    ue.put("android.media.metadata.DISPLAY_ICON_URI", Integer.valueOf(1));
    ue.put("android.media.metadata.MEDIA_ID", Integer.valueOf(1));
    uf = new String[] { "android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER" };
    ug = new String[] { "android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART" };
    uh = new String[] { "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI" };
  }
  
  public MediaMetadataCompat(Parcel paramParcel)
  {
    this.ui = paramParcel.readBundle();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeBundle(this.ui);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\android\support\v4\media\MediaMetadataCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */