package com.tencent.mm.plugin.emoji.ui.v2;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.o;
import android.support.v4.view.ViewPager.e;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.k.e;
import com.tencent.mm.plugin.emoji.ui.EmojiMineUI;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.e.g;
import com.tencent.mm.ui.mogic.WxViewPager;
import com.tencent.mm.y.at;
import java.util.HashMap;

public class EmojiStoreV2UI
  extends MMActivity
{
  private HashMap<Integer, a> kuU;
  EmojiStoreV2TabView kuV;
  private EmojiStoreV2ViewPager kuW;
  private a kuX;
  private int kuY;
  private boolean kuZ;
  private boolean kva;
  
  public EmojiStoreV2UI()
  {
    GMTrace.i(11518431199232L, 85819);
    this.kuU = new HashMap();
    this.kuY = 0;
    this.kuZ = true;
    this.kva = false;
    GMTrace.o(11518431199232L, 85819);
  }
  
  protected final void MP()
  {
    GMTrace.i(11518968070144L, 85823);
    a(0, R.k.cIT, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11530376577024L, 85908);
        EmojiStoreV2UI.a(EmojiStoreV2UI.this);
        GMTrace.o(11530376577024L, 85908);
        return false;
      }
    });
    a(1, R.k.cIU, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(11487024250880L, 85585);
        paramAnonymousMenuItem = new Intent();
        paramAnonymousMenuItem.putExtra("10931", 1);
        paramAnonymousMenuItem.setClass(EmojiStoreV2UI.this, EmojiMineUI.class);
        EmojiStoreV2UI.this.startActivity(paramAnonymousMenuItem);
        GMTrace.o(11487024250880L, 85585);
        return false;
      }
    });
    this.kuV = ((EmojiStoreV2TabView)findViewById(R.h.bwp));
    this.kuW = ((EmojiStoreV2ViewPager)findViewById(R.h.bwo));
    this.kuW.DU(0);
    this.kuX = new a(this, this.kuW, this.kuZ);
    if (!this.kuZ)
    {
      this.kuV.setVisibility(8);
      GMTrace.o(11518968070144L, 85823);
      return;
    }
    this.kuV.setVisibility(0);
    GMTrace.o(11518968070144L, 85823);
  }
  
  protected final int Qf()
  {
    GMTrace.i(11519504941056L, 85827);
    GMTrace.o(11519504941056L, 85827);
    return 1;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11518833852416L, 85822);
    int i = R.i.cvd;
    GMTrace.o(11518833852416L, 85822);
    return i;
  }
  
  public final a mT(int paramInt)
  {
    a locala = null;
    GMTrace.i(11519236505600L, 85825);
    if (paramInt < 0)
    {
      GMTrace.o(11519236505600L, 85825);
      return null;
    }
    if (this.kuU.containsKey(Integer.valueOf(paramInt)))
    {
      locala = (a)this.kuU.get(Integer.valueOf(paramInt));
      GMTrace.o(11519236505600L, 85825);
      return locala;
    }
    switch (paramInt)
    {
    default: 
      w.w("MicroMsg.emoji.EmojiStoreV2UI", "create fragment failed.");
    }
    for (;;)
    {
      w.d("MicroMsg.emoji.EmojiStoreV2UI", "create fragment index:%d", new Object[] { Integer.valueOf(paramInt) });
      if (locala != null) {
        locala.a(this);
      }
      this.kuU.put(Integer.valueOf(paramInt), locala);
      GMTrace.o(11519236505600L, 85825);
      return locala;
      locala = (a)Fragment.a(this, b.class.getName(), null);
      continue;
      locala = (a)Fragment.a(this, c.class.getName(), null);
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(11519370723328L, 85826);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    w.d("MicroMsg.emoji.EmojiStoreV2UI", "onActivityResult . requestCode:" + paramInt1 + "  resultCode:" + paramInt2);
    if ((this.kuX != null) && (this.kuX.mU(this.kuY) != null)) {
      this.kuX.mU(this.kuY).onActivityResult(paramInt1, paramInt2, paramIntent);
    }
    GMTrace.o(11519370723328L, 85826);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11518565416960L, 85820);
    long l = System.currentTimeMillis();
    super.onCreate(paramBundle);
    paramBundle = com.tencent.mm.k.g.ut().getValue("ShowPersonalEmotion");
    w.i("MicroMsg.emoji.EmojiStoreV2UI", "get dynamic config value:%s", new Object[] { paramBundle });
    if ((!bg.nm(paramBundle)) && (bg.Sy(paramBundle) == 1)) {}
    for (this.kuZ = true;; this.kuZ = false)
    {
      if (this.kuZ) {
        this.kuY = getIntent().getIntExtra("emoji_tab", 0);
      }
      MP();
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(11482058194944L, 85548);
          com.tencent.mm.s.c.vK().k(262147, false);
          com.tencent.mm.s.c.vK().k(262149, false);
          com.tencent.mm.s.c.vK().aF(262147, 266244);
          com.tencent.mm.s.c.vK().aF(262149, 266244);
          at.AR();
          com.tencent.mm.y.c.xh().set(208899, Boolean.valueOf(false));
          at.AR();
          com.tencent.mm.y.c.xh().set(208913, Boolean.valueOf(false));
          GMTrace.o(11482058194944L, 85548);
        }
      });
      at.AR();
      boolean bool = ((Boolean)com.tencent.mm.y.c.xh().get(w.a.vqf, Boolean.valueOf(false))).booleanValue();
      if (this.kuV != null) {
        this.kuV.dZ(bool);
      }
      com.tencent.mm.plugin.report.service.g.ork.a(406L, 0L, 1L, false);
      com.tencent.mm.plugin.report.service.g.ork.a(406L, 2L, System.currentTimeMillis() - l, false);
      GMTrace.o(11518565416960L, 85820);
      return;
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11519102287872L, 85824);
    super.onDestroy();
    if (this.kuU != null) {
      this.kuU.clear();
    }
    GMTrace.o(11519102287872L, 85824);
  }
  
  protected void onResume()
  {
    GMTrace.i(11518699634688L, 85821);
    super.onResume();
    Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler()
    {
      public final boolean queueIdle()
      {
        GMTrace.i(11497090580480L, 85660);
        w.i("MicroMsg.emoji.EmojiStoreV2UI", "now try to activity the tools process");
        Intent localIntent = new Intent();
        localIntent.setComponent(new ComponentName(e.g.vGK, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
        localIntent.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS");
        EmojiStoreV2UI.this.sendBroadcast(localIntent);
        GMTrace.o(11497090580480L, 85660);
        return false;
      }
    });
    GMTrace.o(11518699634688L, 85821);
  }
  
  final class a
    extends o
    implements ViewPager.e, EmojiStoreV2TabView.a
  {
    private boolean kuZ;
    private WxViewPager kvc;
    
    public a(FragmentActivity paramFragmentActivity, WxViewPager paramWxViewPager, boolean paramBoolean)
    {
      super();
      GMTrace.i(11480850235392L, 85539);
      this.kuZ = false;
      this.kuZ = paramBoolean;
      this.kvc = paramWxViewPager;
      this.kvc.a(this);
      this.kvc.b(this);
      this.kvc.Y(EmojiStoreV2UI.b(EmojiStoreV2UI.this));
      d.eu(11);
      if (EmojiStoreV2UI.c(EmojiStoreV2UI.this) != null) {
        EmojiStoreV2UI.c(EmojiStoreV2UI.this).kuR = this;
      }
      GMTrace.o(11480850235392L, 85539);
    }
    
    public final void V(int paramInt)
    {
      GMTrace.i(11481387106304L, 85543);
      w.d("MicroMsg.emoji.EmojiStoreV2UI", "onPageSelected :%d", new Object[] { Integer.valueOf(paramInt) });
      EmojiStoreV2UI.a(EmojiStoreV2UI.this, paramInt);
      if (EmojiStoreV2UI.c(EmojiStoreV2UI.this) != null) {
        EmojiStoreV2UI.c(EmojiStoreV2UI.this).mR(paramInt);
      }
      if ((EmojiStoreV2UI.b(EmojiStoreV2UI.this) == 1) && (!EmojiStoreV2UI.d(EmojiStoreV2UI.this)))
      {
        com.tencent.mm.plugin.report.service.g.ork.i(12090, new Object[0]);
        EmojiStoreV2UI localEmojiStoreV2UI = EmojiStoreV2UI.this;
        at.AR();
        com.tencent.mm.y.c.xh().a(w.a.vqf, Boolean.valueOf(false));
        if (localEmojiStoreV2UI.kuV != null) {
          localEmojiStoreV2UI.kuV.dZ(false);
        }
        EmojiStoreV2UI.e(EmojiStoreV2UI.this);
      }
      GMTrace.o(11481387106304L, 85543);
    }
    
    public final void W(int paramInt)
    {
      GMTrace.i(11481521324032L, 85544);
      w.d("MicroMsg.emoji.EmojiStoreV2UI", "onPageScrollStateChanged state:%d", new Object[] { Integer.valueOf(paramInt) });
      if ((paramInt == 0) && (EmojiStoreV2UI.this.mT(EmojiStoreV2UI.b(EmojiStoreV2UI.this)) != null))
      {
        a locala = EmojiStoreV2UI.this.mT(EmojiStoreV2UI.b(EmojiStoreV2UI.this));
        if ((locala.Ev != null) && (locala.kkx != null) && (locala.asX())) {
          locala.kkx.anc();
        }
      }
      GMTrace.o(11481521324032L, 85544);
    }
    
    public final void a(int paramInt1, float paramFloat, int paramInt2)
    {
      GMTrace.i(11481252888576L, 85542);
      if (EmojiStoreV2UI.c(EmojiStoreV2UI.this) != null) {
        EmojiStoreV2UI.c(EmojiStoreV2UI.this).h(paramInt1, paramFloat);
      }
      GMTrace.o(11481252888576L, 85542);
    }
    
    public final int getCount()
    {
      GMTrace.i(11481118670848L, 85541);
      if (this.kuZ)
      {
        GMTrace.o(11481118670848L, 85541);
        return 2;
      }
      GMTrace.o(11481118670848L, 85541);
      return 1;
    }
    
    public final void mS(int paramInt)
    {
      GMTrace.i(11481655541760L, 85545);
      if (paramInt != EmojiStoreV2UI.b(EmojiStoreV2UI.this)) {
        this.kvc.c(paramInt, false);
      }
      EmojiStoreV2UI.a(EmojiStoreV2UI.this, paramInt);
      GMTrace.o(11481655541760L, 85545);
    }
    
    public final a mU(int paramInt)
    {
      GMTrace.i(11480984453120L, 85540);
      a locala = EmojiStoreV2UI.this.mT(paramInt);
      GMTrace.o(11480984453120L, 85540);
      return locala;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\v2\EmojiStoreV2UI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */