package com.tencent.mm.ui.transmit;

import android.app.Activity;
import android.os.Looper;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.plugin.fts.a.a.f;
import com.tencent.mm.plugin.fts.a.j;
import com.tencent.mm.pluginsdk.ui.MultiSelectContactView;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.a.d;
import com.tencent.mm.ui.contact.n;
import com.tencent.mm.ui.contact.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class a
  extends o
{
  private int count;
  ae handler;
  HashSet<String> hqM;
  j nLu;
  List<String> xkr;
  List<com.tencent.mm.plugin.fts.a.a.a> xks;
  List<a> xkt;
  
  public a(com.tencent.mm.ui.contact.l paraml, List<String> paramList, int paramInt)
  {
    super(paraml, null, true, true, paramInt);
    GMTrace.i(3033589088256L, 22602);
    this.handler = new ae(Looper.getMainLooper());
    this.nLu = new j()
    {
      public final void a(com.tencent.mm.plugin.fts.a.a.g paramAnonymousg)
      {
        GMTrace.i(17933770162176L, 133617);
        a.a locala = new a.a(a.this);
        locala.eQb = paramAnonymousg.luZ.eQb;
        locala.lxb = paramAnonymousg.lxb;
        if ((locala.lxb == null) || (locala.lxb.size() == 0))
        {
          paramAnonymousg = new com.tencent.mm.plugin.fts.a.a.i();
          paramAnonymousg.lwH = "no_result​";
          locala.lxb = new ArrayList();
          locala.lxb.add(paramAnonymousg);
        }
        a.a(a.this).add(locala);
        a.b(a.this);
        GMTrace.o(17933770162176L, 133617);
      }
    };
    this.count = 0;
    this.xkr = paramList;
    this.xkt = new ArrayList();
    this.hqM = new HashSet();
    GMTrace.o(3033589088256L, 22602);
  }
  
  private boolean Eb(int paramInt)
  {
    boolean bool2 = false;
    GMTrace.i(17928669888512L, 133579);
    int j = paramInt - this.wSB.bho().getHeaderViewsCount();
    int i = this.xkt.size() - 1;
    boolean bool1 = bool2;
    a locala;
    if (i >= 0)
    {
      locala = (a)this.xkt.get(i);
      if (locala.lzG != j) {
        break label248;
      }
      if (locala.xkw)
      {
        paramInt = this.wSB.bho().getSelectedItemPosition();
        locala.xkw = false;
        ciC();
        this.wSB.bho().setSelection(paramInt);
        label114:
        notifyDataSetChanged();
        bool1 = true;
      }
    }
    else
    {
      label121:
      GMTrace.o(17928669888512L, 133579);
      return bool1;
    }
    locala.xkw = true;
    i = 0;
    label140:
    com.tencent.mm.plugin.fts.a.a.i locali;
    if (i < locala.lxb.size())
    {
      locali = (com.tencent.mm.plugin.fts.a.a.i)locala.lxb.get(i);
      if ((!locali.lwH.equals(locala.xkx)) || (i <= 2)) {}
    }
    for (;;)
    {
      if (locali != null)
      {
        locala.lxb.remove(i);
        locala.lxb.add(0, locali);
      }
      ciC();
      this.wSB.bho().setSelection(paramInt);
      break label114;
      i += 1;
      break label140;
      label248:
      if (j == locala.lzE)
      {
        bool1 = true;
        break label121;
      }
      if (paramInt > locala.lzE)
      {
        paramInt = locala.lzE;
        locali = (com.tencent.mm.plugin.fts.a.a.i)locala.lxb.get(j - paramInt - 1);
        if (!locali.lwH.equals("no_result​"))
        {
          MMCreateChatroomUI localMMCreateChatroomUI = (MMCreateChatroomUI)this.wSB;
          if (!t.nm(locala.xkx)) {
            if (locala.xkx.equals(locali.lwH))
            {
              localMMCreateChatroomUI.mUn.OZ(locala.xkx);
              this.hqM.remove(locala.xkx);
              locala.xkx = null;
            }
          }
          for (;;)
          {
            localMMCreateChatroomUI.Qe();
            notifyDataSetChanged();
            bool1 = true;
            break;
            if (this.hqM.contains(locali.lwH)) {
              break label537;
            }
            this.hqM.remove(locala.xkx);
            localMMCreateChatroomUI.mUn.OZ(locala.xkx);
            locala.xkx = locali.lwH;
            localMMCreateChatroomUI.mUn.aQ(locala.xkx, false);
            this.hqM.add(locala.xkx);
            continue;
            if (this.hqM.contains(locali.lwH)) {
              break label537;
            }
            localMMCreateChatroomUI.mUn.aQ(locali.lwH, false);
            locala.xkx = locali.lwH;
            this.hqM.add(locala.xkx);
          }
        }
      }
      else
      {
        i -= 1;
        break;
      }
      label537:
      bool1 = true;
      break label121;
      locali = null;
      i = 0;
    }
  }
  
  public final boolean DD(int paramInt)
  {
    GMTrace.i(3034260176896L, 22607);
    boolean bool = Eb(paramInt);
    GMTrace.o(3034260176896L, 22607);
    return bool;
  }
  
  final void ciC()
  {
    GMTrace.i(3033991741440L, 22605);
    Iterator localIterator = this.xkt.iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (locala.lxb.size() <= 0) {
        break label150;
      }
      locala.lzE = i;
      i += 1;
      if (locala.lxb.size() > 3)
      {
        if (locala.xkw) {
          i += 3;
        }
        for (;;)
        {
          locala.lzG = i;
          i += 1;
          break;
          i += locala.lxb.size();
        }
      }
      i = locala.lxb.size() + i;
    }
    label150:
    for (;;)
    {
      break;
      this.count = i;
      clearCache();
      notifyDataSetChanged();
      GMTrace.o(3033991741440L, 22605);
      return;
    }
  }
  
  public final List<String> ciD()
  {
    GMTrace.i(3034394394624L, 22608);
    HashSet localHashSet = new HashSet();
    Object localObject = this.xkt.iterator();
    while (((Iterator)localObject).hasNext())
    {
      a locala = (a)((Iterator)localObject).next();
      if (!t.nm(locala.xkx)) {
        localHashSet.add(locala.xkx);
      }
    }
    localObject = new ArrayList();
    ((List)localObject).addAll(localHashSet);
    GMTrace.o(3034394394624L, 22608);
    return (List<String>)localObject;
  }
  
  public final void finish()
  {
    GMTrace.i(3033723305984L, 22603);
    super.finish();
    Iterator localIterator = this.xks.iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.plugin.fts.a.a.a locala = (com.tencent.mm.plugin.fts.a.a.a)localIterator.next();
      ((com.tencent.mm.plugin.fts.a.l)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.fts.a.l.class)).cancelSearchTask(locala);
    }
    GMTrace.o(3033723305984L, 22603);
  }
  
  public final int getCount()
  {
    GMTrace.i(3034125959168L, 22606);
    int i = this.count;
    GMTrace.o(3034125959168L, 22606);
    return i;
  }
  
  protected final com.tencent.mm.ui.contact.a.a hG(int paramInt)
  {
    GMTrace.i(3033857523712L, 22604);
    Object localObject = null;
    int i = this.xkt.size() - 1;
    a locala;
    if (i >= 0)
    {
      locala = (a)this.xkt.get(i);
      if (locala.lzE == paramInt)
      {
        localObject = new com.tencent.mm.ui.contact.a.g(paramInt);
        ((com.tencent.mm.ui.contact.a.g)localObject).lAh = this.wSB.getActivity().getString(R.l.dWS, new Object[] { locala.eQb });
        label94:
        if (localObject == null) {
          break label309;
        }
        ((com.tencent.mm.ui.contact.a.a)localObject).eQb = locala.eQb;
        ((com.tencent.mm.ui.contact.a.a)localObject).scene = this.scene;
        ((com.tencent.mm.ui.contact.a.a)localObject).wSC = true;
      }
    }
    for (;;)
    {
      GMTrace.o(3033857523712L, 22604);
      return (com.tencent.mm.ui.contact.a.a)localObject;
      if (locala.lzG == paramInt)
      {
        localObject = new com.tencent.mm.ui.contact.a.i(paramInt);
        ((com.tencent.mm.ui.contact.a.i)localObject).qPV = R.l.dyq;
        ((com.tencent.mm.ui.contact.a.i)localObject).wVj = locala.xkw;
        break label94;
      }
      if (paramInt > locala.lzE)
      {
        int j = paramInt - locala.lzE - 1;
        com.tencent.mm.plugin.fts.a.a.i locali = (com.tencent.mm.plugin.fts.a.a.i)locala.lxb.get(j);
        if (locali.lwH.equals("no_result​"))
        {
          localObject = new com.tencent.mm.ui.contact.a.h(paramInt);
          break label94;
        }
        localObject = new d(paramInt);
        ((d)localObject).hWl = locali;
        ((d)localObject).lxa = new String[] { locala.eQb };
        ((d)localObject).wUJ = true;
        ((d)localObject).lzY = (j + 1);
        ((d)localObject).ci(((d)localObject).hWl.type, ((d)localObject).hWl.gRk);
        break label94;
        label309:
        i -= 1;
        break;
      }
      break label94;
    }
  }
  
  private final class a
  {
    String eQb;
    List<com.tencent.mm.plugin.fts.a.a.i> lxb;
    int lzE;
    int lzG;
    boolean xkw;
    String xkx;
    
    public a()
    {
      GMTrace.i(3048353038336L, 22712);
      this.lzE = Integer.MAX_VALUE;
      this.lzG = Integer.MAX_VALUE;
      this.xkw = true;
      GMTrace.o(3048353038336L, 22712);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\transmit\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */