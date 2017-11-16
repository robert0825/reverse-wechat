package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.v;
import java.util.Arrays;

public class ConnectionConfiguration
  implements SafeParcelable
{
  public static final Parcelable.Creator<ConnectionConfiguration> CREATOR = new u();
  final String aAh;
  final int aAi;
  final boolean aAj;
  String aAk;
  boolean aAl;
  String aAm;
  boolean acm;
  final int aja;
  final String mName;
  final int mVersionCode;
  
  ConnectionConfiguration(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, String paramString3, boolean paramBoolean3, String paramString4)
  {
    this.mVersionCode = paramInt1;
    this.mName = paramString1;
    this.aAh = paramString2;
    this.aja = paramInt2;
    this.aAi = paramInt3;
    this.aAj = paramBoolean1;
    this.acm = paramBoolean2;
    this.aAk = paramString3;
    this.aAl = paramBoolean3;
    this.aAm = paramString4;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof ConnectionConfiguration)) {}
    do
    {
      return false;
      paramObject = (ConnectionConfiguration)paramObject;
    } while ((!v.d(Integer.valueOf(this.mVersionCode), Integer.valueOf(((ConnectionConfiguration)paramObject).mVersionCode))) || (!v.d(this.mName, ((ConnectionConfiguration)paramObject).mName)) || (!v.d(this.aAh, ((ConnectionConfiguration)paramObject).aAh)) || (!v.d(Integer.valueOf(this.aja), Integer.valueOf(((ConnectionConfiguration)paramObject).aja))) || (!v.d(Integer.valueOf(this.aAi), Integer.valueOf(((ConnectionConfiguration)paramObject).aAi))) || (!v.d(Boolean.valueOf(this.aAj), Boolean.valueOf(((ConnectionConfiguration)paramObject).aAj))) || (!v.d(Boolean.valueOf(this.aAl), Boolean.valueOf(((ConnectionConfiguration)paramObject).aAl))));
    return true;
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(this.mVersionCode), this.mName, this.aAh, Integer.valueOf(this.aja), Integer.valueOf(this.aAi), Boolean.valueOf(this.aAj), Boolean.valueOf(this.aAl) });
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("ConnectionConfiguration[ ");
    localStringBuilder.append("mName=" + this.mName);
    localStringBuilder.append(", mAddress=" + this.aAh);
    localStringBuilder.append(", mType=" + this.aja);
    localStringBuilder.append(", mRole=" + this.aAi);
    localStringBuilder.append(", mEnabled=" + this.aAj);
    localStringBuilder.append(", mIsConnected=" + this.acm);
    localStringBuilder.append(", mPeerNodeId=" + this.aAk);
    localStringBuilder.append(", mBtlePriority=" + this.aAl);
    localStringBuilder.append(", mNodeId=" + this.aAm);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    u.a(this, paramParcel);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\wearable\ConnectionConfiguration.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */