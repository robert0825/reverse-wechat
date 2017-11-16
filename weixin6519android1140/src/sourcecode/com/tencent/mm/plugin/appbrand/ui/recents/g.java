package com.tencent.mm.plugin.appbrand.ui.recents;

import android.os.Bundle;
import android.support.v4.a.a;
import android.support.v4.view.ai;
import android.support.v4.view.an;
import android.support.v4.view.z;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.e;
import android.support.v7.widget.RecyclerView.e.a;
import android.support.v7.widget.RecyclerView.e.c;
import android.support.v7.widget.RecyclerView.q;
import android.support.v7.widget.RecyclerView.t;
import android.support.v7.widget.aj;
import android.support.v7.widget.v;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.c.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class g
  extends v
{
  public final Set<RecyclerView.e.a> iFA;
  private final Interpolator iFB;
  private final ArrayList<b> iFC;
  public final ArrayList<RecyclerView.t> iFD;
  private final ArrayList<d> iFE;
  public final ArrayList<RecyclerView.t> iFF;
  private final ArrayList<a.d> iFG;
  public final ArrayList<a.d> iFH;
  private final ArrayList<a.d> iFI;
  public final ArrayList<a.d> iFJ;
  private final ArrayList<f> iFK;
  public final ArrayList<a.d> iFL;
  private final ArrayList<RecyclerView.t> iFM;
  private final ArrayList<a.d> iFN;
  public final ArrayList<a.d> iFO;
  public final ArrayList<a.d> iFP;
  public boolean iFQ;
  boolean iFx;
  boolean iFy;
  private final RecyclerView.e.a iFz;
  
  g()
  {
    GMTrace.i(16354698592256L, 121852);
    this.iFx = false;
    this.iFy = true;
    this.iFz = new RecyclerView.e.a()
    {
      public final void fR()
      {
        GMTrace.i(18197239562240L, 135580);
        Iterator localIterator = g.this.iFA.iterator();
        while (localIterator.hasNext()) {
          ((RecyclerView.e.a)localIterator.next()).fR();
        }
        g.this.iFQ = false;
        GMTrace.o(18197239562240L, 135580);
      }
    };
    this.iFA = new HashSet();
    this.iFB = new AccelerateDecelerateInterpolator();
    this.iFC = new ArrayList();
    this.iFD = new ArrayList();
    this.iFE = new ArrayList();
    this.iFF = new ArrayList();
    this.iFG = new ArrayList();
    this.iFH = new ArrayList();
    this.iFI = new ArrayList();
    this.iFJ = new ArrayList();
    this.iFK = new ArrayList();
    this.iFL = new ArrayList();
    this.iFM = new ArrayList();
    this.iFN = new ArrayList();
    this.iFO = new ArrayList();
    this.iFP = new ArrayList();
    this.iFQ = false;
    GMTrace.o(16354698592256L, 121852);
  }
  
  private void e(RecyclerView.t paramt)
  {
    GMTrace.i(16354832809984L, 121853);
    a.v(paramt.UU);
    d(paramt);
    z.c(paramt.UU, 0.0F);
    z.d(paramt.UU, 1.0F);
    GMTrace.o(16354832809984L, 121853);
  }
  
  public final RecyclerView.e.c a(RecyclerView.q paramq, RecyclerView.t paramt, int paramInt, List<Object> paramList)
  {
    GMTrace.i(16356309204992L, 121864);
    if ((paramInt & 0x2) > 0)
    {
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        Object localObject = localIterator.next();
        if ((localObject instanceof Bundle))
        {
          localObject = (Boolean)((Bundle)localObject).get("star");
          if ((localObject != null) && (((Boolean)localObject).booleanValue()))
          {
            paramq = new c().b(paramt, paramInt);
            GMTrace.o(16356309204992L, 121864);
            return paramq;
          }
          if ((localObject != null) && (!((Boolean)localObject).booleanValue()))
          {
            paramq = new e().b(paramt, paramInt);
            GMTrace.o(16356309204992L, 121864);
            return paramq;
          }
        }
      }
    }
    paramq = super.a(paramq, paramt, paramInt, paramList);
    paramq.Ua = paramInt;
    GMTrace.o(16356309204992L, 121864);
    return paramq;
  }
  
  public final boolean a(RecyclerView.t paramt, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(16355369680896L, 121857);
    if ((!(paramt instanceof a.d)) || (!this.iFy))
    {
      e(paramt);
      q(paramt);
      GMTrace.o(16355369680896L, 121857);
      return false;
    }
    boolean bool = super.a(paramt, paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(16355369680896L, 121857);
    return bool;
  }
  
  public final boolean a(RecyclerView.t paramt1, RecyclerView.t paramt2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(16355772334080L, 121860);
    if (z.V(paramt1.UU) == null)
    {
      z.d(paramt1.UU, 1.0F);
      z.c(paramt1.UU, 0.0F);
    }
    if (z.V(paramt2.UU) == null)
    {
      z.d(paramt2.UU, 1.0F);
      z.c(paramt2.UU, 0.0F);
    }
    k(paramt1);
    k(paramt2);
    GMTrace.o(16355772334080L, 121860);
    return false;
  }
  
  public final boolean a(RecyclerView.t paramt1, RecyclerView.t paramt2, RecyclerView.e.c paramc1, RecyclerView.e.c paramc2)
  {
    GMTrace.i(16356443422720L, 121865);
    if (!this.iFy)
    {
      k(paramt1);
      k(paramt2);
      GMTrace.o(16356443422720L, 121865);
      return false;
    }
    if ((paramc1 instanceof c))
    {
      if (((c)paramc1).abw())
      {
        ((a.d)paramt2).iEQ.setVisibility(0);
        ((a.d)paramt2).iEQ.invalidate();
        ((RecentsRecyclerView)paramt2.UU.getParent()).bK(paramt2.UU);
        this.iFM.add(paramt2);
        bool = super.a(paramt2, paramc1.left, paramc1.top, paramc2.left, paramc2.top);
        GMTrace.o(16356443422720L, 121865);
        return bool;
      }
      e(paramt2);
      this.iFG.add((a.d)paramt2);
      GMTrace.o(16356443422720L, 121865);
      return true;
    }
    if ((paramc1 instanceof e))
    {
      if (!((e)paramc1).abw())
      {
        e(paramt2);
        this.iFI.add((a.d)paramt2);
        GMTrace.o(16356443422720L, 121865);
        return true;
      }
      ((a.d)paramt2).iEQ.setVisibility(8);
      bool = super.a(paramt2, paramc1.left, paramc1.top, paramc2.left, paramc2.top);
      GMTrace.o(16356443422720L, 121865);
      return bool;
    }
    boolean bool = super.a(paramt1, paramt2, paramc1, paramc2);
    GMTrace.o(16356443422720L, 121865);
    return bool;
  }
  
  public final boolean a(RecyclerView.t paramt, List<Object> paramList)
  {
    GMTrace.i(16356577640448L, 121866);
    boolean bool = super.a(paramt, paramList);
    if (((paramt instanceof a.d)) || (bool))
    {
      GMTrace.o(16356577640448L, 121866);
      return true;
    }
    GMTrace.o(16356577640448L, 121866);
    return false;
  }
  
  final void b(RecyclerView.e.a parama)
  {
    GMTrace.i(18198313304064L, 135588);
    if (parama != null) {
      this.iFA.add(parama);
    }
    GMTrace.o(18198313304064L, 135588);
  }
  
  public final boolean b(RecyclerView.t paramt)
  {
    GMTrace.i(20696910528512L, 154204);
    if (!this.iFy)
    {
      e(paramt);
      k(paramt);
      GMTrace.o(20696910528512L, 154204);
      return false;
    }
    boolean bool = super.b(paramt);
    GMTrace.o(20696910528512L, 154204);
    return bool;
  }
  
  final void c(RecyclerView.e.a parama)
  {
    GMTrace.i(18198447521792L, 135589);
    if (parama != null) {
      this.iFA.remove(parama);
    }
    GMTrace.o(18198447521792L, 135589);
  }
  
  public final boolean c(RecyclerView.t paramt)
  {
    GMTrace.i(18198715957248L, 135591);
    e(paramt);
    k(paramt);
    GMTrace.o(18198715957248L, 135591);
    return false;
  }
  
  public final void d(RecyclerView.t paramt)
  {
    GMTrace.i(18198850174976L, 135592);
    if (((paramt instanceof a.d)) && (this.iFN.remove(paramt)))
    {
      z.c(paramt.UU, 0.0F);
      k(paramt);
    }
    super.d(paramt);
    GMTrace.o(18198850174976L, 135592);
  }
  
  public final boolean d(RecyclerView.t paramt, RecyclerView.e.c paramc1, RecyclerView.e.c paramc2)
  {
    boolean bool1 = false;
    GMTrace.i(16355638116352L, 121859);
    if (!this.iFy)
    {
      e(paramt);
      k(paramt);
      GMTrace.o(16355638116352L, 121859);
      return false;
    }
    if ((paramc1 instanceof c))
    {
      e(paramt);
      this.iFC.add(new b((a.d)paramt, paramc1.left, paramc1.top));
      GMTrace.o(16355638116352L, 121859);
      return true;
    }
    if ((paramc1 instanceof e))
    {
      e(paramt);
      this.iFE.add(new d((a.d)paramt, paramc1.left, paramc1.top));
      GMTrace.o(16355638116352L, 121859);
      return true;
    }
    if (((paramc1.Ua & 0x800) > 0) && ((paramt instanceof a.d)) && (paramc2 == null)) {}
    try
    {
      boolean bool2 = ((a.d)paramt).abp().hMM;
      bool1 = bool2;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    if (!bool1)
    {
      e(paramt);
      this.iFK.add(new f((a.d)paramt, paramc1.left, paramc1.top));
      GMTrace.o(16355638116352L, 121859);
      return true;
    }
    bool1 = super.d(paramt, paramc1, paramc2);
    GMTrace.o(16355638116352L, 121859);
    return bool1;
  }
  
  public final boolean e(RecyclerView.t paramt, RecyclerView.e.c paramc1, RecyclerView.e.c paramc2)
  {
    GMTrace.i(16355503898624L, 121858);
    if (!this.iFy)
    {
      bool = c(paramt);
      GMTrace.o(16355503898624L, 121858);
      return bool;
    }
    if ((paramc1 != null) && ((paramc1.left != paramc2.left) || (paramc1.top != paramc2.top)))
    {
      bool = super.a(paramt, paramc1.left, paramc1.top, paramc2.left, paramc2.top);
      GMTrace.o(16355503898624L, 121858);
      return bool;
    }
    if ((this.iFx) && ((paramt.UU.getParent() instanceof RecyclerView)) && ((paramt instanceof a.d)))
    {
      paramc1 = (RecyclerView)paramt.UU.getParent();
      if (paramc1.getHeight() > 0)
      {
        if (paramc2.bottom >= paramc1.getHeight())
        {
          paramt = (a.d)paramt;
          z.c(paramt.UU, paramt.UU.getHeight());
          this.iFN.add(paramt);
          GMTrace.o(16355503898624L, 121858);
          return true;
        }
        if (paramc2.top <= 0)
        {
          paramt = (a.d)paramt;
          z.c(paramt.UU, -paramt.UU.getHeight());
          this.iFN.add(paramt);
          GMTrace.o(16355503898624L, 121858);
          return true;
        }
      }
    }
    boolean bool = c(paramt);
    GMTrace.o(16355503898624L, 121858);
    return bool;
  }
  
  public final void eI()
  {
    GMTrace.i(16355235463168L, 121856);
    a(this.iFz);
    Object localObject1;
    final Object localObject2;
    final Object localObject3;
    Object localObject4;
    final Object localObject5;
    if (!this.iFC.isEmpty())
    {
      localObject1 = this.iFC.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (b)((Iterator)localObject1).next();
        this.iFD.add(((b)localObject2).iFT);
        localObject3 = ((b)localObject2).iFT;
        localObject4 = ((b)localObject2).iFT.UU;
        ((b)localObject2).iFT.iEQ.setVisibility(0);
        z.c((View)localObject4, 0.0F);
        localObject5 = z.V((View)localObject4);
        double d1 = ((b)localObject2).Qp / ((b)localObject2).iFT.UU.getHeight();
        double d2 = this.TY;
        ((ai)localObject5).d(Math.max(this.TY, Math.min(Math.round(d1 * d2) + this.TY, 400L)));
        ((ai)localObject5).b(this.iFB);
        ((ai)localObject5).a(new an()
        {
          public final void p(View paramAnonymousView)
          {
            GMTrace.i(16349598318592L, 121814);
            ((RecentsRecyclerView)paramAnonymousView.getParent()).bK(paramAnonymousView);
            g.this.r(localObject3);
            GMTrace.o(16349598318592L, 121814);
          }
          
          public final void q(View paramAnonymousView)
          {
            GMTrace.i(16349732536320L, 121815);
            if (paramAnonymousView == null)
            {
              GMTrace.o(16349732536320L, 121815);
              return;
            }
            ((RecentsRecyclerView)paramAnonymousView.getParent()).bL(paramAnonymousView);
            localObject5.a(null);
            z.c(paramAnonymousView, 0.0F);
            g.this.k(localObject3);
            g.this.iFD.remove(localObject3);
            g.this.eJ();
            GMTrace.o(16349732536320L, 121815);
          }
        });
        ((ai)localObject5).r(-((b)localObject2).Qp - ((View)localObject4).getHeight()).start();
      }
      this.iFC.clear();
    }
    if (!this.iFE.isEmpty())
    {
      localObject1 = this.iFE.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (d)((Iterator)localObject1).next();
        this.iFF.add(((d)localObject2).iFT);
        localObject3 = ((d)localObject2).iFT;
        localObject5 = ((d)localObject2).iFT.UU;
        localObject4 = (RecentsRecyclerView)((View)localObject5).getParent();
        ((d)localObject2).iFT.iEQ.setVisibility(8);
        z.c((View)localObject5, 0.0F);
        localObject5 = z.V((View)localObject5);
        ((ai)localObject5).d(this.TY);
        ((ai)localObject5).a(new an()
        {
          public final void p(View paramAnonymousView)
          {
            GMTrace.i(16369596760064L, 121963);
            ((RecentsRecyclerView)paramAnonymousView.getParent()).bK(paramAnonymousView);
            g.this.r(localObject3);
            GMTrace.o(16369596760064L, 121963);
          }
          
          public final void q(View paramAnonymousView)
          {
            GMTrace.i(16369730977792L, 121964);
            if (paramAnonymousView == null)
            {
              GMTrace.o(16369730977792L, 121964);
              return;
            }
            ((RecentsRecyclerView)paramAnonymousView.getParent()).bL(paramAnonymousView);
            localObject5.a(null);
            z.c(paramAnonymousView, 0.0F);
            g.this.k(localObject3);
            g.this.iFF.remove(localObject3);
            g.this.eJ();
            GMTrace.o(16369730977792L, 121964);
          }
        });
        ((ai)localObject5).r(((RecentsRecyclerView)localObject4).getHeight() - ((d)localObject2).Qp).start();
      }
      this.iFE.clear();
    }
    if (!this.iFG.isEmpty())
    {
      localObject1 = this.iFG.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (a.d)((Iterator)localObject1).next();
        this.iFH.add(localObject2);
        z.e(((a.d)localObject2).iEQ, 0.1F);
        z.f(((a.d)localObject2).iEQ, 0.1F);
        z.d(((a.d)localObject2).iEQ, 0.0F);
        ((a.d)localObject2).iEQ.setVisibility(0);
        localObject3 = z.V(((a.d)localObject2).iEQ);
        ((ai)localObject3).d(this.TZ);
        ((ai)localObject3).a(new an()
        {
          public final void p(View paramAnonymousView)
          {
            GMTrace.i(16357382946816L, 121872);
            GMTrace.o(16357382946816L, 121872);
          }
          
          public final void q(View paramAnonymousView)
          {
            GMTrace.i(16357517164544L, 121873);
            localObject3.a(null);
            g.this.k(localObject2);
            g.this.iFH.remove(localObject2);
            g.this.eJ();
            GMTrace.o(16357517164544L, 121873);
          }
        });
        ((ai)localObject3).p(1.0F).s(1.0F).t(1.0F).start();
      }
      this.iFG.clear();
    }
    if (!this.iFI.isEmpty())
    {
      localObject1 = this.iFI.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (a.d)((Iterator)localObject1).next();
        this.iFJ.add(localObject2);
        z.e(((a.d)localObject2).iEQ, 1.0F);
        z.f(((a.d)localObject2).iEQ, 1.0F);
        z.d(((a.d)localObject2).iEQ, 1.0F);
        ((a.d)localObject2).iEQ.setVisibility(0);
        localObject3 = z.V(((a.d)localObject2).iEQ);
        ((ai)localObject3).d(this.TZ);
        ((ai)localObject3).a(new an()
        {
          public final void p(View paramAnonymousView)
          {
            GMTrace.i(16365436010496L, 121932);
            GMTrace.o(16365436010496L, 121932);
          }
          
          public final void q(View paramAnonymousView)
          {
            GMTrace.i(16365570228224L, 121933);
            z.e(localObject2.iEQ, 1.0F);
            z.f(localObject2.iEQ, 1.0F);
            z.d(localObject2.iEQ, 1.0F);
            localObject2.iEQ.setVisibility(8);
            g.this.k(localObject2);
            g.this.iFJ.remove(localObject2);
            g.this.eJ();
            GMTrace.o(16365570228224L, 121933);
          }
        });
        ((ai)localObject3).p(0.0F).s(0.1F).t(0.1F).start();
      }
      this.iFI.clear();
    }
    if (!this.iFK.isEmpty())
    {
      localObject1 = this.iFK.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject3 = (f)((Iterator)localObject1).next();
        this.iFL.add(((f)localObject3).iFT);
        localObject2 = ((f)localObject3).iFT.UU;
        z.c((View)localObject2, 0.0F);
        z.d((View)localObject2, 1.0F);
        localObject3 = ((f)localObject3).iFT;
        localObject4 = z.V((View)localObject2);
        ((ai)localObject4).d(this.TY);
        ((ai)localObject4).a(new an()
        {
          public final void p(View paramAnonymousView)
          {
            GMTrace.i(18196300038144L, 135573);
            g.this.r(localObject3);
            GMTrace.o(18196300038144L, 135573);
          }
          
          public final void q(View paramAnonymousView)
          {
            GMTrace.i(18196434255872L, 135574);
            z.c(paramAnonymousView, 0.0F);
            z.d(paramAnonymousView, 1.0F);
            g.this.k(localObject3);
            g.this.iFL.remove(localObject3);
            g.this.eJ();
            GMTrace.o(18196434255872L, 135574);
          }
        });
        ((ai)localObject4).p(0.0F).r(-((View)localObject2).getHeight()).start();
      }
      this.iFK.clear();
    }
    super.eI();
    if (!this.iFN.isEmpty())
    {
      this.iFO.addAll(this.iFN);
      localObject1 = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18195092078592L, 135564);
          Iterator localIterator = g.this.iFO.iterator();
          while (localIterator.hasNext())
          {
            a.d locald = (a.d)localIterator.next();
            g localg = g.this;
            ai localai = z.V(locald.UU);
            localg.iFP.add(locald);
            localai.r(0.0F).d(localg.TY).a(new g.8(localg, locald, localai)).start();
          }
          g.this.iFO.clear();
          GMTrace.o(18195092078592L, 135564);
        }
      };
      this.iFN.clear();
      if (this.iFQ)
      {
        z.a(((a.d)this.iFO.get(0)).UU, (Runnable)localObject1, this.TX);
        GMTrace.o(16355235463168L, 121856);
        return;
      }
      ((Runnable)localObject1).run();
    }
    GMTrace.o(16355235463168L, 121856);
  }
  
  public final void eJ()
  {
    GMTrace.i(16354967027712L, 121854);
    if (!isRunning()) {
      fQ();
    }
    GMTrace.o(16354967027712L, 121854);
  }
  
  public final boolean f(RecyclerView.t paramt, RecyclerView.e.c paramc1, RecyclerView.e.c paramc2)
  {
    GMTrace.i(20697044746240L, 154205);
    if (!this.iFy)
    {
      e(paramt);
      q(paramt);
      GMTrace.o(20697044746240L, 154205);
      return false;
    }
    boolean bool = super.f(paramt, paramc1, paramc2);
    GMTrace.o(20697044746240L, 154205);
    return bool;
  }
  
  public final boolean isRunning()
  {
    GMTrace.i(16355101245440L, 121855);
    if ((!this.iFC.isEmpty()) || (!this.iFD.isEmpty()) || (!this.iFE.isEmpty()) || (!this.iFF.isEmpty()) || (!this.iFG.isEmpty()) || (!this.iFH.isEmpty()) || (!this.iFI.isEmpty()) || (!this.iFJ.isEmpty()) || (!this.iFK.isEmpty()) || (!this.iFL.isEmpty()) || (!this.iFN.isEmpty()) || (!this.iFO.isEmpty()) || (!this.iFP.isEmpty()) || (super.isRunning()))
    {
      GMTrace.o(16355101245440L, 121855);
      return true;
    }
    GMTrace.o(16355101245440L, 121855);
    return false;
  }
  
  public final void l(RecyclerView.t paramt)
  {
    GMTrace.i(16355906551808L, 121861);
    super.l(paramt);
    ViewParent localViewParent = paramt.UU.getParent();
    if ((localViewParent instanceof RecentsRecyclerView)) {
      ((RecentsRecyclerView)localViewParent).bL(paramt.UU);
    }
    GMTrace.o(16355906551808L, 121861);
  }
  
  public final void r(RecyclerView.t paramt)
  {
    GMTrace.i(18198581739520L, 135590);
    super.r(paramt);
    if (!this.iFL.contains(paramt)) {
      this.iFQ = true;
    }
    GMTrace.o(18198581739520L, 135590);
  }
  
  public final void s(RecyclerView.t paramt)
  {
    GMTrace.i(16356040769536L, 121862);
    super.s(paramt);
    if (this.iFM.contains(paramt)) {
      ((RecentsRecyclerView)paramt.UU.getParent()).bK(paramt.UU);
    }
    GMTrace.o(16356040769536L, 121862);
  }
  
  public final void t(RecyclerView.t paramt)
  {
    GMTrace.i(16356174987264L, 121863);
    super.t(paramt);
    if (this.iFM.contains(paramt))
    {
      this.iFM.remove(paramt);
      ((RecentsRecyclerView)paramt.UU.getParent()).bL(paramt.UU);
    }
    GMTrace.o(16356174987264L, 121863);
  }
  
  private static class a
    extends RecyclerView.e.c
  {
    public a()
    {
      GMTrace.i(16351343149056L, 121827);
      GMTrace.o(16351343149056L, 121827);
    }
    
    final boolean abw()
    {
      GMTrace.i(16351611584512L, 121829);
      if ((this.Ua & 0x800) > 0)
      {
        GMTrace.o(16351611584512L, 121829);
        return true;
      }
      GMTrace.o(16351611584512L, 121829);
      return false;
    }
    
    public final RecyclerView.e.c b(RecyclerView.t paramt, int paramInt)
    {
      GMTrace.i(16351477366784L, 121828);
      super.b(paramt, paramInt);
      this.Ua = paramInt;
      GMTrace.o(16351477366784L, 121828);
      return this;
    }
  }
  
  private static final class b
    extends g.g
  {
    b(a.d paramd, int paramInt1, int paramInt2)
    {
      super(paramInt1, paramInt2);
      GMTrace.i(16352819544064L, 121838);
      GMTrace.o(16352819544064L, 121838);
    }
  }
  
  private static final class c
    extends g.a
  {
    public c()
    {
      GMTrace.i(16353222197248L, 121841);
      GMTrace.o(16353222197248L, 121841);
    }
  }
  
  private static final class d
    extends g.g
  {
    d(a.d paramd, int paramInt1, int paramInt2)
    {
      super(paramInt1, paramInt2);
      GMTrace.i(16357651382272L, 121874);
      GMTrace.o(16357651382272L, 121874);
    }
  }
  
  private static final class e
    extends g.a
  {
    public e()
    {
      GMTrace.i(16350537842688L, 121821);
      GMTrace.o(16350537842688L, 121821);
    }
  }
  
  private static final class f
  {
    int Qo;
    int Qp;
    a.d iFT;
    
    public f(a.d paramd, int paramInt1, int paramInt2)
    {
      GMTrace.i(16365167575040L, 121930);
      this.iFT = paramd;
      this.Qo = paramInt1;
      this.Qp = paramInt2;
      GMTrace.o(16365167575040L, 121930);
    }
  }
  
  private static class g
  {
    int Qo;
    int Qp;
    a.d iFT;
    
    g(a.d paramd, int paramInt1, int paramInt2)
    {
      GMTrace.i(16363288526848L, 121916);
      this.iFT = paramd;
      this.Qo = paramInt1;
      this.Qp = paramInt2;
      GMTrace.o(16363288526848L, 121916);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ui\recents\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */