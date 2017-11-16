package com.tencent.mm.pluginsdk.model;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Looper;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.h.a;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.at;
import junit.framework.Assert;

public final class o
  implements e
{
  private Context context;
  private ProgressDialog jIU;
  private String path;
  private Runnable tnc;
  private Runnable tnd;
  
  public o(Context paramContext, String paramString)
  {
    GMTrace.i(726252126208L, 5411);
    this.tnc = null;
    this.tnd = null;
    this.context = paramContext;
    this.path = paramString;
    this.jIU = null;
    at.wS().a(157, this);
    GMTrace.o(726252126208L, 5411);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(726654779392L, 5414);
    w.i("MicroMsg.ProcessUploadHDHeadImg", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    at.wS().b(157, this);
    if ((this.jIU != null) && (this.jIU.isShowing()) && ((this.context instanceof Activity)) && (!((Activity)this.context).isFinishing())) {}
    try
    {
      this.jIU.dismiss();
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        Toast.makeText(this.context, R.l.ebg, 0).show();
        if (this.tnc != null) {
          new ae(Looper.getMainLooper()).post(this.tnc);
        }
        GMTrace.o(726654779392L, 5414);
        return;
      }
    }
    catch (IllegalArgumentException paramk)
    {
      for (;;)
      {
        w.e("MicroMsg.ProcessUploadHDHeadImg", "dismiss dialog err" + paramk.getMessage());
      }
      if (this.tnd != null) {
        new ae(Looper.getMainLooper()).post(this.tnd);
      }
      if ((paramString != null) && (paramString.length() > 0))
      {
        paramString = a.dH(paramString);
        if (paramString != null)
        {
          paramString.a(this.context, null, null);
          GMTrace.o(726654779392L, 5414);
          return;
        }
      }
      if ((paramInt1 == 4) && (paramInt2 == -4))
      {
        Toast.makeText(this.context, R.l.dke, 0).show();
        GMTrace.o(726654779392L, 5414);
        return;
      }
      Toast.makeText(this.context, R.l.ebf, 0).show();
      GMTrace.o(726654779392L, 5414);
    }
  }
  
  public final boolean a(Runnable paramRunnable1, Runnable paramRunnable2)
  {
    GMTrace.i(726520561664L, 5413);
    if ((this.context != null) && (this.path != null) && (this.path.length() > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      this.tnc = paramRunnable1;
      this.tnd = paramRunnable2;
      paramRunnable1 = new l(1, this.path);
      at.wS().a(paramRunnable1, 0);
      w.i("MicroMsg.ProcessUploadHDHeadImg", "post is null ? %B", new Object[] { Boolean.valueOf(false) });
      GMTrace.o(726520561664L, 5413);
      return true;
    }
  }
  
  public final boolean b(int paramInt, Runnable paramRunnable)
  {
    GMTrace.i(726386343936L, 5412);
    if ((this.context != null) && (this.path != null) && (this.path.length() > 0))
    {
      bool = true;
      Assert.assertTrue(bool);
      this.tnc = paramRunnable;
      Object localObject = this.context;
      this.context.getString(R.l.cUG);
      this.jIU = h.a((Context)localObject, this.context.getString(R.l.ebh), true, null);
      localObject = new l(paramInt, this.path);
      at.wS().a((k)localObject, 0);
      if (paramRunnable != null) {
        break label146;
      }
    }
    label146:
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.ProcessUploadHDHeadImg", "post is null ? %B", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(726386343936L, 5412);
      return true;
      bool = false;
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */