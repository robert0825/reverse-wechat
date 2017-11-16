package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ParcelableVolumeInfo
  implements Parcelable
{
  public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new Parcelable.Creator() {};
  public int uo;
  public int uq;
  public int ur;
  public int us;
  public int ut;
  
  public ParcelableVolumeInfo(Parcel paramParcel)
  {
    this.uo = paramParcel.readInt();
    this.ur = paramParcel.readInt();
    this.us = paramParcel.readInt();
    this.ut = paramParcel.readInt();
    this.uq = paramParcel.readInt();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.uo);
    paramParcel.writeInt(this.ur);
    paramParcel.writeInt(this.us);
    paramParcel.writeInt(this.ut);
    paramParcel.writeInt(this.uq);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\android\support\v4\media\session\ParcelableVolumeInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */