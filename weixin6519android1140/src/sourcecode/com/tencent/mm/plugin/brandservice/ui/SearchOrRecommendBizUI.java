package com.tencent.mm.plugin.brandservice.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.EditText;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.af.m.a;
import com.tencent.mm.af.x;
import com.tencent.mm.plugin.brandservice.a.g;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.SearchViewNotRealTimeHelper;
import com.tencent.mm.ui.tools.SearchViewNotRealTimeHelper.a;
import com.tencent.mm.y.at;
import java.util.LinkedList;

public class SearchOrRecommendBizUI
  extends MMActivity
  implements BizSearchResultItemContainer.b
{
  private BizSearchResultItemContainer jtB;
  private int jtE;
  private int jth;
  private ProgressDialog jvl;
  private SearchViewNotRealTimeHelper jvm;
  
  public SearchOrRecommendBizUI()
  {
    GMTrace.i(10884386652160L, 81095);
    this.jvl = null;
    this.jth = 0;
    this.jtE = 0;
    GMTrace.o(10884386652160L, 81095);
  }
  
  protected final void MP()
  {
    GMTrace.i(10884923523072L, 81099);
    oM(R.l.dlF);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(10869756919808L, 80986);
        SearchOrRecommendBizUI.this.aLo();
        SearchOrRecommendBizUI.this.finish();
        GMTrace.o(10869756919808L, 80986);
        return true;
      }
    });
    this.jvm = ((SearchViewNotRealTimeHelper)findViewById(R.h.caP));
    Object localObject = this.jvm;
    int i = getResources().getColor(R.e.aOE);
    ((SearchViewNotRealTimeHelper)localObject).wjB.setTextColor(i);
    this.jvm.T(getString(R.l.dlF));
    localObject = this.jvm;
    i = getResources().getColor(R.e.aNZ);
    ((SearchViewNotRealTimeHelper)localObject).wjB.setHintTextColor(i);
    this.jvm.wjB.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    localObject = this.jvm;
    if (((SearchViewNotRealTimeHelper)localObject).xeX != null) {
      ((SearchViewNotRealTimeHelper)localObject).xeX.setVisibility(8);
    }
    this.jvm.xjf = new SearchViewNotRealTimeHelper.a()
    {
      public final void aiv()
      {
        GMTrace.i(10869354266624L, 80983);
        SearchOrRecommendBizUI.this.aLs();
        GMTrace.o(10869354266624L, 80983);
      }
      
      public final boolean nC(String paramAnonymousString)
      {
        GMTrace.i(10869085831168L, 80981);
        tG(paramAnonymousString);
        GMTrace.o(10869085831168L, 80981);
        return true;
      }
      
      public final void tG(String paramAnonymousString)
      {
        GMTrace.i(10869220048896L, 80982);
        if (!bg.nm(paramAnonymousString))
        {
          SearchOrRecommendBizUI.this.aLo();
          SearchOrRecommendBizUI.a(SearchOrRecommendBizUI.this).aF(paramAnonymousString, 0);
          GMTrace.o(10869220048896L, 80982);
          return;
        }
        h.bm(SearchOrRecommendBizUI.this.vKB.vKW, SearchOrRecommendBizUI.this.getString(R.l.dlD));
        GMTrace.o(10869220048896L, 80982);
      }
    };
    this.jtB = ((BizSearchResultItemContainer)findViewById(R.h.bZV));
    this.jtB.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(10874857193472L, 81024);
        SearchOrRecommendBizUI.b(SearchOrRecommendBizUI.this).clearFocus();
        SearchOrRecommendBizUI.this.aLo();
        GMTrace.o(10874857193472L, 81024);
        return false;
      }
    });
    localObject = new f(this);
    ((f)localObject).jvh = g.aie();
    this.jtB.a((c)localObject);
    this.jtB.d(new long[] { 1L });
    this.jtB.ds(false);
    this.jtB.juf = 1;
    this.jtB.lq(this.jtE);
    this.jtB.jub = this;
    GMTrace.o(10884923523072L, 81099);
  }
  
  public final void aik()
  {
    GMTrace.i(10885057740800L, 81100);
    ActionBarActivity localActionBarActivity = this.vKB.vKW;
    getString(R.l.cUG);
    this.jvl = h.a(localActionBarActivity, getString(R.l.dlE), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(10851503308800L, 80850);
        paramAnonymousDialogInterface = SearchOrRecommendBizUI.a(SearchOrRecommendBizUI.this);
        at.wS().c(paramAnonymousDialogInterface.jua);
        paramAnonymousDialogInterface.jtY.jul = false;
        GMTrace.o(10851503308800L, 80850);
      }
    });
    GMTrace.o(10885057740800L, 81100);
  }
  
  public final void ail()
  {
    GMTrace.i(10885191958528L, 81101);
    if (this.jvl != null)
    {
      this.jvl.dismiss();
      this.jvl = null;
    }
    GMTrace.o(10885191958528L, 81101);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(10884520869888L, 81096);
    int i = R.i.ctX;
    GMTrace.o(10884520869888L, 81096);
    return i;
  }
  
  public void onCreate(final Bundle paramBundle)
  {
    GMTrace.i(10884655087616L, 81097);
    super.onCreate(paramBundle);
    this.jth = getIntent().getIntExtra("intent_extra_entry_flag", 0);
    this.jtE = getIntent().getIntExtra("fromScene", 0);
    MP();
    if (g.aid())
    {
      at.wS().a(456, new e()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, final String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(10883983998976L, 81092);
          if (paramAnonymousk == null)
          {
            w.e("MicroMsg.BrandService.SearchOrRecommendBizUI", "NetScene is null.");
            GMTrace.o(10883983998976L, 81092);
            return;
          }
          if (paramAnonymousk.getType() != 456)
          {
            w.e("MicroMsg.BrandService.SearchOrRecommendBizUI", "The NetScene is not a RecommendGroupNetScene.");
            GMTrace.o(10883983998976L, 81092);
            return;
          }
          at.wS().b(456, this);
          w.i("MicroMsg.BrandService.SearchOrRecommendBizUI", "errType(%d) , errCode(%d) , errMsg(%s)", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            paramAnonymousk = g.aie();
            if (SearchOrRecommendBizUI.a(SearchOrRecommendBizUI.this) != null) {
              break label177;
            }
            paramAnonymousString = null;
            if ((paramAnonymousString != null) && (paramAnonymousk != null) && (paramAnonymousk.size() > 0)) {
              if (paramAnonymousString.getCount() != 0) {
                break label197;
              }
            }
          }
          label177:
          label197:
          for (paramAnonymousInt1 = 1;; paramAnonymousInt1 = 0)
          {
            paramAnonymousString.jvh = paramAnonymousk;
            if (paramAnonymousInt1 != 0) {
              af.t(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(10875125628928L, 81026);
                  w.i("MicroMsg.BrandService.SearchOrRecommendBizUI", "Has got recommend groups, so notifyDataSetChanged.");
                  paramAnonymousString.notifyDataSetChanged();
                  GMTrace.o(10875125628928L, 81026);
                }
              });
            }
            GMTrace.o(10883983998976L, 81092);
            return;
            paramAnonymousString = (f)SearchOrRecommendBizUI.a(SearchOrRecommendBizUI.this).jtW;
            break;
          }
        }
      });
      at.wS().a(new g(), 0);
    }
    paramBundle = getIntent().getStringExtra("Search_Str");
    if (!bg.nm(paramBundle)) {
      new ae(Looper.getMainLooper()).post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(10910559109120L, 81290);
          SearchOrRecommendBizUI.b(SearchOrRecommendBizUI.this).WP(paramBundle);
          SearchOrRecommendBizUI.b(SearchOrRecommendBizUI.this).xje.performClick();
          GMTrace.o(10910559109120L, 81290);
        }
      });
    }
    GMTrace.o(10884655087616L, 81097);
  }
  
  public void onDestroy()
  {
    GMTrace.i(10884789305344L, 81098);
    super.onDestroy();
    x.FO().FA();
    GMTrace.o(10884789305344L, 81098);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\brandservice\ui\SearchOrRecommendBizUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */