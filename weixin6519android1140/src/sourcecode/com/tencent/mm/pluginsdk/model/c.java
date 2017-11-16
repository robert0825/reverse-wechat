package com.tencent.mm.pluginsdk.model;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.media.ThumbnailUtils;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.cf.a;
import com.tencent.mm.g.a.ft;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.k.b;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.ti;
import com.tencent.mm.protocal.c.tm;
import com.tencent.mm.protocal.c.to;
import com.tencent.mm.protocal.c.ts;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.tw;
import com.tencent.mm.protocal.c.tz;
import com.tencent.mm.protocal.c.ud;
import com.tencent.mm.protocal.c.uf;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.MMNativeJpeg;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.snackbar.b.b;
import com.tencent.mm.ui.snackbar.b.c;
import com.tencent.mm.x.f.a;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class c
{
  private static Map<String, Integer> scq;
  public static boolean tmH;
  private static y<String, Bitmap> tmI;
  
  static
  {
    GMTrace.i(17442130624512L, 129954);
    tmH = true;
    tmI = new y(20);
    scq = new HashMap();
    HashMap localHashMap = new HashMap();
    scq = localHashMap;
    localHashMap.put("avi", Integer.valueOf(R.k.cJo));
    scq.put("m4v", Integer.valueOf(R.k.cJo));
    scq.put("vob", Integer.valueOf(R.k.cJo));
    scq.put("mpeg", Integer.valueOf(R.k.cJo));
    scq.put("mpe", Integer.valueOf(R.k.cJo));
    scq.put("asx", Integer.valueOf(R.k.cJo));
    scq.put("asf", Integer.valueOf(R.k.cJo));
    scq.put("f4v", Integer.valueOf(R.k.cJo));
    scq.put("flv", Integer.valueOf(R.k.cJo));
    scq.put("mkv", Integer.valueOf(R.k.cJo));
    scq.put("wmv", Integer.valueOf(R.k.cJo));
    scq.put("wm", Integer.valueOf(R.k.cJo));
    scq.put("3gp", Integer.valueOf(R.k.cJo));
    scq.put("mp4", Integer.valueOf(R.k.cJo));
    scq.put("rmvb", Integer.valueOf(R.k.cJo));
    scq.put("rm", Integer.valueOf(R.k.cJo));
    scq.put("ra", Integer.valueOf(R.k.cJo));
    scq.put("ram", Integer.valueOf(R.k.cJo));
    scq.put("mp3pro", Integer.valueOf(R.k.cJd));
    scq.put("vqf", Integer.valueOf(R.k.cJd));
    scq.put("cd", Integer.valueOf(R.k.cJd));
    scq.put("md", Integer.valueOf(R.k.cJd));
    scq.put("mod", Integer.valueOf(R.k.cJd));
    scq.put("vorbis", Integer.valueOf(R.k.cJd));
    scq.put("au", Integer.valueOf(R.k.cJd));
    scq.put("amr", Integer.valueOf(R.k.cJd));
    scq.put("silk", Integer.valueOf(R.k.cJd));
    scq.put("wma", Integer.valueOf(R.k.cJd));
    scq.put("mmf", Integer.valueOf(R.k.cJd));
    scq.put("mid", Integer.valueOf(R.k.cJd));
    scq.put("midi", Integer.valueOf(R.k.cJd));
    scq.put("mp3", Integer.valueOf(R.k.cJd));
    scq.put("aac", Integer.valueOf(R.k.cJd));
    scq.put("ape", Integer.valueOf(R.k.cJd));
    scq.put("aiff", Integer.valueOf(R.k.cJd));
    scq.put("aif", Integer.valueOf(R.k.cJd));
    scq.put("jfif", Integer.valueOf(R.g.aTK));
    scq.put("tiff", Integer.valueOf(R.g.aTK));
    scq.put("tif", Integer.valueOf(R.g.aTK));
    scq.put("jpe", Integer.valueOf(R.g.aTK));
    scq.put("dib", Integer.valueOf(R.g.aTK));
    scq.put("jpeg", Integer.valueOf(R.g.aTK));
    scq.put("jpg", Integer.valueOf(R.g.aTK));
    scq.put("png", Integer.valueOf(R.g.aTK));
    scq.put("bmp", Integer.valueOf(R.g.aTK));
    scq.put("gif", Integer.valueOf(R.g.aTK));
    scq.put("rar", Integer.valueOf(R.k.cMn));
    scq.put("zip", Integer.valueOf(R.k.cMn));
    scq.put("7z", Integer.valueOf(R.k.cMn));
    scq.put("iso", Integer.valueOf(R.k.cMn));
    scq.put("cab", Integer.valueOf(R.k.cMn));
    scq.put("doc", Integer.valueOf(R.k.cMl));
    scq.put("docx", Integer.valueOf(R.k.cMl));
    scq.put("ppt", Integer.valueOf(R.k.cMg));
    scq.put("pptx", Integer.valueOf(R.k.cMg));
    scq.put("xls", Integer.valueOf(R.k.cMm));
    scq.put("xlsx", Integer.valueOf(R.k.cMm));
    scq.put("txt", Integer.valueOf(R.k.cMi));
    scq.put("rtf", Integer.valueOf(R.k.cMi));
    scq.put("pdf", Integer.valueOf(R.k.cMf));
    scq.put("unknown", Integer.valueOf(R.k.cMj));
    GMTrace.o(17442130624512L, 129954);
  }
  
  public static int Oh(String paramString)
  {
    GMTrace.i(17441727971328L, 129951);
    paramString = (Integer)scq.get(paramString);
    if (paramString == null)
    {
      i = ((Integer)scq.get("unknown")).intValue();
      GMTrace.o(17441727971328L, 129951);
      return i;
    }
    int i = paramString.intValue();
    GMTrace.o(17441727971328L, 129951);
    return i;
  }
  
  @TargetApi(8)
  public static Bitmap Oi(String paramString)
  {
    GMTrace.i(17441862189056L, 129952);
    Bitmap localBitmap = null;
    if (com.tencent.mm.compatible.util.d.et(8)) {
      localBitmap = ThumbnailUtils.createVideoThumbnail(paramString, 1);
    }
    GMTrace.o(17441862189056L, 129952);
    return localBitmap;
  }
  
  private static int a(cf paramcf, int paramInt)
  {
    int i = 1;
    int n = 0;
    GMTrace.i(764101525504L, 5693);
    th localth;
    if ((paramcf.eDv.eDx.ulB != null) && (paramcf.eDv.eDx.ulB.size() > 0))
    {
      localth = (th)paramcf.eDv.eDx.ulB.getLast();
      if (paramInt > 0) {}
    }
    switch (paramInt)
    {
    default: 
      localth.zT(0);
      if ((paramcf.eDv.eDx.ulB == null) || (paramcf.eDv.eDx.ulB.size() == 0)) {
        paramcf.eDv.eDB = paramInt;
      }
      break;
    }
    while (paramcf.eDv.eDB == -9)
    {
      GMTrace.o(764101525504L, 5693);
      return paramInt;
      localth.zT(1);
      localth.Qu(null);
      break;
      localth.zT(2);
      localth.Qu(null);
      break;
    }
    int m = i;
    if (paramInt <= 0) {
      if (paramcf.eDv.eDB <= 0) {
        break label483;
      }
    }
    label483:
    for (m = i;; m = 0)
    {
      int k = 0;
      int j = 0;
      i = 0;
      if (n < paramcf.eDv.eDx.ulB.size())
      {
        int i1;
        switch (((th)paramcf.eDv.eDx.ulB.get(n)).ukB)
        {
        default: 
          i1 = k;
          k = i;
          i = i1;
        }
        for (;;)
        {
          n += 1;
          i1 = k;
          k = i;
          i = i1;
          break;
          i1 = k + 1;
          k = i;
          i = i1;
          continue;
          j += 1;
          i1 = i;
          i = k;
          k = i1;
          continue;
          i1 = i + 1;
          i = k;
          k = i1;
        }
      }
      if (m > 0)
      {
        if ((j > 0) || (k > 0))
        {
          paramcf.eDv.eDB = -9;
          break;
        }
        paramcf.eDv.eDB = paramInt;
        break;
      }
      if (j > 0)
      {
        if (k > 0)
        {
          paramcf.eDv.eDB = -8;
          break;
        }
        if (i == 0)
        {
          paramcf.eDv.eDB = -5;
          break;
        }
        if (i <= 0) {
          break;
        }
        paramcf.eDv.eDB = -7;
        break;
      }
      if (k <= 0) {
        break;
      }
      if (i == 0)
      {
        paramcf.eDv.eDB = -4;
        break;
      }
      if (i <= 0) {
        break;
      }
      paramcf.eDv.eDB = -6;
      break;
    }
  }
  
  public static int a(au paramau, cf paramcf, boolean paramBoolean)
  {
    GMTrace.i(763967307776L, 5692);
    w.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo msg type is %d", new Object[] { Integer.valueOf(paramau.field_type) });
    int i;
    if ((!paramBoolean) && (paramcf.eDv.eDB > 0))
    {
      w.i("MicroMsg.FavExportLogic", "(!result)&&(favoriteEvent.data.errorType > FavExportLogic.KEY_FAV_PARA_NO_ERROR)");
      i = a(paramcf, paramcf.eDv.eDB);
      GMTrace.o(763967307776L, 5692);
      return i;
    }
    if ((paramcf.eDv.type == 4) || (paramcf.eDv.type == 8) || (paramcf.eDv.type == 16) || (paramcf.eDv.type == 2)) {}
    for (paramBoolean = false;; paramBoolean = true)
    {
      boolean bool = paramBoolean;
      Object localObject;
      if (paramcf.eDv.type == 14)
      {
        bool = paramBoolean;
        if (paramcf.eDv.eDx.ulB.size() > 0)
        {
          localObject = (th)paramcf.eDv.eDx.ulB.getLast();
          if ((((th)localObject).aGU != 4) && (((th)localObject).aGU != 8) && (((th)localObject).aGU != 15))
          {
            bool = paramBoolean;
            if (((th)localObject).aGU != 2) {}
          }
          else
          {
            bool = false;
          }
        }
      }
      w.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo msg type skipCheck %B", new Object[] { Boolean.valueOf(bool) });
      if (bool)
      {
        i = a(paramcf, 0);
        GMTrace.o(763967307776L, 5692);
        return i;
      }
      if (paramcf.eDv.eDx == null)
      {
        i = a(paramcf, -1);
        GMTrace.o(763967307776L, 5692);
        return i;
      }
      if (paramcf.eDv.eDx.ulB == null)
      {
        i = a(paramcf, -1);
        GMTrace.o(763967307776L, 5692);
        return i;
      }
      if (System.currentTimeMillis() - paramau.field_createTime > 259200000L) {}
      for (paramBoolean = true;; paramBoolean = false)
      {
        w.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo isOverThreeDays %B", new Object[] { Boolean.valueOf(paramBoolean) });
        if (1 <= paramcf.eDv.eDx.ulB.size()) {}
        for (localObject = ((th)paramcf.eDv.eDx.ulB.getLast()).ujR;; localObject = "")
        {
          if (paramBoolean)
          {
            if ((!bg.nm((String)localObject)) && (e.aZ((String)localObject))) {
              break label633;
            }
            if ((paramau != null) && ((paramau.field_type == 43) || (paramau.field_type == 44) || (paramau.field_type == 62)))
            {
              localObject = t.mw(paramau.field_imgPath);
              if ((localObject != null) && (((r)localObject).hcC == -1))
              {
                localObject = ((r)localObject).Ns();
                if (!e.aZ((String)localObject)) {}
              }
            }
            while (bg.nm((String)localObject))
            {
              i = a(paramcf, -4);
              GMTrace.o(763967307776L, 5692);
              return i;
              localObject = null;
            }
            ((th)paramcf.eDv.eDx.ulB.getLast()).Qu((String)localObject);
          }
          label633:
          for (;;)
          {
            if (a(paramau, paramcf, (String)localObject, true))
            {
              i = a(paramcf, -5);
              GMTrace.o(763967307776L, 5692);
              return i;
            }
            w.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  isOverThreeDays true not big not expired");
            do
            {
              w.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  fav data is normal");
              i = a(paramcf, 0);
              GMTrace.o(763967307776L, 5692);
              return i;
            } while (!a(paramau, paramcf, (String)localObject, false));
            i = a(paramcf, -5);
            GMTrace.o(763967307776L, 5692);
            return i;
          }
        }
      }
    }
  }
  
  public static tm a(int paramInt, tt paramtt, ud paramud)
  {
    GMTrace.i(763430436864L, 5688);
    if (paramtt == null)
    {
      w.w("MicroMsg.FavExportLogic", "proto item is null");
      GMTrace.o(763430436864L, 5688);
      return null;
    }
    tm localtm = new tm();
    tw localtw = paramtt.ulz;
    if (localtw != null)
    {
      localtm.eMI = localtw.eMI;
      localtm.ulm = localtw.ulb;
      localtm.appId = localtw.appId;
      localtm.eAr = localtw.eAr;
    }
    if (paramud != null)
    {
      if (paramud.ulO != null) {
        localtm.uln.addAll(paramud.ulO);
      }
      if (paramud.ulP != null) {
        localtm.uln.addAll(paramud.ulP);
      }
    }
    localtm.eRx = paramtt;
    localtm.type = paramInt;
    switch (paramInt)
    {
    case 3: 
    case 9: 
    case 13: 
    case 16: 
    case 17: 
    default: 
      w.w("MicroMsg.FavExportLogic", "unknown type %d", new Object[] { Integer.valueOf(paramInt) });
      GMTrace.o(763430436864L, 5688);
      return localtm;
    case 1: 
      localtm.title = "";
      localtm.desc = paramtt.desc;
      GMTrace.o(763430436864L, 5688);
      return localtm;
    case 4: 
      if ((paramtt.ulB != null) && (!paramtt.ulB.isEmpty())) {
        localtm.title = ((th)paramtt.ulB.get(0)).title;
      }
      GMTrace.o(763430436864L, 5688);
      return localtm;
    case 5: 
      if (paramtt.ukJ != null)
      {
        localtm.title = paramtt.ukJ.title;
        localtm.desc = paramtt.ukJ.umf;
      }
      if ((bg.nm(localtm.title)) && (paramtt.ulB != null) && (!paramtt.ulB.isEmpty())) {
        localtm.title = ((th)paramtt.ulB.get(0)).title;
      }
      if ((bg.nm(localtm.desc)) && (localtw != null)) {
        localtm.desc = localtw.gVf;
      }
      GMTrace.o(763430436864L, 5688);
      return localtm;
    case 6: 
      localtm.title = paramtt.hLO;
      if (bg.nm(localtm.title)) {
        if (paramtt.ukH != null)
        {
          localtm.title = paramtt.ukH.eQm;
          localtm.desc = paramtt.ukH.label;
        }
      }
      for (;;)
      {
        GMTrace.o(763430436864L, 5688);
        return localtm;
        if (paramtt.ukH != null) {
          localtm.desc = paramtt.ukH.eQm;
        }
      }
    case 2: 
      if ((paramtt.ulB != null) && (paramtt.ulB.size() > 0)) {
        localtm.title = ((th)paramtt.ulB.get(0)).title;
      }
      GMTrace.o(763430436864L, 5688);
      return localtm;
    case 7: 
      if ((paramtt.ulB != null) && (!paramtt.ulB.isEmpty()))
      {
        localtm.title = ((th)paramtt.ulB.get(0)).title;
        localtm.desc = ((th)paramtt.ulB.get(0)).desc;
      }
      GMTrace.o(763430436864L, 5688);
      return localtm;
    case 8: 
      localtm.title = paramtt.title;
      if ((bg.nm(localtm.title)) && (paramtt.ulB != null) && (!paramtt.ulB.isEmpty())) {
        localtm.title = ((th)paramtt.ulB.get(0)).title;
      }
      GMTrace.o(763430436864L, 5688);
      return localtm;
    case 10: 
    case 11: 
      if (paramtt.ukL != null)
      {
        localtm.title = paramtt.ukL.title;
        localtm.desc = paramtt.ukL.desc;
      }
      GMTrace.o(763430436864L, 5688);
      return localtm;
    case 12: 
    case 15: 
      if (paramtt.ukN != null)
      {
        localtm.title = paramtt.ukN.title;
        localtm.desc = paramtt.ukN.desc;
      }
      GMTrace.o(763430436864L, 5688);
      return localtm;
    }
    paramtt = paramtt.ulB;
    if (paramtt == null)
    {
      GMTrace.o(763430436864L, 5688);
      return null;
    }
    paramtt = paramtt.iterator();
    while (paramtt.hasNext())
    {
      paramud = (th)paramtt.next();
      if (1 == paramud.aGU) {
        localtm.title = paramud.desc;
      }
    }
    GMTrace.o(763430436864L, 5688);
    return localtm;
  }
  
  public static void a(int paramInt1, int paramInt2, int paramInt3, Activity paramActivity, final Fragment paramFragment, final b.c paramc, final DialogInterface.OnClickListener paramOnClickListener, final b.b paramb)
  {
    GMTrace.i(763833090048L, 5691);
    if ((paramActivity == null) && (paramFragment == null))
    {
      w.e("MicroMsg.FavExportLogic", "handleErrorType activity = null && fragment = null");
      GMTrace.o(763833090048L, 5691);
      return;
    }
    if (paramb == null) {}
    for (final Object localObject1 = new b.b()
        {
          public final void aEW()
          {
            GMTrace.i(17440788447232L, 129944);
            ft localft = new ft();
            localft.eIo.type = 35;
            com.tencent.mm.sdk.b.a.vgX.m(localft);
            GMTrace.o(17440788447232L, 129944);
          }
        };; localObject1 = paramb)
    {
      if (paramInt2 == 0)
      {
        if (paramFragment != null)
        {
          com.tencent.mm.ui.snackbar.a.a(paramInt3, paramFragment, paramFragment.getString(R.l.duh), paramFragment.getString(R.l.dsR), (b.b)localObject1, paramc);
          GMTrace.o(763833090048L, 5691);
          return;
        }
        if (paramActivity != null)
        {
          com.tencent.mm.ui.snackbar.a.a(paramInt3, paramActivity, paramActivity.getString(R.l.duh), paramActivity.getString(R.l.dsR), (b.b)localObject1, paramc);
          GMTrace.o(763833090048L, 5691);
        }
      }
      else
      {
        if (paramActivity != null) {
          break label668;
        }
      }
      label483:
      label668:
      for (paramb = paramFragment.aG();; paramb = paramActivity)
      {
        switch (paramInt2)
        {
        case -3: 
        default: 
          h.a(paramb, paramInt2, 0, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(16686350598144L, 124323);
              if (this.tmJ != null) {
                this.tmJ.onClick(paramAnonymousDialogInterface, -1);
              }
              GMTrace.o(16686350598144L, 124323);
            }
          });
          GMTrace.o(763833090048L, 5691);
          return;
        case -2: 
          h.a(paramb, paramb.getString(R.l.dtw), paramb.getString(R.l.dtx), paramb.getString(R.l.dtz), paramb.getString(R.l.dis), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(16686082162688L, 124321);
              Intent localIntent = new Intent();
              localIntent.putExtra("key_enter_fav_cleanui_from", 3);
              com.tencent.mm.bj.d.b(this.val$context, "favorite", ".ui.FavCleanUI", localIntent);
              paramAnonymousDialogInterface.dismiss();
              if (paramOnClickListener != null) {
                paramOnClickListener.onClick(paramAnonymousDialogInterface, -2);
              }
              GMTrace.o(16686082162688L, 124321);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(16686887469056L, 124327);
              paramAnonymousDialogInterface.dismiss();
              if (this.tmK != null) {
                this.tmK.onClick(paramAnonymousDialogInterface, -1);
              }
              GMTrace.o(16686887469056L, 124327);
            }
          }, R.e.aPp);
          GMTrace.o(763833090048L, 5691);
          return;
        }
        Object localObject2;
        if (paramFragment == null)
        {
          localObject2 = paramb;
          if (paramInt2 != -4) {
            break label483;
          }
          switch (paramInt1)
          {
          default: 
            paramActivity = "";
          }
        }
        for (;;)
        {
          h.a((Context)localObject2, paramActivity, "", ((Context)localObject2).getString(R.l.dNH), ((Context)localObject2).getString(R.l.dis), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(16686619033600L, 124325);
              paramAnonymousDialogInterface.dismiss();
              if (this.tmK != null) {
                this.tmK.onClick(paramAnonymousDialogInterface, -2);
              }
              if (paramFragment != null)
              {
                com.tencent.mm.ui.snackbar.a.a(0, paramFragment, paramFragment.aG().getString(R.l.duh), paramFragment.aG().getString(R.l.dsR), localObject1, paramc);
                GMTrace.o(16686619033600L, 124325);
                return;
              }
              com.tencent.mm.ui.snackbar.a.a(0, paramb, paramb.getString(R.l.duh), paramb.getString(R.l.dsR), localObject1, paramc);
              GMTrace.o(16686619033600L, 124325);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(17441056882688L, 129946);
              paramAnonymousDialogInterface.dismiss();
              if (this.tmK != null) {
                this.tmK.onClick(paramAnonymousDialogInterface, -1);
              }
              GMTrace.o(17441056882688L, 129946);
            }
          }, R.e.aPp);
          GMTrace.o(763833090048L, 5691);
          return;
          localObject2 = paramFragment.aG();
          break;
          paramActivity = ((Context)localObject2).getString(R.l.dtq);
          continue;
          paramActivity = ((Context)localObject2).getString(R.l.dtp);
          continue;
          paramActivity = ((Context)localObject2).getString(R.l.dtr);
          continue;
          paramActivity = ((Context)localObject2).getString(R.l.dtF);
          continue;
          if (paramInt2 == -5)
          {
            if (paramInt1 != 14) {
              paramActivity = ((Context)localObject2).getString(R.l.dsS);
            } else {
              paramActivity = ((Context)localObject2).getString(R.l.dtE);
            }
          }
          else if (paramInt2 == -6)
          {
            paramActivity = ((Context)localObject2).getString(R.l.dtF);
          }
          else if (paramInt2 == -7)
          {
            paramActivity = ((Context)localObject2).getString(R.l.dtE);
          }
          else if (paramInt2 == -8)
          {
            paramActivity = ((Context)localObject2).getString(R.l.dtG);
          }
          else
          {
            if (paramInt2 == -9)
            {
              if (paramFragment != null)
              {
                com.tencent.mm.ui.snackbar.a.a(0, paramFragment, ((Context)localObject2).getString(R.l.duh), ((Context)localObject2).getString(R.l.dsR), (b.b)localObject1, paramc);
                GMTrace.o(763833090048L, 5691);
                return;
              }
              com.tencent.mm.ui.snackbar.a.a(0, paramb, ((Context)localObject2).getString(R.l.duh), ((Context)localObject2).getString(R.l.dsR), (b.b)localObject1, paramc);
              GMTrace.o(763833090048L, 5691);
              return;
            }
            paramActivity = ((Context)localObject2).getString(R.l.dtu);
          }
        }
      }
    }
  }
  
  public static void a(int paramInt1, int paramInt2, Activity paramActivity, b.b paramb)
  {
    GMTrace.i(763698872320L, 5690);
    a(-1, paramInt1, paramInt2, paramActivity, null, null, null, paramb);
    GMTrace.o(763698872320L, 5690);
  }
  
  private static boolean a(au paramau, cf paramcf, String paramString, boolean paramBoolean)
  {
    GMTrace.i(764235743232L, 5694);
    Object localObject;
    if (!bg.nm(paramString))
    {
      localObject = new File(paramString);
      if (((File)localObject).exists())
      {
        if (((File)localObject).length() > b.uc())
        {
          w.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  file is big");
          GMTrace.o(764235743232L, 5694);
          return true;
        }
        w.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  file not big");
      }
    }
    else
    {
      localObject = paramau.field_content;
      if (localObject == null) {
        break label270;
      }
    }
    label270:
    for (paramau = f.a.C((String)localObject, paramau.field_reserved);; paramau = null)
    {
      if (paramau != null)
      {
        if ((paramau.giz != 0) || (paramau.giv > b.uc()))
        {
          w.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  file is big");
          GMTrace.o(764235743232L, 5694);
          return true;
          if (paramBoolean) {
            break;
          }
          w.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  not download finish ！attachFile.exists()");
          ((th)paramcf.eDv.eDx.ulB.getLast()).Qu(null);
          break;
        }
        if ((!bg.nm(paramString)) && (e.aZ(paramString)) && (!paramBoolean))
        {
          long l = e.aY(paramString);
          if (paramau.giv > l)
          {
            w.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  not download finish content.attachlen > datasize");
            ((th)paramcf.eDv.eDx.ulB.getLast()).Qu(null);
          }
        }
      }
      if ((localObject == null) || (paramau == null)) {
        w.i("MicroMsg.FavExportLogic", "checkMsgLegalInfo  (xml == null ) ||(content == null)");
      }
      GMTrace.o(764235743232L, 5694);
      return false;
    }
  }
  
  public static Bitmap aO(String paramString, boolean paramBoolean)
  {
    boolean bool = true;
    GMTrace.i(17441593753600L, 129950);
    if (bg.nm(paramString))
    {
      GMTrace.o(17441593753600L, 129950);
      return null;
    }
    Object localObject = (Bitmap)tmI.get(paramString);
    if (localObject != null)
    {
      w.d("MicroMsg.FavExportLogic", "get bm from cache %s", new Object[] { paramString });
      GMTrace.o(17441593753600L, 129950);
      return (Bitmap)localObject;
    }
    if (paramBoolean)
    {
      GMTrace.o(17441593753600L, 129950);
      return null;
    }
    if (!e.aZ(paramString))
    {
      GMTrace.o(17441593753600L, 129950);
      return null;
    }
    w.d("MicroMsg.FavExportLogic", "get from cache fail, try to decode from file");
    localObject = new BitmapFactory.Options();
    ((BitmapFactory.Options)localObject).inJustDecodeBounds = true;
    Bitmap localBitmap = BitmapFactory.decodeFile(paramString, (BitmapFactory.Options)localObject);
    if (localBitmap != null)
    {
      w.i("MicroMsg.FavExportLogic", "bitmap recycle %s", new Object[] { localBitmap });
      localBitmap.recycle();
    }
    int j;
    if ((com.tencent.mm.sdk.platformtools.d.bh(((BitmapFactory.Options)localObject).outWidth, ((BitmapFactory.Options)localObject).outHeight)) && (((BitmapFactory.Options)localObject).outWidth > 480))
    {
      i = 1;
      if ((!com.tencent.mm.sdk.platformtools.d.bg(((BitmapFactory.Options)localObject).outWidth, ((BitmapFactory.Options)localObject).outHeight)) || (((BitmapFactory.Options)localObject).outHeight <= 480)) {
        break label272;
      }
      j = 1;
    }
    for (;;)
    {
      label227:
      if ((i != 0) || (j != 0))
      {
        i = ((BitmapFactory.Options)localObject).outHeight;
        j = ((BitmapFactory.Options)localObject).outWidth;
        for (;;)
        {
          if (j * i > 2764800)
          {
            j >>= 1;
            i >>= 1;
            continue;
            i = 0;
            break;
            label272:
            j = 0;
            break label227;
          }
        }
        j = Math.max(1, j);
        i = Math.max(1, i);
        w.w("MicroMsg.FavExportLogic", "fit long picture, beg %d*%d, after %d*%d", new Object[] { Integer.valueOf(((BitmapFactory.Options)localObject).outWidth), Integer.valueOf(((BitmapFactory.Options)localObject).outHeight), Integer.valueOf(j), Integer.valueOf(i) });
      }
    }
    int i = BackwardSupportUtil.ExifHelper.Rz(paramString);
    if ((MMNativeJpeg.IsJpegFile(paramString)) && (MMNativeJpeg.isProgressive(paramString)))
    {
      localObject = MMNativeJpeg.decodeAsBitmap(paramString);
      if (localObject == null)
      {
        paramBoolean = bool;
        w.i("MicroMsg.FavExportLogic", "Progressive jpeg, result isNull:%b", new Object[] { Boolean.valueOf(paramBoolean) });
      }
    }
    for (;;)
    {
      if (localObject != null) {
        break label445;
      }
      w.e("MicroMsg.FavExportLogic", "getSuitableBmp fail, temBmp is null, filePath = " + paramString);
      GMTrace.o(17441593753600L, 129950);
      return null;
      paramBoolean = false;
      break;
      localObject = com.tencent.mm.sdk.platformtools.d.cF(paramString, 0);
    }
    label445:
    localObject = com.tencent.mm.sdk.platformtools.d.b((Bitmap)localObject, i);
    tmI.put(paramString, localObject);
    GMTrace.o(17441593753600L, 129950);
    return (Bitmap)localObject;
  }
  
  public static void bJe()
  {
    GMTrace.i(17441996406784L, 129953);
    GMTrace.o(17441996406784L, 129953);
  }
  
  private static String eB(String paramString1, String paramString2)
  {
    GMTrace.i(763564654592L, 5689);
    if (bg.nm(paramString1))
    {
      GMTrace.o(763564654592L, 5689);
      return paramString2;
    }
    if (bg.nm(paramString2))
    {
      GMTrace.o(763564654592L, 5689);
      return paramString1;
    }
    paramString1 = paramString1 + "​" + paramString2;
    GMTrace.o(763564654592L, 5689);
    return paramString1;
  }
  
  public static String o(th paramth)
  {
    GMTrace.i(17441459535872L, 129949);
    ti localti = paramth.ukn;
    String str = "";
    switch (paramth.aGU)
    {
    case 2: 
    case 3: 
    case 7: 
    case 9: 
    default: 
      paramth = eB(eB("", localti.title), localti.desc);
    }
    for (;;)
    {
      GMTrace.o(17441459535872L, 129949);
      return paramth;
      paramth = eB("", paramth.desc);
      continue;
      paramth = str;
      if (localti.ukN != null)
      {
        paramth = eB("", localti.ukN.title);
        continue;
        paramth = str;
        if (localti.ukJ != null)
        {
          paramth = eB("", localti.ukJ.title);
          continue;
          str = eB("", localti.hLO);
          paramth = str;
          if (localti.ukH != null)
          {
            paramth = eB(eB(str, localti.ukH.eQm), localti.ukH.label);
            continue;
            paramth = str;
            if (localti.ukL != null)
            {
              paramth = eB(eB("", localti.ukL.title), localti.ukL.desc);
              continue;
              paramth = eB("", localti.title);
            }
          }
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */