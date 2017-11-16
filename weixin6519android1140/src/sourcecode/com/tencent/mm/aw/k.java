package com.tencent.mm.aw;

import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k.a;
import com.tencent.mm.ad.k.b;
import com.tencent.mm.g.a.lo;
import com.tencent.mm.g.a.lo.a;
import com.tencent.mm.g.a.ru;
import com.tencent.mm.k.c;
import com.tencent.mm.kernel.h;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.protocal.c.aca;
import com.tencent.mm.protocal.c.acb;
import com.tencent.mm.protocal.c.asb;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.w.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class k
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.ad.m, com.tencent.mm.network.k
{
  private int eDu;
  private com.tencent.mm.ad.b fUa;
  private com.tencent.mm.ad.e fUd;
  private int flags;
  private boolean gQe;
  
  public k(int paramInt)
  {
    GMTrace.i(12949863268352L, 96484);
    this.gQe = false;
    this.flags = -1;
    this.eDu = paramInt;
    this.gQe = false;
    w.d("MicroMsg.NetSceneGetPackageList", "Init dkregcode:" + paramInt);
    GMTrace.o(12949863268352L, 96484);
  }
  
  public k(boolean paramBoolean)
  {
    GMTrace.i(12949729050624L, 96483);
    this.gQe = false;
    this.flags = -1;
    this.eDu = 26;
    this.gQe = false;
    w.d("MicroMsg.NetSceneGetPackageList", "Init dkregcode:26");
    w.d("MicroMsg.NetSceneGetPackageList", "isOnlyCheckInReqList: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean) {
      this.flags = 1;
    }
    GMTrace.o(12949729050624L, 96483);
  }
  
  private void L(List<asb> paramList)
  {
    GMTrace.i(12952144969728L, 96501);
    if ((paramList == null) || (paramList.size() <= 0))
    {
      w.d("MicroMsg.NetSceneGetPackageList", "[oneliang]empty update expose scene list");
      GMTrace.o(12952144969728L, 96501);
      return;
    }
    t.Kj();
    String str = n.Kf();
    int i = 0;
    if (i < paramList.size())
    {
      asb localasb = (asb)paramList.get(i);
      Object localObject = t.Kj().aR(localasb.lSW, this.eDu);
      m localm;
      if ((localObject == null) || (((m)localObject).version != localasb.jia))
      {
        com.tencent.mm.loader.stub.b.deleteFile(str + t.Kj().aT(localasb.lSW, this.eDu));
        localm = a(localasb);
        localm.eQl = -1;
        if (localObject != null) {
          break label231;
        }
        t.Kj().a(localm);
      }
      for (;;)
      {
        localObject = new j(localm.id, 19);
        h.xx().fYr.a((com.tencent.mm.ad.k)localObject, 0);
        w.d("MicroMsg.NetSceneGetPackageList", "[oneliang]name:%s,packName:%s", new Object[] { localasb.lPi, localasb.uhe });
        i += 1;
        break;
        label231:
        t.Kj().b(localm);
      }
    }
    GMTrace.o(12952144969728L, 96501);
  }
  
  private void M(List<asb> paramList)
  {
    GMTrace.i(12952279187456L, 96502);
    if ((paramList == null) || (paramList.size() == 0))
    {
      w.d("MicroMsg.NetSceneGetPackageList", "updateIPCallCountryCodeConfig, package list is empty");
      GMTrace.o(12952279187456L, 96502);
      return;
    }
    w.d("MicroMsg.NetSceneGetPackageList", "updateIPCallCountryCodeConfig, pkgList.size: %d", new Object[] { Integer.valueOf(paramList.size()) });
    int i = ((Integer)h.xy().xh().get(w.a.vrS, Integer.valueOf(-1))).intValue();
    w.d("MicroMsg.NetSceneGetPackageList", "configPkgId: %d", new Object[] { Integer.valueOf(i) });
    if (i == -1)
    {
      GMTrace.o(12952279187456L, 96502);
      return;
    }
    m localm1 = t.Kj().aR(i, this.eDu);
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      m localm2 = a((asb)paramList.next());
      w.d("MicroMsg.NetSceneGetPackageList", "newInfo.id: %d, version: %d", new Object[] { Integer.valueOf(localm2.id), Integer.valueOf(localm2.version) });
      if ((localm1 != null) && (localm2.id == i))
      {
        w.d("MicroMsg.NetSceneGetPackageList", "find match old pkg, update one");
        t.Kj().b(localm2);
        GMTrace.o(12952279187456L, 96502);
        return;
      }
      if ((localm1 == null) && (localm2.id == i))
      {
        w.d("MicroMsg.NetSceneGetPackageList", "insert new pkg");
        t.Kj().a(localm2);
        GMTrace.o(12952279187456L, 96502);
        return;
      }
    }
    GMTrace.o(12952279187456L, 96502);
  }
  
  private void N(List<asb> paramList)
  {
    GMTrace.i(12952413405184L, 96503);
    if ((paramList == null) || (paramList.size() == 0))
    {
      w.d("MicroMsg.NetSceneGetPackageList", "update sense where location but package list is empty.");
      GMTrace.o(12952413405184L, 96503);
      return;
    }
    w.i("MicroMsg.NetSceneGetPackageList", "start update sense where location. package list size " + paramList.size());
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Object localObject2 = (asb)paramList.next();
      Object localObject1 = t.Kj().aR(((asb)localObject2).lSW, this.eDu);
      if ((localObject1 == null) || (((m)localObject1).version != ((asb)localObject2).jia))
      {
        localObject2 = a((asb)localObject2);
        ((m)localObject2).eQl = -1;
        if (localObject1 == null) {
          t.Kj().a((m)localObject2);
        }
        for (;;)
        {
          localObject1 = new j(((m)localObject2).id, 36);
          h.xx().fYr.a((com.tencent.mm.ad.k)localObject1, 0);
          break;
          t.Kj().b((m)localObject2);
        }
      }
    }
    GMTrace.o(12952413405184L, 96503);
  }
  
  private m a(asb paramasb)
  {
    GMTrace.i(12950668574720L, 96490);
    m localm = new m();
    localm.id = paramasb.lSW;
    localm.version = paramasb.jia;
    localm.name = paramasb.lPi;
    localm.size = paramasb.jhV;
    localm.gQj = paramasb.uhe;
    localm.status = 5;
    localm.eII = this.eDu;
    GMTrace.o(12950668574720L, 96490);
    return localm;
  }
  
  private void g(LinkedList<asb> paramLinkedList)
  {
    GMTrace.i(12951205445632L, 96494);
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      w.d("MicroMsg.NetSceneGetPackageList", "empty upload speex config list");
      GMTrace.o(12951205445632L, 96494);
      return;
    }
    t.Kj();
    String str = n.Kf();
    int i = 0;
    if (i < paramLinkedList.size())
    {
      asb localasb = (asb)paramLinkedList.get(i);
      Object localObject = t.Kj().aR(localasb.lSW, this.eDu);
      m localm;
      if ((localObject == null) || (((m)localObject).version != localasb.jia))
      {
        com.tencent.mm.loader.stub.b.deleteFile(str + t.Kj().aT(localasb.lSW, this.eDu));
        localm = a(localasb);
        localm.eQl = -1;
        if (localObject != null) {
          break label381;
        }
        t.Kj().a(localm);
      }
      for (;;)
      {
        localObject = new j(localm.id, 9);
        h.xx().fYr.a((com.tencent.mm.ad.k)localObject, 0);
        if (com.tencent.mm.platformtools.n.a(localasb.tQO) != null)
        {
          localObject = new String(com.tencent.mm.platformtools.n.a(localasb.tQO));
          w.v("MicroMsg.NetSceneGetPackageList", "xml:" + (String)localObject);
        }
        if (com.tencent.mm.platformtools.n.a(localasb.uHZ) != null)
        {
          localObject = new String(com.tencent.mm.platformtools.n.a(localasb.uHZ));
          w.v("MicroMsg.NetSceneGetPackageList", "xml2:" + (String)localObject);
        }
        w.v("MicroMsg.NetSceneGetPackageList", "xml3:" + localasb.toString());
        w.v("MicroMsg.NetSceneGetPackageList", "xml4:" + localasb.lPi);
        w.v("MicroMsg.NetSceneGetPackageList", "xml5:" + localasb.uhe);
        i += 1;
        break;
        label381:
        t.Kj().b(localm);
      }
    }
    GMTrace.o(12951205445632L, 96494);
  }
  
  private void h(LinkedList<asb> paramLinkedList)
  {
    GMTrace.i(12951339663360L, 96495);
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      w.d("MicroMsg.NetSceneGetPackageList", "empty background pkg list");
      GMTrace.o(12951339663360L, 96495);
      return;
    }
    t.Kj();
    String str = n.Kf();
    int i = 0;
    if (i < paramLinkedList.size())
    {
      Object localObject1 = (asb)paramLinkedList.get(i);
      Object localObject2 = t.Kj().aR(((asb)localObject1).lSW, this.eDu);
      m localm;
      if ((localObject2 == null) || (((m)localObject2).version != ((asb)localObject1).jia))
      {
        com.tencent.mm.loader.stub.b.deleteFile(str + t.Kj().aT(((asb)localObject1).lSW, this.eDu));
        localm = a((asb)localObject1);
        localm.eQl = -1;
        if (localObject2 != null) {
          break label243;
        }
        t.Kj().a(localm);
      }
      for (;;)
      {
        localObject2 = com.tencent.mm.platformtools.n.a(((asb)localObject1).tQO);
        if ((localObject2 != null) && (localObject2.length > 0))
        {
          t.Kj();
          localObject1 = n.aS(((asb)localObject1).lSW, this.eDu);
          com.tencent.mm.loader.stub.b.deleteFile(str + (String)localObject1);
          com.tencent.mm.a.e.a(str, (String)localObject1, (byte[])localObject2);
        }
        i += 1;
        break;
        label243:
        t.Kj().b(localm);
      }
    }
    GMTrace.o(12951339663360L, 96495);
  }
  
  @Deprecated
  private void i(LinkedList<asb> paramLinkedList)
  {
    GMTrace.i(12951473881088L, 96496);
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      w.d("MicroMsg.NetSceneGetPackageList", "empty emoji pkg list");
      GMTrace.o(12951473881088L, 96496);
      return;
    }
    int i = 0;
    if (i < paramLinkedList.size())
    {
      Object localObject1 = (asb)paramLinkedList.get(i);
      Object localObject2 = t.Kj().aR(((asb)localObject1).lSW, this.eDu);
      m localm = a((asb)localObject1);
      localm.eQl = -1;
      if (localObject2 == null) {
        t.Kj().a(localm);
      }
      for (;;)
      {
        localObject1 = com.tencent.mm.platformtools.n.a(((asb)localObject1).tQO);
        if ((localObject1 != null) && (localObject1.length > 0))
        {
          localObject2 = new ArrayList();
          ((List)localObject2).add(new String((byte[])localObject1));
          ((List)localObject2).size();
        }
        i += 1;
        break;
        t.Kj().b(localm);
      }
    }
    GMTrace.o(12951473881088L, 96496);
  }
  
  private void j(LinkedList<asb> paramLinkedList)
  {
    GMTrace.i(12951608098816L, 96497);
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      w.d("MicroMsg.NetSceneGetPackageList", "empty emoji pkg list");
      GMTrace.o(12951608098816L, 96497);
      return;
    }
    w.d("MicroMsg.NetSceneGetPackageList", "pkgList size " + paramLinkedList.size());
    t.Kj();
    String str1 = n.Kf();
    int i = 0;
    while (i < paramLinkedList.size())
    {
      asb localasb = (asb)paramLinkedList.get(i);
      m localm = t.Kj().aR(localasb.lSW, this.eDu);
      byte[] arrayOfByte = com.tencent.mm.platformtools.n.a(localasb.tQO);
      if (localasb.tQO == null)
      {
        w.e("MicroMsg.NetSceneGetPackageList", "error give me a null thumb it should be xml");
        i += 1;
      }
      else
      {
        String str2;
        Object localObject;
        if ((localm == null) || (localm.version != localasb.jia))
        {
          str2 = new String(arrayOfByte);
          localObject = "zh_CN";
          if (str2.indexOf("zh_CN") >= 0)
          {
            label186:
            str2 = (String)localObject + "_ARTIST.mm";
            com.tencent.mm.loader.stub.b.deleteFile(str1 + str2);
            com.tencent.mm.loader.stub.b.deleteFile(str1 + (String)localObject + "_ARTISTF.mm");
            com.tencent.mm.a.e.a(str1, str2, arrayOfByte);
          }
        }
        else
        {
          localObject = a(localasb);
          ((m)localObject).eQl = -1;
          if (localm != null) {
            break label401;
          }
          t.Kj().a((m)localObject);
        }
        for (;;)
        {
          w.d("MicroMsg.NetSceneGetPackageList", localasb.lPi + " - " + localasb.lSW + " - " + localasb.uhe + " - " + localasb.jhV);
          break;
          localObject = "en";
          if (str2.indexOf("en") >= 0) {
            break label186;
          }
          localObject = "zh_TW";
          if (str2.indexOf("zh_TW") >= 0) {
            break label186;
          }
          localObject = "en";
          break label186;
          label401:
          t.Kj().b((m)localObject);
        }
      }
    }
    GMTrace.o(12951608098816L, 96497);
  }
  
  private void k(LinkedList<asb> paramLinkedList)
  {
    GMTrace.i(12951742316544L, 96498);
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      w.d("MicroMsg.NetSceneGetPackageList", "empty config list");
      GMTrace.o(12951742316544L, 96498);
      return;
    }
    w.d("MicroMsg.NetSceneGetPackageList", "updateConfigList pkgList size " + paramLinkedList.size());
    int i = 0;
    if (i < paramLinkedList.size())
    {
      Object localObject1 = (asb)paramLinkedList.get(i);
      Object localObject2 = t.Kj().aR(((asb)localObject1).lSW, this.eDu);
      Object localObject3 = a((asb)localObject1);
      ((m)localObject3).eQl = -1;
      if (localObject2 == null) {
        t.Kj().a((m)localObject3);
      }
      for (;;)
      {
        w.d("MicroMsg.NetSceneGetPackageList", ((asb)localObject1).lPi + " - " + ((asb)localObject1).lSW + " - " + ((asb)localObject1).uhe + " - " + ((asb)localObject1).jhV);
        localObject2 = com.tencent.mm.platformtools.n.a(((asb)localObject1).tQO);
        localObject3 = new String((byte[])localObject2);
        w.d("MicroMsg.NetSceneGetPackageList", "ConfigList xml : " + (String)localObject3);
        localObject3 = ((com.tencent.mm.plugin.zero.b.a)h.h(com.tencent.mm.plugin.zero.b.a.class)).uu();
        int j = ((asb)localObject1).lSW;
        localObject1 = new File(c.fSI);
        if (!((File)localObject1).exists()) {
          ((File)localObject1).mkdir();
        }
        try
        {
          localObject1 = new File(c.ew(j));
          if (!((File)localObject1).exists()) {
            ((File)localObject1).createNewFile();
          }
          com.tencent.mm.a.e.b(c.ew(j), (byte[])localObject2, localObject2.length);
          ((c)localObject3).k(j, new String((byte[])localObject2));
        }
        catch (Exception localException)
        {
          for (;;)
          {
            w.e("MicroMsg.ConfigListDecoder", "exception:%s", new Object[] { bg.f(localException) });
          }
        }
        i += 1;
        break;
        t.Kj().b((m)localObject3);
      }
    }
    GMTrace.o(12951742316544L, 96498);
  }
  
  private void l(LinkedList<asb> paramLinkedList)
  {
    GMTrace.i(12951876534272L, 96499);
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      w.d("MicroMsg.NetSceneGetPackageList", "empty regioncode pkg list");
      GMTrace.o(12951876534272L, 96499);
      return;
    }
    w.d("MicroMsg.NetSceneGetPackageList", "pkgList size " + paramLinkedList.size());
    paramLinkedList = paramLinkedList.iterator();
    if (paramLinkedList.hasNext())
    {
      asb localasb = (asb)paramLinkedList.next();
      m localm1 = t.Kj().aR(localasb.lSW, this.eDu);
      m localm2 = a(localasb);
      localm2.eQl = -1;
      if (localm1 == null) {
        t.Kj().a(localm2);
      }
      for (;;)
      {
        w.d("MicroMsg.NetSceneGetPackageList", localasb.lPi + " - " + localasb.lSW + " - " + localasb.uhe + " - " + localasb.jhV);
        break;
        t.Kj().b(localm2);
      }
    }
    GMTrace.o(12951876534272L, 96499);
  }
  
  private void m(LinkedList<asb> paramLinkedList)
  {
    GMTrace.i(12952010752000L, 96500);
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      w.e("MicroMsg.NetSceneGetPackageList", "empty address pkg list");
      GMTrace.o(12952010752000L, 96500);
      return;
    }
    w.i("MicroMsg.NetSceneGetPackageList", "updateRcptAddress pkgList size " + paramLinkedList.size());
    int i = 0;
    if (i < paramLinkedList.size())
    {
      Object localObject2 = (asb)paramLinkedList.get(i);
      Object localObject1 = t.Kj().aR(((asb)localObject2).lSW, this.eDu);
      localObject2 = a((asb)localObject2);
      ((m)localObject2).eQl = -1;
      if (localObject1 == null) {
        t.Kj().a((m)localObject2);
      }
      for (;;)
      {
        localObject1 = new j(((m)localObject2).id, 12);
        h.xx().fYr.a((com.tencent.mm.ad.k)localObject1, 0);
        i += 1;
        break;
        t.Kj().b((m)localObject2);
      }
    }
    GMTrace.o(12952010752000L, 96500);
  }
  
  private void n(LinkedList<asb> paramLinkedList)
  {
    GMTrace.i(12952547622912L, 96504);
    w.d("MicroMsg.NetSceneGetPackageList", "updateLangPkg");
    if ((paramLinkedList == null) || (paramLinkedList.size() == 0))
    {
      w.d("MicroMsg.NetSceneGetPackageList", "empty langage package list");
      GMTrace.o(12952547622912L, 96504);
      return;
    }
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      Object localObject = (asb)paramLinkedList.next();
      w.d("MicroMsg.NetSceneGetPackageList", "pkg.toString %s", new Object[] { localObject.toString() });
      m localm = t.Kj().aR(((asb)localObject).lSW, this.eDu);
      localObject = a((asb)localObject);
      ((m)localObject).eQl = -1;
      if (localm == null) {
        t.Kj().a((m)localObject);
      } else {
        t.Kj().b((m)localObject);
      }
    }
    GMTrace.o(12952547622912L, 96504);
  }
  
  private void o(LinkedList<asb> paramLinkedList)
  {
    GMTrace.i(12952681840640L, 96505);
    w.d("MicroMsg.NetSceneGetPackageList", "updateAppleEmojiPackage");
    if ((paramLinkedList == null) || (paramLinkedList.size() == 0))
    {
      w.d("MicroMsg.NetSceneGetPackageList", "update apple emoji but package list is empty.");
      GMTrace.o(12952681840640L, 96505);
      return;
    }
    w.i("MicroMsg.NetSceneGetPackageList", "start update apple emoji. package list size " + paramLinkedList.size());
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      Object localObject2 = (asb)paramLinkedList.next();
      Object localObject1 = t.Kj().aR(((asb)localObject2).lSW, this.eDu);
      if ((localObject1 == null) || (((m)localObject1).version != ((asb)localObject2).jia))
      {
        localObject2 = a((asb)localObject2);
        ((m)localObject2).eQl = -1;
        if (localObject1 == null) {
          t.Kj().a((m)localObject2);
        }
        for (;;)
        {
          localObject1 = new j(((m)localObject2).id, 37);
          h.xx().fYr.a((com.tencent.mm.ad.k)localObject1, 0);
          break;
          t.Kj().b((m)localObject2);
        }
      }
    }
    GMTrace.o(12952681840640L, 96505);
  }
  
  public final boolean DE()
  {
    GMTrace.i(12950534356992L, 96489);
    GMTrace.o(12950534356992L, 96489);
    return true;
  }
  
  public final int DM()
  {
    GMTrace.i(12952950276096L, 96507);
    int i = this.eDu;
    GMTrace.o(12952950276096L, 96507);
    return i;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(12949997486080L, 96485);
    this.fUd = parame1;
    w.d("MicroMsg.NetSceneGetPackageList", "DoScene dkregcode :" + this.eDu);
    parame1 = new b.a();
    parame1.gtF = new aca();
    parame1.gtG = new acb();
    parame1.uri = "/cgi-bin/micromsg-bin/getpackagelist";
    parame1.gtE = 159;
    parame1.gtH = 51;
    parame1.gtI = 1000000051;
    this.fUa = parame1.DA();
    parame1 = (aca)this.fUa.gtC.gtK;
    LinkedList localLinkedList = new LinkedList();
    if (!h.xw().wL())
    {
      GMTrace.o(12949997486080L, 96485);
      return -1;
    }
    m[] arrayOfm = t.Kj().gJ(this.eDu);
    if ((arrayOfm != null) && (arrayOfm.length > 0))
    {
      i = 0;
      if (i < arrayOfm.length)
      {
        asb localasb = new asb();
        localasb.lSW = arrayOfm[i].id;
        if ((r.hjZ) && (this.eDu == 7)) {
          w.d("MicroMsg.NetSceneGetPackageList", "isShakeGetConfigList");
        }
        for (localasb.jia = 0;; localasb.jia = arrayOfm[i].version)
        {
          w.d("MicroMsg.NetSceneGetPackageList", "package, id:%d, ver:%d", new Object[] { Integer.valueOf(localasb.lSW), Integer.valueOf(localasb.jia) });
          localLinkedList.add(localasb);
          i += 1;
          break;
        }
      }
    }
    parame1.jhd = localLinkedList;
    parame1.jhc = localLinkedList.size();
    parame1.jib = this.eDu;
    if (this.flags != -1) {
      parame1.tPM = this.flags;
    }
    int i = a(parame, this.fUa, this);
    GMTrace.o(12949997486080L, 96485);
    return i;
  }
  
  protected final int a(q paramq)
  {
    GMTrace.i(12950131703808L, 96486);
    int i = k.b.gum;
    GMTrace.o(12950131703808L, 96486);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(12950802792448L, 96491);
    w.d("MicroMsg.NetSceneGetPackageList", "onGYNetEnd, netid:%d, errType:%d, errCode:%d, pkgType:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(this.eDu), paramString });
    if ((paramInt2 != 0) && (paramInt3 != 0))
    {
      this.fUd.a(paramInt2, paramInt3, paramString, this);
      GMTrace.o(12950802792448L, 96491);
      return;
    }
    paramq = (acb)((com.tencent.mm.ad.b)paramq).gtD.gtK;
    if (paramq.jib != this.eDu)
    {
      w.e("MicroMsg.NetSceneGetPackageList", "packageType is not consistent, respType = %d", new Object[] { Integer.valueOf(paramq.jib) });
      this.fUd.a(3, -1, "", this);
      GMTrace.o(12950802792448L, 96491);
      return;
    }
    paramArrayOfByte = paramq.jhd;
    Object localObject1 = new StringBuilder("summer list size:");
    if (paramArrayOfByte == null)
    {
      paramInt1 = 0;
      w.v("MicroMsg.NetSceneGetPackageList", paramInt1 + " packageType: " + this.eDu + " resp.Type: " + paramq.jib);
      if (this.eDu != 2) {
        break label344;
      }
      i(paramArrayOfByte);
    }
    for (;;)
    {
      localObject1 = new ru();
      ((ru)localObject1).eWD.eWE = paramArrayOfByte;
      ((ru)localObject1).eWD.eDu = this.eDu;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
      if (paramq.tXv <= 0) {
        break label1598;
      }
      if (a(this.gtW, this.fUd) != -1) {
        break label1622;
      }
      this.fUd.a(3, -1, "doScene failed", this);
      GMTrace.o(12950802792448L, 96491);
      return;
      paramInt1 = paramArrayOfByte.size();
      break;
      label344:
      if (this.eDu == 1)
      {
        h(paramArrayOfByte);
      }
      else if (this.eDu == 4)
      {
        j(paramArrayOfByte);
      }
      else if (this.eDu == 6)
      {
        w.i("MicroMsg.NetSceneGetPackageList", "change new egg.");
      }
      else if (this.eDu == 7)
      {
        k(paramArrayOfByte);
      }
      else
      {
        Object localObject2;
        m localm2;
        if (this.eDu == 8)
        {
          if ((paramArrayOfByte == null) || (paramArrayOfByte.size() <= 0))
          {
            w.d("MicroMsg.NetSceneGetPackageList", "empty regioncode pkg list");
          }
          else
          {
            w.d("MicroMsg.NetSceneGetPackageList", "pkgList size " + paramArrayOfByte.size());
            localObject1 = (asb)paramArrayOfByte.get(0);
            localObject2 = t.Kj().aR(((asb)localObject1).lSW, this.eDu);
            localm2 = a((asb)localObject1);
            localm2.eQl = -1;
            if (localObject2 == null) {
              t.Kj().a(localm2);
            }
            for (;;)
            {
              w.d("MicroMsg.NetSceneGetPackageList", ((asb)localObject1).lPi + " - " + ((asb)localObject1).lSW + " - " + ((asb)localObject1).uhe + " - " + ((asb)localObject1).jhV);
              break;
              t.Kj().b(localm2);
            }
          }
        }
        else if (this.eDu == 9) {
          g(paramArrayOfByte);
        } else if (this.eDu == 10)
        {
          if ((paramArrayOfByte == null) || (paramArrayOfByte.size() <= 0))
          {
            w.e("MicroMsg.NetSceneGetPackageList", "empty mass send top config package");
          }
          else
          {
            w.d("MicroMsg.NetSceneGetPackageList", "pkgList size " + paramArrayOfByte.size());
            localObject2 = (asb)paramArrayOfByte.get(0);
            localObject1 = t.Kj().aR(((asb)localObject2).lSW, this.eDu);
            localObject2 = a((asb)localObject2);
            ((m)localObject2).eQl = -1;
            if (localObject1 == null) {
              t.Kj().a((m)localObject2);
            } else {
              t.Kj().b((m)localObject2);
            }
          }
        }
        else if (this.eDu != 11) {
          if (this.eDu == 12) {
            m(paramArrayOfByte);
          } else if (this.eDu == 5) {
            n(paramArrayOfByte);
          } else if (this.eDu == 20) {
            l(paramArrayOfByte);
          } else if (this.eDu == 17)
          {
            if ((paramArrayOfByte == null) || (paramArrayOfByte.size() == 0))
            {
              w.d("MicroMsg.NetSceneGetPackageList", "poi type is null");
            }
            else
            {
              localObject1 = (asb)paramArrayOfByte.get(0);
              w.d("MicroMsg.NetSceneGetPackageList", ((asb)localObject1).lPi + " - " + ((asb)localObject1).lSW + " - " + ((asb)localObject1).uhe + " - " + ((asb)localObject1).jhV);
              localObject2 = t.Kj().aR(((asb)localObject1).lSW, this.eDu);
              localm2 = a((asb)localObject1);
              localm2.eQl = -1;
              if (localObject2 == null) {
                t.Kj().a(localm2);
              }
              for (;;)
              {
                localObject2 = new lo();
                try
                {
                  ((lo)localObject2).ePW.content = com.tencent.mm.platformtools.n.a(((asb)localObject1).tQO);
                  if (((lo)localObject2).ePW.content == null) {
                    break;
                  }
                  com.tencent.mm.sdk.b.a.vgX.a((com.tencent.mm.sdk.b.b)localObject2, Looper.getMainLooper());
                }
                catch (Exception localException)
                {
                  w.e("MicroMsg.NetSceneGetPackageList", localException.getMessage());
                }
                t.Kj().b(localm2);
              }
            }
          }
          else if (this.eDu != 18) {
            if (this.eDu == 19)
            {
              L(paramArrayOfByte);
            }
            else
            {
              m localm1;
              if (this.eDu == 21)
              {
                if ((paramArrayOfByte == null) || (paramArrayOfByte.size() <= 0))
                {
                  w.d("MicroMsg.NetSceneGetPackageList", "summer trace config empty scene list");
                }
                else
                {
                  localObject2 = (asb)paramArrayOfByte.get(0);
                  w.d("MicroMsg.NetSceneGetPackageList", "summer getpackage pkg: " + localObject2 + "|id = " + ((asb)localObject2).lSW + "|Name = " + ((asb)localObject2).lPi + "|PackName = " + ((asb)localObject2).uhe + "|Size = " + ((asb)localObject2).jhV + "|Version = " + ((asb)localObject2).jia);
                  localm1 = t.Kj().aR(((asb)localObject2).lSW, this.eDu);
                  localObject2 = a((asb)localObject2);
                  ((m)localObject2).eQl = -1;
                  if (localm1 == null) {
                    t.Kj().a((m)localObject2);
                  } else if (localm1.version < ((m)localObject2).version) {
                    t.Kj().b((m)localObject2);
                  } else {
                    w.d("MicroMsg.NetSceneGetPackageList", "summer old version [%d] new version[%d], not need update", new Object[] { Integer.valueOf(localm1.version), Integer.valueOf(((m)localObject2).version) });
                  }
                }
              }
              else if (23 == this.eDu)
              {
                if ((paramArrayOfByte == null) || (paramArrayOfByte.size() <= 0))
                {
                  w.d("MicroMsg.NetSceneGetPackageList", "permission tips config is empty");
                }
                else
                {
                  localObject2 = (asb)paramArrayOfByte.get(0);
                  w.d("MicroMsg.NetSceneGetPackageList", "permission getpackage pkg: " + localObject2 + "|id = " + ((asb)localObject2).lSW + "|Name = " + ((asb)localObject2).lPi + "|PackName = " + ((asb)localObject2).uhe + "|Size = " + ((asb)localObject2).jhV + "|Version = " + ((asb)localObject2).jia);
                  localm1 = t.Kj().aR(((asb)localObject2).lSW, this.eDu);
                  localObject2 = a((asb)localObject2);
                  ((m)localObject2).eQl = -1;
                  if (localm1 == null) {
                    t.Kj().a((m)localObject2);
                  } else if (localm1.version < ((m)localObject2).version) {
                    t.Kj().b((m)localObject2);
                  }
                }
              }
              else if (this.eDu == 26) {
                M(paramArrayOfByte);
              } else if (this.eDu == 36) {
                N(paramArrayOfByte);
              } else if (this.eDu == 37) {
                o(paramArrayOfByte);
              }
            }
          }
        }
      }
    }
    label1598:
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(12950802792448L, 96491);
    return;
    label1622:
    GMTrace.o(12950802792448L, 96491);
  }
  
  protected final void a(k.a parama)
  {
    GMTrace.i(12950400139264L, 96488);
    GMTrace.o(12950400139264L, 96488);
  }
  
  protected final boolean b(com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(12951071227904L, 96493);
    if (!(paramk instanceof k))
    {
      GMTrace.o(12951071227904L, 96493);
      return true;
    }
    if (this.eDu != ((k)paramk).eDu)
    {
      GMTrace.o(12951071227904L, 96493);
      return true;
    }
    GMTrace.o(12951071227904L, 96493);
    return false;
  }
  
  public final int getType()
  {
    GMTrace.i(12952816058368L, 96506);
    GMTrace.o(12952816058368L, 96506);
    return 159;
  }
  
  protected final int vB()
  {
    GMTrace.i(12950265921536L, 96487);
    GMTrace.o(12950265921536L, 96487);
    return 20;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\aw\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */