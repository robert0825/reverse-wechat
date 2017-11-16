package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.g;

public final class bj
  implements g
{
  private final String abK;
  private final String aut;
  
  public bj(g paramg)
  {
    this.abK = paramg.getId();
    this.aut = paramg.nc();
  }
  
  public final String getId()
  {
    return this.abK;
  }
  
  public final String nc()
  {
    return this.aut;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("DataItemAssetEntity[");
    localStringBuilder.append("@");
    localStringBuilder.append(Integer.toHexString(hashCode()));
    if (this.abK == null) {
      localStringBuilder.append(",noid");
    }
    for (;;)
    {
      localStringBuilder.append(", key=");
      localStringBuilder.append(this.aut);
      localStringBuilder.append("]");
      return localStringBuilder.toString();
      localStringBuilder.append(",");
      localStringBuilder.append(this.abK);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\wearable\internal\bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */