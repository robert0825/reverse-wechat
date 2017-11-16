package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.List;

public final class PlaybackStateCompat
  implements Parcelable
{
  public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new Parcelable.Creator() {};
  public final Bundle mExtras;
  public final int mState;
  public List<CustomAction> uA;
  public final long uB;
  public final long uu;
  public final long uv;
  public final float uw;
  public final long ux;
  public final CharSequence uy;
  public final long uz;
  
  public PlaybackStateCompat(Parcel paramParcel)
  {
    this.mState = paramParcel.readInt();
    this.uu = paramParcel.readLong();
    this.uw = paramParcel.readFloat();
    this.uz = paramParcel.readLong();
    this.uv = paramParcel.readLong();
    this.ux = paramParcel.readLong();
    this.uy = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.uA = paramParcel.createTypedArrayList(CustomAction.CREATOR);
    this.uB = paramParcel.readLong();
    this.mExtras = paramParcel.readBundle();
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("PlaybackState {");
    localStringBuilder.append("state=").append(this.mState);
    localStringBuilder.append(", position=").append(this.uu);
    localStringBuilder.append(", buffered position=").append(this.uv);
    localStringBuilder.append(", speed=").append(this.uw);
    localStringBuilder.append(", updated=").append(this.uz);
    localStringBuilder.append(", actions=").append(this.ux);
    localStringBuilder.append(", error=").append(this.uy);
    localStringBuilder.append(", custom actions=").append(this.uA);
    localStringBuilder.append(", active item id=").append(this.uB);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.mState);
    paramParcel.writeLong(this.uu);
    paramParcel.writeFloat(this.uw);
    paramParcel.writeLong(this.uz);
    paramParcel.writeLong(this.uv);
    paramParcel.writeLong(this.ux);
    TextUtils.writeToParcel(this.uy, paramParcel, paramInt);
    paramParcel.writeTypedList(this.uA);
    paramParcel.writeLong(this.uB);
    paramParcel.writeBundle(this.mExtras);
  }
  
  public static final class CustomAction
    implements Parcelable
  {
    public static final Parcelable.Creator<CustomAction> CREATOR = new Parcelable.Creator() {};
    private final Bundle mExtras;
    private final String uC;
    private final CharSequence uD;
    private final int uE;
    
    public CustomAction(Parcel paramParcel)
    {
      this.uC = paramParcel.readString();
      this.uD = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
      this.uE = paramParcel.readInt();
      this.mExtras = paramParcel.readBundle();
    }
    
    public final int describeContents()
    {
      return 0;
    }
    
    public final String toString()
    {
      return "Action:mName='" + this.uD + ", mIcon=" + this.uE + ", mExtras=" + this.mExtras;
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeString(this.uC);
      TextUtils.writeToParcel(this.uD, paramParcel, paramInt);
      paramParcel.writeInt(this.uE);
      paramParcel.writeBundle(this.mExtras);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\android\support\v4\media\session\PlaybackStateCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */