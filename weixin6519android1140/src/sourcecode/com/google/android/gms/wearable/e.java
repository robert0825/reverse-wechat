package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.h;

public final class e
  extends h<d>
  implements g
{
  public final Status azP;
  
  public e(DataHolder paramDataHolder)
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


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\wearable\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */