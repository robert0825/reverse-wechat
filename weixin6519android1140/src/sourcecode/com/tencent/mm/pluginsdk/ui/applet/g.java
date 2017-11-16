package com.tencent.mm.pluginsdk.ui.applet;

import android.content.Context;
import android.content.res.Resources;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.chatroom.b.b;
import com.tencent.mm.plugin.comm.a.c;
import com.tencent.mm.plugin.comm.a.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.y.ae;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class g
{
  private Context context;
  public f htU;
  private View mOO;
  private View mSC;
  public View.OnClickListener oiK;
  public ContactListExpandPreference.a qqX;
  String twT;
  private HashMap<String, Preference> twU;
  boolean twV;
  boolean twW;
  public h twX;
  i.b twY;
  private View.OnClickListener twZ;
  private View.OnClickListener txa;
  private View.OnClickListener txb;
  private i.b txc;
  private i.a txd;
  private h.a txe;
  public String username;
  
  public g(Context paramContext)
  {
    GMTrace.i(962877980672L, 7174);
    this.twU = new HashMap();
    this.twV = false;
    if (this.twV) {
      bool = true;
    }
    this.twW = bool;
    this.twY = null;
    this.oiK = null;
    this.qqX = null;
    this.txb = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(960193626112L, 7154);
        w.d("MicroMsg.ContactListArchor", "OnClickListener = onClick ");
        GMTrace.o(960193626112L, 7154);
      }
    };
    this.txc = new i.b()
    {
      public final boolean lZ(int paramAnonymousInt)
      {
        GMTrace.i(967575601152L, 7209);
        if ((!g.this.twX.txs) || (!g.this.twX.zj(paramAnonymousInt)))
        {
          GMTrace.o(967575601152L, 7209);
          return true;
        }
        if (!g.this.twX.zi(paramAnonymousInt)) {
          w.d("MicroMsg.ContactListArchor", "onItemLongClick " + paramAnonymousInt);
        }
        GMTrace.o(967575601152L, 7209);
        return true;
      }
    };
    this.txd = new i.a()
    {
      public final void zh(int paramAnonymousInt)
      {
        int j = 1;
        GMTrace.i(966636077056L, 7202);
        if ((g.this.qqX != null) && (g.this.twX != null))
        {
          h localh = g.this.twX;
          if (localh.txs) {
            if ((!localh.jPB) && (paramAnonymousInt == localh.txq + 2))
            {
              i = 1;
              if (i != 0) {
                break label416;
              }
              localh = g.this.twX;
              if ((localh.jPB) || (paramAnonymousInt != localh.txq)) {
                break label162;
              }
            }
          }
          label162:
          for (int i = 1;; i = 0)
          {
            if (i == 0) {
              break label167;
            }
            g.this.qqX.mc(paramAnonymousInt);
            GMTrace.o(966636077056L, 7202);
            return;
            i = 0;
            break;
            if ((!localh.jPB) && (paramAnonymousInt == localh.txq + 1))
            {
              i = 1;
              break;
            }
            i = 0;
            break;
          }
          label167:
          localh = g.this.twX;
          if ((!localh.jPB) && (paramAnonymousInt == localh.txq + 1)) {
            i = j;
          }
          while (i != 0)
          {
            if (!g.this.twX.txs) {
              break label416;
            }
            if (s.eb(g.this.username))
            {
              g.this.qqX.ma(paramAnonymousInt);
              GMTrace.o(966636077056L, 7202);
              return;
              i = 0;
            }
            else
            {
              g.this.twX.zi(0);
              GMTrace.o(966636077056L, 7202);
              return;
            }
          }
          if ((g.this.twX.jPB) && (g.this.twX.zj(paramAnonymousInt)))
          {
            g.this.qqX.ma(paramAnonymousInt);
            GMTrace.o(966636077056L, 7202);
            return;
          }
          if ((g.this.twX.jPB) && (!g.this.twX.zj(paramAnonymousInt)))
          {
            g.this.qqX.anE();
            GMTrace.o(966636077056L, 7202);
            return;
          }
          if ((!g.this.twX.jPB) && (g.this.twX.zj(paramAnonymousInt))) {
            g.this.qqX.mb(paramAnonymousInt);
          }
        }
        label416:
        GMTrace.o(966636077056L, 7202);
      }
    };
    this.txe = new h.a()
    {
      public final void bIC()
      {
        GMTrace.i(948919336960L, 7070);
        if (g.this.htU != null) {
          g.this.htU.notifyDataSetChanged();
        }
        GMTrace.o(948919336960L, 7070);
      }
    };
    this.context = paramContext;
    this.twX = new h(this.context);
    this.twX.txi = this.txe;
    GMTrace.o(962877980672L, 7174);
  }
  
  private static String zg(int paramInt)
  {
    GMTrace.i(963146416128L, 7176);
    if (paramInt >= 0)
    {
      str = "pref_contact_list_row_" + paramInt;
      GMTrace.o(963146416128L, 7176);
      return str;
    }
    String str = "unkown";
    if (paramInt == -1) {
      str = "header";
    }
    for (;;)
    {
      str = "pref_contact_list_row_" + str;
      GMTrace.o(963146416128L, 7176);
      return str;
      if (paramInt == -2) {
        str = "footer";
      }
    }
  }
  
  final void Bw(String paramString)
  {
    GMTrace.i(963012198400L, 7175);
    h localh = this.twX;
    localh.username = paramString;
    localh.eMr = s.eb(paramString);
    if ((!localh.eMr) && (n.a.txR != null)) {
      localh.txk = n.a.txR.Pf(paramString);
    }
    if (!localh.txk) {
      localh.jNF = ((b)com.tencent.mm.kernel.h.h(b.class)).yT().gC(paramString);
    }
    if ((localh.txk) && (n.a.txR != null)) {
      localh.jQF = n.a.txR.Ph(localh.username);
    }
    this.twX.txw = this.twW;
    this.twX.notifyChanged();
    aZP();
    GMTrace.o(963012198400L, 7175);
  }
  
  public final void aZP()
  {
    GMTrace.i(963280633856L, 7177);
    if ((this.htU == null) || (this.twT == null))
    {
      GMTrace.o(963280633856L, 7177);
      return;
    }
    Object localObject1 = this.twU.keySet().iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (String)((Iterator)localObject1).next();
      this.htU.VH((String)localObject2);
    }
    this.twU.clear();
    int m = this.htU.indexOf(this.twT);
    int k = 0;
    if (this.mOO != null) {
      k = 1;
    }
    if (this.mSC != null) {
      if (this.twV)
      {
        localObject1 = this.twX;
        if (((h)localObject1).txp <= ((h)localObject1).txx) {
          break label564;
        }
        i = 1;
        if (i == 0) {
          break label905;
        }
      }
    }
    label264:
    label277:
    label322:
    label564:
    label578:
    label587:
    label599:
    label680:
    label801:
    label902:
    label905:
    for (int i = 1;; i = 0)
    {
      int j = m;
      if (k != 0)
      {
        localObject1 = new ContactListCustomPreference(this.context);
        ((ContactListCustomPreference)localObject1).setKey(zg(-1));
        ((ContactListCustomPreference)localObject1).setCustomView(this.mOO);
        ((ContactListCustomPreference)localObject1).background = a.d.aVO;
        ((ContactListCustomPreference)localObject1).oiK = this.twZ;
        this.htU.a((Preference)localObject1, m);
        this.twU.put(((Preference)localObject1).hiu, localObject1);
        j = m + 1;
      }
      Object localObject3;
      boolean bool2;
      boolean bool1;
      if (this.twY != null)
      {
        localObject1 = this.twY;
        if (this.oiK == null) {
          break label578;
        }
        localObject2 = this.oiK;
        localObject3 = this.twX.txy;
        bool2 = this.twX.bLH();
        if ((!bg.nm((String)localObject3)) && ((localObject3 == null) || (((String)localObject3).equals(q.zE())))) {
          break label587;
        }
        bool1 = false;
        if (!this.twX.txk) {
          break label902;
        }
        bool1 = this.twX.txl;
      }
      for (;;)
      {
        int i2 = this.twX.txq;
        if ((!bool2) || (bool1)) {}
        int n;
        Object localObject4;
        for (k = 2;; k = 1)
        {
          n = 0;
          localObject3 = this.twX;
          localObject4 = this.context;
          if (localObject4 != null) {
            break label599;
          }
          m = 0;
          i1 = 0;
          while ((i1 < this.twX.getCount()) && (i1 < i2 + k))
          {
            localObject3 = new ContactListExpandPreference(this.context, 1);
            ((ContactListExpandPreference)localObject3).setKey(zg(n));
            localObject4 = ((ContactListExpandPreference)localObject3).txL;
            ((i)localObject4).twX = this.twX;
            ((i)localObject4).row = n;
            ((i)localObject4).index = i1;
            ((ContactListExpandPreference)localObject3).txL.txM = m;
            ((ContactListExpandPreference)localObject3).txL.jNC = bool1;
            ((ContactListExpandPreference)localObject3).txL.oiK = ((View.OnClickListener)localObject2);
            ((ContactListExpandPreference)localObject3).txL.txd = this.txd;
            ((ContactListExpandPreference)localObject3).txL.txN = ((i.b)localObject1);
            this.htU.a((Preference)localObject3, j + n);
            this.twU.put(((Preference)localObject3).hiu, localObject3);
            i1 += m;
            n += 1;
          }
          i = 0;
          break;
          localObject1 = this.txc;
          break label264;
          localObject2 = this.txb;
          break label277;
          bool1 = true;
          break label322;
        }
        Display localDisplay = ((WindowManager)((Context)localObject4).getSystemService("window")).getDefaultDisplay();
        m = localDisplay.getWidth();
        int i1 = localDisplay.getHeight();
        float f2;
        if ((m / (((Context)localObject4).getResources().getDimension(a.c.aQA) + ((Context)localObject4).getResources().getDimension(a.c.aQw) * 2.0F) >= 5.0F) && (i1 > m))
        {
          ((h)localObject3).txE = true;
          f2 = ((Context)localObject4).getResources().getDimension(a.c.aQw);
          if (!((h)localObject3).txE) {
            break label801;
          }
        }
        for (float f1 = ((Context)localObject4).getResources().getDimension(a.c.aQA);; f1 = ((Context)localObject4).getResources().getDimension(a.c.aQy))
        {
          i1 = (int)(f1 + 2.0F * f2);
          i1 = (int)((m - ((Context)localObject4).getResources().getDimension(a.c.aQt) * 1.0F) / i1);
          w.i("MicroMsg.ContactsListArchAdapter", "[getWrapColNum] :%s", new Object[] { Integer.valueOf(i1) });
          h.txh = i1;
          m = i1;
          if (i1 != 4) {
            break;
          }
          h.txg = 43;
          m = i1;
          break;
          ((h)localObject3).txE = false;
          break label680;
        }
        if (i != 0)
        {
          localObject1 = new ContactListCustomPreference(this.context);
          ((ContactListCustomPreference)localObject1).setKey(zg(-2));
          ((ContactListCustomPreference)localObject1).setCustomView(this.mSC);
          ((ContactListCustomPreference)localObject1).oiK = this.txa;
          this.htU.a((Preference)localObject1, j + n);
          this.twU.put(((Preference)localObject1).hiu, localObject1);
        }
        GMTrace.o(963280633856L, 7177);
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\applet\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */