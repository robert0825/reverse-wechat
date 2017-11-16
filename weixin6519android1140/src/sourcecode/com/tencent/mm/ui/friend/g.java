package com.tencent.mm.ui.friend;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelsimple.ad;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.at;

public final class g
  implements e
{
  private Context context;
  private ProgressDialog jIU;
  public String twv;
  public a xcv;
  private boolean xcw;
  
  public g(Context paramContext, a parama)
  {
    GMTrace.i(2807566434304L, 20918);
    this.xcw = true;
    this.twv = "";
    this.context = paramContext;
    this.xcv = parama;
    this.xcw = true;
    GMTrace.o(2807566434304L, 20918);
  }
  
  public g(Context paramContext, a parama, byte paramByte)
  {
    GMTrace.i(2807700652032L, 20919);
    this.xcw = true;
    this.twv = "";
    this.context = paramContext;
    this.xcv = parama;
    this.xcw = false;
    GMTrace.o(2807700652032L, 20919);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(2807969087488L, 20921);
    if (paramk.getType() != 116)
    {
      GMTrace.o(2807969087488L, 20921);
      return;
    }
    if (this.jIU != null)
    {
      this.jIU.dismiss();
      this.jIU = null;
    }
    at.wS().b(116, this);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      w.i("MicroMsg.SendInviteEmail", "dealSendInviteEmailSuccess");
      if (this.xcw)
      {
        h.a(this.context, R.l.dDC, R.l.cUG, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(2799110717440L, 20855);
            g.this.xcv.n(true, g.this.twv);
            GMTrace.o(2799110717440L, 20855);
          }
        });
        GMTrace.o(2807969087488L, 20921);
        return;
      }
      this.xcv.n(true, this.twv);
      GMTrace.o(2807969087488L, 20921);
      return;
    }
    w.i("MicroMsg.SendInviteEmail", "dealSendInviteEmailFail");
    this.xcv.n(false, this.twv);
    GMTrace.o(2807969087488L, 20921);
  }
  
  public final void r(final int[] paramArrayOfInt)
  {
    GMTrace.i(2807834869760L, 20920);
    at.wS().a(116, this);
    paramArrayOfInt = new ad(paramArrayOfInt);
    at.wS().a(paramArrayOfInt, 0);
    if (this.xcw)
    {
      Context localContext = this.context;
      this.context.getString(R.l.dDF);
      this.jIU = h.a(localContext, this.context.getString(R.l.dDD), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(2792265613312L, 20804);
          at.wS().c(paramArrayOfInt);
          g.this.xcv.n(false, g.this.twv);
          GMTrace.o(2792265613312L, 20804);
        }
      });
    }
    GMTrace.o(2807834869760L, 20920);
  }
  
  public static abstract interface a
  {
    public abstract void n(boolean paramBoolean, String paramString);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\friend\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */