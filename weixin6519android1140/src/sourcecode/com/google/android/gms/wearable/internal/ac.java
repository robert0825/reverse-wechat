package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.e;
import com.google.android.gms.wearable.m;
import com.google.android.gms.wearable.n;
import com.google.android.gms.wearable.n.a;
import java.util.List;

public final class ac
  implements n
{
  public final e<n.a> b(c paramc)
  {
    paramc.a(new aw(paramc) {});
  }
  
  public static final class a
    implements n.a
  {
    private final List<m> aBQ;
    private final Status azP;
    
    public a(Status paramStatus, List<m> paramList)
    {
      this.azP = paramStatus;
      this.aBQ = paramList;
    }
    
    public final Status jT()
    {
      return this.azP;
    }
    
    public final List<m> nd()
    {
      return this.aBQ;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\wearable\internal\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */