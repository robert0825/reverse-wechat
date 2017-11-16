package com.tencent.mm.plugin.chatroom.d;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.h;
import com.tencent.mm.ac.i;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.g.b.af;
import com.tencent.mm.l.a;
import com.tencent.mm.protocal.c.any;
import com.tencent.mm.protocal.c.anz;
import com.tencent.mm.protocal.c.ok;
import com.tencent.mm.protocal.c.ol;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class f
  extends com.tencent.mm.ad.k
  implements com.tencent.mm.network.k
{
  public int eND;
  public String eNE;
  public final List<String> eNF;
  public final List<String> eNH;
  public List<String> eNI;
  public List<String> eNJ;
  private final b fUa;
  private com.tencent.mm.ad.e fUd;
  public final List<String> jMZ;
  
  public f(String paramString, List<String> paramList)
  {
    GMTrace.i(9065870655488L, 67546);
    this.eND = 0;
    w.d("MicroMsg.NetSceneCreateChatRoom", "topic : " + paramString + " size : " + paramList.size() + " username : " + (String)paramList.get(0));
    Object localObject = new b.a();
    ((b.a)localObject).gtF = new ok();
    ((b.a)localObject).gtG = new ol();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/createchatroom";
    ((b.a)localObject).gtE = 119;
    ((b.a)localObject).gtH = 37;
    ((b.a)localObject).gtI = 1000000037;
    this.fUa = ((b.a)localObject).DA();
    localObject = (ok)this.fUa.gtC.gtK;
    ((ok)localObject).ufm = com.tencent.mm.platformtools.n.ni(paramString);
    paramString = new LinkedList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      String str = (String)paramList.next();
      any localany = new any();
      localany.ufE = com.tencent.mm.platformtools.n.ni(str);
      paramString.add(localany);
    }
    ((ok)localObject).tPE = paramString;
    ((ok)localObject).jNj = paramString.size();
    this.eNF = new LinkedList();
    this.jMZ = new LinkedList();
    this.eNH = new LinkedList();
    this.eNI = new LinkedList();
    this.eNJ = new LinkedList();
    this.eNE = "";
    GMTrace.o(9065870655488L, 67546);
  }
  
  private static boolean a(ol paramol)
  {
    GMTrace.i(9066273308672L, 67549);
    if ((!com.tencent.mm.platformtools.n.a(paramol.tPF).toLowerCase().endsWith("@chatroom")) || (paramol.jNj == 0))
    {
      w.e("MicroMsg.NetSceneCreateChatRoom", "CreateChatroom: room:[" + paramol.tPF + "] listCnt:" + paramol.jNj);
      GMTrace.o(9066273308672L, 67549);
      return false;
    }
    x localx = new x();
    localx.cl(com.tencent.mm.platformtools.n.a(paramol.ufm));
    localx.cm(com.tencent.mm.platformtools.n.a(paramol.ufo));
    localx.cn(com.tencent.mm.platformtools.n.a(paramol.ufp));
    localx.setUsername(com.tencent.mm.platformtools.n.a(paramol.tPF));
    at.AR();
    ar localar = c.yK();
    if (!localar.TG(localx.field_username)) {
      localar.R(localx);
    }
    Object localObject = new h();
    ((h)localObject).username = localx.field_username;
    ((h)localObject).gsU = paramol.ubV;
    ((h)localObject).gsT = paramol.ubW;
    ((h)localObject).fiZ = 3;
    ((h)localObject).bi(false);
    ((h)localObject).eQl = -1;
    com.tencent.mm.ac.n.Di().a((h)localObject);
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    if (i < paramol.tPE.size())
    {
      if (((anz)paramol.tPE.get(i)).uDQ == 0)
      {
        localObject = localar.TE(com.tencent.mm.platformtools.n.a(((anz)paramol.tPE.get(i)).ufE));
        if ((int)((a)localObject).fTq == 0) {
          break label332;
        }
        ((x)localObject).uz();
        localar.a(((af)localObject).field_username, (x)localObject);
      }
      for (;;)
      {
        localArrayList.add(((af)localObject).field_username);
        i += 1;
        break;
        label332:
        localObject = m.a((x)localObject, (anz)paramol.tPE.get(i));
        localar.R((x)localObject);
      }
    }
    if (!localArrayList.contains(com.tencent.mm.y.q.zE()))
    {
      localArrayList.add(com.tencent.mm.y.q.zE());
      w.d("MicroMsg.NetSceneCreateChatRoom", "respon has not self add one " + localArrayList.contains(com.tencent.mm.y.q.zE()));
    }
    boolean bool = m.a(localx.field_username, localArrayList, com.tencent.mm.y.q.zE());
    GMTrace.o(9066273308672L, 67549);
    return bool;
  }
  
  private void af(List<anz> paramList)
  {
    GMTrace.i(9066541744128L, 67551);
    int i = 0;
    if (i < paramList.size())
    {
      int j = ((anz)paramList.get(i)).uDQ;
      if (j == 0) {
        this.eNJ.add(com.tencent.mm.platformtools.n.a(((anz)paramList.get(i)).ufE));
      }
      for (;;)
      {
        i += 1;
        break;
        if (j == 3)
        {
          w.d("MicroMsg.NetSceneCreateChatRoom", " blacklist : " + ((anz)paramList.get(i)).ufE);
          this.jMZ.add(com.tencent.mm.platformtools.n.a(((anz)paramList.get(i)).ufE));
        }
        else if (j == 1)
        {
          w.d("MicroMsg.NetSceneCreateChatRoom", " not user : " + ((anz)paramList.get(i)).ufE);
          this.eNH.add(com.tencent.mm.platformtools.n.a(((anz)paramList.get(i)).ufE));
        }
        else if (j == 2)
        {
          w.d("MicroMsg.NetSceneCreateChatRoom", " invalid username : " + ((anz)paramList.get(i)).ufE);
          this.eNF.add(com.tencent.mm.platformtools.n.a(((anz)paramList.get(i)).ufE));
        }
        else if (j == 4)
        {
          w.d("MicroMsg.NetSceneCreateChatRoom", " verify user : " + ((anz)paramList.get(i)).ufE);
          this.eNI.add(com.tencent.mm.platformtools.n.a(((anz)paramList.get(i)).ufE));
        }
        else if ((j != 5) && (j != 6))
        {
          w.w("MicroMsg.NetSceneCreateChatRoom", "unknown member status : status = " + j);
        }
      }
    }
    GMTrace.o(9066541744128L, 67551);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ad.e parame1)
  {
    GMTrace.i(9066004873216L, 67547);
    this.fUd = parame1;
    int i = a(parame, this.fUa, this);
    GMTrace.o(9066004873216L, 67547);
    return i;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    GMTrace.i(9066407526400L, 67550);
    w.d("MicroMsg.NetSceneCreateChatRoom", "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    paramq = (ol)this.fUa.gtD.gtK;
    this.eNE = com.tencent.mm.platformtools.n.a(paramq.tPF);
    paramInt1 = this.fUa.gtD.tKs;
    this.eND = paramq.jNj;
    af(paramq.tPE);
    if ((!bg.nm(this.eNE)) && (paramInt1 == 0)) {
      a(paramq);
    }
    this.fUd.a(paramInt2, paramInt3, paramString, this);
    GMTrace.o(9066407526400L, 67550);
  }
  
  public final int getType()
  {
    GMTrace.i(9066139090944L, 67548);
    GMTrace.o(9066139090944L, 67548);
    return 119;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\chatroom\d\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */