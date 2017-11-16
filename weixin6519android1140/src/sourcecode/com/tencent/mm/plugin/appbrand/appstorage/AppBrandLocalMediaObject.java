package com.tencent.mm.plugin.appbrand.appstorage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public class AppBrandLocalMediaObject
  implements Parcelable
{
  public static final Parcelable.Creator<AppBrandLocalMediaObject> CREATOR;
  public String eHy;
  public String gpy;
  public long hLA;
  public String hLy;
  public boolean hLz;
  public long hmS;
  public String mimeType;
  
  static
  {
    GMTrace.i(10636083855360L, 79245);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(10636083855360L, 79245);
  }
  
  protected AppBrandLocalMediaObject()
  {
    GMTrace.i(10635546984448L, 79241);
    GMTrace.o(10635546984448L, 79241);
  }
  
  protected AppBrandLocalMediaObject(Parcel paramParcel)
  {
    GMTrace.i(10635949637632L, 79244);
    this.eHy = paramParcel.readString();
    this.gpy = paramParcel.readString();
    this.mimeType = paramParcel.readString();
    this.hLy = paramParcel.readString();
    if (paramParcel.readByte() != 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.hLz = bool;
      this.hmS = paramParcel.readLong();
      this.hLA = paramParcel.readLong();
      GMTrace.o(10635949637632L, 79244);
      return;
    }
  }
  
  public int describeContents()
  {
    GMTrace.i(10635681202176L, 79242);
    GMTrace.o(10635681202176L, 79242);
    return 0;
  }
  
  public String toString()
  {
    GMTrace.i(10635412766720L, 79240);
    String str = "AppBrandLocalMediaObject{localId='" + this.eHy + '\'' + ", fileFullPath='" + this.gpy + '\'' + ", mimeType='" + this.mimeType + '\'' + ", fileExt='" + this.hLy + '\'' + '}';
    GMTrace.o(10635412766720L, 79240);
    return str;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(10635815419904L, 79243);
    paramParcel.writeString(this.eHy);
    paramParcel.writeString(this.gpy);
    paramParcel.writeString(this.mimeType);
    paramParcel.writeString(this.hLy);
    if (this.hLz) {}
    for (byte b = 1;; b = 0)
    {
      paramParcel.writeByte(b);
      paramParcel.writeLong(this.hmS);
      paramParcel.writeLong(this.hLA);
      GMTrace.o(10635815419904L, 79243);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\appstorage\AppBrandLocalMediaObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */