package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.wearable.Channel;

public class ChannelImpl
  implements SafeParcelable, Channel
{
  public static final Parcelable.Creator<ChannelImpl> CREATOR = new bb();
  final String aAm;
  public final String aBl;
  final String aBm;
  final int mVersionCode;
  
  ChannelImpl(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    this.mVersionCode = paramInt;
    this.aBl = ((String)w.aa(paramString1));
    this.aAm = ((String)w.aa(paramString2));
    this.aBm = ((String)w.aa(paramString3));
  }
  
  public final e<Status> a(c paramc, final Uri paramUri)
  {
    w.j(paramc, "client is null");
    w.j(paramUri, "uri is null");
    paramc.b(new aw(paramc) {});
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof ChannelImpl)) {
        return false;
      }
      paramObject = (ChannelImpl)paramObject;
    } while ((this.aBl.equals(((ChannelImpl)paramObject).aBl)) && (v.d(((ChannelImpl)paramObject).aAm, this.aAm)) && (v.d(((ChannelImpl)paramObject).aBm, this.aBm)) && (((ChannelImpl)paramObject).mVersionCode == this.mVersionCode));
    return false;
  }
  
  public final String getPath()
  {
    return this.aBm;
  }
  
  public int hashCode()
  {
    return this.aBl.hashCode();
  }
  
  public final String mZ()
  {
    return this.aAm;
  }
  
  public String toString()
  {
    return "ChannelImpl{versionCode=" + this.mVersionCode + ", token='" + this.aBl + '\'' + ", nodeId='" + this.aAm + '\'' + ", path='" + this.aBm + '\'' + "}";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    bb.a(this, paramParcel);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\wearable\internal\ChannelImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */