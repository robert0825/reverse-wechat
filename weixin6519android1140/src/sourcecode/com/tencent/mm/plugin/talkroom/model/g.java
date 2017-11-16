package com.tencent.mm.plugin.talkroom.model;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.talkroom.component.TalkRoomService;
import com.tencent.mm.plugin.talkroom.component.a.a;
import com.tencent.mm.plugin.talkroom.component.b.a;
import com.tencent.mm.plugin.talkroom.component.c.a;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.pluginsdk.p.l;
import com.tencent.mm.pluginsdk.p.n;
import com.tencent.mm.pluginsdk.p.o;
import com.tencent.mm.pluginsdk.p.r;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.biq;
import com.tencent.mm.protocal.c.bir;
import com.tencent.mm.protocal.c.bis;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.aq;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.sdk.platformtools.z.a;
import com.tencent.mm.sdk.platformtools.z.b;
import com.tencent.mm.storage.as;
import com.tencent.mm.y.ac;
import com.tencent.mm.y.ad;
import com.tencent.mm.y.at;
import com.tencent.mm.y.r;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class g
  implements com.tencent.mm.ad.e, p.l, p.n, ad
{
  public static final int[] qya;
  public static final byte[][] qyb;
  private final ServiceConnection keh;
  public int mjF;
  public long mjG;
  private int qxL;
  private int qxM;
  public boolean qxN;
  public String qxO;
  private int qxP;
  private int qxQ;
  public int qxR;
  private LinkedList<biq> qxS;
  public com.tencent.mm.plugin.talkroom.component.a qxT;
  private com.tencent.mm.plugin.talkroom.component.b qxU;
  private com.tencent.mm.plugin.talkroom.component.e qxV;
  private com.tencent.mm.plugin.talkroom.component.d qxW;
  public z qxX;
  private com.tencent.mm.sdk.platformtools.aj qxY;
  public i qxZ;
  public boolean qyc;
  public int state;
  
  static
  {
    GMTrace.i(5165637697536L, 38487);
    qya = new int[] { 80, 8080, 16285 };
    byte[] arrayOfByte1 = { 112, 64, -19, -29 };
    byte[] arrayOfByte2 = { 120, -52, -55, -58 };
    qyb = new byte[][] { { 101, -30, 76, 27 }, arrayOfByte1, arrayOfByte2 };
    GMTrace.o(5165637697536L, 38487);
  }
  
  public g()
  {
    GMTrace.i(5159597899776L, 38442);
    this.qxL = 0;
    this.qxM = 0;
    this.state = 0;
    this.qxN = false;
    this.qxS = new LinkedList();
    this.qxZ = new i();
    this.keh = new ServiceConnection()
    {
      public final void onServiceConnected(ComponentName paramAnonymousComponentName, IBinder paramAnonymousIBinder)
      {
        GMTrace.i(5157853069312L, 38429);
        w.i("MicroMsg.TalkRoomServer", "onServiceConnected ");
        if (paramAnonymousIBinder == null)
        {
          g.this.qxZ.H("enterTalkRoom bindServie or protocalInit failed", 3, -1);
          GMTrace.o(5157853069312L, 38429);
          return;
        }
        g.this.qxT = a.a.T(paramAnonymousIBinder);
        if (g.this.state >= 2) {
          new com.tencent.mm.sdk.platformtools.ae(Looper.getMainLooper()).post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(5149397352448L, 38366);
              g.this.in(true);
              GMTrace.o(5149397352448L, 38366);
            }
          });
        }
        GMTrace.o(5157853069312L, 38429);
      }
      
      public final void onServiceDisconnected(ComponentName paramAnonymousComponentName)
      {
        GMTrace.i(5157987287040L, 38430);
        w.i("MicroMsg.TalkRoomServer", "onServiceDisconnected ");
        GMTrace.o(5157987287040L, 38430);
      }
    };
    this.qyc = false;
    TalkRoomReceiver.init();
    GMTrace.o(5159597899776L, 38442);
  }
  
  private int a(PByteArray paramPByteArray, String paramString)
  {
    GMTrace.i(5162953342976L, 38467);
    if (this.qxT != null)
    {
      int[] arrayOfInt = new int[1];
      try
      {
        paramPByteArray.value = this.qxT.d(arrayOfInt, paramString);
        int i = arrayOfInt[0];
        GMTrace.o(5162953342976L, 38467);
        return i;
      }
      catch (RemoteException paramPByteArray)
      {
        for (;;)
        {
          arrayOfInt[0] = -99999;
          w.printErrStackTrace("MicroMsg.TalkRoomServer", paramPByteArray, "", new Object[0]);
        }
      }
    }
    GMTrace.o(5162953342976L, 38467);
    return -99;
  }
  
  private boolean bsq()
  {
    GMTrace.i(5160403206144L, 38448);
    if (bso() == 1) {
      b(b.bse().qwS);
    }
    while (this.qxM > 0)
    {
      w.i("MicroMsg.TalkRoomServer", "addListener has init before");
      GMTrace.o(5160403206144L, 38448);
      return true;
      a(b.bse().qwS);
    }
    at.wS().a(332, this);
    at.wS().a(334, this);
    at.wS().a(336, this);
    at.wS().a(335, this);
    b.bsg().a(this);
    at.pD().a(this);
    this.qxM = 1;
    if (this.qxT != null) {}
    try
    {
      this.qxT.Close();
      this.qxT.uninitLive();
      Intent localIntent = new Intent(ab.getContext(), TalkRoomService.class);
      ab.getContext().bindService(localIntent, this.keh, 1);
      this.qxU = new b.a()
      {
        public final void keep_OnError(int paramAnonymousInt)
        {
          GMTrace.i(5145236602880L, 38335);
          w.e("MicroMsg.TalkRoomServer", "engineCallback OnError: %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
          b.bsi().bsn();
          b.bsi().qxi = 1;
          g.this.qxZ.H("component OnError " + paramAnonymousInt, 99, paramAnonymousInt);
          new com.tencent.mm.sdk.platformtools.ae(Looper.getMainLooper()).post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(5165906132992L, 38489);
              g.this.aKW();
              GMTrace.o(5165906132992L, 38489);
            }
          });
          GMTrace.o(5145236602880L, 38335);
        }
        
        public final void keep_OnOpenSuccess()
        {
          GMTrace.i(5145102385152L, 38334);
          w.i("MicroMsg.TalkRoomServer", "OnOpenSuccess");
          if (g.this.state != 1)
          {
            w.w("MicroMsg.TalkRoomServer", "has exit the talkroom state:%d", new Object[] { Integer.valueOf(g.this.state) });
            GMTrace.o(5145102385152L, 38334);
            return;
          }
          b.bsi().bsn();
          new com.tencent.mm.sdk.platformtools.ae(Looper.getMainLooper()).post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(5151007965184L, 38378);
              g.this.im(true);
              GMTrace.o(5151007965184L, 38378);
            }
          });
          g.this.bsu();
          g.this.qxZ.aKX();
          GMTrace.o(5145102385152L, 38334);
        }
      };
      GMTrace.o(5160403206144L, 38448);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException, "", new Object[0]);
      }
    }
  }
  
  private void bsr()
  {
    GMTrace.i(5160805859328L, 38451);
    if (this.qxV != null) {}
    try
    {
      this.qxV.release();
      this.qxV = null;
      if (this.qxW == null) {}
    }
    catch (RemoteException localRemoteException1)
    {
      try
      {
        this.qxW.release();
        this.qxW = null;
        if (this.qxX != null)
        {
          this.qxX.stopTimer();
          this.qxX = null;
        }
        if (this.qxY != null)
        {
          this.qxY.stopTimer();
          this.qxY = null;
        }
        GMTrace.o(5160805859328L, 38451);
        return;
        localRemoteException1 = localRemoteException1;
        w.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException1, "", new Object[0]);
      }
      catch (RemoteException localRemoteException2)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException2, "", new Object[0]);
        }
      }
    }
  }
  
  private boolean bsv()
  {
    GMTrace.i(5161879601152L, 38459);
    int i = -99999;
    try
    {
      int j = this.qxT.brY();
      i = j;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException, "", new Object[0]);
      }
      GMTrace.o(5161879601152L, 38459);
    }
    w.i("MicroMsg.TalkRoomServer", "engine.protocalInit");
    if ((i < 0) && (i != -3))
    {
      this.qxT = null;
      w.f("MicroMsg.TalkRoomServer", "engine.protocalInit error %d", new Object[] { Integer.valueOf(i) });
      this.qxZ.H("enterTalkRoom protocalInit failed", 3, -1);
      GMTrace.o(5161879601152L, 38459);
      return false;
    }
    return true;
  }
  
  private void bsw()
  {
    GMTrace.i(5162282254336L, 38462);
    if (this.qxT == null)
    {
      w.e("MicroMsg.TalkRoomServer", "the engine should not be null.");
      GMTrace.o(5162282254336L, 38462);
      return;
    }
    this.qxV = this.qxT.a(new c.a()
    {
      public final void j(int paramAnonymousInt1, int paramAnonymousInt2, boolean paramAnonymousBoolean)
      {
        GMTrace.i(5157047762944L, 38423);
        if (paramAnonymousBoolean)
        {
          g.this.qxR = 0;
          g.this.qxZ.Bt("");
          GMTrace.o(5157047762944L, 38423);
          return;
        }
        g.this.vW(paramAnonymousInt2);
        if (g.this.qxR == paramAnonymousInt1)
        {
          GMTrace.o(5157047762944L, 38423);
          return;
        }
        g.this.qxR = paramAnonymousInt1;
        String str1 = g.this.bsp();
        if ((!g.this.qxN) && (str1 == null))
        {
          g.this.qxN = true;
          paramAnonymousInt1 = g.this.mjF;
          long l = g.this.mjG;
          Object localObject = g.this.qxO;
          g localg = g.this;
          String str2 = g.this.qxO;
          localObject = new com.tencent.mm.plugin.talkroom.b.c(paramAnonymousInt1, l, (String)localObject, localg.bso());
          at.wS().a((k)localObject, 0);
          localObject = b.bsi();
          ((f)localObject).qxq += 1;
          localObject = b.bsi();
          ((f)localObject).qxr += 1;
        }
        g.this.qxZ.Bt(str1);
        aq.C(ab.getContext(), R.l.eei);
        GMTrace.o(5157047762944L, 38423);
      }
    });
    this.qxV.start();
    this.qxW = this.qxT.brZ();
    this.qxW.start();
    GMTrace.o(5162282254336L, 38462);
  }
  
  private void bsx()
  {
    GMTrace.i(5162550689792L, 38464);
    if (this.qxS.size() == 0)
    {
      w.e("MicroMsg.TalkRoomServer", "engine. talk relay addr list is empty");
      this.qxZ.l(3, -1, "engine.talk relay addr list empty");
      GMTrace.o(5162550689792L, 38464);
      return;
    }
    int[] arrayOfInt1 = new int[this.qxS.size()];
    int[] arrayOfInt2 = new int[this.qxS.size()];
    w.i("MicroMsg.TalkRoomServer", "talk relay addr cnt %d", new Object[] { Integer.valueOf(this.qxS.size()) });
    int i = 0;
    while (i < this.qxS.size())
    {
      arrayOfInt1[i] = ((biq)this.qxS.get(i)).uTR;
      arrayOfInt2[i] = ((biq)this.qxS.get(i)).uKd;
      w.i("MicroMsg.TalkRoomServer", "add talk relay addr %s %d", new Object[] { vX(((biq)this.qxS.get(i)).uTR), Integer.valueOf(((biq)this.qxS.get(i)).uKd) });
      i += 1;
    }
    w.i("MicroMsg.TalkRoomServer", "engine.Open myRoomMemId %d, roomId %d, roomKey %d", new Object[] { Integer.valueOf(this.qxQ), Integer.valueOf(this.mjF), Long.valueOf(this.mjG) });
    try
    {
      com.tencent.mm.plugin.talkroom.component.a locala = this.qxT;
      com.tencent.mm.plugin.talkroom.component.b localb = this.qxU;
      at.AR();
      i = locala.a(localb, com.tencent.mm.y.c.ww(), this.qxQ, this.mjF, this.mjG, arrayOfInt1, arrayOfInt2, 0);
      if ((i < 0) && (i != -3))
      {
        w.e("MicroMsg.TalkRoomServer", "engine.Open error %d", new Object[] { Integer.valueOf(i) });
        this.qxZ.l(3, i, "engine.Open error");
      }
      GMTrace.o(5162550689792L, 38464);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException, "", new Object[0]);
        i = -99999;
      }
    }
  }
  
  private static String vX(int paramInt)
  {
    GMTrace.i(5162416472064L, 38463);
    try
    {
      String str = InetAddress.getByAddress(new byte[] { (byte)(paramInt >>> 24 & 0xFF), (byte)(paramInt >>> 16 & 0xFF), (byte)(paramInt >>> 8 & 0xFF), (byte)(paramInt & 0xFF) }).getHostAddress();
      GMTrace.o(5162416472064L, 38463);
      return str;
    }
    catch (Exception localException)
    {
      w.printErrStackTrace("MicroMsg.TalkRoomServer", localException, "", new Object[0]);
      GMTrace.o(5162416472064L, 38463);
    }
    return null;
  }
  
  public final void AA()
  {
    GMTrace.i(5163490213888L, 38471);
    w.v("MicroMsg.TalkRoomServer", "yy talkroom onPause");
    try
    {
      if (bg.nm(this.qxO)) {
        w.d("MicroMsg.TalkRoomServer", "pause");
      }
      for (;;)
      {
        this.qyc = true;
        i locali = this.qxZ;
        local2 = new i.2(locali);
        if (Looper.myLooper() != Looper.getMainLooper()) {
          break;
        }
        local2.run();
        GMTrace.o(5163490213888L, 38471);
        return;
        if (this.qxW != null) {
          this.qxW.bsa();
        }
        if (this.qxV != null) {
          this.qxV.blb();
        }
        this.state = 2;
      }
    }
    catch (RemoteException localRemoteException)
    {
      i.2 local2;
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException, "", new Object[0]);
      }
      localRemoteException.handler.post(local2);
      GMTrace.o(5163490213888L, 38471);
    }
  }
  
  public final void Az()
  {
    GMTrace.i(5163355996160L, 38470);
    w.v("MicroMsg.TalkRoomServer", "yy talkroom onResume");
    if (bg.nm(this.qxO)) {
      w.d("MicroMsg.TalkRoomServer", "pause");
    }
    i locali;
    i.3 local3;
    for (;;)
    {
      this.qyc = false;
      locali = this.qxZ;
      local3 = new i.3(locali);
      if (Looper.myLooper() != Looper.getMainLooper()) {
        break;
      }
      local3.run();
      GMTrace.o(5163355996160L, 38470);
      return;
      bsu();
    }
    locali.handler.post(local3);
    GMTrace.o(5163355996160L, 38470);
  }
  
  public final void E(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(5163087560704L, 38468);
    if (!paramString1.equals(this.qxO))
    {
      GMTrace.o(5163087560704L, 38468);
      return;
    }
    paramString1 = this.qxZ;
    paramString2 = new i.10(paramString1, paramString2, paramString3);
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      paramString2.run();
      GMTrace.o(5163087560704L, 38468);
      return;
    }
    paramString1.handler.post(paramString2);
    GMTrace.o(5163087560704L, 38468);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5161342730240L, 38455);
    w.i("MicroMsg.TalkRoomServer", "type:%d  errType:%d  errCode:%d", new Object[] { Integer.valueOf(paramk.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    paramString = (com.tencent.mm.plugin.talkroom.b.f)paramk;
    if ((paramString.bsB() == null) || (!paramString.bsB().equals(this.qxO)))
    {
      w.w("MicroMsg.TalkRoomServer", "%s, now :%s this is the old sceneEnd, abandon it!!", new Object[] { paramString.bsB(), this.qxO });
      GMTrace.o(5161342730240L, 38455);
      return;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      if (paramk.getType() == 332)
      {
        b.bsi().vU(2);
        if (paramInt1 == 4) {
          b.bsi().qxD = paramInt2;
        }
        this.qxZ.H("cgi enter failed : errType:" + paramInt1 + " errCode:" + paramInt2, paramInt1, paramInt2);
        aKW();
        GMTrace.o(5161342730240L, 38455);
        return;
      }
      if (paramk.getType() == 334)
      {
        if (((com.tencent.mm.plugin.talkroom.b.d)paramk).actionType != 1)
        {
          GMTrace.o(5161342730240L, 38455);
          return;
        }
        paramString = b.bsi();
        paramString.qxm += 1;
        paramString.qxH = 0L;
        bsu();
        w.w("MicroMsg.TalkRoomServer", "onSceneEnd SeizeMicFailed");
        if ((paramInt1 == 4) && ((paramInt2 == 311) || (paramInt2 == 340)))
        {
          this.qxZ.pJ(paramInt2);
          GMTrace.o(5161342730240L, 38455);
          return;
        }
        this.qxZ.l(paramInt1, paramInt2, "TalkMicAction failed!!");
        GMTrace.o(5161342730240L, 38455);
        return;
      }
      if (paramk.getType() == 336)
      {
        this.qxN = false;
        this.qxZ.l(paramInt1, paramInt2, "TalkGetMember failed!!");
        aKW();
        GMTrace.o(5161342730240L, 38455);
        return;
      }
      if (paramk.getType() == 335)
      {
        this.qxZ.l(paramInt1, paramInt2, "TalkNoop failed!!");
        aKW();
        GMTrace.o(5161342730240L, 38455);
        return;
      }
    }
    Object localObject;
    if (paramk.getType() == 332)
    {
      b.bsi().vU(1);
      paramk = (com.tencent.mm.plugin.talkroom.b.a)paramk;
      this.mjF = paramk.mjF;
      this.mjG = paramk.mjG;
      this.qxP = paramk.qxP;
      this.qxQ = paramk.qxQ;
      this.qxS = paramk.qxS;
      localObject = b.bsi();
      paramInt1 = this.mjF;
      long l = this.mjG;
      ((f)localObject).mjF = paramInt1;
      ((f)localObject).mjG = l;
      paramk = paramk.qyl;
      b.bsg().a(this.qxO, paramk, null, null, paramString.bsC());
      vV(100);
      GMTrace.o(5161342730240L, 38455);
      return;
    }
    if (paramk.getType() == 334)
    {
      paramString = (com.tencent.mm.plugin.talkroom.b.d)paramk;
      if (paramString.actionType == 1)
      {
        paramk = b.bsi();
        if (paramk.qxH != 0L)
        {
          paramk.qxk = ((bg.aI(paramk.qxH) + paramk.qxk * paramk.qxG) / (paramk.qxG + 1));
          paramk.qxG += 1;
          paramk.qxl += 1;
          paramk.qxH = 0L;
        }
        w.i("MicroMsg.TalkRoomServer", "dealWithSeizeMic seize Mic successFul");
        if (paramString.qxP < this.qxP)
        {
          w.w("MicroMsg.TalkRoomServer", "micSeq is smaller seizeSeq %d, now %d", new Object[] { Integer.valueOf(paramString.qxP), Integer.valueOf(this.qxP) });
          bsu();
          this.qxZ.pJ(311);
          GMTrace.o(5161342730240L, 38455);
          return;
        }
        this.qxP = paramString.qxP;
        paramInt1 = -99999;
        try
        {
          paramInt2 = this.qxT.SetCurrentMicId(this.qxP);
          paramInt1 = paramInt2;
        }
        catch (RemoteException paramString)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.TalkRoomServer", paramString, "", new Object[0]);
          }
          paramString = this.qxZ;
          paramk = new i.6(paramString);
          if (Looper.myLooper() != Looper.getMainLooper()) {
            break label897;
          }
        }
        if (this.state != 3)
        {
          w.i("MicroMsg.TalkRoomServer", "dealWithSeizeMic not in getting mic state");
          GMTrace.o(5161342730240L, 38455);
          return;
        }
        paramk.run();
        for (;;)
        {
          this.state = 4;
          if (paramInt1 < 0) {
            w.e("MicroMsg.TalkRoomServer", "SetCurrentMicId err: %d ", new Object[] { Integer.valueOf(paramInt1) });
          }
          if (this.qxY == null)
          {
            this.qxY = new com.tencent.mm.sdk.platformtools.aj(new aj.a()
            {
              public final boolean pM()
              {
                GMTrace.i(5146847215616L, 38347);
                int i = g.this.mjF;
                long l = g.this.mjG;
                Object localObject = g.this.qxO;
                g localg = g.this;
                String str = g.this.qxO;
                localObject = new com.tencent.mm.plugin.talkroom.b.d(i, l, 1, (String)localObject, localg.bso());
                at.wS().a((k)localObject, 0);
                GMTrace.o(5146847215616L, 38347);
                return true;
              }
            }, true);
            this.qxY.z(5000L, 5000L);
          }
          GMTrace.o(5161342730240L, 38455);
          return;
          label897:
          paramString.handler.post(paramk);
        }
      }
      w.i("MicroMsg.TalkRoomServer", "putaway Mic successFul");
      GMTrace.o(5161342730240L, 38455);
      return;
    }
    if (paramk.getType() == 336)
    {
      localObject = (com.tencent.mm.plugin.talkroom.b.c)paramk;
      LinkedList localLinkedList = ((com.tencent.mm.plugin.talkroom.b.c)localObject).qyl;
      b.bsg().a(this.qxO, localLinkedList, null, null, paramString.bsC());
      vW(((com.tencent.mm.plugin.talkroom.b.c)localObject).qxP);
      this.qxN = false;
      this.qxZ.Bt(bsp());
    }
    if ((paramk.getType() == 335) && (this.state == 0)) {
      this.qxZ.l(3, -1, "talknoop success but in outside room state");
    }
    GMTrace.o(5161342730240L, 38455);
  }
  
  /* Error */
  public final void a(p.o paramo)
  {
    // Byte code:
    //   0: ldc2_w 658
    //   3: ldc_w 660
    //   6: invokestatic 79	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: getfield 125	com/tencent/mm/plugin/talkroom/model/g:qxZ	Lcom/tencent/mm/plugin/talkroom/model/i;
    //   13: astore_2
    //   14: aload_1
    //   15: monitorenter
    //   16: aload_2
    //   17: getfield 664	com/tencent/mm/plugin/talkroom/model/i:fIz	Ljava/util/List;
    //   20: aload_1
    //   21: invokeinterface 669 2 0
    //   26: ifeq +26 -> 52
    //   29: aload_1
    //   30: monitorexit
    //   31: aload_0
    //   32: getfield 125	com/tencent/mm/plugin/talkroom/model/g:qxZ	Lcom/tencent/mm/plugin/talkroom/model/i;
    //   35: aload_0
    //   36: invokevirtual 652	com/tencent/mm/plugin/talkroom/model/g:bsp	()Ljava/lang/String;
    //   39: invokevirtual 655	com/tencent/mm/plugin/talkroom/model/i:Bt	(Ljava/lang/String;)V
    //   42: ldc2_w 658
    //   45: ldc_w 660
    //   48: invokestatic 100	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   51: return
    //   52: aload_2
    //   53: getfield 664	com/tencent/mm/plugin/talkroom/model/i:fIz	Ljava/util/List;
    //   56: aload_1
    //   57: invokeinterface 672 2 0
    //   62: pop
    //   63: aload_1
    //   64: monitorexit
    //   65: goto -34 -> 31
    //   68: astore_2
    //   69: aload_1
    //   70: monitorexit
    //   71: aload_2
    //   72: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	73	0	this	g
    //   0	73	1	paramo	p.o
    //   13	40	2	locali	i
    //   68	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   16	31	68	finally
    //   52	65	68	finally
    //   69	71	68	finally
  }
  
  public final void aKW()
  {
    GMTrace.i(5160671641600L, 38450);
    w.i("MicroMsg.TalkRoomServer", "exitTalkRoom");
    im(false);
    if (bg.nm(this.qxO))
    {
      w.i("MicroMsg.TalkRoomServer", "exitTalkRoom: has exited");
      GMTrace.o(5160671641600L, 38450);
      return;
    }
    Object localObject1 = b.bsi();
    if (((f)localObject1).qxF != 0L) {
      ((f)localObject1).qxj = ((int)(bg.aI(((f)localObject1).qxF) / 1000L));
    }
    this.state = 0;
    this.qxN = false;
    int i = this.mjF;
    long l = this.mjG;
    if (this.mjF != 0) {
      localObject1 = this.qxO;
    }
    for (;;)
    {
      localObject1 = new com.tencent.mm.plugin.talkroom.b.b(i, l, (String)localObject1, bso());
      at.wS().a((k)localObject1, 0);
      if (this.qxT != null) {}
      try
      {
        i = this.qxT.Close();
        if (i < 0) {
          w.e("MicroMsg.TalkRoomServer", "engine.Close error %d", new Object[] { Integer.valueOf(i) });
        }
        localObject2 = new PByteArray();
        if (a((PByteArray)localObject2, r.fs(this.qxO)) == 0)
        {
          localObject1 = new String(((PByteArray)localObject2).value);
          w.i("MicroMsg.TalkRoomServer", "getStatis==> pba.len %d, info: %s", new Object[] { Integer.valueOf(((PByteArray)localObject2).value.length), localObject1 });
          localObject2 = new LinkedList();
          bis localbis = new bis();
          localbis.uzM = 10402;
          localbis.uTT = new azq().Rq((String)localObject1);
          localObject1 = new bis();
          ((bis)localObject1).uzM = 10404;
          ((bis)localObject1).uTT = new azq().Rq(b.bsi().toString());
          ((LinkedList)localObject2).add(localbis);
          ((LinkedList)localObject2).add(localObject1);
          localObject1 = new com.tencent.mm.plugin.talkroom.b.g((LinkedList)localObject2, bso());
          at.wS().a((k)localObject1, 0);
        }
        this.qxO = "";
        this.mjF = 0;
        this.mjG = 0L;
        this.qxP = 0;
        this.qxQ = 0;
        this.qxR = 0;
        this.qxS.clear();
        bsr();
        localObject1 = this.qxZ;
        localObject2 = new i.12((i)localObject1);
        if (Looper.myLooper() == Looper.getMainLooper())
        {
          ((Runnable)localObject2).run();
          localObject1 = b.bse().qwS;
          ((c)localObject1).mHandler.post(new c.1((c)localObject1));
          this.qxM = 0;
          at.wS().b(332, this);
          at.wS().b(334, this);
          at.wS().b(336, this);
          at.wS().b(335, this);
          b.bsg().b(this);
          at.pD().b(this);
          b(b.bse().qwS);
          if (this.qxT == null) {}
        }
        else
        {
          try
          {
            i = this.qxT.uninitLive();
            ab.getContext().unbindService(this.keh);
            localObject1 = new Intent(ab.getContext(), TalkRoomService.class);
            ab.getContext().stopService((Intent)localObject1);
            this.qxT = null;
            if (i < 0) {
              w.e("MicroMsg.TalkRoomServer", "engine.uninitLive error %d", new Object[] { Integer.valueOf(i) });
            }
            GMTrace.o(5160671641600L, 38450);
            return;
          }
          catch (RemoteException localRemoteException2)
          {
            w.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException2, "", new Object[0]);
          }
          localObject1 = "";
        }
      }
      catch (RemoteException localRemoteException1)
      {
        for (;;)
        {
          Object localObject2;
          w.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException1, "", new Object[0]);
          i = -99999;
          continue;
          localRemoteException1.handler.post((Runnable)localObject2);
          continue;
          i = -99999;
        }
      }
    }
  }
  
  public final List<bir> aKv()
  {
    GMTrace.i(5159866335232L, 38444);
    LinkedList localLinkedList = b.bsg().JE(this.qxO);
    GMTrace.o(5159866335232L, 38444);
    return localLinkedList;
  }
  
  public final void b(p.o paramo)
  {
    GMTrace.i(5160268988416L, 38447);
    i locali = this.qxZ;
    try
    {
      locali.fIz.remove(paramo);
      GMTrace.o(5160268988416L, 38447);
      return;
    }
    finally {}
  }
  
  public final void bX(String paramString, int paramInt)
  {
    GMTrace.i(5160537423872L, 38449);
    w.i("MicroMsg.TalkRoomServer", "enterTalkRoom %s scene %d", new Object[] { paramString, Integer.valueOf(paramInt) });
    this.qxL = paramInt;
    bsq();
    if (paramString.equals(this.qxO))
    {
      w.d("MicroMsg.TalkRoomServer", "enterTalkRoom %s has enter the talkroom", new Object[] { paramString });
      if (this.state == 2) {
        this.qxZ.aKX();
      }
      GMTrace.o(5160537423872L, 38449);
      return;
    }
    w.d("MicroMsg.TalkRoomServer", "%s enter the talkroom", new Object[] { paramString });
    this.qxO = paramString;
    Object localObject = new com.tencent.mm.plugin.talkroom.b.a(this.qxO, bso());
    at.wS().a((k)localObject, 0);
    b.bse().qwU = new f();
    b.bsi().qxF = bg.Pw();
    b.bsi().qxC = paramString;
    if (bso() == 0) {
      b.bse().qwS.mAG = true;
    }
    localObject = this.qxZ;
    paramString = new i.11((i)localObject, paramString);
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      paramString.run();
      GMTrace.o(5160537423872L, 38449);
      return;
    }
    ((i)localObject).handler.post(paramString);
    GMTrace.o(5160537423872L, 38449);
  }
  
  public final boolean bsA()
  {
    GMTrace.i(5163221778432L, 38469);
    boolean bool = this.qyc;
    GMTrace.o(5163221778432L, 38469);
    return bool;
  }
  
  public final void bsb()
  {
    GMTrace.i(5161611165696L, 38457);
    w.i("MicroMsg.TalkRoomServer", "resumeRecord in state %d", new Object[] { Integer.valueOf(this.state) });
    if (this.state != 4)
    {
      GMTrace.o(5161611165696L, 38457);
      return;
    }
    f localf = b.bsi();
    localf.qxJ = true;
    localf.qxI = bg.Pw();
    try
    {
      this.qxW.bsb();
      GMTrace.o(5161611165696L, 38457);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      w.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException, "", new Object[0]);
      GMTrace.o(5161611165696L, 38457);
    }
  }
  
  public final int bso()
  {
    GMTrace.i(5159732117504L, 38443);
    if ((this.qxL == 1) || ((p.a.tmc != null) && (p.a.tmc.Bj(this.qxO))))
    {
      GMTrace.o(5159732117504L, 38443);
      return 1;
    }
    GMTrace.o(5159732117504L, 38443);
    return 0;
  }
  
  public final String bsp()
  {
    GMTrace.i(5160000552960L, 38445);
    Object localObject = b.bsg().JE(this.qxO).iterator();
    while (((Iterator)localObject).hasNext())
    {
      bir localbir = (bir)((Iterator)localObject).next();
      if (localbir.uTS == this.qxR)
      {
        localObject = localbir.jhi;
        GMTrace.o(5160000552960L, 38445);
        return (String)localObject;
      }
    }
    GMTrace.o(5160000552960L, 38445);
    return null;
  }
  
  public final boolean bss()
  {
    GMTrace.i(5161074294784L, 38453);
    w.i("MicroMsg.TalkRoomServer", "seizeMic");
    if (this.state != 2)
    {
      w.i("MicroMsg.TalkRoomServer", "seizeMic  not int the appropriate state");
      if (this.state == 0) {
        this.qxZ.l(3, -1, "seizeMic in outside room state");
      }
      GMTrace.o(5161074294784L, 38453);
      return false;
    }
    if (this.qxV != null) {}
    try
    {
      this.qxV.blb();
      this.state = 3;
      com.tencent.mm.plugin.talkroom.b.d locald = new com.tencent.mm.plugin.talkroom.b.d(this.mjF, this.mjG, 1, this.qxO, bso());
      at.wS().a(locald, 0);
      b.bsi().qxH = bg.Pw();
      b.bsi().qxK = true;
      GMTrace.o(5161074294784L, 38453);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException, "", new Object[0]);
      }
    }
  }
  
  public final void bst()
  {
    GMTrace.i(5161208512512L, 38454);
    w.i("MicroMsg.TalkRoomServer", "putAwayMic");
    Object localObject = b.bsi();
    if ((((f)localObject).qxK) && (!((f)localObject).qxJ)) {
      ((f)localObject).qxE += 1;
    }
    ((f)localObject).qxJ = false;
    ((f)localObject).qxK = false;
    if (this.state < 3)
    {
      w.w("MicroMsg.TalkRoomServer", "putAwayMic  err, isnot getting or has not got mic");
      GMTrace.o(5161208512512L, 38454);
      return;
    }
    if (this.qxY != null)
    {
      this.qxY.stopTimer();
      this.qxY = null;
    }
    bsu();
    localObject = new com.tencent.mm.plugin.talkroom.b.d(this.mjF, this.mjG, 2, this.qxO, bso());
    at.wS().a((k)localObject, 0);
    GMTrace.o(5161208512512L, 38454);
  }
  
  public final void bsu()
  {
    GMTrace.i(5161476947968L, 38456);
    for (;;)
    {
      long l;
      try
      {
        f localf = b.bsi();
        if (localf.qxI != 0L)
        {
          l = bg.aI(localf.qxI) / 1000L;
          if (l < 2L)
          {
            localf.qxt += 1;
            localf.qxI = 0L;
          }
        }
        else
        {
          if (this.qxW != null) {
            this.qxW.bsa();
          }
          if (this.qxV != null) {
            this.qxV.bsd();
          }
          this.state = 2;
          GMTrace.o(5161476947968L, 38456);
          return;
        }
        if (l < 6L)
        {
          localf.qxu += 1;
          continue;
        }
        if (l >= 11L) {
          break label169;
        }
      }
      catch (RemoteException localRemoteException)
      {
        w.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException, "", new Object[0]);
        GMTrace.o(5161476947968L, 38456);
        return;
      }
      localRemoteException.qxv += 1;
      continue;
      label169:
      if (l < 21L) {
        localRemoteException.qxw += 1;
      } else if (l < 31L) {
        localRemoteException.qxx += 1;
      } else if (l < 41L) {
        localRemoteException.qxy += 1;
      } else if (l < 51L) {
        localRemoteException.qxz += 1;
      } else if (l < 61L) {
        localRemoteException.qxA += 1;
      } else {
        localRemoteException.qxB += 1;
      }
    }
  }
  
  public final short bsy()
  {
    GMTrace.i(5162684907520L, 38465);
    if (this.qxW == null)
    {
      GMTrace.o(5162684907520L, 38465);
      return 0;
    }
    try
    {
      int i = this.qxW.bsc();
      short s = (short)i;
      GMTrace.o(5162684907520L, 38465);
      return s;
    }
    catch (RemoteException localRemoteException)
    {
      w.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException, "", new Object[0]);
      GMTrace.o(5162684907520L, 38465);
    }
    return 0;
  }
  
  public final short bsz()
  {
    GMTrace.i(5162819125248L, 38466);
    if (this.qxV == null)
    {
      GMTrace.o(5162819125248L, 38466);
      return 0;
    }
    try
    {
      int i = this.qxV.bsc();
      short s = (short)i;
      GMTrace.o(5162819125248L, 38466);
      return s;
    }
    catch (RemoteException localRemoteException)
    {
      w.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException, "", new Object[0]);
      GMTrace.o(5162819125248L, 38466);
    }
    return 0;
  }
  
  public final void im(boolean paramBoolean)
  {
    GMTrace.i(5160940077056L, 38452);
    if (bg.nm(this.qxO))
    {
      GMTrace.o(5160940077056L, 38452);
      return;
    }
    at.AR();
    com.tencent.mm.storage.ae localae = com.tencent.mm.y.c.yP().TO(this.qxO);
    if (localae == null)
    {
      GMTrace.o(5160940077056L, 38452);
      return;
    }
    if (paramBoolean) {}
    for (int i = 5;; i = 6)
    {
      localae.y(com.tencent.mm.plugin.messenger.foundation.a.a.a.a(localae, i, localae.field_conversationTime));
      at.AR();
      com.tencent.mm.y.c.yP().a(localae, this.qxO);
      GMTrace.o(5160940077056L, 38452);
      return;
    }
  }
  
  public final void in(boolean paramBoolean)
  {
    GMTrace.i(5162148036608L, 38461);
    w.i("MicroMsg.TalkRoomServer", "reConnect talkRoomUsername: %s", new Object[] { this.qxO });
    if ((bg.nm(this.qxO)) || (this.state < 2))
    {
      GMTrace.o(5162148036608L, 38461);
      return;
    }
    Object localObject = b.bsi();
    ((f)localObject).qxp += 1;
    if (paramBoolean) {
      if (!bsv())
      {
        GMTrace.o(5162148036608L, 38461);
        return;
      }
    }
    try
    {
      bsw();
      bsu();
      this.state = 1;
    }
    catch (RemoteException localRemoteException1)
    {
      try
      {
        if (this.qxT != null) {
          this.qxT.Close();
        }
        if (this.mjF != 0) {
          bsx();
        }
        if (!paramBoolean)
        {
          localObject = this.qxZ;
          local4 = new i.4((i)localObject);
          if (Looper.myLooper() == Looper.getMainLooper())
          {
            local4.run();
            GMTrace.o(5162148036608L, 38461);
            return;
            localRemoteException1 = localRemoteException1;
            w.e("MicroMsg.TalkRoomServer", localRemoteException1.toString());
            w.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException1, "", new Object[0]);
          }
        }
      }
      catch (RemoteException localRemoteException2)
      {
        i.4 local4;
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException2, "", new Object[0]);
        }
        localRemoteException2.handler.post(local4);
        GMTrace.o(5162148036608L, 38461);
      }
    }
  }
  
  public final void vV(final int paramInt)
  {
    GMTrace.i(5161745383424L, 38458);
    if (this.qxT != null) {
      try
      {
        this.state = 1;
        this.qxN = false;
        if (bsv())
        {
          bsr();
          bsx();
          bsw();
          if (this.qxX != null)
          {
            w.w("MicroMsg.TalkRoomServer", "enter talkroom not first time");
            GMTrace.o(5161745383424L, 38458);
            return;
          }
          this.qxX = new z(new z.a()
          {
            public final boolean pM()
            {
              GMTrace.i(5146310344704L, 38343);
              if ((g.this.mjF == 0) || (bg.nm(g.this.qxO)))
              {
                w.w("MicroMsg.TalkRoomServer", "talkNoopTimer error: roomId %d, talkUsername %s", new Object[] { Integer.valueOf(g.this.mjF), g.this.qxO });
                g.this.qxX = null;
                GMTrace.o(5146310344704L, 38343);
                return false;
              }
              Object localObject = g.this.qxO;
              int i = g.this.mjF;
              long l = g.this.mjG;
              g localg = g.this;
              String str = g.this.qxO;
              localObject = new com.tencent.mm.plugin.talkroom.b.e((String)localObject, i, l, localg.bso());
              at.wS().a((k)localObject, 0);
              GMTrace.o(5146310344704L, 38343);
              return true;
            }
          });
          z localz = this.qxX;
          z.vih = true;
          localz.qPW = 50000L;
          localz.gra = bg.Pw();
          boolean bool = z.eI(localz.qPW);
          localz.stopTimer();
          z.vie.put(Integer.valueOf(localz.vid), localz);
          if ((z.fIF != null) && (bool))
          {
            w.v("MicroMsg.MAlarmHandler", "prepare bumper");
            z.fIF.prepare();
          }
        }
        GMTrace.o(5161745383424L, 38458);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        w.printErrStackTrace("MicroMsg.TalkRoomServer", localRemoteException, "", new Object[0]);
        GMTrace.o(5161745383424L, 38458);
        return;
      }
    }
    if (paramInt == 0)
    {
      this.qxZ.H("bind talkroomService timeout", 3, -1);
      GMTrace.o(5161745383424L, 38458);
      return;
    }
    new com.tencent.mm.sdk.platformtools.ae().postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5149934223360L, 38370);
        g.this.vV(paramInt - 1);
        GMTrace.o(5149934223360L, 38370);
      }
    }, 50L);
    GMTrace.o(5161745383424L, 38458);
  }
  
  public final void vW(int paramInt)
  {
    GMTrace.i(5162013818880L, 38460);
    if (paramInt > this.qxP)
    {
      this.qxP = paramInt;
      if (this.state >= 3) {
        this.qxZ.pJ(311);
      }
      bsu();
    }
    GMTrace.o(5162013818880L, 38460);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\talkroom\model\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */