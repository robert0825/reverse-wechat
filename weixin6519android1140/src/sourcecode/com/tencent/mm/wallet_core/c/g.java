package com.tencent.mm.wallet_core.c;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import java.lang.ref.WeakReference;

public abstract class g
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  private static final String xDh;
  protected String eAR;
  private WeakReference<MMActivity> eDN;
  protected int errCode;
  protected int errType;
  public boolean jWW;
  public boolean jWX;
  public int xDi;
  public String xDj;
  
  static
  {
    GMTrace.i(20857434931200L, 155400);
    xDh = ab.getResources().getString(a.i.tgK);
    GMTrace.o(20857434931200L, 155400);
  }
  
  public g()
  {
    GMTrace.i(20856226971648L, 155391);
    this.errCode = 0;
    this.errType = 0;
    this.xDi = 0;
    this.jWW = false;
    this.jWX = false;
    GMTrace.o(20856226971648L, 155391);
  }
  
  public final g a(a parama)
  {
    GMTrace.i(20857032278016L, 155397);
    if ((!this.jWW) && (!this.jWX)) {
      parama.i(this);
    }
    GMTrace.o(20857032278016L, 155397);
    return this;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, final String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(20856898060288L, 155396);
    if ((paramInt2 != 0) || (paramInt3 != 0)) {
      this.jWW = true;
    }
    if (!this.jWW)
    {
      h(paramq);
      if (this.xDi != 0) {
        this.jWX = true;
      }
    }
    this.errCode = paramInt3;
    this.errType = paramInt2;
    this.eAR = paramString;
    w.i("MicroMsg.NetSceneNewPayBase", "errType: %s, errCode: %s, errMsg: %s, retCode: %s, retMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, Integer.valueOf(this.xDi), this.xDj });
    b(paramInt2, paramInt3, paramString, paramq);
    if (this.eDN != null)
    {
      paramString = (MMActivity)this.eDN.get();
      if (paramString != null)
      {
        if (this.jWW)
        {
          w.w("MicroMsg.NetSceneNewPayBase", "show net error alert");
          h.a(paramString, xDh, null, false, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(20857703366656L, 155402);
              paramString.finish();
              GMTrace.o(20857703366656L, 155402);
            }
          });
          GMTrace.o(20856898060288L, 155396);
          return;
        }
        if ((this.jWX) && (!bg.nm(this.xDj)) && (bbj()))
        {
          w.w("MicroMsg.NetSceneNewPayBase", "show resp error toast");
          Toast.makeText(paramString, this.xDj, 1).show();
        }
      }
    }
    GMTrace.o(20856898060288L, 155396);
  }
  
  public final g b(a parama)
  {
    GMTrace.i(20857166495744L, 155398);
    if (this.jWX) {
      parama.i(this);
    }
    GMTrace.o(20857166495744L, 155398);
    return this;
  }
  
  public abstract void b(int paramInt1, int paramInt2, String paramString, q paramq);
  
  public boolean bbj()
  {
    GMTrace.i(20856763842560L, 155395);
    GMTrace.o(20856763842560L, 155395);
    return true;
  }
  
  public final g c(a parama)
  {
    GMTrace.i(20857300713472L, 155399);
    if (this.jWW) {
      parama.i(this);
    }
    GMTrace.o(20857300713472L, 155399);
    return this;
  }
  
  public abstract void h(q paramq);
  
  public final void j(MMActivity paramMMActivity)
  {
    GMTrace.i(20856629624832L, 155394);
    this.eDN = new WeakReference(paramMMActivity);
    GMTrace.o(20856629624832L, 155394);
  }
  
  public static abstract interface a
  {
    public abstract void i(com.tencent.mm.ad.k paramk);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\wallet_core\c\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */