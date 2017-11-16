package com.tencent.mm.plugin.radar;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.f;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.ac.n;
import com.tencent.mm.br.a;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.pluginsdk.ui.j;
import com.tencent.mm.pluginsdk.ui.j.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aq;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;

public final class b
  implements aq
{
  public b()
  {
    GMTrace.i(8887763730432L, 66219);
    GMTrace.o(8887763730432L, 66219);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(8888300601344L, 66223);
    com.tencent.mm.plugin.radar.ui.b.a.nPm = new j.a()
    {
      private Bitmap erM;
      private f<String, WeakReference<Bitmap>> nPn;
      private Bitmap nZd;
      
      public final void a(j paramAnonymousj)
      {
        GMTrace.i(8930981838848L, 66541);
        if ((paramAnonymousj instanceof d.a)) {
          n.Dh().a((d.a)paramAnonymousj);
        }
        GMTrace.o(8930981838848L, 66541);
      }
      
      public final Bitmap b(String paramAnonymousString, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(8931518709760L, 66545);
        GMTrace.o(8931518709760L, 66545);
        return null;
      }
      
      public final Bitmap bw(String paramAnonymousString)
      {
        GMTrace.i(8931116056576L, 66542);
        Object localObject = (WeakReference)this.nPn.get(paramAnonymousString);
        if ((localObject == null) || (((WeakReference)localObject).get() == null) || (((Bitmap)((WeakReference)localObject).get()).isRecycled()) || (((WeakReference)localObject).get() != this.erM))
        {
          localObject = com.tencent.mm.ac.b.a(paramAnonymousString, false, -1);
          if ((localObject == null) || (((Bitmap)localObject).isRecycled())) {}
          for (paramAnonymousString = this.nZd;; paramAnonymousString = (String)localObject)
          {
            GMTrace.o(8931116056576L, 66542);
            return paramAnonymousString;
            localObject = com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject, false, ((Bitmap)localObject).getWidth() / 2);
            this.nPn.m(paramAnonymousString, new WeakReference(localObject));
          }
        }
        paramAnonymousString = (Bitmap)((WeakReference)localObject).get();
        GMTrace.o(8931116056576L, 66542);
        return paramAnonymousString;
      }
      
      public final Bitmap bx(String paramAnonymousString)
      {
        GMTrace.i(8931384492032L, 66544);
        GMTrace.o(8931384492032L, 66544);
        return null;
      }
      
      public final Bitmap oT()
      {
        GMTrace.i(15403363336192L, 114764);
        Bitmap localBitmap = this.erM;
        GMTrace.o(15403363336192L, 114764);
        return localBitmap;
      }
    };
    GMTrace.o(8888300601344L, 66223);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(8888166383616L, 66222);
    GMTrace.o(8888166383616L, 66222);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(8888032165888L, 66221);
    GMTrace.o(8888032165888L, 66221);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(8888434819072L, 66224);
    GMTrace.o(8888434819072L, 66224);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(8887897948160L, 66220);
    GMTrace.o(8887897948160L, 66220);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\radar\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */