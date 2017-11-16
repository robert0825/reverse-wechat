package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class MediaDescriptionCompat
  implements Parcelable
{
  public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new Parcelable.Creator() {};
  private final Bundle mExtras;
  private final String tW;
  private final CharSequence tX;
  private final CharSequence tY;
  private final CharSequence tZ;
  private final Bitmap ua;
  private final Uri ub;
  private final Uri uc;
  private Object ud;
  
  public MediaDescriptionCompat(Parcel paramParcel)
  {
    this.tW = paramParcel.readString();
    this.tX = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.tY = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.tZ = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.ua = ((Bitmap)paramParcel.readParcelable(null));
    this.ub = ((Uri)paramParcel.readParcelable(null));
    this.mExtras = paramParcel.readBundle();
    this.uc = ((Uri)paramParcel.readParcelable(null));
  }
  
  private MediaDescriptionCompat(String paramString, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, Bitmap paramBitmap, Uri paramUri1, Bundle paramBundle, Uri paramUri2)
  {
    this.tW = paramString;
    this.tX = paramCharSequence1;
    this.tY = paramCharSequence2;
    this.tZ = paramCharSequence3;
    this.ua = paramBitmap;
    this.ub = paramUri1;
    this.mExtras = paramBundle;
    this.uc = paramUri2;
  }
  
  public static MediaDescriptionCompat f(Object paramObject)
  {
    if ((paramObject == null) || (Build.VERSION.SDK_INT < 21)) {
      return null;
    }
    a locala = new a();
    locala.tW = ((MediaDescription)paramObject).getMediaId();
    locala.tX = ((MediaDescription)paramObject).getTitle();
    locala.tY = ((MediaDescription)paramObject).getSubtitle();
    locala.tZ = ((MediaDescription)paramObject).getDescription();
    locala.ua = ((MediaDescription)paramObject).getIconBitmap();
    locala.ub = ((MediaDescription)paramObject).getIconUri();
    Bundle localBundle = ((MediaDescription)paramObject).getExtras();
    Object localObject;
    if (localBundle == null)
    {
      localObject = null;
      if (localObject == null) {
        break label211;
      }
      if ((!localBundle.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG")) || (localBundle.size() != 2)) {
        break label199;
      }
      localBundle = null;
      label125:
      locala.mExtras = localBundle;
      if (localObject == null) {
        break label214;
      }
      locala.uc = ((Uri)localObject);
    }
    for (;;)
    {
      localObject = new MediaDescriptionCompat(locala.tW, locala.tX, locala.tY, locala.tZ, locala.ua, locala.ub, locala.mExtras, locala.uc);
      ((MediaDescriptionCompat)localObject).ud = paramObject;
      return (MediaDescriptionCompat)localObject;
      localObject = (Uri)localBundle.getParcelable("android.support.v4.media.description.MEDIA_URI");
      break;
      label199:
      localBundle.remove("android.support.v4.media.description.MEDIA_URI");
      localBundle.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
      label211:
      break label125;
      label214:
      if (Build.VERSION.SDK_INT >= 23) {
        locala.uc = ((MediaDescription)paramObject).getMediaUri();
      }
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    return this.tX + ", " + this.tY + ", " + this.tZ;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (Build.VERSION.SDK_INT < 21)
    {
      paramParcel.writeString(this.tW);
      TextUtils.writeToParcel(this.tX, paramParcel, paramInt);
      TextUtils.writeToParcel(this.tY, paramParcel, paramInt);
      TextUtils.writeToParcel(this.tZ, paramParcel, paramInt);
      paramParcel.writeParcelable(this.ua, paramInt);
      paramParcel.writeParcelable(this.ub, paramInt);
      paramParcel.writeBundle(this.mExtras);
      paramParcel.writeParcelable(this.uc, paramInt);
      return;
    }
    if ((this.ud != null) || (Build.VERSION.SDK_INT < 21))
    {
      localObject = this.ud;
      ((MediaDescription)localObject).writeToParcel(paramParcel, paramInt);
      return;
    }
    MediaDescription.Builder localBuilder = new MediaDescription.Builder();
    Object localObject = this.tW;
    ((MediaDescription.Builder)localBuilder).setMediaId((String)localObject);
    localObject = this.tX;
    ((MediaDescription.Builder)localBuilder).setTitle((CharSequence)localObject);
    localObject = this.tY;
    ((MediaDescription.Builder)localBuilder).setSubtitle((CharSequence)localObject);
    localObject = this.tZ;
    ((MediaDescription.Builder)localBuilder).setDescription((CharSequence)localObject);
    localObject = this.ua;
    ((MediaDescription.Builder)localBuilder).setIconBitmap((Bitmap)localObject);
    localObject = this.ub;
    ((MediaDescription.Builder)localBuilder).setIconUri((Uri)localObject);
    Bundle localBundle = this.mExtras;
    if ((Build.VERSION.SDK_INT < 23) && (this.uc != null))
    {
      localObject = localBundle;
      if (localBundle == null)
      {
        localObject = new Bundle();
        ((Bundle)localObject).putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
      }
      ((Bundle)localObject).putParcelable("android.support.v4.media.description.MEDIA_URI", this.uc);
    }
    for (;;)
    {
      ((MediaDescription.Builder)localBuilder).setExtras((Bundle)localObject);
      if (Build.VERSION.SDK_INT >= 23)
      {
        localObject = this.uc;
        ((MediaDescription.Builder)localBuilder).setMediaUri((Uri)localObject);
      }
      this.ud = ((MediaDescription.Builder)localBuilder).build();
      localObject = this.ud;
      break;
      localObject = localBundle;
    }
  }
  
  public static final class a
  {
    Bundle mExtras;
    String tW;
    CharSequence tX;
    CharSequence tY;
    CharSequence tZ;
    Bitmap ua;
    Uri ub;
    Uri uc;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\android\support\v4\media\MediaDescriptionCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */