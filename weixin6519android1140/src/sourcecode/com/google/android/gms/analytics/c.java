package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.internal.a;
import com.google.android.gms.analytics.internal.af;
import com.google.android.gms.analytics.internal.q;
import com.google.android.gms.analytics.internal.v;
import com.google.android.gms.analytics.internal.y;
import com.google.android.gms.c.ae;
import com.google.android.gms.c.ag;
import com.google.android.gms.c.h;

public class c
  extends ag<c>
{
  public final q aeb;
  public boolean afj;
  
  public c(q paramq)
  {
    super(paramq.iF(), paramq.acz);
    this.aeb = paramq;
  }
  
  protected final void a(ae paramae)
  {
    paramae = (h)paramae.b(h.class);
    if (TextUtils.isEmpty(paramae.adi)) {
      paramae.adi = this.aeb.iJ().jd();
    }
    if ((this.afj) && (TextUtils.isEmpty(paramae.atn)))
    {
      Object localObject = this.aeb;
      q.a(((q)localObject).adb);
      localObject = ((q)localObject).adb;
      paramae.atn = ((a)localObject).hU();
      paramae.ato = ((a)localObject).hT();
    }
  }
  
  public final ae jx()
  {
    ae localae = lA().lz();
    q localq = this.aeb;
    q.a(localq.adc);
    localae.b(localq.adc.iT());
    localae.b(this.aeb.add.ju());
    lC();
    return localae;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\analytics\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */