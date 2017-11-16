package com.tencent.mm.ui.contact;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Looper;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.fts.a.j;
import com.tencent.mm.plugin.selectcontact.a.h;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.contact.a.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class q
  extends m
{
  private int count;
  private String eQb;
  private ae handler;
  private com.tencent.mm.plugin.fts.a.a.a lwZ;
  private String[] lxa;
  private List<com.tencent.mm.plugin.fts.a.a.i> lyV;
  private List<com.tencent.mm.plugin.fts.a.a.i> mTu;
  private int wQt;
  private int wQu;
  private List<String> wST;
  private int wSU;
  private int wSV;
  private int wSW;
  private boolean wSX;
  private int wSY;
  private boolean wSZ;
  private int wTa;
  private List<com.tencent.mm.plugin.fts.a.a.i> wTb;
  private List<com.tencent.mm.plugin.fts.a.a.i> wTc;
  private List<Integer> wTd;
  private j wTe;
  protected j wTf;
  
  public q(MMBaseSelectContactUI paramMMBaseSelectContactUI, List<String> paramList, boolean paramBoolean, int paramInt)
  {
    super(paramMMBaseSelectContactUI, paramBoolean, paramInt);
    GMTrace.i(1709262766080L, 12735);
    this.wSU = Integer.MAX_VALUE;
    this.wSV = Integer.MAX_VALUE;
    this.wSW = Integer.MAX_VALUE;
    this.wSX = true;
    this.wSY = Integer.MAX_VALUE;
    this.wQt = Integer.MAX_VALUE;
    this.wSZ = true;
    this.wTa = Integer.MAX_VALUE;
    this.wQu = Integer.MAX_VALUE;
    this.wTb = null;
    this.mTu = null;
    this.lyV = null;
    this.wTc = null;
    this.handler = new ae(Looper.getMainLooper());
    this.wTe = new j()
    {
      public final void a(com.tencent.mm.plugin.fts.a.a.g paramAnonymousg)
      {
        GMTrace.i(17924106485760L, 133545);
        switch (paramAnonymousg.aGY)
        {
        }
        for (;;)
        {
          GMTrace.o(17924106485760L, 133545);
          return;
          if ((q.a(q.this) == null) || (!q.a(q.this).equals(q.a(q.this))))
          {
            GMTrace.o(17924106485760L, 133545);
            return;
          }
          q.b(q.this);
          q.a(q.this, paramAnonymousg.lxa);
          q.a(q.this, paramAnonymousg.lxb);
          q.b(q.this, paramAnonymousg.lxb);
          com.tencent.mm.plugin.fts.a.d.aI(paramAnonymousg.lxb);
          boolean bool = q.c(q.this);
          q.a(q.this, paramAnonymousg.luZ.eQb, bool);
          GMTrace.o(17924106485760L, 133545);
          return;
          if (!paramAnonymousg.luZ.eQb.equals(q.d(q.this)))
          {
            GMTrace.o(17924106485760L, 133545);
            return;
          }
          q.c(q.this);
        }
      }
    };
    this.wTf = new j()
    {
      public final void a(com.tencent.mm.plugin.fts.a.a.g paramAnonymousg)
      {
        GMTrace.i(17927327711232L, 133569);
        switch (paramAnonymousg.aGY)
        {
        }
        for (;;)
        {
          GMTrace.o(17927327711232L, 133569);
          return;
          if ((q.a(q.this) != null) && (q.a(q.this).equals(q.a(q.this))))
          {
            q.a(q.this, paramAnonymousg.lxa);
            q.a(q.this, paramAnonymousg.lxb);
            if (paramAnonymousg.lxb.size() > 0) {
              switch (((com.tencent.mm.plugin.fts.a.a.i)paramAnonymousg.lxb.get(0)).type)
              {
              case 131073: 
              case 131074: 
              default: 
                w.i("MicroMsg.MMSearchContactAdapter", "not support search");
              }
            }
            for (;;)
            {
              boolean bool = q.c(q.this);
              q.a(q.this, paramAnonymousg.luZ.eQb, bool);
              GMTrace.o(17927327711232L, 133569);
              return;
              q.c(q.this, paramAnonymousg.lxb);
              continue;
              q.d(q.this, paramAnonymousg.lxb);
              continue;
              q.e(q.this, paramAnonymousg.lxb);
            }
            if (!paramAnonymousg.luZ.eQb.equals(q.d(q.this)))
            {
              GMTrace.o(17927327711232L, 133569);
              return;
            }
            q.c(q.this);
          }
        }
      }
    };
    this.count = 0;
    this.wST = paramList;
    this.wTd = new ArrayList();
    w.i("MicroMsg.MMSearchContactAdapter", "Create!");
    PY();
    GMTrace.o(1709262766080L, 12735);
  }
  
  private void PY()
  {
    GMTrace.i(1709933854720L, 12740);
    w.i("MicroMsg.MMSearchContactAdapter", "initData!");
    this.eQb = null;
    cgH();
    clearTask();
    clearCache();
    GMTrace.o(1709933854720L, 12740);
  }
  
  private static int cU(List<? extends Object> paramList)
  {
    GMTrace.i(1710470725632L, 12744);
    if (paramList == null)
    {
      GMTrace.o(1710470725632L, 12744);
      return 0;
    }
    int i = paramList.size();
    GMTrace.o(1710470725632L, 12744);
    return i;
  }
  
  private void cgH()
  {
    GMTrace.i(1709799636992L, 12739);
    this.wSV = Integer.MAX_VALUE;
    this.wSW = Integer.MAX_VALUE;
    this.wSX = true;
    this.wSY = Integer.MAX_VALUE;
    this.wQt = Integer.MAX_VALUE;
    this.wSZ = true;
    this.wTa = Integer.MAX_VALUE;
    this.wQu = Integer.MAX_VALUE;
    this.wTb = null;
    this.mTu = null;
    this.lyV = null;
    this.wTc = null;
    this.lxa = null;
    clearCache();
    notifyDataSetChanged();
    GMTrace.o(1709799636992L, 12739);
  }
  
  private void clearTask()
  {
    GMTrace.i(1709665419264L, 12738);
    if (this.lwZ != null)
    {
      ((com.tencent.mm.plugin.fts.a.l)h.j(com.tencent.mm.plugin.fts.a.l.class)).cancelSearchTask(this.lwZ);
      this.lwZ = null;
    }
    GMTrace.o(1709665419264L, 12738);
  }
  
  private com.tencent.mm.ui.contact.a.a ev(int paramInt1, int paramInt2)
  {
    GMTrace.i(1710873378816L, 12747);
    com.tencent.mm.ui.contact.a.g localg = new com.tencent.mm.ui.contact.a.g(paramInt2);
    localg.lAh = this.wSB.getActivity().getResources().getString(paramInt1);
    GMTrace.o(1710873378816L, 12747);
    return localg;
  }
  
  private void f(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(1710202290176L, 12742);
    int i = cU(this.wTb);
    int m = cU(this.mTu);
    int k = cU(this.lyV);
    int j = cU(this.wTc);
    if (i > 0)
    {
      this.wSV = 0;
      i = i + 1 + 0;
      if (m <= 0) {
        break label318;
      }
      this.wSW = i;
      if ((m <= 3) || ((k <= 0) && (j <= 0))) {
        break label300;
      }
      if (!this.wSX) {
        break label276;
      }
      i += 4;
      this.wSY = i;
      i += 1;
      label115:
      if ((this.lxa.length <= 1) || (bhh())) {
        break label327;
      }
      this.wSU = i;
      i += 1;
      label143:
      if (k <= 0) {
        break label378;
      }
      this.wQt = i;
      if ((k <= 3) || (j <= 0)) {
        break label360;
      }
      if (!this.wSZ) {
        break label336;
      }
      i += 4;
      this.wTa = i;
      i += 1;
      label190:
      if (j <= 0) {
        break label387;
      }
      this.wQu = i;
      i += j + 1;
    }
    for (;;)
    {
      w.i("MicroMsg.MMSearchContactAdapter", "setCount %d", new Object[] { Integer.valueOf(i) });
      this.count = i;
      if (paramBoolean2) {
        bg(paramString, paramBoolean1);
      }
      clearCache();
      notifyDataSetChanged();
      GMTrace.o(1710202290176L, 12742);
      return;
      this.wSV = Integer.MAX_VALUE;
      i = 0;
      break;
      label276:
      i += m + 1;
      this.wSY = i;
      i += 1;
      break label115;
      label300:
      this.wSY = Integer.MAX_VALUE;
      i += m + 1;
      break label115;
      label318:
      this.wSW = Integer.MAX_VALUE;
      break label115;
      label327:
      this.wSU = Integer.MAX_VALUE;
      break label143;
      label336:
      i += k + 1;
      this.wTa = i;
      i += 1;
      break label190;
      label360:
      this.wTa = Integer.MAX_VALUE;
      i += k + 1;
      break label190;
      label378:
      this.wQt = Integer.MAX_VALUE;
      break label190;
      label387:
      this.wQu = Integer.MAX_VALUE;
    }
  }
  
  private static com.tencent.mm.ui.contact.a.a s(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    GMTrace.i(1710739161088L, 12746);
    com.tencent.mm.ui.contact.a.i locali = new com.tencent.mm.ui.contact.a.i(paramInt2);
    locali.qPV = paramInt1;
    locali.wVj = paramBoolean;
    GMTrace.o(1710739161088L, 12746);
    return locali;
  }
  
  public final boolean DD(int paramInt)
  {
    boolean bool = true;
    GMTrace.i(1711276032000L, 12750);
    paramInt -= this.wSB.bho().getHeaderViewsCount();
    if (paramInt == this.wSY) {
      if (this.wSX)
      {
        paramInt = this.wSB.bho().getSelectedItemPosition();
        this.wSX = false;
        f(this.eQb, true, false);
        this.wSB.bho().setSelection(paramInt);
      }
    }
    for (;;)
    {
      GMTrace.o(1711276032000L, 12750);
      return bool;
      this.wSX = true;
      f(this.eQb, true, false);
      this.wSB.bho().setSelection(this.wSY);
      continue;
      if (paramInt == this.wTa)
      {
        if (this.wSZ)
        {
          paramInt = this.wSB.bho().getSelectedItemPosition();
          this.wSZ = false;
          f(this.eQb, true, false);
          this.wSB.bho().setSelection(paramInt);
        }
        else
        {
          this.wSZ = true;
          f(this.eQb, true, false);
          this.wSB.bho().setSelection(this.wTa);
        }
      }
      else
      {
        com.tencent.mm.ui.contact.a.a locala = DC(paramInt);
        if ((locala != null) && (locala.wUJ) && (this.wSU != Integer.MAX_VALUE))
        {
          if (locala.position == this.wSU)
          {
            u.DE(1);
            bool = false;
          }
          else
          {
            u.DE(0);
          }
        }
        else {
          bool = false;
        }
      }
    }
  }
  
  public final void Ty()
  {
    GMTrace.i(1710068072448L, 12741);
    PY();
    GMTrace.o(1710068072448L, 12741);
  }
  
  public void a(String paramString, int[] paramArrayOfInt, boolean paramBoolean)
  {
    GMTrace.i(1709531201536L, 12737);
    clearTask();
    this.eQb = paramString;
    this.wTd.clear();
    int j = paramArrayOfInt.length;
    int i = 0;
    while (i < j)
    {
      int k = paramArrayOfInt[i];
      this.wTd.add(Integer.valueOf(k));
      i += 1;
    }
    HashSet localHashSet = new HashSet();
    if (!paramBoolean) {
      localHashSet.add("filehelper");
    }
    w.i("MicroMsg.MMSearchContactAdapter", "doSearch: query=%s", new Object[] { this.eQb });
    com.tencent.mm.plugin.fts.a.a.f localf = new com.tencent.mm.plugin.fts.a.a.f();
    localf.eQb = paramString;
    localf.lwT = paramArrayOfInt;
    localf.lwV = 3;
    localf.lwY = this.wTe;
    localf.handler = this.handler;
    localf.scene = 1;
    localf.lwW = localHashSet;
    this.lwZ = ((com.tencent.mm.plugin.fts.a.l)h.j(com.tencent.mm.plugin.fts.a.l.class)).search(1, localf);
    GMTrace.o(1709531201536L, 12737);
  }
  
  public void bg(String paramString, boolean paramBoolean)
  {
    GMTrace.i(1709396983808L, 12736);
    if (this.wSA != null) {
      this.wSA.r(paramString, getCount(), paramBoolean);
    }
    GMTrace.o(1709396983808L, 12736);
  }
  
  protected boolean c(com.tencent.mm.ui.contact.a.a parama)
  {
    GMTrace.i(1711141814272L, 12749);
    int j = parama.position;
    int k = this.wSV;
    int m = this.wSW;
    int n = this.wQt;
    int i1 = this.wQu;
    int i = 0;
    while (i < 4)
    {
      if (j + 1 == new int[] { k, m, n, i1 }[i])
      {
        GMTrace.o(1711141814272L, 12749);
        return true;
      }
      i += 1;
    }
    GMTrace.o(1711141814272L, 12749);
    return false;
  }
  
  public void finish()
  {
    GMTrace.i(1711007596544L, 12748);
    super.finish();
    w.i("MicroMsg.MMSearchContactAdapter", "finish!");
    PY();
    GMTrace.o(1711007596544L, 12748);
  }
  
  public int getCount()
  {
    GMTrace.i(1710336507904L, 12743);
    int i = this.count;
    GMTrace.o(1710336507904L, 12743);
    return i;
  }
  
  public com.tencent.mm.ui.contact.a.a hG(int paramInt)
  {
    GMTrace.i(1710604943360L, 12745);
    Object localObject;
    if (paramInt == this.wSU)
    {
      localObject = new com.tencent.mm.ui.contact.a.f(paramInt);
      ((com.tencent.mm.ui.contact.a.f)localObject).lxa = this.lxa;
      ((com.tencent.mm.ui.contact.a.f)localObject).wUJ = true;
    }
    for (;;)
    {
      if (localObject != null)
      {
        ((com.tencent.mm.ui.contact.a.a)localObject).eQb = this.eQb;
        ((com.tencent.mm.ui.contact.a.a)localObject).scene = this.scene;
      }
      GMTrace.o(1710604943360L, 12745);
      return (com.tencent.mm.ui.contact.a.a)localObject;
      if (paramInt == this.wSV)
      {
        localObject = ev(a.h.lzS, paramInt);
      }
      else if (paramInt == this.wSW)
      {
        localObject = ev(a.h.dyq, paramInt);
      }
      else if (paramInt == this.wQt)
      {
        localObject = ev(a.h.dyp, paramInt);
      }
      else if (paramInt == this.wQu)
      {
        localObject = ev(a.h.oFA, paramInt);
      }
      else if (paramInt == this.wSY)
      {
        localObject = s(a.h.dyq, paramInt, this.wSX);
      }
      else if (paramInt == this.wTa)
      {
        localObject = s(a.h.dyp, paramInt, this.wSZ);
      }
      else
      {
        int i;
        if (paramInt > this.wQu)
        {
          i = paramInt - this.wQu - 1;
          localObject = new com.tencent.mm.ui.contact.a.d(paramInt);
          ((com.tencent.mm.ui.contact.a.d)localObject).hWl = ((com.tencent.mm.plugin.fts.a.a.i)this.wTc.get(i));
          ((com.tencent.mm.ui.contact.a.d)localObject).lxa = this.lxa;
          ((com.tencent.mm.ui.contact.a.a)localObject).wSC = bhh();
          ((com.tencent.mm.ui.contact.a.d)localObject).wUJ = true;
          ((com.tencent.mm.ui.contact.a.d)localObject).lzY = (i + 1);
          ((com.tencent.mm.ui.contact.a.d)localObject).ci(((com.tencent.mm.ui.contact.a.d)localObject).hWl.type, ((com.tencent.mm.ui.contact.a.d)localObject).hWl.gRk);
        }
        else if (paramInt > this.wQt)
        {
          i = paramInt - this.wQt - 1;
          localObject = new c(paramInt);
          ((c)localObject).hWl = ((com.tencent.mm.plugin.fts.a.a.i)this.lyV.get(i));
          ((c)localObject).lxa = this.lxa;
          ((com.tencent.mm.ui.contact.a.a)localObject).wSC = bhh();
          ((c)localObject).wUJ = true;
          ((c)localObject).lzY = (i + 1);
          ((c)localObject).ci(((c)localObject).hWl.type, ((c)localObject).hWl.gRk);
        }
        else if (paramInt > this.wSW)
        {
          i = paramInt - this.wSW - 1;
          localObject = new com.tencent.mm.ui.contact.a.d(paramInt);
          ((com.tencent.mm.ui.contact.a.d)localObject).hWl = ((com.tencent.mm.plugin.fts.a.a.i)this.mTu.get(i));
          ((com.tencent.mm.ui.contact.a.d)localObject).lxa = this.lxa;
          ((com.tencent.mm.ui.contact.a.a)localObject).wSC = bhh();
          ((com.tencent.mm.ui.contact.a.d)localObject).wUJ = true;
          ((com.tencent.mm.ui.contact.a.d)localObject).lzY = (i + 1);
          ((com.tencent.mm.ui.contact.a.d)localObject).ci(((com.tencent.mm.ui.contact.a.d)localObject).hWl.type, ((com.tencent.mm.ui.contact.a.d)localObject).hWl.gRk);
        }
        else if (paramInt > this.wSV)
        {
          i = paramInt - this.wSV - 1;
          com.tencent.mm.plugin.fts.a.a.i locali = (com.tencent.mm.plugin.fts.a.a.i)this.wTb.get(i);
          if ((locali.type == 131072) || (locali.type == 131076))
          {
            localObject = new com.tencent.mm.ui.contact.a.d(paramInt);
            ((com.tencent.mm.ui.contact.a.d)localObject).hWl = locali;
            ((com.tencent.mm.ui.contact.a.d)localObject).lxa = this.lxa;
            ((com.tencent.mm.ui.contact.a.a)localObject).wSC = bhh();
            ((com.tencent.mm.ui.contact.a.d)localObject).wUI = true;
            ((com.tencent.mm.ui.contact.a.d)localObject).wUJ = true;
            ((com.tencent.mm.ui.contact.a.d)localObject).lzY = (i + 1);
            ((com.tencent.mm.ui.contact.a.d)localObject).ci(((com.tencent.mm.ui.contact.a.d)localObject).hWl.type, ((com.tencent.mm.ui.contact.a.d)localObject).hWl.gRk);
          }
          else if (locali.type == 131075)
          {
            localObject = new c(paramInt);
            ((c)localObject).hWl = locali;
            ((c)localObject).lxa = this.lxa;
            ((com.tencent.mm.ui.contact.a.a)localObject).wSC = bhh();
            ((c)localObject).wUI = true;
            ((c)localObject).wUJ = true;
            ((c)localObject).lzY = (i + 1);
            ((c)localObject).ci(((c)localObject).hWl.type, ((c)localObject).hWl.gRk);
          }
          else
          {
            w.e("MicroMsg.MMSearchContactAdapter", "createTopHitsDataItem return unkown type %d", new Object[] { Integer.valueOf(locali.type) });
            localObject = null;
          }
        }
        else
        {
          w.e("MicroMsg.MMSearchContactAdapter", "unkown position=%d", new Object[] { Integer.valueOf(paramInt) });
          localObject = null;
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\contact\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */