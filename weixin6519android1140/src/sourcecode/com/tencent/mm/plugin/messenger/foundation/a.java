package com.tencent.mm.plugin.messenger.foundation;

import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.af;
import com.tencent.mm.platformtools.n;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import com.tencent.mm.plugin.messenger.foundation.a.r;
import com.tencent.mm.protocal.c.alv;
import com.tencent.mm.protocal.c.aos;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.protocal.c.nk;
import com.tencent.mm.protocal.c.ou;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.x;

public final class a
  implements p
{
  private static final a mUu;
  
  static
  {
    GMTrace.i(13236283899904L, 98618);
    mUu = new a();
    GMTrace.o(13236283899904L, 98618);
  }
  
  public a()
  {
    GMTrace.i(13235747028992L, 98614);
    GMTrace.o(13235747028992L, 98614);
  }
  
  public static com.tencent.mm.vending.b.b a(com.tencent.mm.plugin.messenger.foundation.a.b paramb)
  {
    GMTrace.i(13235881246720L, 98615);
    paramb = mUu.bT(paramb);
    GMTrace.o(13235881246720L, 98615);
    return paramb;
  }
  
  public static void a(aos paramaos, String paramString, byte[] paramArrayOfByte, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(13236149682176L, 98617);
    if (paramaos == null)
    {
      w.f("MicroMsg.ContactSyncExtension", "unable to parse mod contact");
      GMTrace.o(13236149682176L, 98617);
      return;
    }
    String str1 = n.a(paramaos.ufy);
    String str2 = bg.nl(paramaos.uEu);
    if ((bg.nm(str1)) && (bg.nm(str2)))
    {
      w.e("MicroMsg.ContactSyncExtension", "processModContact user is null user:%s enuser:%s", new Object[] { str1, str2 });
      GMTrace.o(13236149682176L, 98617);
      return;
    }
    w.i("MicroMsg.ContactSyncExtension", "username %s mobileHash %s mobileFullHash %s", new Object[] { paramaos.ufy, paramaos.uEx, paramaos.uEy });
    Object localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TE(str1);
    if ((localObject1 != null) && (str1.equals(((af)localObject1).field_encryptUsername)))
    {
      w.w("MicroMsg.ContactSyncExtension", "cat's replace user with stranger  user:%s", new Object[] { str1 });
      GMTrace.o(13236149682176L, 98617);
      return;
    }
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = ((x)localObject1).bSF();
      if (localObject2 == null) {}
    }
    for (;;)
    {
      Object localObject3 = localObject1;
      if (localObject1 == null) {
        localObject3 = new x(str1);
      }
      ((x)localObject3).setUsername(str1);
      ((x)localObject3).ci(paramaos.gCC);
      ((x)localObject3).setType(paramaos.ueF & paramaos.ueG);
      if ((paramBoolean1) && (localObject2 != null) && ((int)((com.tencent.mm.l.a)localObject2).fTq > 0))
      {
        w.w("MicroMsg.ContactSyncExtension", "processModContact Fuck GETCONTACT can't give the REAL_TYPE (mariohuang), user:%s old:%d get:%d", new Object[] { str1, Integer.valueOf(((af)localObject2).field_type), Integer.valueOf(((af)localObject3).field_type) });
        ((x)localObject3).setType(((af)localObject3).field_type | ((af)localObject2).field_type);
      }
      long l;
      label351:
      label657:
      boolean bool;
      label901:
      int i;
      if (!bg.nm(str2))
      {
        ((x)localObject3).cr(str2);
        if (localObject2 != null) {
          break label1237;
        }
        l = 0L;
        ((x)localObject3).fTq = l;
        ((x)localObject3).cl(n.a(paramaos.uxT));
        ((x)localObject3).cm(n.a(paramaos.ufo));
        ((x)localObject3).cn(n.a(paramaos.ufp));
        ((x)localObject3).jdMethod_do(paramaos.gCx);
        ((x)localObject3).dr(paramaos.ueL);
        ((x)localObject3).ck(n.a(paramaos.uEo));
        ((x)localObject3).ds(paramaos.ueP);
        ((x)localObject3).dt(paramaos.gCB);
        ((x)localObject3).cE(RegionCodeDecoder.ai(paramaos.gCG, paramaos.gCy, paramaos.gCz));
        ((x)localObject3).cy(paramaos.gCA);
        ((x)localObject3).dk(paramaos.uAv);
        ((x)localObject3).cD(paramaos.uAw);
        ((x)localObject3).setSource(paramaos.tQP);
        ((x)localObject3).dj(paramaos.uAz);
        ((x)localObject3).co(paramaos.uAy);
        if (com.tencent.mm.y.s.gs(paramaos.uAx)) {
          ((x)localObject3).cC(paramaos.uAx);
        }
        if (((x)localObject3).needUpdate()) {
          ((x)localObject3).dv((int)bg.Pu());
        }
        if (!TextUtils.isEmpty(paramString)) {
          ((x)localObject3).cM(paramString);
        }
        ((x)localObject3).cj(n.a(paramaos.uDR));
        ((x)localObject3).cp(n.a(paramaos.uDT));
        ((x)localObject3).cq(n.a(paramaos.uDS));
        ((x)localObject3).cs(paramaos.ufB);
        ((x)localObject3).cF(paramaos.tRP);
        ((x)localObject3).cG(paramaos.uEE);
        if (bg.bq(paramArrayOfByte)) {
          break label1249;
        }
        ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().w(str1, paramArrayOfByte);
        ((x)localObject3).dm(paramaos.uED);
        if ((paramaos.uEz != null) && (paramaos.uEz.tQk != null))
        {
          ((x)localObject3).cH(paramaos.uEz.tQk.tUw);
          ((x)localObject3).cI(paramaos.uEz.tQk.tUx);
          ((x)localObject3).cJ(paramaos.uEz.tQk.tUy);
        }
        if ((localObject2 != null) && (!com.tencent.mm.l.a.eE(((af)localObject2).field_type))) {
          com.tencent.mm.l.a.eE(((af)localObject3).field_type);
        }
        if (com.tencent.mm.y.s.gm(str1)) {
          ((x)localObject3).uJ();
        }
        if (((x)localObject3).bSA()) {
          ((x)localObject3).uM();
        }
        ((x)localObject3).cK(paramaos.fjy);
        ((x)localObject3).dx(paramaos.uEI);
        int j = (int)((com.tencent.mm.l.a)localObject3).fTq;
        localObject1 = ((af)localObject3).field_nickname;
        String str3 = ((x)localObject3).qS();
        int k = ((af)localObject3).field_deleteFlag;
        int m = ((af)localObject3).field_type;
        int n = paramaos.ueF;
        int i1 = paramaos.ueG;
        int i2 = ((af)localObject3).fjf;
        int i3 = ((af)localObject3).fji;
        String str4 = paramaos.gCG;
        String str5 = paramaos.gCy;
        String str6 = paramaos.gCz;
        int i4 = ((x)localObject3).getSource();
        String str7 = ((af)localObject3).field_contactLabelIds;
        if (paramaos.tRP != null) {
          break label1273;
        }
        bool = true;
        if (paramaos.tRP != null) {
          break label1279;
        }
        i = 0;
        label911:
        if (paramaos.tRP != null) {
          break label1291;
        }
        paramString = "";
        label922:
        w.i("MicroMsg.ContactSyncExtension", "processModContact:user[%s,%s] id:%d nick:%s pin:%s delflag:%d type:%d [%d,%d] contype:%d notify:%d region[%s,%s,%s] src:%d LabelIDList:%s fromGetContactService:%b remark_Description:(%s,%s,%s)", new Object[] { str1, str2, Integer.valueOf(j), localObject1, str3, Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(i3), str4, str5, str6, Integer.valueOf(i4), str7, Boolean.valueOf(paramBoolean1), Boolean.valueOf(bool), Integer.valueOf(i), paramString });
        mUu.a((x)localObject3, (x)localObject2, paramaos, paramArrayOfByte, paramBoolean2);
        if (bg.nm(str2)) {
          break label1302;
        }
        ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().b(str2, (x)localObject3);
      }
      for (;;)
      {
        mUu.b((x)localObject3, (x)localObject2, paramaos, paramArrayOfByte, paramBoolean2);
        if ((((af)localObject3).field_type & 0x800) == 0) {
          break label1326;
        }
        if ((localObject2 != null) && ((((af)localObject2).field_type & 0x800) == (((af)localObject3).field_type & 0x800))) {
          break label1376;
        }
        ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().TT(((af)localObject3).field_username);
        GMTrace.o(13236149682176L, 98617);
        return;
        if ((localObject2 == null) || ((int)((com.tencent.mm.l.a)localObject2).fTq <= 0)) {
          break;
        }
        ((x)localObject3).cr(((af)localObject2).field_encryptUsername);
        break;
        label1237:
        l = (int)((com.tencent.mm.l.a)localObject2).fTq;
        break label351;
        label1249:
        ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().TJ(str1);
        break label657;
        label1273:
        bool = false;
        break label901;
        label1279:
        i = paramaos.tRP.length();
        break label911;
        label1291:
        paramString = bg.SJ(paramaos.tRP);
        break label922;
        label1302:
        ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().Q((x)localObject3);
      }
      label1326:
      if ((localObject2 == null) || ((((af)localObject2).field_type & 0x800) != (((af)localObject3).field_type & 0x800))) {
        ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().TU(((af)localObject3).field_username);
      }
      label1376:
      GMTrace.o(13236149682176L, 98617);
      return;
      localObject2 = localObject1;
      localObject1 = null;
    }
  }
  
  public final void a(nk paramnk, byte[] paramArrayOfByte, boolean paramBoolean, r paramr)
  {
    GMTrace.i(13236015464448L, 98616);
    switch (paramnk.uei)
    {
    }
    for (;;)
    {
      GMTrace.o(13236015464448L, 98616);
      return;
      paramnk = (aos)new aos().aD(paramArrayOfByte);
      if (paramBoolean) {}
      for (;;)
      {
        a(paramnk, "", paramArrayOfByte, false, paramBoolean);
        GMTrace.o(13236015464448L, 98616);
        return;
        paramArrayOfByte = null;
      }
      paramnk = (ou)new ou().aD(paramArrayOfByte);
      paramArrayOfByte = n.a(paramnk.ufy);
      w.i("MicroMsg.ContactSyncExtension", "processDelContact user:%s", new Object[] { paramArrayOfByte });
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yP().TN(paramArrayOfByte);
      com.tencent.mm.y.s.fF(paramArrayOfByte);
      com.tencent.mm.plugin.messenger.foundation.a.s.a(4, paramnk);
    }
  }
  
  private static final class a
    extends com.tencent.mm.bz.a<com.tencent.mm.plugin.messenger.foundation.a.b>
    implements com.tencent.mm.plugin.messenger.foundation.a.b
  {
    public a()
    {
      GMTrace.i(13230780973056L, 98577);
      GMTrace.o(13230780973056L, 98577);
    }
    
    public final void a(final x paramx1, final x paramx2, final aos paramaos, final byte[] paramArrayOfByte, final boolean paramBoolean)
    {
      GMTrace.i(13230915190784L, 98578);
      a(new com.tencent.mm.bz.a.a() {});
      GMTrace.o(13230915190784L, 98578);
    }
    
    public final void b(final x paramx1, final x paramx2, final aos paramaos, final byte[] paramArrayOfByte, final boolean paramBoolean)
    {
      GMTrace.i(13231049408512L, 98579);
      a(new com.tencent.mm.bz.a.a() {});
      GMTrace.o(13231049408512L, 98579);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\messenger\foundation\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */