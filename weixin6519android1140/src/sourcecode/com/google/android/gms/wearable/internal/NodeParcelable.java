package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.m;

public class NodeParcelable
  implements SafeParcelable, m
{
  public static final Parcelable.Creator<NodeParcelable> CREATOR = new ad();
  final int aBF;
  final boolean aBG;
  final String abK;
  final String axF;
  final int mVersionCode;
  
  NodeParcelable(int paramInt1, String paramString1, String paramString2, int paramInt2, boolean paramBoolean)
  {
    this.mVersionCode = paramInt1;
    this.abK = paramString1;
    this.axF = paramString2;
    this.aBF = paramInt2;
    this.aBG = paramBoolean;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof NodeParcelable)) {
      return false;
    }
    return ((NodeParcelable)paramObject).abK.equals(this.abK);
  }
  
  public final String getId()
  {
    return this.abK;
  }
  
  public int hashCode()
  {
    return this.abK.hashCode();
  }
  
  public String toString()
  {
    return "Node{" + this.axF + ", id=" + this.abK + ", hops=" + this.aBF + ", isNearby=" + this.aBG + "}";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ad.a(this, paramParcel);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\wearable\internal\NodeParcelable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */