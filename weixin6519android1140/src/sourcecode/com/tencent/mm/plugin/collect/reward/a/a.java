package com.tencent.mm.plugin.collect.reward.a;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.ui.base.h;
import java.lang.ref.WeakReference;

public abstract class a
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  protected String eAR;
  protected int errCode;
  protected int errType;
  protected WeakReference<Activity> jWV;
  protected boolean jWW;
  protected boolean jWX;
  
  public a()
  {
    GMTrace.i(19349632974848L, 144166);
    this.errCode = 0;
    this.errType = 0;
    this.jWW = false;
    this.jWX = false;
    GMTrace.o(19349632974848L, 144166);
  }
  
  public final a a(a parama)
  {
    GMTrace.i(19350304063488L, 144171);
    if ((!this.jWW) && (!this.jWX)) {
      parama.i(this);
    }
    GMTrace.o(19350304063488L, 144171);
    return this;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(19350169845760L, 144170);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.jWW = true;
      if ((aoE()) && (this.jWV != null))
      {
        paramArrayOfByte = (Activity)this.jWV.get();
        if (paramArrayOfByte != null) {
          h.a(paramArrayOfByte, paramArrayOfByte.getString(a.i.tgK), null, false, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(19347485491200L, 144150);
              GMTrace.o(19347485491200L, 144150);
            }
          });
        }
      }
    }
    this.errCode = paramInt3;
    this.errType = paramInt2;
    this.eAR = paramString;
    b(paramInt2, paramInt3, paramString, paramq);
    GMTrace.o(19350169845760L, 144170);
  }
  
  protected boolean aoE()
  {
    GMTrace.i(19349767192576L, 144167);
    GMTrace.o(19349767192576L, 144167);
    return true;
  }
  
  public final a b(a parama)
  {
    GMTrace.i(19350438281216L, 144172);
    if (this.jWX) {
      parama.i(this);
    }
    GMTrace.o(19350438281216L, 144172);
    return this;
  }
  
  protected abstract void b(int paramInt1, int paramInt2, String paramString, q paramq);
  
  public final a c(a parama)
  {
    GMTrace.i(19350572498944L, 144173);
    if (this.jWW) {
      parama.i(this);
    }
    GMTrace.o(19350572498944L, 144173);
    return this;
  }
  
  public final void l(Activity paramActivity)
  {
    GMTrace.i(19349901410304L, 144168);
    this.jWV = new WeakReference(paramActivity);
    GMTrace.o(19349901410304L, 144168);
  }
  
  public static abstract interface a
  {
    public abstract void i(com.tencent.mm.ad.k paramk);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\collect\reward\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */