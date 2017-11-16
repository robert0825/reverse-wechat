package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.gms.c.ah;
import com.google.android.gms.c.al;
import java.util.Locale;

public final class af
  extends o
{
  af(q paramq)
  {
    super(paramq);
  }
  
  protected final void hS() {}
  
  public final al ju()
  {
    iC();
    DisplayMetrics localDisplayMetrics = this.ack.iF().mContext.getResources().getDisplayMetrics();
    al localal = new al();
    localal.avD = k.c(Locale.getDefault());
    localal.avF = localDisplayMetrics.widthPixels;
    localal.avG = localDisplayMetrics.heightPixels;
    return localal;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\analytics\internal\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */