package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.a;
import com.tencent.mm.plugin.game.c.ac;
import com.tencent.mm.plugin.game.c.ad;
import com.tencent.mm.plugin.game.c.ao;
import com.tencent.mm.plugin.game.c.bi;
import com.tencent.mm.plugin.game.c.bj;
import com.tencent.mm.plugin.game.c.bk;
import com.tencent.mm.plugin.game.c.bn;
import com.tencent.mm.plugin.game.c.br;
import com.tencent.mm.plugin.game.c.h;
import com.tencent.mm.plugin.game.c.s;
import com.tencent.mm.plugin.game.d.d;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ar;
import com.tencent.mm.y.at;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public final class ae
  extends aa
{
  public ao lOf;
  private boolean lOg;
  public LinkedList<c> lOh;
  public HashMap<String, Integer> lOi;
  public a lOj;
  
  public ae(a parama)
  {
    GMTrace.i(12608144932864L, 93938);
    this.lOi = new HashMap();
    if (parama == null)
    {
      this.lOf = new ao();
      GMTrace.o(12608144932864L, 93938);
      return;
    }
    this.lOf = ((ao)parama);
    this.lOg = true;
    PY();
    GMTrace.o(12608144932864L, 93938);
  }
  
  public ae(byte[] paramArrayOfByte)
  {
    GMTrace.i(12608279150592L, 93939);
    this.lOi = new HashMap();
    this.lOf = new ao();
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      GMTrace.o(12608279150592L, 93939);
      return;
    }
    try
    {
      this.lOf.aD(paramArrayOfByte);
      this.lOg = false;
      PY();
      GMTrace.o(12608279150592L, 93939);
      return;
    }
    catch (IOException paramArrayOfByte)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GamePBDataIndex", "Parsing Failed: %s", new Object[] { paramArrayOfByte.getMessage() });
      }
    }
  }
  
  private void PY()
  {
    GMTrace.i(12608413368320L, 93940);
    LinkedList localLinkedList = new LinkedList();
    if ((this.lOf.lRl == null) || (this.lOf.lRl.lPI == null)) {}
    for (;;)
    {
      this.lOh = localLinkedList;
      this.lOj = aFQ();
      if (!this.lOg) {
        break label620;
      }
      d.V(this.lOh);
      if ((this.lOj == null) || (bg.cc(this.lOj.lOk))) {
        break label607;
      }
      localLinkedList = new LinkedList();
      Iterator localIterator = this.lOj.lOk.iterator();
      while (localIterator.hasNext()) {
        localLinkedList.add(((ae.a.a)localIterator.next()).lOm);
      }
      localIterator = this.lOf.lRl.lPI.iterator();
      int i = 1;
      while (localIterator.hasNext())
      {
        Object localObject = (ac)localIterator.next();
        if (((ac)localObject).lPb != null)
        {
          c localc = a(((ac)localObject).lPb);
          if (localc != null)
          {
            ad localad;
            StringBuilder localStringBuilder;
            int j;
            if (((ac)localObject).lPb.lPv != null) {
              if ((((ac)localObject).lPb.lPv.lPi != null) && (((ac)localObject).lPb.lPv.lSk != null))
              {
                localc.lLJ = ((ac)localObject).lPb.lPv.lPi;
                localc.lLK = ((ac)localObject).lPb.lPv.lSk;
                localc.lLN = ai.K(((ac)localObject).lPF, "label", localc.lLJ);
                if (((ac)localObject).lQA == null) {
                  break label565;
                }
                localObject = ((ac)localObject).lQA.iterator();
                do
                {
                  if (!((Iterator)localObject).hasNext()) {
                    break;
                  }
                  localad = (ad)((Iterator)localObject).next();
                } while (localad == null);
                if ((localad.lQB == null) || (localad.lQB.size() == 0)) {
                  break label550;
                }
                localStringBuilder = new StringBuilder();
                j = 0;
                label365:
                if (j >= localad.lQB.size()) {
                  break label511;
                }
                at.AR();
                com.tencent.mm.storage.x localx = com.tencent.mm.y.c.yK().TE((String)localad.lQB.get(j));
                if ((localx == null) || (localx.fTq == 0L)) {
                  break label490;
                }
                localStringBuilder.append(localx.vk());
              }
            }
            for (;;)
            {
              if (j < localad.lQB.size() - 1) {
                localStringBuilder.append("、");
              }
              j += 1;
              break label365;
              localc.lLN = ai.zJ(((ac)localObject).lPF);
              break;
              localc.lLN = ai.zJ(((ac)localObject).lPF);
              break;
              label490:
              localStringBuilder.append((String)localad.lQB.get(j));
            }
            label511:
            localStringBuilder.append(" ");
            localc.lLE.add(localStringBuilder.toString());
            for (;;)
            {
              localc.lLE.add(localad.lQf);
              break;
              label550:
              localc.lLE.add("");
            }
            label565:
            localc.scene = 10;
            localc.eSa = 1004;
            localc.position = i;
            localLinkedList.add(localc);
            i += 1;
          }
        }
      }
    }
    d.V(localLinkedList);
    label607:
    aFS();
    SubCoreGameCenter.aGl().init(ab.getContext());
    label620:
    GMTrace.o(12608413368320L, 93940);
  }
  
  private a aFQ()
  {
    GMTrace.i(12608816021504L, 93943);
    if ((this.lOf.lRo == null) || (bg.cc(this.lOf.lRo.lPI)))
    {
      GMTrace.o(12608816021504L, 93943);
      return null;
    }
    a locala = new a();
    Iterator localIterator = this.lOf.lRo.lPI.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      s locals = (s)localIterator.next();
      c localc = a(locals.lPb);
      if (localc != null)
      {
        localc.lLL = locals.lPj;
        localc.scene = 10;
        localc.eSa = 1002;
        i += 1;
        localc.position = i;
        ae.a.a locala1 = new ae.a.a();
        locala1.lOm = localc;
        locala1.lOn = locals.lQg;
        locala.lOk.add(locala1);
      }
    }
    locala.lOl = this.lOf.lRo.lQm;
    GMTrace.o(12608816021504L, 93943);
    return locala;
  }
  
  private void aFS()
  {
    GMTrace.i(12609084456960L, 93945);
    this.lOi = new HashMap();
    if ((this.lOf.lRp == null) || (this.lOf.lRp.lSg == null))
    {
      GMTrace.o(12609084456960L, 93945);
      return;
    }
    Iterator localIterator = this.lOf.lRp.lSg.iterator();
    while (localIterator.hasNext())
    {
      bk localbk = (bk)localIterator.next();
      Object localObject = a(localbk.lPb);
      if (localObject != null)
      {
        this.lOi.put(((c)localObject).field_appId, Integer.valueOf(((c)localObject).versionCode));
        localObject = an.aWy().Ox(((c)localObject).field_appId);
        if (localObject != null)
        {
          ((f)localObject).bZ(localbk.lSi);
          if (!an.aWy().a((f)localObject, new String[0])) {
            com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GamePBDataIndex", "Store rank info failed, AppID: %s", new Object[] { ((f)localObject).field_appId });
          }
        }
      }
    }
    GMTrace.o(12609084456960L, 93945);
  }
  
  public final com.tencent.mm.plugin.game.c.ae aFO()
  {
    GMTrace.i(12608547586048L, 93941);
    if (this.lOf != null)
    {
      com.tencent.mm.plugin.game.c.ae localae = this.lOf.lRk;
      GMTrace.o(12608547586048L, 93941);
      return localae;
    }
    GMTrace.o(12608547586048L, 93941);
    return null;
  }
  
  public final bi aFP()
  {
    GMTrace.i(12608681803776L, 93942);
    if (this.lOf != null)
    {
      bi localbi = this.lOf.lRq;
      GMTrace.o(12608681803776L, 93942);
      return localbi;
    }
    GMTrace.o(12608681803776L, 93942);
    return null;
  }
  
  public final LinkedList<c> aFR()
  {
    GMTrace.i(12608950239232L, 93944);
    LinkedList localLinkedList = new LinkedList();
    if ((this.lOf.lRp == null) || (this.lOf.lRp.lSg == null))
    {
      GMTrace.o(12608950239232L, 93944);
      return localLinkedList;
    }
    Iterator localIterator = this.lOf.lRp.lSg.iterator();
    while (localIterator.hasNext())
    {
      bk localbk = (bk)localIterator.next();
      if (localbk != null)
      {
        c localc = a(localbk.lPb);
        if (localc != null)
        {
          localc.bZ(localbk.lSi);
          localLinkedList.addFirst(localc);
        }
      }
    }
    GMTrace.o(12608950239232L, 93944);
    return localLinkedList;
  }
  
  public static final class a
  {
    public LinkedList<a> lOk;
    public br lOl;
    
    public a()
    {
      GMTrace.i(12614050512896L, 93982);
      this.lOk = new LinkedList();
      GMTrace.o(12614050512896L, 93982);
    }
    
    public static final class a
    {
      public c lOm;
      public LinkedList<com.tencent.mm.plugin.game.c.x> lOn;
      
      public a()
      {
        GMTrace.i(12627874938880L, 94085);
        GMTrace.o(12627874938880L, 94085);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */