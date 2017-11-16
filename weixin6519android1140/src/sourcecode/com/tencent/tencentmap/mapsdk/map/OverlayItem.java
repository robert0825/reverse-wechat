package com.tencent.tencentmap.mapsdk.map;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mapsdk.raster.model.GeoPoint;

public class OverlayItem
  implements Parcelable
{
  public static final Parcelable.Creator<OverlayItem> CREATOR = new Parcelable.Creator() {};
  protected final String mSnippet;
  protected final String mTitle;
  protected GeoPoint ybP;
  protected boolean ybQ = true;
  
  protected OverlayItem(Parcel paramParcel)
  {
    this.ybP = ((GeoPoint)paramParcel.readValue(GeoPoint.class.getClassLoader()));
    this.mTitle = paramParcel.readString();
    this.mSnippet = paramParcel.readString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeValue(this.ybP);
    paramParcel.writeString(this.mTitle);
    paramParcel.writeString(this.mSnippet);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\tencentmap\mapsdk\map\OverlayItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */