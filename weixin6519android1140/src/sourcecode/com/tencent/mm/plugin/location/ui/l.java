package com.tencent.mm.plugin.location.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class l
{
  public a mBb;
  public i mBc;
  public Context mContext;
  public Resources mResources;
  
  public l(Context paramContext, a parama)
  {
    GMTrace.i(9661394714624L, 71983);
    this.mBc = null;
    this.mContext = paramContext;
    this.mBb = parama;
    this.mResources = this.mContext.getResources();
    GMTrace.o(9661394714624L, 71983);
  }
  
  public static boolean pK(int paramInt)
  {
    GMTrace.i(9661663150080L, 71985);
    at.AR();
    Object localObject = c.xh().get(paramInt, null);
    if (localObject == null)
    {
      GMTrace.o(9661663150080L, 71985);
      return false;
    }
    boolean bool = ((Boolean)localObject).booleanValue();
    GMTrace.o(9661663150080L, 71985);
    return bool;
  }
  
  public static void pL(int paramInt)
  {
    GMTrace.i(9661797367808L, 71986);
    at.AR();
    c.xh().set(paramInt, Boolean.valueOf(true));
    GMTrace.o(9661797367808L, 71986);
  }
  
  public final void aLd()
  {
    GMTrace.i(9661528932352L, 71984);
    if (!pK(67590))
    {
      h.a(this.mContext, this.mResources.getString(R.l.dGS), "", false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(9652536344576L, 71917);
          if (l.this.mBb != null) {
            l.this.mBb.aLe();
          }
          GMTrace.o(9652536344576L, 71917);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(9665152811008L, 72011);
          GMTrace.o(9665152811008L, 72011);
        }
      });
      pL(67590);
      GMTrace.o(9661528932352L, 71984);
      return;
    }
    if (this.mBb != null) {
      this.mBb.aLe();
    }
    GMTrace.o(9661528932352L, 71984);
  }
  
  public static abstract interface a
  {
    public abstract void aLe();
    
    public abstract void aLf();
    
    public abstract void aLg();
    
    public abstract void fG(boolean paramBoolean);
    
    public abstract void pM(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\ui\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */