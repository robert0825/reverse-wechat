package com.tencent.mm.plugin.sns.model;

import android.content.Intent;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.k;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.plugin.sns.b.c;
import com.tencent.mm.plugin.sns.b.h.a;
import com.tencent.mm.plugin.sns.storage.f;
import com.tencent.mm.plugin.sns.storage.u;
import com.tencent.mm.protocal.c.beq;
import com.tencent.mm.protocal.c.ber;
import com.tencent.mm.protocal.c.bew;
import com.tencent.mm.protocal.c.bfh;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class al
{
  public static final class a
    implements com.tencent.mm.ad.e, com.tencent.mm.plugin.sns.b.h
  {
    public static int pvv;
    Map<h.a, String> guw;
    private LinkedList<String> pvA;
    public Map<String, ArrayList<com.tencent.mm.plugin.sns.g.b>> pvB;
    public Map<String, Integer> pvC;
    private Map<String, Long> pvw;
    private Map<String, Integer> pvx;
    private int pvy;
    public long pvz;
    
    static
    {
      GMTrace.i(8147016089600L, 60700);
      pvv = -1;
      GMTrace.o(8147016089600L, 60700);
    }
    
    public a()
    {
      GMTrace.i(8144331735040L, 60680);
      this.pvw = new HashMap();
      this.pvx = new HashMap();
      this.pvy = 0;
      this.pvz = 0L;
      this.guw = new HashMap();
      this.pvA = new LinkedList();
      this.pvB = new HashMap();
      this.pvC = new HashMap();
      GMTrace.o(8144331735040L, 60680);
    }
    
    public static void Hz(String paramString)
    {
      GMTrace.i(8145942347776L, 60692);
      Object localObject = ae.bjc();
      if (bg.nm(((ac)localObject).fJS)) {
        ((ac)localObject).fJS = com.tencent.mm.y.q.zE();
      }
      localObject = ((ac)localObject).fJS;
      com.tencent.mm.plugin.sns.storage.m localm = com.tencent.mm.plugin.sns.storage.h.Ir(paramString);
      for (;;)
      {
        try
        {
          bfh localbfh = (bfh)new bfh().aD(localm.field_attrBuf);
          Iterator localIterator = localbfh.uQQ.iterator();
          if (localIterator.hasNext())
          {
            bew localbew = (bew)localIterator.next();
            if (!localbew.tRz.equals(localObject)) {
              continue;
            }
            localbfh.uQQ.remove(localbew);
            localbfh.uQO -= 1;
            localm.field_attrBuf = localbfh.toByteArray();
            if (!localm.uX(32)) {
              continue;
            }
            ae.bjg().a(localm.bmj());
          }
        }
        catch (Exception localException)
        {
          continue;
          String str = localException.hTy;
          continue;
          com.tencent.mm.kernel.h.xz();
          com.tencent.mm.kernel.h.xx().fYr.a(new q(u.IM(paramString), 5), 0);
          GMTrace.o(8145942347776L, 60692);
        }
        if (!ae.bjc().dI(u.IM(paramString))) {
          continue;
        }
        if (!localm.uX(32)) {
          continue;
        }
        localObject = localm.blB();
        if (localObject != null) {
          continue;
        }
        localObject = "";
        ((c)com.tencent.mm.kernel.h.h(c.class)).a(11855, localm.bml(), new Object[] { Integer.valueOf(0), localObject, Integer.valueOf(localm.bml()) });
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.a(new q(u.IM(paramString), 7), 0);
        GMTrace.o(8145942347776L, 60692);
        return;
        ae.bjd().z(localm);
      }
    }
    
    public static bew a(com.tencent.mm.plugin.sns.storage.m paramm, int paramInt, String paramString)
    {
      GMTrace.i(8146076565504L, 60693);
      paramm = a(paramm, paramInt, paramString, null, false, 0, 0);
      GMTrace.o(8146076565504L, 60693);
      return paramm;
    }
    
    public static bew a(com.tencent.mm.plugin.sns.storage.m paramm, int paramInt1, String paramString, bew parambew, int paramInt2)
    {
      GMTrace.i(14313246949376L, 106642);
      paramm = a(paramm, paramInt1, paramString, parambew, false, paramInt2);
      GMTrace.o(14313246949376L, 106642);
      return paramm;
    }
    
    public static bew a(com.tencent.mm.plugin.sns.storage.m paramm, int paramInt1, String paramString, bew parambew, boolean paramBoolean, int paramInt2)
    {
      GMTrace.i(15698642337792L, 116964);
      paramm = a(paramm, paramInt1, paramString, parambew, paramBoolean, 0, paramInt2);
      GMTrace.o(15698642337792L, 116964);
      return paramm;
    }
    
    private static bew a(com.tencent.mm.plugin.sns.storage.m paramm, int paramInt1, String paramString, bew parambew, boolean paramBoolean, int paramInt2, int paramInt3)
    {
      GMTrace.i(14313515384832L, 106644);
      beq localbeq = new beq();
      localbeq.nIp = paramString;
      localbeq.nFd = ((int)(bg.Pv() / 1000L));
      localbeq.uQj = com.tencent.mm.y.q.zG();
      localbeq.uKB = com.tencent.mm.y.q.zE();
      localbeq.tQP = 0;
      localbeq.uQk = ((com.tencent.mm.plugin.messenger.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.a.a.class)).fs(paramm.field_userName);
      localbeq.uhT = paramm.field_userName;
      localbeq.jib = paramInt1;
      localbeq.uQr = paramInt3;
      long l;
      Object localObject1;
      label143:
      ber localber;
      if (paramm.uX(32)) {
        if (parambew == null)
        {
          l = 0L;
          localbeq.uQo = l;
          localObject1 = new beq();
          if (parambew != null) {
            break label471;
          }
          paramString = "";
          ((beq)localObject1).uKB = paramString;
          localber = new ber();
          localber.tXT = paramm.field_snsId;
          localber.uQt = localbeq;
          localber.uQu = ((beq)localObject1);
          localObject1 = "";
          if (paramm.uX(32))
          {
            paramString = paramm.blB();
            if (paramString != null) {
              break label479;
            }
            localObject1 = "";
            label207:
            if (paramString != null) {
              break label488;
            }
            paramString = "";
            label214:
            if (localbeq.jib != 7) {
              break label496;
            }
            ((c)com.tencent.mm.kernel.h.h(c.class)).a(11855, paramm.bml(), new Object[] { Integer.valueOf(1), localObject1, Integer.valueOf(paramm.bml()) });
            label270:
            localObject2 = paramm.bmj();
            localObject1 = paramString;
            if (localObject2 != null)
            {
              localObject1 = paramString;
              if (((com.tencent.mm.plugin.sns.storage.e)localObject2).field_firstControlTime == 0)
              {
                ((com.tencent.mm.plugin.sns.storage.e)localObject2).field_firstControlTime = localbeq.nFd;
                ae.bjg().b(((com.tencent.mm.plugin.sns.storage.e)localObject2).field_snsId, (com.tencent.mm.plugin.sns.storage.e)localObject2);
                localObject1 = paramString;
              }
            }
          }
          Object localObject2 = com.tencent.mm.a.g.n(bg.Pw().getBytes());
          paramString = (String)localObject2;
          if (paramm.uX(32)) {
            paramString = "_AD_TAG_" + (String)localObject2;
          }
          if (!ae.bjc().a(paramString, localber)) {
            break label583;
          }
          if (!ac.Hq(paramString)) {
            break label555;
          }
          com.tencent.mm.kernel.h.xz();
          com.tencent.mm.kernel.h.xx().fYr.a(new j(localber, paramString, (String)localObject1), 0);
        }
      }
      for (;;)
      {
        if (paramBoolean) {
          break label595;
        }
        GMTrace.o(14313515384832L, 106644);
        return null;
        l = parambew.uQp;
        break;
        if (parambew == null) {}
        for (paramInt1 = 0;; paramInt1 = parambew.uQm)
        {
          localbeq.uQl = paramInt1;
          break;
        }
        label471:
        paramString = parambew.tRz;
        break label143;
        label479:
        localObject1 = paramString.hTy;
        break label207;
        label488:
        paramString = paramString.pyc;
        break label214;
        label496:
        if (localbeq.jib != 8) {
          break label270;
        }
        ((c)com.tencent.mm.kernel.h.h(c.class)).a(11855, paramm.bml(), new Object[] { Integer.valueOf(2), localObject1, Integer.valueOf(paramm.bml()) });
        break label270;
        label555:
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.a(new n(localber, paramString), 0);
        continue;
        label583:
        w.e("MicroMsg.SnsService", "can not add Comment");
      }
      label595:
      paramString = new bew();
      paramString.nFd = localbeq.nFd;
      paramString.jib = localbeq.jib;
      paramString.tQP = localbeq.tQP;
      paramString.tRz = localbeq.uKB;
      paramString.uBf = localbeq.uQj;
      paramString.nIp = localbeq.nIp;
      paramString.uQr = localbeq.uQr;
      if (paramm.uX(32)) {
        if (parambew == null)
        {
          l = 0L;
          paramString.uQo = l;
          if (parambew != null) {
            break label742;
          }
        }
      }
      label742:
      for (paramm = "";; paramm = parambew.tRz)
      {
        paramString.uQG = paramm;
        GMTrace.o(14313515384832L, 106644);
        return paramString;
        l = parambew.uQp;
        break;
        if (parambew == null) {}
        for (paramInt1 = 0;; paramInt1 = parambew.uQm)
        {
          paramString.uQl = paramInt1;
          break;
        }
      }
    }
    
    public static bew a(com.tencent.mm.plugin.sns.storage.m paramm, int paramInt1, String paramString1, String paramString2, int paramInt2)
    {
      GMTrace.i(8146479218688L, 60696);
      beq localbeq = new beq();
      localbeq.nIp = paramString1;
      localbeq.nFd = ((int)(bg.Pv() / 1000L));
      localbeq.uQj = com.tencent.mm.y.q.zG();
      localbeq.uKB = com.tencent.mm.y.q.zE();
      localbeq.tQP = paramInt2;
      localbeq.uQk = ((com.tencent.mm.plugin.messenger.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.a.a.class)).fs(paramm.field_userName);
      localbeq.uhT = paramm.field_userName;
      localbeq.jib = paramInt1;
      ber localber;
      String str;
      if (paramm.uX(32))
      {
        localbeq.uQo = 0L;
        paramString1 = new beq();
        paramString1.uKB = paramString2;
        localber = new ber();
        localber.tXT = paramm.field_snsId;
        localber.uQt = localbeq;
        localber.uQu = paramString1;
        str = "";
        if (paramm.uX(32))
        {
          paramString1 = paramm.blB();
          if (paramString1 != null) {
            break label367;
          }
          paramString2 = "";
          label182:
          if (paramString1 != null) {
            break label375;
          }
          paramString1 = "";
          label189:
          if (localbeq.jib != 7) {
            break label383;
          }
          ((c)com.tencent.mm.kernel.h.h(c.class)).a(11855, paramm.bml(), new Object[] { Integer.valueOf(1), paramString2, Integer.valueOf(paramm.bml()) });
          str = paramString1;
        }
        label247:
        paramString2 = com.tencent.mm.a.g.n(bg.Pw().getBytes());
        paramString1 = paramString2;
        if (paramm.uX(32)) {
          paramString1 = "_AD_TAG_" + paramString2;
        }
        if (!ae.bjc().a(paramString1, localber, str)) {
          break label475;
        }
        if (!ac.Hq(paramString1)) {
          break label447;
        }
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.a(new j(localber, paramString1, str), 0);
      }
      for (;;)
      {
        GMTrace.o(8146479218688L, 60696);
        return null;
        localbeq.uQl = 0;
        break;
        label367:
        paramString2 = paramString1.hTy;
        break label182;
        label375:
        paramString1 = paramString1.pyc;
        break label189;
        label383:
        str = paramString1;
        if (localbeq.jib != 8) {
          break label247;
        }
        ((c)com.tencent.mm.kernel.h.h(c.class)).a(11855, paramm.bml(), new Object[] { Integer.valueOf(2), paramString2, Integer.valueOf(paramm.bml()) });
        str = paramString1;
        break label247;
        label447:
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.a(new n(localber, paramString1), 0);
        continue;
        label475:
        w.e("MicroMsg.SnsService", "can not add Comment");
      }
    }
    
    public static void a(String paramString1, int paramInt1, String paramString2, com.tencent.mm.plugin.sns.storage.m paramm, int paramInt2)
    {
      GMTrace.i(8146613436416L, 60697);
      if ((paramInt1 != 3) && (paramInt1 != 5))
      {
        GMTrace.o(8146613436416L, 60697);
        return;
      }
      beq localbeq = new beq();
      localbeq.nIp = paramString2;
      localbeq.nFd = ((int)(System.currentTimeMillis() / 1000L));
      localbeq.uQj = com.tencent.mm.y.q.zG();
      localbeq.uKB = com.tencent.mm.y.q.zE();
      localbeq.tQP = paramInt2;
      localbeq.uQk = ((com.tencent.mm.plugin.messenger.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.a.a.class)).fs(paramString1);
      localbeq.uhT = paramString1;
      localbeq.jib = paramInt1;
      paramString2 = new ber();
      paramString2.tXT = paramm.field_snsId;
      paramString2.uQt = localbeq;
      paramString2.uQu = new beq();
      String str = com.tencent.mm.a.g.n(bg.Pw().getBytes());
      long l = paramm.field_snsId;
      try
      {
        w.v("MicroMsg.SnsService", "comment stg inserted");
        paramm = new com.tencent.mm.plugin.sns.storage.i();
        paramm.field_talker = paramString1;
        paramm.field_snsID = l;
        paramm.field_createTime = ((int)(System.currentTimeMillis() / 1000L));
        paramm.field_curActionBuf = localbeq.toByteArray();
        paramm.field_type = paramInt1;
        paramm.field_isSend = true;
        paramm.field_isRead = 1;
        ae.bji().b(paramm);
        ae.bjc().a(str, paramString2);
        GMTrace.o(8146613436416L, 60697);
        return;
      }
      catch (Exception paramString1)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.SnsService", paramString1, "", new Object[0]);
        }
      }
    }
    
    public static int bjD()
    {
      GMTrace.i(8145673912320L, 60690);
      if (pvv != -1)
      {
        i = pvv;
        GMTrace.o(8145673912320L, 60690);
        return i;
      }
      int i = com.tencent.mm.plugin.sns.data.i.bhS();
      pvv = i;
      GMTrace.o(8145673912320L, 60690);
      return i;
    }
    
    public final void GL(String paramString)
    {
      GMTrace.i(8146747654144L, 60698);
      String str1 = ae.getAccSnsPath();
      String str2 = paramString + "bg_";
      String str3 = paramString + "tbg_";
      if (FileOp.aZ(str2))
      {
        FileOp.deleteFile(am.dE(str1, paramString) + str3);
        FileOp.g(am.dE(str1, paramString), str2, str3);
      }
      GMTrace.o(8146747654144L, 60698);
    }
    
    public final int Hy(String paramString)
    {
      GMTrace.i(8145271259136L, 60687);
      synchronized (this.pvx)
      {
        if (this.pvx.containsKey(paramString))
        {
          i = ((Integer)this.pvx.get(paramString)).intValue();
          if (i > 0) {}
          for (;;)
          {
            GMTrace.o(8145271259136L, 60687);
            return i;
            i = com.tencent.mm.plugin.sns.data.i.bhT();
          }
        }
        int i = com.tencent.mm.plugin.sns.data.i.bhT();
        GMTrace.o(8145271259136L, 60687);
        return i;
      }
    }
    
    public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
    {
      GMTrace.i(8145808130048L, 60691);
      w.i("MicroMsg.SnsService", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " type = " + paramk.getType());
      int i;
      if (((paramInt1 != 4) || (paramInt2 != 207)) && ((paramInt1 != 4) || (paramInt2 != 203))) {
        if ((paramInt1 == 4) && ((paramInt2 == 2001) || (paramInt2 == 2004))) {
          i = 1;
        }
      }
      while (i == 0)
      {
        GMTrace.o(8145808130048L, 60691);
        return;
        if ((paramInt1 == 4) && ((paramInt2 == 2001) || (paramInt2 == 2003))) {
          i = 1;
        } else if ((paramInt1 != 0) || (paramInt2 != 0)) {
          i = 0;
        } else {
          i = 1;
        }
      }
      switch (paramk.getType())
      {
      default: 
        if ((paramk.getType() == 212) || (paramk.getType() == 211))
        {
          paramk = (d)paramk;
          ??? = new ArrayList(this.guw.keySet()).iterator();
        }
        break;
      case 212: 
      case 211: 
        label250:
        while (((Iterator)???).hasNext())
        {
          h.a locala = (h.a)((Iterator)???).next();
          if (this.guw.containsKey(locala))
          {
            paramString = (String)this.guw.get(locala);
            if (paramk.getUserName().equals(paramString))
            {
              w.d("MicroMsg.SnsService", "notify ui " + paramString);
              label353:
              boolean bool4;
              if (paramk.bio() == 0L)
              {
                paramString = "";
                if (!paramk.bik()) {
                  break label622;
                }
                bool2 = paramk.bim();
                bool3 = paramk.bil();
                bool4 = paramk.bip();
                if ((paramInt1 != 4) || ((paramInt2 != 2001) && (paramInt2 != 2004) && (paramInt2 != 2003))) {
                  break label616;
                }
              }
              label616:
              for (boolean bool1 = true;; bool1 = false)
              {
                locala.a(bool2, bool3, paramString, bool4, bool1, paramInt2, paramk.biq());
                break label250;
                ??? = (z)paramk;
                paramString = ((z)???).userName;
                long l = ((z)???).psd;
                i = ((z)???).psf;
                if (i > 0) {}
                synchronized (this.pvx)
                {
                  this.pvx.put(paramString, Integer.valueOf(i));
                  if (l == 0L) {
                    break;
                  }
                  synchronized (this.pvw)
                  {
                    this.pvw.put(paramString, Long.valueOf(l));
                  }
                }
                paramString = (x)paramk;
                w(paramString.psd, paramString.psf);
                i = paramString.psg;
                if (pvv != i) {
                  com.tencent.mm.plugin.sns.data.i.uh(i);
                }
                pvv = i;
                break;
                paramString = com.tencent.mm.plugin.sns.data.i.du(paramk.bio());
                break label353;
              }
              label622:
              boolean bool2 = paramk.bil();
              boolean bool3 = paramk.bin();
              if ((paramInt1 == 4) && ((paramInt2 == 2001) || (paramInt2 == 2004) || (paramInt2 == 2003))) {}
              for (bool1 = true;; bool1 = false)
              {
                locala.a(bool2, paramString, bool3, bool1, paramInt2, paramk.biq());
                break;
              }
            }
          }
        }
      }
      GMTrace.o(8145808130048L, 60691);
    }
    
    public final void a(int paramInt, String paramString, h.a arg3)
    {
      GMTrace.i(18586336755712L, 138479);
      w.i("MicroMsg.SnsService", "startServer " + paramInt + " " + ???);
      ae.bjc().fJS = com.tencent.mm.y.q.zE();
      ae.bjc().biE();
      ae.biZ().bhR();
      if (this.guw.isEmpty())
      {
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.a(211, this);
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.a(212, this);
      }
      if (!this.guw.containsKey(???))
      {
        if (paramInt == 1) {
          this.guw.put(???, "@__weixintimtline");
        }
      }
      else {
        switch (paramInt)
        {
        }
      }
      for (;;)
      {
        GMTrace.o(18586336755712L, 138479);
        return;
        if ((paramInt == 2) || (paramInt == 3))
        {
          this.guw.put(???, paramString);
          break;
        }
        if (paramInt == 4)
        {
          this.guw.put(???, "@__classify_timeline");
          break;
        }
        if (paramInt == 5)
        {
          this.guw.put(???, "");
          break;
        }
        this.guw.put(???, "");
        break;
        synchronized (this.pvw)
        {
          this.pvw.put(paramString, Long.valueOf(0L));
        }
        synchronized (this.pvx)
        {
          if (!this.pvx.containsKey(paramString)) {
            this.pvx.put(paramString, Integer.valueOf(bjC()));
          }
          z.Hp(paramString);
          this.pvA.add(paramString);
          GMTrace.o(18586336755712L, 138479);
          return;
          paramString = finally;
          throw paramString;
        }
        this.pvz = 0L;
        this.pvy = bjC();
        x.Hm("@__weixintimtline");
      }
    }
    
    public final void a(int paramInt1, String paramString, boolean paramBoolean, int paramInt2)
    {
      GMTrace.i(8145137041408L, 60686);
      if (r.hjQ)
      {
        GMTrace.o(8145137041408L, 60686);
        return;
      }
      w.d("MicroMsg.SnsService", "doFpList type: %s, objectId: %s", new Object[] { Integer.valueOf(paramInt1), paramString });
      if (paramInt1 == 2)
      {
        if (!z.Ho(paramString))
        {
          GMTrace.o(8145137041408L, 60686);
          return;
        }
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.a(new z(paramString, 0L, paramBoolean, paramInt2), 0);
        GMTrace.o(8145137041408L, 60686);
        return;
      }
      if (paramInt1 == 1)
      {
        if (!x.Hl("@__weixintimtline"))
        {
          GMTrace.o(8145137041408L, 60686);
          return;
        }
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xy().xh().set(68377, "");
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.a(new x(0L), 0);
        GMTrace.o(8145137041408L, 60686);
        return;
      }
      if ((paramInt1 != 3) && (paramInt1 == 4))
      {
        if (!m.Hl("@__classify_timeline"))
        {
          GMTrace.o(8145137041408L, 60686);
          return;
        }
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.a(new m(""), 0);
      }
      GMTrace.o(8145137041408L, 60686);
    }
    
    public final boolean a(h.a parama, int paramInt)
    {
      GMTrace.i(18586470973440L, 138480);
      w.d("MicroMsg.SnsService", "closeServer");
      this.guw.remove(parama);
      if ((paramInt == 2) && (this.pvA.size() > 0)) {
        this.pvA.removeLast();
      }
      if (this.guw.isEmpty())
      {
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.b(211, this);
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.b(212, this);
        am.release();
        com.tencent.mm.plugin.sns.storage.m.release();
        new com.tencent.mm.sdk.platformtools.ae(Looper.getMainLooper()).postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(8047158099968L, 59956);
            al.a locala = al.a.this;
            if ((!ae.biM()) && (locala.guw.isEmpty()))
            {
              ae.bja().bis();
              w.d("MicroMsg.SnsService", "clean sns cache");
            }
            GMTrace.o(8047158099968L, 59956);
          }
        }, 5000L);
        ai.bjw();
        w.i("MicroMsg.SnsService", "close finish");
      }
      GMTrace.o(18586470973440L, 138480);
      return true;
    }
    
    public final void b(int paramInt1, String paramString, boolean paramBoolean, int paramInt2)
    {
      GMTrace.i(8145002823680L, 60685);
      if (r.hjQ)
      {
        GMTrace.o(8145002823680L, 60685);
        return;
      }
      synchronized (this.pvw)
      {
        w.d("MicroMsg.SnsService", "DO NP　NP ~_~ %s type %s timeLastId: %s userLastIds: %s", new Object[] { paramString, Integer.valueOf(paramInt1), Long.valueOf(this.pvz), this.pvw });
        if (paramInt1 != 2) {
          break label218;
        }
        if (!z.Ho(paramString))
        {
          GMTrace.o(8145002823680L, 60685);
          return;
        }
      }
      long l = 0L;
      synchronized (this.pvw)
      {
        if (this.pvw.containsKey(paramString)) {
          l = ((Long)this.pvw.get(paramString)).longValue();
        }
        if (l == 0L)
        {
          x.Hm(paramString);
          GMTrace.o(8145002823680L, 60685);
          return;
        }
      }
      com.tencent.mm.kernel.h.xz();
      com.tencent.mm.kernel.h.xx().fYr.a(new z(paramString, l, paramBoolean, paramInt2), 0);
      GMTrace.o(8145002823680L, 60685);
      return;
      label218:
      if (paramInt1 == 1)
      {
        if (!x.Hl("@__weixintimtline"))
        {
          GMTrace.o(8145002823680L, 60685);
          return;
        }
        if (this.pvz == 0L)
        {
          x.Hm("@__weixintimtline");
          GMTrace.o(8145002823680L, 60685);
          return;
        }
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.a(new x(this.pvz), 0);
        GMTrace.o(8145002823680L, 60685);
        return;
      }
      if ((paramInt1 != 3) && (paramInt1 == 4))
      {
        if (!m.Hl("@__classify_timeline"))
        {
          GMTrace.o(8145002823680L, 60685);
          return;
        }
        if (this.pvz == 0L)
        {
          m.Hm("@__classify_timeline");
          GMTrace.o(8145002823680L, 60685);
          return;
        }
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.a(new m(""), 0);
      }
      GMTrace.o(8145002823680L, 60685);
    }
    
    public final int bjC()
    {
      GMTrace.i(8145405476864L, 60688);
      if (this.pvy > 0)
      {
        i = this.pvy;
        GMTrace.o(8145405476864L, 60688);
        return i;
      }
      int i = com.tencent.mm.plugin.sns.data.i.bhT();
      GMTrace.o(8145405476864L, 60688);
      return i;
    }
    
    public final Intent f(Intent paramIntent, String paramString)
    {
      GMTrace.i(8144600170496L, 60682);
      paramIntent.putExtra("sns_userName", paramString);
      if ((this.pvA != null) && (this.pvA.contains(paramString)))
      {
        paramIntent.addFlags(536870912);
        paramIntent.addFlags(67108864);
        GMTrace.o(8144600170496L, 60682);
        return paramIntent;
      }
      GMTrace.o(8144600170496L, 60682);
      return paramIntent;
    }
    
    public final void g(String paramString, ArrayList<com.tencent.mm.plugin.sns.g.b> paramArrayList)
    {
      GMTrace.i(8144465952768L, 60681);
      this.pvB.put(paramString, paramArrayList);
      GMTrace.o(8144465952768L, 60681);
    }
    
    public final void w(long paramLong, int paramInt)
    {
      GMTrace.i(8145539694592L, 60689);
      w.d("MicroMsg.SnsService", "setTimeLastId %d", new Object[] { Long.valueOf(paramLong) });
      if (paramInt > 0)
      {
        this.pvy = paramInt;
        com.tencent.mm.plugin.sns.data.i.ui(paramInt);
      }
      if (paramLong == 0L)
      {
        GMTrace.o(8145539694592L, 60689);
        return;
      }
      this.pvz = paramLong;
      GMTrace.o(8145539694592L, 60689);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */