package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.a;
import com.tencent.mm.plugin.game.c.am;
import com.tencent.mm.plugin.game.c.av;
import com.tencent.mm.plugin.game.c.aw;
import com.tencent.mm.plugin.game.c.ax;
import com.tencent.mm.plugin.game.c.az;
import com.tencent.mm.plugin.game.c.ba;
import com.tencent.mm.plugin.game.c.bc;
import com.tencent.mm.plugin.game.c.bm;
import com.tencent.mm.plugin.game.c.bq;
import com.tencent.mm.plugin.game.c.bx;
import com.tencent.mm.plugin.game.d.d;
import com.tencent.mm.plugin.game.ui.GameMediaList.a;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ac
  extends aa
{
  public am lNW;
  private boolean lNX;
  public c lNY;
  public ad lNZ;
  
  public ac(a parama)
  {
    GMTrace.i(12631767252992L, 94114);
    if (parama == null)
    {
      this.lNW = new am();
      GMTrace.o(12631767252992L, 94114);
      return;
    }
    this.lNW = ((am)parama);
    this.lNX = false;
    PY();
    GMTrace.o(12631767252992L, 94114);
  }
  
  public ac(byte[] paramArrayOfByte)
  {
    GMTrace.i(12631901470720L, 94115);
    this.lNW = new am();
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      GMTrace.o(12631901470720L, 94115);
      return;
    }
    try
    {
      this.lNW.aD(paramArrayOfByte);
      this.lNX = true;
      PY();
      GMTrace.o(12631901470720L, 94115);
      return;
    }
    catch (IOException paramArrayOfByte)
    {
      for (;;)
      {
        w.e("MicroMsg.GamePBDataDetail", "Parsing Failed: %s", new Object[] { paramArrayOfByte.getMessage() });
      }
    }
  }
  
  private void PY()
  {
    GMTrace.i(12632035688448L, 94116);
    Object localObject = a(this.lNW.lPb);
    if (localObject != null)
    {
      ((c)localObject).scene = 12;
      ((c)localObject).eSa = 1201;
    }
    this.lNY = ((c)localObject);
    if (this.lNX)
    {
      this.lNZ = new ad(this.lNY.field_appId);
      if (!this.lNX)
      {
        d.a(this.lNY);
        SubCoreGameCenter.aGj().a(this.lNY.field_appId, this.lNW);
      }
      GMTrace.o(12632035688448L, 94116);
      return;
    }
    String str = this.lNY.field_appId;
    if (this.lNW.lRa != null) {}
    for (localObject = this.lNW.lRa.lSB;; localObject = null)
    {
      this.lNZ = new ad(str, (List)localObject);
      break;
    }
  }
  
  public final String aFE()
  {
    GMTrace.i(12632169906176L, 94117);
    String str;
    if (this.lNW.lRe != null)
    {
      str = this.lNW.lRe.title;
      GMTrace.o(12632169906176L, 94117);
      return str;
    }
    if (this.lNW.lQZ != null)
    {
      str = this.lNW.lQZ.eBt;
      GMTrace.o(12632169906176L, 94117);
      return str;
    }
    GMTrace.o(12632169906176L, 94117);
    return null;
  }
  
  public final LinkedList<b> aFF()
  {
    GMTrace.i(12632304123904L, 94118);
    LinkedList localLinkedList;
    Iterator localIterator;
    Object localObject;
    b localb;
    if ((this.lNW.lRe != null) && (this.lNW.lRe.jBk != null))
    {
      localLinkedList = new LinkedList();
      localIterator = this.lNW.lRe.jBk.iterator();
      while (localIterator.hasNext())
      {
        localObject = (bc)localIterator.next();
        localb = new b();
        localb.eQA = ((bc)localObject).eQA;
        localb.desc = ((bc)localObject).desc;
        localLinkedList.add(localb);
      }
      GMTrace.o(12632304123904L, 94118);
      return localLinkedList;
    }
    if ((this.lNW.lQZ != null) && (this.lNW.lQZ.lRK != null))
    {
      localLinkedList = new LinkedList();
      localIterator = this.lNW.lQZ.lRK.iterator();
      while (localIterator.hasNext())
      {
        localObject = (ax)localIterator.next();
        localb = new b();
        localb.eQA = ((ax)localObject).lRN;
        localb.title = ((ax)localObject).eBt;
        localb.desc = ((ax)localObject).lQf;
        localb.url = ((ax)localObject).lPd;
        localLinkedList.add(localb);
      }
      GMTrace.o(12632304123904L, 94118);
      return localLinkedList;
    }
    GMTrace.o(12632304123904L, 94118);
    return null;
  }
  
  public final int aFG()
  {
    GMTrace.i(12632438341632L, 94119);
    if (this.lNW.lRe != null)
    {
      GMTrace.o(12632438341632L, 94119);
      return 2;
    }
    GMTrace.o(12632438341632L, 94119);
    return 1;
  }
  
  public final LinkedList<GameMediaList.a> aFH()
  {
    GMTrace.i(12632572559360L, 94120);
    LinkedList localLinkedList = new LinkedList();
    if ((this.lNW.lQX == null) || (this.lNW.lQX.lSj == null))
    {
      GMTrace.o(12632572559360L, 94120);
      return localLinkedList;
    }
    Iterator localIterator = this.lNW.lQX.lSj.iterator();
    while (localIterator.hasNext())
    {
      bq localbq = (bq)localIterator.next();
      GameMediaList.a locala = new GameMediaList.a();
      locala.type = localbq.lSq;
      locala.lZW = localbq.lSr;
      locala.url = localbq.lSs;
      localLinkedList.add(locala);
    }
    GMTrace.o(12632572559360L, 94120);
    return localLinkedList;
  }
  
  public final String aFI()
  {
    GMTrace.i(12632706777088L, 94121);
    if ((this.lNW.lQX == null) || (this.lNW.lQX.eBt == null))
    {
      GMTrace.o(12632706777088L, 94121);
      return null;
    }
    String str = this.lNW.lQX.eBt;
    GMTrace.o(12632706777088L, 94121);
    return str;
  }
  
  public final String aFJ()
  {
    GMTrace.i(12632840994816L, 94122);
    if ((this.lNW.lQX == null) || (this.lNW.lQX.lQf == null))
    {
      GMTrace.o(12632840994816L, 94122);
      return null;
    }
    String str = this.lNW.lQX.lQf;
    GMTrace.o(12632840994816L, 94122);
    return str;
  }
  
  public final String aFK()
  {
    GMTrace.i(12632975212544L, 94123);
    if (this.lNW.lQY == null)
    {
      GMTrace.o(12632975212544L, 94123);
      return null;
    }
    String str = this.lNW.lQY.eBt;
    GMTrace.o(12632975212544L, 94123);
    return str;
  }
  
  public final LinkedList<ba> aFL()
  {
    GMTrace.i(12633109430272L, 94124);
    if (this.lNW.lQY == null)
    {
      GMTrace.o(12633109430272L, 94124);
      return null;
    }
    LinkedList localLinkedList = this.lNW.lQY.lRQ;
    GMTrace.o(12633109430272L, 94124);
    return localLinkedList;
  }
  
  public static final class a
  {
    public String desc;
    public String title;
    public String url;
    
    public a()
    {
      GMTrace.i(12627740721152L, 94084);
      GMTrace.o(12627740721152L, 94084);
    }
  }
  
  public static final class b
  {
    public String desc;
    public String eQA;
    public String title;
    public String url;
    
    public b()
    {
      GMTrace.i(12602642006016L, 93897);
      GMTrace.o(12602642006016L, 93897);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */