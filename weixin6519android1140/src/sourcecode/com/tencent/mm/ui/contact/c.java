package com.tencent.mm.ui.contact;

import android.app.Activity;
import android.database.Cursor;
import android.database.MergeCursor;
import android.util.SparseArray;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.selectcontact.a.h;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.contact.a.d;
import com.tencent.mm.ui.contact.a.j;
import com.tencent.mm.y.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class c
  extends o
  implements m.b
{
  private Cursor hqX;
  private int ooT;
  private a wQq;
  private int wQr;
  private int wQs;
  private int wQt;
  private int wQu;
  private int wQv;
  private int wQw;
  private HashMap<String, Integer> wQx;
  private SparseArray<String> wQy;
  
  public c(MMBaseSelectContactUI paramMMBaseSelectContactUI, List<String> paramList, boolean paramBoolean, a parama)
  {
    this(paramMMBaseSelectContactUI, paramList, true, paramBoolean, parama, false);
    GMTrace.i(16855733370880L, 125585);
    GMTrace.o(16855733370880L, 125585);
  }
  
  public c(MMBaseSelectContactUI paramMMBaseSelectContactUI, List<String> paramList, boolean paramBoolean1, boolean paramBoolean2, a parama, boolean paramBoolean3)
  {
    super(paramMMBaseSelectContactUI, paramList, paramBoolean1, paramBoolean2, paramBoolean3);
    GMTrace.i(16855599153152L, 125584);
    this.wQr = Integer.MAX_VALUE;
    this.ooT = Integer.MAX_VALUE;
    this.wQs = Integer.MAX_VALUE;
    this.wQt = Integer.MAX_VALUE;
    this.wQu = Integer.MAX_VALUE;
    this.wQv = Integer.MAX_VALUE;
    this.wQw = Integer.MAX_VALUE;
    this.wQx = null;
    this.wQy = null;
    w.i("MicroMsg.AlphabetContactAdapter", "create!");
    if (parama != null) {}
    for (this.wQq = parama;; this.wQq = new a())
    {
      com.tencent.mm.kernel.h.xz();
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().a(this);
      ayE();
      GMTrace.o(16855599153152L, 125584);
      return;
    }
  }
  
  private void aK(int paramInt, String paramString)
  {
    GMTrace.i(1762010333184L, 13128);
    this.wQx.put(paramString, Integer.valueOf(paramInt));
    this.wQy.put(paramInt, paramString);
    GMTrace.o(1762010333184L, 13128);
  }
  
  private static a aL(int paramInt, String paramString)
  {
    GMTrace.i(1762547204096L, 13132);
    com.tencent.mm.ui.contact.a.g localg = new com.tencent.mm.ui.contact.a.g(paramInt);
    localg.lAh = paramString;
    GMTrace.o(1762547204096L, 13132);
    return localg;
  }
  
  private void ayE()
  {
    GMTrace.i(1761876115456L, 13127);
    this.wQr = Integer.MAX_VALUE;
    this.ooT = Integer.MAX_VALUE;
    this.wQs = Integer.MAX_VALUE;
    this.wQt = Integer.MAX_VALUE;
    this.wQu = Integer.MAX_VALUE;
    this.wQw = Integer.MAX_VALUE;
    label73:
    int j;
    int i;
    ArrayList localArrayList;
    Object localObject1;
    label197:
    Object localObject2;
    if (this.wQx != null)
    {
      this.wQx.clear();
      if (this.wQy == null) {
        break label416;
      }
      this.wQy.clear();
      j = 0;
      i = 0;
      localArrayList = new ArrayList();
      if (!this.wQq.wQD) {
        break label516;
      }
      com.tencent.mm.kernel.h.xz();
      localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().g(bg.g(this.wQq.wQG.split(",")), false);
      localArrayList.add(localObject1);
      j = ((Cursor)localObject1).getCount();
      w.d("MicroMsg.AlphabetContactAdapter", "ap: recent like count %d", new Object[] { Integer.valueOf(j) });
      if (j <= 0) {
        break label430;
      }
      this.wQw = 0;
      aK(this.wQw, "☆");
      i = j + 1 + 0;
      com.tencent.mm.kernel.h.xz();
      localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().cp(bg.g(this.wQq.wQF.split(",")));
      localArrayList.add(localObject2);
      j = ((Cursor)localObject2).getCount();
      if (j <= 0) {
        break label439;
      }
      this.wQs = i;
      i += j + 1;
      aK(this.wQs, "☆");
    }
    Object localObject3;
    int k;
    for (;;)
    {
      localObject3 = bg.g(this.wQq.wQF.split(","));
      com.tencent.mm.kernel.h.xz();
      localArrayList.add(((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().g((List)localObject3, true));
      localObject2 = s.v((List)localObject3);
      localObject3 = s.u((List)localObject3);
      if ((localObject2 == null) || (localObject3 == null)) {
        break label456;
      }
      k = 0;
      j = i;
      i = k;
      while (i < localObject2.length)
      {
        k = j;
        if (i < localObject3.length)
        {
          aK(localObject3[i] + j, localObject2[i]);
          k = j + 1;
        }
        i += 1;
        j = k;
      }
      this.wQx = new HashMap();
      break;
      label416:
      this.wQy = new SparseArray();
      break label73;
      label430:
      this.wQw = Integer.MAX_VALUE;
      break label197;
      label439:
      this.wQs = Integer.MAX_VALUE;
    }
    ((Cursor)localObject1).getCount();
    for (;;)
    {
      label456:
      w.d("MicroMsg.AlphabetContactAdapter", "headerPosMap=%s", new Object[] { this.wQx.toString() });
      this.hqX = new MergeCursor((Cursor[])localArrayList.toArray(new Cursor[0]));
      notifyDataSetChanged();
      GMTrace.o(1761876115456L, 13127);
      return;
      label516:
      if (this.wQq.wQE)
      {
        this.wQv = 0;
        j = 1;
        aK(this.wQv, "nonLimit");
      }
      if ((this.wQq.wQH) && (this.wQq.wQI != null))
      {
        localObject1 = bg.g(this.wQq.wQI.split(";"));
        com.tencent.mm.kernel.h.xz();
        localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().cl((List)localObject1);
        localArrayList.add(localObject1);
        i = ((Cursor)localObject1).getCount();
        if (i > 0)
        {
          this.wQr = j;
          i = j + (i + 1);
          aK(this.ooT, "↑");
          if (!this.wQq.wQA) {
            break label1072;
          }
          com.tencent.mm.kernel.h.xz();
          localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().cq(this.iVA);
          localArrayList.add(localObject1);
          j = ((Cursor)localObject1).getCount();
          if (j <= 0) {
            break label1066;
          }
          this.wQs = i;
          aK(this.wQs, "☆");
          i += j + 1;
          label732:
          com.tencent.mm.kernel.h.xz();
          localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK();
          localObject2 = this.wQq.wPl;
          localObject3 = this.iVA;
          if (this.wSS) {
            break label1075;
          }
        }
      }
      label1055:
      label1066:
      label1072:
      label1075:
      for (boolean bool = true;; bool = false)
      {
        localObject1 = ((ar)localObject1).a((String)localObject2, "", (List)localObject3, false, bool);
        localArrayList.add(localObject1);
        localObject2 = s.a(this.wQq.wPl, "", "", this.iVA);
        localObject3 = s.a(this.wQq.wPl, "", this.iVA, "");
        j = i;
        if (localObject2 == null) {
          break label1095;
        }
        j = i;
        if (localObject3 == null) {
          break label1095;
        }
        j = 0;
        int m;
        for (k = i; j < localObject2.length; k = m)
        {
          m = k;
          if (j < localObject3.length)
          {
            aK(localObject3[j] + k, localObject2[j]);
            m = k + 1;
          }
          j += 1;
        }
        this.wQr = Integer.MAX_VALUE;
        i = j;
        break;
        i = j;
        if (!this.wQq.wQz) {
          break;
        }
        localObject1 = g.cT(this.iVA);
        if (((List)localObject1).size() == 0) {
          com.tencent.mm.kernel.h.xz();
        }
        for (localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().aOp();; localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().cl((List)localObject1))
        {
          localArrayList.add(localObject1);
          i = ((Cursor)localObject1).getCount();
          if (i <= 0) {
            break label1055;
          }
          this.ooT = j;
          i = j + (i + 1);
          aK(this.ooT, "↑");
          break;
          com.tencent.mm.kernel.h.xz();
        }
        this.ooT = Integer.MAX_VALUE;
        i = j;
        break;
        this.wQs = Integer.MAX_VALUE;
        break label732;
      }
      j = i + (((Cursor)localObject1).getCount() + localObject2.length);
      label1095:
      i = j;
      if (this.wQq.wQB)
      {
        com.tencent.mm.kernel.h.xz();
        localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().b("@all.chatroom.contact", "", this.iVA);
        localArrayList.add(localObject1);
        i = ((Cursor)localObject1).getCount();
        if (i <= 0) {
          break label1292;
        }
        this.wQt = j;
        i = j + (i + 1);
        aK(this.wQt, this.wSB.getActivity().getString(a.h.cQO));
      }
      for (;;)
      {
        if (!this.wQq.wQC) {
          break label1301;
        }
        com.tencent.mm.kernel.h.xz();
        localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().b("@verify.contact", "", this.iVA);
        localArrayList.add(localObject1);
        if (((Cursor)localObject1).getCount() <= 0) {
          break label1303;
        }
        this.wQu = i;
        aK(this.wQu, this.wSB.getActivity().getString(a.h.oFM));
        break;
        label1292:
        this.wQt = Integer.MAX_VALUE;
        i = j;
      }
      label1301:
      continue;
      label1303:
      this.wQu = Integer.MAX_VALUE;
    }
  }
  
  public final int Wv(String paramString)
  {
    GMTrace.i(1762144550912L, 13129);
    if (paramString.equals("↑"))
    {
      GMTrace.o(1762144550912L, 13129);
      return 0;
    }
    if (this.wQx != null)
    {
      if (this.wQx.containsKey(paramString))
      {
        int i = ((Integer)this.wQx.get(paramString)).intValue();
        int j = this.wSB.bho().getHeaderViewsCount();
        GMTrace.o(1762144550912L, 13129);
        return i + j;
      }
      GMTrace.o(1762144550912L, 13129);
      return -1;
    }
    GMTrace.o(1762144550912L, 13129);
    return -1;
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    GMTrace.i(1762815639552L, 13134);
    ayE();
    notifyDataSetChanged();
    GMTrace.o(1762815639552L, 13134);
  }
  
  protected final boolean c(a parama)
  {
    GMTrace.i(1762949857280L, 13135);
    int j = parama.position + 1;
    int k = this.wQw;
    int m = this.wQr;
    int n = this.ooT;
    int i1 = this.wQs;
    int i2 = this.wQt;
    int i3 = this.wQu;
    int i = 0;
    while (i < 6)
    {
      if (j == new int[] { k, m, n, i1, i2, i3 }[i])
      {
        GMTrace.o(1762949857280L, 13135);
        return true;
      }
      i += 1;
    }
    if (this.wQy.indexOfKey(j) >= 0)
    {
      GMTrace.o(1762949857280L, 13135);
      return true;
    }
    GMTrace.o(1762949857280L, 13135);
    return false;
  }
  
  public final void finish()
  {
    GMTrace.i(1762681421824L, 13133);
    super.finish();
    w.i("MicroMsg.AlphabetContactAdapter", "finish!");
    if (this.hqX != null)
    {
      this.hqX.close();
      this.hqX = null;
    }
    com.tencent.mm.kernel.h.xz();
    ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().b(this);
    GMTrace.o(1762681421824L, 13133);
  }
  
  public final int getCount()
  {
    GMTrace.i(1762278768640L, 13130);
    int i = this.hqX.getCount();
    int j = this.wQx.size();
    GMTrace.o(1762278768640L, 13130);
    return i + j;
  }
  
  protected final a hG(int paramInt)
  {
    GMTrace.i(1762412986368L, 13131);
    Object localObject;
    if (paramInt == this.wQw)
    {
      localObject = aL(paramInt, this.wSB.getActivity().getString(a.h.oFO));
      GMTrace.o(1762412986368L, 13131);
      return (a)localObject;
    }
    if (paramInt == this.wQr)
    {
      localObject = aL(paramInt, this.wQq.wQJ);
      GMTrace.o(1762412986368L, 13131);
      return (a)localObject;
    }
    if (paramInt == this.ooT)
    {
      localObject = aL(paramInt, this.wSB.getActivity().getString(a.h.oFK));
      GMTrace.o(1762412986368L, 13131);
      return (a)localObject;
    }
    if (paramInt == this.wQs)
    {
      localObject = aL(paramInt, this.wSB.getActivity().getString(a.h.oFJ));
      GMTrace.o(1762412986368L, 13131);
      return (a)localObject;
    }
    if (paramInt == this.wQt)
    {
      localObject = aL(paramInt, this.wSB.getActivity().getString(a.h.cQO));
      GMTrace.o(1762412986368L, 13131);
      return (a)localObject;
    }
    if (paramInt == this.wQu)
    {
      localObject = aL(paramInt, this.wSB.getActivity().getString(a.h.oFM));
      GMTrace.o(1762412986368L, 13131);
      return (a)localObject;
    }
    if (paramInt == this.wQv)
    {
      localObject = new j(paramInt);
      GMTrace.o(1762412986368L, 13131);
      return (a)localObject;
    }
    if (this.wQy.indexOfKey(paramInt) >= 0)
    {
      localObject = aL(paramInt, (String)this.wQy.get(paramInt));
      GMTrace.o(1762412986368L, 13131);
      return (a)localObject;
    }
    int k = paramInt;
    int i = 0;
    int j;
    int m;
    do
    {
      j = i;
      if (i > this.wQy.size()) {
        break;
      }
      j = i;
      if (this.wQy.indexOfKey(k) >= 0) {
        j = i + 1;
      }
      m = k - 1;
      k = m;
      i = j;
    } while (m >= 0);
    i = paramInt - j;
    if (this.hqX.moveToPosition(i))
    {
      w.d("MicroMsg.AlphabetContactAdapter", "create contact item position=%d | index=%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
      localObject = new x();
      ((x)localObject).b(this.hqX);
      d locald = new d(paramInt);
      locald.iBi = ((x)localObject);
      locald.wSC = bhh();
      locald.wSD = this.wSD;
      GMTrace.o(1762412986368L, 13131);
      return locald;
    }
    w.i("MicroMsg.AlphabetContactAdapter", "create contact item error: position=%d | index=%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
    GMTrace.o(1762412986368L, 13131);
    return null;
  }
  
  public static final class a
  {
    public String wPl;
    public boolean wQA;
    public boolean wQB;
    public boolean wQC;
    public boolean wQD;
    public boolean wQE;
    public String wQF;
    public String wQG;
    public boolean wQH;
    public String wQI;
    public String wQJ;
    public boolean wQz;
    
    public a()
    {
      GMTrace.i(1746306859008L, 13011);
      this.wQz = false;
      this.wQA = false;
      this.wQB = false;
      this.wQC = false;
      this.wQD = false;
      this.wQE = false;
      this.wPl = "@all.contact.without.chatroom";
      this.wQH = false;
      this.wQI = "";
      this.wQJ = "";
      GMTrace.o(1746306859008L, 13011);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\contact\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */