package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.av.o;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.v;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.y.at;
import java.lang.ref.WeakReference;

public final class a
  extends com.tencent.mm.pluginsdk.ui.b.b
{
  public int aaP;
  private View jcL;
  public b wZn;
  private d wZo;
  public a wZp;
  
  public a(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(14494843535360L, 107995);
    this.aaP = 0;
    this.jcL = null;
    if (this.view != null)
    {
      this.jcL = this.view.findViewById(R.h.bdo);
      this.wZo = new d();
      this.wZo.wZt = this.jcL;
      this.wZo.wZu = ((Button)this.view.findViewById(R.h.bcO));
      this.wZo.wZu.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(14499406938112L, 108029);
          if ((a.this.wZn != null) && (a.this.wZp != null))
          {
            paramAnonymousView = a.this.wZn.DI(a.this.aaP);
            a.this.wZp.LC(paramAnonymousView.wZs.id);
          }
          GMTrace.o(14499406938112L, 108029);
        }
      });
      this.jcL.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(14499943809024L, 108033);
          if ((a.this.wZn != null) && (a.this.wZp != null))
          {
            paramAnonymousView = a.this.wZn.DI(a.this.aaP);
            a.this.wZp.fp(paramAnonymousView.wZs.id, paramAnonymousView.wZs.url);
          }
          GMTrace.o(14499943809024L, 108033);
        }
      });
    }
    GMTrace.o(14494843535360L, 107995);
  }
  
  public final boolean abd()
  {
    GMTrace.i(14495514624000L, 108000);
    this.wZn = new b((Context)this.tyb.get());
    this.wZp = new a()
    {
      public final void LC(String paramAnonymousString)
      {
        GMTrace.i(14495917277184L, 108003);
        com.tencent.mm.pluginsdk.k.a.a.bKt();
        at.AR();
        com.tencent.mm.y.c.yJ().b(new o(3, paramAnonymousString));
        GMTrace.o(14495917277184L, 108003);
      }
      
      public final void fp(String paramAnonymousString1, String paramAnonymousString2)
      {
        GMTrace.i(14495783059456L, 108002);
        com.tencent.mm.pluginsdk.k.a.a.bKt();
        at.AR();
        com.tencent.mm.y.c.yJ().b(new o(2, paramAnonymousString1));
        w.d("MicroMsg.ADBanner", "jump to " + paramAnonymousString2);
        p.a.tme.a((Context)a.this.tyb.get(), paramAnonymousString2, true);
        GMTrace.o(14495783059456L, 108002);
      }
    };
    com.tencent.mm.pluginsdk.k.a.a locala = com.tencent.mm.pluginsdk.k.a.a.dS(ab.getContext());
    if (this.wZn != null)
    {
      if (locala != null)
      {
        this.wZn.wZr = locala;
        this.wZn.QF();
        if ((this.wZn != null) && (this.wZn.getCount() > 0) && (this.wZn.DI(0).a(this.wZo) == 0)) {}
        for (int i = 1; i != 0; i = 0)
        {
          w.i("MicroMsg.ADBanner", "refreshAndReturnIsVisible[true]");
          setVisibility(0);
          GMTrace.o(14495514624000L, 108000);
          return true;
        }
      }
      setVisibility(8);
    }
    setVisibility(8);
    GMTrace.o(14495514624000L, 108000);
    return false;
  }
  
  public final void destroy()
  {
    GMTrace.i(14495111970816L, 107997);
    at.AR();
    com.tencent.mm.y.c.xh().b(this.wZn);
    GMTrace.o(14495111970816L, 107997);
  }
  
  public final int getLayoutId()
  {
    GMTrace.i(14494977753088L, 107996);
    int i = R.i.coW;
    GMTrace.o(14494977753088L, 107996);
    return i;
  }
  
  public final void release()
  {
    GMTrace.i(14495380406272L, 107999);
    this.wZn = null;
    GMTrace.o(14495380406272L, 107999);
  }
  
  public final void setVisibility(int paramInt)
  {
    GMTrace.i(14495246188544L, 107998);
    if (this.jcL != null) {
      this.jcL.setVisibility(paramInt);
    }
    GMTrace.o(14495246188544L, 107998);
  }
  
  public static abstract interface a
  {
    public abstract void LC(String paramString);
    
    public abstract void fp(String paramString1, String paramString2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\conversation\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */