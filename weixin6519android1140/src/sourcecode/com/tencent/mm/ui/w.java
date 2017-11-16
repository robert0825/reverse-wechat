package com.tencent.mm.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.o;
import android.support.v4.view.ViewPager.e;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.ao;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.s.a;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.ui.base.CustomViewPager;
import com.tencent.mm.ui.contact.AddressUI.a;
import com.tencent.mm.ui.conversation.j;
import com.tencent.mm.ui.mogic.WxViewPager;
import com.tencent.mm.y.aj;
import com.tencent.mm.y.at;
import com.tencent.mm.y.s;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public final class w
{
  public static HashMap<String, Integer> vMX;
  private final long gZT;
  public int kZJ;
  public int lmn;
  MMFragmentActivity vFP;
  public x vMO;
  LauncherUI.d vMP;
  boolean vMQ;
  private HashSet<l> vMR;
  CustomViewPager vMS;
  a vMT;
  private int vMU;
  private int vMV;
  com.tencent.mm.sdk.b.c vMW;
  public HashMap<Integer, u> vMY;
  
  static
  {
    GMTrace.i(19106296233984L, 142353);
    HashMap localHashMap = new HashMap();
    vMX = localHashMap;
    localHashMap.put("tab_main", Integer.valueOf(0));
    vMX.put("tab_address", Integer.valueOf(1));
    vMX.put("tab_find_friend", Integer.valueOf(2));
    vMX.put("tab_settings", Integer.valueOf(3));
    GMTrace.o(19106296233984L, 142353);
  }
  
  public w()
  {
    GMTrace.i(19104417185792L, 142339);
    this.gZT = 180000L;
    this.vMO = new x();
    this.vMR = new HashSet();
    this.kZJ = -1;
    this.lmn = -1;
    this.vMU = -1;
    this.vMV = -1;
    this.vMW = new com.tencent.mm.sdk.b.c() {};
    this.vMY = new HashMap();
    GMTrace.o(19104417185792L, 142339);
  }
  
  public final void Bi(int paramInt)
  {
    GMTrace.i(19104954056704L, 142343);
    u localu = Bk(paramInt);
    if (localu == null)
    {
      GMTrace.o(19104954056704L, 142343);
      return;
    }
    if ((localu instanceof l))
    {
      ((l)localu).bVV();
      this.vMP.bVK();
    }
    this.vMT.vNd[paramInt] = true;
    GMTrace.o(19104954056704L, 142343);
  }
  
  public final void Bj(int paramInt)
  {
    GMTrace.i(19105356709888L, 142346);
    int i = this.kZJ;
    if (this.vMS != null) {}
    for (boolean bool = true;; bool = false)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI.MainTabUI", "change tab to %d, cur tab %d, has init tab %B, tab cache size %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), Boolean.valueOf(bool), Integer.valueOf(this.vMY.size()) });
      if ((this.vMS != null) && (paramInt >= 0) && ((this.vMT == null) || (paramInt <= this.vMT.getCount() - 1))) {
        break;
      }
      GMTrace.o(19105356709888L, 142346);
      return;
    }
    if ((this.kZJ == paramInt) && (this.vMY.size() != 0))
    {
      GMTrace.o(19105356709888L, 142346);
      return;
    }
    this.kZJ = paramInt;
    this.vMO.Bm(this.kZJ);
    if (this.vMS != null)
    {
      this.vMS.c(this.kZJ, false);
      Bi(this.kZJ);
    }
    if ((this.kZJ == 0) && (com.tencent.mm.kernel.h.xx().fYr.foreground))
    {
      at.getNotification().aE(true);
      GMTrace.o(19105356709888L, 142346);
      return;
    }
    at.getNotification().aE(false);
    GMTrace.o(19105356709888L, 142346);
  }
  
  public final u Bk(int paramInt)
  {
    u localu = null;
    GMTrace.i(19105490927616L, 142347);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI.MainTabUI", "get tab %d", new Object[] { Integer.valueOf(paramInt) });
    if (paramInt < 0)
    {
      GMTrace.o(19105490927616L, 142347);
      return null;
    }
    if (this.vMY.containsKey(Integer.valueOf(paramInt)))
    {
      localu = (u)this.vMY.get(Integer.valueOf(paramInt));
      GMTrace.o(19105490927616L, 142347);
      return localu;
    }
    Bundle localBundle = new Bundle();
    switch (paramInt)
    {
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.w.v("MicroMsg.LauncherUI.MainTabUI", "createFragment index:%d", new Object[] { Integer.valueOf(paramInt) });
      if (localu != null) {
        localu.a(this.vFP);
      }
      this.vMY.put(Integer.valueOf(paramInt), localu);
      GMTrace.o(19105490927616L, 142347);
      return localu;
      localBundle.putInt(j.class.getName(), 0);
      localu = (u)Fragment.a(this.vFP, j.class.getName(), localBundle);
      at.getNotification().aE(true);
      continue;
      localBundle.putInt(AddressUI.a.class.getName(), 1);
      localBundle.putBoolean("Need_Voice_Search", true);
      localBundle.putBoolean("favour_include_biz", true);
      localu = (u)Fragment.a(this.vFP, AddressUI.a.class.getName(), localBundle);
      continue;
      localBundle.putInt(h.class.getName(), 2);
      localu = (u)Fragment.a(this.vFP, h.class.getName(), localBundle);
      continue;
      localBundle.putInt(y.class.getName(), 3);
      localu = (u)Fragment.a(this.vFP, y.class.getName(), localBundle);
    }
  }
  
  public final void Vi(String paramString)
  {
    GMTrace.i(19105222492160L, 142345);
    if ((paramString == null) || (paramString.equals("")))
    {
      GMTrace.o(19105222492160L, 142345);
      return;
    }
    Bj(((Integer)vMX.get(paramString)).intValue());
    GMTrace.o(19105222492160L, 142345);
  }
  
  public final u bXQ()
  {
    GMTrace.i(19104551403520L, 142340);
    u localu = (u)this.vMY.get(Integer.valueOf(this.kZJ));
    GMTrace.o(19104551403520L, 142340);
    return localu;
  }
  
  public final void bXR()
  {
    GMTrace.i(19104685621248L, 142341);
    j localj = (j)this.vMY.get(Integer.valueOf(0));
    if (localj != null) {
      localj.chl();
    }
    GMTrace.o(19104685621248L, 142341);
  }
  
  public final void bXS()
  {
    GMTrace.i(19105088274432L, 142344);
    j localj = (j)this.vMY.get(Integer.valueOf(0));
    if (localj != null) {
      localj.onHiddenChanged(true);
    }
    k.a(this.vFP, 4, this.kZJ, "prepareStartChatting");
    bXR();
    this.vMO.bXU();
    GMTrace.o(19105088274432L, 142344);
  }
  
  public final int bXT()
  {
    GMTrace.i(19105625145344L, 142348);
    x localx = this.vMO;
    int j = 0;
    int i = j;
    if (localx.vNg != null)
    {
      i = j;
      if (localx.vNg.bVX() > 0) {
        i = localx.vNg.bVX();
      }
    }
    GMTrace.o(19105625145344L, 142348);
    return i;
  }
  
  protected final void bXU()
  {
    GMTrace.i(19105759363072L, 142349);
    this.vMO.bXU();
    GMTrace.o(19105759363072L, 142349);
  }
  
  protected final void bXV()
  {
    GMTrace.i(19105893580800L, 142350);
    x localx = this.vMO;
    if (localx.vNh)
    {
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.LauncherUI.MainTabUnreadMgr", "start  setAppTagUnreadNow");
      localx.bXY();
    }
    GMTrace.o(19105893580800L, 142350);
  }
  
  protected final void bXW()
  {
    GMTrace.i(19106027798528L, 142351);
    this.vMO.bXW();
    GMTrace.o(19106027798528L, 142351);
  }
  
  public final int bXX()
  {
    GMTrace.i(19106162016256L, 142352);
    x localx = this.vMO;
    long l = System.currentTimeMillis();
    int i;
    if (!at.AU())
    {
      com.tencent.mm.sdk.platformtools.w.w("MicroMsg.UnreadCountHelper", "getMainTabUnreadCount, but mmcore not ready");
      i = 0;
    }
    for (;;)
    {
      localx.Bl(i);
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.LauncherUI.MainTabUnreadMgr", "unreadcheck setConversationTagUnread  last time %d, unread %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l), Integer.valueOf(i) });
      GMTrace.o(19106162016256L, 142352);
      return i;
      i = com.tencent.mm.y.t.a(s.gmw, ae.bYn());
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.LauncherUI", "getMainTabUnreadCount  unread : %d", new Object[] { Integer.valueOf(i) });
    }
  }
  
  public final void bXc()
  {
    GMTrace.i(20338549194752L, 151534);
    j localj = (j)this.vMY.get(Integer.valueOf(0));
    if (localj != null)
    {
      localj.cgh();
      localj.chk();
    }
    GMTrace.o(20338549194752L, 151534);
  }
  
  public final void eh(int paramInt1, int paramInt2)
  {
    GMTrace.i(19104819838976L, 142342);
    if (paramInt1 == paramInt2)
    {
      GMTrace.o(19104819838976L, 142342);
      return;
    }
    if ((this.vMU == paramInt2) && (this.vMV == paramInt1))
    {
      GMTrace.o(19104819838976L, 142342);
      return;
    }
    this.vMU = paramInt2;
    this.vMV = paramInt1;
    Bk(paramInt1);
    u localu = Bk(paramInt2);
    if ((localu != null) && ((localu instanceof l))) {
      ((l)localu).bWN();
    }
    k.a(this.vFP, 4, paramInt1, "deliverOnTabChange");
    k.a(this.vFP, 3, paramInt2, "deliverOnTabChange");
    GMTrace.o(19104819838976L, 142342);
  }
  
  public final class a
    extends o
    implements ViewPager.e, c.a
  {
    private int pGG;
    private AddressUI.a vNa;
    private final WxViewPager vNb;
    private boolean vNc;
    boolean[] vNd;
    
    public a(FragmentActivity paramFragmentActivity, WxViewPager paramWxViewPager)
    {
      super();
      GMTrace.i(19100122218496L, 142307);
      this.vNc = false;
      this.pGG = 0;
      this.vNd = new boolean[] { 1, 0, 0, 0 };
      this.vNb = paramWxViewPager;
      this.vNb.a(this);
      this.vNb.b(this);
      GMTrace.o(19100122218496L, 142307);
    }
    
    private void ei(int paramInt1, int paramInt2)
    {
      GMTrace.i(19223334092800L, 143225);
      if (w.this.Bk(paramInt1) != null)
      {
        View localView = w.this.Bk(paramInt1).findViewById(R.h.bKH);
        if (localView != null) {
          localView.setVisibility(paramInt2);
        }
      }
      GMTrace.o(19223334092800L, 143225);
    }
    
    public final Fragment I(int paramInt)
    {
      GMTrace.i(19100390653952L, 142309);
      u localu = w.this.Bk(paramInt);
      GMTrace.o(19100390653952L, 142309);
      return localu;
    }
    
    public final void V(int paramInt)
    {
      GMTrace.i(19100659089408L, 142311);
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.LauncherUI.MainTabUI", "on page selected changed to %d", new Object[] { Integer.valueOf(paramInt) });
      com.tencent.mm.sdk.platformtools.w.v("MicroMsg.LauncherUI.MainTabUI", "reportSwitch clickCount:%d, pos:%d", new Object[] { Integer.valueOf(this.pGG), Integer.valueOf(paramInt) });
      if (this.pGG > 0)
      {
        this.pGG -= 1;
        switch (paramInt)
        {
        }
      }
      for (;;)
      {
        this.vNc = false;
        w.this.eh(w.this.lmn, w.this.kZJ);
        w.this.lmn = w.this.kZJ;
        w.this.kZJ = paramInt;
        w.this.vMO.Bm(paramInt);
        w.this.vFP.aQ();
        if ((w.this.lmn == 1) && (w.this.kZJ != 1))
        {
          at.AR();
          com.tencent.mm.y.c.xh().set(340226, Long.valueOf(System.currentTimeMillis()));
        }
        if (w.this.kZJ == 1)
        {
          long l = System.currentTimeMillis();
          at.AR();
          if (l - com.tencent.mm.platformtools.t.d((Long)com.tencent.mm.y.c.xh().get(340226, null)) >= 180000L) {
            ((AddressUI.a)w.this.Bk(w.this.kZJ)).cgj();
          }
        }
        if (w.this.kZJ != 0) {
          break;
        }
        at.getNotification().aE(true);
        GMTrace.o(19100659089408L, 142311);
        return;
        g.ork.A(10957, "1");
        continue;
        g.ork.A(10957, "2");
        continue;
        g.ork.A(10957, "3");
        continue;
        g.ork.A(10957, "4");
        continue;
        switch (paramInt)
        {
        default: 
          break;
        case 0: 
          g.ork.A(10957, "5");
          break;
        case 1: 
          g.ork.A(10957, "6");
          break;
        case 2: 
          g.ork.A(10957, "7");
        }
      }
      at.getNotification().aE(false);
      GMTrace.o(19100659089408L, 142311);
    }
    
    public final void W(int paramInt)
    {
      GMTrace.i(19100793307136L, 142312);
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.LauncherUI.MainTabUI", "onPageScrollStateChanged state %d", new Object[] { Integer.valueOf(paramInt) });
      if ((paramInt == 0) && (this.vNa != null))
      {
        this.vNa.mo(true);
        this.vNa = null;
      }
      GMTrace.o(19100793307136L, 142312);
    }
    
    public final void a(final int paramInt1, float paramFloat, int paramInt2)
    {
      GMTrace.i(19100524871680L, 142310);
      Object localObject = w.this.vMO;
      if (((x)localObject).vNg != null) {
        ((x)localObject).vNg.h(paramInt1, paramFloat);
      }
      Integer localInteger;
      if (0.0F != paramFloat)
      {
        if (this.vNa == null) {
          this.vNa = ((AddressUI.a)w.this.Bk(1));
        }
        this.vNa.mo(false);
        if (paramInt2 == 0) {
          localObject = w.vMX.values().iterator();
        }
      }
      else
      {
        for (;;)
        {
          if (!((Iterator)localObject).hasNext()) {
            break label251;
          }
          localInteger = (Integer)((Iterator)localObject).next();
          if (localInteger.intValue() != paramInt1)
          {
            ei(localInteger.intValue(), 8);
            continue;
            com.tencent.mm.sdk.platformtools.w.v("MicroMsg.LauncherUI.MainTabUI", "onPageScrolled, position = %d, mLastIndex = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(w.this.lmn) });
            if (-1 == w.this.lmn)
            {
              w.this.eh(w.this.lmn, w.this.kZJ);
              w.this.Bi(paramInt1);
              break;
            }
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(19097706299392L, 142289);
                w.this.eh(w.this.lmn, w.this.kZJ);
                w.this.Bi(paramInt1);
                GMTrace.o(19097706299392L, 142289);
              }
            });
            break;
          }
          if (this.vNd[localInteger.intValue()] == 0) {
            ei(localInteger.intValue(), 0);
          }
        }
        label251:
        GMTrace.o(19100524871680L, 142310);
        return;
      }
      localObject = w.vMX.values().iterator();
      while (((Iterator)localObject).hasNext())
      {
        localInteger = (Integer)((Iterator)localObject).next();
        if ((localInteger.intValue() != paramInt1) && (this.vNd[localInteger.intValue()] == 0)) {
          ei(localInteger.intValue(), 0);
        }
      }
      GMTrace.o(19100524871680L, 142310);
    }
    
    public final int getCount()
    {
      GMTrace.i(19100256436224L, 142308);
      GMTrace.o(19100256436224L, 142308);
      return 4;
    }
    
    public final void mS(int paramInt)
    {
      GMTrace.i(19100927524864L, 142313);
      if (paramInt == w.this.kZJ)
      {
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.LauncherUI.MainTabUI", "on click same index");
        u localu = w.this.Bk(paramInt);
        if ((localu instanceof AbstractTabChildActivity.a)) {
          ((AbstractTabChildActivity.a)localu).bVP();
        }
        GMTrace.o(19100927524864L, 142313);
        return;
      }
      this.vNc = true;
      this.pGG += 1;
      com.tencent.mm.sdk.platformtools.w.v("MicroMsg.LauncherUI.MainTabUI", "onTabClick count:%d", new Object[] { Integer.valueOf(this.pGG) });
      this.vNb.c(paramInt, false);
      if (paramInt == 3)
      {
        com.tencent.mm.s.c.vK().aF(262145, 266241);
        com.tencent.mm.s.c.vK().aF(262156, 266241);
        com.tencent.mm.s.c.vK().aF(262147, 266241);
        com.tencent.mm.s.c.vK().aF(262149, 266241);
      }
      GMTrace.o(19100927524864L, 142313);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */