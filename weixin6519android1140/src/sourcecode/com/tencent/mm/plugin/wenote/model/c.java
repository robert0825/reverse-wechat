package com.tencent.mm.plugin.wenote.model;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.ft;
import com.tencent.mm.g.a.ft.b;
import com.tencent.mm.g.a.km;
import com.tencent.mm.g.a.km.a;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.wenote.model.a.i;
import com.tencent.mm.plugin.wenote.model.a.j;
import com.tencent.mm.plugin.wenote.model.a.k;
import com.tencent.mm.plugin.wenote.model.a.l;
import com.tencent.mm.plugin.wenote.model.a.m;
import com.tencent.mm.plugin.wenote.model.a.n;
import com.tencent.mm.plugin.wenote.model.a.o;
import com.tencent.mm.plugin.wenote.model.a.q;
import com.tencent.mm.plugin.wenote.model.a.r;
import com.tencent.mm.plugin.wenote.model.a.s;
import com.tencent.mm.plugin.wenote.model.a.t;
import com.tencent.mm.plugin.wenote.model.a.u;
import com.tencent.mm.plugin.wenote.model.a.v;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.ti;
import com.tencent.mm.protocal.c.tj;
import com.tencent.mm.protocal.c.to;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;

public abstract class c
{
  public static String sbJ;
  public static HashMap<String, JSONArray> sbK;
  public static boolean sbN;
  public static String sbO;
  private static String sbP;
  private static String sbQ;
  public static String sbR;
  public static String sbS;
  public l sbC;
  public e sbD;
  public HashMap<String, v> sbE;
  public HashMap<String, String> sbF;
  public HashMap<String, n> sbG;
  public String sbH;
  public String sbI;
  public boolean sbL;
  public tt sbM;
  
  static
  {
    GMTrace.i(17250065055744L, 128523);
    sbJ = "";
    sbK = new HashMap();
    sbN = false;
    sbO = com.tencent.mm.bf.a.Op() + "/fav_fileicon_recording.png";
    sbP = com.tencent.mm.bf.a.Op() + "/ofm_file_icon.png";
    sbQ = com.tencent.mm.bf.a.Op() + "/app_attach_file_icon_pic.png";
    sbR = com.tencent.mm.bf.a.Op() + "/location_msg.png";
    sbS = com.tencent.mm.bf.a.Op() + "/note_fav_not_support.png";
    GMTrace.o(17250065055744L, 128523);
  }
  
  public c()
  {
    GMTrace.i(17247380701184L, 128503);
    this.sbC = null;
    this.sbE = new HashMap();
    this.sbF = new HashMap();
    this.sbG = new HashMap();
    this.sbH = "WeNote_0";
    this.sbI = "";
    this.sbL = false;
    this.sbM = new tt();
    GMTrace.o(17247380701184L, 128503);
  }
  
  public static tt a(String paramString, List<n> paramList, th paramth)
  {
    GMTrace.i(17249528184832L, 128519);
    LinkedList localLinkedList = new LinkedList();
    tt localtt = new tt();
    if (paramth != null) {
      localLinkedList.add(paramth);
    }
    for (;;)
    {
      paramString = paramList.iterator();
      for (;;)
      {
        if (!paramString.hasNext()) {
          break label922;
        }
        paramth = (n)paramString.next();
        if (paramth != null)
        {
          if (paramth.sdd == null) {
            break;
          }
          localLinkedList.add(paramth.sdd);
        }
      }
      if ((!bg.nm(paramString)) && (paramString.length() > 0))
      {
        paramString = com.tencent.mm.bf.a.Os();
        paramth = new th();
        paramth.zR(8);
        paramth.QD("WeNoteHtmlFile");
        paramth.kx(true);
        paramth.ey(com.tencent.mm.a.e.aY(paramString));
        paramth.Qq(".htm");
        localLinkedList.add(paramth);
        localObject1 = f.n(paramth);
        if (!FileOp.aZ((String)localObject1)) {
          FileOp.o(paramString, (String)localObject1);
        }
        paramth.Qu((String)localObject1);
      }
    }
    Object localObject1 = new th();
    Object localObject2 = new ti();
    Object localObject3 = new tj();
    ((tj)localObject3).zU(6);
    ((ti)localObject2).c((tj)localObject3);
    ((th)localObject1).a((ti)localObject2);
    switch (paramth.type)
    {
    }
    for (;;)
    {
      ((th)localObject1).QD(paramth.sde);
      localLinkedList.add(localObject1);
      break;
      ((th)localObject1).zR(2);
      localObject2 = (o)paramth;
      localObject3 = ((o)localObject2).sdg;
      ((th)localObject1).Qu((String)localObject3);
      if (!bg.nm(((o)paramth).lhq))
      {
        ((th)localObject1).Qt(paramth.lhq);
        ((th)localObject1).Qv(((o)localObject2).eOR);
      }
      for (;;)
      {
        ((th)localObject1).zR(2);
        break;
        ((th)localObject1).Qt(f.NA(localObject2.toString()));
        com.tencent.mm.sdk.platformtools.d.b((String)localObject3, 150, 150, Bitmap.CompressFormat.JPEG, 90, f.h((th)localObject1));
        ((th)localObject1).Qv(f.h((th)localObject1));
      }
      ((th)localObject1).zR(6);
      localObject2 = (r)paramth;
      ((th)localObject1).Qt(paramth.lhq);
      localObject3 = new to();
      ((to)localObject3).QP(((r)localObject2).gEy);
      ((to)localObject3).q(((r)localObject2).lat);
      ((to)localObject3).p(((r)localObject2).lng);
      ((to)localObject3).zV((int)((r)localObject2).sds);
      ((to)localObject3).QQ(((r)localObject2).mzo);
      ((th)localObject1).kw(true);
      ((th)localObject1).kx(true);
      ((th)localObject1).ukn.a((to)localObject3);
      continue;
      ((th)localObject1).zR(8);
      localObject2 = (t)paramth;
      ((th)localObject1).Qt(paramth.lhq);
      ((th)localObject1).Qu(((t)localObject2).eOR);
      ((th)localObject1).kx(true);
      ((th)localObject1).Qg(((t)localObject2).title);
      ((th)localObject1).Qh(((t)localObject2).content);
      ((th)localObject1).Qq(((t)localObject2).scT);
      continue;
      ((th)localObject1).zR(3);
      localObject2 = (u)paramth;
      ((th)localObject1).Qt(paramth.lhq);
      localObject3 = ((u)localObject2).eOR;
      if ((bg.nm((String)localObject3)) || (((String)localObject3).length() == 0)) {
        break;
      }
      ((th)localObject1).Qu((String)localObject3);
      ((th)localObject1).zQ(((u)localObject2).length);
      ((th)localObject1).kx(true);
      ((th)localObject1).Qq(((u)localObject2).scT);
      continue;
      ((th)localObject1).zR(4);
      localObject2 = (j)paramth;
      ((th)localObject1).Qt(paramth.lhq);
      ((th)localObject1).Qu(((j)localObject2).eOR);
      ((th)localObject1).Qv(((j)localObject2).eIy);
      localObject3 = com.tencent.mm.plugin.sight.base.d.GB(((j)localObject2).eOR);
      if (localObject3 != null) {
        ((th)localObject1).zQ(((com.tencent.mm.plugin.sight.base.a)localObject3).bgg());
      }
      for (;;)
      {
        ((th)localObject1).Qq(((j)localObject2).scT);
        break;
        ((th)localObject1).zQ(1);
      }
      if (!sbN)
      {
        com.tencent.mm.plugin.report.service.g.ork.i(14547, new Object[] { Integer.valueOf(6) });
        sbN = true;
      }
      ((th)localObject1).zR(1);
      ((th)localObject1).kw(true);
      ((th)localObject1).kx(true);
      localObject2 = (com.tencent.mm.plugin.wenote.model.a.h)paramth;
      ((th)localObject1).Qt(paramth.lhq);
      ((th)localObject1).Qh(com.tencent.mm.plugin.wenote.b.a.NL(((com.tencent.mm.plugin.wenote.model.a.h)localObject2).content));
      if ((!bg.nm(((th)localObject1).desc)) && (((th)localObject1).desc.length() > 1000)) {
        ((th)localObject1).Qh(((th)localObject1).desc.substring(0, 1000));
      }
    }
    label922:
    a(localLinkedList, paramList);
    localtt.av(localLinkedList);
    GMTrace.o(17249528184832L, 128519);
    return localtt;
  }
  
  private static void a(LinkedList<th> paramLinkedList, List<n> paramList)
  {
    GMTrace.i(20604434513920L, 153515);
    w.i("MicroMsg.WNNoteBase", "do WNNoteBase.setExtraInfo");
    if (paramLinkedList.size() > 0)
    {
      int j = paramLinkedList.size();
      int i = 0;
      if (i < j)
      {
        th localth = (th)paramLinkedList.get(i);
        String str1;
        Object localObject;
        if ((i > 0) && (bg.nm(localth.ujt)))
        {
          localth.Qt(f.NA(localth.toString()));
          str1 = null;
          localObject = str1;
          if (i - 1 >= 0)
          {
            localObject = str1;
            if (i - 1 < paramList.size())
            {
              localObject = str1;
              if (paramList.size() > 0) {
                localObject = (n)paramList.get(i - 1);
              }
            }
          }
          if ((localObject != null) && (((n)localObject).sde != null) && (((n)localObject).sde.equals(localth.ukv))) {
            ((n)localObject).lhq = localth.lhq;
          }
        }
        if ((i > 0) && (!bg.nm(localth.ujt)) && (!bg.nm(localth.ujv)))
        {
          localth.kw(true);
          localth.kx(true);
        }
        for (;;)
        {
          i += 1;
          break;
          w.i("MicroMsg.WNNoteBase", "datalist.get[%d].type = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(localth.aGU) });
          localObject = localth.ujR;
          String str2;
          if (FileOp.aZ((String)localObject))
          {
            w.i("MicroMsg.WNNoteBase", "datapath exist,pathname:%s", new Object[] { localObject });
            str1 = com.tencent.mm.a.g.bg((String)localObject);
            str2 = com.tencent.mm.a.g.bh((String)localObject);
            localth.Qr(str1);
            localth.Qs(str2);
            localth.ey(new File((String)localObject).length());
            str1 = f.n(localth);
            boolean bool = FileOp.aZ(str1);
            if ((!((String)localObject).equals(str1)) && (!bool) && (!localth.ukv.equals("WeNoteHtmlFile"))) {
              FileOp.o((String)localObject, str1);
            }
          }
          for (;;)
          {
            localObject = localth.ujT;
            if (!FileOp.aZ((String)localObject)) {
              break label518;
            }
            w.i("MicroMsg.WNNoteBase", "thumbPath exist,pathname:%s", new Object[] { localObject });
            str1 = com.tencent.mm.a.g.bg((String)localObject);
            str2 = com.tencent.mm.a.g.bh((String)localObject);
            localth.Qw(str1);
            localth.Qx(str2);
            localth.ez(new File((String)localObject).length());
            str1 = f.h(localth);
            if ((((String)localObject).equals(str1)) || (FileOp.aZ(str1))) {
              break;
            }
            FileOp.o((String)localObject, str1);
            break;
            w.e("MicroMsg.WNNoteBase", "datapath not exist, %s not exist!", new Object[] { localObject });
          }
          label518:
          w.e("MicroMsg.WNNoteBase", "thumbPath not exist, pathname:%s", new Object[] { localObject });
        }
      }
    }
    GMTrace.o(20604434513920L, 153515);
  }
  
  public abstract void Nv(String paramString);
  
  public abstract void Nw(String paramString);
  
  public abstract void Nx(String paramString);
  
  public void Ny(String paramString)
  {
    GMTrace.i(17249796620288L, 128521);
    GMTrace.o(17249796620288L, 128521);
  }
  
  public final th Nz(String paramString)
  {
    GMTrace.i(17249930838016L, 128522);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.WNNoteBase", "getFavDataItemByDataId, dataId is null");
      GMTrace.o(17249930838016L, 128522);
      return null;
    }
    String str = (String)this.sbF.get(paramString);
    if (bg.nm(str))
    {
      w.e("MicroMsg.WNNoteBase", "getFavDataItemByDataId, can not find editorId by dataId: %s", new Object[] { paramString });
      GMTrace.o(17249930838016L, 128522);
      return null;
    }
    paramString = (n)this.sbG.get(str);
    if (paramString == null)
    {
      w.e("MicroMsg.WNNoteBase", "getFavDataItemByDataId, can not find item by editorId: %s", new Object[] { str });
      GMTrace.o(17249930838016L, 128522);
      return null;
    }
    paramString = paramString.sdd;
    GMTrace.o(17249930838016L, 128522);
    return paramString;
  }
  
  public abstract void a(th paramth, String paramString);
  
  public final void b(km paramkm)
  {
    GMTrace.i(20604300296192L, 153514);
    if (paramkm.eOE == null)
    {
      w.e("MicroMsg.WNNoteBase", "setWNNativeCallbackOnClick, opertionevent.data is null, retutn");
      GMTrace.o(20604300296192L, 153514);
      return;
    }
    paramkm = paramkm.eOE.eOG;
    Object localObject = (n)this.sbG.get(paramkm);
    if (localObject == null)
    {
      w.e("MicroMsg.WNNoteBase", "setWNNativeCallbackOnClick, mEditorIdToDataItem.get(localEditorId) is null, retutn");
      GMTrace.o(20604300296192L, 153514);
      return;
    }
    w.i("MicroMsg.WNNoteBase", "setWNNativeCallbackOnClick, mEditorIdToDataItem.get(localEditorId) is %d", new Object[] { Integer.valueOf(((n)localObject).type) });
    switch (((n)localObject).type)
    {
    }
    for (;;)
    {
      GMTrace.o(20604300296192L, 153514);
      return;
      Nx(paramkm);
      GMTrace.o(20604300296192L, 153514);
      return;
      Nv(paramkm);
      GMTrace.o(20604300296192L, 153514);
      return;
      Nw(paramkm);
      GMTrace.o(20604300296192L, 153514);
      return;
      paramkm = (j)this.sbG.get(paramkm);
      if (!bg.nm(paramkm.eOR))
      {
        if (!com.tencent.mm.a.e.aZ(paramkm.eOR))
        {
          localObject = Nz(paramkm.lhq);
          if (localObject == null)
          {
            w.e("MicroMsg.WNNoteBase", "goToVideoPlay, favData is null");
            GMTrace.o(20604300296192L, 153514);
            return;
          }
          m((th)localObject);
        }
        localObject = new Intent();
        ((Intent)localObject).putExtra("key_detail_fav_path", paramkm.eOR);
        ((Intent)localObject).putExtra("key_detail_fav_thumb_path", paramkm.eIy);
        ((Intent)localObject).putExtra("key_detail_fav_video_duration", paramkm.duration);
        ((Intent)localObject).putExtra("key_detail_data_id", paramkm.lhq);
        ((Intent)localObject).putExtra("key_detail_statExtStr", "");
        ((Intent)localObject).putExtra("key_detail_fav_video_show_download_status", true);
        com.tencent.mm.bj.d.b(ab.getContext(), "favorite", ".ui.detail.FavoriteVideoPlayUI", (Intent)localObject);
      }
    }
  }
  
  public String bGN()
  {
    GMTrace.i(20604568731648L, 153516);
    GMTrace.o(20604568731648L, 153516);
    return "";
  }
  
  public final void bW(List<th> paramList)
  {
    GMTrace.i(20604166078464L, 153513);
    v localv = new v();
    Object localObject1 = null;
    Iterator localIterator = paramList.iterator();
    paramList = (List<th>)localObject1;
    label32:
    while (localIterator.hasNext())
    {
      Object localObject3 = (th)localIterator.next();
      n localn = new n();
      localn.sde = ((th)localObject3).ukv;
      if (((th)localObject3).aGU == 1) {
        localn.sde = "-1";
      }
      if (bg.nm(localn.sde))
      {
        w.e("MicroMsg.WNNoteBase", "Note: DataItem.htmlid is null");
        paramList = g((th)localObject3);
        if ((!bg.nm(paramList)) && (com.tencent.mm.a.e.aZ(paramList)))
        {
          f.s(this.sbC.eOS, paramList);
          GMTrace.o(20604166078464L, 153513);
          return;
        }
        m((th)localObject3);
        GMTrace.o(20604166078464L, 153513);
        return;
      }
      if (localn.sde.equals("WeNoteHtmlFile"))
      {
        localObject1 = g((th)localObject3);
        if ((!bg.nm((String)localObject1)) && (com.tencent.mm.a.e.aZ((String)localObject1))) {}
        for (;;)
        {
          try
          {
            localv.sdw = com.tencent.mm.plugin.wenote.b.b.NR((String)localObject1);
            localObject1 = com.tencent.mm.plugin.wenote.b.a.NK(localv.sdw);
            paramList = (List<th>)localObject1;
            try
            {
              w.i("MicroMsg.WNNoteBase", "local html file exist,dataid: %s", new Object[] { ((th)localObject3).lhq });
              sbK.containsKey(localv.sdw);
              w.i("MicroMsg.WNNoteBase", "dealWNNoteInfo,WeNoteHtmlFile, cdnurl is null :%B, cdnkey is null : %B ", new Object[] { Boolean.valueOf(bg.nm(((th)localObject3).ujt)), Boolean.valueOf(bg.nm(((th)localObject3).ujv)) });
            }
            catch (Exception localException1) {}
          }
          catch (Exception localException2)
          {
            int i;
            int j;
            Object localObject4;
            Object localObject2;
            Object localObject5;
            String str;
            continue;
          }
          w.printErrStackTrace("MicroMsg.WNNoteBase", localException1, "", new Object[0]);
          continue;
          m((th)localObject3);
          localv.sdy = true;
          w.i("MicroMsg.WNNoteBase", "local html file not exist,download htmlfile,dataid: %s", new Object[] { ((th)localObject3).lhq });
          this.sbF.put(((th)localObject3).lhq, localn.sde);
        }
      }
      if (!localn.sde.equals("-1"))
      {
        i = bg.getInt(localn.sde.substring(7), 0);
        j = bg.getInt(this.sbH.substring(7), 0);
        localObject4 = new StringBuilder("WeNote_");
        if (j <= i) {
          break label662;
        }
      }
      label662:
      for (localObject2 = String.valueOf(j);; localObject2 = String.valueOf(i))
      {
        this.sbH = ((String)localObject2);
        localn.lhq = ((th)localObject3).lhq;
        switch (((th)localObject3).aGU)
        {
        case 5: 
        case 7: 
        default: 
          if (((th)localObject3).aGU <= 0) {
            break label32;
          }
          localObject2 = new i();
          ((m)localObject2).sde = localn.sde;
          ((m)localObject2).type = 0;
          ((m)localObject2).lhq = localn.lhq;
          ((m)localObject2).sdd = ((th)localObject3);
          localObject3 = g((th)localObject3);
          ((m)localObject2).sdf = true;
          ((m)localObject2).eOR = ((String)localObject3);
          ((m)localObject2).sdc = sbS;
          ((m)localObject2).title = ab.getContext().getResources().getString(R.l.duz);
          ((m)localObject2).content = ab.getContext().getResources().getString(R.l.dui);
          localv.sdx.add(localObject2);
          this.sbG.put(localn.sde, localObject2);
          break label32;
        }
      }
      if (!bg.nm(((th)localObject3).desc)) {
        if ((localv.sdx.size() > 0) && (localv.sdx.get(localv.sdx.size() - 1) != null) && (((n)localv.sdx.get(localv.sdx.size() - 1)).sde.equals("-1")))
        {
          localObject2 = (s)localv.sdx.get(localv.sdx.size() - 1);
          ((s)localObject2).content += ((th)localObject3).desc;
        }
        else
        {
          localObject2 = new com.tencent.mm.plugin.wenote.model.a.h();
          ((s)localObject2).sde = localn.sde;
          ((s)localObject2).content = ((th)localObject3).desc;
          localv.sdx.add(localObject2);
          continue;
          localObject2 = new com.tencent.mm.plugin.wenote.model.a.e();
          ((o)localObject2).sde = localn.sde;
          ((o)localObject2).type = 2;
          ((o)localObject2).lhq = localn.lhq;
          ((o)localObject2).sdd = ((th)localObject3);
          localObject4 = g((th)localObject3);
          if (!bg.nm((String)localObject4))
          {
            localObject5 = (String)localObject4 + "_bigthumb";
            str = h((th)localObject3);
            if (!com.tencent.mm.a.e.aZ(str)) {
              a((th)localObject3, str);
            }
            if (com.tencent.mm.a.e.aZ((String)localObject4))
            {
              ((o)localObject2).sdf = true;
              com.tencent.mm.plugin.wenote.b.b.eA((String)localObject4, (String)localObject5);
            }
            for (;;)
            {
              ((o)localObject2).eOR = ((String)localObject5);
              ((o)localObject2).sdg = ((String)localObject4);
              localv.sdx.add(localObject2);
              this.sbG.put(localn.sde, localObject2);
              break;
              m((th)localObject3);
              ((o)localObject2).sdf = false;
              this.sbF.put(((th)localObject3).lhq, localn.sde);
            }
            localObject2 = new k();
            ((u)localObject2).sde = localn.sde;
            ((u)localObject2).type = 4;
            ((u)localObject2).lhq = localn.lhq;
            ((u)localObject2).sdd = ((th)localObject3);
            localObject4 = g((th)localObject3);
            if ((!bg.nm((String)localObject4)) && (com.tencent.mm.a.e.aZ((String)localObject4)))
            {
              ((u)localObject2).sdf = true;
              ((u)localObject2).sdc = sbO;
              ((u)localObject2).length = ((th)localObject3).duration;
            }
            for (;;)
            {
              ((u)localObject2).eOR = ((String)localObject4);
              ((u)localObject2).sdu = f.K(ab.getContext(), (int)f.aD(((th)localObject3).duration));
              ((u)localObject2).eIw = ((th)localObject3).duration;
              localObject4 = new ft();
              ((ft)localObject4).eIo.type = 17;
              ((ft)localObject4).eIo.eIq = ((th)localObject3);
              com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject4);
              ((u)localObject2).eIv = ((ft)localObject4).eIp.ret;
              ((u)localObject2).scT = ((th)localObject3).ujI;
              localv.sdx.add(localObject2);
              this.sbG.put(localn.sde, localObject2);
              break;
              m((th)localObject3);
              ((u)localObject2).sdf = false;
              ((u)localObject2).sdv = ab.getContext().getString(R.l.dvl);
              this.sbF.put(((th)localObject3).lhq, localn.sde);
            }
            localObject2 = new q();
            ((q)localObject2).eMl = ((float)((th)localObject3).ukn.ukH.lat);
            ((q)localObject2).gIN = ((float)((th)localObject3).ukn.ukH.lng);
            ((q)localObject2).eMn = ((th)localObject3).ukn.ukH.eMn;
            ((q)localObject2).sdp = ((th)localObject3).ukn.ukH.label;
            ((q)localObject2).sdq = ((th)localObject3).ukn.ukH.eQm;
            ((q)localObject2).sdr = ((th)localObject3).ukv;
            localObject4 = new com.tencent.mm.plugin.wenote.model.a.f();
            ((r)localObject4).sde = localn.sde;
            ((r)localObject4).type = 3;
            ((r)localObject4).lhq = localn.lhq;
            ((r)localObject4).sdd = ((th)localObject3);
            ((r)localObject4).sdf = true;
            ((r)localObject4).mzo = ((q)localObject2).sdq;
            ((r)localObject4).gEy = ((q)localObject2).sdp;
            ((r)localObject4).lat = ((q)localObject2).eMl;
            ((r)localObject4).lng = ((q)localObject2).gIN;
            ((r)localObject4).sds = ((q)localObject2).eMn;
            ((r)localObject4).eOR = "";
            localv.sdx.add(localObject4);
            this.sbG.put(localn.sde, localObject4);
            continue;
            localObject2 = new com.tencent.mm.plugin.wenote.model.a.c();
            ((t)localObject2).sde = localn.sde;
            ((t)localObject2).type = 5;
            ((t)localObject2).lhq = localn.lhq;
            ((t)localObject2).sdd = ((th)localObject3);
            localObject4 = g((th)localObject3);
            if ((!bg.nm((String)localObject4)) && (com.tencent.mm.a.e.aZ((String)localObject4)))
            {
              ((t)localObject2).sdf = true;
              ((t)localObject2).eOR = ((String)localObject4);
            }
            for (;;)
            {
              ((t)localObject2).sdc = h.NE(((th)localObject3).ujI);
              ((t)localObject2).title = ((th)localObject3).title;
              ((t)localObject2).content = ((th)localObject3).desc;
              ((t)localObject2).scT = ((th)localObject3).ujI;
              if (bg.nm(((t)localObject2).content)) {
                ((t)localObject2).content = f.ab((float)((th)localObject3).ujO);
              }
              localv.sdx.add(localObject2);
              this.sbG.put(localn.sde, localObject2);
              break;
              ((t)localObject2).sdf = false;
              this.sbF.put(((th)localObject3).lhq, localn.sde);
            }
            localObject2 = new j();
            ((j)localObject2).sde = localn.sde;
            ((j)localObject2).type = 6;
            ((j)localObject2).lhq = localn.lhq;
            ((j)localObject2).sdd = ((th)localObject3);
            ((j)localObject2).eIy = h((th)localObject3);
            localObject4 = g((th)localObject3);
            ((j)localObject2).eOR = ((String)localObject4);
            if ((!bg.nm(((j)localObject2).eIy)) && (!com.tencent.mm.a.e.aZ(((j)localObject2).eIy)))
            {
              if (!com.tencent.mm.a.e.aZ((String)localObject4)) {
                break label1959;
              }
              localObject5 = com.tencent.mm.pluginsdk.model.c.Oi((String)localObject4);
              if (localObject5 == null) {}
            }
            for (;;)
            {
              try
              {
                w.i("MicroMsg.WNNoteBase", "add fav service: create thumbpath bitmap, saveBitmapToImage ");
                com.tencent.mm.pluginsdk.l.e.a((Bitmap)localObject5, Bitmap.CompressFormat.JPEG, ((j)localObject2).eIy);
                if ((bg.nm((String)localObject4)) || (!com.tencent.mm.a.e.aZ((String)localObject4))) {
                  break label2010;
                }
                ((j)localObject2).sdf = true;
                localv.sdx.add(localObject2);
                this.sbG.put(localn.sde, localObject2);
              }
              catch (Exception localException3)
              {
                w.printErrStackTrace("MicroMsg.WNNoteBase", localException3, "", new Object[0]);
                continue;
              }
              label1959:
              a((th)localObject3, ((j)localObject2).eIy);
              this.sbF.put(((th)localObject3).lhq + "_t", localn.sde);
              continue;
              label2010:
              ((j)localObject2).sdf = false;
              this.sbF.put(((th)localObject3).lhq, localn.sde);
            }
          }
        }
      }
    }
    if ((paramList != null) && (paramList.size() > 0)) {
      h.a(localv.sdx, paramList, true);
    }
    if (this.sbC.eDr == -1L)
    {
      this.sbE.put(Long.toString(this.sbC.eOS), localv);
      GMTrace.o(20604166078464L, 153513);
      return;
    }
    this.sbE.put(Long.toString(this.sbC.eDr), localv);
    GMTrace.o(20604166078464L, 153513);
  }
  
  public abstract String g(th paramth);
  
  public abstract String h(th paramth);
  
  public abstract void m(th paramth);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */