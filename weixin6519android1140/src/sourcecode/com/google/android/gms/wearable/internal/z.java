package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.e;
import com.google.android.gms.wearable.k;
import com.google.android.gms.wearable.k.b;

public final class z
  implements k
{
  public final e<k.b> a(c paramc, final String paramString1, final String paramString2, final byte[] paramArrayOfByte)
  {
    paramc.a(new aw(paramc) {});
  }
  
  public static final class a
    implements k.b
  {
    private final int aBE;
    private final Status azP;
    
    public a(Status paramStatus, int paramInt)
    {
      this.azP = paramStatus;
      this.aBE = paramInt;
    }
    
    public final Status jT()
    {
      return this.azP;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\wearable\internal\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */