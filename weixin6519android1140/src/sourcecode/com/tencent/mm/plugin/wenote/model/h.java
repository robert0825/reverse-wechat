package com.tencent.mm.plugin.wenote.model;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.cf.a;
import com.tencent.mm.g.a.kn;
import com.tencent.mm.g.a.qg;
import com.tencent.mm.g.a.qg.b;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tr;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class h
{
  public static String scg;
  public static String sch;
  public static String sci;
  public static String scj;
  public static String sck;
  public static String scl;
  public static String scm;
  public static String scn;
  public static String sco;
  public static String scp;
  private static Map<String, String> scq;
  private static String[] scr;
  private static String[] scs;
  private static LinkedList<tr> sct;
  private static String scu;
  
  static
  {
    GMTrace.i(17240267161600L, 128450);
    scg = com.tencent.mm.bf.a.Op() + "/fav_fileicon_video.png";
    sch = com.tencent.mm.bf.a.Op() + "/fav_fileicon_music.png";
    sci = com.tencent.mm.bf.a.Op() + "/fav_list_img_default.png";
    scj = com.tencent.mm.bf.a.Op() + "/fav_fileicon_zip.png";
    sck = com.tencent.mm.bf.a.Op() + "/fav_fileicon_word.png";
    scl = com.tencent.mm.bf.a.Op() + "/fav_fileicon_ppt.png";
    scm = com.tencent.mm.bf.a.Op() + "/fav_fileicon_xls.png";
    scn = com.tencent.mm.bf.a.Op() + "/fav_fileicon_txt.png";
    sco = com.tencent.mm.bf.a.Op() + "/fav_fileicon_pdf.png";
    scp = com.tencent.mm.bf.a.Op() + "/fav_fileicon_unknow.png";
    scq = new HashMap();
    HashMap localHashMap = new HashMap();
    scq = localHashMap;
    localHashMap.put("avi", scg);
    scq.put("m4v", scg);
    scq.put("vob", scg);
    scq.put("mpeg", scg);
    scq.put("mpe", scg);
    scq.put("asx", scg);
    scq.put("asf", scg);
    scq.put("f4v", scg);
    scq.put("flv", scg);
    scq.put("mkv", scg);
    scq.put("wmv", scg);
    scq.put("wm", scg);
    scq.put("3gp", scg);
    scq.put("mp4", scg);
    scq.put("rmvb", scg);
    scq.put("rm", scg);
    scq.put("ra", scg);
    scq.put("ram", scg);
    scq.put("mp3pro", sch);
    scq.put("vqf", sch);
    scq.put("cd", sch);
    scq.put("md", sch);
    scq.put("mod", sch);
    scq.put("vorbis", sch);
    scq.put("au", sch);
    scq.put("amr", sch);
    scq.put("silk", sch);
    scq.put("wma", sch);
    scq.put("mmf", sch);
    scq.put("mid", sch);
    scq.put("midi", sch);
    scq.put("mp3", sch);
    scq.put("aac", sch);
    scq.put("ape", sch);
    scq.put("aiff", sch);
    scq.put("aif", sch);
    scq.put("jfif", sci);
    scq.put("tiff", sci);
    scq.put("tif", sci);
    scq.put("jpe", sci);
    scq.put("dib", sci);
    scq.put("jpeg", sci);
    scq.put("jpg", sci);
    scq.put("png", sci);
    scq.put("bmp", sci);
    scq.put("gif", sci);
    scq.put("rar", scj);
    scq.put("zip", scj);
    scq.put("7z", scj);
    scq.put("iso", scj);
    scq.put("cab", scj);
    scq.put("doc", sck);
    scq.put("docx", sck);
    scq.put("ppt", scl);
    scq.put("pptx", scl);
    scq.put("xls", scm);
    scq.put("xlsx", scm);
    scq.put("txt", scn);
    scq.put("rtf", scn);
    scq.put("pdf", sco);
    scq.put("unknown", scp);
    scr = new String[] { "<div>", "<div/>", "<object", "<br", "</" };
    scs = new String[] { "＜div>", "＜div/>", "＜object", "＜br", "＜/" };
    sct = null;
    scu = "";
    GMTrace.o(17240267161600L, 128450);
  }
  
  public static void NC(String paramString)
  {
    GMTrace.i(17239193419776L, 128442);
    if (bg.nm(paramString))
    {
      GMTrace.o(17239193419776L, 128442);
      return;
    }
    File localFile = new File(paramString);
    if (!localFile.exists())
    {
      GMTrace.o(17239193419776L, 128442);
      return;
    }
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("type", 5);
      localJSONObject.put("downloaded", true);
      localJSONObject.put("title", localFile.getName());
      localJSONObject.put("content", f.ab(e.aY(paramString)));
      localJSONObject.put("iconPath", NE(e.bb(paramString)));
      localJSONObject.put("localPath", paramString);
      Y(localJSONObject);
      GMTrace.o(17239193419776L, 128442);
      return;
    }
    catch (JSONException paramString)
    {
      w.printErrStackTrace("MicroMsg.WNNoteLogic", paramString, "", new Object[0]);
      GMTrace.o(17239193419776L, 128442);
    }
  }
  
  public static void ND(String paramString)
  {
    GMTrace.i(17239327637504L, 128443);
    w.i("MicroMsg.WNNoteLogic", "insert location run");
    JSONObject localJSONObject = new JSONObject(paramString);
    w.i("MicroMsg.WNNoteLogic", "insert location run :after invoke");
    paramString = new com.tencent.mm.pluginsdk.location.b(-1L, (float)localJSONObject.getDouble("lat"), (float)localJSONObject.getDouble("lng"), localJSONObject.getInt("scale"), 1);
    paramString = com.tencent.mm.a.g.n(paramString.toString().getBytes());
    paramString = com.tencent.mm.bf.a.Or() + "/" + paramString + ".png";
    w.i("MicroMsg.WNNoteLogic", "insert location run :filepath:%s", new Object[] { paramString });
    if (FileOp.aZ(paramString)) {
      w.i("MicroMsg.WNNoteLogic", "insert location run :filepath:is exsit");
    }
    if (e.aZ(paramString)) {
      w.i("MicroMsg.WNNoteLogic", "fileExist suc, use getimagelocalpath");
    }
    for (;;)
    {
      localJSONObject.put("localPath", paramString);
      Y(localJSONObject);
      GMTrace.o(17239327637504L, 128443);
      return;
      w.e("MicroMsg.WNNoteLogic", "Temp file fileExist fail:%s ,use default file", new Object[] { paramString });
      paramString = c.sbR;
    }
  }
  
  public static String NE(String paramString)
  {
    GMTrace.i(17239730290688L, 128446);
    paramString = (String)scq.get(paramString);
    if (paramString == null)
    {
      paramString = (String)scq.get("unknown");
      GMTrace.o(17239730290688L, 128446);
      return paramString;
    }
    GMTrace.o(17239730290688L, 128446);
    return paramString;
  }
  
  private static void Y(JSONObject paramJSONObject)
  {
    GMTrace.i(17238924984320L, 128440);
    kn localkn = new kn();
    localkn.eOO.type = 6;
    localkn.eOO.eOQ = paramJSONObject.toString();
    localkn.eOO.eOG = "";
    com.tencent.mm.sdk.b.a.vgX.m(localkn);
    GMTrace.o(17238924984320L, 128440);
  }
  
  public static ArrayList<com.tencent.mm.plugin.wenote.model.a.b> a(Object paramObject, List<String> paramList, boolean paramBoolean)
  {
    GMTrace.i(17630974967808L, 131361);
    if (paramObject == null)
    {
      GMTrace.o(17630974967808L, 131361);
      return null;
    }
    paramObject = (ArrayList)paramObject;
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = ((ArrayList)paramObject).iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (com.tencent.mm.plugin.wenote.model.a.b)((Iterator)localObject1).next();
      if (((com.tencent.mm.plugin.wenote.model.a.b)localObject2).getType() != 1) {
        localArrayList.add(localObject2);
      }
    }
    int i = 0;
    if (i < paramList.size())
    {
      localObject1 = (String)paramList.get(i);
      if (((String)localObject1).trim().equals("<ThisisNoteNodeHrObj>"))
      {
        localObject1 = new com.tencent.mm.plugin.wenote.model.a.g();
        ((com.tencent.mm.plugin.wenote.model.a.g)localObject1).scH = false;
        ((com.tencent.mm.plugin.wenote.model.a.g)localObject1).scN = false;
        localArrayList.add(i, localObject1);
      }
      for (;;)
      {
        i += 1;
        break;
        if (!((String)localObject1).trim().equals("<ThisisNoteNodeObj>"))
        {
          localObject2 = new com.tencent.mm.plugin.wenote.model.a.h();
          ((com.tencent.mm.plugin.wenote.model.a.h)localObject2).content = ((String)localObject1);
          ((com.tencent.mm.plugin.wenote.model.a.h)localObject2).scH = false;
          ((com.tencent.mm.plugin.wenote.model.a.h)localObject2).scN = false;
          ((com.tencent.mm.plugin.wenote.model.a.h)localObject2).lhq = f.NA(localObject2.toString());
          if (i < localArrayList.size()) {
            localArrayList.add(i, localObject2);
          } else {
            localArrayList.add(localObject2);
          }
        }
      }
    }
    if (paramBoolean)
    {
      ((ArrayList)paramObject).clear();
      ((ArrayList)paramObject).addAll(localArrayList);
    }
    GMTrace.o(17630974967808L, 131361);
    return localArrayList;
  }
  
  public static void a(Context paramContext, Bitmap paramBitmap, boolean paramBoolean)
  {
    GMTrace.i(20602018594816L, 153497);
    String str = com.tencent.mm.platformtools.d.nd("jpg");
    if (paramBitmap != null) {}
    for (;;)
    {
      try
      {
        com.tencent.mm.sdk.platformtools.d.a(paramBitmap, 100, Bitmap.CompressFormat.JPEG, str, true);
        if (!bg.nm(str)) {
          com.tencent.mm.platformtools.d.b(str, paramContext);
        }
        paramContext = new File(str);
        if (paramContext.exists())
        {
          long l = paramContext.length() / 1024L;
          int j = 0;
          i = 0;
          if (paramBitmap != null)
          {
            j = paramBitmap.getWidth();
            i = paramBitmap.getHeight();
            paramBitmap.recycle();
          }
          paramContext = new tr();
          paramContext.ugy = com.tencent.mm.a.g.bg(str);
          paramContext = new a(0, 2, scu, sct, paramContext);
          at.wS().a(paramContext, 0);
          paramContext = com.tencent.mm.plugin.report.service.g.ork;
          if (!paramBoolean) {
            break label387;
          }
          k = 1;
          paramContext.i(14811, new Object[] { Integer.valueOf(j), Integer.valueOf(i), Long.valueOf(l), Integer.valueOf(0), Integer.valueOf(k) });
        }
        GMTrace.o(20602018594816L, 153497);
        return;
      }
      catch (Exception localException)
      {
        w.printErrStackTrace("MicroMsg.WNNoteLogic", localException, "", new Object[0]);
        w.e("MicroMsg.WNNoteLogic", "save image fail, saveBitmapToImage is null");
        localObject = com.tencent.mm.plugin.report.service.g.ork;
        if (!paramBoolean) {}
      }
      for (int i = 1;; i = 0)
      {
        ((com.tencent.mm.plugin.report.service.g)localObject).i(14811, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(3), Integer.valueOf(i) });
        localObject = "";
        break;
      }
      w.e("MicroMsg.WNNoteLogic", "save image fail, bigBitmap is null");
      Object localObject = com.tencent.mm.plugin.report.service.g.ork;
      if (paramBoolean) {}
      for (i = 1;; i = 0)
      {
        ((com.tencent.mm.plugin.report.service.g)localObject).i(14811, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(i) });
        localObject = "";
        break;
      }
      label387:
      int k = 0;
    }
  }
  
  public static void aJ(Context paramContext, String paramString)
  {
    GMTrace.i(17239596072960L, 128445);
    JSONObject localJSONObject = new JSONObject();
    int i;
    int j;
    if (!bg.nm(paramString))
    {
      i = (int)k.bGQ().duration;
      j = (int)f.aD(i);
    }
    try
    {
      localJSONObject.put("downloaded", true);
      localJSONObject.put("length", i);
      localJSONObject.put("lengthStr", f.K(paramContext, j));
      localJSONObject.put("iconPath", com.tencent.mm.bf.a.Op() + "/fav_fileicon_recording.png");
      localJSONObject.put("localPath", paramString);
    }
    catch (JSONException paramContext)
    {
      try
      {
        for (;;)
        {
          localJSONObject.put("type", 4);
          i = k.bGQ().scC;
          paramContext = new kn();
          paramContext.eOO.type = 6;
          paramContext.eOO.eOQ = localJSONObject.toString();
          paramContext.eOO.eOG = Integer.toString(i);
          com.tencent.mm.sdk.b.a.vgX.m(paramContext);
          GMTrace.o(17239596072960L, 128445);
          return;
          paramContext = paramContext;
          w.printErrStackTrace("MicroMsg.WNNoteLogic", paramContext, "", new Object[0]);
        }
      }
      catch (JSONException paramContext)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.WNNoteLogic", paramContext, "", new Object[0]);
        }
      }
    }
  }
  
  public static void aK(Context paramContext, String paramString)
  {
    GMTrace.i(20602152812544L, 153498);
    if (bg.nm(paramString))
    {
      w.e("MicroMsg.WNNoteLogic", "dofavnotelink , but localid is null or nil");
      GMTrace.o(20602152812544L, 153498);
      return;
    }
    cf localcf = new cf();
    qg localqg = new qg();
    localqg.eUS.eUV = paramString;
    localqg.eUS.eUW = localcf;
    localqg.eUS.url = "";
    com.tencent.mm.sdk.b.a.vgX.m(localqg);
    if (!localqg.eUT.eDb)
    {
      if (localcf.eDv.eDB == 0) {
        localcf.eDv.eDB = R.l.dtC;
      }
      com.tencent.mm.ui.base.h.h(paramContext, localcf.eDv.eDB, 0);
      GMTrace.o(20602152812544L, 153498);
      return;
    }
    localcf.eDv.activity = ((Activity)paramContext);
    localcf.eDv.eDC = 28;
    com.tencent.mm.sdk.b.a.vgX.m(localcf);
    GMTrace.o(20602152812544L, 153498);
  }
  
  public static void aa(ArrayList<String> paramArrayList)
  {
    GMTrace.i(17239461855232L, 128444);
    JSONObject localJSONObject = new JSONObject();
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      String str2 = (String)paramArrayList.next();
      try
      {
        localJSONObject.put("type", 2);
        localJSONObject.put("downloaded", true);
        String str1 = com.tencent.mm.plugin.wenote.b.b.ez(str2, "");
        str2 = com.tencent.mm.plugin.wenote.b.b.eA(str2, "");
        if (!bg.nm(str1))
        {
          boolean bool = bg.nm(str2);
          if (!bool) {}
        }
        else
        {
          GMTrace.o(17239461855232L, 128444);
          return;
        }
        localJSONObject.put("bigImagePath", str1);
        localJSONObject.put("localPath", str2);
        Y(localJSONObject);
      }
      catch (JSONException localJSONException)
      {
        w.printErrStackTrace("MicroMsg.WNNoteLogic", localJSONException, "", new Object[0]);
      }
    }
    GMTrace.o(17239461855232L, 128444);
  }
  
  public static void k(Context paramContext, String paramString, int paramInt)
  {
    GMTrace.i(17239059202048L, 128441);
    if (bg.nm(paramString))
    {
      GMTrace.o(17239059202048L, 128441);
      return;
    }
    if (!new File(paramString).exists())
    {
      GMTrace.o(17239059202048L, 128441);
      return;
    }
    paramString = new JSONObject();
    long l = paramInt;
    try
    {
      paramInt = (int)f.aD(l);
      paramString.put("type", 4);
      paramString.put("downloaded", true);
      paramString.put("length", paramInt);
      paramString.put("lengthStr", f.K(paramContext, paramInt));
      paramString.put("iconPath", com.tencent.mm.bf.a.Op() + "/fav_fileicon_recording.png");
      Y(paramString);
      GMTrace.o(17239059202048L, 128441);
      return;
    }
    catch (JSONException paramContext)
    {
      w.printErrStackTrace("MicroMsg.WNNoteLogic", paramContext, "", new Object[0]);
      GMTrace.o(17239059202048L, 128441);
    }
  }
  
  public static void yv(int paramInt)
  {
    GMTrace.i(20601884377088L, 153496);
    sct = null;
    scu = "";
    Object localObject2 = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().bHv();
    scu = (String)localObject2;
    Object localObject1 = new LinkedList();
    localObject2 = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo().NH((String)localObject2);
    if ((localObject2 == null) || (((tt)localObject2).ulB.size() <= 1)) {
      localObject1 = null;
    }
    for (;;)
    {
      sct = (LinkedList)localObject1;
      localObject1 = new a(paramInt, 1, scu, sct, null);
      at.wS().a((com.tencent.mm.ad.k)localObject1, 0);
      GMTrace.o(20601884377088L, 153496);
      return;
      localObject2 = ((tt)localObject2).ulB.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        th localth = (th)((Iterator)localObject2).next();
        Object localObject3 = f.n(localth);
        if ((!bg.nm((String)localObject3)) && (localth.aGU == 2) && (e.aZ((String)localObject3)))
        {
          localObject3 = new tr();
          ((tr)localObject3).ugy = localth.ujK;
          ((tr)localObject3).ugB = localth.ujv;
          ((tr)localObject3).ulv = localth.ujt;
          ((LinkedList)localObject1).add(localObject3);
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */