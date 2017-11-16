package com.tencent.mm.ui.friend;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.j;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.protocal.c.aqc;
import com.tencent.mm.protocal.c.aqf;
import com.tencent.mm.protocal.c.uq;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.at;
import java.util.LinkedList;
import junit.framework.Assert;

public class RecommendFriendUI
  extends MMActivity
  implements e
{
  private ProgressDialog htG;
  private int htI;
  private TextView nWy;
  private ListView ntX;
  private LinkedList<uq> xbA;
  private boolean xbB;
  private b xcp;
  private LinkedList<aqf> xcq;
  private boolean xcr;
  
  public RecommendFriendUI()
  {
    GMTrace.i(2812800925696L, 20957);
    this.htG = null;
    this.xcq = new LinkedList();
    this.xbA = new LinkedList();
    this.htI = -1;
    this.xcr = false;
    GMTrace.o(2812800925696L, 20957);
  }
  
  private void DK(int paramInt)
  {
    GMTrace.i(2814008885248L, 20966);
    w.i("MicroMsg.RecommendFriendUI", "dealGetInviteFriendSuccess  respList.size:" + this.xcq.size());
    this.xcp.f(this.xcq, paramInt);
    this.ntX.setAdapter(this.xcp);
    this.xbB = false;
    String str;
    int i;
    if (this.htI == 0)
    {
      str = "";
      i = 0;
      if (i < this.xbA.size())
      {
        if (paramInt != ((uq)this.xbA.get(i)).umS) {
          break label160;
        }
        str = ((uq)this.xbA.get(i)).umT;
      }
    }
    label160:
    for (;;)
    {
      i += 1;
      break;
      sq(str);
      this.xcp.xbB = this.xbB;
      this.xcp.notifyDataSetChanged();
      GMTrace.o(2814008885248L, 20966);
      return;
    }
  }
  
  private void chu()
  {
    GMTrace.i(2813874667520L, 20965);
    this.nWy.setVisibility(0);
    this.ntX.setVisibility(8);
    GMTrace.o(2813874667520L, 20965);
  }
  
  private void chv()
  {
    GMTrace.i(2814143102976L, 20967);
    if (this.htI == 0) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue("dealGetInviteFriendGroupSuccess just only qq", bool);
      w.i("MicroMsg.RecommendFriendUI", "dealGetInviteFriendGroupSuccess  respList.size:" + this.xbA.size());
      this.xcp.xbA = this.xbA;
      this.ntX.setAdapter(this.xcp);
      lg(false);
      this.xbB = true;
      oM(R.l.dYZ);
      this.xcp.xbB = this.xbB;
      this.xcp.notifyDataSetChanged();
      GMTrace.o(2814143102976L, 20967);
      return;
    }
  }
  
  private void goBack()
  {
    GMTrace.i(2813337796608L, 20961);
    if (this.htI != 0)
    {
      finish();
      GMTrace.o(2813337796608L, 20961);
      return;
    }
    if ((this.xbB) || (this.xcr))
    {
      finish();
      GMTrace.o(2813337796608L, 20961);
      return;
    }
    chv();
    GMTrace.o(2813337796608L, 20961);
  }
  
  protected final void MP()
  {
    GMTrace.i(2813203578880L, 20960);
    this.nWy = ((TextView)findViewById(R.h.bwL));
    if (this.htI == 1)
    {
      oM(R.l.eak);
      this.nWy.setText(R.l.eam);
    }
    for (;;)
    {
      this.xcp = new b(getLayoutInflater());
      this.ntX = ((ListView)findViewById(R.h.bHR));
      this.ntX.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          int i = 0;
          GMTrace.i(2799379152896L, 20857);
          if (!RecommendFriendUI.a(RecommendFriendUI.this))
          {
            RecommendFriendUI.b(RecommendFriendUI.this).hK(paramAnonymousInt);
            if (RecommendFriendUI.b(RecommendFriendUI.this).cht().length > 0)
            {
              RecommendFriendUI.this.lg(true);
              GMTrace.o(2799379152896L, 20857);
              return;
            }
            RecommendFriendUI.this.lg(false);
            GMTrace.o(2799379152896L, 20857);
            return;
          }
          paramAnonymousAdapterView = RecommendFriendUI.this;
          paramAnonymousView = RecommendFriendUI.b(RecommendFriendUI.this);
          if (!paramAnonymousView.xbB) {}
          for (paramAnonymousInt = i;; paramAnonymousInt = ((uq)paramAnonymousView.xbA.get(paramAnonymousInt)).umS)
          {
            RecommendFriendUI.a(paramAnonymousAdapterView, paramAnonymousInt);
            GMTrace.o(2799379152896L, 20857);
            return;
          }
        }
      });
      this.ntX.setAdapter(this.xcp);
      a(0, getString(R.l.dDB), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(2796694798336L, 20837);
          int i = RecommendFriendUI.b(RecommendFriendUI.this).cht().length;
          h.a(RecommendFriendUI.this.vKB.vKW, RecommendFriendUI.this.vKB.vKW.getResources().getQuantityString(R.j.cIr, i, new Object[] { Integer.valueOf(i) }), RecommendFriendUI.this.getString(R.l.cUG), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(2819646029824L, 21008);
              RecommendFriendUI.c(RecommendFriendUI.this);
              GMTrace.o(2819646029824L, 21008);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(2810250788864L, 20938);
              GMTrace.o(2810250788864L, 20938);
            }
          });
          GMTrace.o(2796694798336L, 20837);
          return true;
        }
      });
      lg(false);
      this.xcr = true;
      final com.tencent.mm.modelsimple.p localp = new com.tencent.mm.modelsimple.p(this.htI);
      at.wS().a(localp, 0);
      ActionBarActivity localActionBarActivity = this.vKB.vKW;
      getString(R.l.cUG);
      this.htG = h.a(localActionBarActivity, getString(R.l.dDE), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(2822196166656L, 21027);
          at.wS().c(localp);
          RecommendFriendUI.this.finish();
          GMTrace.o(2822196166656L, 21027);
        }
      });
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(2807432216576L, 20917);
          RecommendFriendUI.d(RecommendFriendUI.this);
          GMTrace.o(2807432216576L, 20917);
          return true;
        }
      });
      new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2812666707968L, 20956);
          BackwardSupportUtil.c.a(RecommendFriendUI.e(RecommendFriendUI.this));
          GMTrace.o(2812666707968L, 20956);
        }
      };
      GMTrace.o(2813203578880L, 20960);
      return;
      if (this.htI == 2)
      {
        oM(R.l.eaj);
        this.nWy.setText(R.l.eal);
      }
      else
      {
        oM(R.l.dYZ);
        this.nWy.setText(R.l.ean);
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(2813740449792L, 20964);
    w.i("MicroMsg.RecommendFriendUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.htG != null)
    {
      this.htG.dismiss();
      this.htG = null;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0) || (paramk.getType() != 135))
    {
      chu();
      GMTrace.o(2813740449792L, 20964);
      return;
    }
    this.xcq = ((aqc)((com.tencent.mm.modelsimple.p)paramk).fUa.gtD.gtK).lPH;
    this.xbA = ((aqc)((com.tencent.mm.modelsimple.p)paramk).fUa.gtD.gtK).tQs;
    this.xcr = false;
    if (this.xcq.size() <= 0)
    {
      chu();
      GMTrace.o(2813740449792L, 20964);
      return;
    }
    if ((this.htI == 0) && (this.xbA.size() <= 0))
    {
      chu();
      GMTrace.o(2813740449792L, 20964);
      return;
    }
    if (this.htI != 0)
    {
      DK(-1);
      GMTrace.o(2813740449792L, 20964);
      return;
    }
    chv();
    GMTrace.o(2813740449792L, 20964);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2812935143424L, 20958);
    int i = R.i.czT;
    GMTrace.o(2812935143424L, 20958);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2813069361152L, 20959);
    super.onCreate(paramBundle);
    this.htI = bg.getInt(getIntent().getStringExtra("recommend_type"), 0);
    this.xbB = false;
    at.wS().a(135, this);
    MP();
    GMTrace.o(2813069361152L, 20959);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(2813606232064L, 20963);
    at.wS().b(135, this);
    super.onDestroy();
    GMTrace.o(2813606232064L, 20963);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(2813472014336L, 20962);
    if (paramInt == 4)
    {
      goBack();
      GMTrace.o(2813472014336L, 20962);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(2813472014336L, 20962);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\friend\RecommendFriendUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */