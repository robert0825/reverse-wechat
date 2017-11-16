package com.tencent.mm.modelfriend;

import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.ad.n;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.be;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a
{
  public static final HashSet<b> gCb;
  private static final b gCc;
  public static Thread thread;
  
  static
  {
    GMTrace.i(4420058218496L, 32932);
    thread = null;
    gCb = new HashSet();
    gCc = new b()
    {
      public final void bu(boolean paramAnonymousBoolean)
      {
        GMTrace.i(4442606796800L, 33100);
        w.i("MicroMsg.AddrBookSyncHelper", "syncAddrBookAndUpload onSyncEnd suc:%b", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
        if (!paramAnonymousBoolean)
        {
          GMTrace.o(4442606796800L, 33100);
          return;
        }
        System.currentTimeMillis();
        aa localaa = new aa(m.Hv(), m.Hu());
        at.wS().a(localaa, 0);
        GMTrace.o(4442606796800L, 33100);
      }
    };
    GMTrace.o(4420058218496L, 32932);
  }
  
  public static boolean GO()
  {
    GMTrace.i(4419387129856L, 32927);
    boolean bool = a(gCc);
    GMTrace.o(4419387129856L, 32927);
    return bool;
  }
  
  public static boolean GP()
  {
    GMTrace.i(4419655565312L, 32929);
    boolean bool = a.gBW;
    GMTrace.o(4419655565312L, 32929);
    return bool;
  }
  
  public static boolean a(b paramb)
  {
    GMTrace.i(4419521347584L, 32928);
    long l = Thread.currentThread().getId();
    boolean bool = m.Hr();
    if (!bool)
    {
      w.e("MicroMsg.AddrBookSyncHelper", "canSync:%b, skip", new Object[] { Boolean.valueOf(bool) });
      GMTrace.o(4419521347584L, 32928);
      return false;
    }
    com.tencent.mm.sdk.platformtools.af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(4422742573056L, 32952);
        if ((a.thread != null) && (a.thread.isAlive())) {}
        for (boolean bool = true;; bool = false)
        {
          w.i("MicroMsg.AddrBookSyncHelper", "syncAddrBook running:%b setSize:%d call:%d callback:%s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(a.gCb.size()), Long.valueOf(this.gCd), this.gCe });
          a.gCb.add(this.gCe);
          if (!bool) {
            break;
          }
          GMTrace.o(4422742573056L, 32952);
          return;
        }
        a.thread = e.d(new a.a(), "AddrBookSyncHelper_addrBookRead", 1);
        m.Hl();
        a.thread.start();
        GMTrace.o(4422742573056L, 32952);
      }
    });
    GMTrace.o(4419521347584L, 32928);
    return true;
  }
  
  private static final class a
    implements Runnable
  {
    public static boolean gBW;
    private static byte[] gCf;
    private static final ae gCl;
    private List<String[]> gCg;
    private List<String[]> gCh;
    private List<b> gCi;
    private List<b> gCj;
    private be gCk;
    
    static
    {
      GMTrace.i(4430795636736L, 33012);
      gBW = false;
      gCf = new byte[0];
      gCl = new ae(Looper.getMainLooper())
      {
        public final void handleMessage(Message paramAnonymousMessage)
        {
          GMTrace.i(4449854554112L, 33154);
          if (!at.AU())
          {
            GMTrace.o(4449854554112L, 33154);
            return;
          }
          g.a locala = new g.a();
          int i = a.gCb.size();
          boolean bool = Boolean.parseBoolean(paramAnonymousMessage.obj.toString());
          paramAnonymousMessage = a.gCb.iterator();
          while (paramAnonymousMessage.hasNext()) {
            ((a.b)paramAnonymousMessage.next()).bu(bool);
          }
          a.gCb.clear();
          w.i("MicroMsg.AddrBookSyncHelper", "callBackHandler setSize:%d time:%d", new Object[] { Integer.valueOf(i), Long.valueOf(locala.tD()) });
          GMTrace.o(4449854554112L, 33154);
        }
      };
      GMTrace.o(4430795636736L, 33012);
    }
    
    public a()
    {
      GMTrace.i(4429990330368L, 33006);
      GMTrace.o(4429990330368L, 33006);
    }
    
    private static void GQ()
    {
      GMTrace.i(4430392983552L, 33009);
      be localbe = new be("MicroMsg.AddrBookSyncHelper", "delete");
      ArrayList localArrayList = new ArrayList();
      List localList = com.tencent.mm.pluginsdk.a.dE(ab.getContext());
      Iterator localIterator = af.If().He().iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (String[])localIterator.next();
        String str = bg.nl(localObject[0]);
        localObject = bg.nl(localObject[1]);
        if ((!str.equals("")) && (!localList.contains(str))) {
          localArrayList.add(localObject);
        }
      }
      if (localArrayList.size() > 0)
      {
        af.If().B(localArrayList);
        m.D(localArrayList);
      }
      localbe.addSplit("end");
      localbe.dumpToLog();
      GMTrace.o(4430392983552L, 33009);
    }
    
    private static List<b> a(int paramInt, List<String[]> paramList)
    {
      GMTrace.i(4430527201280L, 33010);
      if (paramList == null)
      {
        w.e("MicroMsg.AddrBookSyncHelper", "sync address book failed, null info list");
        paramList = new LinkedList();
        GMTrace.o(4430527201280L, 33010);
        return paramList;
      }
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
      {
        paramList = (String[])localIterator.next();
        if (paramList != null)
        {
          String str1 = paramList[0];
          String str2 = paramList[1];
          String str3 = paramList[2];
          String str4 = paramList[3];
          long l = bg.Sz(paramList[4]);
          if ((str3 != null) && (!str3.equals("")))
          {
            paramList = "";
            if (paramInt == 1) {
              paramList = g.n(str3.getBytes());
            }
            if (paramInt == 0)
            {
              paramList = com.tencent.mm.pluginsdk.a.Fp(str3);
              if (bg.nm(paramList)) {
                w.d("MicroMsg.AddrBookSyncHelper", "formatted mobile null, continue");
              } else {
                paramList = g.n(paramList.getBytes());
              }
            }
            else
            {
              b localb = new b();
              localb.fTy = str2;
              localb.gCo = com.tencent.mm.platformtools.c.nc(str2);
              localb.gCp = com.tencent.mm.platformtools.c.nb(str2);
              localb.gCm = str1;
              localb.gsO = str4;
              localb.jI(paramList);
              localb.gCP = l;
              localb.gCv = localb.ux();
              if (paramInt == 1) {
                localb.fjd = str3;
              }
              if (paramInt == 0) {
                localb.gCs = str3;
              }
              localb.type = paramInt;
              localb.eQl = 1095798;
              localArrayList.add(localb);
            }
          }
        }
      }
      GMTrace.o(4430527201280L, 33010);
      return localArrayList;
    }
    
    private static List<b> a(List<b> paramList, int paramInt1, int paramInt2)
    {
      GMTrace.i(4430124548096L, 33007);
      LinkedList localLinkedList = new LinkedList();
      while (paramInt1 < paramInt2)
      {
        localLinkedList.add(paramList.get(paramInt1));
        paramInt1 += 1;
      }
      GMTrace.o(4430124548096L, 33007);
      return localLinkedList;
    }
    
    public final void run()
    {
      GMTrace.i(4430258765824L, 33008);
      synchronized (gCf)
      {
        this.gCk = new be("MicroMsg.AddrBookSyncHelper", "sync addrBook");
        this.gCk.addSplit("sync begin");
        w.d("MicroMsg.AddrBookSyncHelper", "reading email info");
        this.gCg = com.tencent.mm.pluginsdk.a.dD(ab.getContext());
        if (this.gCg != null) {
          w.i("MicroMsg.AddrBookSyncHelper", "sync address book email size: " + this.gCg.size());
        }
        this.gCj = a(1, this.gCg);
        w.d("MicroMsg.AddrBookSyncHelper", "reading mobile info");
        this.gCh = com.tencent.mm.pluginsdk.a.dB(ab.getContext());
        if (this.gCh != null) {
          w.i("MicroMsg.AddrBookSyncHelper", "sync address book mobile size: " + this.gCh.size());
        }
        this.gCi = a(0, this.gCh);
        w.d("MicroMsg.AddrBookSyncHelper", "reading done, begin sync to addr_upload");
        if ((this.gCg != null) && (this.gCj.size() > 0))
        {
          i = 0;
          if (i < this.gCj.size())
          {
            w.i("MicroMsg.AddrBookSyncHelper", "sync email index: " + i);
            if (i + 100 < this.gCj.size()) {}
            for (localObject1 = a(this.gCj, i, i + 100);; localObject1 = a(this.gCj, i, this.gCj.size()))
            {
              w.i("MicroMsg.AddrBookSyncHelper", "sync email listToSync size: " + ((List)localObject1).size());
              m.E((List)localObject1);
              i += 100;
              break;
            }
          }
        }
        if ((this.gCi == null) || (this.gCi.size() == 0))
        {
          w.i("MicroMsg.AddrBookSyncHelper", "mobile list null stop service");
          localObject1 = gCl.obtainMessage();
          ((Message)localObject1).obj = Boolean.valueOf(false);
          gCl.sendMessage((Message)localObject1);
          GMTrace.o(4430258765824L, 33008);
          return;
        }
        int i = 0;
        if (i < this.gCi.size())
        {
          w.i("MicroMsg.AddrBookSyncHelper", "sync mobile index: " + i);
          if (!at.AU())
          {
            w.i("MicroMsg.AddrBookSyncHelper", "account not ready, stop sync");
            localObject1 = gCl.obtainMessage();
            ((Message)localObject1).obj = Boolean.valueOf(false);
            gCl.sendMessage((Message)localObject1);
            GMTrace.o(4430258765824L, 33008);
            return;
          }
          if (i + 100 < this.gCi.size()) {}
          for (localObject1 = a(this.gCi, i, i + 100);; localObject1 = a(this.gCi, i, this.gCi.size()))
          {
            w.i("MicroMsg.AddrBookSyncHelper", "sync mobile listToSync size: " + ((List)localObject1).size());
            m.E((List)localObject1);
            i += 100;
            break;
          }
        }
        w.i("MicroMsg.AddrBookSyncHelper", "sync ok");
        if (!at.AU())
        {
          w.i("MicroMsg.AddrBookSyncHelper", "account not ready, exit");
          localObject1 = gCl.obtainMessage();
          ((Message)localObject1).obj = Boolean.valueOf(false);
          gCl.sendMessage((Message)localObject1);
          GMTrace.o(4430258765824L, 33008);
          return;
        }
        GQ();
        System.currentTimeMillis();
        this.gCk.addSplit("sync ok");
        this.gCk.dumpToLog();
        Object localObject1 = gCl.obtainMessage();
        ((Message)localObject1).obj = Boolean.valueOf(true);
        gCl.sendMessage((Message)localObject1);
        GMTrace.o(4430258765824L, 33008);
        return;
      }
    }
  }
  
  public static abstract interface b
  {
    public abstract void bu(boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelfriend\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */