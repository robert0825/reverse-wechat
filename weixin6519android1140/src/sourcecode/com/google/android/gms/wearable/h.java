package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.data.DataHolder;

public final class h
  extends com.google.android.gms.common.data.h<f>
  implements g
{
  private final Status azP;
  
  public h(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    this.azP = new Status(paramDataHolder.agz);
  }
  
  public final Status jT()
  {
    return this.azP;
  }
  
  protected final String kn()
  {
    return "path";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\wearable\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */