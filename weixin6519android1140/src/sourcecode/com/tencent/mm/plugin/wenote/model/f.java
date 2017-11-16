package com.tencent.mm.plugin.wenote.model;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.g.a.ft;
import com.tencent.mm.g.a.ft.a;
import com.tencent.mm.g.a.ft.b;
import com.tencent.mm.g.a.fv;
import com.tencent.mm.g.a.fv.a;
import com.tencent.mm.g.a.fv.b;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class f
{
  public static String K(Context paramContext, int paramInt)
  {
    GMTrace.i(5655398187008L, 42136);
    ft localft = new ft();
    localft.eIo.type = 21;
    localft.eIo.context = paramContext;
    localft.eIo.eIw = paramInt;
    a.vgX.m(localft);
    paramContext = localft.eIp.path;
    GMTrace.o(5655398187008L, 42136);
    return paramContext;
  }
  
  public static String NA(String paramString)
  {
    GMTrace.i(5655532404736L, 42137);
    paramString = g.n((paramString + 18 + System.currentTimeMillis()).getBytes());
    GMTrace.o(5655532404736L, 42137);
    return paramString;
  }
  
  public static void Z(ArrayList<String> paramArrayList)
  {
    int j = 0;
    GMTrace.i(5656069275648L, 42141);
    if (b.bGM().sbA == null)
    {
      w.e("MicroMsg.WNNoteFavLogic", "sortNoteDataList, getWnNoteBase() is null");
      GMTrace.o(5656069275648L, 42141);
      return;
    }
    tt localtt = b.bGM().sbA.sbM;
    Object localObject1 = new ArrayList();
    Object localObject2 = new HashMap();
    if (localtt == null)
    {
      w.e("MicroMsg.WNNoteFavLogic", "sortNoteDataList, protoItem is null");
      GMTrace.o(5656069275648L, 42141);
      return;
    }
    Object localObject3 = localtt.ulB.iterator();
    while (((Iterator)localObject3).hasNext())
    {
      th localth = (th)((Iterator)localObject3).next();
      if ((!bg.nm(localth.ukv)) && (!localth.ukv.contains("WeNoteHtmlFile")) && (!localth.ukv.contains("-1")))
      {
        ((List)localObject1).add(localth.ukv);
        ((HashMap)localObject2).put(localth.ukv, localth);
      }
    }
    if ((paramArrayList.size() == ((List)localObject1).size()) && (((List)localObject1).containsAll(paramArrayList)) && (paramArrayList.containsAll((Collection)localObject1)))
    {
      i = 0;
      if (i >= ((List)localObject1).size()) {
        break label483;
      }
      if (((String)((List)localObject1).get(i)).trim().equals(((String)paramArrayList.get(i)).trim())) {}
    }
    label483:
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        localObject1 = new LinkedList();
        i = j;
        for (;;)
        {
          if (i < paramArrayList.size())
          {
            ((LinkedList)localObject1).add(((HashMap)localObject2).get(paramArrayList.get(i)));
            i += 1;
            continue;
            i += 1;
            break;
          }
        }
        localtt.av((LinkedList)localObject1);
        bGO();
        ((HashMap)localObject2).clear();
      }
      GMTrace.o(5656069275648L, 42141);
      return;
      ((List)localObject1).removeAll(paramArrayList);
      if (((List)localObject1).size() == 0)
      {
        GMTrace.o(5656069275648L, 42141);
        return;
      }
      paramArrayList = new ArrayList();
      localObject2 = localtt.ulB.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (th)((Iterator)localObject2).next();
        if (((List)localObject1).contains(((th)localObject3).ukv)) {
          paramArrayList.add(localObject3);
        }
      }
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext())
      {
        localObject1 = (th)paramArrayList.next();
        localtt.ulB.remove(localObject1);
      }
      bGO();
      GMTrace.o(5656069275648L, 42141);
      return;
    }
  }
  
  public static float aD(long paramLong)
  {
    float f1 = 1.0F;
    GMTrace.i(5655263969280L, 42135);
    float f2 = (float)paramLong / 1000.0F;
    if (f2 < 1.0F) {}
    for (;;)
    {
      f1 = Math.round(f1 * 10.0F) / 10.0F;
      GMTrace.o(5655263969280L, 42135);
      return f1;
      f1 = f2;
    }
  }
  
  public static String ab(float paramFloat)
  {
    GMTrace.i(5655129751552L, 42134);
    if (paramFloat < 1024.0F)
    {
      str = String.format("%.1fB", new Object[] { Float.valueOf(paramFloat) });
      GMTrace.o(5655129751552L, 42134);
      return str;
    }
    if (paramFloat < 1048576.0F)
    {
      str = String.format("%.1fKB", new Object[] { Float.valueOf(paramFloat / 1024.0F) });
      GMTrace.o(5655129751552L, 42134);
      return str;
    }
    if (paramFloat < 1.07374182E9F)
    {
      str = String.format("%.1fMB", new Object[] { Float.valueOf(paramFloat / 1024.0F / 1024.0F) });
      GMTrace.o(5655129751552L, 42134);
      return str;
    }
    String str = String.format("%.1fGB", new Object[] { Float.valueOf(paramFloat / 1024.0F / 1024.0F / 1024.0F) });
    GMTrace.o(5655129751552L, 42134);
    return str;
  }
  
  private static void bGO()
  {
    GMTrace.i(5656203493376L, 42142);
    ft localft = new ft();
    localft.eIo.type = 30;
    if (b.bGM().sbA != null)
    {
      localft.eIo.eDx = b.bGM().sbA.sbM;
      a.vgX.m(localft);
      b.bGM().sbA.Ny(localft.eIp.path);
    }
    GMTrace.o(5656203493376L, 42142);
  }
  
  public static e ep(long paramLong)
  {
    GMTrace.i(20602287030272L, 153499);
    fv localfv = new fv();
    localfv.eIJ.eDp = paramLong;
    a.vgX.m(localfv);
    if (localfv.eIK.ret == 0)
    {
      w.w("MicroMsg.WNNoteFavLogic", "can not fetch FavItem");
      GMTrace.o(20602287030272L, 153499);
      return null;
    }
    w.d("MicroMsg.WNNoteFavLogic", "fetch favitem localId %s, itemStatus %d", new Object[] { Long.valueOf(localfv.eIJ.eDp), Integer.valueOf(localfv.eIK.field_itemStatus) });
    e locale = new e();
    locale.field_localId = localfv.eIJ.eDp;
    locale.field_id = localfv.eIK.field_id;
    locale.field_fromUser = localfv.eIK.field_fromUser;
    locale.field_toUser = localfv.eIK.field_toUser;
    locale.field_favProto = localfv.eIK.field_favProto;
    locale.field_realChatName = localfv.eIK.field_realChatName;
    locale.field_type = localfv.eIK.field_type;
    locale.field_itemStatus = localfv.eIK.field_itemStatus;
    locale.field_updateTime = localfv.eIK.field_updatetime;
    GMTrace.o(20602287030272L, 153499);
    return locale;
  }
  
  public static String h(th paramth)
  {
    GMTrace.i(5655666622464L, 42138);
    ft localft = new ft();
    localft.eIo.type = 27;
    localft.eIo.eIq = paramth;
    a.vgX.m(localft);
    paramth = localft.eIp.eIy;
    GMTrace.o(5655666622464L, 42138);
    return paramth;
  }
  
  public static String n(th paramth)
  {
    GMTrace.i(17250601926656L, 128527);
    ft localft = new ft();
    localft.eIo.type = 27;
    localft.eIo.eIq = paramth;
    a.vgX.m(localft);
    paramth = localft.eIp.path;
    GMTrace.o(17250601926656L, 128527);
    return paramth;
  }
  
  public static void s(long paramLong, String paramString)
  {
    GMTrace.i(5655800840192L, 42139);
    if (paramLong <= 0L)
    {
      GMTrace.o(5655800840192L, 42139);
      return;
    }
    Object localObject1 = new ft();
    ((ft)localObject1).eIo.type = 34;
    ((ft)localObject1).eIo.eDp = paramLong;
    a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
    if (((ft)localObject1).eIo.eDx == null)
    {
      GMTrace.o(5655800840192L, 42139);
      return;
    }
    if ((((ft)localObject1).eIo.eDx.ulB == null) || (((ft)localObject1).eIo.eDx.ulB.size() <= 1))
    {
      GMTrace.o(5655800840192L, 42139);
      return;
    }
    if (((th)((ft)localObject1).eIo.eDx.ulB.get(0)).ukv != null)
    {
      GMTrace.o(5655800840192L, 42139);
      return;
    }
    w.i("MicroMsg.WNNoteFavLogic", "Note: Htmlid is null,  do updateFavitemHtmlidStorage");
    if ((!bg.nm(paramString)) && (com.tencent.mm.a.e.aZ(paramString)))
    {
      try
      {
        localObject2 = com.tencent.mm.plugin.wenote.b.b.NR(paramString);
        paramString = ((ft)localObject1).eIo.eDx;
        localObject1 = new ArrayList();
        if ((!bg.nm((String)localObject2)) && (((String)localObject2).length() != 0)) {
          break label261;
        }
        GMTrace.o(5655800840192L, 42139);
        return;
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.WNNoteFavLogic", "Note: FileNotFoundException :%s", new Object[] { paramString.getMessage() });
      }
    }
    else
    {
      GMTrace.o(5655800840192L, 42139);
      return;
    }
    label261:
    Object localObject2 = Pattern.compile("<object[^>]*>", 2).matcher((CharSequence)localObject2);
    Object localObject3;
    int k;
    int i;
    int j;
    if (((Matcher)localObject2).find())
    {
      localObject3 = ((Matcher)localObject2).group();
      k = ((String)localObject3).indexOf("WeNote_");
      if (k != -1)
      {
        i = ((String)localObject3).indexOf("\"", k + 1);
        if (i != -1)
        {
          j = ((String)localObject3).indexOf(" ", k + 1);
          if (j != -1) {
            if (i >= j) {
              break label561;
            }
          }
        }
      }
    }
    for (;;)
    {
      ((ArrayList)localObject1).add(((String)localObject3).substring(k, i));
      break;
      localObject2 = new LinkedList();
      j = 0;
      localObject3 = paramString.ulB.iterator();
      i = 0;
      while (((Iterator)localObject3).hasNext())
      {
        th localth = (th)((Iterator)localObject3).next();
        if (i == 0)
        {
          localth.QD("WeNoteHtmlFile");
          ((LinkedList)localObject2).add(localth);
          i += 1;
        }
        else
        {
          if (localth.aGU == 1) {
            localth.QD("-1");
          }
          for (;;)
          {
            ((LinkedList)localObject2).add(localth);
            break;
            localth.QD((String)((ArrayList)localObject1).get(j));
            j += 1;
          }
        }
      }
      localObject1 = new ft();
      ((ft)localObject1).eIo.type = 33;
      ((ft)localObject1).eIo.eDx = paramString;
      ((ft)localObject1).eIo.eDx.ulB = ((LinkedList)localObject2);
      ((ft)localObject1).eIo.eDp = paramLong;
      a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
      GMTrace.o(5655800840192L, 42139);
      return;
      label561:
      i = j;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */