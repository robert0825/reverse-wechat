package com.tencent.mm.pluginsdk.ui.preference;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.bc.f;
import com.tencent.mm.bc.g;
import com.tencent.mm.bc.h;
import com.tencent.mm.bc.i;
import com.tencent.mm.bc.j;
import com.tencent.mm.bc.k;
import com.tencent.mm.bc.l;
import com.tencent.mm.g.a.fl;
import com.tencent.mm.g.a.fl.b;
import com.tencent.mm.g.b.bz;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.au.a;
import com.tencent.mm.storage.au.d;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import com.tencent.mm.y.s;
import junit.framework.Assert;

public final class b
{
  public String eCQ;
  public boolean eYr;
  public String glz;
  public long id;
  public String nNN;
  public int oPH;
  public String tCJ;
  public String username;
  
  public b()
  {
    GMTrace.i(1044616577024L, 7783);
    GMTrace.o(1044616577024L, 7783);
  }
  
  public static b a(Context paramContext, long paramLong, boolean paramBoolean, String paramString1, String paramString2, int paramInt1, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, int paramInt2)
  {
    GMTrace.i(1044885012480L, 7785);
    b localb = new b();
    localb.id = paramLong;
    if (!paramBoolean) {}
    for (boolean bool = true;; bool = false)
    {
      localb.eYr = bool;
      w.d("MicroMsg.FMessageProvider", "build, fmsgInfo.type:%d, fmsgInfo.talker:%s, scene:%d  ", new Object[] { Integer.valueOf(paramInt1), paramString1, Integer.valueOf(paramInt2) });
      if (paramInt1 != 0) {
        break label378;
      }
      if (paramString2 != null) {
        break;
      }
      w.e("MicroMsg.FMessageProvider", "build fail, fmsgInfo msgContent is null, fmsgInfo.talker = " + paramString1);
      GMTrace.o(1044885012480L, 7785);
      return null;
    }
    localb.username = paramString3;
    localb.eCQ = paramString4;
    switch (paramInt2)
    {
    default: 
      localb.glz = paramContext.getString(R.l.dfs);
    }
    for (;;)
    {
      GMTrace.o(1044885012480L, 7785);
      return localb;
      localb.glz = paramContext.getString(R.l.dfn);
      continue;
      paramString1 = new fl();
      paramString1.eHP.eHM = paramString5;
      paramString1.eHP.eHN = paramString6;
      a.vgX.m(paramString1);
      localb.glz = paramContext.getString(R.l.dfq, new Object[] { bg.aq(paramString1.eHQ.eHR, "") });
      continue;
      localb.glz = paramContext.getString(R.l.dfz);
      continue;
      localb.glz = paramContext.getString(R.l.dft);
      continue;
      localb.nNN = au.a.Uh(paramString2).nNN;
      localb.glz = paramContext.getString(R.l.dfo);
      continue;
      label378:
      if (!paramBoolean)
      {
        localb.username = paramString1;
        localb.glz = paramString2;
      }
      else
      {
        localb.username = paramString3;
        localb.eCQ = paramString4;
        if ((paramString7 != null) && (!paramString7.trim().equals(""))) {
          localb.glz = paramString7;
        } else {
          localb.glz = paramContext.getString(R.l.dwk);
        }
      }
    }
  }
  
  public static b a(Context paramContext, f paramf)
  {
    GMTrace.i(1044750794752L, 7784);
    long l = paramf.vmr;
    boolean bool = paramf.MC();
    String str4 = paramf.field_talker;
    String str5 = paramf.field_msgContent;
    int k = paramf.field_type;
    paramf = null;
    Object localObject1 = null;
    Object localObject7 = null;
    Object localObject8 = null;
    Object localObject4 = null;
    Object localObject6 = null;
    int j = 0;
    Object localObject2;
    Object localObject5;
    Object localObject3;
    int i;
    if (k == 0)
    {
      localObject2 = au.a.Uh(str5);
      paramf = ((au.a)localObject2).rAP;
      localObject1 = ((au.a)localObject2).eCQ;
      localObject5 = ((au.a)localObject2).vBs;
      localObject3 = ((au.a)localObject2).vBt;
      i = ((au.a)localObject2).scene;
      localObject2 = localObject6;
    }
    for (;;)
    {
      paramContext = a(paramContext, l, bool, str4, str5, k, paramf, (String)localObject1, (String)localObject5, (String)localObject3, (String)localObject4, i);
      paramContext.tCJ = ((String)localObject2);
      GMTrace.o(1044750794752L, 7784);
      return paramContext;
      localObject2 = localObject6;
      localObject5 = localObject7;
      localObject3 = localObject8;
      i = j;
      if (bool)
      {
        au.d locald = au.d.Uk(str5);
        String str1 = locald.rAP;
        String str2 = locald.eCQ;
        String str3 = locald.content;
        localObject2 = localObject6;
        paramf = str1;
        localObject1 = str2;
        localObject5 = localObject7;
        localObject3 = localObject8;
        localObject4 = str3;
        i = j;
        if (locald.vBF == 1)
        {
          localObject2 = locald.vBH;
          paramf = str1;
          localObject1 = str2;
          localObject5 = localObject7;
          localObject3 = localObject8;
          localObject4 = str3;
          i = j;
        }
      }
    }
  }
  
  public static b a(Context paramContext, j paramj)
  {
    GMTrace.i(1045153447936L, 7787);
    w.d("MicroMsg.FMessageProvider", "build shake, talker = " + paramj.field_talker + ", scene = " + paramj.field_scene);
    b localb = new b();
    localb.id = paramj.vmr;
    if (paramj.field_isSend == 1) {}
    for (boolean bool = true;; bool = false)
    {
      localb.eYr = bool;
      localb.username = paramj.field_sayhiuser;
      localb.oPH = paramj.field_scene;
      if (paramj.field_isSend != 1) {
        break;
      }
      localb.glz = paramj.field_content;
      GMTrace.o(1045153447936L, 7787);
      return localb;
    }
    paramj = au.d.Uk(paramj.field_content);
    if ((paramj.content != null) && (!paramj.content.trim().equals(""))) {}
    for (localb.glz = paramj.content;; localb.glz = paramContext.getString(R.l.dfB))
    {
      localb.eCQ = paramj.eCQ;
      break;
    }
  }
  
  public static b a(Context paramContext, bz parambz)
  {
    GMTrace.i(1045019230208L, 7786);
    w.d("MicroMsg.FMessageProvider", "build lbs, talker = " + parambz.field_sayhiuser + ", scene = " + parambz.field_scene);
    b localb = new b();
    localb.id = parambz.vmr;
    if (parambz.field_isSend == 1) {}
    for (boolean bool = true;; bool = false)
    {
      localb.eYr = bool;
      localb.username = parambz.field_sayhiuser;
      localb.oPH = parambz.field_scene;
      if (parambz.field_isSend != 1) {
        break;
      }
      localb.glz = parambz.field_content;
      GMTrace.o(1045019230208L, 7786);
      return localb;
    }
    parambz = au.d.Uk(parambz.field_content);
    if ((parambz.content != null) && (!parambz.content.trim().equals(""))) {}
    for (localb.glz = parambz.content;; localb.glz = paramContext.getString(R.l.dfB))
    {
      localb.eCQ = parambz.eCQ;
      break;
    }
  }
  
  public static b[] a(Context paramContext, f[] paramArrayOff)
  {
    GMTrace.i(1045287665664L, 7788);
    StringBuilder localStringBuilder = new StringBuilder("convert fmsgList, talker = ");
    if ((paramArrayOff == null) || (paramArrayOff.length == 0) || (paramArrayOff[0] == null)) {}
    for (Object localObject = "null";; localObject = paramArrayOff[0].field_talker)
    {
      w.d("MicroMsg.FMessageProvider", (String)localObject);
      if ((paramArrayOff != null) && (paramArrayOff.length != 0)) {
        break;
      }
      w.e("MicroMsg.FMessageProvider", "convert fmsg fail, fmsgList is null");
      GMTrace.o(1045287665664L, 7788);
      return null;
    }
    localObject = new b[paramArrayOff.length];
    int i = 0;
    while (i < localObject.length)
    {
      localObject[i] = a(paramContext, paramArrayOff[i]);
      i += 1;
    }
    GMTrace.o(1045287665664L, 7788);
    return (b[])localObject;
  }
  
  public static b[] a(Context paramContext, j[] paramArrayOfj)
  {
    GMTrace.i(1045556101120L, 7790);
    StringBuilder localStringBuilder = new StringBuilder("convert shakeList, talker = ");
    if ((paramArrayOfj == null) || (paramArrayOfj.length == 0) || (paramArrayOfj[0] == null)) {}
    for (Object localObject = "null";; localObject = paramArrayOfj[0].field_sayhiuser)
    {
      w.d("MicroMsg.FMessageProvider", (String)localObject);
      if ((paramArrayOfj != null) && (paramArrayOfj.length != 0)) {
        break;
      }
      w.e("MicroMsg.FMessageProvider", "convert shake fail, shakeList is null");
      GMTrace.o(1045556101120L, 7790);
      return null;
    }
    localObject = new b[paramArrayOfj.length];
    int i = 0;
    while (i < localObject.length)
    {
      localObject[i] = a(paramContext, paramArrayOfj[i]);
      i += 1;
    }
    GMTrace.o(1045556101120L, 7790);
    return (b[])localObject;
  }
  
  public static b[] a(Context paramContext, bz[] paramArrayOfbz)
  {
    GMTrace.i(1045421883392L, 7789);
    StringBuilder localStringBuilder = new StringBuilder("convert lbsList, talker = ");
    if ((paramArrayOfbz == null) || (paramArrayOfbz.length == 0) || (paramArrayOfbz[0] == null)) {}
    for (Object localObject = "null";; localObject = paramArrayOfbz[0].field_sayhiuser)
    {
      w.d("MicroMsg.FMessageProvider", (String)localObject);
      if ((paramArrayOfbz != null) && (paramArrayOfbz.length != 0)) {
        break;
      }
      w.e("MicroMsg.FMessageProvider", "convert lbs fail, lbsList is null");
      GMTrace.o(1045421883392L, 7789);
      return null;
    }
    localObject = new b[paramArrayOfbz.length];
    int i = 0;
    while (i < localObject.length)
    {
      localObject[i] = a(paramContext, paramArrayOfbz[i]);
      i += 1;
    }
    GMTrace.o(1045421883392L, 7789);
    return (b[])localObject;
  }
  
  public static void aE(String paramString, int paramInt)
  {
    GMTrace.i(1045690318848L, 7791);
    j[] arrayOfj;
    Object localObject1;
    f[] arrayOff;
    h[] arrayOfh;
    if ((paramInt == 26) || (paramInt == 27) || (paramInt == 28) || (paramInt == 29))
    {
      w.d("MicroMsg.FMessageProvider", "initAddContent, scene is shake");
      arrayOfj = l.MN().lX(paramString);
      localObject1 = a(ab.getContext(), arrayOfj);
      arrayOff = null;
      arrayOfh = null;
    }
    while (localObject1 == null)
    {
      GMTrace.o(1045690318848L, 7791);
      return;
      if (paramInt == 18)
      {
        w.d("MicroMsg.FMessageProvider", "initAddContent, scene is lbs");
        arrayOfh = l.MM().lS(paramString);
        localObject1 = a(ab.getContext(), arrayOfh);
        arrayOfj = null;
        arrayOff = null;
      }
      else
      {
        arrayOff = l.MK().lN(paramString);
        localObject1 = a(ab.getContext(), arrayOff);
        arrayOfj = null;
        arrayOfh = null;
      }
    }
    paramInt = 0;
    int k = localObject1.length;
    int i = 0;
    Object localObject2;
    au localau;
    int m;
    int j;
    if (i < k)
    {
      localObject2 = localObject1[i];
      localau = new au();
      localau.setContent(((b)localObject2).glz);
      m = s.go(((b)localObject2).username);
      if (arrayOff != null)
      {
        j = paramInt + 1;
        localau.E(arrayOff[paramInt].field_createTime);
        paramInt = j;
      }
    }
    label224:
    label261:
    label400:
    label588:
    for (;;)
    {
      localau.db(((b)localObject2).username);
      localau.setType(m);
      long l;
      if (((b)localObject2).eYr)
      {
        localau.dB(2);
        localau.dC(1);
        at.AR();
        l = com.tencent.mm.y.c.yM().P(localau);
        if (l == -1L) {
          break label400;
        }
      }
      for (boolean bool = true;; bool = false)
      {
        Assert.assertTrue(bool);
        w.i("MicroMsg.FMessageProvider", "new msg inserted to db , local id = " + l);
        i += 1;
        break;
        if (arrayOfh != null)
        {
          j = paramInt + 1;
          localau.E(arrayOfh[paramInt].field_createtime * 1000L);
          paramInt = j;
          break label224;
        }
        if (arrayOfj == null) {
          break label588;
        }
        j = paramInt + 1;
        localau.E(arrayOfj[paramInt].field_createtime * 1000L);
        paramInt = j;
        break label224;
        localau.dB(6);
        localau.dC(0);
        break label261;
      }
      localObject1 = new au();
      if (arrayOff != null) {
        ((au)localObject1).E(arrayOff[(arrayOff.length - 1)].field_createTime + 1L);
      }
      for (;;)
      {
        ((au)localObject1).db(paramString);
        ((au)localObject1).setContent(ab.getContext().getString(R.l.eeM));
        ((au)localObject1).setType(10000);
        ((au)localObject1).dB(6);
        ((au)localObject1).dC(0);
        at.AR();
        l = com.tencent.mm.y.c.yM().P((au)localObject1);
        w.i("MicroMsg.FMessageProvider", "new msg inserted to db , local id = " + l);
        GMTrace.o(1045690318848L, 7791);
        return;
        if (arrayOfh != null) {
          ((au)localObject1).E(arrayOfh[(arrayOfh.length - 1)].field_createtime * 1000L + 1L);
        } else if (arrayOfj != null) {
          ((au)localObject1).E(arrayOfj[(arrayOfj.length - 1)].field_createtime * 1000L + 1L);
        }
      }
    }
  }
  
  public static x b(f paramf)
  {
    GMTrace.i(1045824536576L, 7792);
    x localx = new x();
    if (paramf == null)
    {
      GMTrace.o(1045824536576L, 7792);
      return localx;
    }
    if (paramf.field_type == 0)
    {
      paramf = au.a.Uh(paramf.field_msgContent);
      localx = new x();
      localx.setUsername(paramf.rAP);
      localx.ci(paramf.fsF);
      localx.cl(paramf.getDisplayName());
      localx.cm(paramf.gDY);
      localx.cn(paramf.gDZ);
      localx.jdMethod_do(paramf.fja);
      localx.cz(paramf.getProvince());
      localx.cA(paramf.getCity());
      localx.cy(paramf.signature);
      localx.dk(paramf.rCC);
      localx.cD(paramf.fjp);
      GMTrace.o(1045824536576L, 7792);
      return localx;
    }
    paramf = au.d.Uk(paramf.field_msgContent);
    localx = new x();
    localx.setUsername(paramf.rAP);
    localx.ci(paramf.fsF);
    localx.cl(paramf.eCQ);
    localx.cm(paramf.gDY);
    localx.cn(paramf.gDZ);
    localx.jdMethod_do(paramf.fja);
    localx.cy(paramf.signature);
    localx.cz(paramf.getProvince());
    localx.cA(paramf.getCity());
    GMTrace.o(1045824536576L, 7792);
    return localx;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\ui\preference\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */