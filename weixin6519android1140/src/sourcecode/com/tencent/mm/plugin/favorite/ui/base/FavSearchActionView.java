package com.tencent.mm.plugin.favorite.ui.base;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MMTagPanel;
import com.tencent.mm.ui.base.MMTagPanel.d;
import com.tencent.mm.ui.widget.MMEditText;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FavSearchActionView
  extends LinearLayout
{
  public List<Integer> lfZ;
  public FavTagPanel lfj;
  private ImageButton lgO;
  public List<String> lgP;
  public List<String> lgQ;
  public a lgR;
  
  public FavSearchActionView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6462046732288L, 48146);
    this.lfZ = new LinkedList();
    this.lgP = new LinkedList();
    this.lgQ = new LinkedList();
    GMTrace.o(6462046732288L, 48146);
  }
  
  public final void ayX()
  {
    GMTrace.i(6462449385472L, 48149);
    if ((this.lfZ.isEmpty()) && (this.lgP.isEmpty()))
    {
      this.lfj.VE(getResources().getString(R.l.cUr));
      GMTrace.o(6462449385472L, 48149);
      return;
    }
    this.lfj.VE("");
    GMTrace.o(6462449385472L, 48149);
  }
  
  protected void onFinishInflate()
  {
    GMTrace.i(6462180950016L, 48147);
    super.onFinishInflate();
    this.lgO = ((ImageButton)findViewById(R.h.cah));
    this.lfj = ((FavTagPanel)findViewById(R.h.bzs));
    if (this.lfj != null)
    {
      FavTagPanel localFavTagPanel = this.lfj;
      int i = getResources().getColor(R.e.white);
      if (localFavTagPanel.wfn != null) {
        localFavTagPanel.wfn.setTextColor(i);
      }
      this.lfj.wfe = 0;
      this.lfj.wfg = 0;
      this.lfj.mqy = 0;
      this.lfj.mqz = R.e.aPp;
      this.lfj.lgj = 0;
      this.lfj.lgi = R.e.white;
      this.lfj.VE(getResources().getString(R.l.cUr));
      this.lfj.lJ(true);
      this.lfj.wfb = false;
      this.lfj.wfc = true;
      localFavTagPanel = this.lfj;
      FavTagPanel.a local1 = new FavTagPanel.a()
      {
        public final void atg()
        {
          GMTrace.i(6449430265856L, 48052);
          if (FavSearchActionView.d(FavSearchActionView.this) == null)
          {
            GMTrace.o(6449430265856L, 48052);
            return;
          }
          FavSearchActionView.d(FavSearchActionView.this).Qz();
          GMTrace.o(6449430265856L, 48052);
        }
        
        public final void j(boolean paramAnonymousBoolean, int paramAnonymousInt)
        {
          GMTrace.i(6449832919040L, 48055);
          GMTrace.o(6449832919040L, 48055);
        }
        
        public final void wv(String paramAnonymousString)
        {
          GMTrace.i(6448759177216L, 48047);
          w.d("MicroMsg.FavSearchActionView", "unselected tag %s", new Object[] { paramAnonymousString });
          FavSearchActionView.a(FavSearchActionView.this).removeTag(paramAnonymousString);
          wx(paramAnonymousString);
          GMTrace.o(6448759177216L, 48047);
        }
        
        public final void ww(String paramAnonymousString)
        {
          GMTrace.i(6448893394944L, 48048);
          GMTrace.o(6448893394944L, 48048);
        }
        
        public final void wx(String paramAnonymousString)
        {
          GMTrace.i(6449027612672L, 48049);
          FavSearchActionView.a(FavSearchActionView.this, FavSearchActionView.a(FavSearchActionView.this).cam());
          FavSearchActionView.b(FavSearchActionView.this).remove(paramAnonymousString);
          FavSearchActionView.c(FavSearchActionView.this);
          if (FavSearchActionView.d(FavSearchActionView.this) == null)
          {
            GMTrace.o(6449027612672L, 48049);
            return;
          }
          FavSearchActionView.d(FavSearchActionView.this).a(FavSearchActionView.e(FavSearchActionView.this), FavSearchActionView.f(FavSearchActionView.this), FavSearchActionView.b(FavSearchActionView.this), true);
          GMTrace.o(6449027612672L, 48049);
        }
        
        public final void wy(String paramAnonymousString)
        {
          GMTrace.i(6449161830400L, 48050);
          FavSearchActionView.a(FavSearchActionView.this, FavSearchActionView.a(FavSearchActionView.this).cam());
          FavSearchActionView.c(FavSearchActionView.this);
          if (FavSearchActionView.d(FavSearchActionView.this) == null)
          {
            GMTrace.o(6449161830400L, 48050);
            return;
          }
          FavSearchActionView.d(FavSearchActionView.this).a(FavSearchActionView.e(FavSearchActionView.this), FavSearchActionView.f(FavSearchActionView.this), FavSearchActionView.b(FavSearchActionView.this));
          GMTrace.o(6449161830400L, 48050);
        }
        
        public final void wz(String paramAnonymousString)
        {
          GMTrace.i(6449296048128L, 48051);
          FavSearchActionView.a(FavSearchActionView.this, paramAnonymousString);
          FavSearchActionView.d(FavSearchActionView.this).a(FavSearchActionView.e(FavSearchActionView.this), FavSearchActionView.f(FavSearchActionView.this), FavSearchActionView.b(FavSearchActionView.this), false);
          GMTrace.o(6449296048128L, 48051);
        }
        
        public final void yf(String paramAnonymousString)
        {
          GMTrace.i(6449564483584L, 48053);
          FavSearchActionView.a(FavSearchActionView.this, FavSearchActionView.a(FavSearchActionView.this).cam());
          FavSearchActionView.e(FavSearchActionView.this).remove(x.T(FavSearchActionView.this.getContext(), paramAnonymousString));
          FavSearchActionView.c(FavSearchActionView.this);
          if (FavSearchActionView.d(FavSearchActionView.this) == null)
          {
            GMTrace.o(6449564483584L, 48053);
            return;
          }
          FavSearchActionView.d(FavSearchActionView.this).a(FavSearchActionView.e(FavSearchActionView.this), FavSearchActionView.f(FavSearchActionView.this), FavSearchActionView.b(FavSearchActionView.this), true);
          GMTrace.o(6449564483584L, 48053);
        }
        
        public final void yg(String paramAnonymousString)
        {
          GMTrace.i(6449698701312L, 48054);
          w.d("MicroMsg.FavSearchActionView", "unselected type %s", new Object[] { paramAnonymousString });
          FavSearchActionView.a(FavSearchActionView.this).yh(paramAnonymousString);
          yf(paramAnonymousString);
          GMTrace.o(6449698701312L, 48054);
        }
      };
      localFavTagPanel.lgX = local1;
      localFavTagPanel.wfk = local1;
    }
    if (this.lgO != null) {
      this.lgO.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6448490741760L, 48045);
          if (FavSearchActionView.d(FavSearchActionView.this) == null)
          {
            GMTrace.o(6448490741760L, 48045);
            return;
          }
          paramAnonymousView = FavSearchActionView.a(FavSearchActionView.this);
          Iterator localIterator = paramAnonymousView.lgW.iterator();
          MMTagPanel.d locald;
          while (localIterator.hasNext())
          {
            locald = (MMTagPanel.d)localIterator.next();
            paramAnonymousView.removeView(locald.wfC);
            paramAnonymousView.a(locald);
          }
          paramAnonymousView.lgW.clear();
          paramAnonymousView.cat();
          paramAnonymousView = FavSearchActionView.a(FavSearchActionView.this);
          localIterator = paramAnonymousView.ulN.iterator();
          while (localIterator.hasNext())
          {
            locald = (MMTagPanel.d)localIterator.next();
            paramAnonymousView.removeView(locald.wfC);
            paramAnonymousView.a(locald);
          }
          paramAnonymousView.ulN.clear();
          paramAnonymousView.cat();
          FavSearchActionView.a(FavSearchActionView.this).can();
          FavSearchActionView.e(FavSearchActionView.this).clear();
          FavSearchActionView.f(FavSearchActionView.this).clear();
          FavSearchActionView.b(FavSearchActionView.this).clear();
          FavSearchActionView.d(FavSearchActionView.this).a(FavSearchActionView.e(FavSearchActionView.this), FavSearchActionView.f(FavSearchActionView.this), FavSearchActionView.b(FavSearchActionView.this), true);
          FavSearchActionView.c(FavSearchActionView.this);
          GMTrace.o(6448490741760L, 48045);
        }
      });
    }
    GMTrace.o(6462180950016L, 48147);
  }
  
  public final void ye(String paramString)
  {
    GMTrace.i(6462315167744L, 48148);
    this.lgQ.clear();
    paramString = bg.aq(paramString, "").split(" ");
    int j = paramString.length;
    int i = 0;
    while (i < j)
    {
      String str = paramString[i];
      if (!bg.nm(str)) {
        this.lgQ.add(str);
      }
      i += 1;
    }
    GMTrace.o(6462315167744L, 48148);
  }
  
  public static abstract interface a
  {
    public abstract void Qz();
    
    public abstract void a(List<Integer> paramList, List<String> paramList1, List<String> paramList2);
    
    public abstract void a(List<Integer> paramList, List<String> paramList1, List<String> paramList2, boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\base\FavSearchActionView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */