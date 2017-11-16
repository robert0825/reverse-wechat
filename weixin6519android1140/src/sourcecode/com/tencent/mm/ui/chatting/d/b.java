package com.tencent.mm.ui.chatting.d;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.os.HandlerThread;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.support.v7.widget.RecyclerView.g;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.cf.a;
import com.tencent.mm.g.a.cf.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.pluginsdk.ui.tools.p.a;
import com.tencent.mm.protocal.c.ue;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.chatting.a.b.f;
import com.tencent.mm.ui.chatting.ab;
import com.tencent.mm.ui.chatting.c.b.a;
import com.tencent.mm.ui.chatting.dx;
import com.tencent.mm.ui.chatting.dx.a;
import com.tencent.mm.ui.chatting.z;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public abstract class b
  implements b.f, b.a
{
  protected ArrayList<com.tencent.mm.ui.chatting.a.b.b> iFZ;
  protected String iGc;
  protected Context mContext;
  private boolean tIv;
  private LinearLayoutManager wOA;
  protected ArrayList<com.tencent.mm.ui.chatting.a.b.b> wOB;
  protected com.tencent.mm.ui.chatting.c.b.b wOy;
  com.tencent.mm.ui.chatting.a.b wOz;
  private long wzI;
  
  public b(Context paramContext)
  {
    GMTrace.i(14943936053248L, 111341);
    this.iFZ = null;
    this.wOB = null;
    this.tIv = false;
    this.wzI = 0L;
    this.mContext = paramContext;
    this.iFZ = new ArrayList();
    GMTrace.o(14943936053248L, 111341);
  }
  
  protected static String b(au paramau, boolean paramBoolean)
  {
    String str1 = null;
    GMTrace.i(16452677533696L, 122582);
    if (paramau == null)
    {
      GMTrace.o(16452677533696L, 122582);
      return null;
    }
    if (paramau.field_isSend == 1)
    {
      paramau = q.zE();
      GMTrace.o(16452677533696L, 122582);
      return paramau;
    }
    if (paramBoolean) {
      str1 = bc.gP(paramau.field_content);
    }
    String str2 = str1;
    if (bg.nm(str1)) {
      str2 = paramau.field_talker;
    }
    GMTrace.o(16452677533696L, 122582);
    return str2;
  }
  
  protected final boolean CU()
  {
    GMTrace.i(14944741359616L, 111347);
    long l1 = this.wzI;
    long l2 = System.currentTimeMillis();
    this.wzI = l2;
    if (l1 + 30000L < l2)
    {
      at.AR();
      this.tIv = c.isSDCardAvailable();
    }
    boolean bool = this.tIv;
    GMTrace.o(14944741359616L, 111347);
    return bool;
  }
  
  public final com.tencent.mm.ui.chatting.a.b.b CV(int paramInt)
  {
    GMTrace.i(16452140662784L, 122578);
    if ((this.iFZ == null) || (this.iFZ.size() <= paramInt))
    {
      GMTrace.o(16452140662784L, 122578);
      return null;
    }
    com.tencent.mm.ui.chatting.a.b.b localb = (com.tencent.mm.ui.chatting.a.b.b)this.iFZ.get(paramInt);
    GMTrace.o(16452140662784L, 122578);
    return localb;
  }
  
  public final RecyclerView.a Wr(String paramString)
  {
    GMTrace.i(16452274880512L, 122579);
    this.iGc = paramString;
    this.wOz = new com.tencent.mm.ui.chatting.a.b(this.mContext, this);
    com.tencent.mm.ui.chatting.a.b.wIa = cfa();
    paramString = this.wOz;
    GMTrace.o(16452274880512L, 122579);
    return paramString;
  }
  
  public final RecyclerView.g ceY()
  {
    GMTrace.i(14944204488704L, 111343);
    RecyclerView.g local1 = new RecyclerView.g()
    {
      int mSize;
      int wOC;
      ColorDrawable wOD;
      
      public final void a(Canvas paramAnonymousCanvas, RecyclerView paramAnonymousRecyclerView)
      {
        GMTrace.i(14941922787328L, 111326);
        int j = paramAnonymousRecyclerView.getPaddingLeft();
        int k = paramAnonymousRecyclerView.getWidth();
        int m = paramAnonymousRecyclerView.getPaddingRight();
        int n = paramAnonymousRecyclerView.getChildCount();
        int i = 0;
        while (i < n)
        {
          View localView = paramAnonymousRecyclerView.getChildAt(i);
          if (localView.getTag() != null)
          {
            Object localObject = b.this.CV(((Integer)localView.getTag()).intValue() + 1);
            if ((localObject == null) || (((com.tencent.mm.ui.chatting.a.b.b)localObject).getType() != Integer.MAX_VALUE))
            {
              localObject = (RecyclerView.LayoutParams)localView.getLayoutParams();
              int i1 = localView.getBottom();
              i1 = ((RecyclerView.LayoutParams)localObject).bottomMargin + i1;
              int i2 = this.mSize;
              this.wOD.setBounds(j, i1, k - m, i2 + i1);
              this.wOD.draw(paramAnonymousCanvas);
            }
          }
          i += 1;
        }
        GMTrace.o(14941922787328L, 111326);
      }
    };
    GMTrace.o(14944204488704L, 111343);
    return local1;
  }
  
  public final p.a cfb()
  {
    GMTrace.i(16452543315968L, 122581);
    p.a local2 = new p.a()
    {
      private aj jRC;
      String wIc;
      
      public final void QA()
      {
        GMTrace.i(16457240936448L, 122616);
        GMTrace.o(16457240936448L, 122616);
      }
      
      public final void QB()
      {
        GMTrace.i(16786879676416L, 125072);
        w.i("MicroMsg.BaseHistoryListPresenter", "onSearchEditTextReady");
        GMTrace.o(16786879676416L, 125072);
      }
      
      public final void Qy()
      {
        GMTrace.i(16456838283264L, 122613);
        w.d("MicroMsg.BaseHistoryListPresenter", "onQuitSearch");
        if (b.this.wOy != null) {
          b.this.wOy.onFinish();
        }
        GMTrace.o(16456838283264L, 122613);
      }
      
      public final void Qz()
      {
        GMTrace.i(16456704065536L, 122612);
        GMTrace.o(16456704065536L, 122612);
      }
      
      public final void a(boolean paramAnonymousBoolean, String[] paramAnonymousArrayOfString, long paramAnonymousLong, int paramAnonymousInt)
      {
        GMTrace.i(16456569847808L, 122611);
        GMTrace.o(16456569847808L, 122611);
      }
      
      public final void aim()
      {
        GMTrace.i(16456301412352L, 122609);
        GMTrace.o(16456301412352L, 122609);
      }
      
      public final void ain()
      {
        GMTrace.i(16456435630080L, 122610);
        GMTrace.o(16456435630080L, 122610);
      }
      
      public final boolean nC(String paramAnonymousString)
      {
        GMTrace.i(16457106718720L, 122615);
        GMTrace.o(16457106718720L, 122615);
        return false;
      }
      
      public final void nD(String paramAnonymousString)
      {
        GMTrace.i(16456972500992L, 122614);
        if (!this.wIc.equals(paramAnonymousString))
        {
          this.wIc = paramAnonymousString;
          this.jRC.stopTimer();
          this.jRC.z(500L, 500L);
        }
        GMTrace.o(16456972500992L, 122614);
      }
    };
    GMTrace.o(16452543315968L, 122581);
    return local2;
  }
  
  public final void d(int paramInt, final au paramau)
  {
    GMTrace.i(14944607141888L, 111346);
    w.i("MicroMsg.BaseHistoryListPresenter", "[handleSelectedItem] index:%s", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(14944607141888L, 111346);
      return;
      final Object localObject = new cf();
      ArrayList localArrayList = new ArrayList(1);
      localArrayList.add(paramau);
      if (com.tencent.mm.pluginsdk.model.g.a(this.mContext, (cf)localObject, this.iGc, localArrayList, false, false))
      {
        ((cf)localObject).eDv.eDC = 45;
        ((cf)localObject).eDv.activity = ((Activity)this.mContext);
        a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
        if ((((cf)localObject).eDw.ret == -2) || (((cf)localObject).eDw.ret > 0))
        {
          GMTrace.o(14944607141888L, 111346);
          return;
        }
        if (((cf)localObject).eDw.ret <= 0)
        {
          if (14 != ((cf)localObject).eDv.type)
          {
            w.d("MicroMsg.BaseHistoryListPresenter", "not record type, do not report");
            GMTrace.o(14944607141888L, 111346);
            return;
          }
          if (((cf)localObject).eDv.eDy == null)
          {
            w.e("MicroMsg.BaseHistoryListPresenter", "want to report record fav, but type count is null");
            GMTrace.o(14944607141888L, 111346);
            return;
          }
          com.tencent.mm.plugin.report.service.g.ork.i(11142, new Object[] { Integer.valueOf(((cf)localObject).eDv.eDy.ulQ), Integer.valueOf(((cf)localObject).eDv.eDy.ulR), Integer.valueOf(((cf)localObject).eDv.eDy.ulS), Integer.valueOf(((cf)localObject).eDv.eDy.ulT), Integer.valueOf(((cf)localObject).eDv.eDy.ulU), Integer.valueOf(((cf)localObject).eDv.eDy.ulV), Integer.valueOf(((cf)localObject).eDv.eDy.ulW), Integer.valueOf(((cf)localObject).eDv.eDy.ulX), Integer.valueOf(((cf)localObject).eDv.eDy.ulY), Integer.valueOf(((cf)localObject).eDv.eDy.ulZ), Integer.valueOf(((cf)localObject).eDv.eDy.uma), Integer.valueOf(((cf)localObject).eDv.eDy.umb), Integer.valueOf(((cf)localObject).eDv.eDy.umc), Integer.valueOf(((cf)localObject).eDv.eDy.umd), Integer.valueOf(((cf)localObject).eDv.eDy.ume) });
        }
        GMTrace.o(14944607141888L, 111346);
        return;
      }
      w.e("MicroMsg.BaseHistoryListPresenter", "[handleFav] err!");
      GMTrace.o(14944607141888L, 111346);
      return;
      com.tencent.mm.plugin.report.service.g.ork.a(219L, 19L, 1L, true);
      boolean bool = this.iGc.toLowerCase().endsWith("@chatroom");
      localObject = new ArrayList(1);
      ((ArrayList)localObject).add(paramau);
      ab.a(this.mContext, (List)localObject, bool, this.iGc, new dx()
      {
        public final void a(dx.a paramAnonymousa)
        {
          GMTrace.i(16448516784128L, 122551);
          GMTrace.o(16448516784128L, 122551);
        }
        
        public final void b(dx.a paramAnonymousa)
        {
          GMTrace.i(16448651001856L, 122552);
          GMTrace.o(16448651001856L, 122552);
        }
        
        public final void ccH()
        {
          GMTrace.i(16448382566400L, 122550);
          GMTrace.o(16448382566400L, 122550);
        }
        
        public final boolean ccI()
        {
          GMTrace.i(16448785219584L, 122553);
          GMTrace.o(16448785219584L, 122553);
          return true;
        }
      });
      GMTrace.o(14944607141888L, 111346);
      return;
      com.tencent.mm.plugin.report.service.g.ork.i(11627, new Object[] { Integer.valueOf(5) });
      localObject = new TreeSet();
      ((Set)localObject).add(Long.valueOf(paramau.field_msgId));
      h.a(this.mContext, this.mContext.getString(R.l.din), "", this.mContext.getString(R.l.dmE), this.mContext.getString(R.l.cSk), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(16450261614592L, 122564);
          w.i("MicroMsg.BaseHistoryListPresenter", "delete message");
          z.a(b.this.mContext, localObject, new dx()
          {
            public final void a(dx.a paramAnonymous2a)
            {
              GMTrace.i(16453348622336L, 122587);
              if (paramAnonymous2a == dx.a.wFR)
              {
                paramAnonymous2a = new com.tencent.mm.ui.chatting.a.b.b()
                {
                  public final int getType()
                  {
                    GMTrace.i(16451201138688L, 122571);
                    GMTrace.o(16451201138688L, 122571);
                    return -1;
                  }
                };
                paramAnonymous2a.eDr = b.4.this.gWz.field_msgId;
                b.this.iFZ.remove(paramAnonymous2a);
                b.this.wOB.remove(paramAnonymous2a);
              }
              GMTrace.o(16453348622336L, 122587);
            }
            
            public final void b(dx.a paramAnonymous2a)
            {
              GMTrace.i(16453482840064L, 122588);
              w.i("MicroMsg.BaseHistoryListPresenter", "[requestExitSelectedMode] %s del ", new Object[] { Thread.currentThread(), paramAnonymous2a });
              if (paramAnonymous2a == dx.a.wFR) {
                b.this.wOz.TS.notifyChanged();
              }
              GMTrace.o(16453482840064L, 122588);
            }
            
            public final void ccH()
            {
              GMTrace.i(16453214404608L, 122586);
              GMTrace.o(16453214404608L, 122586);
            }
            
            public final boolean ccI()
            {
              GMTrace.i(16453617057792L, 122589);
              GMTrace.o(16453617057792L, 122589);
              return true;
            }
          });
          GMTrace.o(16450261614592L, 122564);
        }
      }, null);
    }
  }
  
  public final int getCount()
  {
    GMTrace.i(16452409098240L, 122580);
    if (this.iFZ == null)
    {
      GMTrace.o(16452409098240L, 122580);
      return 0;
    }
    int i = this.iFZ.size();
    GMTrace.o(16452409098240L, 122580);
    return i;
  }
  
  public final void onDetach()
  {
    GMTrace.i(14944070270976L, 111342);
    this.wOy.a(null);
    this.wOy = null;
    if (this.wOz != null)
    {
      com.tencent.mm.ui.chatting.a.b.wIa = null;
      com.tencent.mm.ui.chatting.a.b.wIb = null;
    }
    GMTrace.o(14944070270976L, 111342);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\chatting\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */