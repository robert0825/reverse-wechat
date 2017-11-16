package com.tencent.mm.plugin.emoji.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.emoji.model.e;
import com.tencent.mm.plugin.emoji.sync.BKGLoaderManager;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.aac;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmojiMineUI
  extends BaseEmojiStoreUI
  implements View.OnClickListener
{
  private final String TAG;
  private View kos;
  private TextView kot;
  private ViewGroup kpd;
  private ViewGroup kpe;
  private ViewGroup kpf;
  private ViewGroup kpg;
  private TextView kph;
  
  public EmojiMineUI()
  {
    GMTrace.i(11384347688960L, 84820);
    this.TAG = "MicroMsg.emoji.EmojiMineUI";
    GMTrace.o(11384347688960L, 84820);
  }
  
  protected final void MP()
  {
    GMTrace.i(11384750342144L, 84823);
    oM(R.l.dYP);
    super.MP();
    this.kos = findViewById(R.h.cgn);
    this.kot = ((TextView)this.kos.findViewById(R.h.cgm));
    this.kot.setText(R.l.dpC);
    if (com.tencent.mm.plugin.emoji.model.h.ari().kmc.kms)
    {
      com.tencent.mm.plugin.emoji.model.h.ari();
      if (BKGLoaderManager.arJ())
      {
        this.kos.setVisibility(0);
        bV(8001, 3000);
      }
    }
    for (;;)
    {
      this.Ev.setOnScrollListener(null);
      GMTrace.o(11384750342144L, 84823);
      return;
      this.kos.setVisibility(8);
    }
  }
  
  public final void a(String paramString, com.tencent.mm.sdk.e.l paraml)
  {
    GMTrace.i(11385689866240L, 84830);
    if ((paramString != null) && (paramString.equals("event_update_group")))
    {
      asp();
      bV(131074, 50);
    }
    GMTrace.o(11385689866240L, 84830);
  }
  
  protected final void a(boolean paramBoolean1, e parame, boolean paramBoolean2, boolean paramBoolean3)
  {
    GMTrace.i(11386629390336L, 84837);
    GMTrace.o(11386629390336L, 84837);
  }
  
  protected final int arO()
  {
    GMTrace.i(11387166261248L, 84841);
    GMTrace.o(11387166261248L, 84841);
    return 24;
  }
  
  protected final int arP()
  {
    GMTrace.i(11387300478976L, 84842);
    GMTrace.o(11387300478976L, 84842);
    return 7;
  }
  
  protected final com.tencent.mm.plugin.emoji.a.a.a arQ()
  {
    GMTrace.i(11385152995328L, 84826);
    com.tencent.mm.plugin.emoji.a.c localc = new com.tencent.mm.plugin.emoji.a.c(this.vKB.vKW);
    GMTrace.o(11385152995328L, 84826);
    return localc;
  }
  
  protected final void arR()
  {
    GMTrace.i(11386092519424L, 84833);
    this.kpg = ((ViewGroup)View.inflate(this.vKB.vKW, R.i.cuD, null));
    this.kph = ((TextView)this.kpg.findViewById(16908310));
    this.kph.setText(R.l.dYQ);
    this.kpg.setVisibility(8);
    this.kph.setVisibility(8);
    this.Ev.addHeaderView(this.kpg, null, false);
    this.kpd = ((ViewGroup)View.inflate(this.vKB.vKW, R.i.cuC, null));
    this.kpe = ((ViewGroup)this.kpd.findViewById(R.h.bNc));
    ((TextView)this.kpe.findViewById(16908310)).setText(R.l.cuy);
    this.kpf = ((ViewGroup)this.kpd.findViewById(R.h.bNd));
    ((TextView)this.kpf.findViewById(16908310)).setText(R.l.doi);
    this.kpf.findViewById(R.h.content).setBackgroundResource(R.g.aVP);
    this.kpe.setOnClickListener(this);
    this.kpf.setOnClickListener(this);
    this.Ev.addFooterView(this.kpd, null, false);
    GMTrace.o(11386092519424L, 84833);
  }
  
  protected final boolean arT()
  {
    GMTrace.i(11386763608064L, 84838);
    GMTrace.o(11386763608064L, 84838);
    return false;
  }
  
  protected final boolean arU()
  {
    GMTrace.i(11385018777600L, 84825);
    GMTrace.o(11385018777600L, 84825);
    return false;
  }
  
  protected final int arX()
  {
    GMTrace.i(11385287213056L, 84827);
    GMTrace.o(11385287213056L, 84827);
    return 8;
  }
  
  protected final int arZ()
  {
    GMTrace.i(11385421430784L, 84828);
    GMTrace.o(11385421430784L, 84828);
    return 2;
  }
  
  protected final boolean asc()
  {
    boolean bool = true;
    GMTrace.i(11386360954880L, 84835);
    if (this.kkx != null)
    {
      this.kkx.notifyDataSetChanged();
      this.knC = true;
      this.iTN.setVisibility(8);
    }
    for (;;)
    {
      ash();
      GMTrace.o(11386360954880L, 84835);
      return bool;
      bool = false;
    }
  }
  
  protected final boolean asf()
  {
    GMTrace.i(11386226737152L, 84834);
    GMTrace.o(11386226737152L, 84834);
    return true;
  }
  
  protected final boolean asg()
  {
    GMTrace.i(11385958301696L, 84832);
    GMTrace.o(11385958301696L, 84832);
    return false;
  }
  
  public final void ash()
  {
    GMTrace.i(11387032043520L, 84840);
    if (this.kpg != null)
    {
      if ((this.kkx != null) && (!this.kkx.isEmpty()))
      {
        this.kpg.setVisibility(0);
        this.kph.setVisibility(0);
        GMTrace.o(11387032043520L, 84840);
        return;
      }
      this.kpg.setVisibility(8);
      this.kph.setVisibility(8);
    }
    GMTrace.o(11387032043520L, 84840);
  }
  
  protected final void c(aac paramaac)
  {
    GMTrace.i(11386495172608L, 84836);
    super.c(paramaac);
    GMTrace.o(11386495172608L, 84836);
  }
  
  public final void g(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    GMTrace.i(11385824083968L, 84831);
    GMTrace.o(11385824083968L, 84831);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11384481906688L, 84821);
    int i = R.i.cuJ;
    GMTrace.o(11384481906688L, 84821);
    return i;
  }
  
  public final void h(Message paramMessage)
  {
    GMTrace.i(11386897825792L, 84839);
    if ((paramMessage.what == 8001) && (this.kos != null)) {
      this.kos.setVisibility(8);
    }
    super.h(paramMessage);
    GMTrace.o(11386897825792L, 84839);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(11384884559872L, 84824);
    if (paramView == this.kpe)
    {
      paramView = new Intent();
      paramView.setClass(this, EmojiCustomUI.class);
      startActivity(paramView);
      GMTrace.o(11384884559872L, 84824);
      return;
    }
    if (paramView == this.kpf)
    {
      paramView = new Intent();
      paramView.setClass(this, EmojiPaidUI.class);
      startActivity(paramView);
      GMTrace.o(11384884559872L, 84824);
      return;
    }
    GMTrace.o(11384884559872L, 84824);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11384616124416L, 84822);
    long l = System.currentTimeMillis();
    super.onCreate(paramBundle);
    int i = getIntent().getIntExtra("10931", 0);
    g.ork.A(10931, String.valueOf(i));
    w.i("MicroMsg.emoji.EmojiMineUI", "jacks statistics enter Emoji Setting UI:%d", new Object[] { Integer.valueOf(i) });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11360859586560L, 84645);
        EmojiMineUI.this.finish();
        GMTrace.o(11360859586560L, 84645);
        return true;
      }
    });
    a(0, getString(R.l.doq), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11389716398080L, 84860);
        Object localObject = com.tencent.mm.plugin.emoji.model.h.arl().kjz.bUL();
        paramAnonymousMenuItem = new ArrayList();
        localObject = ((ArrayList)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          EmojiGroupInfo localEmojiGroupInfo = (EmojiGroupInfo)((Iterator)localObject).next();
          if (localEmojiGroupInfo.field_type != EmojiGroupInfo.TYPE_CUSTOM) {
            paramAnonymousMenuItem.add(localEmojiGroupInfo);
          }
        }
        if (paramAnonymousMenuItem.size() <= 1)
        {
          com.tencent.mm.ui.base.h.h(EmojiMineUI.this.vKB.vKW, R.l.dnL, R.l.cUG);
          GMTrace.o(11389716398080L, 84860);
          return true;
        }
        if (!am.isConnected(ab.getContext()))
        {
          EmojiMineUI.a(EmojiMineUI.this);
          GMTrace.o(11389716398080L, 84860);
          return true;
        }
        paramAnonymousMenuItem = new Intent();
        paramAnonymousMenuItem.setClass(EmojiMineUI.this, EmojiSortUI.class);
        EmojiMineUI.this.startActivity(paramAnonymousMenuItem);
        GMTrace.o(11389716398080L, 84860);
        return true;
      }
    });
    at.AR();
    if (!((Boolean)com.tencent.mm.y.c.xh().get(w.a.vqc, Boolean.valueOf(false))).booleanValue()) {
      com.tencent.mm.plugin.emoji.c.a.dM(true);
    }
    g.ork.a(406L, 3L, 1L, false);
    g.ork.a(406L, 5L, System.currentTimeMillis() - l, false);
    GMTrace.o(11384616124416L, 84822);
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(11385555648512L, 84829);
    super.onItemClick(paramAdapterView, paramView, paramInt - 1, paramLong);
    GMTrace.o(11385555648512L, 84829);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\EmojiMineUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */