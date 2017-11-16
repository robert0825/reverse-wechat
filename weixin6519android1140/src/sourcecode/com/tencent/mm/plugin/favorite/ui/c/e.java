package com.tencent.mm.plugin.favorite.ui.c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.a.g;
import com.tencent.mm.g.a.km;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.r.a;
import com.tencent.mm.plugin.favorite.b.v;
import com.tencent.mm.plugin.favorite.b.v.a;
import com.tencent.mm.plugin.favorite.b.v.b;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.ui.FavImgGalleryUI;
import com.tencent.mm.plugin.favorite.ui.detail.FavoriteFileDetailUI;
import com.tencent.mm.plugin.favorite.ui.detail.FavoriteImgDetailUI;
import com.tencent.mm.plugin.favorite.ui.detail.FavoriteSightDetailUI;
import com.tencent.mm.plugin.favorite.ui.detail.FavoriteTextDetailUI;
import com.tencent.mm.plugin.favorite.ui.detail.FavoriteVideoPlayUI;
import com.tencent.mm.plugin.favorite.ui.detail.FavoriteVoiceDetailUI;
import com.tencent.mm.pluginsdk.ui.applet.e.a;
import com.tencent.mm.protocal.c.apv;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.ti;
import com.tencent.mm.protocal.c.tk;
import com.tencent.mm.protocal.c.to;
import com.tencent.mm.protocal.c.tp;
import com.tencent.mm.protocal.c.ts;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.tw;
import com.tencent.mm.protocal.c.tz;
import com.tencent.mm.protocal.c.ud;
import com.tencent.mm.protocal.c.uf;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au.a;
import com.tencent.mm.ui.base.i.a.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import com.tencent.mm.y.r;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class e
{
  private static int[] ljT;
  
  static
  {
    GMTrace.i(6425539510272L, 47874);
    ljT = new int[] { R.h.boe, R.h.bof, R.h.bog, R.h.boh, R.h.boi };
    GMTrace.o(6425539510272L, 47874);
  }
  
  private static String D(j paramj)
  {
    GMTrace.i(6423928897536L, 47862);
    if (paramj.field_favProto == null)
    {
      GMTrace.o(6423928897536L, 47862);
      return null;
    }
    if ((paramj.field_favProto.ukJ != null) && (!bg.nm(paramj.field_favProto.ukJ.canvasPageXml)))
    {
      paramj = paramj.field_favProto.ukJ.thumbUrl;
      GMTrace.o(6423928897536L, 47862);
      return paramj;
    }
    paramj = paramj.field_favProto.ulB;
    if ((paramj != null) && (paramj.size() == 1))
    {
      paramj = ((th)paramj.get(0)).giD;
      GMTrace.o(6423928897536L, 47862);
      return paramj;
    }
    GMTrace.o(6423928897536L, 47862);
    return null;
  }
  
  public static void a(Context paramContext, j paramj, boolean paramBoolean)
  {
    GMTrace.i(6423392026624L, 47858);
    Intent localIntent = new Intent();
    localIntent.putExtra("key_detail_info_id", paramj.field_localId);
    localIntent.putExtra("show_share", paramBoolean);
    com.tencent.mm.bj.d.b(paramContext, "record", ".ui.FavRecordDetailUI", localIntent);
    GMTrace.o(6423392026624L, 47858);
  }
  
  public static void a(e.a parama, final Context paramContext, j paramj)
  {
    Object localObject3 = null;
    Object localObject5 = null;
    Object localObject4 = null;
    GMTrace.i(6424734203904L, 47868);
    if ((paramj == null) || (paramContext == null))
    {
      w.w("MicroMsg.FavItemLogic", "getDisplayInfo favItemInfo is null");
      GMTrace.o(6424734203904L, 47868);
      return;
    }
    th localth1 = x.n(paramj);
    if (paramj == null)
    {
      w.w("MicroMsg.FavItemLogic", "GetThumbUrlAndLocalPath favItemInfo is null");
      label58:
      localObject1 = null;
      label60:
      if (!(localObject1 instanceof String)) {
        break label1336;
      }
    }
    Object localObject2;
    for (Object localObject1 = (String)localObject1;; localObject1 = null)
    {
      localObject2 = paramj.field_favProto.ukJ;
      switch (paramj.field_type)
      {
      case 3: 
      case 9: 
      case 10: 
      case 11: 
      case 12: 
      case 13: 
      case 15: 
      case 17: 
      default: 
        paramj = (j)localObject4;
        if (localObject2 != null)
        {
          paramj = (j)localObject4;
          if (!bg.nm(((uf)localObject2).title)) {
            paramj = ((uf)localObject2).title;
          }
        }
        localObject1 = paramj;
        if (bg.nm(paramj)) {
          localObject1 = localth1.title;
        }
        parama.Pi(paramContext.getResources().getString(R.l.cRN) + (String)localObject1);
        GMTrace.o(6424734203904L, 47868);
        return;
        th localth2 = x.n(paramj);
        if (5 == paramj.field_type)
        {
          localObject1 = new File(x.h(localth2));
          if (((File)localObject1).exists())
          {
            localObject1 = ((File)localObject1).getAbsolutePath();
            break label60;
          }
          localObject1 = paramj.field_favProto.ukJ;
          if (localObject1 == null) {}
          for (localObject1 = null;; localObject1 = ((uf)localObject1).thumbUrl)
          {
            localObject2 = localObject1;
            if (bg.nm((String)localObject1)) {
              localObject2 = localth2.eDk;
            }
            localObject2 = x.xO((String)localObject2);
            localObject1 = localObject2;
            if (!bg.nm((String)localObject2)) {
              break;
            }
            localObject1 = Integer.valueOf(R.k.cJr);
            break;
          }
        }
        if ((11 == paramj.field_type) || (10 == paramj.field_type))
        {
          localObject1 = paramj.field_favProto.ukL;
          if (localObject1 != null)
          {
            localObject2 = x.xO(((ts)localObject1).thumbUrl);
            localObject1 = localObject2;
            if (!bg.nm((String)localObject2)) {
              break label60;
            }
            localObject1 = Integer.valueOf(R.k.cJl);
            break label60;
          }
        }
        if ((15 == paramj.field_type) || (12 == paramj.field_type))
        {
          localObject1 = paramj.field_favProto.ukN;
          if (localObject1 != null)
          {
            localObject2 = x.xO(((tz)localObject1).thumbUrl);
            localObject1 = localObject2;
            if (!bg.nm((String)localObject2)) {
              break label60;
            }
            localObject1 = Integer.valueOf(R.k.cJl);
            break label60;
          }
        }
        if ((2 == paramj.field_type) || (7 == paramj.field_type) || (16 == paramj.field_type) || (4 == paramj.field_type))
        {
          localObject1 = new File(x.h(localth2));
          if (((File)localObject1).exists())
          {
            localObject1 = ((File)localObject1).getAbsolutePath();
            break label60;
          }
          localObject1 = x.xO(localth2.eDk);
          localObject2 = localObject1;
          if (bg.nm((String)localObject1))
          {
            x.b(paramj, localth2, true);
            localObject2 = x.h(localth2);
          }
          localObject1 = localObject2;
          if (!bg.nm((String)localObject2)) {
            break label60;
          }
        }
        switch (paramj.field_type)
        {
        default: 
          localObject1 = Integer.valueOf(R.k.cJo);
          break;
        case 2: 
          localObject1 = Integer.valueOf(R.g.aTK);
          break;
        case 7: 
          localObject1 = Integer.valueOf(R.k.cJd);
          break;
          if ((3 == paramj.field_type) || (6 == paramj.field_type)) {
            break label58;
          }
          if (8 == paramj.field_type)
          {
            localObject1 = Integer.valueOf(com.tencent.mm.pluginsdk.c.NV(localth2.ujI));
            break;
          }
          if (17 == paramj.field_type)
          {
            at.AR();
            localObject1 = com.tencent.mm.y.c.yM().Cn(localth2.desc);
            if ((((au.a)localObject1).rAP != null) && (((au.a)localObject1).rAP.length() != 0))
            {
              localObject1 = new SpannableString(((au.a)localObject1).rAP);
              break;
            }
            localObject1 = Integer.valueOf(R.g.aVS);
            break;
          }
          if ((14 != paramj.field_type) || (paramj.field_favProto.ulB == null)) {
            break label58;
          }
          localObject1 = paramj.field_favProto.ulB.iterator();
          do
          {
            do
            {
              if (!((Iterator)localObject1).hasNext()) {
                break;
              }
              localth2 = (th)((Iterator)localObject1).next();
            } while (localth2.aGU == 1);
            if (localth2.aGU == 3)
            {
              localObject1 = Integer.valueOf(R.k.cJq);
              break label60;
            }
            if (localth2.aGU == 6)
            {
              localObject1 = Integer.valueOf(R.k.cJc);
              break label60;
            }
            if (localth2.aGU == 8)
            {
              localObject1 = Integer.valueOf(com.tencent.mm.pluginsdk.c.NV(localth2.ujI));
              break label60;
            }
            if ((localth2.aGU == 2) || (localth2.aGU == 7) || (localth2.aGU == 15) || (localth2.aGU == 4))
            {
              localObject1 = new File(x.h(localth2));
              if (((File)localObject1).exists())
              {
                localObject1 = ((File)localObject1).getAbsolutePath();
                break label60;
              }
              localObject1 = x.xO(localth2.eDk);
              if (bg.nm((String)localObject1)) {
                switch (localth2.aGU)
                {
                default: 
                  localObject1 = Integer.valueOf(R.k.cJo);
                  break;
                case 2: 
                  localObject1 = Integer.valueOf(R.g.aTK);
                  break;
                case 7: 
                  localObject1 = Integer.valueOf(R.k.cJd);
                  break;
                }
              }
              break label60;
            }
            if (localth2.aGU == 5)
            {
              localObject1 = new File(x.h(localth2));
              if (((File)localObject1).exists())
              {
                localObject1 = ((File)localObject1).getAbsolutePath();
                break label60;
              }
              localObject1 = localth2.ukn.ukJ;
              if (localObject1 == null) {}
              for (localObject1 = null;; localObject1 = ((uf)localObject1).thumbUrl)
              {
                localObject2 = localObject1;
                if (bg.nm((String)localObject1)) {
                  localObject2 = localth2.eDk;
                }
                localObject2 = x.xO((String)localObject2);
                localObject1 = localObject2;
                if (!bg.nm((String)localObject2)) {
                  break;
                }
                localObject1 = Integer.valueOf(R.k.cJr);
                break;
              }
            }
            if ((localth2.aGU == 10) || (localth2.aGU == 11))
            {
              localObject2 = localth2.ukn.ukL;
              if (localObject2 != null)
              {
                localObject2 = x.xO(((ts)localObject2).thumbUrl);
                localObject1 = localObject2;
                if (!bg.nm((String)localObject2)) {
                  break label60;
                }
                localObject1 = Integer.valueOf(R.k.cJl);
                break label60;
              }
            }
            if ((localth2.aGU == 12) || (localth2.aGU == 14))
            {
              localObject2 = localth2.ukn.ukN;
              if (localObject2 != null)
              {
                localObject2 = x.xO(((tz)localObject2).thumbUrl);
                localObject1 = localObject2;
                if (!bg.nm((String)localObject2)) {
                  break label60;
                }
                localObject1 = Integer.valueOf(R.k.cJl);
                break label60;
              }
            }
          } while (localth2.aGU != 16);
          at.AR();
          localObject1 = com.tencent.mm.y.c.yM().Cn(localth2.desc);
          if ((((au.a)localObject1).rAP != null) && (((au.a)localObject1).rAP.length() != 0))
          {
            localObject1 = new SpannableString(((au.a)localObject1).rAP);
            break;
          }
          localObject1 = Integer.valueOf(R.g.aVS);
          break;
          label1336:
          if ((localObject1 instanceof Integer)) {
            ((Integer)localObject1).intValue();
          }
          break;
        }
        break;
      }
    }
    localObject1 = paramj.field_favProto.title;
    paramj = (j)localObject1;
    if (bg.nm((String)localObject1)) {
      paramj = localth1.title;
    }
    parama.Pi(paramContext.getResources().getString(R.l.cTf) + paramj);
    GMTrace.o(6424734203904L, 47868);
    return;
    parama.Pi(paramj.field_favProto.desc);
    parama.bLE();
    parama.a(new i.a.a()
    {
      public final void azi()
      {
        GMTrace.i(6422720937984L, 47853);
        Intent localIntent = new Intent();
        localIntent.putExtra("Retr_Msg_content", this.ljU.field_favProto.desc);
        com.tencent.mm.bj.d.a(paramContext, ".ui.transmit.RetransmitPreviewUI", localIntent);
        com.tencent.mm.ui.base.b.fl(paramContext);
        GMTrace.o(6422720937984L, 47853);
      }
    });
    GMTrace.o(6424734203904L, 47868);
    return;
    paramj = paramj.field_favProto.ukH;
    parama.Pi(paramContext.getString(R.l.cTu) + paramj.label);
    GMTrace.o(6424734203904L, 47868);
    return;
    if ((localObject2 != null) && (!bg.nm(((uf)localObject2).title))) {
      paramj = ((uf)localObject2).title;
    }
    for (localObject1 = ((uf)localObject2).desc;; localObject1 = localObject3)
    {
      localObject2 = paramj;
      if (bg.nm(paramj)) {
        localObject2 = localth1.title;
      }
      if (bg.nm((String)localObject1)) {
        paramj = localth1.desc;
      }
      parama.Pi(paramContext.getResources().getString(R.l.cUM) + (String)localObject2);
      GMTrace.o(6424734203904L, 47868);
      return;
      paramj = r.a.a(paramContext, paramj).title;
      parama.Pi(paramContext.getResources().getString(R.l.cUk) + paramj);
      GMTrace.o(6424734203904L, 47868);
      return;
      parama.a(com.tencent.mm.sdk.platformtools.d.RD((String)localObject1), 3);
      GMTrace.o(6424734203904L, 47868);
      return;
      parama.a(com.tencent.mm.sdk.platformtools.d.RD((String)localObject1), 2);
      GMTrace.o(6424734203904L, 47868);
      return;
      parama.a(com.tencent.mm.sdk.platformtools.d.RD((String)localObject1), 2);
      GMTrace.o(6424734203904L, 47868);
      return;
      localObject1 = paramContext.getResources().getString(R.l.cTL);
      paramContext = r.a.a(paramContext, paramj).desc.replaceAll("\n", " ");
      parama.Pi((String)localObject1 + paramContext);
      GMTrace.o(6424734203904L, 47868);
      return;
      paramj = (j)localObject5;
      if (localObject2 != null)
      {
        paramj = (j)localObject5;
        if (!bg.nm(((uf)localObject2).title)) {
          paramj = ((uf)localObject2).title;
        }
      }
      localObject1 = paramj;
      if (bg.nm(paramj)) {
        localObject1 = localth1.title;
      }
      parama.Pi(paramContext.getResources().getString(R.l.cTB) + (String)localObject1);
      GMTrace.o(6424734203904L, 47868);
      return;
      paramj = null;
    }
  }
  
  public static String[] a(j paramj, ae paramae)
  {
    Object localObject2 = null;
    GMTrace.i(6424599986176L, 47867);
    if (paramj == null)
    {
      w.w("MicroMsg.FavItemLogic", "GetThumbUrlAndLocalPath favItemInfo is null");
      GMTrace.o(6424599986176L, 47867);
      return null;
    }
    final th localth = x.n(paramj);
    String[] arrayOfString = new String[2];
    Runnable local1 = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6428223864832L, 47894);
        x.b(this.ljU, localth, true);
        GMTrace.o(6428223864832L, 47894);
      }
    };
    Object localObject1;
    switch (paramj.field_type)
    {
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 12: 
    case 13: 
    case 16: 
    case 17: 
    default: 
      if (localth != null)
      {
        arrayOfString[0] = x.h(localth);
        arrayOfString[1] = localth.eDk;
        paramae.post(local1);
      }
    case 5: 
    case 10: 
    case 15: 
    case 11: 
      for (;;)
      {
        w.d("MicroMsg.FavItemLogic", "GetThumbUrlAndLocalPath thumbPath %s, thumbUrl %s, type %d", new Object[] { arrayOfString[0], arrayOfString[1], Integer.valueOf(paramj.field_type) });
        GMTrace.o(6424599986176L, 47867);
        return arrayOfString;
        localObject1 = paramj.field_favProto.ukJ;
        if (localth == null)
        {
          if (localObject1 != null) {
            arrayOfString[1] = ((uf)localObject1).thumbUrl;
          }
        }
        else
        {
          if (localObject1 == null) {}
          for (localObject1 = null;; localObject1 = ((uf)localObject1).thumbUrl)
          {
            localObject2 = localObject1;
            if (bg.nm((String)localObject1)) {
              localObject2 = localth.eDk;
            }
            arrayOfString[0] = x.h(localth);
            arrayOfString[1] = localObject2;
            paramae.post(local1);
            break;
          }
          paramae = paramj.field_favProto.ukL;
          if (paramae != null)
          {
            arrayOfString[1] = paramae.thumbUrl;
            continue;
            paramae = paramj.field_favProto.ukN;
            if (paramae != null)
            {
              arrayOfString[1] = paramae.thumbUrl;
              continue;
              paramae = paramj.field_favProto.ukL;
              if (paramae != null) {
                arrayOfString[1] = paramae.thumbUrl;
              }
            }
          }
        }
      }
    }
    if (paramj.field_favProto.ulB != null)
    {
      Iterator localIterator = paramj.field_favProto.ulB.iterator();
      label382:
      localObject1 = localObject2;
      if (localIterator.hasNext())
      {
        localObject1 = (th)localIterator.next();
        if (((th)localObject1).aGU != 2) {
          break label442;
        }
        localObject1 = x.g((th)localObject1);
        paramae.post(local1);
      }
    }
    for (;;)
    {
      arrayOfString[0] = localObject1;
      arrayOfString[1] = localth.eDk;
      break;
      label442:
      if (((th)localObject1).aGU != 15) {
        break label382;
      }
      localObject1 = x.h((th)localObject1);
      paramae.post(local1);
    }
  }
  
  public static void b(Context paramContext, j paramj)
  {
    GMTrace.i(6423257808896L, 47857);
    if (paramContext == null)
    {
      w.w("MicroMsg.FavItemLogic", "Context is null");
      GMTrace.o(6423257808896L, 47857);
      return;
    }
    if (paramj == null)
    {
      w.w("MicroMsg.FavItemLogic", "Fav item is null");
      GMTrace.o(6423257808896L, 47857);
      return;
    }
    w.i("MicroMsg.FavItemLogic", "Handler favItemInfo id %d, type %d", new Object[] { Long.valueOf(paramj.field_localId), Integer.valueOf(paramj.field_type) });
    switch (paramj.field_type)
    {
    case -1: 
    case 0: 
    case 9: 
    case 13: 
    default: 
      w.w("MicroMsg.FavItemLogic", "Do not match any type %d", new Object[] { Integer.valueOf(paramj.field_type) });
    case 1: 
    case 2: 
    case 3: 
    case 16: 
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    case 10: 
    case 12: 
    case 15: 
    case 11: 
    case 14: 
    case 17: 
      do
      {
        GMTrace.o(6423257808896L, 47857);
        return;
        localObject1 = new Intent(paramContext, FavoriteTextDetailUI.class);
        ((Intent)localObject1).putExtra("key_detail_text", paramj.field_favProto.desc);
        ((Intent)localObject1).putExtra("key_detail_info_id", paramj.field_localId);
        ((Intent)localObject1).putExtra("key_detail_can_share_to_friend", paramj.axH());
        ((Intent)localObject1).putExtra("key_detail_time", paramj.field_updateTime);
        if (paramj.field_sourceCreateTime <= 0L) {}
        for (long l = paramj.field_updateTime;; l = paramj.field_sourceCreateTime)
        {
          ((Intent)localObject1).putExtra("key_detail_create_time", l);
          paramContext.startActivity((Intent)localObject1);
          GMTrace.o(6423257808896L, 47857);
          return;
        }
        e(paramContext, paramj);
        GMTrace.o(6423257808896L, 47857);
        return;
        localObject1 = new Intent(paramContext, FavoriteVoiceDetailUI.class);
        ((Intent)localObject1).putExtra("key_detail_info_id", paramj.field_localId);
        ((Intent)localObject1).putExtra("key_detail_create_time", paramj.field_favProto.ulz.hcs);
        paramContext.startActivity((Intent)localObject1);
        GMTrace.o(6423257808896L, 47857);
        return;
        localObject1 = x.n(paramj);
        if ((localObject1 != null) && (((th)localObject1).ukt != null) && ((!bg.nm(((th)localObject1).ukt.gkI)) || (!bg.nm(((th)localObject1).ukt.gkM))))
        {
          w.i("MicroMsg.FavItemLogic", "it is ad sight.");
          c(paramContext, paramj);
          GMTrace.o(6423257808896L, 47857);
          return;
        }
        d(paramContext, paramj);
        GMTrace.o(6423257808896L, 47857);
        return;
        d(paramContext, paramj);
        GMTrace.o(6423257808896L, 47857);
        return;
        d(paramContext, paramj, true);
        GMTrace.o(6423257808896L, 47857);
        return;
        Object localObject2 = paramj.field_favProto.ukH;
        String str = paramj.field_favProto.hLO;
        localObject1 = paramj.field_favProto.ulz;
        if ((localObject1 != null) && (!bg.nm(((tw)localObject1).ulb))) {}
        for (localObject1 = r.fs(((tw)localObject1).ulb);; localObject1 = r.fs(paramj.field_fromUser))
        {
          ArrayList localArrayList = new ArrayList();
          if (paramj.field_tagProto.ulP != null) {
            localArrayList.addAll(paramj.field_tagProto.ulP);
          }
          com.tencent.mm.plugin.favorite.c.a(paramj.field_localId, (to)localObject2, (String)localObject1, str, localArrayList, paramContext);
          GMTrace.o(6423257808896L, 47857);
          return;
        }
        localObject1 = paramj.field_favProto.ulz;
        localObject2 = x.n(paramj);
        paramj = new File(x.h((th)localObject2));
        if (!paramj.exists()) {
          if (((th)localObject2).eDk == null) {
            paramj = "";
          }
        }
        for (;;)
        {
          com.tencent.mm.at.b.b(((com.tencent.mm.at.a.a)h.h(com.tencent.mm.at.a.a.class)).a(6, null, ((th)localObject2).title, ((th)localObject2).desc, ((th)localObject2).ujA, ((th)localObject2).ujE, ((th)localObject2).ujC, ((th)localObject2).lhq, x.aya(), paramj, "", ((tw)localObject1).appId));
          paramj = new Intent();
          paramj.putExtra("key_scene", 2);
          com.tencent.mm.bj.d.b(paramContext, "music", ".ui.MusicMainUI", paramj);
          GMTrace.o(6423257808896L, 47857);
          return;
          paramj = new File(x.axY() + g.n(((th)localObject2).eDk.getBytes()));
          if (paramj.exists()) {}
          for (paramj = paramj.getAbsolutePath();; paramj = "") {
            break;
          }
          paramj = paramj.getAbsolutePath();
        }
        c(paramContext, paramj, true);
        GMTrace.o(6423257808896L, 47857);
        return;
        w.d("MicroMsg.FavItemLogic", "start product ui, fav id %d, fav local id %d", new Object[] { Integer.valueOf(paramj.field_id), Long.valueOf(paramj.field_localId) });
        l = paramj.field_localId;
        paramj = paramj.field_favProto.ukL.info;
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("key_is_favorite_item", true);
        ((Intent)localObject1).putExtra("key_favorite_local_id", l);
        ((Intent)localObject1).putExtra("key_Product_xml", paramj);
        ((Intent)localObject1).putExtra("key_can_delete_favorite_item", true);
        ((Intent)localObject1).putExtra("key_ProductUI_getProductInfoScene", 3);
        com.tencent.mm.bj.d.b(paramContext, "scanner", ".ui.ProductUI", (Intent)localObject1);
        GMTrace.o(6423257808896L, 47857);
        return;
        w.d("MicroMsg.FavItemLogic", "start tv ui, fav id %d, fav local id %d", new Object[] { Integer.valueOf(paramj.field_id), Long.valueOf(paramj.field_localId) });
        l = paramj.field_localId;
        paramj = paramj.field_favProto.ukN.info;
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("key_TV_getProductInfoScene", 3);
        ((Intent)localObject1).putExtra("key_is_favorite_item", true);
        ((Intent)localObject1).putExtra("key_favorite_local_id", l);
        ((Intent)localObject1).putExtra("key_TV_xml", paramj);
        ((Intent)localObject1).putExtra("key_can_delete_favorite_item", true);
        com.tencent.mm.bj.d.b(paramContext, "shake", ".ui.TVInfoUI", (Intent)localObject1);
        GMTrace.o(6423257808896L, 47857);
        return;
        w.d("MicroMsg.FavItemLogic", "start product ui, fav id %d, fav local id %d", new Object[] { Integer.valueOf(paramj.field_id), Long.valueOf(paramj.field_localId) });
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("key_product_scene", 4);
        ((Intent)localObject1).putExtra("key_product_info", paramj.field_favProto.ukL.info);
        com.tencent.mm.bj.d.b(paramContext, "product", ".ui.MallProductUI", (Intent)localObject1);
        GMTrace.o(6423257808896L, 47857);
        return;
        a(paramContext, paramj, true);
        GMTrace.o(6423257808896L, 47857);
        return;
        paramj = x.n(paramj).desc;
        at.AR();
        paramj = com.tencent.mm.y.c.yM().Cn(paramj);
      } while (paramj == null);
      Object localObject1 = new Intent();
      ((Intent)localObject1).putExtra("Contact_User", paramj.rAP);
      ((Intent)localObject1).putExtra("Contact_Alias", paramj.fsF);
      ((Intent)localObject1).putExtra("Contact_Nick", paramj.eCQ);
      ((Intent)localObject1).putExtra("Contact_QuanPin", paramj.gDZ);
      ((Intent)localObject1).putExtra("Contact_PyInitial", paramj.gDY);
      ((Intent)localObject1).putExtra("Contact_Uin", paramj.nNL);
      ((Intent)localObject1).putExtra("Contact_Mobile_MD5", paramj.vBs);
      ((Intent)localObject1).putExtra("Contact_full_Mobile_MD5", paramj.vBt);
      ((Intent)localObject1).putExtra("Contact_QQNick", paramj.bUd());
      ((Intent)localObject1).putExtra("User_From_Fmessage", false);
      ((Intent)localObject1).putExtra("Contact_Scene", paramj.scene);
      ((Intent)localObject1).putExtra("Contact_FMessageCard", true);
      ((Intent)localObject1).putExtra("Contact_RemarkName", paramj.gEd);
      ((Intent)localObject1).putExtra("Contact_VUser_Info_Flag", paramj.rCC);
      ((Intent)localObject1).putExtra("Contact_VUser_Info", paramj.fjp);
      ((Intent)localObject1).putExtra("Contact_BrandIconURL", paramj.nLE);
      ((Intent)localObject1).putExtra("Contact_Province", paramj.getProvince());
      ((Intent)localObject1).putExtra("Contact_City", paramj.getCity());
      ((Intent)localObject1).putExtra("Contact_Sex", paramj.fja);
      ((Intent)localObject1).putExtra("Contact_Signature", paramj.signature);
      ((Intent)localObject1).putExtra("Contact_ShowUserName", false);
      ((Intent)localObject1).putExtra("Contact_KSnsIFlag", 0);
      com.tencent.mm.bj.d.b(paramContext, "profile", ".ui.ContactInfoUI", (Intent)localObject1);
      com.tencent.mm.bk.a.zK(paramj.scene);
      GMTrace.o(6423257808896L, 47857);
      return;
    case 18: 
      b(paramContext, paramj, true);
      GMTrace.o(6423257808896L, 47857);
      return;
    }
    Toast.makeText(paramContext, R.l.dvc, 0).show();
    GMTrace.o(6423257808896L, 47857);
  }
  
  public static void b(Context paramContext, j paramj, boolean paramBoolean)
  {
    GMTrace.i(6423660462080L, 47860);
    w.i("MicroMsg.FavItemLogic", "click WNNoteItem, handleWNNoteItem");
    km localkm = new km();
    localkm.eOE.field_localId = paramj.field_localId;
    if (paramj.field_localId == -1L) {
      localkm.eOE.eOL = 4;
    }
    for (;;)
    {
      localkm.eOE.context = paramContext;
      paramContext = new Bundle();
      tp localtp = paramj.field_favProto.tLX;
      if (localtp != null)
      {
        paramContext.putString("noteauthor", localtp.ult);
        paramContext.putString("noteeditor", localtp.ulu);
      }
      paramContext.putLong("edittime", paramj.field_updateTime);
      localkm.eOE.eOJ = paramContext;
      localkm.eOE.field_favProto = paramj.field_favProto;
      localkm.eOE.type = 2;
      localkm.eOE.eON = paramBoolean;
      com.tencent.mm.sdk.b.a.vgX.m(localkm);
      GMTrace.o(6423660462080L, 47860);
      return;
      localkm.eOE.eOG = paramj.field_xml;
    }
  }
  
  public static void b(e.a parama, final Context paramContext, final j paramj)
  {
    GMTrace.i(6424868421632L, 47869);
    if ((paramj == null) || (paramContext == null))
    {
      w.w("MicroMsg.FavItemLogic", "getDisplayInfo favItemInfo is null");
      GMTrace.o(6424868421632L, 47869);
      return;
    }
    final th localth = x.n(paramj);
    switch (paramj.field_type)
    {
    }
    for (;;)
    {
      GMTrace.o(6424868421632L, 47869);
      return;
      parama.a(new i.a.a()
      {
        public final void azi()
        {
          GMTrace.i(6433995227136L, 47937);
          e.c(this.val$context, paramj, false);
          GMTrace.o(6433995227136L, 47937);
        }
      });
      GMTrace.o(6424868421632L, 47869);
      return;
      parama.a(new i.a.a()
      {
        public final void azi()
        {
          GMTrace.i(6419499712512L, 47829);
          Intent localIntent = new Intent();
          localIntent.putExtra("Retr_Msg_content", this.ljU.field_favProto.desc);
          com.tencent.mm.bj.d.a(paramContext, ".ui.transmit.RetransmitPreviewUI", localIntent);
          com.tencent.mm.ui.base.b.fl(paramContext);
          GMTrace.o(6419499712512L, 47829);
        }
      });
      GMTrace.o(6424868421632L, 47869);
      return;
      parama.a(new i.a.a()
      {
        public final void azi()
        {
          GMTrace.i(6426881687552L, 47884);
          Intent localIntent = new Intent();
          localIntent.putExtra("map_view_type", 1);
          localIntent.putExtra("kwebmap_slat", this.ljW.lat);
          localIntent.putExtra("kwebmap_lng", this.ljW.lng);
          localIntent.putExtra("Kwebmap_locaion", this.ljW.label);
          localIntent.putExtra("kShowshare", false);
          com.tencent.mm.bj.d.b(paramContext, "location", ".ui.RedirectUI", localIntent);
          GMTrace.o(6426881687552L, 47884);
        }
      });
      GMTrace.o(6424868421632L, 47869);
      return;
      parama.a(new i.a.a()
      {
        public final void azi()
        {
          GMTrace.i(6418425970688L, 47821);
          e.d(this.val$context, paramj, false);
          GMTrace.o(6418425970688L, 47821);
        }
      });
      GMTrace.o(6424868421632L, 47869);
      return;
      parama.a(new i.a.a()
      {
        public final void azi()
        {
          GMTrace.i(6432921485312L, 47929);
          e.a(this.val$context, paramj, false);
          GMTrace.o(6432921485312L, 47929);
        }
      });
      GMTrace.o(6424868421632L, 47869);
      return;
      parama.a(new i.a.a()
      {
        public final void azi()
        {
          GMTrace.i(6430371348480L, 47910);
          Intent localIntent = new Intent(this.val$context, FavImgGalleryUI.class);
          localIntent.putExtra("key_detail_info_id", paramj.field_localId);
          localIntent.putExtra("key_detail_data_id", localth.lhq);
          localIntent.putExtra("show_share", false);
          this.val$context.startActivity(localIntent);
          GMTrace.o(6430371348480L, 47910);
        }
      });
      GMTrace.o(6424868421632L, 47869);
      return;
      parama.a(new i.a.a()
      {
        public final void azi()
        {
          GMTrace.i(6426613252096L, 47882);
          th localth = x.n(this.ljU);
          if (localth == null)
          {
            w.e("MicroMsg.FavItemLogic", "goPlayView, but dataitem is null , exit");
            GMTrace.o(6426613252096L, 47882);
            return;
          }
          if ((localth.ukt != null) && ((!bg.nm(localth.ukt.gkI)) || (!bg.nm(localth.ukt.gkM))))
          {
            w.i("MicroMsg.FavItemLogic", "it is ad sight.use sight play");
            localIntent = new Intent(paramContext, FavoriteFileDetailUI.class);
            localIntent.putExtra("key_detail_info_id", this.ljU.field_localId);
            localIntent.putExtra("key_detail_data_id", localth.lhq);
            localIntent.putExtra("key_detail_can_delete", false);
            paramContext.startActivity(localIntent);
            GMTrace.o(6426613252096L, 47882);
            return;
          }
          Intent localIntent = new Intent(paramContext, FavoriteVideoPlayUI.class);
          localIntent.putExtra("key_detail_fav_path", x.g(localth));
          localIntent.putExtra("key_detail_fav_thumb_path", x.h(localth));
          localIntent.putExtra("key_detail_fav_video_duration", localth.duration);
          localIntent.putExtra("key_detail_statExtStr", localth.eTv);
          localIntent.putExtra("show_share", false);
          paramContext.startActivity(localIntent);
          GMTrace.o(6426613252096L, 47882);
        }
      });
      GMTrace.o(6424868421632L, 47869);
      return;
      parama.a(new i.a.a()
      {
        public final void azi()
        {
          GMTrace.i(6422049849344L, 47848);
          e.b(this.val$context, paramj, false);
          GMTrace.o(6422049849344L, 47848);
        }
      });
    }
  }
  
  private static void c(Context paramContext, j paramj)
  {
    GMTrace.i(6424197332992L, 47864);
    v.a(v.a.lbw, paramj);
    Intent localIntent = new Intent(paramContext, FavoriteSightDetailUI.class);
    localIntent.putExtra("key_detail_info_id", paramj.field_localId);
    paramContext.startActivity(localIntent);
    GMTrace.o(6424197332992L, 47864);
  }
  
  public static void c(Context paramContext, j paramj, boolean paramBoolean)
  {
    GMTrace.i(6423794679808L, 47861);
    Object localObject = x.n(paramj);
    if (x.d((th)localObject))
    {
      if (x.e((th)localObject))
      {
        e(paramContext, paramj);
        GMTrace.o(6423794679808L, 47861);
        return;
      }
      if (!com.tencent.mm.pluginsdk.ui.tools.a.a((Activity)paramContext, x.g((th)localObject), ((th)localObject).ujI, 2))
      {
        GMTrace.o(6423794679808L, 47861);
        return;
      }
    }
    localObject = new Intent(paramContext, FavoriteFileDetailUI.class);
    ((Intent)localObject).putExtra("key_detail_info_id", paramj.field_localId);
    ((Intent)localObject).putExtra("show_share", paramBoolean);
    paramContext.startActivity((Intent)localObject);
    GMTrace.o(6423794679808L, 47861);
  }
  
  private static void d(Context paramContext, j paramj)
  {
    GMTrace.i(6424331550720L, 47865);
    Object localObject1 = x.n(paramj);
    Object localObject2 = ((th)localObject1).ukt;
    if ((localObject2 == null) || (bg.nm(((tk)localObject2).gkI))) {}
    for (int i = 0; i != 0; i = 1)
    {
      GMTrace.o(6424331550720L, 47865);
      return;
      v.a(v.a.lby, paramj);
      String str = x.h((th)localObject1);
      Intent localIntent = new Intent();
      localIntent.putExtra("IsAd", false);
      localIntent.putExtra("KStremVideoUrl", ((tk)localObject2).gkI);
      localIntent.putExtra("StreamWording", ((tk)localObject2).gkL);
      localIntent.putExtra("StremWebUrl", ((tk)localObject2).gkM);
      localIntent.putExtra("KThumUrl", ((tk)localObject2).gkN);
      localIntent.putExtra("KSta_StremVideoAduxInfo", ((tk)localObject2).gkO);
      localIntent.putExtra("KSta_StremVideoPublishId", ((tk)localObject2).gkP);
      localIntent.putExtra("KSta_SourceType", 2);
      localIntent.putExtra("KSta_Scene", v.b.lbI.value);
      localIntent.putExtra("KSta_FromUserName", paramj.field_fromUser);
      localIntent.putExtra("KSta_FavID", paramj.field_id);
      localIntent.putExtra("KSta_SnsStatExtStr", ((th)localObject1).eTv);
      localIntent.putExtra("KBlockFav", true);
      localIntent.putExtra("KMediaId", "fakeid_" + paramj.field_id);
      localIntent.putExtra("KThumbPath", str);
      localIntent.putExtra("KMediaVideoTime", ((tk)localObject2).ulk);
      localIntent.putExtra("KMediaTitle", ((tk)localObject2).gkK);
      com.tencent.mm.bj.d.b(paramContext, "sns", ".ui.VideoAdPlayerUI", localIntent);
    }
    if ((bg.nm(((th)localObject1).ujK)) || (((th)localObject1).ujO <= 0L))
    {
      w.w("MicroMsg.FavItemLogic", "full md5[%s], fullsize[%d], start use url", new Object[] { ((th)localObject1).ujK, Long.valueOf(((th)localObject1).ujO) });
      localObject2 = x.n(paramj).ujA;
      localObject1 = localObject2;
      if (bg.nm((String)localObject2)) {
        localObject1 = x.n(paramj).ujE;
      }
      if (bg.nm((String)localObject1))
      {
        w.w("MicroMsg.FavItemLogic", "onClick video url null, return");
        c(paramContext, paramj);
        GMTrace.o(6424331550720L, 47865);
        return;
      }
      localObject2 = new Intent();
      ((Intent)localObject2).putExtra("rawUrl", (String)localObject1);
      ((Intent)localObject2).putExtra("is_favorite_item", true);
      ((Intent)localObject2).putExtra("fav_local_id", paramj.field_localId);
      ((Intent)localObject2).putExtra("geta8key_scene", 14);
      w.d("MicroMsg.FavItemLogic", "start video webview, fav id %d, fav local id %d", new Object[] { Integer.valueOf(paramj.field_id), Long.valueOf(paramj.field_localId) });
      com.tencent.mm.plugin.favorite.c.j((Intent)localObject2, paramContext);
      GMTrace.o(6424331550720L, 47865);
      return;
    }
    localObject1 = new Intent(paramContext, FavoriteSightDetailUI.class);
    ((Intent)localObject1).putExtra("key_detail_info_id", paramj.field_localId);
    paramContext.startActivity((Intent)localObject1);
    GMTrace.o(6424331550720L, 47865);
  }
  
  public static void d(Context paramContext, j paramj, boolean paramBoolean)
  {
    GMTrace.i(6424063115264L, 47863);
    if (paramj.field_favProto != null) {
      if ((paramj.field_favProto.ukJ != null) && (!bg.nm(paramj.field_favProto.ukJ.canvasPageXml))) {
        localObject1 = paramj.field_favProto.ukJ.canvasPageXml;
      }
    }
    while (!bg.nm((String)localObject1))
    {
      localObject2 = new Intent();
      ((Intent)localObject2).putExtra("sns_landing_pages_xml", (String)localObject1);
      ((Intent)localObject2).putExtra("sns_landig_pages_from_source", 7);
      ((Intent)localObject2).putExtra("sns_landing_pages_share_thumb_url", D(paramj));
      ((Intent)localObject2).putExtra("sns_landing_favid", q.zE() + "_" + paramj.field_id);
      ((Intent)localObject2).addFlags(268435456);
      com.tencent.mm.bj.d.b(paramContext, "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", (Intent)localObject2);
      GMTrace.o(6424063115264L, 47863);
      return;
      localObject1 = paramj.field_favProto.ulB;
      if ((localObject1 != null) && (((List)localObject1).size() == 1)) {
        localObject1 = ((th)((List)localObject1).get(0)).canvasPageXml;
      } else {
        localObject1 = null;
      }
    }
    tw localtw = paramj.field_favProto.ulz;
    Object localObject2 = "";
    Object localObject1 = "";
    Object localObject3 = "";
    if (paramj.field_favProto.ukJ != null)
    {
      localObject3 = paramj.field_favProto.ukJ;
      localObject2 = ((uf)localObject3).umf;
      localObject1 = ((uf)localObject3).title;
      localObject3 = ((uf)localObject3).desc;
    }
    Object localObject5 = localObject2;
    if (localtw != null)
    {
      localObject5 = localObject2;
      if (bg.nm((String)localObject2)) {
        localObject5 = localtw.gVf;
      }
    }
    if (bg.nm((String)localObject5))
    {
      GMTrace.o(6424063115264L, 47863);
      return;
    }
    th localth = x.n(paramj);
    Object localObject4 = localObject1;
    if (localth != null)
    {
      localObject2 = localObject1;
      if (bg.nm((String)localObject1)) {
        localObject2 = localth.title;
      }
      localObject4 = localObject2;
      if (!bg.nm((String)localObject3)) {}
    }
    for (localObject1 = localth.desc;; localObject1 = localObject3)
    {
      w.d("MicroMsg.FavItemLogic", "start web view, fav id %d, fav local id %d", new Object[] { Integer.valueOf(paramj.field_id), Long.valueOf(paramj.field_localId) });
      localObject3 = new Intent();
      ((Intent)localObject3).putExtra("rawUrl", (String)localObject5);
      ((Intent)localObject3).putExtra("showShare", paramBoolean);
      ((Intent)localObject3).putExtra("is_favorite_item", true);
      ((Intent)localObject3).putExtra("fav_local_id", paramj.field_localId);
      localObject4 = new Bundle();
      ((Bundle)localObject4).putBoolean("key_ctrl_flag_open_chat", paramj.axH());
      ((Bundle)localObject4).putBoolean("key_ctrl_flag_open_sns", paramj.axI());
      if ((paramj.field_favProto.ukS & 0x4) != 0)
      {
        paramBoolean = true;
        ((Bundle)localObject4).putBoolean("key_ctrl_flag_open_weibo", paramBoolean);
        if ((paramj.field_favProto.ukS & 0x8) == 0) {
          break label924;
        }
        paramBoolean = true;
        label529:
        ((Bundle)localObject4).putBoolean("key_ctrl_flag_open_cplink", paramBoolean);
        if ((paramj.field_favProto.ukS & 0x10) == 0) {
          break label929;
        }
        paramBoolean = true;
        label553:
        ((Bundle)localObject4).putBoolean("key_ctrl_flag_open_browser", paramBoolean);
        if ((paramj.field_favProto.ukS & 0x20) == 0) {
          break label934;
        }
        paramBoolean = true;
        label577:
        ((Bundle)localObject4).putBoolean("key_ctrl_flag_open_weiyun", paramBoolean);
        if ((paramj.field_favProto.ukS & 0x40) == 0) {
          break label939;
        }
      }
      label924:
      label929:
      label934:
      label939:
      for (paramBoolean = true;; paramBoolean = false)
      {
        ((Bundle)localObject4).putBoolean("key_ctrl_flag_open_facebook", paramBoolean);
        w.i("MicroMsg.FavItemInfo", "get ctrl args=[%s]", new Object[] { ((Bundle)localObject4).toString() });
        ((Intent)localObject3).putExtra("favorite_control_argument", (Bundle)localObject4);
        ((Intent)localObject3).putExtra("sentUsername", paramj.field_fromUser);
        if ((localtw != null) && (!bg.nm(localtw.eAr))) {
          ((Intent)localObject3).putExtra("srcDisplayname", r.fs(localtw.eAr));
        }
        ((Intent)localObject3).putExtra("mode", 1);
        ((Intent)localObject3).putExtra("geta8key_scene", 14);
        localObject4 = new Bundle();
        ((Bundle)localObject4).putString("key_snsad_statextstr", x.n(paramj).eTv);
        ((Intent)localObject3).putExtra("jsapiargs", (Bundle)localObject4);
        ((Intent)localObject3).putExtra("from_scence", 4);
        localObject4 = "fav_" + q.zE() + "_" + paramj.field_id;
        ((Intent)localObject3).putExtra("KPublisherId", (String)localObject4);
        ((Intent)localObject3).putExtra("pre_username", paramj.field_fromUser);
        ((Intent)localObject3).putExtra("prePublishId", (String)localObject4);
        ((Intent)localObject3).putExtra("preUsername", paramj.field_fromUser);
        ((Intent)localObject3).putExtra("share_report_pre_msg_url", (String)localObject5);
        ((Intent)localObject3).putExtra("share_report_pre_msg_title", (String)localObject2);
        ((Intent)localObject3).putExtra("share_report_pre_msg_desc", (String)localObject1);
        ((Intent)localObject3).putExtra("share_report_pre_msg_icon_url", D(paramj));
        ((Intent)localObject3).putExtra("share_report_pre_msg_appid", "");
        ((Intent)localObject3).putExtra("share_report_from_scene", 4);
        com.tencent.mm.plugin.favorite.c.j((Intent)localObject3, paramContext);
        GMTrace.o(6424063115264L, 47863);
        return;
        paramBoolean = false;
        break;
        paramBoolean = false;
        break label529;
        paramBoolean = false;
        break label553;
        paramBoolean = false;
        break label577;
      }
      localObject2 = localObject4;
    }
  }
  
  public static void e(Context paramContext, j paramj)
  {
    GMTrace.i(6424465768448L, 47866);
    Intent localIntent = new Intent(paramContext, FavoriteImgDetailUI.class);
    localIntent.putExtra("key_detail_info_id", paramj.field_localId);
    paramContext.startActivity(localIntent);
    GMTrace.o(6424465768448L, 47866);
  }
  
  public static boolean k(th paramth)
  {
    GMTrace.i(6423526244352L, 47859);
    apv localapv = com.tencent.mm.at.b.JS();
    if ((localapv != null) && (localapv.uFq == 6) && (bg.aq(paramth.lhq, "").equals(localapv.ucY)) && (com.tencent.mm.at.b.JQ()))
    {
      GMTrace.o(6423526244352L, 47859);
      return true;
    }
    GMTrace.o(6423526244352L, 47859);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\c\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */