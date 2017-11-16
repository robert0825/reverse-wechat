package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.c.aq;
import com.tencent.mm.plugin.game.c.b;
import com.tencent.mm.plugin.game.c.bo;
import com.tencent.mm.plugin.game.c.bv;
import com.tencent.mm.plugin.game.c.bw;
import com.tencent.mm.plugin.game.c.cd;
import com.tencent.mm.plugin.game.c.j;
import com.tencent.mm.plugin.game.d.d;
import com.tencent.mm.plugin.game.ui.GameLibraryCategoriesView.a;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public final class af
  extends aa
{
  private int lNV;
  public aq lOo;
  public LinkedList<c> lOp;
  public LinkedList<c> lOq;
  
  public af(com.tencent.mm.bm.a parama, boolean paramBoolean, int paramInt)
  {
    GMTrace.i(12612305682432L, 93969);
    this.lNV = 0;
    if (parama == null)
    {
      this.lOo = new aq();
      GMTrace.o(12612305682432L, 93969);
      return;
    }
    this.lOo = ((aq)parama);
    this.lNV = paramInt;
    this.lOp = aFT();
    this.lOq = aFU();
    if (paramBoolean) {
      SubCoreGameCenter.aGj().a("pb_library", parama);
    }
    d.V(this.lOp);
    d.V(this.lOq);
    GMTrace.o(12612305682432L, 93969);
  }
  
  public af(byte[] paramArrayOfByte)
  {
    GMTrace.i(12612439900160L, 93970);
    this.lNV = 0;
    this.lOo = new aq();
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      GMTrace.o(12612439900160L, 93970);
      return;
    }
    try
    {
      this.lOo.aD(paramArrayOfByte);
      this.lOp = aFT();
      this.lOq = aFU();
      d.V(this.lOp);
      d.V(this.lOq);
      GMTrace.o(12612439900160L, 93970);
      return;
    }
    catch (IOException paramArrayOfByte)
    {
      for (;;)
      {
        w.e("MicroMsg.GamePBDataLibrary", "Parsing Failed: %s", new Object[] { paramArrayOfByte.getMessage() });
      }
    }
  }
  
  private LinkedList<c> aFT()
  {
    GMTrace.i(12612574117888L, 93971);
    LinkedList localLinkedList = new LinkedList();
    if ((this.lOo.lRB == null) || (this.lOo.lRB.lSm == null) || (this.lOo.lRB.lSm.lSz == null))
    {
      GMTrace.o(12612574117888L, 93971);
      return localLinkedList;
    }
    Iterator localIterator = this.lOo.lRB.lSm.lSz.iterator();
    int i = 1;
    while (localIterator.hasNext())
    {
      bw localbw = (bw)localIterator.next();
      c localc = a(localbw.lPb);
      if (localc != null)
      {
        localc.lLG = localbw.lPb.lPq;
        localc.scene = 11;
        localc.eSa = 1110;
        localc.position = i;
        localLinkedList.add(localc);
        i += 1;
      }
    }
    GMTrace.o(12612574117888L, 93971);
    return localLinkedList;
  }
  
  private LinkedList<c> aFU()
  {
    GMTrace.i(12612708335616L, 93972);
    LinkedList localLinkedList = new LinkedList();
    if (this.lOo.lRC == null)
    {
      GMTrace.o(12612708335616L, 93972);
      return localLinkedList;
    }
    int i = this.lNV;
    int j = this.lNV / 15;
    Iterator localIterator = this.lOo.lRC.iterator();
    i += 1;
    j += 901;
    b localb;
    label124:
    int k;
    Object localObject;
    if (localIterator.hasNext())
    {
      localb = (b)localIterator.next();
      switch (localb.jib)
      {
      default: 
        k = j;
        localObject = null;
        j = i;
        i = k;
      }
    }
    for (;;)
    {
      if (localObject != null)
      {
        ((c)localObject).scene = 11;
        ((c)localObject).eSa = 1111;
        localLinkedList.add(localObject);
        k = j;
        j = i;
        i = k;
        break;
        localObject = a(localb.lPb);
        if (localObject == null) {
          break label306;
        }
        ((c)localObject).position = i;
        k = i + 1;
        i = j;
        j = k;
        continue;
        if (localb.lPe == null) {
          break label124;
        }
        localObject = a(localb.lPe.lPb);
        if (localObject == null) {
          break label297;
        }
        ((c)localObject).type = 1;
        ((c)localObject).lLy = localb.lPe.lPd;
        ((c)localObject).lLz = localb.lPe.lPc;
        k = j + 1;
        ((c)localObject).position = j;
        j = i;
        i = k;
        continue;
        GMTrace.o(12612708335616L, 93972);
        return localLinkedList;
      }
      k = j;
      j = i;
      i = k;
      break;
      label297:
      k = i;
      i = j;
      j = k;
      continue;
      label306:
      k = i;
      i = j;
      j = k;
    }
  }
  
  public final HashMap<Integer, String> aFV()
  {
    GMTrace.i(12612842553344L, 93973);
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    if ((this.lOo.lRB == null) || (this.lOo.lRB.lSp == null))
    {
      GMTrace.o(12612842553344L, 93973);
      return localLinkedHashMap;
    }
    Iterator localIterator = this.lOo.lRB.lSp.iterator();
    while (localIterator.hasNext())
    {
      cd localcd = (cd)localIterator.next();
      localLinkedHashMap.put(Integer.valueOf(localcd.lRz), localcd.lPi);
    }
    GMTrace.o(12612842553344L, 93973);
    return localLinkedHashMap;
  }
  
  public final LinkedList<GameLibraryCategoriesView.a> aFW()
  {
    GMTrace.i(12612976771072L, 93974);
    if ((this.lOo.lRB == null) || (this.lOo.lRB.lSn == null))
    {
      GMTrace.o(12612976771072L, 93974);
      return null;
    }
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.lOo.lRB.lSn.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      j localj = (j)localIterator.next();
      GameLibraryCategoriesView.a locala = new GameLibraryCategoriesView.a();
      locala.lZe = localj.lPN;
      locala.lZf = localj.lPi;
      locala.lZg = localj.lPd;
      locala.izx = localj.lPh;
      i += 1;
      locala.position = i;
      localLinkedList.add(locala);
    }
    GMTrace.o(12612976771072L, 93974);
    return localLinkedList;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */