package com.tencent.mm.plugin.pwdgroup;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.f;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.d;
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

public final class c
  implements aq
{
  public c()
  {
    GMTrace.i(10712051089408L, 79811);
    GMTrace.o(10712051089408L, 79811);
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(10712453742592L, 79814);
    b.a.nPm = new j.a()
    {
      private Bitmap erM;
      private f<String, WeakReference<Bitmap>> nPn;
      
      public final void a(j paramAnonymousj)
      {
        GMTrace.i(10711380000768L, 79806);
        if ((paramAnonymousj instanceof d.a)) {
          n.Dh().a((d.a)paramAnonymousj);
        }
        GMTrace.o(10711380000768L, 79806);
      }
      
      public final Bitmap b(String paramAnonymousString, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(10711916871680L, 79810);
        GMTrace.o(10711916871680L, 79810);
        return null;
      }
      
      public final Bitmap bw(String paramAnonymousString)
      {
        GMTrace.i(10711514218496L, 79807);
        Object localObject = (WeakReference)this.nPn.get(paramAnonymousString);
        if ((localObject == null) || (((WeakReference)localObject).get() == null) || (((Bitmap)((WeakReference)localObject).get()).isRecycled()) || (((WeakReference)localObject).get() != this.erM))
        {
          localObject = b.a(paramAnonymousString, false, -1);
          if ((localObject == null) || (((Bitmap)localObject).isRecycled())) {}
          for (paramAnonymousString = this.erM;; paramAnonymousString = (String)localObject)
          {
            GMTrace.o(10711514218496L, 79807);
            return paramAnonymousString;
            this.nPn.m(paramAnonymousString, new WeakReference(localObject));
          }
        }
        paramAnonymousString = (Bitmap)((WeakReference)localObject).get();
        GMTrace.o(10711514218496L, 79807);
        return paramAnonymousString;
      }
      
      public final Bitmap bx(String paramAnonymousString)
      {
        GMTrace.i(10711782653952L, 79809);
        GMTrace.o(10711782653952L, 79809);
        return null;
      }
      
      public final Bitmap oT()
      {
        GMTrace.i(15570061754368L, 116006);
        Bitmap localBitmap = this.erM;
        GMTrace.o(15570061754368L, 116006);
        return localBitmap;
      }
    };
    GMTrace.o(10712453742592L, 79814);
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(10712587960320L, 79815);
    GMTrace.o(10712587960320L, 79815);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(10712319524864L, 79813);
    GMTrace.o(10712319524864L, 79813);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(10712722178048L, 79816);
    GMTrace.o(10712722178048L, 79816);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(10712185307136L, 79812);
    GMTrace.o(10712185307136L, 79812);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\pwdgroup\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */