package com.tencent.mm.bd;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.a;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.ad.n;
import com.tencent.mm.ad.n.4;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.bnz;
import com.tencent.mm.protocal.c.bob;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

public final class b
  extends a
  implements k
{
  private com.tencent.mm.ad.e fUd;
  private String filename;
  private int gVS;
  private boolean hdn;
  private int heG;
  g heH;
  private boolean heI;
  private boolean heJ;
  private int heK;
  private azq heL;
  private String[] heM;
  private int heN;
  private ae heO;
  private int retCode;
  
  public b(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(14690801418240L, 109455);
    this.retCode = 0;
    this.heG = 120;
    this.hdn = false;
    this.heI = false;
    this.heJ = false;
    this.gVS = 0;
    this.heK = 0;
    this.filename = null;
    this.heL = null;
    this.heM = new String[0];
    this.heN = 3960;
    this.heO = new ae(h.xB().ngv.getLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(4381537730560L, 32645);
        if (paramAnonymousMessage.what != 291)
        {
          GMTrace.o(4381537730560L, 32645);
          return;
        }
        if (b.this.NW()) {
          h.wS().a(b.this, 0);
        }
        GMTrace.o(4381537730560L, 32645);
      }
    };
    this.filename = paramString1;
    this.heH = new g(paramString2);
    this.heL = new azq().Rq(paramString3);
    w.i("MicroMsg.NetSceneNewVoiceInput", "NetSceneNewVoiceInput filename:%s,session:%s,vadVersion:%s", new Object[] { paramString1, paramString2, paramString3 });
    GMTrace.o(14690801418240L, 109455);
  }
  
  private void NY()
  {
    GMTrace.i(4398314946560L, 32770);
    w.d("MicroMsg.NetSceneNewVoiceInput", com.tencent.mm.compatible.util.g.tC());
    if (this.heO != null) {
      this.heO.removeMessages(291);
    }
    this.heI = true;
    GMTrace.o(4398314946560L, 32770);
  }
  
  protected final boolean DG()
  {
    GMTrace.i(4397912293376L, 32767);
    GMTrace.o(4397912293376L, 32767);
    return true;
  }
  
  public final void NS()
  {
    GMTrace.i(4396570116096L, 32757);
    this.hdn = true;
    GMTrace.o(4396570116096L, 32757);
  }
  
  public final String[] NT()
  {
    GMTrace.i(4396704333824L, 32758);
    String[] arrayOfString = this.heM;
    GMTrace.o(4396704333824L, 32758);
    return arrayOfString;
  }
  
  public final long NU()
  {
    GMTrace.i(4396838551552L, 32759);
    GMTrace.o(4396838551552L, 32759);
    return 0L;
  }
  
  public final Set<String> NV()
  {
    GMTrace.i(4396972769280L, 32760);
    g localg = this.heH;
    HashSet localHashSet = new HashSet();
    localg.hfu.readLock().lock();
    Iterator localIterator = localg.hft.values().iterator();
    while (localIterator.hasNext())
    {
      g.a locala = (g.a)localIterator.next();
      if (locala.hfx) {
        localHashSet.add(locala.hfw);
      }
    }
    localg.hfu.readLock().unlock();
    GMTrace.o(4396972769280L, 32760);
    return localHashSet;
  }
  
  public final boolean NW()
  {
    GMTrace.i(4397241204736L, 32762);
    w.d("MicroMsg.NetSceneNewVoiceInput", "preDoScene");
    this.heO.removeMessages(291);
    if (((this.heH.Oi()) && (this.hdn)) || (this.heI))
    {
      w.i("MicroMsg.NetSceneNewVoiceInput", "preDoScene return");
      GMTrace.o(4397241204736L, 32762);
      return false;
    }
    g.a locala = this.heH.ht(this.gVS);
    if (locala != null)
    {
      int i = com.tencent.mm.a.e.aY(this.filename);
      int j = Math.min(i, locala.hfz);
      w.d("MicroMsg.NetSceneNewVoiceInput", "fileLength %s info.voiceFileMark %s nowMarkLen %s", new Object[] { Integer.valueOf(i), Integer.valueOf(locala.hfz), Integer.valueOf(j) });
      if (j <= 0)
      {
        w.e("MicroMsg.NetSceneNewVoiceInput", "nowMarkLen <= 0 read failed :%s", new Object[] { this.filename });
        this.retCode = (com.tencent.mm.compatible.util.g.tA() + 40000);
        this.heK = 0;
        NX();
        this.fUd.a(3, -1, "ReadFileLengthError", null);
        GMTrace.o(4397241204736L, 32762);
        return false;
      }
      this.heK = (j - this.gVS);
      if (this.heK < 0)
      {
        w.i("MicroMsg.NetSceneNewVoiceInput", "canReadLen < 0 length:%s ", new Object[] { Integer.valueOf(this.heK) });
        this.retCode = (com.tencent.mm.compatible.util.g.tA() + 40000);
        this.heO.sendEmptyMessageDelayed(291, this.heG * 2);
        GMTrace.o(4397241204736L, 32762);
        return false;
      }
      w.d("MicroMsg.NetSceneNewVoiceInput", "can read length : %s,reqSeq:%s,interval:%s", new Object[] { Integer.valueOf(this.heK), Integer.valueOf(locala.hfA), Integer.valueOf(this.heG) });
      if ((this.heK < 500) && (locala.hfA > 5))
      {
        w.d("MicroMsg.NetSceneNewVoiceInput", "can read length : %s double interval", new Object[] { Integer.valueOf(this.heK) });
        this.heO.sendEmptyMessageDelayed(291, this.heG * 2);
      }
      for (;;)
      {
        GMTrace.o(4397241204736L, 32762);
        return true;
        this.heO.sendEmptyMessageDelayed(291, this.heG);
      }
    }
    this.heO.sendEmptyMessageDelayed(291, this.heG * 2);
    GMTrace.o(4397241204736L, 32762);
    return true;
  }
  
  public final void NX()
  {
    GMTrace.i(4398180728832L, 32769);
    w.d("MicroMsg.NetSceneNewVoiceInput", com.tencent.mm.compatible.util.g.tC());
    if (this.heJ)
    {
      GMTrace.o(4398180728832L, 32769);
      return;
    }
    this.heJ = true;
    NY();
    final Object localObject = h.wS();
    int i = hashCode();
    w.k("MicroMsg.NetSceneQueue", "cancelAllImp sceneHashCode:%d", new Object[] { Integer.valueOf(i) });
    ((n)localObject).gut.A(new n.4((n)localObject, i));
    localObject = this.heH.ht(this.gVS);
    if (localObject != null)
    {
      this.heK = 0;
      h.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(4391335624704L, 32718);
          w.i("MicroMsg.NetSceneNewVoiceInput", "real doLastScene voiceId:%s, voiceFileMarkEnd:%s,hashCode:%s", new Object[] { localObject.hfw, Integer.valueOf(localObject.hfz), Integer.valueOf(b.this.hashCode()) });
          h.wS().a(b.this, 0);
          GMTrace.o(4391335624704L, 32718);
        }
      });
    }
    GMTrace.o(4398180728832L, 32769);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(4397375422464L, 32763);
    this.fUd = parame1;
    parame1 = new b.a();
    parame1.gtF = new bnz();
    parame1.gtG = new bob();
    parame1.uri = "/cgi-bin/micromsg-bin/voicetrans";
    parame1.gtE = 235;
    parame1.gtH = 381;
    parame1.gtI = 1000000381;
    parame1 = parame1.DA();
    parame1.DC().tKn = false;
    Object localObject1 = (bnz)parame1.gtC.gtK;
    Object localObject2 = this.heH.ht(this.gVS);
    if (localObject2 == null)
    {
      ((bnz)localObject1).ues = new azp();
      ((bnz)localObject1).tWu = this.gVS;
      ((bnz)localObject1).uVD = "0";
      ((bnz)localObject1).tTL = 1;
      ((bnz)localObject1).uVF = 2;
      ((bnz)localObject1).tWZ = 0;
      ((bnz)localObject1).uXL = this.heH.Og();
      if (((bnz)localObject1).uXL == null) {}
      for (i = 0;; i = ((bnz)localObject1).uXL.size())
      {
        ((bnz)localObject1).uXK = i;
        ((bnz)localObject1).uNe = this.heL;
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("[");
        localObject1 = ((bnz)localObject1).uXL.iterator();
        while (((Iterator)localObject1).hasNext()) {
          ((StringBuilder)localObject2).append(((azq)((Iterator)localObject1).next()).uNR).append(", ");
        }
      }
      ((StringBuilder)localObject2).append("]");
      w.d("MicroMsg.NetSceneNewVoiceInput", "send empty packet fetch %s time %s", new Object[] { ((StringBuilder)localObject2).toString(), Long.valueOf(System.currentTimeMillis()) });
      i = a(parame, parame1, this);
      GMTrace.o(4397375422464L, 32763);
      return i;
    }
    ((g.a)localObject2).hfx = true;
    if (this.heJ)
    {
      ((g.a)localObject2).hfy = true;
      ((bnz)localObject1).ues = new azp();
      w.i("MicroMsg.NetSceneNewVoiceInput", "send last packet");
      ((bnz)localObject1).tWu = this.gVS;
      ((bnz)localObject1).uVD = ((g.a)localObject2).hfw;
      if (!((g.a)localObject2).hfy) {
        break label806;
      }
      i = 1;
      label405:
      ((bnz)localObject1).tTL = i;
      ((bnz)localObject1).uVF = 2;
      i = ((g.a)localObject2).hfA + 1;
      ((g.a)localObject2).hfA = i;
      ((bnz)localObject1).tWZ = i;
      ((bnz)localObject1).uXL = this.heH.Og();
      if (((bnz)localObject1).uXL != null) {
        break label811;
      }
    }
    label806:
    label811:
    for (int i = 0;; i = ((bnz)localObject1).uXL.size())
    {
      ((bnz)localObject1).uXK = i;
      ((bnz)localObject1).uNe = this.heL;
      w.d("MicroMsg.NetSceneNewVoiceInput", "%s, read filename: %s, voiceFileMarkEnd: %s, oldReadOffset: %s, canReadLen %s, getILen %s, isRequestEnd: %s, Seq %s, FetchVoiceIds %s, VadVersion %s", new Object[] { com.tencent.mm.compatible.util.g.tC(), this.filename, Integer.valueOf(((g.a)localObject2).hfz), Integer.valueOf(this.gVS), Integer.valueOf(this.heK), Integer.valueOf(((bnz)localObject1).ues.uNN), Boolean.valueOf(((g.a)localObject2).hfy), Integer.valueOf(((bnz)localObject1).tWZ), ((bnz)localObject1).uXL, ((bnz)localObject1).uNe });
      i = this.gVS;
      this.gVS = (((bnz)localObject1).ues.uNN + i);
      w.i("MicroMsg.NetSceneNewVoiceInput", "clientId %s oldReadOffset %s", new Object[] { ((g.a)localObject2).hfw, Integer.valueOf(this.gVS) });
      if (((g.a)localObject2).hfA == 1) {
        w.i("MicroMsg.NetSceneNewVoiceInput", "time flee send seq 1 time = %s", new Object[] { Long.valueOf(System.currentTimeMillis()) });
      }
      w.d("MicroMsg.NetSceneNewVoiceInput", "send dispatch packet time %s", new Object[] { Long.valueOf(System.currentTimeMillis()) });
      i = a(parame, parame1, this);
      GMTrace.o(4397375422464L, 32763);
      return i;
      if (this.heK > this.heN) {
        this.heK = this.heN;
      }
      for (((g.a)localObject2).hfy = false;; ((g.a)localObject2).hfy = true) {
        do
        {
          byte[] arrayOfByte = com.tencent.mm.a.e.c(this.filename, this.gVS, this.heK);
          ((bnz)localObject1).ues = new azp().be(arrayOfByte);
          break;
        } while ((this.heK > this.heN) || ((((g.a)localObject2).hfz == Integer.MAX_VALUE) && (!this.hdn)));
      }
      i = 0;
      break label405;
    }
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(4397509640192L, 32764);
    int i = k.b.gum;
    GMTrace.o(4397509640192L, 32764);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(4398046511104L, 32768);
    w.d("MicroMsg.NetSceneNewVoiceInput", "%s time:%s errType: %s, errCode: %s, errMsg: %s", new Object[] { com.tencent.mm.compatible.util.g.tC(), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 3) && (paramInt3 == -1)) {
      w.i("MicroMsg.NetSceneNewVoiceInput", "getStack([ %s ]), ThreadID: %s", new Object[] { bg.bQW(), Long.valueOf(Thread.currentThread().getId()) });
    }
    paramArrayOfByte = (bnz)((com.tencent.mm.ad.b)paramq).gtC.gtK;
    paramq = (bob)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      w.i("MicroMsg.NetSceneNewVoiceInput", com.tencent.mm.compatible.util.g.tC() + " onGYNetEnd file: %s errType:%s errCode:%s", new Object[] { this.filename, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      NX();
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(4398046511104L, 32768);
      return;
    }
    w.d("MicroMsg.NetSceneNewVoiceInput", "onGYNetEnd voiceId = %s, seq = %s, time = %s", new Object[] { paramArrayOfByte.uVD, Integer.valueOf(paramArrayOfByte.tWZ), Long.valueOf(System.currentTimeMillis()) });
    this.heH.Q(paramq.uXP);
    if ((this.heH.Oi()) && (this.hdn))
    {
      w.d("MicroMsg.NetSceneNewVoiceInput", "onGYNetEnd isAllRespEnd && isRecordFinish");
      NY();
    }
    this.heM = new String[] { this.heH.Oh() };
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    if (paramq.uXQ <= 0)
    {
      paramInt1 = this.heN;
      this.heN = paramInt1;
      if (paramq.uLD >= 0) {
        break label413;
      }
    }
    label413:
    for (paramInt1 = 120;; paramInt1 = paramq.uLD)
    {
      this.heG = paramInt1;
      w.d("MicroMsg.NetSceneNewVoiceInput", "onGYNetEnd max_send_byte_per_pack = %s, interval = %s", new Object[] { Integer.valueOf(this.heN), Integer.valueOf(this.heG) });
      GMTrace.o(4398046511104L, 32768);
      return;
      paramInt1 = paramq.uXQ;
      break;
    }
  }
  
  protected final void a(k.a parama)
  {
    GMTrace.i(4397778075648L, 32766);
    w.w("MicroMsg.NetSceneNewVoiceInput", com.tencent.mm.compatible.util.g.tC() + " setSecurityCheckError e: %s", new Object[] { parama });
    if (parama == k.a.guj)
    {
      NX();
      this.fUd.a(3, -1, "SecurityCheckError", this);
    }
    GMTrace.o(4397778075648L, 32766);
  }
  
  public final int getType()
  {
    GMTrace.i(4398449164288L, 32771);
    GMTrace.o(4398449164288L, 32771);
    return 235;
  }
  
  public final void hs(int paramInt)
  {
    GMTrace.i(4398583382016L, 32772);
    w.d("MicroMsg.NetSceneNewVoiceInput", "%s %s", new Object[] { com.tencent.mm.compatible.util.g.tC(), Integer.valueOf(paramInt) });
    if (paramInt < 0) {
      throw new IllegalStateException();
    }
    this.heH.hs(paramInt);
    GMTrace.o(4398583382016L, 32772);
  }
  
  protected final int vB()
  {
    GMTrace.i(4397643857920L, 32765);
    GMTrace.o(4397643857920L, 32765);
    return 2000;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\bd\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */