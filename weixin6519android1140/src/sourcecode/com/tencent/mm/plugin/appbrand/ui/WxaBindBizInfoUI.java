package com.tencent.mm.plugin.appbrand.ui;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.t;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.u;
import com.tencent.mm.ad.u.a;
import com.tencent.mm.modelappbrand.a.a;
import com.tencent.mm.modelappbrand.a.e;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.WxaEntryInfo;
import com.tencent.mm.plugin.appbrand.o.e;
import com.tencent.mm.plugin.appbrand.o.f;
import com.tencent.mm.plugin.appbrand.o.g;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.appbrand.widget.j;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView.a;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView.a;
import com.tencent.mm.protocal.c.aga;
import com.tencent.mm.protocal.c.agb;
import com.tencent.mm.protocal.c.ga;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class WxaBindBizInfoUI
  extends DrawStatusBarActivity
{
  private String hyD;
  private String iDh;
  a iDi;
  private LoadMoreRecyclerView iDj;
  private View iDk;
  private ThreeDotsLoadingView izH;
  
  public WxaBindBizInfoUI()
  {
    GMTrace.i(15507650510848L, 115541);
    GMTrace.o(15507650510848L, 115541);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(15507918946304L, 115543);
    int i = o.g.hDz;
    GMTrace.o(15507918946304L, 115543);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(15507784728576L, 115542);
    super.onCreate(paramBundle);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(15508187381760L, 115545);
        WxaBindBizInfoUI.this.finish();
        GMTrace.o(15508187381760L, 115545);
        return false;
      }
    }, o.e.hAv);
    oM(o.i.hGp);
    AV(-16777216);
    cN().cO().setBackgroundDrawable(new ColorDrawable(-1052684));
    h.a(this);
    paramBundle = getIntent().getParcelableArrayListExtra("wxa_entry_info_list");
    this.hyD = getIntent().getStringExtra("app_id");
    this.iDj = ((LoadMoreRecyclerView)findViewById(o.f.hBM));
    this.iDi = new a(getLayoutInflater());
    this.iDj.a(new MRecyclerView.a()
    {
      public final void jF(int paramAnonymousInt)
      {
        GMTrace.i(20693823520768L, 154181);
        WxaAttributes.WxaEntryInfo localWxaEntryInfo = WxaBindBizInfoUI.this.iDi.jG(paramAnonymousInt);
        if (localWxaEntryInfo == null)
        {
          GMTrace.o(20693823520768L, 154181);
          return;
        }
        Intent localIntent = new Intent();
        localIntent.putExtra("Contact_User", localWxaEntryInfo.username);
        localIntent.putExtra("key_start_biz_profile_from_app_brand_profile", true);
        localIntent.putExtra("force_get_contact", true);
        com.tencent.mm.bj.d.b(WxaBindBizInfoUI.this, "profile", ".ui.ContactInfoUI", localIntent);
        GMTrace.o(20693823520768L, 154181);
      }
    });
    this.iDi.V(paramBundle);
    this.iDj.a(null);
    this.iDj.iTG = new LoadMoreRecyclerView.a()
    {
      public final void aaX()
      {
        GMTrace.i(20694091956224L, 154183);
        aga localaga = new aga();
        localaga.eSd = WxaBindBizInfoUI.a(WxaBindBizInfoUI.this);
        localaga.uvM = WxaBindBizInfoUI.b(WxaBindBizInfoUI.this);
        b.a locala = new b.a();
        locala.uri = "/cgi-bin/mmbiz-bin/wxabusiness/getwxabindbizinfo";
        locala.gtE = 1823;
        locala.gtF = localaga;
        locala.gtG = new agb();
        u.a(locala.DA(), new u.a()
        {
          public final int a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, com.tencent.mm.ad.b paramAnonymous2b, k paramAnonymous2k)
          {
            GMTrace.i(20692481343488L, 154171);
            if ((paramAnonymous2Int1 != 0) || (paramAnonymous2Int2 != 0))
            {
              w.e("MicroMsg.WxaBindBizInfoUI", "onResp, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramAnonymous2Int1), Integer.valueOf(paramAnonymous2Int2), paramAnonymous2String });
              GMTrace.o(20692481343488L, 154171);
              return 0;
            }
            paramAnonymous2String = (agb)paramAnonymous2b.gtD.gtK;
            paramAnonymous2b = paramAnonymous2String.uvN;
            boolean bool = paramAnonymous2String.uvO;
            WxaBindBizInfoUI.a(WxaBindBizInfoUI.this, paramAnonymous2String.uvM);
            if (bool)
            {
              WxaBindBizInfoUI.c(WxaBindBizInfoUI.this).cW(false);
              WxaBindBizInfoUI.d(WxaBindBizInfoUI.this).ZI();
              WxaBindBizInfoUI.this.iDi.iDo = true;
              WxaBindBizInfoUI.e(WxaBindBizInfoUI.this).setVisibility(0);
            }
            if ((paramAnonymous2b != null) && (!paramAnonymous2b.isEmpty()))
            {
              paramAnonymous2String = new LinkedList();
              paramAnonymous2b = paramAnonymous2b.iterator();
              while (paramAnonymous2b.hasNext())
              {
                paramAnonymous2k = (ga)paramAnonymous2b.next();
                if (paramAnonymous2k != null)
                {
                  WxaAttributes.WxaEntryInfo localWxaEntryInfo = new WxaAttributes.WxaEntryInfo();
                  localWxaEntryInfo.title = paramAnonymous2k.eCQ;
                  localWxaEntryInfo.iconUrl = paramAnonymous2k.nDw;
                  localWxaEntryInfo.username = paramAnonymous2k.username;
                  paramAnonymous2String.add(localWxaEntryInfo);
                }
              }
              WxaBindBizInfoUI.this.iDi.V(paramAnonymous2String);
            }
            GMTrace.o(20692481343488L, 154171);
            return 0;
          }
        }, false);
        GMTrace.o(20694091956224L, 154183);
      }
    };
    this.iDj.a(this.iDi);
    paramBundle = getLayoutInflater().inflate(o.g.hDA, this.iDj, false);
    this.izH = ((ThreeDotsLoadingView)paramBundle.findViewById(o.f.bKL));
    this.izH.cju();
    this.iDj.cd(paramBundle);
    this.iDk = getLayoutInflater().inflate(o.g.hDB, this.iDj, false);
    this.iDj.addFooterView(this.iDk);
    this.iDk.setVisibility(8);
    if (this.iDi.getItemCount() > 20)
    {
      this.iDj.cW(true);
      this.iDi.iDo = false;
    }
    j.d(this.vKB.hqF, -1052684, true);
    this.vKB.hqF.setBackgroundColor(-1052684);
    GMTrace.o(15507784728576L, 115542);
  }
  
  private static final class a
    extends RecyclerView.a
  {
    private LayoutInflater CJ;
    private final List<WxaAttributes.WxaEntryInfo> iDn;
    public boolean iDo;
    
    public a(LayoutInflater paramLayoutInflater)
    {
      GMTrace.i(20695702568960L, 154195);
      this.iDo = true;
      this.CJ = paramLayoutInflater;
      this.iDn = new LinkedList();
      GMTrace.o(20695702568960L, 154195);
    }
    
    private boolean contains(String paramString)
    {
      GMTrace.i(20696507875328L, 154201);
      if ((paramString == null) || (paramString.length() == 0))
      {
        GMTrace.o(20696507875328L, 154201);
        return false;
      }
      Iterator localIterator = this.iDn.iterator();
      while (localIterator.hasNext()) {
        if (paramString.equals(((WxaAttributes.WxaEntryInfo)localIterator.next()).username))
        {
          GMTrace.o(20696507875328L, 154201);
          return true;
        }
      }
      GMTrace.o(20696507875328L, 154201);
      return false;
    }
    
    protected final void V(List<WxaAttributes.WxaEntryInfo> paramList)
    {
      GMTrace.i(20696373657600L, 154200);
      if ((paramList == null) || (paramList.isEmpty()))
      {
        GMTrace.o(20696373657600L, 154200);
        return;
      }
      LinkedList localLinkedList = new LinkedList();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        WxaAttributes.WxaEntryInfo localWxaEntryInfo = (WxaAttributes.WxaEntryInfo)localIterator.next();
        if (!contains(localWxaEntryInfo.username)) {
          localLinkedList.add(localWxaEntryInfo);
        }
      }
      this.iDn.addAll(localLinkedList);
      P(this.iDn.size() - paramList.size(), paramList.size());
      GMTrace.o(20696373657600L, 154200);
    }
    
    public final RecyclerView.t a(ViewGroup paramViewGroup, int paramInt)
    {
      GMTrace.i(20695836786688L, 154196);
      paramViewGroup = new WxaBindBizInfoUI.b(this.CJ.inflate(o.g.hCT, paramViewGroup, false));
      GMTrace.o(20695836786688L, 154196);
      return paramViewGroup;
    }
    
    public final void a(RecyclerView.t paramt, int paramInt)
    {
      int i = 0;
      GMTrace.i(20695971004416L, 154197);
      WxaAttributes.WxaEntryInfo localWxaEntryInfo = jG(paramInt);
      if (localWxaEntryInfo == null)
      {
        w.i("MicroMsg.WxaBindBizInfoUI", "onBindViewHolder failed, getItem(%d) return null", new Object[] { Integer.valueOf(paramInt) });
        GMTrace.o(20695971004416L, 154197);
        return;
      }
      paramt = (WxaBindBizInfoUI.b)paramt;
      com.tencent.mm.modelappbrand.a.b.CT().a(paramt.iDp, localWxaEntryInfo.iconUrl, a.CS(), e.grO);
      paramt.hqi.setText(bg.nl(localWxaEntryInfo.title));
      if (this.iDo)
      {
        paramt = paramt.hrj;
        if (this.iDn.size() - 1 == paramInt) {
          i = 8;
        }
        paramt.setVisibility(i);
      }
      GMTrace.o(20695971004416L, 154197);
    }
    
    public final int getItemCount()
    {
      GMTrace.i(20696105222144L, 154198);
      int i = this.iDn.size();
      GMTrace.o(20696105222144L, 154198);
      return i;
    }
    
    public final WxaAttributes.WxaEntryInfo jG(int paramInt)
    {
      GMTrace.i(20696239439872L, 154199);
      if ((paramInt < 0) || (paramInt >= getItemCount()))
      {
        GMTrace.o(20696239439872L, 154199);
        return null;
      }
      WxaAttributes.WxaEntryInfo localWxaEntryInfo = (WxaAttributes.WxaEntryInfo)this.iDn.get(paramInt);
      GMTrace.o(20696239439872L, 154199);
      return localWxaEntryInfo;
    }
  }
  
  private static final class b
    extends RecyclerView.t
  {
    TextView hqi;
    View hrj;
    ImageView iDp;
    
    public b(View paramView)
    {
      super();
      GMTrace.i(20694897262592L, 154189);
      this.iDp = ((ImageView)paramView.findViewById(o.f.icon));
      this.hqi = ((TextView)paramView.findViewById(o.f.hCg));
      this.hrj = paramView.findViewById(o.f.divider);
      GMTrace.o(20694897262592L, 154189);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ui\WxaBindBizInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */