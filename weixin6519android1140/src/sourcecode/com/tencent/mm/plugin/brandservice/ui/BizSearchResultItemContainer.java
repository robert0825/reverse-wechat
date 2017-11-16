package com.tencent.mm.plugin.brandservice.ui;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.brandservice.a.h;
import com.tencent.mm.plugin.brandservice.a.i;
import com.tencent.mm.protocal.c.baw;
import com.tencent.mm.protocal.c.in;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.List;

public class BizSearchResultItemContainer
  extends LinearLayout
  implements e
{
  private int gRb;
  int jtF;
  private ListView jtV;
  c jtW;
  private TextView jtX;
  c jtY;
  private a jtZ;
  i jua;
  b jub;
  private long[] juc;
  int jud;
  private boolean jue;
  int juf;
  
  public BizSearchResultItemContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(10881702297600L, 81075);
    this.gRb = 0;
    paramContext = View.inflate(getContext(), R.i.caM, this);
    this.jtY = new c();
    this.jtZ = new a();
    this.jtX = ((TextView)paramContext.findViewById(R.h.bwv));
    this.jtV = ((ListView)paramContext.findViewById(R.h.bYz));
    GMTrace.o(10881702297600L, 81075);
  }
  
  private void c(String paramString, int paramInt, long paramLong)
  {
    GMTrace.i(10881970733056L, 81077);
    this.jtY.jul = true;
    at.wS().a(1071, this);
    Object localObject2 = null;
    Object localObject1 = this.jtW.aV(this.juc[(this.juc.length - 1)]);
    if (localObject1 != null)
    {
      localObject1 = ((c.a)localObject1).jtU;
      if ((localObject1 != null) && (((List)localObject1).size() != 0)) {
        break label205;
      }
      w.i("MicroMsg.BrandService.BizSearchResultItemContainer", "Get business content by type failed.(keyword : %s, offset : %s, businessType : %s)", new Object[] { paramString, Integer.valueOf(paramInt), Long.valueOf(paramLong) });
      localObject1 = localObject2;
      label110:
      if (localObject1 == null) {
        break label229;
      }
    }
    label205:
    label229:
    for (localObject1 = ((in)localObject1).tXx;; localObject1 = "")
    {
      w.d("MicroMsg.BrandService.BizSearchResultItemContainer", "keyword(%s), offset(%d), businessType(%d), searchId(%s).", new Object[] { paramString, Integer.valueOf(paramInt), Long.valueOf(paramLong), localObject1 });
      paramString = new h(paramString, paramLong, paramInt, this.gRb, (String)localObject1);
      at.wS().a(paramString, 0);
      this.jtZ.lu(1);
      GMTrace.o(10881970733056L, 81077);
      return;
      localObject1 = null;
      break;
      localObject1 = (in)((List)localObject1).get(((List)localObject1).size() - 1);
      break label110;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(10882104950784L, 81078);
    w.i("MicroMsg.BrandService.BizSearchResultItemContainer", "errType (%d) , errCode (%d) , errMsg (errMsg)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (this.jub != null) {
      this.jub.ail();
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      this.jtY.jul = false;
      this.jue = true;
      Toast.makeText(getContext(), getContext().getString(R.l.dxd, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
      GMTrace.o(10882104950784L, 81078);
      return;
    }
    this.jue = false;
    if (paramk == null)
    {
      w.e("MicroMsg.BrandService.BizSearchResultItemContainer", "scene is null.");
      GMTrace.o(10882104950784L, 81078);
      return;
    }
    label244:
    label250:
    int i;
    int j;
    if (paramk.getType() == 1070)
    {
      w.i("MicroMsg.BrandService.BizSearchResultItemContainer", "BizSearchHomePage.");
      at.wS().b(1070, this);
      paramString = (i)paramk;
      if (paramString.jtf == null)
      {
        paramString = null;
        this.jtW.c(this.jtY.eBj, paramString);
        paramk = this.jtW.aV(this.juc[(this.juc.length - 1)]);
        if ((paramk != null) && (!paramk.jtT)) {
          break label410;
        }
        paramInt1 = 0;
        if (paramInt1 != 0) {
          break label419;
        }
        paramInt2 = 3;
        if ((paramString != null) && (paramString.size() > 0))
        {
          paramString = (in)paramString.get(paramString.size() - 1);
          if (paramString != null) {
            this.jtY.offset = (paramString.tWu + this.jud);
          }
        }
        i = paramInt1;
        j = paramInt2;
        if (!this.jtW.isEmpty()) {
          break label601;
        }
        new ae(Looper.getMainLooper()).post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(10870025355264L, 80988);
            TextView localTextView = BizSearchResultItemContainer.e(BizSearchResultItemContainer.this);
            if (BizSearchResultItemContainer.d(BizSearchResultItemContainer.this).isEmpty()) {}
            for (int i = 0;; i = 8)
            {
              localTextView.setVisibility(i);
              GMTrace.o(10870025355264L, 80988);
              return;
            }
          }
        });
      }
    }
    for (;;)
    {
      this.jtY.gLP = i;
      this.jtZ.lu(j);
      this.jtY.jul = false;
      w.v("MicroMsg.BrandService.BizSearchResultItemContainer", "The next load data offset is (%d).", new Object[] { Integer.valueOf(this.jtY.offset) });
      GMTrace.o(10882104950784L, 81078);
      return;
      paramString = paramString.jtf.uOr;
      break;
      label410:
      paramInt1 = paramk.gLP;
      break label244;
      label419:
      paramInt2 = 2;
      break label250;
      if (paramk.getType() == 1071)
      {
        at.wS().b(1071, this);
        w.i("MicroMsg.BrandService.BizSearchResultItemContainer", "BizSearchDetailPage.");
        paramString = ((h)paramk).aif();
        if ((paramString == null) || (paramString.lSa == null)) {
          w.e("MicroMsg.BrandService.BizSearchResultItemContainer", "BusinessContent or itemList is null.");
        }
        if (paramString == null)
        {
          paramInt1 = 0;
          label487:
          if (paramInt1 != 0) {
            break label564;
          }
        }
        label564:
        for (paramInt2 = 3;; paramInt2 = 2)
        {
          this.jtW.a(paramString, true);
          j = paramInt2;
          i = paramInt1;
          if (paramString == null) {
            break;
          }
          w.d("MicroMsg.BrandService.BizSearchResultItemContainer", "searchId : %s.", new Object[] { paramString.tXx });
          this.jtY.offset = (paramString.tWu + this.jud);
          j = paramInt2;
          i = paramInt1;
          break;
          paramInt1 = paramString.tXv;
          break label487;
        }
      }
      w.e("MicroMsg.BrandService.BizSearchResultItemContainer", "Error type(%d).", new Object[] { Integer.valueOf(paramk.getType()) });
      GMTrace.o(10882104950784L, 81078);
      return;
      label601:
      this.jtY.jum = true;
    }
  }
  
  public final void a(c paramc)
  {
    GMTrace.i(10881836515328L, 81076);
    this.jtW = paramc;
    if (this.jtW != null)
    {
      this.jtW.lq(this.gRb);
      paramc = this.jtV;
      a locala = this.jtZ;
      View localView = View.inflate(getContext(), R.i.cAM, null);
      locala.jui = localView.findViewById(R.h.bKG);
      locala.juj = localView.findViewById(R.h.bKB);
      locala.juk = localView.findViewById(R.h.bKI);
      locala.jui.setVisibility(8);
      locala.juj.setVisibility(8);
      locala.juk.setVisibility(8);
      paramc.addFooterView(localView, null, false);
      this.jtV.setAdapter(this.jtW);
      this.jtV.setOnScrollListener(new AbsListView.OnScrollListener()
      {
        boolean jug;
        
        public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(10871099097088L, 80996);
          if (paramAnonymousInt1 + paramAnonymousInt2 == paramAnonymousInt3)
          {
            this.jug = true;
            GMTrace.o(10871099097088L, 80996);
            return;
          }
          this.jug = false;
          GMTrace.o(10871099097088L, 80996);
        }
        
        public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
        {
          GMTrace.i(10870964879360L, 80995);
          if ((paramAnonymousInt == 0) && (this.jug) && (BizSearchResultItemContainer.a(BizSearchResultItemContainer.this))) {
            BizSearchResultItemContainer.a(BizSearchResultItemContainer.this, BizSearchResultItemContainer.b(BizSearchResultItemContainer.this).eBj, BizSearchResultItemContainer.b(BizSearchResultItemContainer.this).offset, BizSearchResultItemContainer.c(BizSearchResultItemContainer.this)[(BizSearchResultItemContainer.c(BizSearchResultItemContainer.this).length - 1)]);
          }
          GMTrace.o(10870964879360L, 80995);
        }
      });
      this.jtV.setOnItemClickListener(this.jtW);
      if (this.jtY.jte == 0L)
      {
        d(new long[] { 1L });
        GMTrace.o(10881836515328L, 81076);
      }
    }
    else
    {
      this.jtV.setAdapter(this.jtW);
    }
    GMTrace.o(10881836515328L, 81076);
  }
  
  public final void aF(String paramString, int paramInt)
  {
    GMTrace.i(10882507603968L, 81081);
    if (this.jtW.isEmpty()) {
      this.jtX.setVisibility(8);
    }
    if (paramString == null)
    {
      GMTrace.o(10882507603968L, 81081);
      return;
    }
    paramString = paramString.trim();
    if (("".equals(paramString)) || ((paramString.equals(this.jtY.eBj)) && (!this.jue)))
    {
      GMTrace.o(10882507603968L, 81081);
      return;
    }
    if (this.jtY.jul)
    {
      GMTrace.o(10882507603968L, 81081);
      return;
    }
    reset();
    this.jtY.jul = true;
    this.jtY.eBj = paramString;
    this.jud = paramInt;
    if (this.juf != 1)
    {
      at.wS().a(1070, this);
      this.jua = new i(this.jtY.eBj, this.jtY.jte, this.gRb);
      at.wS().a(this.jua, 0);
    }
    for (;;)
    {
      if (this.jub != null) {
        this.jub.aik();
      }
      GMTrace.o(10882507603968L, 81081);
      return;
      if (this.juc.length == 0)
      {
        w.i("MicroMsg.BrandService.BizSearchResultItemContainer", "business type size is 0.");
        GMTrace.o(10882507603968L, 81081);
        return;
      }
      c(paramString, paramInt, this.juc[0]);
      this.jtZ.lu(0);
    }
  }
  
  public final void d(long... paramVarArgs)
  {
    GMTrace.i(10882373386240L, 81080);
    this.juc = paramVarArgs;
    this.jtY.jte = 0L;
    int i = 0;
    while (i <= 0)
    {
      c localc = this.jtY;
      localc.jte |= paramVarArgs[0];
      i += 1;
    }
    this.jtW.c(paramVarArgs);
    GMTrace.o(10882373386240L, 81080);
  }
  
  public final void ds(boolean paramBoolean)
  {
    GMTrace.i(10882776039424L, 81083);
    this.jtW.j(paramBoolean, false);
    GMTrace.o(10882776039424L, 81083);
  }
  
  public final void lq(int paramInt)
  {
    GMTrace.i(10882641821696L, 81082);
    this.gRb = paramInt;
    this.jtW.lq(this.gRb);
    GMTrace.o(10882641821696L, 81082);
  }
  
  final void reset()
  {
    GMTrace.i(10882239168512L, 81079);
    this.jtW.aij();
    this.jtZ.lu(0);
    this.jtY.jum = false;
    this.jtY.jul = false;
    this.jtY.offset = 0;
    this.jtY.eBj = null;
    this.jtY.gLP = 1;
    GMTrace.o(10882239168512L, 81079);
  }
  
  public void setOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    GMTrace.i(10882910257152L, 81084);
    super.setOnTouchListener(paramOnTouchListener);
    this.jtV.setOnTouchListener(paramOnTouchListener);
    GMTrace.o(10882910257152L, 81084);
  }
  
  private static final class a
  {
    View jui;
    View juj;
    View juk;
    
    public a()
    {
      GMTrace.i(10852979703808L, 80861);
      GMTrace.o(10852979703808L, 80861);
    }
    
    private void k(boolean paramBoolean1, boolean paramBoolean2)
    {
      int j = 0;
      GMTrace.i(10853248139264L, 80863);
      View localView = this.jui;
      if (paramBoolean1)
      {
        i = 0;
        localView.setVisibility(i);
        this.juj.setVisibility(8);
        localView = this.juk;
        if (!paramBoolean2) {
          break label72;
        }
      }
      label72:
      for (int i = j;; i = 8)
      {
        localView.setVisibility(i);
        GMTrace.o(10853248139264L, 80863);
        return;
        i = 8;
        break;
      }
    }
    
    public final void lu(int paramInt)
    {
      GMTrace.i(10853113921536L, 80862);
      switch (paramInt)
      {
      default: 
        k(false, false);
        GMTrace.o(10853113921536L, 80862);
        return;
      case 1: 
        k(true, false);
        GMTrace.o(10853113921536L, 80862);
        return;
      case 2: 
        k(false, true);
        GMTrace.o(10853113921536L, 80862);
        return;
      }
      k(false, false);
      GMTrace.o(10853113921536L, 80862);
    }
  }
  
  public static abstract interface b
  {
    public abstract void aik();
    
    public abstract void ail();
  }
  
  private static final class c
  {
    public String eBj;
    public int gLP;
    public long jte;
    public boolean jul;
    public boolean jum;
    public int offset;
    
    public c()
    {
      GMTrace.i(10867341000704L, 80968);
      this.gLP = 1;
      GMTrace.o(10867341000704L, 80968);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\brandservice\ui\BizSearchResultItemContainer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */