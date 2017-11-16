package com.tencent.mm.plugin.favorite.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.favorite.h;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.ts;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.tw;
import com.tencent.mm.protocal.c.tz;
import com.tencent.mm.protocal.c.uf;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;

public final class q
  implements x.a
{
  public boolean lbg;
  
  public q()
  {
    GMTrace.i(6260317487104L, 46643);
    this.lbg = true;
    GMTrace.o(6260317487104L, 46643);
  }
  
  public static boolean b(th paramth)
  {
    GMTrace.i(6260585922560L, 46645);
    if (paramth == null)
    {
      GMTrace.o(6260585922560L, 46645);
      return true;
    }
    switch (paramth.aGU)
    {
    case 5: 
    case 6: 
    case 9: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    case 14: 
    default: 
      GMTrace.o(6260585922560L, 46645);
      return false;
    case 2: 
    case 8: 
      if (!new File(x.g(paramth)).exists())
      {
        GMTrace.o(6260585922560L, 46645);
        return true;
      }
      GMTrace.o(6260585922560L, 46645);
      return false;
    case 15: 
      if (bg.Sy(com.tencent.mm.k.g.ut().getValue("SIGHTCannotTransmitForFav")) != 0)
      {
        w.w("MicroMsg.FavSendFilter", "can not retransmit short video");
        GMTrace.o(6260585922560L, 46645);
        return true;
      }
      if (new File(x.g(paramth)).exists())
      {
        GMTrace.o(6260585922560L, 46645);
        return false;
      }
      GMTrace.o(6260585922560L, 46645);
      return true;
    case 4: 
      if (new File(x.g(paramth)).exists())
      {
        GMTrace.o(6260585922560L, 46645);
        return false;
      }
      boolean bool = bg.nm(paramth.ujA);
      GMTrace.o(6260585922560L, 46645);
      return bool;
    case 7: 
      if ((bg.nm(paramth.ujA)) && (bg.nm(paramth.ujC)) && (bg.nm(paramth.ujE)) && (bg.nm(paramth.ujE)))
      {
        GMTrace.o(6260585922560L, 46645);
        return true;
      }
      GMTrace.o(6260585922560L, 46645);
      return false;
    }
    GMTrace.o(6260585922560L, 46645);
    return true;
  }
  
  public static boolean h(j paramj)
  {
    GMTrace.i(6260720140288L, 46646);
    if (paramj == null)
    {
      GMTrace.o(6260720140288L, 46646);
      return false;
    }
    if ((paramj.field_itemStatus > 0) && (!x.s(paramj)))
    {
      GMTrace.o(6260720140288L, 46646);
      return false;
    }
    Object localObject = h.axB().cf(paramj.field_localId);
    File localFile = new File(x.g(x.n(paramj)));
    switch (paramj.field_type)
    {
    }
    do
    {
      do
      {
        do
        {
          GMTrace.o(6260720140288L, 46646);
          return false;
          if ((paramj.field_id <= 0) && (localObject != null))
          {
            GMTrace.o(6260720140288L, 46646);
            return false;
          }
          if ((paramj.field_favProto == null) || (paramj.field_favProto.ulB.size() <= 1))
          {
            GMTrace.o(6260720140288L, 46646);
            return false;
          }
          paramj = paramj.field_favProto.ulB.iterator();
          do
          {
            if (!paramj.hasNext()) {
              break;
            }
            localObject = (th)paramj.next();
          } while ((bg.nm(((th)localObject).ujt)) || (bg.nm(((th)localObject).ujv)) || (com.tencent.mm.a.e.aZ(x.g((th)localObject))));
          GMTrace.o(6260720140288L, 46646);
          return true;
        } while (localFile.exists());
        GMTrace.o(6260720140288L, 46646);
        return true;
        if (bg.Sy(com.tencent.mm.k.g.ut().getValue("SIGHTCannotTransmitForFav")) != 0)
        {
          w.w("MicroMsg.FavSendFilter", "can not retransmit short video");
          GMTrace.o(6260720140288L, 46646);
          return false;
        }
      } while (localFile.exists());
      GMTrace.o(6260720140288L, 46646);
      return true;
    } while ((!bg.nm(x.n(paramj).ujA)) || (localFile.exists()));
    GMTrace.o(6260720140288L, 46646);
    return true;
  }
  
  public final boolean g(j paramj)
  {
    GMTrace.i(6260451704832L, 46644);
    if (paramj == null)
    {
      GMTrace.o(6260451704832L, 46644);
      return true;
    }
    if (x.u(paramj))
    {
      GMTrace.o(6260451704832L, 46644);
      return true;
    }
    Object localObject1 = h.axB().cf(paramj.field_localId);
    boolean bool;
    Object localObject2;
    switch (paramj.field_type)
    {
    case 9: 
    case 12: 
    case 13: 
    case 17: 
    default: 
      GMTrace.o(6260451704832L, 46644);
      return false;
    case 14: 
    case 18: 
      if ((paramj.field_id <= 0) && (localObject1 != null))
      {
        GMTrace.o(6260451704832L, 46644);
        return true;
      }
      if ((paramj.field_type == 18) && ((paramj.field_favProto == null) || (paramj.field_favProto.ulB.size() <= 1)))
      {
        GMTrace.o(6260451704832L, 46644);
        return true;
      }
      if ((paramj.field_type == 18) && ((bg.nm(((th)paramj.field_favProto.ulB.get(0)).ujt)) || (bg.nm(((th)paramj.field_favProto.ulB.get(0)).ujv))))
      {
        GMTrace.o(6260451704832L, 46644);
        return true;
      }
      paramj = paramj.field_favProto.ulB.iterator();
      while (paramj.hasNext())
      {
        localObject1 = (th)paramj.next();
        if (((((th)localObject1).aGU == 2) || (((th)localObject1).aGU == 8) || (((th)localObject1).aGU == 15) || (((th)localObject1).aGU == 4)) && (!com.tencent.mm.a.e.aZ(x.g((th)localObject1))))
        {
          GMTrace.o(6260451704832L, 46644);
          return true;
        }
      }
      GMTrace.o(6260451704832L, 46644);
      return false;
    case 1: 
      bool = bg.nm(paramj.field_favProto.desc);
      GMTrace.o(6260451704832L, 46644);
      return bool;
    case 2: 
    case 8: 
      if (!new File(x.g(x.n(paramj))).exists())
      {
        GMTrace.o(6260451704832L, 46644);
        return true;
      }
      GMTrace.o(6260451704832L, 46644);
      return false;
    case 16: 
      if (bg.Sy(com.tencent.mm.k.g.ut().getValue("SIGHTCannotTransmitForFav")) != 0)
      {
        w.w("MicroMsg.FavSendFilter", "can not retransmit short video");
        GMTrace.o(6260451704832L, 46644);
        return true;
      }
      localObject1 = x.n(paramj);
      localObject2 = new File(x.g((th)localObject1));
      w.v("MicroMsg.FavSendFilter", "type size, favid %d, localid %d, path %s, exist %B", new Object[] { Integer.valueOf(paramj.field_id), Long.valueOf(paramj.field_localId), ((File)localObject2).getAbsolutePath(), Boolean.valueOf(((File)localObject2).exists()) });
      if (((File)localObject2).exists())
      {
        long l1 = ((File)localObject2).length();
        long l2 = ((th)localObject1).ujO;
        if (Math.abs(l2 - l1) > 16L)
        {
          w.w("MicroMsg.FavSendFilter", "it can not retransmit short video because of file was replaced. file[%d, %s], data[%d, %s]", new Object[] { Long.valueOf(l1), com.tencent.mm.a.g.h((File)localObject2), Long.valueOf(l2), ((th)localObject1).ujK });
          GMTrace.o(6260451704832L, 46644);
          return true;
        }
        GMTrace.o(6260451704832L, 46644);
        return false;
      }
      GMTrace.o(6260451704832L, 46644);
      return true;
    case 4: 
      paramj = x.n(paramj);
      if (new File(x.g(paramj)).exists())
      {
        GMTrace.o(6260451704832L, 46644);
        return false;
      }
      bool = bg.nm(paramj.ujA);
      GMTrace.o(6260451704832L, 46644);
      return bool;
    case 6: 
      if (paramj.field_favProto.ukH == null)
      {
        GMTrace.o(6260451704832L, 46644);
        return true;
      }
      GMTrace.o(6260451704832L, 46644);
      return false;
    case 7: 
      paramj = x.n(paramj);
      if ((bg.nm(paramj.ujA)) && (bg.nm(paramj.ujC)) && (bg.nm(paramj.ujE)) && (bg.nm(paramj.ujE)))
      {
        GMTrace.o(6260451704832L, 46644);
        return true;
      }
      GMTrace.o(6260451704832L, 46644);
      return false;
    case 5: 
      localObject2 = paramj.field_favProto.ulz;
      localObject1 = paramj.field_favProto.ukJ;
      paramj = null;
      if (localObject1 != null) {
        paramj = ((uf)localObject1).umf;
      }
      localObject1 = paramj;
      if (localObject2 != null)
      {
        localObject1 = paramj;
        if (bg.nm(paramj)) {
          localObject1 = ((tw)localObject2).gVf;
        }
      }
      bool = bg.nm((String)localObject1);
      GMTrace.o(6260451704832L, 46644);
      return bool;
    case 10: 
      paramj = paramj.field_favProto.ukL;
      if ((paramj == null) || (bg.nm(paramj.info)))
      {
        GMTrace.o(6260451704832L, 46644);
        return true;
      }
      GMTrace.o(6260451704832L, 46644);
      return false;
    case 15: 
      paramj = paramj.field_favProto.ukN;
      if ((paramj == null) || (bg.nm(paramj.info)))
      {
        GMTrace.o(6260451704832L, 46644);
        return true;
      }
      GMTrace.o(6260451704832L, 46644);
      return false;
    case 11: 
      paramj = paramj.field_favProto.ukL;
      if ((paramj == null) || (bg.nm(paramj.info)))
      {
        GMTrace.o(6260451704832L, 46644);
        return true;
      }
      GMTrace.o(6260451704832L, 46644);
      return false;
    }
    if (this.lbg)
    {
      GMTrace.o(6260451704832L, 46644);
      return true;
    }
    GMTrace.o(6260451704832L, 46644);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\b\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */