package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.messenger.foundation.a.a.c.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.c.c;
import com.tencent.mm.pluginsdk.i.n;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.r;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import junit.framework.Assert;

public class AppAttachFileListUI
  extends MMActivity
  implements c.a
{
  private AbsListView.OnScrollListener jUd;
  private AdapterView.OnItemClickListener juU;
  private ArrayList<c> wqV;
  private HashSet<Long> wqW;
  private ListView wqX;
  private b wqY;
  private boolean wqZ;
  private boolean wra;
  private View wrb;
  private int wrc;
  
  public AppAttachFileListUI()
  {
    GMTrace.i(2361695141888L, 17596);
    this.wqZ = true;
    this.wra = false;
    this.juU = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(2200768086016L, 16397);
        paramAnonymousAdapterView = new Intent();
        paramAnonymousAdapterView.setClassName(AppAttachFileListUI.this, "com.tencent.mm.ui.chatting.AppAttachDownloadUI");
        paramAnonymousAdapterView.putExtra("app_msg_id", ((AppAttachFileListUI.c)AppAttachFileListUI.a(AppAttachFileListUI.this).get(paramAnonymousInt)).eRz.field_msgId);
        paramAnonymousAdapterView.setFlags(67108864);
        AppAttachFileListUI.this.startActivity(paramAnonymousAdapterView);
        GMTrace.o(2200768086016L, 16397);
      }
    };
    this.jUd = new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(2200499650560L, 16395);
        GMTrace.o(2200499650560L, 16395);
      }
      
      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        GMTrace.i(2200365432832L, 16394);
        if ((paramAnonymousInt == 0) && (!AppAttachFileListUI.b(AppAttachFileListUI.this)) && (AppAttachFileListUI.c(AppAttachFileListUI.this)) && (paramAnonymousAbsListView.getLastVisiblePosition() == AppAttachFileListUI.d(AppAttachFileListUI.this).getCount()))
        {
          w.d("MicroMsg.AppAttachFileListUI", "need to add item");
          paramAnonymousInt = AppAttachFileListUI.e(AppAttachFileListUI.this);
          new AppAttachFileListUI.a(AppAttachFileListUI.this, (byte)0).execute(new Integer[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(20) });
          AppAttachFileListUI.f(AppAttachFileListUI.this);
        }
        GMTrace.o(2200365432832L, 16394);
      }
    };
    GMTrace.o(2361695141888L, 17596);
  }
  
  private c af(au paramau)
  {
    GMTrace.i(2362500448256L, 17602);
    f.a locala = f.a.eS(paramau.field_content);
    if (locala == null)
    {
      GMTrace.o(2362500448256L, 17602);
      return null;
    }
    c localc = new c();
    localc.eRz = paramau;
    localc.wre = locala;
    GMTrace.o(2362500448256L, 17602);
    return localc;
  }
  
  private void cB(List<au> paramList)
  {
    GMTrace.i(2362366230528L, 17601);
    if (paramList.size() < 20)
    {
      this.wqZ = false;
      this.wqX.removeFooterView(this.wrb);
    }
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      au localau = (au)localIterator.next();
      c localc = af(localau);
      if ((localc != null) && (localc.wre.type == 6) && (this.wqW.add(Long.valueOf(localau.field_msgId)))) {
        this.wqV.add(localc);
      }
    }
    w.d("MicroMsg.AppAttachFileListUI", "append file item list size %d, current total size is %d", new Object[] { Integer.valueOf(paramList.size()), Integer.valueOf(this.wqV.size()) });
    GMTrace.o(2362366230528L, 17601);
  }
  
  public final void a(com.tencent.mm.plugin.messenger.foundation.a.a.c paramc, c.c paramc1)
  {
    GMTrace.i(2362634665984L, 17603);
    if ("insert".equals(paramc1.mUZ))
    {
      w.d("MicroMsg.AppAttachFileListUI", "reveive a msg");
      int i = paramc1.mVa.size() - 1;
      while (i >= 0)
      {
        paramc = (au)paramc1.mVa.get(i);
        if (paramc.aCp())
        {
          paramc = af(paramc);
          if ((paramc != null) && (paramc.wre.type == 6)) {
            this.wqV.add(0, paramc);
          }
        }
        i -= 1;
      }
      if (this.wqY != null) {
        this.wqY.notifyDataSetChanged();
      }
    }
    GMTrace.o(2362634665984L, 17603);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(2361829359616L, 17597);
    int i = R.i.cpc;
    GMTrace.o(2361829359616L, 17597);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(2361963577344L, 17598);
    super.onCreate(paramBundle);
    oM(R.l.dvs);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(2520072060928L, 18776);
        AppAttachFileListUI.this.finish();
        GMTrace.o(2520072060928L, 18776);
        return true;
      }
    });
    this.wqX = ((ListView)findViewById(R.h.bzP));
    this.wrb = getLayoutInflater().inflate(R.i.cpa, null);
    this.wqX.addFooterView(this.wrb);
    this.wrb.setVisibility(8);
    this.wqV = new ArrayList();
    this.wqW = new HashSet();
    paramBundle = com.tencent.mm.y.q.zE();
    at.AR();
    paramBundle = com.tencent.mm.y.c.yM().I(paramBundle, 0, 20);
    this.wrc += 20;
    cB(paramBundle);
    this.wqY = new b((byte)0);
    this.wqX.setAdapter(this.wqY);
    this.wqX.setOnItemClickListener(this.juU);
    this.wqX.setOnScrollListener(this.jUd);
    at.AR();
    com.tencent.mm.y.c.yM().a(this, getMainLooper());
    GMTrace.o(2361963577344L, 17598);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(2362232012800L, 17600);
    at.AR();
    com.tencent.mm.y.c.yM().a(this);
    super.onDestroy();
    GMTrace.o(2362232012800L, 17600);
  }
  
  protected void onResume()
  {
    GMTrace.i(2362097795072L, 17599);
    super.onResume();
    GMTrace.o(2362097795072L, 17599);
  }
  
  private final class a
    extends AsyncTask<Integer, Integer, List<au>>
  {
    private a()
    {
      GMTrace.i(2233785647104L, 16643);
      GMTrace.o(2233785647104L, 16643);
    }
  }
  
  private final class b
    extends BaseAdapter
  {
    private b()
    {
      GMTrace.i(2487054499840L, 18530);
      GMTrace.o(2487054499840L, 18530);
    }
    
    public final int getCount()
    {
      GMTrace.i(2487188717568L, 18531);
      int i = AppAttachFileListUI.a(AppAttachFileListUI.this).size();
      GMTrace.o(2487188717568L, 18531);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(2487322935296L, 18532);
      Object localObject = AppAttachFileListUI.a(AppAttachFileListUI.this).get(paramInt);
      GMTrace.o(2487322935296L, 18532);
      return localObject;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(2487457153024L, 18533);
      long l = paramInt;
      GMTrace.o(2487457153024L, 18533);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(2487591370752L, 18534);
      AppAttachFileListUI.c localc;
      if (paramView == null)
      {
        paramView = AppAttachFileListUI.this.getLayoutInflater().inflate(R.i.cpb, paramViewGroup, false);
        Assert.assertNotNull(paramView);
        paramViewGroup = new AppAttachFileListUI.d(AppAttachFileListUI.this);
        paramViewGroup.wrf = ((MMImageView)paramView.findViewById(R.h.bzM));
        paramViewGroup.wrg = ((TextView)paramView.findViewById(R.h.bzO));
        paramViewGroup.wrh = ((TextView)paramView.findViewById(R.h.bzL));
        paramViewGroup.wri = ((TextView)paramView.findViewById(R.h.bzN));
        paramView.setTag(paramViewGroup);
        Assert.assertNotNull(paramViewGroup);
        localc = (AppAttachFileListUI.c)AppAttachFileListUI.a(AppAttachFileListUI.this).get(paramInt);
        paramViewGroup.wrg.setText(localc.wre.title);
        if (localc.eRz.field_isSend != 1) {
          break label256;
        }
      }
      label256:
      for (String str = "自己";; str = r.fs(localc.wre.eMI))
      {
        paramViewGroup.wrh.setText(String.format("大小：%s，来自：%s", new Object[] { bg.aF(localc.wre.giv), str }));
        paramViewGroup.wri.setText(n.c(AppAttachFileListUI.this, localc.eRz.field_createTime, true));
        paramViewGroup.wrf.setImageResource(com.tencent.mm.pluginsdk.model.q.Oo(localc.wre.giw));
        GMTrace.o(2487591370752L, 18534);
        return paramView;
        paramViewGroup = (AppAttachFileListUI.d)paramView.getTag();
        break;
      }
    }
  }
  
  private final class c
  {
    public au eRz;
    public f.a wre;
    
    public c()
    {
      GMTrace.i(2383841067008L, 17761);
      GMTrace.o(2383841067008L, 17761);
    }
  }
  
  private final class d
  {
    public MMImageView wrf;
    public TextView wrg;
    public TextView wrh;
    public TextView wri;
    
    public d()
    {
      GMTrace.i(2158355283968L, 16081);
      GMTrace.o(2158355283968L, 16081);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\chatting\AppAttachFileListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */