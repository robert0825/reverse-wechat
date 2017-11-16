package com.tencent.mm.plugin.appbrand.appstorage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;

public class AppBrandLocalVideoObject
  extends AppBrandLocalMediaObject
{
  public static final Parcelable.Creator<AppBrandLocalVideoObject> CREATOR;
  public int duration;
  public int height;
  public int size;
  public int width;
  
  static
  {
    GMTrace.i(10641586782208L, 79286);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(10641586782208L, 79286);
  }
  
  public AppBrandLocalVideoObject()
  {
    GMTrace.i(10640781475840L, 79280);
    GMTrace.o(10640781475840L, 79280);
  }
  
  public AppBrandLocalVideoObject(Parcel paramParcel)
  {
    super(paramParcel);
    GMTrace.i(10641184129024L, 79283);
    this.duration = paramParcel.readInt();
    this.size = paramParcel.readInt();
    this.width = paramParcel.readInt();
    this.height = paramParcel.readInt();
    GMTrace.o(10641184129024L, 79283);
  }
  
  public int describeContents()
  {
    GMTrace.i(10640915693568L, 79281);
    GMTrace.o(10640915693568L, 79281);
    return 0;
  }
  
  public String toString()
  {
    GMTrace.i(10641318346752L, 79284);
    String str = "AppBrandLocalVideoObject{duration=" + this.duration + ", size=" + this.size + ", width=" + this.width + ", height=" + this.height + '}';
    GMTrace.o(10641318346752L, 79284);
    return str;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(10641049911296L, 79282);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.duration);
    paramParcel.writeInt(this.size);
    paramParcel.writeInt(this.width);
    paramParcel.writeInt(this.height);
    GMTrace.o(10641049911296L, 79282);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\appstorage\AppBrandLocalVideoObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */