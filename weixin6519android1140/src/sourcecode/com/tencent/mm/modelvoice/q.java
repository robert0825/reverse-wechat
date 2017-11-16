package com.tencent.mm.modelvoice;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.d.a;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.e.b.i;
import com.tencent.mm.g.a.ip;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.j.a.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.messenger.foundation.a.a.c;
import com.tencent.mm.plugin.report.d;
import com.tencent.mm.protocal.c.bu;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.bc.b;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;

public final class q
{
  private static HashMap<String, WeakReference<com.tencent.mm.ad.h>> heu;
  
  static
  {
    GMTrace.i(14301033136128L, 106551);
    heu = new HashMap();
    GMTrace.o(14301033136128L, 106551);
  }
  
  public static float A(au paramau)
  {
    GMTrace.i(14300764700672L, 106549);
    if ((paramau != null) && (paramau.bTu())) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      float f2 = (float)new n(paramau.field_content).time / 1000.0F;
      float f1 = f2;
      if (f2 < 1.0F) {
        f1 = 1.0F;
      }
      f1 = Math.round(f1 * 10.0F) / 10.0F;
      GMTrace.o(14300764700672L, 106549);
      return f1;
    }
  }
  
  public static boolean B(au paramau)
  {
    GMTrace.i(549084725248L, 4091);
    if ((paramau == null) || (!paramau.bTu()))
    {
      GMTrace.o(549084725248L, 4091);
      return false;
    }
    boolean bool = new n(paramau.field_content).hco;
    GMTrace.o(549084725248L, 4091);
    return bool;
  }
  
  public static boolean C(au paramau)
  {
    GMTrace.i(549218942976L, 4092);
    if ((paramau == null) || (!paramau.bTu()) || (paramau.field_isSend == 1))
    {
      GMTrace.o(549218942976L, 4092);
      return false;
    }
    if (new n(paramau.field_content).time == 0L)
    {
      GMTrace.o(549218942976L, 4092);
      return true;
    }
    GMTrace.o(549218942976L, 4092);
    return false;
  }
  
  public static void D(au paramau)
  {
    GMTrace.i(549353160704L, 4093);
    if ((paramau == null) || (!paramau.bTu()))
    {
      GMTrace.o(549353160704L, 4093);
      return;
    }
    Object localObject = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(paramau.field_msgId);
    if (((ce)localObject).field_msgId != paramau.field_msgId)
    {
      GMTrace.o(549353160704L, 4093);
      return;
    }
    localObject = new n(((ce)localObject).field_content);
    if (((n)localObject).hco)
    {
      GMTrace.o(549353160704L, 4093);
      return;
    }
    ((n)localObject).hco = true;
    StringBuilder localStringBuilder = new StringBuilder().append(((n)localObject).hcn).append(":").append(((n)localObject).time).append(":");
    if (((n)localObject).hco) {}
    for (int i = 1;; i = 0)
    {
      paramau.setContent(i + "\n");
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a(paramau.field_msgId, paramau);
      GMTrace.o(549353160704L, 4093);
      return;
    }
  }
  
  public static String H(String paramString, boolean paramBoolean)
  {
    GMTrace.i(547339894784L, 4078);
    g.a locala = new g.a();
    String str = com.tencent.mm.sdk.platformtools.h.a(yY(), "msg_", paramString, ".amr", 2);
    w.i("MicroMsg.VoiceLogic", "getAmrFullPath cost: " + locala.tD());
    if (bg.nm(str))
    {
      GMTrace.o(547339894784L, 4078);
      return null;
    }
    if (paramBoolean)
    {
      GMTrace.o(547339894784L, 4078);
      return str;
    }
    if (new File(str).exists())
    {
      GMTrace.o(547339894784L, 4078);
      return str;
    }
    paramString = yX() + paramString;
    if (new File(paramString + ".amr").exists()) {
      j.r(paramString + ".amr", str, true);
    }
    for (;;)
    {
      GMTrace.o(547339894784L, 4078);
      return str;
      if (new File(paramString).exists()) {
        j.r(paramString, str, true);
      }
    }
  }
  
  public static List<p> NP()
  {
    GMTrace.i(14300630482944L, 106548);
    Object localObject1 = m.NK();
    Object localObject2 = "SELECT FileName, User, MsgId, NetOffset, FileNowSize, TotalLen, Status, CreateTime, LastModifyTime, ClientId, VoiceLength, MsgLocalId, Human, reserved1, reserved2, MsgSource, MsgFlag, MsgSeq, MasterBufId" + " FROM voiceinfo";
    localObject2 = (String)localObject2 + " WHERE Status<97 and User!=\"_USER_FOR_THROWBOTTLE_\"   order by CreateTime";
    localObject2 = ((u)localObject1).goN.a((String)localObject2, null, 2);
    int i = 0;
    int j;
    if (((Cursor)localObject2).moveToFirst())
    {
      localObject1 = new ArrayList();
      do
      {
        p localp = new p();
        localp.b((Cursor)localObject2);
        ((List)localObject1).add(localp);
        j = i + 1;
        i = j;
      } while (((Cursor)localObject2).moveToNext());
    }
    for (;;)
    {
      w.d("MicroMsg.VoiceStorage", "getUnfinishInfo resCount:" + j);
      ((Cursor)localObject2).close();
      GMTrace.o(14300630482944L, 106548);
      return (List<p>)localObject1;
      j = 0;
      localObject1 = null;
    }
  }
  
  public static boolean Q(String paramString, int paramInt)
  {
    GMTrace.i(14299690958848L, 106541);
    boolean bool = j(paramString, paramInt, 0);
    GMTrace.o(14299690958848L, 106541);
    return bool;
  }
  
  public static int a(p paramp, byte[] paramArrayOfByte, int paramInt, String paramString1, String paramString2, d.a parama)
  {
    GMTrace.i(14299959394304L, 106543);
    g.a locala = new g.a();
    p localp = m.NK().aE(paramp.eSf);
    if ((localp != null) && (localp.status == 99))
    {
      GMTrace.o(14299959394304L, 106543);
      return 0;
    }
    if ((((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().B(paramp.eQu, paramp.eSf).field_msgSvrId == paramp.eSf) && (localp == null))
    {
      GMTrace.o(14299959394304L, 106543);
      return 0;
    }
    boolean bool1;
    String str1;
    String str2;
    int i;
    if (localp != null)
    {
      paramp.euR = localp.euR;
      paramp.eQl |= 0x1;
      w.d("MicroMsg.VoiceLogic", com.tencent.mm.compatible.util.g.tC() + "checktime :" + locala.tD());
      boolean bool2 = false;
      bool1 = bool2;
      if (paramArrayOfByte != null)
      {
        bool1 = bool2;
        if (paramArrayOfByte.length > 1)
        {
          if (localp != null) {
            w.e("MicroMsg.VoiceLogic", "Sync Voice Buf , But  VoiceInfo is not new !");
          }
          str1 = paramp.hdk;
          str2 = paramp.euR;
          i = ap(str1, str2).write(paramArrayOfByte, paramArrayOfByte.length, 0);
          if (i >= 0) {
            break label630;
          }
          w.e("MicroMsg.VoiceLogic", "Write Failed File:" + str2 + " newOffset:" + i + " voiceFormat:" + str1);
          bool1 = false;
        }
      }
      label285:
      w.d("MicroMsg.VoiceLogic", com.tencent.mm.compatible.util.g.tC() + "checktime :" + locala.tD());
      paramp.hct = (System.currentTimeMillis() / 1000L);
      paramp.eQl |= 0x100;
      if (!bool1) {
        break label755;
      }
      paramp.status = 99;
    }
    for (;;)
    {
      paramp.eQl |= 0x40;
      if (localp != null) {
        break label830;
      }
      if (bool1) {
        paramp.hcw = ((int)a(paramp, bool1, paramInt, paramString1, paramString2, parama));
      }
      if (parama != null)
      {
        paramp.fwu = bc.c(parama);
        if (parama.gtM != null) {
          paramp.gLK = parama.gtM.tQe;
        }
      }
      w.d("MicroMsg.VoiceLogic", com.tencent.mm.compatible.util.g.tC() + "checktime :" + locala.tD());
      paramp.eQl = -1;
      w.d("MicroMsg.VoiceLogic", "Insert fileName:" + paramp.euR + " stat:" + paramp.status + " net:" + paramp.hbc + " total:" + paramp.gsL);
      if (m.NK().b(paramp)) {
        break label779;
      }
      w.d("MicroMsg.VoiceLogic", "Insert Error fileName:" + paramp.euR + " stat:" + paramp.status + " net:" + paramp.hbc + " total:" + paramp.gsL);
      GMTrace.o(14299959394304L, 106543);
      return -2;
      paramp.euR = u.mU(paramp.hcn);
      break;
      label630:
      if (paramArrayOfByte.length != i)
      {
        w.e("MicroMsg.VoiceLogic", "Write File:" + str2 + " fileOff:" + i + " bufLen:" + paramArrayOfByte.length + " voiceFormat:" + str1);
        bool1 = false;
        break label285;
      }
      w.i("MicroMsg.VoiceLogic", "writeVoiceFile file:[" + str2 + "] + buf:" + paramArrayOfByte.length + " voiceFormat:" + str1);
      mL(str2);
      bool1 = true;
      break label285;
      label755:
      if (paramp.gsL == 0) {
        paramp.status = 5;
      } else {
        paramp.status = 6;
      }
    }
    label779:
    w.d("MicroMsg.VoiceLogic", com.tencent.mm.compatible.util.g.tC() + "checktime :" + locala.tD());
    if (bool1)
    {
      GMTrace.o(14299959394304L, 106543);
      return 1;
      label830:
      w.d("MicroMsg.VoiceLogic", "Sync Update file:" + paramp.euR + " stat:" + paramp.status);
      if (!a(paramp))
      {
        GMTrace.o(14299959394304L, 106543);
        return -44;
      }
      if (bool1)
      {
        a(paramp, parama);
        GMTrace.o(14299959394304L, 106543);
        return 1;
      }
    }
    if ((localp != null) && (localp.hcp == paramp.gsL))
    {
      a(localp.euR, localp.hcp, parama);
      w.w("MicroMsg.VoiceLogic", "Sync TotalLen not Change (send endflag but TotoalLen == FileLen) :" + localp.euR);
    }
    w.i("MicroMsg.VoiceLogic", "summerbadcr setRecvSync end ret 0 and start run addMsgInfo[%s], syncWithBufSucc[%b], stack[%s]", new Object[] { parama, Boolean.valueOf(bool1), bg.bQW() });
    m.NM().run();
    GMTrace.o(14299959394304L, 106543);
    return 0;
  }
  
  public static int a(String paramString1, int paramInt1, long paramLong, String paramString2, int paramInt2, int paramInt3)
  {
    GMTrace.i(14299825176576L, 106542);
    if (paramString1 == null)
    {
      GMTrace.o(14299825176576L, 106542);
      return -1;
    }
    w.d("MicroMsg.VoiceLogic", "dkmsgid UpdateAfterSend file:[" + paramString1 + "] newOff:" + paramInt1 + " SvrID:" + paramLong + " clientID:" + paramString2 + " hasSendEndFlag " + paramInt2);
    p localp = m.NK().mV(paramString1);
    if (localp == null)
    {
      GMTrace.o(14299825176576L, 106542);
      return -1;
    }
    localp.hbc = paramInt1;
    localp.hct = (System.currentTimeMillis() / 1000L);
    localp.eQl = 264;
    if ((bg.nm(localp.clientId)) && (paramString2 != null))
    {
      localp.clientId = paramString2;
      localp.eQl |= 0x200;
    }
    if ((localp.eSf == 0L) && (paramLong != 0L))
    {
      localp.eSf = paramLong;
      localp.eQl |= 0x4;
    }
    int j = 0;
    int i = j;
    if (localp.gsL <= paramInt1)
    {
      i = j;
      if (localp.status == 3)
      {
        i = j;
        if (paramInt2 == 1)
        {
          localp.status = 99;
          localp.eQl |= 0x40;
          paramString2 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(localp.hcw);
          paramString2.db(localp.eQu);
          paramString2.D(localp.eSf);
          paramString2.dB(2);
          paramString2.setContent(n.b(localp.hcn, localp.hes, false));
          paramString2.Aw(paramInt3);
          ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a(localp.hcw, paramString2);
          w.d("MicroMsg.VoiceLogic", "END!!! updateSend  file:" + paramString1 + " total:" + localp.gsL + " status:" + localp.status + " netTimes:" + localp.hcx + " msgId:" + paramString2.field_msgId);
          i = 1;
          mL(paramString1);
        }
      }
    }
    if (!a(localp))
    {
      GMTrace.o(14299825176576L, 106542);
      return -4;
    }
    GMTrace.o(14299825176576L, 106542);
    return i;
  }
  
  public static int a(String paramString, int paramInt, d.a parama)
  {
    GMTrace.i(548413636608L, 4086);
    if (paramString == null)
    {
      GMTrace.o(548413636608L, 4086);
      return -1;
    }
    p localp = m.NK().mV(paramString);
    if (localp == null)
    {
      GMTrace.o(548413636608L, 4086);
      return -1;
    }
    localp.hcp = paramInt;
    localp.hct = (System.currentTimeMillis() / 1000L);
    localp.eQl = 272;
    int j = 0;
    int i = j;
    if (localp.gsL > 0)
    {
      i = j;
      if (paramInt >= localp.gsL)
      {
        a(localp, parama);
        localp.status = 99;
        localp.eQl |= 0x40;
        w.d("MicroMsg.VoiceLogic", "END!!! updateRecv  file:" + paramString + " newsize:" + paramInt + " total:" + localp.gsL + " status:" + localp.status + " netTimes:" + localp.hcx);
        i = 1;
        mL(paramString);
      }
    }
    w.d("MicroMsg.VoiceLogic", "updateRecv file:" + paramString + " newsize:" + paramInt + " total:" + localp.gsL + " status:" + localp.status);
    if (!a(localp))
    {
      GMTrace.o(548413636608L, 4086);
      return -3;
    }
    GMTrace.o(548413636608L, 4086);
    return i;
  }
  
  private static long a(p paramp, boolean paramBoolean, int paramInt, String paramString1, String paramString2, d.a parama)
  {
    GMTrace.i(548279418880L, 4085);
    if (((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cO(paramp.eSf))
    {
      w.i("MicroMsg.VoiceLogic", "[oneliang] msg svrid:%s,it is in delete msg list,may be revoke msg come first,msg info insert last,so no need to add msg info and delete voice info", new Object[] { Long.valueOf(paramp.eSf) });
      if (bg.nl(paramp.euR).length() > 0) {
        m.NK().hB(paramp.euR);
      }
      for (;;)
      {
        GMTrace.o(548279418880L, 4085);
        return -1L;
        w.i("MicroMsg.VoiceLogic", "[oneliang] the length of voice info file name is zero");
      }
    }
    au localau = new au();
    localau.D(paramp.eSf);
    localau.dc(paramp.euR);
    localau.E(bc.k(paramp.eQu, paramp.hcs));
    localau.db(paramp.eQu);
    int i;
    if (com.tencent.mm.y.q.fp(paramp.hcn))
    {
      i = 1;
      localau.dC(i);
      localau.setType(34);
      localau.dg(paramString1);
      localau.Aw(paramp.hdr);
      localau.dB(paramInt);
      if (parama != null) {
        break label567;
      }
      paramInt = paramp.fwu;
      if (paramInt != 0)
      {
        w.i("MicroMsg.VoiceLogic", "summerbadcr createMsgInfo flag has set[%d]", new Object[] { Integer.valueOf(paramInt) });
        localau.dL(paramInt);
        if ((localau.field_msgId == 0L) && (localau.field_isSend == 0) && ((paramInt & 0x2) != 0)) {
          localau.E(bc.a(localau.field_talker, paramp.hcs, true, localau.field_msgSeq));
        }
      }
      if (paramp.gLK != 0) {
        localau.G(paramp.gLK);
      }
      w.i("MicroMsg.VoiceLogic", "summerbadcr insert voice addMsgInfo is null but flag[%d], msgSeq[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramp.gLK) });
      label336:
      w.i("MicroMsg.VoiceLogic", "summerbadcr create voice msg info, msgSource : %s", new Object[] { paramString2 });
      if (!bg.nm(paramString2))
      {
        localau.dh(paramString2);
        localau.di(bc.gU(paramString2));
      }
      if (paramBoolean) {
        break label577;
      }
      localau.setContent(n.b(paramp.hcn, 0L, false));
    }
    for (;;)
    {
      if (!bg.nm(paramString2))
      {
        localau.dh(paramString2);
        localau.di(bc.gU(paramString2));
        paramp = bc.gT(paramString2);
        if (paramp != null)
        {
          localau.di(paramp.gnT);
          localau.df(paramp.gnS);
          w.i("MicroMsg.VoiceLogic", "bizClientMsgId = %s", new Object[] { paramp.gnS });
          if (paramp.gnU != null)
          {
            paramString1 = new ip();
            paramString1.eMb.eAH = localau;
            paramString1.eMb.eMc = paramp;
            com.tencent.mm.sdk.b.a.vgX.m(paramString1);
          }
        }
      }
      w.i("MicroMsg.VoiceLogic", "summerbadcr parseVoiceMsg svrId[%d], msgseq[%d]", new Object[] { Long.valueOf(localau.field_msgSvrId), Long.valueOf(localau.field_msgSeq) });
      long l = bc.i(localau);
      GMTrace.o(548279418880L, 4085);
      return l;
      i = 0;
      break;
      label567:
      bc.a(localau, parama);
      break label336;
      label577:
      localau.setContent(n.b(paramp.hcn, paramp.hes, false));
    }
  }
  
  private static boolean a(p paramp)
  {
    GMTrace.i(548816289792L, 4089);
    if (paramp == null)
    {
      GMTrace.o(548816289792L, 4089);
      return false;
    }
    if (paramp.eQl == -1)
    {
      GMTrace.o(548816289792L, 4089);
      return false;
    }
    boolean bool = m.NK().a(paramp.euR, paramp);
    GMTrace.o(548816289792L, 4089);
    return bool;
  }
  
  private static boolean a(p paramp, d.a parama)
  {
    GMTrace.i(548145201152L, 4084);
    try
    {
      paramp.hcw = ((int)a(paramp, true, 3, "", paramp.fwv, parama));
      paramp.eQl |= 0x800;
      boolean bool = a(paramp);
      GMTrace.o(548145201152L, 4084);
      return bool;
    }
    catch (Exception paramp)
    {
      w.e("MicroMsg.VoiceLogic", "exception:%s", new Object[] { bg.f(paramp) });
      GMTrace.o(548145201152L, 4084);
    }
    return false;
  }
  
  public static boolean a(String paramString, com.tencent.mm.ad.h paramh)
  {
    GMTrace.i(14299422523392L, 106539);
    if (paramString == null)
    {
      GMTrace.o(14299422523392L, 106539);
      return false;
    }
    p localp = m.NK().mV(paramString);
    if (localp == null)
    {
      w.d("MicroMsg.VoiceLogic", "startSend null record : " + paramString);
      GMTrace.o(14299422523392L, 106539);
      return false;
    }
    if (localp.status != 1)
    {
      GMTrace.o(14299422523392L, 106539);
      return false;
    }
    localp.status = 2;
    localp.eQl = 64;
    heu.put(paramString, new WeakReference(paramh));
    boolean bool = a(localp);
    GMTrace.o(14299422523392L, 106539);
    return bool;
  }
  
  public static float aD(long paramLong)
  {
    float f2 = 60.0F;
    float f1 = 1.0F;
    GMTrace.i(548950507520L, 4090);
    float f3 = (float)paramLong / 1000.0F;
    if (f3 < 1.0F) {}
    for (;;)
    {
      if (f1 > 60.0F) {
        f1 = f2;
      }
      for (;;)
      {
        f1 = Math.round(f1);
        GMTrace.o(548950507520L, 4090);
        return f1;
      }
      f1 = f3;
    }
  }
  
  public static b ap(String paramString1, String paramString2)
  {
    GMTrace.i(546803023872L, 4074);
    u localu = m.NK();
    paramString2 = getFullPath(paramString2);
    switch (bg.getInt(paramString1, -1))
    {
    case 2: 
    case 3: 
    default: 
      if (localu.heD.get(paramString2) == null) {
        localu.heD.put(paramString2, new a(paramString2));
      }
      paramString1 = (b)localu.heD.get(paramString2);
      GMTrace.o(546803023872L, 4074);
      return paramString1;
    case 4: 
      if (localu.heF.get(paramString2) == null) {
        localu.heF.put(paramString2, new h(paramString2));
      }
      paramString1 = (b)localu.heF.get(paramString2);
      GMTrace.o(546803023872L, 4074);
      return paramString1;
    }
    if (localu.heE.get(paramString2) == null) {
      localu.heE.put(paramString2, new l(paramString2));
    }
    paramString1 = (b)localu.heE.get(paramString2);
    GMTrace.o(546803023872L, 4074);
    return paramString1;
  }
  
  public static String e(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(548547854336L, 4087);
    if (bg.nm(paramString1))
    {
      GMTrace.o(548547854336L, 4087);
      return null;
    }
    if ((!bg.nm(paramString2)) && (!paramString2.startsWith("amr_")) && (!paramString2.startsWith("spx_"))) {
      paramString2.startsWith("silk_");
    }
    paramString1 = mM(paramString1);
    if (bg.nm(paramString1))
    {
      GMTrace.o(548547854336L, 4087);
      return null;
    }
    if (!j.r(getFullPath(paramString2), getFullPath(paramString1), false))
    {
      GMTrace.o(548547854336L, 4087);
      return null;
    }
    j(paramString1, paramInt, 1);
    GMTrace.o(548547854336L, 4087);
    return paramString1;
  }
  
  public static String getFullPath(String paramString)
  {
    GMTrace.i(547205677056L, 4077);
    if (bg.nm(paramString))
    {
      GMTrace.o(547205677056L, 4077);
      return null;
    }
    paramString = H(paramString, false);
    GMTrace.o(547205677056L, 4077);
    return paramString;
  }
  
  public static int hp(int paramInt)
  {
    GMTrace.i(14299288305664L, 106538);
    paramInt = (paramInt - 6) / 32;
    GMTrace.o(14299288305664L, 106538);
    return paramInt * 20;
  }
  
  public static boolean hq(int paramInt)
  {
    GMTrace.i(14300227829760L, 106545);
    au localau = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(paramInt);
    if ((localau.field_msgId == 0L) || (localau.field_imgPath == null))
    {
      GMTrace.o(14300227829760L, 106545);
      return false;
    }
    if (bg.nm(localau.field_imgPath))
    {
      GMTrace.o(14300227829760L, 106545);
      return false;
    }
    Object localObject = localau.field_imgPath;
    localObject = m.NK().mV((String)localObject);
    if ((localObject == null) || (bg.nm(((p)localObject).euR)))
    {
      GMTrace.o(14300227829760L, 106545);
      return false;
    }
    ((p)localObject).status = 3;
    ((p)localObject).hbc = 0;
    ((p)localObject).hcs = (System.currentTimeMillis() / 1000L);
    ((p)localObject).hct = (System.currentTimeMillis() / 1000L);
    ((p)localObject).eQl = 8648;
    boolean bool = a((p)localObject);
    w.d("MicroMsg.VoiceLogic", " file:" + ((p)localObject).euR + " msgid:" + ((p)localObject).hcw + "  stat:" + ((p)localObject).status);
    if ((((p)localObject).hcw == 0) || (bg.nm(((p)localObject).eQu)))
    {
      w.e("MicroMsg.VoiceLogic", " failed msg id:" + ((p)localObject).hcw + " user:" + ((p)localObject).eQu);
      GMTrace.o(14300227829760L, 106545);
      return bool;
    }
    localau.dB(1);
    ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a(localau.field_msgId, localau);
    m.NM().run();
    GMTrace.o(14300227829760L, 106545);
    return true;
  }
  
  private static boolean j(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(548010983424L, 4083);
    if (paramString == null)
    {
      GMTrace.o(548010983424L, 4083);
      return false;
    }
    w.d("MicroMsg.VoiceLogic", "StopRecord fileName[" + paramString + "], fullPath[" + getFullPath(paramString) + "]");
    p localp = m.NK().mV(paramString);
    if (localp == null)
    {
      GMTrace.o(548010983424L, 4083);
      return false;
    }
    if ((localp.status != 97) && (localp.status != 98)) {
      localp.status = 3;
    }
    localp.gsL = o.mm(paramString);
    if (localp.gsL <= 0)
    {
      mp(paramString);
      GMTrace.o(548010983424L, 4083);
      return false;
    }
    localp.hct = (System.currentTimeMillis() / 1000L);
    localp.hes = paramInt1;
    localp.eQl = 3424;
    au localau = new au();
    localau.db(localp.eQu);
    localau.setType(34);
    localau.dC(1);
    localau.dc(paramString);
    if (localp.status == 97)
    {
      localau.dB(2);
      localau.setContent(n.b(localp.hcn, localp.hes, false));
    }
    for (;;)
    {
      localau.E(bc.gR(localp.eQu));
      localau.Aw(paramInt2);
      a.a.sa().b(localau);
      localp.hcw = ((int)bc.i(localau));
      boolean bool = a(localp);
      heu.remove(paramString);
      GMTrace.o(548010983424L, 4083);
      return bool;
      if (localp.status == 98)
      {
        localau.dB(5);
        localau.setContent(n.b(localp.hcn, -1L, true));
      }
      else
      {
        localau.dB(1);
        localau.setContent(n.b(localp.hcn, localp.hes, false));
      }
    }
  }
  
  public static boolean mJ(String paramString)
  {
    GMTrace.i(546668806144L, 4073);
    if (paramString == null)
    {
      GMTrace.o(546668806144L, 4073);
      return false;
    }
    paramString = m.NK().mV(paramString);
    if (paramString == null)
    {
      GMTrace.o(546668806144L, 4073);
      return false;
    }
    if (paramString.hcx >= 250)
    {
      GMTrace.o(546668806144L, 4073);
      return false;
    }
    paramString.hcx += 1;
    paramString.eQl = 8192;
    boolean bool = a(paramString);
    GMTrace.o(546668806144L, 4073);
    return bool;
  }
  
  public static b mK(String paramString)
  {
    GMTrace.i(546937241600L, 4075);
    u localu = m.NK();
    String str = getFullPath(paramString);
    switch (o.mH(paramString))
    {
    default: 
      if (localu.heD.get(str) == null) {
        localu.heD.put(str, new a(str));
      }
      paramString = (b)localu.heD.get(str);
      GMTrace.o(546937241600L, 4075);
      return paramString;
    case 0: 
      if (localu.heD.get(str) == null) {
        localu.heD.put(str, new a(str));
      }
      paramString = (b)localu.heD.get(str);
      GMTrace.o(546937241600L, 4075);
      return paramString;
    case 1: 
      if (localu.heE.get(str) == null) {
        localu.heE.put(str, new l(str));
      }
      paramString = (b)localu.heE.get(str);
      GMTrace.o(546937241600L, 4075);
      return paramString;
    }
    if (localu.heF.get(str) == null) {
      localu.heF.put(str, new h(str));
    }
    paramString = (b)localu.heF.get(str);
    GMTrace.o(546937241600L, 4075);
    return paramString;
  }
  
  public static void mL(String paramString)
  {
    GMTrace.i(547071459328L, 4076);
    u localu = m.NK();
    String str = getFullPath(paramString);
    switch (o.mH(paramString))
    {
    default: 
      paramString = (a)localu.heD.get(str);
      if (paramString != null)
      {
        paramString.NG();
        localu.heD.remove(str);
      }
      GMTrace.o(547071459328L, 4076);
      return;
    case 0: 
      paramString = (a)localu.heD.get(str);
      if (paramString != null)
      {
        paramString.NG();
        localu.heD.remove(str);
      }
      GMTrace.o(547071459328L, 4076);
      return;
    case 1: 
      paramString = (l)localu.heE.get(str);
      if (paramString != null)
      {
        paramString.NG();
        localu.heE.remove(str);
      }
      GMTrace.o(547071459328L, 4076);
      return;
    }
    paramString = (h)localu.heF.get(str);
    if (paramString != null)
    {
      paramString.NG();
      localu.heF.remove(str);
    }
    GMTrace.o(547071459328L, 4076);
  }
  
  public static String mM(String paramString)
  {
    GMTrace.i(547474112512L, 4079);
    String str = u.mU(com.tencent.mm.y.q.zE());
    p localp = new p();
    localp.euR = str;
    localp.eQu = paramString;
    localp.hcs = (System.currentTimeMillis() / 1000L);
    localp.clientId = str;
    localp.hct = (System.currentTimeMillis() / 1000L);
    localp.status = 1;
    localp.hcn = com.tencent.mm.y.q.zE();
    localp.eQl = -1;
    if (!m.NK().b(localp))
    {
      GMTrace.o(547474112512L, 4079);
      return null;
    }
    w.i("MicroMsg.VoiceLogic", "startRecord insert voicestg success");
    GMTrace.o(547474112512L, 4079);
    return str;
  }
  
  public static boolean mN(String paramString)
  {
    GMTrace.i(14299556741120L, 106540);
    if (paramString == null)
    {
      GMTrace.o(14299556741120L, 106540);
      return false;
    }
    w.d("MicroMsg.VoiceLogic", "Mark Canceled fileName[" + paramString + "]");
    p localp = m.NK().mV(paramString);
    if (localp == null)
    {
      GMTrace.o(14299556741120L, 106540);
      return false;
    }
    localp.status = 8;
    localp.gsL = o.mm(paramString);
    localp.eQl = 64;
    boolean bool = a(localp);
    GMTrace.o(14299556741120L, 106540);
    return bool;
  }
  
  public static boolean mO(String paramString)
  {
    GMTrace.i(547608330240L, 4080);
    if (paramString == null)
    {
      GMTrace.o(547608330240L, 4080);
      return false;
    }
    p localp = m.NK().mV(paramString);
    if (localp == null)
    {
      w.d("MicroMsg.VoiceLogic", "cancel null download : " + paramString);
      GMTrace.o(547608330240L, 4080);
      return true;
    }
    w.d("MicroMsg.VoiceLogic", "cancel download : " + paramString + " SvrlId:" + localp.eSf);
    if (localp.eSf != 0L) {
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().I(localp.eQu, localp.eSf);
    }
    boolean bool = mQ(paramString);
    GMTrace.o(547608330240L, 4080);
    return bool;
  }
  
  public static boolean mP(String paramString)
  {
    GMTrace.i(547742547968L, 4081);
    if (paramString == null)
    {
      GMTrace.o(547742547968L, 4081);
      return false;
    }
    p localp = m.NK().mV(paramString);
    if (localp == null)
    {
      w.i("MicroMsg.VoiceLogic", "cancel null record : " + paramString);
      GMTrace.o(547742547968L, 4081);
      return true;
    }
    w.i("MicroMsg.VoiceLogic", "cancel record : " + paramString + " LocalId:" + localp.hcw);
    if (localp.hcw != 0) {
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cN(localp.hcw);
    }
    boolean bool = mQ(paramString);
    GMTrace.o(547742547968L, 4081);
    return bool;
  }
  
  public static boolean mQ(String paramString)
  {
    GMTrace.i(547876765696L, 4082);
    if (bg.nm(paramString))
    {
      GMTrace.o(547876765696L, 4082);
      return false;
    }
    m.NK().hB(paramString);
    mL(paramString);
    boolean bool = new File(getFullPath(paramString)).delete();
    GMTrace.o(547876765696L, 4082);
    return bool;
  }
  
  public static au mR(String paramString)
  {
    GMTrace.i(14300362047488L, 106546);
    if (paramString == null)
    {
      GMTrace.o(14300362047488L, 106546);
      return null;
    }
    paramString = m.NK().mV(paramString);
    if (paramString == null)
    {
      GMTrace.o(14300362047488L, 106546);
      return null;
    }
    paramString = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(paramString.hcw);
    GMTrace.o(14300362047488L, 106546);
    return paramString;
  }
  
  public static p mS(String paramString)
  {
    GMTrace.i(15659853414400L, 116675);
    paramString = m.NK().mV(paramString);
    GMTrace.o(15659853414400L, 116675);
    return paramString;
  }
  
  public static int mT(String paramString)
  {
    GMTrace.i(14300898918400L, 106550);
    if (heu.get(paramString) != null)
    {
      paramString = (com.tencent.mm.ad.h)((WeakReference)heu.get(paramString)).get();
      if (paramString != null)
      {
        int i = (int)paramString.qD();
        GMTrace.o(14300898918400L, 106550);
        return i;
      }
    }
    GMTrace.o(14300898918400L, 106550);
    return -1;
  }
  
  public static boolean mp(String paramString)
  {
    GMTrace.i(548682072064L, 4088);
    com.tencent.mm.plugin.report.service.g.ork.a(111L, 234L, 1L, false);
    if (paramString == null)
    {
      GMTrace.o(548682072064L, 4088);
      return false;
    }
    p localp = m.NK().mV(paramString);
    if (localp == null)
    {
      w.e("MicroMsg.VoiceLogic", "Set error failed file:" + paramString);
      GMTrace.o(548682072064L, 4088);
      return false;
    }
    localp.status = 98;
    localp.hct = (System.currentTimeMillis() / 1000L);
    localp.eQl = 320;
    boolean bool = a(localp);
    w.d("MicroMsg.VoiceLogic", "setError file:" + paramString + " msgid:" + localp.hcw + " old stat:" + localp.status);
    if ((localp.hcw == 0) || (bg.nm(localp.eQu)))
    {
      w.e("MicroMsg.VoiceLogic", "setError failed msg id:" + localp.hcw + " user:" + localp.eQu);
      GMTrace.o(548682072064L, 4088);
      return bool;
    }
    paramString = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(localp.hcw);
    d.oqe.a(111L, 33L, 1L, true);
    paramString.C(localp.hcw);
    paramString.dB(5);
    paramString.db(localp.eQu);
    paramString.setContent(n.b(localp.hcn, -1L, true));
    ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a(paramString.field_msgId, paramString);
    GMTrace.o(548682072064L, 4088);
    return bool;
  }
  
  public static boolean mq(String paramString)
  {
    GMTrace.i(14300093612032L, 106544);
    paramString = m.NK().mV(paramString);
    if (paramString == null)
    {
      GMTrace.o(14300093612032L, 106544);
      return false;
    }
    if (paramString.status == 3)
    {
      au localau = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().cM(paramString.hcw);
      localau.setContent(n.b(paramString.hcn, paramString.hes, false));
      localau.dB(2);
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).aOf().a(paramString.hcw, localau);
    }
    paramString.status = 97;
    paramString.hct = (System.currentTimeMillis() / 1000L);
    paramString.eQl = 320;
    boolean bool = a(paramString);
    GMTrace.o(14300093612032L, 106544);
    return bool;
  }
  
  public static String yX()
  {
    GMTrace.i(14589332815872L, 108699);
    Object localObject = new StringBuilder();
    com.tencent.mm.kernel.h.xz();
    localObject = com.tencent.mm.kernel.h.xy().fYU + "voice/";
    GMTrace.o(14589332815872L, 108699);
    return (String)localObject;
  }
  
  public static String yY()
  {
    GMTrace.i(14589467033600L, 108700);
    Object localObject = new StringBuilder();
    com.tencent.mm.kernel.h.xz();
    localObject = com.tencent.mm.kernel.h.xy().fYU + "voice2/";
    GMTrace.o(14589467033600L, 108700);
    return (String)localObject;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\modelvoice\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */