package com.tencent.mm.plugin.favorite.b;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.l;
import com.tencent.mm.a.g;
import com.tencent.mm.g.a.ft;
import com.tencent.mm.g.a.ft.a;
import com.tencent.mm.g.a.ft.b;
import com.tencent.mm.g.a.km;
import com.tencent.mm.g.a.nl;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tp;
import com.tencent.mm.protocal.c.ts;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.tw;
import com.tencent.mm.protocal.c.ud;
import com.tencent.mm.protocal.c.uf;
import com.tencent.mm.protocal.k.e;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.s;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class x
{
  private static Map<Long, Long> lbW;
  private static Map<Long, Long> lbX;
  private static long lbY;
  public static List<Integer> lbZ;
  public static final int[] lca;
  public static final int[] lcb;
  private static HashMap<Long, ArrayList<String>> lcc;
  
  static
  {
    GMTrace.i(6294140354560L, 46895);
    lbW = new HashMap();
    lbX = new HashMap();
    lbY = 0L;
    lbZ = new LinkedList();
    lca = new int[] { 2, 3, 4, 8, 14, 16, 18 };
    lcb = new int[] { 10, 8, 7 };
    lcc = new HashMap();
    GMTrace.o(6294140354560L, 46895);
  }
  
  public static Integer T(Context paramContext, String paramString)
  {
    GMTrace.i(6291590217728L, 46876);
    if (paramContext == null)
    {
      GMTrace.o(6291590217728L, 46876);
      return Integer.valueOf(-1);
    }
    if (paramContext.getString(R.l.duP).equals(paramString))
    {
      GMTrace.o(6291590217728L, 46876);
      return Integer.valueOf(2);
    }
    if (paramContext.getString(R.l.duR).equals(paramString))
    {
      GMTrace.o(6291590217728L, 46876);
      return Integer.valueOf(7);
    }
    if (paramContext.getString(R.l.duQ).equals(paramString))
    {
      GMTrace.o(6291590217728L, 46876);
      return Integer.valueOf(6);
    }
    if (paramContext.getString(R.l.duN).equals(paramString))
    {
      GMTrace.o(6291590217728L, 46876);
      return Integer.valueOf(1);
    }
    if (paramContext.getString(R.l.duU).equals(paramString))
    {
      GMTrace.o(6291590217728L, 46876);
      return Integer.valueOf(4);
    }
    if (paramContext.getString(R.l.duT).equals(paramString))
    {
      GMTrace.o(6291590217728L, 46876);
      return Integer.valueOf(5);
    }
    if (paramContext.getString(R.l.duV).equals(paramString))
    {
      GMTrace.o(6291590217728L, 46876);
      return Integer.valueOf(3);
    }
    if (paramContext.getString(R.l.duO).equals(paramString))
    {
      GMTrace.o(6291590217728L, 46876);
      return Integer.valueOf(8);
    }
    GMTrace.o(6291590217728L, 46876);
    return Integer.valueOf(-1);
  }
  
  public static j a(tt paramtt)
  {
    GMTrace.i(20409281937408L, 152061);
    j localj = new j();
    localj.field_favProto = new tt();
    localj.field_type = 18;
    localj.field_favProto = paramtt;
    GMTrace.o(20409281937408L, 152061);
    return localj;
  }
  
  public static th a(j paramj, String paramString)
  {
    GMTrace.i(6284208242688L, 46821);
    if ((bg.nm(paramString)) || (paramj == null) || (paramj.field_favProto.ulB.size() == 0))
    {
      GMTrace.o(6284208242688L, 46821);
      return null;
    }
    paramj = paramj.field_favProto.ulB.iterator();
    while (paramj.hasNext())
    {
      th localth = (th)paramj.next();
      if (localth.lhq.equals(paramString))
      {
        GMTrace.o(6284208242688L, 46821);
        return localth;
      }
    }
    GMTrace.o(6284208242688L, 46821);
    return null;
  }
  
  public static String a(Context paramContext, List<String> paramList)
  {
    GMTrace.i(6291321782272L, 46874);
    if ((paramContext == null) || (paramList == null) || (paramList.isEmpty()))
    {
      GMTrace.o(6291321782272L, 46874);
      return "";
    }
    String str1 = (String)paramList.get(0);
    String str2 = paramContext.getResources().getString(R.l.duW);
    int i = 1;
    paramContext = str1;
    while (i < paramList.size())
    {
      paramContext = paramContext + str2 + (String)paramList.get(i);
      i += 1;
    }
    GMTrace.o(6291321782272L, 46874);
    return paramContext;
  }
  
  public static ArrayList<j> a(List<String> paramList1, List<String> paramList2, List<Integer> paramList, List<j> paramList3, Set<Integer> paramSet, a parama)
  {
    GMTrace.i(6289040080896L, 46857);
    p localp = com.tencent.mm.plugin.favorite.h.axA();
    ArrayList localArrayList = new ArrayList();
    String str = " 1=1 ";
    Object localObject = str;
    if (paramList1 != null)
    {
      localObject = str;
      if (!paramList1.isEmpty())
      {
        localObject = paramList1.iterator();
        for (paramList1 = " 1=1 "; ((Iterator)localObject).hasNext(); paramList1 = paramList1 + " and content like '%" + str + "%'") {
          str = (String)((Iterator)localObject).next();
        }
        localObject = paramList1;
      }
    }
    paramList1 = (List<String>)localObject;
    if (paramList2 != null)
    {
      paramList1 = (List<String>)localObject;
      if (!paramList2.isEmpty())
      {
        paramList2 = paramList2.iterator();
        for (paramList1 = (List<String>)localObject; paramList2.hasNext(); paramList1 = paramList1 + " and tagContent like '%" + (String)localObject + "%'") {
          localObject = (String)paramList2.next();
        }
      }
    }
    paramList2 = "select localId from FavSearchInfo" + " where " + paramList1;
    paramList1 = paramList2;
    int i;
    if (paramList != null)
    {
      paramList1 = paramList2;
      if (!paramList.isEmpty())
      {
        paramList1 = paramList2 + " and ((1=1 ";
        paramList2 = paramList.iterator();
        while (paramList2.hasNext())
        {
          i = ((Integer)paramList2.next()).intValue();
          paramList1 = paramList1 + " and type = " + i;
        }
        paramList1 = paramList1 + ") or (1=1";
        paramList2 = paramList.iterator();
        while (paramList2.hasNext())
        {
          i = ((Integer)paramList2.next()).intValue();
          paramList1 = paramList1 + " and subtype & " + o.nz(i) + " != 0";
        }
        paramList1 = paramList1 + "))";
      }
    }
    paramList1 = paramList1 + " order by time desc";
    w.d("MicroMsg.FavSearchStorage", "search id sql {%s}", new Object[] { paramList1 });
    paramList1 = localp.fTZ.a(paramList1, null, 2);
    if (paramList1 == null) {}
    for (;;)
    {
      paramList1 = new ArrayList();
      if (localArrayList.size() != 0) {
        break;
      }
      GMTrace.o(6289040080896L, 46857);
      return paramList1;
      while (paramList1.moveToNext()) {
        localArrayList.add(Long.valueOf(paramList1.getLong(0)));
      }
      paramList1.close();
    }
    for (int j = 0;; j = i)
    {
      if (j + 20 < localArrayList.size()) {}
      for (i = j + 20;; i = localArrayList.size())
      {
        w.v("MicroMsg.FavoriteLogic", "start:%d  end:%d listSize:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(localArrayList.size()) });
        paramList2 = com.tencent.mm.plugin.favorite.h.axB().a(localArrayList.subList(j, i), paramList3, paramSet, parama);
        if ((paramList2 != null) && (paramList2.size() > 0)) {
          paramList1.addAll(paramList2);
        }
        if (i < localArrayList.size()) {
          break;
        }
        GMTrace.o(6289040080896L, 46857);
        return paramList1;
      }
    }
  }
  
  public static void a(ft paramft)
  {
    GMTrace.i(20409416155136L, 152062);
    if (paramft.eIo.eIv == -1)
    {
      localObject1 = com.tencent.mm.plugin.favorite.h.axB().cf(paramft.eIo.eDp);
      if ((localObject1 != null) && (((j)localObject1).field_favProto != null) && (((j)localObject1).field_favProto.ulB.size() > 1))
      {
        localObject1 = (th)((j)localObject1).field_favProto.ulB.get(0);
        paramft.eIp.eIE = bg.nm(((th)localObject1).ujt);
      }
      GMTrace.o(20409416155136L, 152062);
      return;
    }
    if ((paramft.eIo.eIv == -3) && (paramft.eIo.eDp > 0L))
    {
      localObject1 = com.tencent.mm.plugin.favorite.h.axB().cf(paramft.eIo.eDp);
      if (localObject1 != null)
      {
        ((j)localObject1).field_itemStatus = paramft.eIo.eIr.getIntExtra("fav_note_item_status", ((j)localObject1).field_itemStatus);
        ((j)localObject1).field_updateTime = paramft.eIo.eIr.getLongExtra("fav_note_item_updatetime", ((j)localObject1).field_updateTime);
        ((j)localObject1).xF(paramft.eIo.eIr.getStringExtra("fav_note_xml"));
        com.tencent.mm.plugin.favorite.h.axB().a((j)localObject1, new String[] { "localId" });
      }
      GMTrace.o(20409416155136L, 152062);
      return;
    }
    if ((paramft.eIo.eIv == -2) && (paramft.eIo.eDp > 0L))
    {
      localObject1 = com.tencent.mm.plugin.favorite.h.axB().cf(paramft.eIo.eDp);
      if ((localObject1 != null) && (((j)localObject1).field_itemStatus == 10) && (!bg.nm(((j)localObject1).field_xml)))
      {
        ((j)localObject1).xF(((j)localObject1).field_xml);
        if ((((j)localObject1).field_favProto != null) && (((j)localObject1).field_favProto.ulB.size() > 1))
        {
          localObject2 = (th)((j)localObject1).field_favProto.ulB.get(0);
          if ((!bg.nm(((th)localObject2).ujt)) && (!bg.nm(((th)localObject2).ujv)))
          {
            com.tencent.mm.plugin.favorite.h.axB().a((j)localObject1, new String[] { "localId" });
            GMTrace.o(20409416155136L, 152062);
            return;
          }
        }
      }
    }
    Object localObject1 = new Intent();
    if ((paramft.eIo.eDp > 0L) && (!bg.nm(paramft.eIo.desc)) && (paramft.eIo.eIv > 0))
    {
      localObject2 = com.tencent.mm.plugin.favorite.h.axB().cf(paramft.eIo.eDp);
      if (localObject2 != null)
      {
        ((Intent)localObject1).putExtra("fav_note_xml", j.b((j)localObject2));
        ((Intent)localObject1).putExtra("fav_note_item_updatetime", ((j)localObject2).field_updateTime);
      }
    }
    Object localObject2 = m.a(paramft.eIo.eDx.ulB, paramft.eIo.eDp);
    if (!bg.nm(paramft.eIo.desc))
    {
      if (paramft.eIo.eIv > 0)
      {
        ((Intent)localObject1).putExtra("fav_note_item_status", ((j)localObject2).field_itemStatus);
        paramft.eIo.eIr = ((Intent)localObject1);
        ((j)localObject2).field_favProto.zY(((j)localObject2).field_favProto.version + 1);
      }
      ((j)localObject2).field_itemStatus = 1;
      w((j)localObject2);
      com.tencent.mm.plugin.favorite.h.axB().a((j)localObject2, new String[] { "localId" });
      if (paramft.eIo.desc.equals("fav_add_new_note"))
      {
        if (((j)localObject2).field_favProto.version == 0) {
          break label674;
        }
        ((j)localObject2).field_favProto.zY(((j)localObject2).field_favProto.version + 1);
      }
      for (;;)
      {
        com.tencent.mm.plugin.favorite.h.axB().a((j)localObject2, new String[] { "localId" });
        m.a(paramft.eIo.title, paramft.eIo.eDx.ulB, paramft.eIo.eDp);
        GMTrace.o(20409416155136L, 152062);
        return;
        label674:
        ((j)localObject2).field_favProto.zY(((j)localObject2).field_favProto.version + 2);
      }
    }
    if (((j)localObject2).field_favProto.version != 0) {
      ((j)localObject2).field_favProto.zY(((j)localObject2).field_favProto.version + 1);
    }
    for (;;)
    {
      ((j)localObject2).field_itemStatus = 1;
      w((j)localObject2);
      com.tencent.mm.plugin.favorite.h.axB().a((j)localObject2, new String[] { "localId" });
      com.tencent.mm.plugin.favorite.h.axs().run();
      GMTrace.o(20409416155136L, 152062);
      return;
      ((j)localObject2).field_favProto.zY(((j)localObject2).field_favProto.version + 2);
    }
  }
  
  public static void a(ah paramah)
  {
    GMTrace.i(6293335048192L, 46889);
    if ((paramah.gud != null) && (paramah.gud.AZ() != null) && (paramah.gud.AZ().tKs == 65101))
    {
      paramah = com.tencent.mm.plugin.favorite.h.axB().cg(paramah.lcA);
      if ((paramah != null) && (paramah.field_favProto != null) && (paramah.field_favProto.ulB != null))
      {
        paramah.field_favProto.zY(paramah.field_favProto.version + 2);
        paramah.field_itemStatus = 1;
        com.tencent.mm.plugin.favorite.h.axB().a(paramah, new String[] { "localId" });
        com.tencent.mm.plugin.favorite.h.axs().run();
      }
    }
    GMTrace.o(6293335048192L, 46889);
  }
  
  public static void a(j paramj, th paramth, boolean paramBoolean)
  {
    GMTrace.i(6285550419968L, 46831);
    if ((paramj == null) || (bg.nm(paramth.lhq)))
    {
      GMTrace.o(6285550419968L, 46831);
      return;
    }
    w.i("MicroMsg.FavoriteLogic", "restart cdndata download, favId %d, favLocalId %d, dataId %s", new Object[] { Integer.valueOf(paramj.field_id), Long.valueOf(paramj.field_localId), paramth.lhq });
    Object localObject2 = com.tencent.mm.plugin.favorite.h.axw().xE(paramth.lhq);
    Object localObject1 = localObject2;
    if (localObject2 != null)
    {
      localObject1 = localObject2;
      if (((a)localObject2).field_status == 3)
      {
        com.tencent.mm.plugin.favorite.h.axw().b((a)localObject2, new String[] { "dataId" });
        localObject1 = null;
      }
    }
    localObject2 = localObject1;
    if (localObject1 != null) {
      if ((!bg.nm(((a)localObject1).field_cdnUrl)) && (!bg.nm(((a)localObject1).field_cdnKey)) && (!bg.nm(((a)localObject1).field_dataId)) && (((a)localObject1).field_cdnUrl.equals(paramth.ujt)) && (((a)localObject1).field_cdnKey.equals(paramth.ujv)))
      {
        localObject2 = localObject1;
        if (((a)localObject1).field_dataId.equals(paramth.lhq)) {}
      }
      else
      {
        com.tencent.mm.plugin.favorite.h.axw().b((a)localObject1, new String[] { "dataId" });
        localObject2 = null;
      }
    }
    if ((localObject2 != null) && (((a)localObject2).field_type == 1))
    {
      w.i("MicroMsg.FavoriteLogic", "klem data not download completed.");
      ((a)localObject2).field_status = 1;
      com.tencent.mm.plugin.favorite.h.axw().a((a)localObject2, new String[] { "dataId" });
      if (paramBoolean)
      {
        com.tencent.mm.plugin.favorite.h.axv().xV(paramth.lhq);
        if ((!bg.nm(paramth.ukv)) && (paramth.ukv.equals("WeNoteHtmlFile")))
        {
          paramj = com.tencent.mm.plugin.favorite.h.axw().xE(paramth.lhq);
          com.tencent.mm.plugin.favorite.h.axv().g(paramj);
        }
      }
      com.tencent.mm.plugin.favorite.h.axv().run();
      GMTrace.o(6285550419968L, 46831);
      return;
    }
    localObject1 = new File(g(paramth));
    if ((!bg.nm(paramth.ujv)) && (!bg.nm(paramth.ujt)) && (!((File)localObject1).exists()))
    {
      w.i("MicroMsg.FavoriteLogic", "klem big img not exist, start download.");
      long l = System.currentTimeMillis();
      a(paramth, paramj, 1, true);
      if (paramBoolean)
      {
        com.tencent.mm.plugin.favorite.h.axv().xV(paramth.lhq);
        if ((!bg.nm(paramth.ukv)) && (paramth.ukv.equals("WeNoteHtmlFile")))
        {
          paramj = com.tencent.mm.plugin.favorite.h.axw().xE(paramth.lhq);
          com.tencent.mm.plugin.favorite.h.axv().g(paramj);
        }
      }
      com.tencent.mm.plugin.favorite.h.axv().run();
      w.i("MicroMsg.FavoriteLogic", "insert cdn item use %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    }
    GMTrace.o(6285550419968L, 46831);
  }
  
  public static void a(j paramj, Collection<String> paramCollection, int paramInt)
  {
    GMTrace.i(6291187564544L, 46873);
    if (paramj == null)
    {
      GMTrace.o(6291187564544L, 46873);
      return;
    }
    w.d("MicroMsg.FavoriteLogic", "mod tags %s", new Object[] { paramCollection });
    HashSet localHashSet = new HashSet();
    localHashSet.addAll(paramj.field_tagProto.ulP);
    paramj.field_tagProto.ulP.clear();
    if ((paramCollection == null) || (paramCollection.isEmpty())) {}
    for (;;)
    {
      com.tencent.mm.plugin.favorite.h.axB().a(paramj, new String[] { "localId" });
      q(paramj);
      com.tencent.mm.plugin.favorite.h.axu().c(localHashSet);
      z.a(paramj, paramInt);
      GMTrace.o(6291187564544L, 46873);
      return;
      paramj.field_tagProto.ulP.addAll(paramCollection);
      localHashSet.removeAll(paramCollection);
    }
  }
  
  public static void a(j paramj, boolean paramBoolean)
  {
    GMTrace.i(6287563685888L, 46846);
    p(paramj);
    com.tencent.mm.plugin.favorite.h.axA().ch(paramj.field_localId);
    com.tencent.mm.plugin.favorite.h.axB().d(paramj);
    com.tencent.mm.plugin.favorite.h.axw().ce(paramj.field_localId);
    com.tencent.mm.plugin.favorite.h.axu().i(paramj);
    if (paramBoolean)
    {
      Set localSet = ayd();
      localSet.add(paramj.field_id);
      d(localSet);
      ayc();
    }
    GMTrace.o(6287563685888L, 46846);
  }
  
  public static void a(th paramth, int paramInt)
  {
    GMTrace.i(20408610848768L, 152056);
    if (bg.nm(paramth.lhq))
    {
      GMTrace.o(20408610848768L, 152056);
      return;
    }
    w.i("MicroMsg.FavoriteLogic", "restart cdndata download, dataId %s", new Object[] { paramth.lhq });
    a locala = com.tencent.mm.plugin.favorite.h.axw().xE(paramth.lhq);
    Object localObject = locala;
    if (locala != null) {
      if (locala.field_status != 3)
      {
        localObject = locala;
        if (locala.field_status != 4) {}
      }
      else
      {
        com.tencent.mm.plugin.favorite.h.axw().b(locala, new String[] { "dataId" });
        localObject = null;
      }
    }
    if ((localObject != null) && (((a)localObject).field_type == 1))
    {
      w.i("MicroMsg.FavoriteLogic", "klem data not download completed.");
      ((a)localObject).field_status = 1;
      com.tencent.mm.plugin.favorite.h.axw().a((a)localObject, new String[] { "dataId" });
      com.tencent.mm.plugin.favorite.h.axv().xV(paramth.lhq);
      com.tencent.mm.plugin.favorite.h.axv().run();
      GMTrace.o(20408610848768L, 152056);
      return;
    }
    localObject = new File(g(paramth));
    if ((!bg.nm(paramth.ujv)) && (!bg.nm(paramth.ujt)) && (!((File)localObject).exists()))
    {
      w.i("MicroMsg.FavoriteLogic", "klem big img not exist, start download.");
      long l = System.currentTimeMillis();
      localObject = new j();
      ((j)localObject).field_localId = -1L;
      ((j)localObject).field_id = -1;
      ((j)localObject).field_type = paramInt;
      a(paramth, (j)localObject, 1, true);
      com.tencent.mm.plugin.favorite.h.axv().xV(paramth.lhq);
      com.tencent.mm.plugin.favorite.h.axv().run();
      w.i("MicroMsg.FavoriteLogic", "insert cdn item use %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    }
    GMTrace.o(20408610848768L, 152056);
  }
  
  public static void a(th paramth, j paramj, int paramInt)
  {
    GMTrace.i(6288637427712L, 46854);
    if ((paramInt == 1) && ((paramth.ujZ <= 0L) || (bg.nm(paramth.ujp)) || (bg.nm(paramth.giD))))
    {
      w.e("MicroMsg.FavoriteLogic", "insertCdnThumbInfo, type recv, cdndataurl must not be null!");
      GMTrace.o(6288637427712L, 46854);
      return;
    }
    if ((paramInt == 0) && (bg.nm(h(paramth))))
    {
      w.e("MicroMsg.FavoriteLogic", "insertCdnThumbInfo, type send, path must not be null!");
      GMTrace.o(6288637427712L, 46854);
      return;
    }
    String str = xQ(paramth.lhq);
    if (com.tencent.mm.plugin.favorite.h.axw().xE(str) != null)
    {
      w.w("MicroMsg.FavoriteLogic", "cdn info exist, id[%s], return", new Object[] { str });
      GMTrace.o(6288637427712L, 46854);
      return;
    }
    w.v("MicroMsg.FavoriteLogic", "insert cdn thumb info, fav local id[%d] fav id[%d]", new Object[] { Long.valueOf(paramj.field_localId), Integer.valueOf(paramj.field_id) });
    a locala = new a();
    locala.field_cdnKey = paramth.ujp;
    locala.field_cdnUrl = paramth.giD;
    locala.field_dataId = str;
    locala.field_favLocalId = paramj.field_localId;
    locala.field_totalLen = ((int)paramth.ujZ);
    locala.field_type = paramInt;
    locala.field_status = 1;
    locala.field_path = h(paramth);
    locala.field_modifyTime = bg.Pv();
    com.tencent.mm.plugin.favorite.h.axw().a(locala);
    if (paramInt == 1)
    {
      com.tencent.mm.plugin.favorite.c.c.f(locala);
      GMTrace.o(6288637427712L, 46854);
      return;
    }
    com.tencent.mm.plugin.favorite.c.c.e(locala);
    GMTrace.o(6288637427712L, 46854);
  }
  
  public static void a(th paramth, j paramj, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(6288503209984L, 46853);
    if ((paramInt == 1) && ((bg.nm(paramth.ujv)) || (bg.nm(paramth.ujt))))
    {
      w.e("MicroMsg.FavoriteLogic", "insertCdnDataInfo, type recv, cdndataurl must not be null!");
      GMTrace.o(6288503209984L, 46853);
      return;
    }
    if ((paramInt == 0) && (bg.nm(g(paramth))))
    {
      w.e("MicroMsg.FavoriteLogic", "insertCdnDataInfo, type send, path must not be null!");
      GMTrace.o(6288503209984L, 46853);
      return;
    }
    if (com.tencent.mm.plugin.favorite.h.axw().xE(paramth.lhq) != null)
    {
      w.v("MicroMsg.FavoriteLogic", "cdn info exist, id[%s], return", new Object[] { paramth.lhq });
      GMTrace.o(6288503209984L, 46853);
      return;
    }
    w.i("MicroMsg.FavoriteLogic", "insert cdn data info, fav local id[%d] fav id[%d]", new Object[] { Long.valueOf(paramj.field_localId), Integer.valueOf(paramj.field_id) });
    a locala = new a();
    locala.field_dataId = paramth.lhq;
    locala.field_totalLen = ((int)paramth.ujO);
    locala.field_type = paramInt;
    locala.field_favLocalId = paramj.field_localId;
    locala.field_cdnKey = paramth.ujv;
    locala.field_cdnUrl = paramth.ujt;
    locala.field_path = g(paramth);
    int i;
    label273:
    boolean bool;
    if (paramth.aGU == 3)
    {
      paramth = paramth.ujI;
      if ((!bg.nm(paramth)) && (paramth.equals("speex")))
      {
        i = -3;
        locala.field_dataType = i;
        locala.field_modifyTime = bg.Pv();
        bool = am.isWifi(com.tencent.mm.sdk.platformtools.ab.getContext());
        if (paramInt == 0)
        {
          w.i("MicroMsg.FavoriteLogic", "can auto upload, force %B, isWifi %B, dataType %d, totalLen %d", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(bool), Integer.valueOf(locala.field_dataType), Integer.valueOf(locala.field_totalLen) });
          if (!paramBoolean) {
            break label524;
          }
          i = 1;
          label350:
          if (i == 0) {
            break label652;
          }
          locala.field_status = 1;
          w.i("MicroMsg.FavoriteLogic", "insertCdnDataInfo upload status traning");
        }
        label370:
        if (paramInt == 1)
        {
          w.i("MicroMsg.FavoriteLogic", "can auto download, force %B, isWifi %B, dataType %d, totalLen %d", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(bool), Integer.valueOf(locala.field_dataType), Integer.valueOf(locala.field_totalLen) });
          if (!paramBoolean) {
            break label670;
          }
          i = 1;
          label432:
          if (i == 0) {
            break label784;
          }
          locala.field_status = 1;
          w.i("MicroMsg.FavoriteLogic", "insertCdnDataInfo download status traning");
        }
      }
    }
    for (;;)
    {
      com.tencent.mm.plugin.favorite.h.axw().a(locala);
      if (paramInt != 1) {
        break label802;
      }
      com.tencent.mm.plugin.favorite.c.c.f(locala);
      GMTrace.o(6288503209984L, 46853);
      return;
      if ((!bg.nm(paramth)) && (paramth.equals("silk")))
      {
        i = -4;
        break;
      }
      i = -2;
      break;
      locala.field_dataType = paramth.aGU;
      break label273;
      label524:
      if (bool)
      {
        i = 1;
        break label350;
      }
      if ((locala.field_dataType != 8) && (locala.field_dataType != 4) && (locala.field_dataType != 15))
      {
        i = 1;
        break label350;
      }
      long l2 = com.tencent.mm.sdk.platformtools.ab.getContext().getSharedPreferences(com.tencent.mm.sdk.platformtools.ab.bPU(), 0).getLong("fav_mx_auto_upload_size", 0L);
      long l1 = l2;
      if (l2 == 0L) {
        l1 = 26214400L;
      }
      if (locala.field_totalLen <= l1)
      {
        w.i("MicroMsg.FavoriteLogic", "match max auto upload, max size %d", new Object[] { Long.valueOf(l1) });
        i = 1;
        break label350;
      }
      i = 0;
      break label350;
      label652:
      locala.field_status = 4;
      w.i("MicroMsg.FavoriteLogic", "insertCdnDataInfo upload status pause");
      break label370;
      label670:
      if (bool)
      {
        i = 1;
        break label432;
      }
      if ((locala.field_dataType != 8) && (locala.field_dataType != 4) && (locala.field_dataType != 15))
      {
        i = 1;
        break label432;
      }
      l1 = com.tencent.mm.sdk.platformtools.ab.getContext().getSharedPreferences(com.tencent.mm.sdk.platformtools.ab.bPU(), 0).getLong("fav_mx_auto_download_size", 26214400L);
      if (locala.field_totalLen <= l1)
      {
        w.i("MicroMsg.FavoriteLogic", "match max auto download, max size %d", new Object[] { Long.valueOf(l1) });
        i = 1;
        break label432;
      }
      i = 0;
      break label432;
      label784:
      locala.field_status = 4;
      w.i("MicroMsg.FavoriteLogic", "insertCdnDataInfo download status pause");
    }
    label802:
    com.tencent.mm.plugin.favorite.c.c.e(locala);
    GMTrace.o(6288503209984L, 46853);
  }
  
  public static void a(List<j> paramList, String[] paramArrayOfString)
  {
    GMTrace.i(6291053346816L, 46872);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      GMTrace.o(6291053346816L, 46872);
      return;
    }
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      GMTrace.o(6291053346816L, 46872);
      return;
    }
    LinkedList localLinkedList = new LinkedList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      j localj = (j)paramList.next();
      int j = paramArrayOfString.length;
      int i = 0;
      boolean bool = false;
      while (i < j)
      {
        bool |= localj.xH(paramArrayOfString[i]);
        i += 1;
      }
      if (bool)
      {
        com.tencent.mm.plugin.favorite.h.axB().a(localj, new String[] { "localId" });
        q(localj);
        localLinkedList.add(localj);
      }
    }
    paramList = localLinkedList.iterator();
    while (paramList.hasNext()) {
      z.a((j)paramList.next(), 3);
    }
    GMTrace.o(6291053346816L, 46872);
  }
  
  public static boolean a(long paramLong, Runnable paramRunnable)
  {
    GMTrace.i(6287161032704L, 46843);
    boolean bool = a(com.tencent.mm.plugin.favorite.h.axB().cf(paramLong), true, paramRunnable);
    GMTrace.o(6287161032704L, 46843);
    return bool;
  }
  
  public static boolean a(j paramj, Runnable paramRunnable)
  {
    GMTrace.i(6287295250432L, 46844);
    boolean bool = a(paramj, true, null);
    GMTrace.o(6287295250432L, 46844);
    return bool;
  }
  
  public static boolean a(j paramj, final boolean paramBoolean, final Runnable paramRunnable)
  {
    GMTrace.i(6287429468160L, 46845);
    if (paramj == null)
    {
      w.w("MicroMsg.FavoriteLogic", "delete fav item fail, item is null");
      com.tencent.mm.sdk.platformtools.af.t(paramRunnable);
      GMTrace.o(6287429468160L, 46845);
      return false;
    }
    if (Looper.myLooper() == at.xB().ngv.getLooper())
    {
      w.i("MicroMsg.FavoriteLogic", "delete favItem id %d, localId %d, needBatchDel %B, do directly", new Object[] { Integer.valueOf(paramj.field_id), Long.valueOf(paramj.field_localId), Boolean.valueOf(paramBoolean) });
      a(paramj, paramBoolean);
      com.tencent.mm.sdk.platformtools.af.t(paramRunnable);
    }
    for (;;)
    {
      GMTrace.o(6287429468160L, 46845);
      return true;
      w.i("MicroMsg.FavoriteLogic", "delete favItem id %d, localId %d, needBatchDel %B, post to worker", new Object[] { Integer.valueOf(paramj.field_id), Long.valueOf(paramj.field_localId), Boolean.valueOf(paramBoolean) });
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6279913275392L, 46789);
          w.i("MicroMsg.FavoriteLogic", "delete favItem id %d, localId %d, needBatchDel %B, do on worker thread", new Object[] { Integer.valueOf(this.lcd.field_id), Long.valueOf(this.lcd.field_localId), Boolean.valueOf(paramBoolean) });
          x.a(this.lcd, paramBoolean);
          com.tencent.mm.sdk.platformtools.af.t(paramRunnable);
          GMTrace.o(6279913275392L, 46789);
        }
      });
    }
  }
  
  public static boolean a(List<j> paramList, Context paramContext, DialogInterface.OnClickListener paramOnClickListener)
  {
    GMTrace.i(6293603483648L, 46891);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      GMTrace.o(6293603483648L, 46891);
      return true;
    }
    new q();
    Iterator localIterator1 = paramList.iterator();
    int m = 0;
    int i1 = 0;
    int i = 0;
    int k = 0;
    int j = 0;
    j localj;
    int n;
    int i2;
    for (;;)
    {
      if (localIterator1.hasNext())
      {
        localj = (j)localIterator1.next();
        if ((localj != null) && (localj.field_favProto != null) && (localj.field_favProto.ulB != null)) {
          if (localj.field_type == 3)
          {
            i1 += 1;
          }
          else
          {
            Iterator localIterator2 = localj.field_favProto.ulB.iterator();
            n = 0;
            i2 = j;
            j = m;
            m = i2;
            while (localIterator2.hasNext())
            {
              th localth = (th)localIterator2.next();
              if (localth.ukB == 2) {
                j += 1;
              } else if (localth.ukB == 1) {
                m += 1;
              } else {
                n += 1;
              }
            }
            if (!q.h(localj)) {
              break label653;
            }
            int i3 = k + 1;
            k = i3;
            i2 = n;
            if (n > 0)
            {
              i2 = n - 1;
              k = i3;
            }
          }
        }
      }
    }
    for (;;)
    {
      if ((i == 0) && (i2 == localj.field_favProto.ulB.size())) {
        i = 1;
      }
      for (;;)
      {
        n = m;
        m = j;
        j = n;
        break;
        if (1 == paramList.size())
        {
          if ((((j)paramList.get(0)).field_type == 14) && ((m > 0) || (j > 0)))
          {
            com.tencent.mm.ui.base.h.bm(paramContext, paramContext.getString(R.l.dta));
            GMTrace.o(6293603483648L, 46891);
            return false;
          }
          if (m > 0)
          {
            com.tencent.mm.ui.base.h.bm(paramContext, paramContext.getString(R.l.dtb));
            GMTrace.o(6293603483648L, 46891);
            return false;
          }
          if (j > 0)
          {
            switch (((j)paramList.get(0)).field_type)
            {
            }
            for (;;)
            {
              GMTrace.o(6293603483648L, 46891);
              return false;
              com.tencent.mm.ui.base.h.bm(paramContext, paramContext.getString(R.l.dtc));
              continue;
              com.tencent.mm.ui.base.h.bm(paramContext, paramContext.getString(R.l.dtd));
              continue;
              com.tencent.mm.ui.base.h.bm(paramContext, paramContext.getString(R.l.dte));
            }
          }
          if (k > 0)
          {
            com.tencent.mm.ui.base.h.bm(paramContext, paramContext.getString(R.l.cPM));
            GMTrace.o(6293603483648L, 46891);
            return false;
          }
          if (i1 > 0)
          {
            com.tencent.mm.ui.base.h.bm(paramContext, paramContext.getString(R.l.cPN));
            GMTrace.o(6293603483648L, 46891);
            return false;
          }
        }
        else if ((m > 0) || (j > 0) || (k > 0) || (i1 > 0))
        {
          if (i != 0) {
            com.tencent.mm.ui.base.h.a(paramContext, paramContext.getString(R.l.dtg), "", paramContext.getString(R.l.diu), paramContext.getString(R.l.dis), paramOnClickListener, null, R.e.aPp);
          }
          for (;;)
          {
            GMTrace.o(6293603483648L, 46891);
            return false;
            com.tencent.mm.ui.base.h.bm(paramContext, paramContext.getString(R.l.dtf));
          }
        }
        GMTrace.o(6293603483648L, 46891);
        return true;
      }
      label653:
      i2 = n;
    }
  }
  
  public static void aA(List<Integer> paramList)
  {
    GMTrace.i(6287832121344L, 46848);
    if (paramList.size() == 0)
    {
      w.e("MicroMsg.FavoriteLogic", "setDeleted list null");
      GMTrace.o(6287832121344L, 46848);
      return;
    }
    Set localSet = ayd();
    w.i("MicroMsg.FavoriteLogic", "setDeleted before del:%s", new Object[] { localSet.toString() });
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Integer localInteger = (Integer)paramList.next();
      w.i("MicroMsg.FavoriteLogic", "setDeleted id:%d, ret:%b", new Object[] { localInteger, Boolean.valueOf(localSet.remove(localInteger.toString())) });
    }
    w.i("MicroMsg.FavoriteLogic", "setDeleted after del:%s", new Object[] { localSet.toString() });
    d(localSet);
    GMTrace.o(6287832121344L, 46848);
  }
  
  public static float aD(long paramLong)
  {
    float f2 = 60.0F;
    float f1 = 1.0F;
    GMTrace.i(6286087290880L, 46835);
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
        GMTrace.o(6286087290880L, 46835);
        return f1;
      }
      f1 = f3;
    }
  }
  
  public static String aX(String paramString, int paramInt)
  {
    GMTrace.i(6286355726336L, 46837);
    paramString = g.n((paramString + paramInt + System.currentTimeMillis()).getBytes());
    GMTrace.o(6286355726336L, 46837);
    return paramString;
  }
  
  public static String ab(float paramFloat)
  {
    GMTrace.i(6290919129088L, 46871);
    if (paramFloat < 1024.0F)
    {
      str = String.format("%.1fB", new Object[] { Float.valueOf(paramFloat) });
      GMTrace.o(6290919129088L, 46871);
      return str;
    }
    if (paramFloat < 1048576.0F)
    {
      str = String.format("%.1fKB", new Object[] { Float.valueOf(paramFloat / 1024.0F) });
      GMTrace.o(6290919129088L, 46871);
      return str;
    }
    if (paramFloat < 1.07374182E9F)
    {
      str = String.format("%.1fMB", new Object[] { Float.valueOf(paramFloat / 1024.0F / 1024.0F) });
      GMTrace.o(6290919129088L, 46871);
      return str;
    }
    String str = String.format("%.1fGB", new Object[] { Float.valueOf(paramFloat / 1024.0F / 1024.0F / 1024.0F) });
    GMTrace.o(6290919129088L, 46871);
    return str;
  }
  
  public static String axX()
  {
    GMTrace.i(6283671371776L, 46817);
    Object localObject = new StringBuilder();
    at.AR();
    localObject = com.tencent.mm.y.c.zo() + "favorite/";
    GMTrace.o(6283671371776L, 46817);
    return (String)localObject;
  }
  
  public static String axY()
  {
    GMTrace.i(6283805589504L, 46818);
    Object localObject = new StringBuilder();
    at.AR();
    localObject = com.tencent.mm.y.c.zo() + "favorite/web/";
    GMTrace.o(6283805589504L, 46818);
    return (String)localObject;
  }
  
  public static String axZ()
  {
    GMTrace.i(6283939807232L, 46819);
    Object localObject = new StringBuilder();
    at.AR();
    localObject = com.tencent.mm.y.c.zo() + "favorite/voice/";
    GMTrace.o(6283939807232L, 46819);
    return (String)localObject;
  }
  
  public static String aya()
  {
    GMTrace.i(6284074024960L, 46820);
    Object localObject = new StringBuilder();
    at.AR();
    localObject = com.tencent.mm.y.c.zo() + "favorite/music/";
    GMTrace.o(6284074024960L, 46820);
    return (String)localObject;
  }
  
  public static boolean ayb()
  {
    GMTrace.i(6285147766784L, 46828);
    if (ac.ayq() > 0)
    {
      GMTrace.o(6285147766784L, 46828);
      return true;
    }
    GMTrace.o(6285147766784L, 46828);
    return false;
  }
  
  public static void ayc()
  {
    GMTrace.i(6287966339072L, 46849);
    Object localObject2 = ayd();
    if (((Set)localObject2).size() == 0)
    {
      w.v("MicroMsg.FavoriteLogic", "doBatchDel no item to delete");
      GMTrace.o(6287966339072L, 46849);
      return;
    }
    w.i("MicroMsg.FavoriteLogic", "doBatchDel idList:%s", new Object[] { localObject2.toString() });
    Object localObject1 = new LinkedList();
    localObject2 = ((Set)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      String str = (String)((Iterator)localObject2).next();
      try
      {
        ((LinkedList)localObject1).add(Integer.valueOf(bg.getInt(str, 0)));
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.FavoriteLogic", localException, "", new Object[0]);
        w.e("MicroMsg.FavoriteLogic", "doBatchDel parseInt error:%s", new Object[] { localException.getMessage() });
      }
    }
    w.i("MicroMsg.FavoriteLogic", "doBatchDel after parse, total size %d", new Object[] { Integer.valueOf(((LinkedList)localObject1).size()) });
    if (((LinkedList)localObject1).size() > 0)
    {
      localObject1 = new ab((LinkedList)localObject1);
      at.wS().a((com.tencent.mm.ad.k)localObject1, 0);
    }
    GMTrace.o(6287966339072L, 46849);
  }
  
  private static Set<String> ayd()
  {
    GMTrace.i(6288234774528L, 46851);
    at.AR();
    Object localObject = (String)com.tencent.mm.y.c.xh().get(225282, "");
    w.i("MicroMsg.FavoriteLogic", "get need del IDs: %s", new Object[] { localObject });
    HashSet localHashSet = new HashSet();
    if (bg.nm((String)localObject))
    {
      GMTrace.o(6288234774528L, 46851);
      return localHashSet;
    }
    localObject = ((String)localObject).split(",");
    if ((localObject == null) || (localObject.length == 0))
    {
      GMTrace.o(6288234774528L, 46851);
      return localHashSet;
    }
    int j = localObject.length;
    int i = 0;
    while (i < j)
    {
      localHashSet.add(localObject[i]);
      i += 1;
    }
    GMTrace.o(6288234774528L, 46851);
    return localHashSet;
  }
  
  public static long aye()
  {
    GMTrace.i(6289576951808L, 46861);
    long l2 = ayf() - ayg();
    long l1 = l2;
    if (l2 < 0L) {
      l1 = 1024L;
    }
    GMTrace.o(6289576951808L, 46861);
    return l1;
  }
  
  public static long ayf()
  {
    GMTrace.i(6289711169536L, 46862);
    at.AR();
    long l = ((Long)com.tencent.mm.y.c.xh().get(w.a.vsu, Long.valueOf(0L))).longValue();
    GMTrace.o(6289711169536L, 46862);
    return l;
  }
  
  public static long ayg()
  {
    GMTrace.i(6289845387264L, 46863);
    at.AR();
    long l = ((Long)com.tencent.mm.y.c.xh().get(w.a.vst, Long.valueOf(0L))).longValue();
    GMTrace.o(6289845387264L, 46863);
    return l;
  }
  
  public static boolean ayh()
  {
    GMTrace.i(6289979604992L, 46864);
    if (ayf() == 0L)
    {
      GMTrace.o(6289979604992L, 46864);
      return false;
    }
    if (aye() < 10485760L)
    {
      GMTrace.o(6289979604992L, 46864);
      return true;
    }
    GMTrace.o(6289979604992L, 46864);
    return false;
  }
  
  public static boolean ayi()
  {
    GMTrace.i(6290113822720L, 46865);
    if (ayf() == 0L)
    {
      GMTrace.o(6290113822720L, 46865);
      return false;
    }
    if (aye() < 52428800L)
    {
      GMTrace.o(6290113822720L, 46865);
      return true;
    }
    GMTrace.o(6290113822720L, 46865);
    return false;
  }
  
  public static void ayl()
  {
    GMTrace.i(6292127088640L, 46880);
    if (0L >= lbY)
    {
      w.i("MicroMsg.FavoriteLogic", "addTagWhenAddToFav,try to add tag ,but favLocalId is null, return");
      GMTrace.o(6292127088640L, 46880);
      return;
    }
    j localj = com.tencent.mm.plugin.favorite.h.axB().cf(lbY);
    lbY = 0L;
    if (localj == null)
    {
      w.i("MicroMsg.FavoriteLogic", "addTagWhenAddToFav,try to add tag ,but iteminfo is null, return");
      GMTrace.o(6292127088640L, 46880);
      return;
    }
    w.i("MicroMsg.FavoriteLogic", "addTagWhenAddToFav ,go on");
    Intent localIntent = new Intent();
    localIntent.putExtra("key_fav_scene", 5);
    localIntent.putExtra("key_fav_item_id", localj.field_localId);
    com.tencent.mm.bj.d.b(com.tencent.mm.sdk.platformtools.ab.getContext(), "favorite", ".ui.FavTagEditUI", localIntent);
    GMTrace.o(6292127088640L, 46880);
  }
  
  public static List<Long> aym()
  {
    GMTrace.i(6292395524096L, 46882);
    k localk = com.tencent.mm.plugin.favorite.h.axB();
    long l1 = System.currentTimeMillis();
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = "";
    Object localObject2 = lcb;
    int j = localObject2.length;
    int i = 0;
    int k;
    while (i < j)
    {
      k = localObject2[i];
      localObject1 = (String)localObject1 + k + ",";
      i += 1;
    }
    localObject2 = localObject1;
    if (((String)localObject1).endsWith(",")) {
      localObject2 = ((String)localObject1).substring(0, ((String)localObject1).length() - 1);
    }
    localObject1 = "select localId from FavItemInfo where " + " itemStatus in (" + (String)localObject2 + ")";
    String str = (String)localObject1 + " and datatotalsize > 0 ";
    localObject1 = "";
    localObject2 = lca;
    j = localObject2.length;
    i = 0;
    while (i < j)
    {
      k = localObject2[i];
      localObject1 = (String)localObject1 + k + ",";
      i += 1;
    }
    localObject2 = localObject1;
    if (((String)localObject1).endsWith(",")) {
      localObject2 = ((String)localObject1).substring(0, ((String)localObject1).length() - 1);
    }
    localObject1 = str + " and type in (" + (String)localObject2 + ")";
    localObject1 = (String)localObject1 + " order by datatotalsize desc";
    localObject1 = localk.fTZ.rawQuery((String)localObject1, null);
    if (localObject1 == null)
    {
      GMTrace.o(6292395524096L, 46882);
      return localArrayList;
    }
    if (((Cursor)localObject1).getCount() == 0)
    {
      ((Cursor)localObject1).close();
      GMTrace.o(6292395524096L, 46882);
      return localArrayList;
    }
    while (((Cursor)localObject1).moveToNext()) {
      localArrayList.add(Long.valueOf(((Cursor)localObject1).getLong(0)));
    }
    ((Cursor)localObject1).close();
    long l2 = System.currentTimeMillis();
    w.i("MicroMsg.FavItemInfoStorage", "getCleanList cu.getCount() = %d,used %dms", new Object[] { Integer.valueOf(localArrayList.size()), Long.valueOf(l2 - l1) });
    GMTrace.o(6292395524096L, 46882);
    return localArrayList;
  }
  
  public static boolean az(List<j> paramList)
  {
    GMTrace.i(6287697903616L, 46847);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      w.w("MicroMsg.FavoriteLogic", "delete fav item fail, item is null");
      GMTrace.o(6287697903616L, 46847);
      return false;
    }
    Set localSet = ayd();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      j localj = (j)paramList.next();
      p(localj);
      com.tencent.mm.plugin.favorite.h.axA().ch(localj.field_localId);
      com.tencent.mm.plugin.favorite.h.axB().d(localj);
      com.tencent.mm.plugin.favorite.h.axw().ce(localj.field_localId);
      com.tencent.mm.plugin.favorite.h.axu().i(localj);
      localSet.add(localj.field_id);
      w.d("MicroMsg.FavoriteLogic", "delete id %d", new Object[] { Integer.valueOf(localj.field_id) });
    }
    d(localSet);
    ayc();
    GMTrace.o(6287697903616L, 46847);
    return true;
  }
  
  public static List<j> b(long paramLong, int paramInt, Set<Integer> paramSet, a parama)
  {
    GMTrace.i(6284342460416L, 46822);
    k localk;
    ArrayList localArrayList;
    Object localObject;
    if (paramLong == 0L)
    {
      localk = com.tencent.mm.plugin.favorite.h.axB();
      if ((paramSet != null) && (paramSet.contains(Integer.valueOf(paramInt))))
      {
        w.w("MicroMsg.FavItemInfoStorage", "getFirstPageList::block set contains target type, error, do return null");
        GMTrace.o(6284342460416L, 46822);
        return null;
      }
      localArrayList = new ArrayList();
      localObject = "select " + k.lbe + " from FavItemInfo where itemStatus" + " > 0";
      if (paramInt != -1) {
        paramSet = (String)localObject + " and type = " + paramInt;
      }
    }
    for (;;)
    {
      paramSet = paramSet + " order by updateTime desc limit 20";
      paramSet = localk.fTZ.a(paramSet, null, 2);
      if (paramSet == null)
      {
        GMTrace.o(6284342460416L, 46822);
        return localArrayList;
        if (paramSet != null)
        {
          Iterator localIterator = paramSet.iterator();
          for (;;)
          {
            paramSet = (Set<Integer>)localObject;
            if (!localIterator.hasNext()) {
              break;
            }
            paramInt = ((Integer)localIterator.next()).intValue();
            localObject = (String)localObject + " and type != " + paramInt;
          }
        }
      }
      else
      {
        while (paramSet.moveToNext())
        {
          localObject = new j();
          ((j)localObject).b(paramSet);
          if ((parama != null) && (parama.g((j)localObject))) {
            w.w("MicroMsg.FavItemInfoStorage", "id[%d] type[%d] match filter", new Object[] { Integer.valueOf(((j)localObject).field_id), Integer.valueOf(((j)localObject).field_type) });
          } else {
            localArrayList.add(localObject);
          }
        }
        paramSet.close();
        GMTrace.o(6284342460416L, 46822);
        return localArrayList;
        paramSet = com.tencent.mm.plugin.favorite.h.axB().a(paramLong, paramInt, paramSet, parama);
        GMTrace.o(6284342460416L, 46822);
        return paramSet;
      }
      paramSet = (Set<Integer>)localObject;
    }
  }
  
  private static void b(ft paramft)
  {
    GMTrace.i(20409818808320L, 152065);
    if (bg.nm(paramft.eIo.desc))
    {
      paramft.eIp.ret = -1;
      GMTrace.o(20409818808320L, 152065);
      return;
    }
    Object localObject = xU(paramft.eIo.desc);
    if ((localObject == null) || (((j)localObject).field_localId <= 0L))
    {
      paramft.eIp.ret = -1;
      GMTrace.o(20409818808320L, 152065);
      return;
    }
    boolean bool = y((j)localObject);
    String str = paramft.eIo.eIu;
    if (bool)
    {
      paramft.eIp.ret = 1;
      paramft = (ArrayList)lcc.get(Long.valueOf(((j)localObject).field_localId));
      if (paramft != null)
      {
        if (paramft.contains(str)) {
          paramft.remove(str);
        }
        if (paramft.size() == 0) {
          lcc.remove(Long.valueOf(((j)localObject).field_localId));
        }
      }
      GMTrace.o(20409818808320L, 152065);
      return;
    }
    if (bg.nm(str))
    {
      paramft.eIp.ret = -1;
      GMTrace.o(20409818808320L, 152065);
      return;
    }
    long l = ((j)localObject).field_localId;
    if (lcc.get(Long.valueOf(l)) == null) {}
    for (localObject = new ArrayList();; localObject = (ArrayList)lcc.get(Long.valueOf(l)))
    {
      ((ArrayList)localObject).add(str);
      lcc.put(Long.valueOf(l), localObject);
      localObject = com.tencent.mm.plugin.favorite.h.axB().cf(l);
      if ((localObject != null) && (((j)localObject).field_localId > 0L)) {
        break;
      }
      paramft.eIp.ret = -1;
      GMTrace.o(20409818808320L, 152065);
      return;
    }
    if ((y((j)localObject)) || (((j)localObject).field_itemStatus == 10))
    {
      paramft.eIp.ret = -1;
      at.xB().h(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(20410624114688L, 152071);
          x.x(this.lbk);
          GMTrace.o(20410624114688L, 152071);
        }
      }, 500L);
      GMTrace.o(20409818808320L, 152065);
      return;
    }
    paramft.eIp.ret = -1;
    GMTrace.o(20409818808320L, 152065);
  }
  
  public static void b(j paramj, th paramth, boolean paramBoolean)
  {
    GMTrace.i(6285684637696L, 46832);
    if (bg.nm(paramth.lhq))
    {
      GMTrace.o(6285684637696L, 46832);
      return;
    }
    String str = xQ(paramth.lhq);
    a locala = com.tencent.mm.plugin.favorite.h.axw().xE(str);
    Object localObject = locala;
    if (locala != null)
    {
      localObject = locala;
      if (locala.field_status == 3)
      {
        com.tencent.mm.plugin.favorite.h.axw().b(locala, new String[] { "dataId" });
        localObject = null;
      }
    }
    if ((localObject != null) && (((a)localObject).field_type == 1))
    {
      ((a)localObject).field_status = 1;
      com.tencent.mm.plugin.favorite.h.axw().a((a)localObject, new String[] { "dataId" });
      com.tencent.mm.plugin.favorite.h.axv().xV(str);
      com.tencent.mm.plugin.favorite.h.axv().run();
      GMTrace.o(6285684637696L, 46832);
      return;
    }
    localObject = new File(h(paramth));
    if ((!bg.nm(paramth.ujp)) && (!bg.nm(paramth.giD)) && (!((File)localObject).exists()))
    {
      a(paramth, paramj, 1);
      com.tencent.mm.plugin.favorite.h.axv().xV(str);
      com.tencent.mm.plugin.favorite.h.axv().run();
    }
    GMTrace.o(6285684637696L, 46832);
  }
  
  private static void b(j paramj, boolean paramBoolean)
  {
    GMTrace.i(20409550372864L, 152063);
    tp localtp = new tp();
    if (!paramBoolean) {
      localtp.ult = com.tencent.mm.y.q.zE();
    }
    localtp.ulu = com.tencent.mm.y.q.zE();
    paramj.field_favProto.eD(bg.Pu());
    paramj.field_favProto.a(localtp);
    GMTrace.o(20409550372864L, 152063);
  }
  
  public static void b(th paramth, int paramInt)
  {
    GMTrace.i(20408745066496L, 152057);
    if (bg.nm(paramth.lhq))
    {
      GMTrace.o(20408745066496L, 152057);
      return;
    }
    if ((bg.nm(paramth.ujp)) || (bg.nm(paramth.giD)))
    {
      GMTrace.o(20408745066496L, 152057);
      return;
    }
    String str = xQ(paramth.lhq);
    a locala = com.tencent.mm.plugin.favorite.h.axw().xE(str);
    Object localObject = locala;
    if (locala != null) {
      if (locala.field_status != 3)
      {
        localObject = locala;
        if (locala.field_status != 4) {}
      }
      else
      {
        com.tencent.mm.plugin.favorite.h.axw().b(locala, new String[] { "dataId" });
        localObject = null;
      }
    }
    if ((localObject != null) && (((a)localObject).field_type == 1))
    {
      ((a)localObject).field_status = 1;
      com.tencent.mm.plugin.favorite.h.axw().a((a)localObject, new String[] { "dataId" });
      com.tencent.mm.plugin.favorite.h.axv().xV(str);
      com.tencent.mm.plugin.favorite.h.axv().run();
      GMTrace.o(20408745066496L, 152057);
      return;
    }
    localObject = new File(h(paramth));
    if ((!bg.nm(paramth.ujp)) && (!bg.nm(paramth.giD)) && (!((File)localObject).exists()))
    {
      localObject = new j();
      ((j)localObject).field_localId = -1L;
      ((j)localObject).field_id = -1;
      ((j)localObject).field_type = paramInt;
      a(paramth, (j)localObject, 1);
      com.tencent.mm.plugin.favorite.h.axv().xV(str);
      com.tencent.mm.plugin.favorite.h.axv().run();
    }
    GMTrace.o(20408745066496L, 152057);
  }
  
  public static void c(ft paramft)
  {
    int i = 0;
    GMTrace.i(20410221461504L, 152068);
    Object localObject2;
    Object localObject3;
    label78:
    Object localObject1;
    if (paramft.eIo.eIv == 1)
    {
      paramft.eIp.path = cu(paramft.eIo.eDp);
      localObject2 = paramft.eIp;
      long l = paramft.eIo.eDp;
      localObject3 = com.tencent.mm.plugin.favorite.h.axB().cf(l);
      if ((localObject3 == null) || (((j)localObject3).field_favProto == null)) {
        paramft = "";
      }
      for (;;)
      {
        ((ft.b)localObject2).eIy = paramft;
        GMTrace.o(20410221461504L, 152068);
        return;
        if ((((j)localObject3).field_type != 18) || (((j)localObject3).field_favProto.ulB.size() > 1))
        {
          paramft = ((j)localObject3).field_favProto.ulB.iterator();
          for (;;)
          {
            if (paramft.hasNext())
            {
              th localth = (th)paramft.next();
              switch (localth.aGU)
              {
              default: 
                break;
              case 2: 
                localObject1 = h(localth);
                paramft = (ft)localObject1;
                if (com.tencent.mm.a.e.aZ((String)localObject1)) {
                  break label78;
                }
                paramft = g(localth);
                if (com.tencent.mm.a.e.aZ(paramft))
                {
                  com.tencent.mm.sdk.platformtools.d.b(paramft, 150, 150, Bitmap.CompressFormat.JPEG, 90, (String)localObject1);
                  paramft = h(localth);
                  break label78;
                }
                if (localth.ujo)
                {
                  b((j)localObject3, localth, true);
                  paramft = (ft)localObject1;
                  break label78;
                }
                if (localth.uju)
                {
                  a((j)localObject3, localth, true);
                  break label78;
                }
                paramft = "";
                break label78;
              }
            }
          }
        }
        paramft = "";
      }
    }
    if (paramft.eIo.eIv == 2)
    {
      localObject1 = new j();
      ((j)localObject1).field_type = 2;
      localObject2 = new th();
      ((th)localObject2).Qt(aX(localObject2.toString(), 2));
      localObject3 = g((th)localObject2);
      ((th)localObject2).Qu((String)localObject3);
      ((th)localObject2).zR(2);
      ((j)localObject1).field_favProto.ulB.add(localObject2);
      paramft.eIp.path = j.b((j)localObject1);
      paramft.eIp.eIy = ((String)localObject3);
      GMTrace.o(20410221461504L, 152068);
      return;
    }
    if (paramft.eIo.eIv == 3)
    {
      localObject1 = com.tencent.mm.plugin.favorite.h.axB().cf(paramft.eIo.eDp);
      if (localObject1 != null) {
        paramft.eIp.path = (com.tencent.mm.y.q.zE() + ";" + ((j)localObject1).field_fromUser + ";" + ((j)localObject1).field_updateTime);
      }
      GMTrace.o(20410221461504L, 152068);
      return;
    }
    if (paramft.eIo.eIv == 4)
    {
      localObject1 = xU(paramft.eIo.desc);
      if (localObject1 != null)
      {
        paramft.eIo.eDx = ((j)localObject1).field_favProto;
        GMTrace.o(20410221461504L, 152068);
      }
    }
    else
    {
      if (paramft.eIo.eIv == 5)
      {
        b(paramft);
        GMTrace.o(20410221461504L, 152068);
        return;
      }
      if (paramft.eIo.eIv == 6)
      {
        localObject1 = com.tencent.mm.plugin.favorite.h.axB().cf(paramft.eIo.eDp);
        if (localObject1 == null)
        {
          paramft.eIp.ret = 0;
          GMTrace.o(20410221461504L, 152068);
          return;
        }
        paramft = paramft.eIp;
        if (((j)localObject1).field_id > 0) {
          i = 1;
        }
        paramft.ret = i;
        GMTrace.o(20410221461504L, 152068);
        return;
      }
      localObject1 = new j();
      ((j)localObject1).field_type = 18;
      ((j)localObject1).field_favProto = paramft.eIo.eDx;
      paramft.eIp.path = j.b((j)localObject1);
    }
    GMTrace.o(20410221461504L, 152068);
  }
  
  public static int cc(int paramInt1, int paramInt2)
  {
    GMTrace.i(6283402936320L, 46815);
    if (paramInt2 == 65135)
    {
      GMTrace.o(6283402936320L, 46815);
      return -4;
    }
    if (paramInt1 == 4)
    {
      GMTrace.o(6283402936320L, 46815);
      return -2;
    }
    GMTrace.o(6283402936320L, 46815);
    return -1;
  }
  
  public static void cj(long paramLong)
  {
    GMTrace.i(6283000283136L, 46812);
    if (lbW.containsKey(Long.valueOf(paramLong)))
    {
      GMTrace.o(6283000283136L, 46812);
      return;
    }
    lbW.put(Long.valueOf(paramLong), Long.valueOf(System.currentTimeMillis()));
    GMTrace.o(6283000283136L, 46812);
  }
  
  public static long ck(long paramLong)
  {
    GMTrace.i(6283134500864L, 46813);
    Long localLong = (Long)lbW.get(Long.valueOf(paramLong));
    if (localLong == null)
    {
      GMTrace.o(6283134500864L, 46813);
      return -1L;
    }
    paramLong = System.currentTimeMillis();
    long l = localLong.longValue();
    GMTrace.o(6283134500864L, 46813);
    return paramLong - l;
  }
  
  public static void cl(long paramLong)
  {
    GMTrace.i(6283268718592L, 46814);
    if (lbX.containsKey(Long.valueOf(paramLong)))
    {
      GMTrace.o(6283268718592L, 46814);
      return;
    }
    lbX.put(Long.valueOf(paramLong), Long.valueOf(System.currentTimeMillis()));
    GMTrace.o(6283268718592L, 46814);
  }
  
  public static float cm(long paramLong)
  {
    float f1 = 1.0F;
    GMTrace.i(18033762369536L, 134362);
    float f2 = (float)paramLong / 1000.0F;
    if (f2 < 1.0F) {}
    for (;;)
    {
      f1 = Math.round(f1);
      GMTrace.o(18033762369536L, 134362);
      return f1;
      f1 = f2;
    }
  }
  
  public static void cn(long paramLong)
  {
    GMTrace.i(6289308516352L, 46859);
    w.i("MicroMsg.FavoriteLogic", "setUsedCapacity:%d", new Object[] { Long.valueOf(paramLong) });
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vst, Long.valueOf(paramLong));
    GMTrace.o(6289308516352L, 46859);
  }
  
  public static void co(long paramLong)
  {
    GMTrace.i(6289442734080L, 46860);
    w.i("MicroMsg.FavoriteLogic", "setTotalCapacity:%d", new Object[] { Long.valueOf(paramLong) });
    at.AR();
    com.tencent.mm.y.c.xh().a(w.a.vsu, Long.valueOf(paramLong));
    GMTrace.o(6289442734080L, 46860);
  }
  
  public static void cp(long paramLong)
  {
    GMTrace.i(6290382258176L, 46867);
    com.tencent.mm.sdk.platformtools.ab.getContext().getSharedPreferences(com.tencent.mm.sdk.platformtools.ab.bPU(), 0).edit().putLong("fav_mx_auto_download_size", paramLong).commit();
    GMTrace.o(6290382258176L, 46867);
  }
  
  public static void cq(long paramLong)
  {
    GMTrace.i(6290650693632L, 46869);
    com.tencent.mm.sdk.platformtools.ab.getContext().getSharedPreferences(com.tencent.mm.sdk.platformtools.ab.bPU(), 0).edit().putLong("fav_mx_auto_upload_size", paramLong).commit();
    GMTrace.o(6290650693632L, 46869);
  }
  
  public static void cr(long paramLong)
  {
    GMTrace.i(6290784911360L, 46870);
    com.tencent.mm.sdk.platformtools.ab.getContext().getSharedPreferences(com.tencent.mm.sdk.platformtools.ab.bPU(), 0).edit().putLong("fav_mx_file_size", paramLong).commit();
    GMTrace.o(6290784911360L, 46870);
  }
  
  public static void cs(long paramLong)
  {
    GMTrace.i(6291992870912L, 46879);
    lbY = paramLong;
    GMTrace.o(6291992870912L, 46879);
  }
  
  public static j ct(long paramLong)
  {
    GMTrace.i(16937203531776L, 126192);
    j localj = new j();
    localj.field_type = 18;
    localj.field_sourceType = 6;
    String str = com.tencent.mm.y.q.zE();
    tw localtw = new tw();
    localtw.QY(str);
    localtw.QZ(str);
    localtw.zZ(localj.field_sourceType);
    localtw.eE(bg.Pv());
    localj.field_favProto.a(localtw);
    localj.field_fromUser = localtw.eMI;
    localj.field_toUser = localtw.toUser;
    localj.field_favProto.zY(1);
    localj.field_favProto.zX(127);
    localj.field_edittime = bg.Pu();
    localj.field_updateTime = bg.Pv();
    localj.field_favProto.eD(localj.field_edittime);
    localj.field_favProto.ulz.eE(bg.Pv());
    localj.field_itemStatus = 9;
    localj.field_localId = paramLong;
    com.tencent.mm.plugin.favorite.h.axB().c(localj);
    GMTrace.o(16937203531776L, 126192);
    return localj;
  }
  
  private static String cu(long paramLong)
  {
    GMTrace.i(20408879284224L, 152058);
    StringBuilder localStringBuilder = new StringBuilder();
    j localj = com.tencent.mm.plugin.favorite.h.axB().cf(paramLong);
    if ((localj == null) || (localj.field_favProto == null) || (localj.field_favProto.ulB.size() <= 1))
    {
      GMTrace.o(20408879284224L, 152058);
      return "";
    }
    tp localtp = localj.field_favProto.tLX;
    String str2 = "";
    String str1 = "";
    if (localtp != null)
    {
      str2 = localtp.ulu;
      str1 = localtp.ult;
    }
    localStringBuilder.append("<noteinfo>");
    localStringBuilder.append("<noteauthor>").append(str1).append("</noteauthor>");
    localStringBuilder.append("<noteeditor>").append(str2).append("</noteeditor>");
    localStringBuilder.append("<edittime>").append(localj.field_favProto.tLY).append("</edittime>");
    localStringBuilder.append("<favlocalid>").append(localj.field_localId).append("</favlocalid>");
    localStringBuilder.append(f.aw(localj.field_favProto.ulB).replace("cdn_dataurl", "cdndataurl").replace("cdn_datakey", "cdndatakey").replace("cdn_thumburl", "cdnthumburl").replace("cdn_thumbkey", "cdnthumbkey").replace("thumbfullsize", "thumbsize").replace("fullsize", "datasize").replace("datasrcname", "sourcename").replace("datasrctime", "sourcetime").replace("stream_lowbandurl", "streamlowbandurl").replace("stream_dataurl", "streamdataurl").replace("stream_weburl", "streamweburl"));
    localStringBuilder.append("</noteinfo>");
    str1 = localStringBuilder.toString();
    GMTrace.o(20408879284224L, 152058);
    return str1;
  }
  
  public static void d(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(20409147719680L, 152060);
    j localj = xU(paramString1);
    if (localj == null)
    {
      GMTrace.o(20409147719680L, 152060);
      return;
    }
    km localkm = new km();
    localkm.eOE.type = 2;
    localkm.eOE.field_localId = -1L;
    localkm.eOE.context = paramContext;
    localkm.eOE.eOL = 4;
    localkm.eOE.eON = true;
    paramContext = new Bundle();
    paramContext.putString("noteauthor", localj.field_favProto.tLX.ult);
    paramContext.putString("noteeditor", localj.field_favProto.tLX.ulu);
    paramContext.putLong("edittime", localj.field_favProto.tLY);
    paramContext.putString("notexml", j.b(localj));
    paramContext.putString("snslocalid", paramString2);
    paramContext.putString("snsthumbpath", paramString3);
    paramContext.putString("snsnotelinkxml", paramString1);
    localkm.eOE.eOJ = paramContext;
    localkm.eOE.field_favProto = localj.field_favProto;
    com.tencent.mm.sdk.b.a.vgX.m(localkm);
    GMTrace.o(20409147719680L, 152060);
  }
  
  private static void d(Set<String> paramSet)
  {
    GMTrace.i(6288100556800L, 46850);
    StringBuffer localStringBuffer = new StringBuffer();
    paramSet = paramSet.iterator();
    while (paramSet.hasNext()) {
      localStringBuffer.append((String)paramSet.next()).append(",");
    }
    paramSet = "";
    if (localStringBuffer.length() > 0) {
      paramSet = localStringBuffer.substring(0, localStringBuffer.length() - 1);
    }
    w.i("MicroMsg.FavoriteLogic", "set need del IDs: %s", new Object[] { paramSet });
    at.AR();
    com.tencent.mm.y.c.xh().set(225282, paramSet);
    GMTrace.o(6288100556800L, 46850);
  }
  
  public static boolean d(th paramth)
  {
    GMTrace.i(6284879331328L, 46826);
    boolean bool = new File(g(paramth)).exists();
    GMTrace.o(6284879331328L, 46826);
    return bool;
  }
  
  public static void e(String paramString, Context paramContext)
  {
    GMTrace.i(6293469265920L, 46890);
    String str = com.tencent.mm.modelvideo.t.mx(paramString);
    w.i("MicroMsg.FavoriteLogic", "save video now video path %s out path %s", new Object[] { paramString, str });
    if (bg.nm(str))
    {
      Toast.makeText(paramContext, paramContext.getString(R.l.egt), 1).show();
      GMTrace.o(6293469265920L, 46890);
      return;
    }
    Toast.makeText(paramContext, paramContext.getString(R.l.egu, new Object[] { str }), 1).show();
    com.tencent.mm.pluginsdk.ui.tools.k.b(str, paramContext);
    GMTrace.o(6293469265920L, 46890);
  }
  
  public static boolean e(th paramth)
  {
    GMTrace.i(6285013549056L, 46827);
    boolean bool = com.tencent.mm.sdk.platformtools.o.RH(g(paramth));
    GMTrace.o(6285013549056L, 46827);
    return bool;
  }
  
  public static List<j> f(List<j> paramList, List<Long> paramList1)
  {
    int k = 0;
    GMTrace.i(6292529741824L, 46883);
    ArrayList localArrayList = new ArrayList();
    if (paramList1 == null)
    {
      GMTrace.o(6292529741824L, 46883);
      return localArrayList;
    }
    int i = k;
    long l;
    int j;
    if (paramList != null)
    {
      i = k;
      if (paramList.size() > 0)
      {
        localArrayList.addAll(paramList);
        l = ((j)paramList.get(paramList.size() - 1)).field_localId;
        j = 0;
      }
    }
    for (;;)
    {
      i = k;
      if (j < paramList1.size())
      {
        if (Long.valueOf(l).equals(paramList1.get(j))) {
          i = j + 1;
        }
      }
      else
      {
        j = i;
        while ((j < i + 20) && (j < paramList1.size()))
        {
          paramList = com.tencent.mm.plugin.favorite.h.axB().cf(((Long)paramList1.get(j)).longValue());
          if (paramList != null) {
            localArrayList.add(paramList);
          }
          j += 1;
        }
      }
      j += 1;
    }
    GMTrace.o(6292529741824L, 46883);
    return localArrayList;
  }
  
  public static void f(th paramth)
  {
    GMTrace.i(6285818855424L, 46833);
    a locala = com.tencent.mm.plugin.favorite.h.axw().xE(paramth.lhq);
    if ((locala != null) && (locala.field_status != 3))
    {
      locala.field_status = 2;
      com.tencent.mm.plugin.favorite.h.axw().a(locala, new String[] { "dataId" });
      com.tencent.mm.plugin.favorite.h.axv().pauseDownload(paramth.lhq);
    }
    locala = com.tencent.mm.plugin.favorite.h.axw().xE(xQ(paramth.lhq));
    if ((locala != null) && (locala.field_status != 3))
    {
      locala.field_status = 2;
      com.tencent.mm.plugin.favorite.h.axw().a(locala, new String[] { "dataId" });
      com.tencent.mm.plugin.favorite.h.axv().pauseDownload(xQ(paramth.lhq));
    }
    GMTrace.o(6285818855424L, 46833);
  }
  
  public static String ft(String paramString)
  {
    GMTrace.i(6291724435456L, 46877);
    at.AR();
    Object localObject = com.tencent.mm.y.c.yK().TE(paramString);
    if (localObject == null)
    {
      w.w("MicroMsg.FavoriteLogic", "wtf get contact null, username %s", new Object[] { paramString });
      GMTrace.o(6291724435456L, 46877);
      return "";
    }
    String str = ((com.tencent.mm.storage.x)localObject).vk();
    localObject = str;
    if (s.eb(str))
    {
      paramString = com.tencent.mm.y.m.fi(paramString);
      localObject = com.tencent.mm.y.q.zE();
      if ((paramString != null) && (!paramString.isEmpty())) {
        break label114;
      }
      w.w("MicroMsg.FavoriteLogic", "get members from username error, content empty");
    }
    for (localObject = str;; localObject = com.tencent.mm.y.m.b(paramString, 3))
    {
      GMTrace.o(6291724435456L, 46877);
      return (String)localObject;
      label114:
      paramString.remove(localObject);
      paramString.add(0, localObject);
    }
  }
  
  public static String g(th paramth)
  {
    GMTrace.i(6286489944064L, 46838);
    if (paramth == null)
    {
      GMTrace.o(6286489944064L, 46838);
      return "";
    }
    Object localObject2 = paramth.lhq;
    if ((bg.nm((String)localObject2)) || (!at.AU()))
    {
      GMTrace.o(6286489944064L, 46838);
      return "";
    }
    File localFile2 = xP((String)localObject2);
    int j = 0;
    int i = j;
    File localFile1 = localFile2;
    Object localObject1 = localObject2;
    if (paramth.aGU == 8)
    {
      i = j;
      localFile1 = localFile2;
      localObject1 = localObject2;
      if (!bg.nm(paramth.title))
      {
        localObject1 = paramth.title;
        localFile1 = xP(paramth.lhq);
        i = 1;
      }
    }
    localObject2 = localObject1;
    if (paramth.ujI != null)
    {
      localObject2 = localObject1;
      if (paramth.ujI.trim().length() > 0)
      {
        localObject2 = localObject1;
        if (i == 0) {
          localObject2 = (String)localObject1 + "." + paramth.ujI;
        }
      }
    }
    paramth = new File(localFile1, (String)localObject2).getAbsolutePath();
    GMTrace.o(6286489944064L, 46838);
    return paramth;
  }
  
  public static String h(th paramth)
  {
    GMTrace.i(6286624161792L, 46839);
    if ((paramth == null) || (bg.nm(paramth.lhq)))
    {
      GMTrace.o(6286624161792L, 46839);
      return "";
    }
    paramth = xQ(paramth.lhq);
    paramth = new File(xP(paramth), paramth).getAbsolutePath();
    GMTrace.o(6286624161792L, 46839);
    return paramth;
  }
  
  public static long k(j paramj)
  {
    GMTrace.i(6283537154048L, 46816);
    if (paramj == null)
    {
      GMTrace.o(6283537154048L, 46816);
      return 0L;
    }
    paramj = paramj.field_favProto.ulB.iterator();
    th localth;
    for (int i = 0; paramj.hasNext(); i = (int)(localth.ujO + l))
    {
      localth = (th)paramj.next();
      l = i;
    }
    long l = i;
    GMTrace.o(6283537154048L, 46816);
    return l;
  }
  
  public static void l(j paramj)
  {
    GMTrace.i(6285281984512L, 46829);
    if (!paramj.axK())
    {
      w.f("MicroMsg.FavoriteLogic", "restartItemUpload status not upload failed!");
      GMTrace.o(6285281984512L, 46829);
      return;
    }
    switch (paramj.field_itemStatus)
    {
    }
    for (;;)
    {
      GMTrace.o(6285281984512L, 46829);
      return;
      paramj.field_itemStatus = 1;
      com.tencent.mm.plugin.favorite.h.axB().a(paramj, new String[] { "localId" });
      com.tencent.mm.plugin.favorite.h.axs().run();
      GMTrace.o(6285281984512L, 46829);
      return;
      if (com.tencent.mm.plugin.favorite.h.axw().cc(paramj.field_localId).size() == 0)
      {
        paramj.field_itemStatus = 9;
        com.tencent.mm.plugin.favorite.h.axB().a(paramj, new String[] { "localId" });
        paramj = new aa(paramj);
        at.wS().a(paramj, 0);
        GMTrace.o(6285281984512L, 46829);
        return;
      }
      paramj.field_itemStatus = 4;
      com.tencent.mm.plugin.favorite.h.axw().a(paramj);
      com.tencent.mm.plugin.favorite.h.axB().a(paramj, new String[] { "localId" });
      Iterator localIterator = com.tencent.mm.plugin.favorite.h.axw().cc(paramj.field_localId).iterator();
      a locala;
      while (localIterator.hasNext())
      {
        locala = (a)localIterator.next();
        w.i("MicroMsg.FavoriteLogic", "force upload favItem[last failed], favid:%d localId:%d, dataId:%s, dataType:%d totalLength %d", new Object[] { Integer.valueOf(paramj.field_id), Long.valueOf(paramj.field_localId), locala.field_dataId, Integer.valueOf(locala.field_dataType), Integer.valueOf(locala.field_totalLen) });
        com.tencent.mm.plugin.favorite.h.axv().xV(locala.field_dataId);
      }
      com.tencent.mm.plugin.favorite.h.axv().run();
      GMTrace.o(6285281984512L, 46829);
      return;
      com.tencent.mm.plugin.favorite.h.axB().s(12, paramj.field_localId);
      com.tencent.mm.plugin.favorite.h.axr().run();
      GMTrace.o(6285281984512L, 46829);
      return;
      com.tencent.mm.plugin.favorite.h.axB().s(15, paramj.field_localId);
      com.tencent.mm.plugin.favorite.h.axw().a(paramj);
      localIterator = com.tencent.mm.plugin.favorite.h.axw().cc(paramj.field_localId).iterator();
      while (localIterator.hasNext())
      {
        locala = (a)localIterator.next();
        w.i("MicroMsg.FavoriteLogic", "force upload favItem[last mod failed], favid:%d localId:%d, dataId:%s, dataType:%d totalLength %d", new Object[] { Integer.valueOf(paramj.field_id), Long.valueOf(paramj.field_localId), locala.field_dataId, Integer.valueOf(locala.field_dataType), Integer.valueOf(locala.field_totalLen) });
        com.tencent.mm.plugin.favorite.h.axv().xV(locala.field_dataId);
      }
      com.tencent.mm.plugin.favorite.h.axv().run();
      GMTrace.o(6285281984512L, 46829);
      return;
      com.tencent.mm.plugin.favorite.h.axB().s(17, paramj.field_localId);
      com.tencent.mm.plugin.favorite.h.axt().run();
      GMTrace.o(6285281984512L, 46829);
      return;
      paramj.field_itemStatus = 9;
      com.tencent.mm.plugin.favorite.h.axB().a(paramj, new String[] { "localId" });
      com.tencent.mm.plugin.favorite.h.axr().run();
    }
  }
  
  public static void m(j paramj)
  {
    GMTrace.i(6285416202240L, 46830);
    if (paramj == null)
    {
      GMTrace.o(6285416202240L, 46830);
      return;
    }
    if ((paramj.field_itemStatus == 8) || (paramj.field_itemStatus == 10))
    {
      paramj.field_itemStatus = 7;
      Object localObject = paramj.field_favProto.ulB;
      if (((List)localObject).size() == 0)
      {
        GMTrace.o(6285416202240L, 46830);
        return;
      }
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        th localth = (th)((Iterator)localObject).next();
        a(paramj, localth, true);
        b(paramj, localth, true);
      }
      GMTrace.o(6285416202240L, 46830);
      return;
    }
    w.e("MicroMsg.FavoriteLogic", "status not download failed or done!");
    GMTrace.o(6285416202240L, 46830);
  }
  
  public static th n(j paramj)
  {
    GMTrace.i(6285953073152L, 46834);
    if (paramj == null)
    {
      paramj = new th();
      GMTrace.o(6285953073152L, 46834);
      return paramj;
    }
    if (paramj.field_favProto.ulB.size() == 0)
    {
      paramj = new th();
      GMTrace.o(6285953073152L, 46834);
      return paramj;
    }
    paramj = (th)paramj.field_favProto.ulB.get(0);
    GMTrace.o(6285953073152L, 46834);
    return paramj;
  }
  
  public static boolean nB(int paramInt)
  {
    GMTrace.i(6292663959552L, 46884);
    int[] arrayOfInt = lcb;
    int j = arrayOfInt.length;
    int i = 0;
    while (i < j)
    {
      if (arrayOfInt[i] == paramInt)
      {
        GMTrace.o(6292663959552L, 46884);
        return true;
      }
      i += 1;
    }
    GMTrace.o(6292663959552L, 46884);
    return false;
  }
  
  public static boolean nC(int paramInt)
  {
    GMTrace.i(6292798177280L, 46885);
    int[] arrayOfInt = lca;
    int j = arrayOfInt.length;
    int i = 0;
    while (i < j)
    {
      if (arrayOfInt[i] == paramInt)
      {
        GMTrace.o(6292798177280L, 46885);
        return true;
      }
      i += 1;
    }
    GMTrace.o(6292798177280L, 46885);
    return false;
  }
  
  public static void o(j paramj)
  {
    GMTrace.i(6286221508608L, 46836);
    if (!paramj.axJ())
    {
      w.e("MicroMsg.FavoriteLogic", "pauseItemUpload, not uploading");
      GMTrace.o(6286221508608L, 46836);
      return;
    }
    w.v("MicroMsg.FavoriteLogic", "pauseItemUpload, itemStatu:%d", new Object[] { Integer.valueOf(paramj.field_itemStatus) });
    Iterator localIterator = paramj.field_favProto.ulB.iterator();
    while (localIterator.hasNext())
    {
      th localth = (th)localIterator.next();
      a locala = com.tencent.mm.plugin.favorite.h.axw().xE(localth.lhq);
      if ((locala != null) && (locala.field_status != 3))
      {
        locala.field_status = 2;
        com.tencent.mm.plugin.favorite.h.axw().a(locala, new String[] { "dataId" });
        com.tencent.mm.plugin.favorite.h.axv().xW(localth.lhq);
      }
      locala = com.tencent.mm.plugin.favorite.h.axw().xE(xQ(localth.lhq));
      if ((locala != null) && (locala.field_status != 3))
      {
        locala.field_status = 2;
        com.tencent.mm.plugin.favorite.h.axw().a(locala, new String[] { "dataId" });
        com.tencent.mm.plugin.favorite.h.axv().xW(xQ(localth.lhq));
      }
    }
    paramj = com.tencent.mm.plugin.favorite.h.axB().cf(paramj.field_localId);
    w.v("MicroMsg.FavoriteLogic", "pauseItemUpload, after pause data itemStatu:%d", new Object[] { Integer.valueOf(paramj.field_itemStatus) });
    switch (paramj.field_itemStatus)
    {
    }
    for (;;)
    {
      GMTrace.o(6286221508608L, 46836);
      return;
      com.tencent.mm.plugin.favorite.h.axB().s(3, paramj.field_localId);
      w.v("MicroMsg.FavoriteLogic", "pauseItemUpload, final itemStatu:%d", new Object[] { Integer.valueOf(3) });
      GMTrace.o(6286221508608L, 46836);
      return;
      com.tencent.mm.plugin.favorite.h.axB().s(6, paramj.field_localId);
      w.v("MicroMsg.FavoriteLogic", "pauseItemUpload, final itemStatu:%d", new Object[] { Integer.valueOf(6) });
      GMTrace.o(6286221508608L, 46836);
      return;
      com.tencent.mm.plugin.favorite.h.axB().s(11, paramj.field_localId);
      w.v("MicroMsg.FavoriteLogic", "pauseItemUpload, final itemStatu:%d", new Object[] { Integer.valueOf(11) });
      GMTrace.o(6286221508608L, 46836);
      return;
      com.tencent.mm.plugin.favorite.h.axB().s(14, paramj.field_localId);
      w.v("MicroMsg.FavoriteLogic", "pauseItemUpload, final itemStatu:%d", new Object[] { Integer.valueOf(14) });
      GMTrace.o(6286221508608L, 46836);
      return;
      com.tencent.mm.plugin.favorite.h.axB().s(16, paramj.field_localId);
      w.v("MicroMsg.FavoriteLogic", "pauseItemUpload, final itemStatu:%d", new Object[] { Integer.valueOf(16) });
      GMTrace.o(6286221508608L, 46836);
      return;
      com.tencent.mm.plugin.favorite.h.axB().s(18, paramj.field_localId);
      w.v("MicroMsg.FavoriteLogic", "pauseItemUpload, final itemStatu:%d", new Object[] { Integer.valueOf(18) });
    }
  }
  
  private static void p(j paramj)
  {
    GMTrace.i(6288368992256L, 46852);
    Set localSet = com.tencent.mm.bf.a.hgc;
    paramj = paramj.field_favProto.ulB;
    int i = 0;
    while (i < paramj.size())
    {
      String str = h((th)paramj.get(i));
      if ((localSet == null) || (!localSet.contains(str))) {
        com.tencent.mm.loader.stub.b.deleteFile(str);
      }
      str = g((th)paramj.get(i));
      if ((localSet == null) || (!localSet.contains(str))) {
        com.tencent.mm.loader.stub.b.deleteFile(str);
      }
      i += 1;
    }
    GMTrace.o(6288368992256L, 46852);
  }
  
  public static long q(long paramLong, int paramInt)
  {
    GMTrace.i(6284476678144L, 46823);
    w.i("MicroMsg.FavoriteLogic", "tryStartBatchGet...");
    k localk = com.tencent.mm.plugin.favorite.h.axB();
    long l1;
    long l2;
    if (localk.fTZ == null)
    {
      w.e("MicroMsg.FavItemInfoStorage", "getMinBatchGetUpdateTime, but db is null, return");
      l1 = 0L;
      localk = com.tencent.mm.plugin.favorite.h.axB();
      if (localk.fTZ != null) {
        break label458;
      }
      w.e("MicroMsg.FavItemInfoStorage", "getNextUpdateTime, but db is null, return");
      l2 = 0L;
    }
    for (;;)
    {
      w.v("MicroMsg.FavoriteLogic", "klem, tryStartBatchGet, batchGetTime:%d, itemTiem:%d, updateTime:%d", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(paramLong) });
      if (l1 != 0L) {
        break label772;
      }
      GMTrace.o(6284476678144L, 46823);
      return l2;
      if (paramLong == 0L)
      {
        localObject = "select updateTime from (select * from FavItemInfo";
        if (paramInt != -1) {
          localObject = "select updateTime from (select * from FavItemInfo" + " where type = " + paramInt;
        }
        localObject = (String)localObject + " order by updateTime desc limit 20";
        localObject = (String)localObject + ") where updateSeq > localSeq";
        localObject = localk.fTZ.rawQuery((String)localObject, null);
        if (localObject == null)
        {
          l1 = 0L;
          break;
        }
        if (((Cursor)localObject).getCount() == 0)
        {
          ((Cursor)localObject).close();
          l1 = 0L;
          break;
        }
        ((Cursor)localObject).moveToLast();
        l1 = ((Cursor)localObject).getLong(0);
        ((Cursor)localObject).close();
        break;
      }
      str = "select updateTime from (select * from FavItemInfo where updateTime < " + paramLong;
      localObject = str;
      if (paramInt != -1) {
        localObject = str + " and type = " + paramInt;
      }
      localObject = (String)localObject + " order by updateTime desc limit 20";
      localObject = (String)localObject + ") where updateSeq > localSeq";
      localObject = localk.fTZ.rawQuery((String)localObject, null);
      if (localObject == null)
      {
        l1 = 0L;
        break;
      }
      if (((Cursor)localObject).getCount() == 0)
      {
        ((Cursor)localObject).close();
        l1 = 0L;
        break;
      }
      ((Cursor)localObject).moveToLast();
      l1 = ((Cursor)localObject).getLong(0);
      ((Cursor)localObject).close();
      break;
      label458:
      if (paramLong != 0L) {
        break label601;
      }
      localObject = "select updateTime from FavItemInfo where itemStatus > 0";
      if (paramInt != -1) {
        localObject = "select updateTime from FavItemInfo where itemStatus > 0" + " and type = " + paramInt;
      }
      localObject = (String)localObject + " order by updateTime desc limit 20";
      localObject = localk.fTZ.rawQuery((String)localObject, null);
      if (localObject == null)
      {
        l2 = 0L;
      }
      else if (((Cursor)localObject).getCount() == 0)
      {
        ((Cursor)localObject).close();
        l2 = 0L;
      }
      else
      {
        ((Cursor)localObject).moveToLast();
        l2 = ((Cursor)localObject).getLong(0);
        ((Cursor)localObject).close();
      }
    }
    label601:
    String str = "select updateTime from FavItemInfo where updateTime < " + paramLong;
    Object localObject = str;
    if (paramInt != -1) {
      localObject = str + " and type = " + paramInt;
    }
    localObject = (String)localObject + " and itemStatus > 0";
    localObject = (String)localObject + " order by updateTime desc limit 20";
    localObject = localk.fTZ.rawQuery((String)localObject, null);
    if ((localObject != null) && (((Cursor)localObject).getCount() > 0)) {
      ((Cursor)localObject).moveToLast();
    }
    for (long l3 = ((Cursor)localObject).getLong(0);; l3 = paramLong)
    {
      l2 = l3;
      if (localObject == null) {
        break;
      }
      ((Cursor)localObject).close();
      l2 = l3;
      break;
      label772:
      localObject = com.tencent.mm.plugin.favorite.h.axB().p(l1, paramInt);
      if (((LinkedList)localObject).size() > 0)
      {
        w.i("MicroMsg.FavoriteLogic", "klem, tryStartBatchGet, batchGetTime:%d, itemTiem:%d, updateTime:%d", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(paramLong) });
        w.i("MicroMsg.FavoriteLogic", "klem, tryStartBatchGet, need batch get idList size:%d", new Object[] { Integer.valueOf(((LinkedList)localObject).size()) });
        localObject = new ac((LinkedList)localObject);
        if (!at.wS().a((com.tencent.mm.ad.k)localObject, 0))
        {
          w.w("MicroMsg.FavoriteLogic", "do scene BatchGetFav fail");
          ac.ayp();
        }
      }
      if (l2 == 0L)
      {
        GMTrace.o(6284476678144L, 46823);
        return l1;
      }
      if (l1 < l2)
      {
        GMTrace.o(6284476678144L, 46823);
        return l1;
      }
      GMTrace.o(6284476678144L, 46823);
      return l2;
    }
  }
  
  private static void q(j paramj)
  {
    GMTrace.i(6288771645440L, 46855);
    o localo = com.tencent.mm.plugin.favorite.h.axA().ci(paramj.field_localId);
    if (localo == null)
    {
      localo = new o();
      localo.field_localId = paramj.field_localId;
    }
    for (int i = 1;; i = 0)
    {
      localo.field_tagContent = "";
      Iterator localIterator = paramj.field_tagProto.ulO.iterator();
      String str;
      while (localIterator.hasNext())
      {
        str = (String)localIterator.next();
        localo.field_tagContent = (localo.field_tagContent + " " + str);
      }
      localIterator = paramj.field_tagProto.ulP.iterator();
      while (localIterator.hasNext())
      {
        str = (String)localIterator.next();
        localo.field_tagContent = (localo.field_tagContent + " " + str);
        com.tencent.mm.plugin.favorite.h.axu().xL(str);
      }
      localo.field_content = "";
      localo.field_time = paramj.field_updateTime;
      localo.field_type = paramj.field_type;
      if (i != 0)
      {
        com.tencent.mm.plugin.favorite.h.axA().b(localo);
        GMTrace.o(6288771645440L, 46855);
        return;
      }
      com.tencent.mm.plugin.favorite.h.axA().c(localo, new String[] { "localId" });
      GMTrace.o(6288771645440L, 46855);
      return;
    }
  }
  
  public static void r(j paramj)
  {
    GMTrace.i(6288905863168L, 46856);
    o localo = com.tencent.mm.plugin.favorite.h.axA().ci(paramj.field_localId);
    if (localo == null)
    {
      localo = new o();
      localo.field_localId = paramj.field_localId;
    }
    for (int i = 1;; i = 0)
    {
      StringBuffer localStringBuffer = new StringBuffer();
      if (paramj.field_favProto.title != null) {
        localStringBuffer.append(paramj.field_favProto.title);
      }
      if (paramj.field_favProto.desc != null) {
        localStringBuffer.append(paramj.field_favProto.desc);
      }
      Object localObject2;
      if (paramj.field_favProto.ulz != null)
      {
        localObject1 = paramj.field_favProto.ulz;
        if (!bg.nm(((tw)localObject1).eMI))
        {
          localStringBuffer.append(((tw)localObject1).eMI);
          at.AR();
          localObject2 = com.tencent.mm.y.c.yK().TE(((tw)localObject1).eMI);
          if (localObject2 != null) {
            localStringBuffer.append(((com.tencent.mm.g.b.af)localObject2).field_nickname).append(((com.tencent.mm.g.b.af)localObject2).field_conRemark);
          }
          at.AR();
          localObject2 = com.tencent.mm.y.c.yK().TE(((tw)localObject1).toUser);
          if (localObject2 != null) {
            localStringBuffer.append(((com.tencent.mm.g.b.af)localObject2).field_nickname).append(((com.tencent.mm.g.b.af)localObject2).field_conRemark);
          }
          localStringBuffer.append(((tw)localObject1).ulb);
        }
      }
      Object localObject1 = paramj.field_favProto.ulB;
      localo.field_subtype = 0;
      localObject1 = ((LinkedList)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (th)((Iterator)localObject1).next();
        if (((th)localObject2).desc != null) {
          localStringBuffer.append(((th)localObject2).desc);
        }
        if (((th)localObject2).title != null) {
          localStringBuffer.append(((th)localObject2).title);
        }
        int j = ((th)localObject2).aGU;
        int k = localo.field_subtype;
        localo.field_subtype = (o.nz(j) | k);
      }
      if (paramj.field_favProto.ukJ != null)
      {
        if (paramj.field_favProto.ukJ.desc != null) {
          localStringBuffer.append(paramj.field_favProto.ukJ.desc);
        }
        if (paramj.field_favProto.ukJ.title != null) {
          localStringBuffer.append(paramj.field_favProto.ukJ.title);
        }
      }
      if (paramj.field_favProto.ukL != null)
      {
        if (paramj.field_favProto.ukL.desc != null) {
          localStringBuffer.append(paramj.field_favProto.ukL.desc);
        }
        if (paramj.field_favProto.ukL.title != null) {
          localStringBuffer.append(paramj.field_favProto.ukL.title);
        }
      }
      localo.field_tagContent = "";
      localObject1 = paramj.field_tagProto.ulO.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        localo.field_tagContent = (localo.field_tagContent + " " + (String)localObject2);
        localStringBuffer.append((String)localObject2);
      }
      localObject1 = paramj.field_tagProto.ulP.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        localo.field_tagContent = (localo.field_tagContent + " " + (String)localObject2);
        localStringBuffer.append((String)localObject2);
        com.tencent.mm.plugin.favorite.h.axu().xL((String)localObject2);
      }
      localo.field_content = localStringBuffer.toString();
      localo.field_time = paramj.field_updateTime;
      localo.field_type = paramj.field_type;
      if (i != 0)
      {
        com.tencent.mm.plugin.favorite.h.axA().b(localo);
        GMTrace.o(6288905863168L, 46856);
        return;
      }
      com.tencent.mm.plugin.favorite.h.axA().c(localo, new String[] { "localId" });
      GMTrace.o(6288905863168L, 46856);
      return;
    }
  }
  
  public static boolean s(j paramj)
  {
    GMTrace.i(6292261306368L, 46881);
    if (paramj == null)
    {
      GMTrace.o(6292261306368L, 46881);
      return false;
    }
    if ((paramj.field_itemStatus == 8) || (paramj.field_itemStatus == 10) || (paramj.field_itemStatus == 7))
    {
      GMTrace.o(6292261306368L, 46881);
      return true;
    }
    GMTrace.o(6292261306368L, 46881);
    return false;
  }
  
  public static void startSync()
  {
    GMTrace.i(6284610895872L, 46824);
    af localaf = new af();
    at.wS().a(localaf, 0);
    GMTrace.o(6284610895872L, 46824);
  }
  
  public static CharSequence t(Context paramContext, int paramInt)
  {
    GMTrace.i(18033628151808L, 134361);
    int i = paramInt / 1000;
    if (i <= 0)
    {
      paramContext = paramContext.getString(R.l.dvg, new Object[] { Integer.valueOf(0) });
      GMTrace.o(18033628151808L, 134361);
      return paramContext;
    }
    paramInt = i / 60;
    i %= 60;
    if (paramInt == 0)
    {
      paramContext = paramContext.getString(R.l.dvg, new Object[] { Integer.valueOf(i) });
      GMTrace.o(18033628151808L, 134361);
      return paramContext;
    }
    paramContext = paramContext.getString(R.l.dvf, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
    GMTrace.o(18033628151808L, 134361);
    return paramContext;
  }
  
  public static boolean t(j paramj)
  {
    GMTrace.i(6293200830464L, 46888);
    if (paramj == null)
    {
      GMTrace.o(6293200830464L, 46888);
      return false;
    }
    th localth = n(paramj);
    if (localth == null)
    {
      GMTrace.o(6293200830464L, 46888);
      return false;
    }
    long l = bg.Pw();
    com.tencent.mm.plugin.sight.base.a locala = com.tencent.mm.plugin.sight.base.d.GB(g(localth));
    int j;
    int i;
    boolean bool;
    if (locala != null)
    {
      j = locala.bgg();
      i = localth.duration;
      if ((i <= 0) || (Math.abs(i - j) >= 2))
      {
        localth.zQ(j);
        bool = com.tencent.mm.plugin.favorite.h.axB().a(paramj, new String[] { "localId" });
      }
    }
    for (;;)
    {
      w.i("MicroMsg.FavoriteLogic", "repair video duration[%d TO %d] %b cost time %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j), Boolean.valueOf(bool), Long.valueOf(bg.aI(l)) });
      GMTrace.o(6293200830464L, 46888);
      return bool;
      bool = false;
      continue;
      bool = false;
      i = 0;
      j = 0;
    }
  }
  
  public static boolean u(j paramj)
  {
    GMTrace.i(6293737701376L, 46892);
    if (paramj.field_favProto == null)
    {
      GMTrace.o(6293737701376L, 46892);
      return false;
    }
    paramj = paramj.field_favProto.ulB.iterator();
    while (paramj.hasNext())
    {
      th localth = (th)paramj.next();
      if (localth.ukB == 2)
      {
        GMTrace.o(6293737701376L, 46892);
        return true;
      }
      if (localth.ukB == 1)
      {
        GMTrace.o(6293737701376L, 46892);
        return true;
      }
    }
    GMTrace.o(6293737701376L, 46892);
    return false;
  }
  
  public static boolean v(j paramj)
  {
    GMTrace.i(16937337749504L, 126193);
    if (com.tencent.mm.plugin.favorite.h.axB().cf(paramj.field_localId) != null)
    {
      GMTrace.o(16937337749504L, 126193);
      return true;
    }
    GMTrace.o(16937337749504L, 126193);
    return false;
  }
  
  public static void w(j paramj)
  {
    GMTrace.i(20409684590592L, 152064);
    if (paramj == null)
    {
      GMTrace.o(20409684590592L, 152064);
      return;
    }
    tp localtp = paramj.field_favProto.tLX;
    if ((localtp != null) && (!bg.nm(localtp.ulu)))
    {
      GMTrace.o(20409684590592L, 152064);
      return;
    }
    if (paramj.field_type == 18)
    {
      if (paramj.field_favProto.ulz.eDi != 6) {
        break label112;
      }
      b(paramj, false);
    }
    for (;;)
    {
      com.tencent.mm.plugin.favorite.h.axB().a(paramj, new String[] { "localId" });
      GMTrace.o(20409684590592L, 152064);
      return;
      label112:
      b(paramj, true);
    }
  }
  
  public static String x(Context paramContext, int paramInt)
  {
    GMTrace.i(6291456000000L, 46875);
    if (paramContext == null)
    {
      GMTrace.o(6291456000000L, 46875);
      return "";
    }
    switch (paramInt)
    {
    default: 
      GMTrace.o(6291456000000L, 46875);
      return "";
    case 2: 
      paramContext = paramContext.getString(R.l.duP);
      GMTrace.o(6291456000000L, 46875);
      return paramContext;
    case 7: 
      paramContext = paramContext.getString(R.l.duR);
      GMTrace.o(6291456000000L, 46875);
      return paramContext;
    case 6: 
      paramContext = paramContext.getString(R.l.duQ);
      GMTrace.o(6291456000000L, 46875);
      return paramContext;
    case 1: 
      paramContext = paramContext.getString(R.l.duN);
      GMTrace.o(6291456000000L, 46875);
      return paramContext;
    case 4: 
      paramContext = paramContext.getString(R.l.duU);
      GMTrace.o(6291456000000L, 46875);
      return paramContext;
    case 5: 
      paramContext = paramContext.getString(R.l.duT);
      GMTrace.o(6291456000000L, 46875);
      return paramContext;
    case 3: 
      paramContext = paramContext.getString(R.l.duV);
      GMTrace.o(6291456000000L, 46875);
      return paramContext;
    }
    paramContext = paramContext.getString(R.l.duO);
    GMTrace.o(6291456000000L, 46875);
    return paramContext;
  }
  
  public static void x(j paramj)
  {
    for (;;)
    {
      try
      {
        GMTrace.i(20409953026048L, 152066);
        if ((paramj == null) || (paramj.field_type != 18))
        {
          GMTrace.o(20409953026048L, 152066);
          return;
        }
        if (!lcc.containsKey(Long.valueOf(paramj.field_localId)))
        {
          GMTrace.o(20409953026048L, 152066);
          continue;
        }
        if (lcc.get(Long.valueOf(paramj.field_localId)) == null) {
          break label110;
        }
      }
      finally {}
      if (((ArrayList)lcc.get(Long.valueOf(paramj.field_localId))).size() == 0)
      {
        label110:
        GMTrace.o(20409953026048L, 152066);
      }
      else
      {
        String str = cu(paramj.field_localId);
        w.i("MicroMsg.FavoriteLogic", "checkUpdateSnsNotePostXml, resend favlocal id:%d,xml:%s", new Object[] { Long.valueOf(paramj.field_localId), str });
        nl localnl = new nl();
        localnl.eSy.eSz = ((ArrayList)lcc.get(Long.valueOf(paramj.field_localId)));
        localnl.eSy.eSA = str;
        com.tencent.mm.sdk.b.a.vgX.m(localnl);
        lcc.remove(Long.valueOf(paramj.field_localId));
        GMTrace.o(20409953026048L, 152066);
      }
    }
  }
  
  public static String xO(String paramString)
  {
    GMTrace.i(6284745113600L, 46825);
    if (bg.nm(paramString))
    {
      GMTrace.o(6284745113600L, 46825);
      return null;
    }
    paramString = new File(axY() + g.n(paramString.getBytes()));
    if (paramString.exists())
    {
      paramString = paramString.getAbsolutePath();
      GMTrace.o(6284745113600L, 46825);
      return paramString;
    }
    GMTrace.o(6284745113600L, 46825);
    return null;
  }
  
  private static File xP(String paramString)
  {
    GMTrace.i(6286758379520L, 46840);
    int i = paramString.hashCode();
    at.AR();
    paramString = new File(String.format("%s/%s/%d/", new Object[] { com.tencent.mm.y.c.zo(), "favorite", Integer.valueOf(i & 0xFF) }));
    if ((!paramString.exists()) || (!paramString.isDirectory())) {
      paramString.mkdirs();
    }
    GMTrace.o(6286758379520L, 46840);
    return paramString;
  }
  
  public static String xQ(String paramString)
  {
    GMTrace.i(6286892597248L, 46841);
    paramString = paramString + "_t";
    GMTrace.o(6286892597248L, 46841);
    return paramString;
  }
  
  public static boolean xR(String paramString)
  {
    GMTrace.i(6287026814976L, 46842);
    if (bg.nm(paramString))
    {
      GMTrace.o(6287026814976L, 46842);
      return false;
    }
    boolean bool = paramString.endsWith("_t");
    GMTrace.o(6287026814976L, 46842);
    return bool;
  }
  
  public static int xS(String paramString)
  {
    GMTrace.i(6289174298624L, 46858);
    if ((!bg.nm(paramString)) && (paramString.equals("speex")))
    {
      GMTrace.o(6289174298624L, 46858);
      return 1;
    }
    if ((!bg.nm(paramString)) && (paramString.equals("silk")))
    {
      GMTrace.o(6289174298624L, 46858);
      return 2;
    }
    GMTrace.o(6289174298624L, 46858);
    return 0;
  }
  
  public static j xT(String paramString)
  {
    GMTrace.i(6292932395008L, 46886);
    j localj = new j();
    localj.field_localId = -1L;
    localj.field_id = -1;
    localj.field_xml = paramString;
    localj.field_type = 18;
    localj.xF(paramString);
    GMTrace.o(6292932395008L, 46886);
    return localj;
  }
  
  private static j xU(String paramString)
  {
    GMTrace.i(20409013501952L, 152059);
    if ((paramString == null) || (paramString.equals("")))
    {
      w.e("MicroMsg.FavoriteLogic", "parseSnsNoteInfoXml but xml is null");
      GMTrace.o(20409013501952L, 152059);
      return null;
    }
    paramString = paramString.replace("cdndataurl", "cdn_dataurl").replace("cdndatakey", "cdn_datakey").replace("cdnthumburl", "cdn_thumburl").replace("cdnthumbkey", "cdn_thumbkey").replace("datasize", "fullsize").replace("thumbsize", "thumbfullsize").replace("sourcename", "datasrcname").replace("sourcetime", "datasrctime").replace("streamlowbandurl", "stream_lowbandurl").replace("streamdataurl", "stream_dataurl").replace("streamweburl", "stream_weburl");
    if (!paramString.startsWith("<noteinfo>")) {
      paramString = "<noteinfo>" + paramString + "</noteinfo>";
    }
    for (;;)
    {
      Map localMap = bh.q(paramString, "noteinfo");
      if (localMap == null)
      {
        w.e("MicroMsg.FavoriteLogic", "parseSnsNoteInfoXml, FavItemInfo maps null");
        GMTrace.o(20409013501952L, 152059);
        return null;
      }
      j localj = new j();
      try
      {
        localj.field_favProto = new tt();
        localj.field_type = 18;
        Object localObject = (String)localMap.get(".noteinfo.edittime");
        localj.field_favProto.eD(bg.getLong((String)localObject, 0L));
        localObject = new tp();
        ((tp)localObject).ulu = ((String)localMap.get(".noteinfo.noteeditor"));
        ((tp)localObject).ult = ((String)localMap.get(".noteinfo.noteauthor"));
        localj.field_favProto.a((tp)localObject);
        localj.field_localId = bg.getLong((String)localMap.get(".noteinfo.favlocalid"), System.currentTimeMillis());
        n.a(paramString, localj.field_favProto);
        GMTrace.o(20409013501952L, 152059);
        return localj;
      }
      catch (Exception paramString)
      {
        w.printErrStackTrace("MicroMsg.FavoriteLogic", paramString, "", new Object[0]);
        w.e("MicroMsg.FavoriteLogic", "parseSnsNoteInfoXml , FavItemInfo exception:+%s", new Object[] { paramString.toString() });
        GMTrace.o(20409013501952L, 152059);
        return null;
      }
    }
  }
  
  private static boolean y(j paramj)
  {
    GMTrace.i(20410087243776L, 152067);
    if (paramj == null)
    {
      GMTrace.o(20410087243776L, 152067);
      return false;
    }
    paramj = paramj.field_favProto.ulB.iterator();
    th localth;
    do
    {
      if (!paramj.hasNext()) {
        break;
      }
      localth = (th)paramj.next();
    } while (((localth.aGU != 8) && (localth.aGU != 4) && (localth.aGU != 2) && (localth.aGU != 3)) || ((!bg.nm(localth.ujt)) && (!bg.nm(localth.ujv))));
    for (boolean bool = false;; bool = true)
    {
      GMTrace.o(20410087243776L, 152067);
      return bool;
    }
  }
  
  public static abstract interface a
  {
    public abstract boolean g(j paramj);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\b\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */