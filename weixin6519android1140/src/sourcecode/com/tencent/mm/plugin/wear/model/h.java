package com.tencent.mm.plugin.wear.model;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.si;
import com.tencent.mm.g.a.si.b;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.j.a;
import com.tencent.mm.protocal.c.brr;
import com.tencent.mm.protocal.c.bsi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.au.a;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.x;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.r;
import com.tencent.mm.y.s;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

public final class h
{
  public static byte[] K(Bitmap paramBitmap)
  {
    GMTrace.i(9172439531520L, 68340);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream);
    paramBitmap = localByteArrayOutputStream.toByteArray();
    GMTrace.o(9172439531520L, 68340);
    return paramBitmap;
  }
  
  public static final Bitmap KW(String paramString)
  {
    GMTrace.i(9172036878336L, 68337);
    Bitmap localBitmap = a.b.bKI().bw(paramString);
    if (localBitmap == null)
    {
      com.tencent.mm.ac.n.Dh();
      paramString = com.tencent.mm.ac.d.t(paramString, false);
      w.d("MicroMsg.Wear.WearUtil", "avatar fullpath: %s", new Object[] { paramString });
    }
    for (paramString = com.tencent.mm.ac.d.ia(paramString);; paramString = localBitmap)
    {
      GMTrace.o(9172036878336L, 68337);
      return paramString;
      w.d("MicroMsg.Wear.WearUtil", "get wear avatar from cache: %s", new Object[] { paramString });
    }
  }
  
  public static String KX(String paramString)
  {
    GMTrace.i(9172171096064L, 68338);
    at.AR();
    x localx = com.tencent.mm.y.c.yK().TE(paramString);
    String str;
    if (s.eb(paramString))
    {
      str = ab.getContext().getString(R.l.dhh);
      paramString = r.a(localx, paramString);
      if ((localx.field_username.equals(paramString)) || (bg.nm(paramString))) {
        break label82;
      }
    }
    for (;;)
    {
      GMTrace.o(9172171096064L, 68338);
      return paramString;
      paramString = r.a(localx, paramString);
      continue;
      label82:
      paramString = str;
    }
  }
  
  public static byte[] KY(String paramString)
  {
    GMTrace.i(9172842184704L, 68343);
    paramString = "lib" + paramString + ".so";
    paramString = FileOp.c(new File(new File(com.tencent.mm.loader.stub.a.ghu, "lib"), paramString).getAbsolutePath(), 0, -1);
    GMTrace.o(9172842184704L, 68343);
    return paramString;
  }
  
  public static bsi V(au paramau)
  {
    GMTrace.i(9172305313792L, 68339);
    bsi localbsi = new bsi();
    localbsi.vbw = paramau.field_msgId;
    localbsi.vbB = paramau.field_createTime;
    localbsi.lQc = 1;
    localbsi.vbC = true;
    Object localObject2;
    Object localObject1;
    label100:
    int i;
    if (paramau.field_isSend == 1)
    {
      localbsi.uBf = KX(com.tencent.mm.y.q.zE());
      localbsi.vbv = com.tencent.mm.y.q.zE();
      localObject2 = null;
      if (paramau.isSystem())
      {
        localObject1 = ab.getContext().getString(R.l.dMK);
        localbsi.lQc = 3;
        paramau = (au)localObject1;
        if (localObject1 == null) {
          paramau = ab.getContext().getString(R.l.dMJ);
        }
        localbsi.nIp = paramau;
        GMTrace.o(9172305313792L, 68339);
        return localbsi;
      }
    }
    else if (s.eb(paramau.field_talker))
    {
      localObject1 = paramau.field_talker;
      i = bc.gO(paramau.field_content);
      if (i == -1) {
        break label1550;
      }
      localObject2 = paramau.field_content.substring(0, i).trim();
      if ((localObject2 == null) || (((String)localObject2).length() <= 0)) {
        break label1550;
      }
      localObject1 = localObject2;
    }
    label1199:
    label1305:
    label1359:
    label1448:
    label1453:
    label1466:
    label1547:
    label1550:
    for (;;)
    {
      localbsi.uBf = KX((String)localObject1);
      localbsi.vbv = ((String)localObject1);
      break;
      localbsi.uBf = KX(paramau.field_talker);
      localbsi.vbv = paramau.field_talker;
      break;
      if (paramau.bTC())
      {
        localObject1 = ab.getContext().getString(R.l.dMq);
        localbsi.lQc = 4;
        break label100;
      }
      if (paramau.bTF())
      {
        if ((s.eb(paramau.field_talker)) && (paramau.field_isSend != 1))
        {
          i = bc.gO(paramau.field_content);
          if (i != -1)
          {
            localObject1 = paramau.field_content.substring(i + 1).trim();
            break label100;
          }
          localObject1 = paramau.field_content;
          break label100;
        }
        localObject1 = paramau.field_content;
        break label100;
      }
      if (paramau.bTu())
      {
        localObject1 = ab.getContext().getString(R.l.dMM);
        localbsi.lQc = 6;
        localbsi.vbC = com.tencent.mm.modelvoice.q.B(paramau);
        float f = com.tencent.mm.modelvoice.q.aD(new com.tencent.mm.modelvoice.n(paramau.field_content).time);
        localbsi.vbD = new com.tencent.mm.bm.b(ab.getContext().getString(R.l.dxn, new Object[] { Integer.valueOf((int)f) }).getBytes());
        break label100;
      }
      if (paramau.bTG())
      {
        localObject1 = ab.getContext().getString(R.l.dML);
        break label100;
      }
      if (paramau.bTH())
      {
        localObject1 = ab.getContext().getString(R.l.dMI);
        break label100;
      }
      if (paramau.bTv())
      {
        f.a locala = f.a.eS(paramau.field_content);
        localObject1 = localObject2;
        if (locala == null) {
          break label100;
        }
        if (locala.gkb.startsWith("wxpay://c2cbizmessagehandler/hongbao/receivehongbao"))
        {
          localbsi.lQc = 5;
          if (paramau.field_isSend == 1)
          {
            localObject1 = locala.gjV;
            break label100;
          }
          localObject1 = locala.gjU;
          break label100;
        }
        if (paramau.field_isSend == 1) {}
        for (paramau = locala.gjV;; paramau = locala.gjU)
        {
          localObject1 = ab.getContext().getString(R.l.dMk, new Object[] { paramau });
          break;
        }
      }
      if (paramau.bTw())
      {
        localObject1 = ab.getContext().getString(R.l.dMj);
        localbsi.lQc = 5;
        break label100;
      }
      if (paramau.aCp())
      {
        paramau = f.a.eS(paramau.field_content);
        localObject1 = localObject2;
        if (paramau == null) {
          break label100;
        }
        switch (paramau.type)
        {
        case 7: 
        case 9: 
        case 11: 
        case 12: 
        case 14: 
        case 17: 
        case 18: 
        default: 
          localObject1 = localObject2;
          break;
        case 2: 
          localObject1 = String.format(ab.getContext().getString(R.l.dMq), new Object[0]);
          break;
        case 5: 
          localObject1 = String.format(ab.getContext().getString(R.l.dMb), new Object[] { bg.aq(paramau.title, "") });
          break;
        case 3: 
          localObject1 = String.format(ab.getContext().getString(R.l.dMe), new Object[] { bg.aq(paramau.title, "") });
          break;
        case 6: 
          localObject1 = String.format(ab.getContext().getString(R.l.dMa), new Object[] { bg.aq(paramau.title, "") });
          break;
        case 4: 
          localObject1 = String.format(ab.getContext().getString(R.l.dMi), new Object[] { bg.aq(paramau.title, "") });
          break;
        case 19: 
          localObject1 = String.format(ab.getContext().getString(R.l.dMg), new Object[] { bg.aq(paramau.title, "") });
          break;
        case 15: 
          localObject1 = String.format(ab.getContext().getString(R.l.dLZ), new Object[] { bg.aq(paramau.title, "") });
          break;
        case 10: 
          localObject1 = String.format(ab.getContext().getString(R.l.dMf), new Object[] { bg.aq(paramau.title, "") });
          break;
        case 13: 
          localObject1 = String.format(ab.getContext().getString(R.l.dMd), new Object[] { bg.aq(paramau.title, "") });
          break;
        case 20: 
          localObject1 = String.format(ab.getContext().getString(R.l.dMh), new Object[] { bg.aq(paramau.title, "") });
          break;
        case 16: 
          localObject1 = String.format(ab.getContext().getString(R.l.dMl), new Object[] { bg.aq(paramau.title, "") });
          break;
        case 8: 
          localObject1 = ab.getContext().getString(R.l.dMm, new Object[] { bg.aq(paramau.title, "") });
          break;
        }
      }
      if (paramau.bTI())
      {
        localObject1 = ab.getContext().getString(R.l.dMn);
        if (((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr() == null) {
          break label1547;
        }
        paramau = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vP(paramau.field_imgPath);
        if (bg.nm(((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vM(paramau.GS())))
        {
          localObject1 = ab.getContext().getString(R.l.dMn);
          localObject2 = new brr();
          ((brr)localObject2).ugH = paramau.GS();
          if (!paramau.isGif()) {
            break label1305;
          }
          ((brr)localObject2).jib = 1;
        }
      }
      try
      {
        for (;;)
        {
          localbsi.vbD = new com.tencent.mm.bm.b(((brr)localObject2).toByteArray());
          localbsi.lQc = 2;
          break;
          localObject1 = "[" + ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vM(paramau.GS()) + "]";
          break label1199;
          ((brr)localObject2).jib = 2;
        }
        if (paramau.bTE())
        {
          localObject1 = ab.getContext().getString(R.l.dMr);
          break label100;
        }
        if ((!paramau.bTy()) && (!paramau.bTz()))
        {
          if (paramau.field_type == 64)
          {
            i = 1;
            if (i == 0) {
              break label1466;
            }
          }
        }
        else if (!paramau.field_content.equals(au.vBl))
        {
          paramau = paramau.field_content;
          localObject1 = new si();
          ((si)localObject1).eXf.eHJ = 1;
          ((si)localObject1).eXf.content = paramau;
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
          if (((si)localObject1).eXg.type != 3) {
            break label1448;
          }
        }
        for (i = 1;; i = 0)
        {
          if (i == 0) {
            break label1453;
          }
          localObject1 = ab.getContext().getString(R.l.dMO);
          break;
          i = 0;
          break label1359;
        }
        localObject1 = ab.getContext().getString(R.l.dMN);
        break label100;
        if (paramau.bTD())
        {
          at.AR();
          paramau = com.tencent.mm.y.c.yM().Cn(paramau.field_content);
          localObject1 = String.format(ab.getContext().getString(R.l.dMl), new Object[] { paramau.getDisplayName() });
          break label100;
        }
        localObject1 = localObject2;
        if (paramau.field_type != -1879048186) {
          break label100;
        }
        localObject1 = ab.getContext().getString(R.l.dMc);
      }
      catch (IOException paramau)
      {
        for (;;) {}
      }
      break label100;
    }
  }
  
  public static boolean aqY()
  {
    boolean bool = true;
    GMTrace.i(9172573749248L, 68341);
    PackageManager localPackageManager = ab.getContext().getPackageManager();
    try
    {
      localPackageManager.getPackageInfo("com.google.android.wearable.app.cn", 1);
      GMTrace.o(9172573749248L, 68341);
      return bool;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        bool = false;
      }
    }
  }
  
  public static boolean aqZ()
  {
    boolean bool = true;
    GMTrace.i(9172707966976L, 68342);
    PackageManager localPackageManager = ab.getContext().getPackageManager();
    try
    {
      localPackageManager.getPackageInfo("com.google.android.wearable.app", 1);
      GMTrace.o(9172707966976L, 68342);
      return bool;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        bool = false;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wear\model\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */