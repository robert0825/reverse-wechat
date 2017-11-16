package com.tencent.mm.plugin.offline.a;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.sp;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.offline.g;
import com.tencent.mm.plugin.offline.i;
import com.tencent.mm.plugin.offline.k;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class r
{
  private List<WeakReference<a>> jwK;
  public b nBg;
  private HashSet<String> nBh;
  public ArrayList<Long> nyu;
  
  public r()
  {
    GMTrace.i(6189987397632L, 46119);
    this.jwK = new ArrayList();
    this.nBg = null;
    this.nyu = new ArrayList();
    this.nBh = new HashSet();
    Object localObject = com.tencent.mm.plugin.offline.c.a.aWb();
    if (!TextUtils.isEmpty((CharSequence)localObject))
    {
      localObject = bh.q((String)localObject, "sysmsg");
      if (localObject != null)
      {
        int i = bg.getInt((String)((Map)localObject).get(".sysmsg.paymsg.PayMsgType"), -1);
        if ((i >= 0) && (i == 4))
        {
          w.i("MicroMsg.WalletOfflineMsgManager", "msg type is 4 ");
          b(D((Map)localObject));
        }
      }
    }
    this.nyu.clear();
    GMTrace.o(6189987397632L, 46119);
  }
  
  private b D(Map<String, String> paramMap)
  {
    GMTrace.i(6190524268544L, 46123);
    if (this.nBg == null) {
      this.nBg = new b();
    }
    this.nBg.nBn = bg.getInt((String)paramMap.get(".sysmsg.paymsg.PayMsgType"), -1);
    this.nBg.nBk = ((String)paramMap.get(".sysmsg.paymsg.isfreeze"));
    this.nBg.nBl = ((String)paramMap.get(".sysmsg.paymsg.freezetype"));
    this.nBg.nBm = ((String)paramMap.get(".sysmsg.paymsg.freezemsg"));
    paramMap = this.nBg;
    GMTrace.o(6190524268544L, 46123);
    return paramMap;
  }
  
  private void b(c paramc)
  {
    GMTrace.i(6190121615360L, 46120);
    if (this.jwK == null)
    {
      GMTrace.o(6190121615360L, 46120);
      return;
    }
    int i = 0;
    while (i < this.jwK.size())
    {
      Object localObject = (WeakReference)this.jwK.get(i);
      if (localObject != null)
      {
        localObject = (a)((WeakReference)localObject).get();
        if ((localObject != null) && (((a)localObject).a(paramc))) {
          break;
        }
      }
      i += 1;
    }
    GMTrace.o(6190121615360L, 46120);
  }
  
  public final void Ee(String paramString)
  {
    GMTrace.i(15374238089216L, 114547);
    com.tencent.mm.plugin.offline.c.a.Eq("");
    com.tencent.mm.plugin.offline.c.a.Es("");
    com.tencent.mm.plugin.offline.c.a.Er("");
    ??? = bh.q(paramString, "sysmsg");
    if (??? == null)
    {
      GMTrace.o(15374238089216L, 114547);
      return;
    }
    int i = bg.getInt((String)((Map)???).get(".sysmsg.paymsg.PayMsgType"), -1);
    String str = (String)((Map)???).get(".sysmsg.paymsg.req_key");
    com.tencent.mm.plugin.offline.c.a.Eq((String)((Map)???).get(".sysmsg.paymsg.ack_key"));
    com.tencent.mm.plugin.offline.c.a.sm(i);
    com.tencent.mm.plugin.offline.c.a.Er(str);
    i = bg.getInt((String)((Map)???).get(".sysmsg.paymsg.PayMsgType"), -1);
    w.i("MicroMsg.WalletOfflineMsgManager", "msg type is " + i);
    w.v("MicroMsg.WalletOfflineMsgManager", "msg type is type %d xml %s", new Object[] { Integer.valueOf(i), paramString });
    if ((i >= 0) && (i == 4))
    {
      b(D((Map)???));
      com.tencent.mm.plugin.offline.c.a.Eh(paramString);
      GMTrace.o(15374238089216L, 114547);
      return;
    }
    if ((i >= 0) && (i == 5))
    {
      paramString = new e();
      paramString.nBn = bg.getInt((String)((Map)???).get(".sysmsg.paymsg.PayMsgType"), -1);
      paramString.nBo = ((String)((Map)???).get(".sysmsg.paymsg.cftretcode"));
      paramString.nBp = ((String)((Map)???).get(".sysmsg.paymsg.cftretmsg"));
      paramString.nBq = ((String)((Map)???).get(".sysmsg.paymsg.wxretcode"));
      paramString.nBr = ((String)((Map)???).get(".sysmsg.paymsg.wxretmsg"));
      paramString.nBs = ((String)((Map)???).get(".sysmsg.paymsg.error_detail_url"));
      b(paramString);
      GMTrace.o(15374238089216L, 114547);
      return;
    }
    if ((i >= 0) && (i == 6))
    {
      paramString = (String)((Map)???).get(".sysmsg.paymsg.transid");
      w.i("helios", "MSG_TYPE_ORDER trasid=" + paramString);
      if (!bg.nm(paramString))
      {
        h.xz();
        h.xy().xh().a(w.a.vvj, Boolean.valueOf(true));
      }
      paramString = new f();
      paramString.nBn = bg.getInt((String)((Map)???).get(".sysmsg.paymsg.PayMsgType"), -1);
      paramString.nBt = ((String)((Map)???).get(".sysmsg.paymsg.transid"));
      paramString.nBu = com.tencent.mm.plugin.offline.c.a.E((Map)???);
      if (paramString.nBu.rhv.size() > 0) {
        com.tencent.mm.plugin.offline.c.a.Es(((Orders.Commodity)paramString.nBu.rhv.get(0)).eRP);
      }
      if (((Map)???).containsKey(".sysmsg.paymsg.real_name_info")) {
        paramString.eXW = new h((Map)???);
      }
      b(paramString);
      GMTrace.o(15374238089216L, 114547);
      return;
    }
    if ((i >= 0) && (i == 7))
    {
      com.tencent.mm.plugin.wallet_core.model.n.byx().ayE();
      GMTrace.o(15374238089216L, 114547);
      return;
    }
    if ((i >= 0) && (i == 8))
    {
      paramString = new g();
      paramString.nBn = bg.getInt((String)((Map)???).get(".sysmsg.paymsg.PayMsgType"), -1);
      paramString.nBv = ((String)((Map)???).get(".sysmsg.paymsg.good_name"));
      paramString.nBw = ((String)((Map)???).get(".sysmsg.paymsg.total_fee"));
      paramString.eJQ = ((String)((Map)???).get(".sysmsg.paymsg.req_key"));
      paramString.id = ((String)((Map)???).get(".sysmsg.paymsg.id"));
      ??? = (String)((Map)???).get(".sysmsg.paymsg.confirm_type");
      w.i("MicroMsg.WalletOfflineMsgManager", "msg confirm_type is" + paramString.nBx);
      if ((!TextUtils.isEmpty((CharSequence)???)) && (((String)???).equals("1"))) {}
      for (paramString.nBx = 1;; paramString.nBx = 0)
      {
        b(paramString);
        GMTrace.o(15374238089216L, 114547);
        return;
      }
    }
    if ((i >= 0) && (i == 10))
    {
      k.aVi();
      k.aVl().cG(4, 4);
      GMTrace.o(15374238089216L, 114547);
      return;
    }
    if ((i >= 0) && (i == 20))
    {
      paramString = new sp();
      paramString.eXV.eXW = new h((Map)???);
      com.tencent.mm.sdk.b.a.vgX.m(paramString);
      GMTrace.o(15374238089216L, 114547);
      return;
    }
    if ((i >= 0) && (i == 23))
    {
      paramString = new d();
      paramString.nBn = bg.getInt((String)((Map)???).get(".sysmsg.paymsg.PayMsgType"), -1);
      paramString.eJQ = ((String)((Map)???).get(".sysmsg.paymsg.req_key"));
      synchronized (this.nBh)
      {
        if (this.nBh.contains(paramString.eJQ))
        {
          w.i("MicroMsg.WalletOfflineMsgManager", "pass this msg %s", new Object[] { paramString.eJQ });
          GMTrace.o(15374238089216L, 114547);
          return;
        }
        this.nBh.add(paramString.eJQ);
        b(paramString);
        GMTrace.o(15374238089216L, 114547);
        return;
      }
    }
    if ((i >= 0) && (i == 24))
    {
      paramString = new d();
      paramString.nBn = bg.getInt((String)((Map)???).get(".sysmsg.paymsg.PayMsgType"), -1);
      paramString.eJQ = ((String)((Map)???).get(".sysmsg.paymsg.req_key"));
      b(paramString);
      GMTrace.o(15374238089216L, 114547);
      return;
    }
    GMTrace.o(15374238089216L, 114547);
  }
  
  public final void a(a parama)
  {
    GMTrace.i(6190255833088L, 46121);
    if (this.jwK == null) {
      this.jwK = new ArrayList();
    }
    if (parama != null) {
      this.jwK.add(new WeakReference(parama));
    }
    GMTrace.o(6190255833088L, 46121);
  }
  
  public final void ak(String paramString, final boolean paramBoolean)
  {
    GMTrace.i(19264136282112L, 143529);
    int i = bg.getInt((String)bh.q(paramString, "sysmsg").get(".sysmsg.paymsg.PayMsgType"), -1);
    paramString = new HashSet();
    paramString.add(Integer.valueOf(g.nzH));
    paramString.add(Integer.valueOf(g.nzG));
    paramString.add(Integer.valueOf(g.nzI));
    paramString.add(Integer.valueOf(g.nzF));
    paramString.add(Integer.valueOf(g.nzC));
    if (paramString.contains(Integer.valueOf(i))) {
      h.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(16593471930368L, 123631);
          w.v("MicroMsg.WalletOfflineMsgManager", "DO NetSceneOfflineAckMsg");
          h.xz();
          h.xx().fYr.a(new b(paramBoolean), 0);
          GMTrace.o(16593471930368L, 123631);
        }
      });
    }
    GMTrace.o(19264136282112L, 143529);
  }
  
  public final void b(a parama)
  {
    GMTrace.i(6190390050816L, 46122);
    if ((this.jwK == null) || (parama == null))
    {
      GMTrace.o(6190390050816L, 46122);
      return;
    }
    int i = 0;
    while (i < this.jwK.size())
    {
      WeakReference localWeakReference = (WeakReference)this.jwK.get(i);
      if (localWeakReference != null)
      {
        a locala = (a)localWeakReference.get();
        if ((locala != null) && (locala.equals(parama)))
        {
          this.jwK.remove(localWeakReference);
          GMTrace.o(6190390050816L, 46122);
          return;
        }
      }
      i += 1;
    }
    GMTrace.o(6190390050816L, 46122);
  }
  
  public final boolean dc(long paramLong)
  {
    GMTrace.i(16593069277184L, 123628);
    if ((this.nyu == null) || (this.nyu.size() == 0))
    {
      w.e("MicroMsg.WalletOfflineMsgManager", "mMsgIdList is null or size == 0");
      GMTrace.o(16593069277184L, 123628);
      return false;
    }
    int i = 0;
    while (i < this.nyu.size())
    {
      if (((Long)this.nyu.get(i)).longValue() == paramLong)
      {
        GMTrace.o(16593069277184L, 123628);
        return true;
      }
      i += 1;
    }
    GMTrace.o(16593069277184L, 123628);
    return false;
  }
  
  public static abstract interface a
  {
    public abstract boolean a(r.c paramc);
  }
  
  public final class b
    extends r.c
  {
    public String nBk;
    public String nBl;
    public String nBm;
    
    public b()
    {
      super();
      GMTrace.i(6199516856320L, 46190);
      GMTrace.o(6199516856320L, 46190);
    }
  }
  
  public class c
  {
    public int nBn;
    
    public c()
    {
      GMTrace.i(6192805969920L, 46140);
      GMTrace.o(6192805969920L, 46140);
    }
  }
  
  public final class d
    extends r.c
  {
    public String eJQ;
    
    public d()
    {
      super();
      GMTrace.i(6198845767680L, 46185);
      GMTrace.o(6198845767680L, 46185);
    }
  }
  
  public final class e
    extends r.c
  {
    public String nBo;
    public String nBp;
    public String nBq;
    public String nBr;
    public String nBs;
    
    public e()
    {
      super();
      GMTrace.i(6196161413120L, 46165);
      GMTrace.o(6196161413120L, 46165);
    }
  }
  
  public final class f
    extends r.c
  {
    public r.h eXW;
    public String nBt;
    public Orders nBu;
    
    public f()
    {
      super();
      GMTrace.i(6196295630848L, 46166);
      GMTrace.o(6196295630848L, 46166);
    }
  }
  
  public final class g
    extends r.c
  {
    public String eJQ;
    public String id;
    public String nBv;
    public String nBw;
    public int nBx;
    
    public g()
    {
      super();
      GMTrace.i(6192671752192L, 46139);
      GMTrace.o(6192671752192L, 46139);
    }
  }
  
  public final class h
  {
    public String eXD;
    public String eXE;
    public String eXF;
    public String eXG;
    public String eXH;
    public boolean nBy;
    
    public h()
    {
      GMTrace.i(15375580266496L, 114557);
      Object localObject;
      this.eXD = ((String)((Map)localObject).get(".sysmsg.paymsg.guide_flag"));
      this.eXE = ((String)((Map)localObject).get(".sysmsg.paymsg.guide_wording"));
      this.eXF = ((String)((Map)localObject).get(".sysmsg.paymsg.left_button_wording"));
      this.eXG = ((String)((Map)localObject).get(".sysmsg.paymsg.right_button_wording"));
      this.eXH = ((String)((Map)localObject).get(".sysmsg.paymsg.upload_credit_url"));
      if ("1".equals(((Map)localObject).get(".sysmsg.paymsg.guide_block"))) {}
      for (boolean bool = true;; bool = false)
      {
        this.nBy = bool;
        GMTrace.o(15375580266496L, 114557);
        return;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\offline\a\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */