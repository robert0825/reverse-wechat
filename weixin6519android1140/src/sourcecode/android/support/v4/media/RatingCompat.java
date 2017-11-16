package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class RatingCompat
  implements Parcelable
{
  public static final Parcelable.Creator<RatingCompat> CREATOR = new Parcelable.Creator() {};
  private final int uj;
  private final float uk;
  
  public RatingCompat(int paramInt, float paramFloat)
  {
    this.uj = paramInt;
    this.uk = paramFloat;
  }
  
  public final int describeContents()
  {
    return this.uj;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("Rating:style=").append(this.uj).append(" rating=");
    if (this.uk < 0.0F) {}
    for (String str = "unrated";; str = String.valueOf(this.uk)) {
      return str;
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.uj);
    paramParcel.writeFloat(this.uk);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\android\support\v4\media\RatingCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */