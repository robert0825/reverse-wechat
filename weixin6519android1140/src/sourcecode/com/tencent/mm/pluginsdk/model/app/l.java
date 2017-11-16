package com.tencent.mm.pluginsdk.model.app;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory.Options;
import android.util.DisplayMetrics;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.rp;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.mm.opensdk.modelmsg.WXDesignerSharedObject;
import com.tencent.mm.opensdk.modelmsg.WXEmojiObject;
import com.tencent.mm.opensdk.modelmsg.WXEmojiPageSharedObject;
import com.tencent.mm.opensdk.modelmsg.WXEmojiSharedObject;
import com.tencent.mm.opensdk.modelmsg.WXFileObject;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject;
import com.tencent.mm.opensdk.modelmsg.WXMusicObject;
import com.tencent.mm.opensdk.modelmsg.WXTextObject;
import com.tencent.mm.opensdk.modelmsg.WXVideoObject;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.d;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.KVStatHelper;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.q;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public final class l
{
  private static ab toa;
  
  public static b OA(String paramString)
  {
    GMTrace.i(832552566784L, 6203);
    b localb2 = new b();
    if (bg.nm(paramString))
    {
      GMTrace.o(832552566784L, 6203);
      return null;
    }
    w.i("MicroMsg.AppMsgLogic", "getAppAttachInfoByAttachId %s", new Object[] { paramString });
    long l = bg.getLong(paramString, -1L);
    b localb1;
    if (l != -1L)
    {
      an.afP().b(l, localb2);
      localb1 = localb2;
      if (localb2.vmr != l)
      {
        localb2 = an.afP().Op(paramString);
        if (localb2 != null)
        {
          localb1 = localb2;
          if (localb2.field_mediaSvrId.equals(paramString)) {}
        }
        else
        {
          w.i("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfoByAttachId set appAttachInfo null 1");
          localb1 = null;
        }
      }
    }
    for (;;)
    {
      w.i("MicroMsg.AppMsgLogic", "getAppAttachInfoByAttachId %s id %s", new Object[] { paramString, Long.valueOf(l) });
      GMTrace.o(832552566784L, 6203);
      return localb1;
      localb2 = an.afP().Op(paramString);
      if (localb2 != null)
      {
        localb1 = localb2;
        if (localb2.field_mediaSvrId.equals(paramString)) {}
      }
      else
      {
        w.i("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfoByAttachId set appAttachInfo null 2");
        localb1 = null;
      }
    }
  }
  
  public static boolean Oy(String paramString)
  {
    GMTrace.i(829868212224L, 6183);
    if (bg.nm(paramString))
    {
      GMTrace.o(829868212224L, 6183);
      return false;
    }
    if (paramString.equals("0:0"))
    {
      GMTrace.o(829868212224L, 6183);
      return false;
    }
    GMTrace.o(829868212224L, 6183);
    return true;
  }
  
  public static int Oz(String paramString)
  {
    GMTrace.i(830270865408L, 6186);
    f.a locala = f.a.eS(paramString);
    if (locala == null)
    {
      GMTrace.o(830270865408L, 6186);
      return -1;
    }
    if (!Oy(locala.eAE))
    {
      GMTrace.o(830270865408L, 6186);
      return -1;
    }
    b localb = new b();
    long l = bg.getLong(locala.eAE, -1L);
    if (l != -1L)
    {
      an.afP().b(l, localb);
      paramString = localb;
      if (localb.vmr != l)
      {
        localb = an.afP().Op(locala.eAE);
        if (localb != null)
        {
          paramString = localb;
          if (localb.field_mediaSvrId.equals(locala.eAE)) {}
        }
        else
        {
          GMTrace.o(830270865408L, 6186);
          return -1;
        }
      }
    }
    else
    {
      localb = an.afP().Op(locala.eAE);
      if (localb != null)
      {
        paramString = localb;
        if (localb.field_mediaSvrId.equals(locala.eAE)) {}
      }
      else
      {
        GMTrace.o(830270865408L, 6186);
        return -1;
      }
    }
    if (paramString.field_totalLen == 0L)
    {
      GMTrace.o(830270865408L, 6186);
      return -1;
    }
    int i = (int)(paramString.field_offset * 100L / paramString.field_totalLen);
    GMTrace.o(830270865408L, 6186);
    return i;
  }
  
  public static void Z(au paramau)
  {
    GMTrace.i(832686784512L, 6204);
    Object localObject5 = f.a.eS(paramau.field_content);
    if (localObject5 == null)
    {
      w.e("MicroMsg.AppMsgLogic", "resend app message error: app content null");
      GMTrace.o(832686784512L, 6204);
      return;
    }
    Object localObject4 = OA(((f.a)localObject5).eAE);
    Object localObject2 = "";
    Object localObject1 = localObject2;
    if (localObject4 != null)
    {
      localObject1 = localObject2;
      if (((b)localObject4).field_fileFullPath != null)
      {
        localObject1 = localObject2;
        if (!((b)localObject4).field_fileFullPath.equals(""))
        {
          at.AR();
          localObject1 = ad(com.tencent.mm.y.c.zg(), ((f.a)localObject5).title, ((f.a)localObject5).giw);
          j.r(((b)localObject4).field_fileFullPath, (String)localObject1, false);
        }
      }
    }
    localObject4 = null;
    localObject2 = localObject4;
    if (paramau.field_imgPath != null)
    {
      localObject2 = localObject4;
      if (!paramau.field_imgPath.equals("")) {
        localObject2 = com.tencent.mm.ao.n.IZ().x(paramau.field_imgPath, true);
      }
    }
    try
    {
      localObject2 = com.tencent.mm.a.e.c((String)localObject2, 0, com.tencent.mm.a.e.aY((String)localObject2));
      f.a locala = f.a.a((f.a)localObject5);
      localObject4 = ((f.a)localObject5).appId;
      localObject5 = ((f.a)localObject5).appName;
      localObject4 = System.currentTimeMillis();
      if (!bg.nm((String)localObject1))
      {
        localObject4 = a((String)localObject4, locala, (String)localObject1);
        localObject1 = localObject4;
        if (localObject4 == null)
        {
          com.tencent.mm.compatible.util.g.tA();
          GMTrace.o(832686784512L, 6204);
        }
      }
      else
      {
        localObject1 = null;
      }
      localObject4 = new au();
      if ((localObject2 != null) && (localObject2.length > 0)) {
        if (locala.type != 2) {
          break label602;
        }
      }
      long l;
      label602:
      for (boolean bool = true;; bool = false)
      {
        localObject2 = com.tencent.mm.ao.n.IZ().a(6, (byte[])localObject2, bool, Bitmap.CompressFormat.PNG);
        w.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.tC() + " thumbData MsgInfo path:" + (String)localObject2);
        if (!bg.nm((String)localObject2))
        {
          ((au)localObject4).dc((String)localObject2);
          w.d("MicroMsg.AppMsgLogic", "new thumbnail saved, path" + (String)localObject2);
        }
        if (localObject1 != null) {
          locala.eAE = ((b)localObject1).vmr;
        }
        ((au)localObject4).setContent(f.a.a(locala, null, null));
        ((au)localObject4).dB(1);
        ((au)localObject4).db(paramau.field_talker);
        ((au)localObject4).E(bc.gR(paramau.field_talker));
        ((au)localObject4).dC(1);
        ((au)localObject4).setType(d(locala));
        if (com.tencent.mm.af.f.dL(((ce)localObject4).field_talker))
        {
          ((au)localObject4).dh(com.tencent.mm.af.a.e.Br());
          w.d("MicroMsg.AppMsgLogic", "NetSceneSendMsg:MsgSource:%s", new Object[] { ((ce)localObject4).fwv });
        }
        at.AR();
        l = com.tencent.mm.y.c.yM().P((au)localObject4);
        w.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.tC() + " msginfo insert id: " + l);
        if (l >= 0L) {
          break;
        }
        w.e("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.tC() + "insert msg failed :" + l);
        com.tencent.mm.compatible.util.g.tA();
        GMTrace.o(832686784512L, 6204);
        return;
      }
      w.i("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.tA() + " new msg inserted to db , local id = " + l);
      ((au)localObject4).C(l);
      localObject2 = new rp();
      ((rp)localObject2).eWt.eWu = paramau.field_msgId;
      ((rp)localObject2).eWt.eWv = l;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
      paramau = new com.tencent.mm.x.f();
      paramau.field_xml = ((ce)localObject4).field_content;
      paramau.field_title = locala.title;
      paramau.field_type = locala.type;
      paramau.field_description = locala.description;
      paramau.field_msgId = l;
      paramau.field_source = ((String)localObject5);
      an.bJI().b(paramau);
      if (localObject1 != null)
      {
        ((b)localObject1).field_msgInfoId = l;
        ((b)localObject1).field_status = 101L;
        an.afP().c((com.tencent.mm.sdk.e.c)localObject1, new String[0]);
        an.bJK().run();
        GMTrace.o(832686784512L, 6204);
        return;
      }
      an.bJK();
      am.a.ev(l);
      GMTrace.o(832686784512L, 6204);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject3 = localObject4;
      }
    }
  }
  
  public static int a(long paramLong, String paramString, keep_SceneResult paramkeep_SceneResult)
  {
    GMTrace.i(14628658610176L, 108992);
    at.AR();
    au localau = com.tencent.mm.y.c.yM().cM(paramLong);
    int i;
    if (localau.field_msgId != paramLong)
    {
      w.e("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.tC() + " getmsgFailed id:" + paramLong);
      i = com.tencent.mm.compatible.util.g.tA();
      GMTrace.o(14628658610176L, 108992);
      return 0 - i;
    }
    f.a locala = f.a.eS(localau.field_content);
    if (locala == null)
    {
      w.e("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.tC() + " getmsgFailed id:" + paramLong);
      i = com.tencent.mm.compatible.util.g.tA();
      GMTrace.o(14628658610176L, 108992);
      return 0 - i;
    }
    locala.eAE = paramString;
    localau.setContent(f.a.a(locala, locala.eAE, paramkeep_SceneResult));
    at.AR();
    com.tencent.mm.y.c.yM().a(localau.field_msgId, localau);
    paramkeep_SceneResult = an.bJI().er(paramLong);
    if (paramkeep_SceneResult != null)
    {
      paramkeep_SceneResult.field_xml = localau.field_content;
      an.bJI().c(paramkeep_SceneResult, new String[] { "msgId" });
    }
    paramkeep_SceneResult = an.afP().eq(paramLong);
    paramkeep_SceneResult.field_mediaSvrId = paramString;
    paramkeep_SceneResult.field_offset = paramkeep_SceneResult.field_totalLen;
    an.afP().c(paramkeep_SceneResult, new String[0]);
    GMTrace.o(14628658610176L, 108992);
    return 0;
  }
  
  public static int a(WXMediaMessage paramWXMediaMessage, String paramString1, String paramString2, String paramString3, int paramInt, String paramString4)
  {
    GMTrace.i(831881478144L, 6198);
    paramInt = a(paramWXMediaMessage, paramString1, paramString2, paramString3, paramInt, paramString4, null);
    GMTrace.o(831881478144L, 6198);
    return paramInt;
  }
  
  public static int a(WXMediaMessage paramWXMediaMessage, String paramString1, String paramString2, String paramString3, int paramInt, String paramString4, String paramString5)
  {
    GMTrace.i(832015695872L, 6199);
    f.a locala = new f.a();
    locala.appId = paramString1;
    locala.appName = paramString2;
    locala.giy = paramInt;
    paramInt = a(locala, paramWXMediaMessage, paramString3, paramString4, paramString5);
    GMTrace.o(832015695872L, 6199);
    return paramInt;
  }
  
  public static int a(f.a parama, WXMediaMessage paramWXMediaMessage, String paramString)
  {
    GMTrace.i(17956184522752L, 133784);
    int i = a(parama, paramWXMediaMessage, paramString, null, null);
    GMTrace.o(17956184522752L, 133784);
    return i;
  }
  
  private static int a(f.a parama, WXMediaMessage paramWXMediaMessage, String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(832149913600L, 6200);
    Object localObject2 = b(parama, paramWXMediaMessage, paramString2);
    w.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.tC() + "summerbig content url:" + parama.url + " lowUrl:" + parama.giu + " attachlen:" + parama.giv + " attachid:" + parama.eAE + " attach file:" + (String)localObject2);
    Object localObject1 = System.currentTimeMillis();
    int i;
    if (!bg.nm((String)localObject2))
    {
      localObject1 = a((String)localObject1, parama, (String)localObject2);
      if (localObject1 == null)
      {
        i = com.tencent.mm.compatible.util.g.tA();
        GMTrace.o(832149913600L, 6200);
        return 0 - i;
      }
      localObject2 = d.RB((String)localObject2);
      if (localObject2 != null)
      {
        parama.giI = ((BitmapFactory.Options)localObject2).outWidth;
        parama.giH = ((BitmapFactory.Options)localObject2).outHeight;
      }
    }
    for (;;)
    {
      au localau = new au();
      boolean bool;
      if ((paramWXMediaMessage.thumbData != null) && (paramWXMediaMessage.thumbData.length > 0))
      {
        if ((paramWXMediaMessage.thumbData.length <= 32768) || (paramWXMediaMessage.getType() == 36)) {
          break label528;
        }
        if (parama.type != 2) {
          break label522;
        }
        bool = true;
        localObject2 = com.tencent.mm.ao.n.IZ().a(6, paramWXMediaMessage.thumbData, bool, Bitmap.CompressFormat.JPEG);
        label265:
        w.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.tC() + " summerbig thumbData MsgInfo path:" + (String)localObject2);
        if (!bg.nm((String)localObject2)) {
          localau.dc((String)localObject2);
        }
      }
      if (localObject1 != null) {
        parama.eAE = ((b)localObject1).vmr;
      }
      paramString1 = bg.g(paramString1.split(",")).iterator();
      for (;;)
      {
        if (!paramString1.hasNext()) {
          break label834;
        }
        localObject2 = (String)paramString1.next();
        parama.gix = paramString2;
        localau.setContent(f.a.a(parama, null, null));
        localau.dB(1);
        localau.db((String)localObject2);
        localau.E(bc.gR((String)localObject2));
        localau.dC(1);
        localau.setType(d(parama));
        if (com.tencent.mm.af.f.dL(localau.field_talker)) {
          localau.dh(com.tencent.mm.af.a.e.Br());
        }
        at.AR();
        long l = com.tencent.mm.y.c.yM().P(localau);
        if (l < 0L)
        {
          w.e("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.tC() + " summerbig insert msg failed :" + l);
          i = com.tencent.mm.compatible.util.g.tA();
          GMTrace.o(832149913600L, 6200);
          return 0 - i;
          label522:
          bool = false;
          break;
          label528:
          localObject2 = com.tencent.mm.ao.n.IZ().f(6, paramWXMediaMessage.thumbData);
          break label265;
        }
        w.i("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.tA() + " summerbig new msg inserted to db , local id = " + l);
        localau.C(l);
        localObject2 = new com.tencent.mm.x.f();
        ((com.tencent.mm.x.f)localObject2).field_xml = localau.field_content;
        ((com.tencent.mm.x.f)localObject2).field_title = paramWXMediaMessage.title;
        ((com.tencent.mm.x.f)localObject2).field_type = paramWXMediaMessage.mediaObject.type();
        ((com.tencent.mm.x.f)localObject2).field_description = paramWXMediaMessage.description;
        ((com.tencent.mm.x.f)localObject2).field_msgId = l;
        ((com.tencent.mm.x.f)localObject2).field_source = parama.appName;
        an.bJI().b((com.tencent.mm.sdk.e.c)localObject2);
        if (localObject1 != null)
        {
          ((b)localObject1).field_msgInfoId = l;
          ((b)localObject1).field_status = 101L;
          w.i("MicroMsg.AppMsgLogic", "summerbig sendAppMsg update attInfo field_msgInfoId[%d], field_status[%d], systemRowid[%d], type[%d]", new Object[] { Long.valueOf(((b)localObject1).field_msgInfoId), Long.valueOf(((b)localObject1).field_status), Long.valueOf(((b)localObject1).vmr), Integer.valueOf(((com.tencent.mm.x.f)localObject2).field_type) });
          an.afP().c((com.tencent.mm.sdk.e.c)localObject1, new String[0]);
          if (!bg.nm(paramString3)) {
            an.bJK().t(((b)localObject1).field_msgInfoId, paramString3);
          }
          an.bJK().run();
        }
        else
        {
          w.i("MicroMsg.AppMsgLogic", "summerbig sendAppMsg dosceneSendAppMsg attInfo[%s], msgId[%d], sessionId[%s], type[%d]", new Object[] { localObject1, Long.valueOf(l), paramString3, Integer.valueOf(((com.tencent.mm.x.f)localObject2).field_type) });
          an.bJK();
          am.a.u(l, paramString3);
        }
      }
      label834:
      GMTrace.o(832149913600L, 6200);
      return 0;
      localObject1 = null;
    }
  }
  
  public static int a(f.a parama, String paramString1, String paramString2, String paramString3, String paramString4, byte[] paramArrayOfByte)
  {
    GMTrace.i(831478824960L, 6195);
    int i = a(parama, paramString1, paramString2, paramString3, paramString4, paramArrayOfByte, null);
    GMTrace.o(831478824960L, 6195);
    return i;
  }
  
  public static int a(f.a parama, String paramString1, String paramString2, String paramString3, String paramString4, byte[] paramArrayOfByte, String paramString5)
  {
    GMTrace.i(831613042688L, 6196);
    int i = a(parama, paramString1, paramString2, paramString3, paramString4, paramArrayOfByte, paramString5, "");
    GMTrace.o(831613042688L, 6196);
    return i;
  }
  
  public static int a(f.a parama, String paramString1, String paramString2, String paramString3, String paramString4, byte[] paramArrayOfByte, String paramString5, String paramString6)
  {
    GMTrace.i(831747260416L, 6197);
    w.i("MicroMsg.AppMsgLogic", "summerbig sendAppMsg attachFilePath[%s], content[%s]", new Object[] { paramString4, parama });
    String str = null;
    Object localObject = System.currentTimeMillis();
    int i;
    if (!bg.nm(paramString4))
    {
      paramString4 = a((String)localObject, parama, paramString4);
      str = paramString4;
      if (paramString4 == null)
      {
        i = com.tencent.mm.compatible.util.g.tA();
        GMTrace.o(831747260416L, 6197);
        return 0 - i;
      }
    }
    localObject = new au();
    if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0))
    {
      if ((parama.type != 33) && (parama.type != 36)) {
        break label467;
      }
      i = (int)(d.bPv().density * 215.0F);
      int j = (int)(d.bPv().density * 215.0F);
      paramString4 = com.tencent.mm.ao.n.IZ().a(paramArrayOfByte, Bitmap.CompressFormat.JPEG, i, j);
      w.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.tC() + " thumbData MsgInfo path:" + paramString4);
      if (!bg.nm(paramString4))
      {
        ((au)localObject).dc(paramString4);
        w.d("MicroMsg.AppMsgLogic", "new thumbnail saved, path" + paramString4);
      }
    }
    if (str != null) {
      parama.eAE = str.vmr;
    }
    ((au)localObject).setContent(f.a.a(parama, null, null));
    ((au)localObject).dB(1);
    ((au)localObject).db(paramString3);
    ((au)localObject).E(bc.gR(paramString3));
    ((au)localObject).dC(1);
    ((au)localObject).setType(d(parama));
    if (com.tencent.mm.af.f.dL(((ce)localObject).field_talker))
    {
      ((au)localObject).dh(com.tencent.mm.af.a.e.Br());
      w.d("MicroMsg.AppMsgLogic", "NetSceneSendMsg:MsgSource:%s", new Object[] { ((ce)localObject).fwv });
    }
    at.AR();
    long l = com.tencent.mm.y.c.yM().P((au)localObject);
    w.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.tC() + " msginfo insert id: " + l);
    label467:
    boolean bool;
    if (l < 0L)
    {
      w.e("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.tC() + "insert msg failed :" + l);
      i = com.tencent.mm.compatible.util.g.tA();
      GMTrace.o(831747260416L, 6197);
      return 0 - i;
      if (parama.type == 2) {}
      for (bool = true;; bool = false)
      {
        paramString4 = com.tencent.mm.ao.n.IZ().a(6, paramArrayOfByte, bool, Bitmap.CompressFormat.PNG);
        break;
      }
    }
    w.i("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.tA() + " new msg inserted to db , local id = " + l);
    ((au)localObject).C(l);
    paramString3 = new com.tencent.mm.x.f();
    paramString3.field_xml = ((ce)localObject).field_content;
    paramString3.field_appId = paramString1;
    paramString3.field_title = parama.title;
    paramString3.field_type = parama.type;
    paramString3.field_description = parama.description;
    paramString3.field_msgId = l;
    paramString3.field_source = paramString2;
    an.bJI().b(paramString3);
    if (str == null)
    {
      bool = true;
      w.i("MicroMsg.AppMsgLogic", "summerbig sendAppMsg attInfo is null[%b]", new Object[] { Boolean.valueOf(bool) });
      if (str == null) {
        break label718;
      }
      str.field_msgInfoId = l;
      str.field_status = 101L;
      an.afP().c(str, new String[0]);
      if ((parama.type == 2) || (!bg.nm(paramString5))) {
        an.bJK().t(l, paramString5);
      }
      an.bJK().run();
    }
    for (;;)
    {
      GMTrace.o(831747260416L, 6197);
      return 0;
      bool = false;
      break;
      label718:
      an.bJK();
      am.a.c(l, paramString5, paramString6);
    }
  }
  
  public static b a(String paramString1, long paramLong, int paramInt1, String paramString2, String paramString3, int paramInt2)
  {
    GMTrace.i(831076171776L, 6192);
    b localb = new b();
    localb.field_fileFullPath = paramString1;
    localb.field_appId = paramString2;
    localb.field_sdkVer = paramInt1;
    localb.field_mediaSvrId = paramString3;
    localb.field_totalLen = paramInt2;
    localb.field_status = 101L;
    localb.field_isUpload = false;
    localb.field_createTime = bg.Pv();
    localb.field_lastModifyTime = bg.Pu();
    localb.field_msgInfoId = paramLong;
    localb.field_netTimes = 0L;
    GMTrace.o(831076171776L, 6192);
    return localb;
  }
  
  public static b a(String paramString1, f.a parama, String paramString2)
  {
    GMTrace.i(831210389504L, 6193);
    w.i("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.tC() + " summerbig buildUploadAttachInfo clientAppDataId:" + paramString1 + " attach file :" + paramString2);
    Object localObject = paramString2.replace("//", "/");
    if (((String)localObject).startsWith(com.tencent.mm.compatible.util.e.ghu))
    {
      w.e("MicroMsg.AppMsgLogic", "summerbig Error attach path:%s", new Object[] { localObject });
      GMTrace.o(831210389504L, 6193);
      return null;
    }
    localObject = new b();
    ((b)localObject).field_totalLen = parama.giv;
    ((b)localObject).field_fileFullPath = paramString2;
    ((b)localObject).field_sdkVer = parama.sdkVer;
    ((b)localObject).field_appId = parama.appId;
    ((b)localObject).field_clientAppDataId = paramString1;
    ((b)localObject).field_type = parama.type;
    ((b)localObject).field_status = 200L;
    ((b)localObject).field_isUpload = true;
    ((b)localObject).field_createTime = bg.Pv();
    ((b)localObject).field_lastModifyTime = bg.Pu();
    ((b)localObject).field_mediaSvrId = bg.Pv();
    an.afP().b((com.tencent.mm.sdk.e.c)localObject);
    w.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.tC() + " summerbig buildUploadAttachInfo file:" + ((b)localObject).field_fileFullPath + " rowid:" + ((b)localObject).vmr + " clientAppDataId:" + ((b)localObject).field_clientAppDataId);
    if (((b)localObject).vmr < 0L)
    {
      w.e("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.tC() + " summerbig uploadAttach insert appattach info failed :" + ((b)localObject).vmr);
      GMTrace.o(831210389504L, 6193);
      return null;
    }
    GMTrace.o(831210389504L, 6193);
    return (b)localObject;
  }
  
  public static String a(String paramString1, long paramLong, int paramInt1, String paramString2, String paramString3, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(830941954048L, 6191);
    b localb = new b();
    localb.field_fileFullPath = paramString1;
    localb.field_appId = paramString2;
    localb.field_sdkVer = paramInt1;
    localb.field_mediaSvrId = paramString3;
    localb.field_totalLen = paramInt2;
    localb.field_status = 101L;
    localb.field_isUpload = false;
    localb.field_createTime = bg.Pv();
    localb.field_lastModifyTime = bg.Pu();
    localb.field_msgInfoId = paramLong;
    localb.field_netTimes = 0L;
    localb.field_type = paramInt3;
    w.i("MicroMsg.AppMsgLogic", "summerbig initDownloadAttach ret[%b], rowid[%d], field_totalLen[%d], type[%d], isLargeFile[%d], destFile[%s], stack[%s]", new Object[] { Boolean.valueOf(an.afP().b(localb)), Long.valueOf(localb.vmr), Long.valueOf(localb.field_totalLen), Long.valueOf(localb.field_type), Integer.valueOf(paramInt4), paramString1, bg.bQW() });
    GMTrace.o(830941954048L, 6191);
    return paramString3;
  }
  
  public static void a(au paramau, a parama)
  {
    GMTrace.i(16266383327232L, 121194);
    Object localObject1 = f.a.eS(paramau.field_content);
    if (localObject1 == null)
    {
      w.e("MicroMsg.AppMsgLogic", "parse msgContent error, %s", new Object[] { paramau.field_content });
      GMTrace.o(16266383327232L, 121194);
      return;
    }
    if ((bg.nm(((f.a)localObject1).eAE)) && (!bg.nm(((f.a)localObject1).giC)))
    {
      w.e("MicroMsg.AppMsgLogic", "msgContent format error, %s", new Object[] { paramau.field_content });
      ((f.a)localObject1).eAE = ((f.a)localObject1).giC.hashCode();
    }
    String str5 = ((f.a)localObject1).eAE;
    if (!a(paramau, ab(str5, paramau.field_msgId))) {
      if (paramau != null) {
        break label197;
      }
    }
    label197:
    int j;
    String str2;
    String str3;
    String str1;
    String str4;
    Object localObject2;
    for (int i = 0;; i = 0)
    {
      if (i != 0)
      {
        toa = new ab(paramau.field_msgId, str5, new com.tencent.mm.ad.f()
        {
          public final void a(int paramAnonymousInt1, int paramAnonymousInt2, com.tencent.mm.ad.k paramAnonymousk)
          {
            GMTrace.i(16266249109504L, 121193);
            if (this.tob != null) {
              this.tob.dR(paramAnonymousInt1, paramAnonymousInt2);
            }
            GMTrace.o(16266249109504L, 121193);
          }
        });
        at.wS().a(toa, 0);
      }
      GMTrace.o(16266383327232L, 121194);
      return;
      j = 1;
      str2 = null;
      str3 = null;
      str1 = null;
      str4 = null;
      localObject3 = null;
      localObject2 = ab(str5, paramau.field_msgId);
      localObject4 = f.a.eS(paramau.field_content);
      localObject1 = null;
      if (localObject2 != null) {
        localObject1 = ((b)localObject2).field_fileFullPath;
      }
      if ((localObject1 == null) || (((String)localObject1).length() <= 0)) {
        break;
      }
    }
    localObject1 = localObject3;
    if (localObject4 != null)
    {
      str2 = t.nl(((f.a)localObject4).title);
      str3 = t.nl(((f.a)localObject4).giw).toLowerCase();
      str1 = t.nl(((f.a)localObject4).filemd5);
      str4 = t.nl(((f.a)localObject4).eMI);
      localObject1 = t.nl(((f.a)localObject4).giJ);
    }
    if (localObject2 == null)
    {
      b(paramau.field_msgId, paramau.field_content, null);
      localObject3 = ab(str5, paramau.field_msgId);
      localObject2 = localObject3;
      i = j;
      if (localObject3 != null)
      {
        l1 = ((b)localObject3).vmr;
        l2 = ((b)localObject3).field_totalLen;
        localObject2 = ((b)localObject3).field_fileFullPath;
        l3 = ((b)localObject3).field_type;
        str6 = ((b)localObject3).field_mediaId;
        l4 = ((b)localObject3).field_msgInfoId;
        bool1 = ((b)localObject3).field_isUpload;
        if (((b)localObject3).field_signature != null) {
          break label587;
        }
        i = -1;
        label428:
        w.i("MicroMsg.AppMsgLogic", "summerbig tryInitAttachInfo newInfo systemRowid [%d], totalLen[%d], field_fileFullPath[%s], type[%d], mediaId[%s], msgid[%d], upload[%b], signature len[%d]", new Object[] { Long.valueOf(l1), Long.valueOf(l2), localObject2, Long.valueOf(l3), str6, Long.valueOf(l4), Boolean.valueOf(bool1), Integer.valueOf(i) });
        localObject2 = localObject3;
        i = j;
        if (localObject4 != null) {
          if (((f.a)localObject4).giz == 0)
          {
            localObject2 = localObject3;
            i = j;
            if (((f.a)localObject4).giv <= 26214400) {}
          }
          else
          {
            if (t.nm(((b)localObject3).field_signature)) {
              break label599;
            }
          }
        }
      }
      label587:
      label599:
      for (i = 1;; i = 0)
      {
        localObject2 = localObject3;
        if (i == 0) {
          at.wS().a(new y((b)localObject2, (String)localObject1, str1, str2, str3, str4), 0);
        }
        break;
        i = ((b)localObject3).field_signature.length();
        break label428;
      }
    }
    Object localObject3 = new File(((b)localObject2).field_fileFullPath);
    if ((((b)localObject2).field_status == 199L) && (!((File)localObject3).exists()))
    {
      w.i("MicroMsg.AppMsgLogic", "summerbig tryInitAttachInfo info exist but file not!");
      b(paramau.field_msgId, paramau.field_content, null);
    }
    long l1 = ((b)localObject2).vmr;
    long l2 = ((b)localObject2).field_totalLen;
    Object localObject4 = ((b)localObject2).field_fileFullPath;
    long l3 = ((b)localObject2).field_type;
    String str6 = ((b)localObject2).field_mediaId;
    long l4 = ((b)localObject2).field_msgInfoId;
    boolean bool1 = ((b)localObject2).field_isUpload;
    boolean bool2 = ((File)localObject3).exists();
    long l5 = ((b)localObject2).field_status;
    if (((b)localObject2).field_signature == null) {}
    for (i = -1;; i = ((b)localObject2).field_signature.length())
    {
      w.i("MicroMsg.AppMsgLogic", "summerbig tryInitAttachInfo info exist systemRowid [%d], totalLen[%d], field_fileFullPath[%s], type[%d], mediaId[%s], msgid[%d], upload[%b], file.exists[%b], status[%d], signature len[%d]", new Object[] { Long.valueOf(l1), Long.valueOf(l2), localObject4, Long.valueOf(l3), str6, Long.valueOf(l4), Boolean.valueOf(bool1), Boolean.valueOf(bool2), Long.valueOf(l5), Integer.valueOf(i) });
      i = j;
      break;
    }
  }
  
  public static boolean a(au paramau, b paramb)
  {
    GMTrace.i(830673518592L, 6189);
    if ((paramb == null) || (!new File(paramb.field_fileFullPath).exists()))
    {
      GMTrace.o(830673518592L, 6189);
      return false;
    }
    if ((paramb.aDI()) || ((paramau.field_isSend == 1) && (paramb.field_isUpload)))
    {
      GMTrace.o(830673518592L, 6189);
      return true;
    }
    GMTrace.o(830673518592L, 6189);
    return false;
  }
  
  private static String aW(byte[] paramArrayOfByte)
  {
    GMTrace.i(832284131328L, 6201);
    if (bg.bq(paramArrayOfByte))
    {
      w.e("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.tC() + " attachBuf is null");
      GMTrace.o(832284131328L, 6201);
      return null;
    }
    Object localObject = new StringBuilder();
    at.AR();
    localObject = com.tencent.mm.y.c.zg() + "ua_" + bg.Pv();
    w.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.tC() + " buildUploadAttachInfo file:" + (String)localObject);
    if (com.tencent.mm.a.e.b((String)localObject, paramArrayOfByte, paramArrayOfByte.length) != 0)
    {
      w.e("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.tC() + " writeFile error file:" + (String)localObject);
      GMTrace.o(832284131328L, 6201);
      return null;
    }
    GMTrace.o(832284131328L, 6201);
    return (String)localObject;
  }
  
  public static b ab(String paramString, long paramLong)
  {
    GMTrace.i(830807736320L, 6190);
    b localb = OA(paramString);
    paramString = localb;
    if (localb == null) {
      paramString = an.afP().eq(paramLong);
    }
    if (paramString != null) {
      w.i("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfo info[%s], rowid[%d], isUpload[%b], fullpath[%s], totallen[%d], offset[%d], mediaSvrId[%s], mediaid[%s], msgid[%d], type[%d], stack[%s]", new Object[] { paramString, Long.valueOf(paramString.vmr), Boolean.valueOf(paramString.field_isUpload), paramString.field_fileFullPath, Long.valueOf(paramString.field_totalLen), Long.valueOf(paramString.field_offset), paramString.field_mediaSvrId, paramString.field_mediaId, Long.valueOf(paramString.field_msgInfoId), Long.valueOf(paramString.field_type), t.Py() });
    }
    for (;;)
    {
      GMTrace.o(830807736320L, 6190);
      return paramString;
      w.w("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfo is null stack[%s]", new Object[] { t.Py() });
    }
  }
  
  public static String ad(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(16090558103552L, 119884);
    Object localObject;
    if (bg.nm(paramString2)) {
      localObject = paramString1 + "da_" + bg.Pv();
    }
    for (;;)
    {
      paramString1 = (String)localObject;
      if (!bg.nm(paramString3))
      {
        paramString1 = (String)localObject;
        if (!((String)localObject).endsWith(paramString3)) {
          paramString1 = (String)localObject + "." + paramString3;
        }
      }
      GMTrace.o(16090558103552L, 119884);
      return paramString1;
      String str = paramString1 + paramString2;
      localObject = str;
      if (com.tencent.mm.a.e.aZ(str))
      {
        paramString1 = new File(paramString1 + "/" + bg.Pv());
        if ((!paramString1.exists()) || (!paramString1.isDirectory())) {
          paramString1.mkdirs();
        }
        localObject = paramString1.getAbsolutePath() + "/" + paramString2;
      }
    }
  }
  
  public static String b(long paramLong, String paramString1, String paramString2)
  {
    GMTrace.i(830405083136L, 6187);
    w.i("MicroMsg.AppMsgLogic", "summerbig initDownloadAttach msgLocalId[%d], msgXml[%s], downloadPath[%s]", new Object[] { Long.valueOf(paramLong), paramString1, paramString2 });
    f.a locala = f.a.eS(paramString1);
    if (locala == null)
    {
      GMTrace.o(830405083136L, 6187);
      return null;
    }
    if (paramString2 != null) {}
    for (paramString1 = paramString2;; paramString1 = ad(com.tencent.mm.compatible.util.e.fRX, locala.title, locala.giw))
    {
      if ((bg.nm(locala.eAE)) && (!bg.nm(locala.giC))) {
        locala.eAE = locala.giC.hashCode();
      }
      int i = locala.sdkVer;
      paramString2 = locala.appId;
      String str1 = locala.eAE;
      int j = locala.giv;
      int k = locala.type;
      String str2 = locala.giJ;
      paramString1 = a(paramString1, paramLong, i, paramString2, str1, j, k, locala.giz);
      GMTrace.o(830405083136L, 6187);
      return paramString1;
    }
  }
  
  public static String b(f.a parama, WXMediaMessage paramWXMediaMessage, String paramString)
  {
    GMTrace.i(832418349056L, 6202);
    w.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.tC() + "mediaMessageToContent sdkver:" + paramWXMediaMessage.sdkVer + " title:" + paramWXMediaMessage.title + " desc:" + paramWXMediaMessage.description + " type:" + paramWXMediaMessage.mediaObject.type());
    parama.sdkVer = paramWXMediaMessage.sdkVer;
    parama.title = paramWXMediaMessage.title;
    parama.description = paramWXMediaMessage.description;
    parama.mediaTagName = paramWXMediaMessage.mediaTagName;
    parama.messageAction = paramWXMediaMessage.messageAction;
    parama.messageExt = paramWXMediaMessage.messageExt;
    paramWXMediaMessage = paramWXMediaMessage.mediaObject;
    parama.type = paramWXMediaMessage.type();
    if (parama.type == 7)
    {
      paramWXMediaMessage = (WXAppExtendObject)paramWXMediaMessage;
      parama.extInfo = paramWXMediaMessage.extInfo;
      if (!bg.bq(paramWXMediaMessage.fileData))
      {
        w.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.tC() + " fileData:" + paramWXMediaMessage.fileData.length);
        parama.giv = paramWXMediaMessage.fileData.length;
        parama = aW(paramWXMediaMessage.fileData);
        GMTrace.o(832418349056L, 6202);
        return parama;
      }
      parama.giv = com.tencent.mm.a.e.aY(paramWXMediaMessage.filePath);
      w.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.tC() + " read file:" + paramWXMediaMessage.filePath + " len:" + parama.giv);
      if (parama.giv > 0)
      {
        parama.giw = com.tencent.mm.a.e.bb(paramWXMediaMessage.filePath);
        parama = paramWXMediaMessage.filePath;
        GMTrace.o(832418349056L, 6202);
        return parama;
      }
      GMTrace.o(832418349056L, 6202);
      return null;
    }
    if (parama.type == 6)
    {
      paramWXMediaMessage = (WXFileObject)paramWXMediaMessage;
      if (!bg.bq(paramWXMediaMessage.fileData))
      {
        w.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.tC() + " fileData:" + paramWXMediaMessage.fileData.length);
        parama.giv = paramWXMediaMessage.fileData.length;
        parama = aW(paramWXMediaMessage.fileData);
        GMTrace.o(832418349056L, 6202);
        return parama;
      }
      parama.giv = com.tencent.mm.a.e.aY(paramWXMediaMessage.filePath);
      w.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.tC() + " read file:" + paramWXMediaMessage.filePath + " len:" + parama.giv);
      if (parama.giv > 0)
      {
        parama.giw = com.tencent.mm.a.e.bb(paramWXMediaMessage.filePath);
        parama = paramWXMediaMessage.filePath;
        GMTrace.o(832418349056L, 6202);
        return parama;
      }
      GMTrace.o(832418349056L, 6202);
      return null;
    }
    if (parama.type == 2)
    {
      paramWXMediaMessage = (WXImageObject)paramWXMediaMessage;
      if (!bg.bq(paramWXMediaMessage.imageData))
      {
        w.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.tC() + " fileData:" + paramWXMediaMessage.imageData.length);
        parama.giv = paramWXMediaMessage.imageData.length;
        parama = aW(paramWXMediaMessage.imageData);
        GMTrace.o(832418349056L, 6202);
        return parama;
      }
      if (!bg.nm(paramWXMediaMessage.imagePath))
      {
        parama.giv = com.tencent.mm.a.e.aY(paramWXMediaMessage.imagePath);
        w.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.tC() + " read file:" + paramWXMediaMessage.imagePath + " len:" + parama.giv);
        if (parama.giv > 0)
        {
          parama.giw = com.tencent.mm.a.e.bb(paramWXMediaMessage.imagePath);
          at.AR();
          parama = new File(com.tencent.mm.y.c.zg(), "appmsg_img_" + System.currentTimeMillis()).getAbsolutePath();
          paramString = d.RB(paramWXMediaMessage.imagePath);
          if ((paramString == null) || (paramString.outWidth <= 0) || (paramString.outHeight <= 0))
          {
            boolean bool;
            int i;
            if (paramString == null)
            {
              bool = true;
              if (paramString != null) {
                break label845;
              }
              i = -1;
              label786:
              if (paramString != null) {
                break label853;
              }
            }
            label845:
            label853:
            for (int j = -1;; j = paramString.outHeight)
            {
              w.e("MicroMsg.AppMsgLogic", "options is null! %B, bitmapWidth = %d, bitmapHeight = %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i), Integer.valueOf(j) });
              GMTrace.o(832418349056L, 6202);
              return null;
              bool = false;
              break;
              i = paramString.outWidth;
              break label786;
            }
          }
          if (q.a(paramWXMediaMessage.imagePath, "", true))
          {
            w.i("MicroMsg.AppMsgLogic", "this picture can send raw image but must copy [%s] to [%s]", new Object[] { paramWXMediaMessage.imagePath, parama });
            if (com.tencent.mm.a.e.o(paramWXMediaMessage.imagePath, parama) < 0L)
            {
              w.w("MicroMsg.AppMsgLogic", "copy file error path[%s, %s]", new Object[] { paramWXMediaMessage.imagePath, parama });
              GMTrace.o(832418349056L, 6202);
              return null;
            }
            GMTrace.o(832418349056L, 6202);
            return parama;
          }
          if ((paramString.outWidth > 960) || (paramString.outHeight > 960))
          {
            paramString = new MMBitmapFactory.DecodeResultLogger();
            localBitmap = d.a(paramWXMediaMessage.imagePath, 960, 960, false, paramString, 0);
            if (localBitmap == null) {}
          }
          while (com.tencent.mm.a.e.o(paramWXMediaMessage.imagePath, parama) >= 0L)
          {
            try
            {
              Bitmap localBitmap;
              d.a(localBitmap, 100, Bitmap.CompressFormat.JPEG, parama, true);
              GMTrace.o(832418349056L, 6202);
              return parama;
            }
            catch (IOException parama)
            {
              w.printErrStackTrace("MicroMsg.AppMsgLogic", parama, "", new Object[0]);
              GMTrace.o(832418349056L, 6202);
              return null;
            }
            if (paramString.getDecodeResult() >= 2000)
            {
              parama = MMBitmapFactory.KVStatHelper.getKVStatString(paramWXMediaMessage.imagePath, 6, paramString);
              com.tencent.mm.plugin.report.service.g.ork.A(12712, parama);
            }
            GMTrace.o(832418349056L, 6202);
            return null;
          }
          GMTrace.o(832418349056L, 6202);
          return null;
        }
        GMTrace.o(832418349056L, 6202);
        return null;
      }
      GMTrace.o(832418349056L, 6202);
      return null;
    }
    if (parama.type == 3)
    {
      paramWXMediaMessage = (WXMusicObject)paramWXMediaMessage;
      parama.url = paramWXMediaMessage.musicUrl;
      parama.giu = paramWXMediaMessage.musicLowBandUrl;
      parama.giM = paramWXMediaMessage.musicDataUrl;
      parama.giN = paramWXMediaMessage.musicLowBandDataUrl;
      GMTrace.o(832418349056L, 6202);
      return null;
    }
    if (parama.type == 4)
    {
      paramWXMediaMessage = (WXVideoObject)paramWXMediaMessage;
      parama.url = paramWXMediaMessage.videoUrl;
      parama.giu = paramWXMediaMessage.videoLowBandUrl;
      GMTrace.o(832418349056L, 6202);
      return null;
    }
    if (parama.type == 5)
    {
      paramWXMediaMessage = (WXWebpageObject)paramWXMediaMessage;
      parama.url = paramWXMediaMessage.webpageUrl;
      if (!bg.nm(paramWXMediaMessage.extInfo)) {
        parama.extInfo = paramWXMediaMessage.extInfo;
      }
      if (!bg.nm(paramWXMediaMessage.canvasPageXml)) {
        parama.canvasPageXml = paramWXMediaMessage.canvasPageXml;
      }
      GMTrace.o(832418349056L, 6202);
      return null;
    }
    if (parama.type == 36)
    {
      paramWXMediaMessage = (WXMiniProgramObject)paramWXMediaMessage;
      parama.gkR = paramWXMediaMessage.userName;
      parama.gkQ = paramWXMediaMessage.path;
      parama.url = paramWXMediaMessage.webpageUrl;
      paramWXMediaMessage = ((com.tencent.mm.plugin.appbrand.k.b)h.h(com.tencent.mm.plugin.appbrand.k.b.class)).pn(paramWXMediaMessage.userName);
      if (paramWXMediaMessage != null)
      {
        if (paramWXMediaMessage.UF() != null) {
          parama.gkZ = paramWXMediaMessage.UF().eVc;
        }
        parama.gla = paramWXMediaMessage.field_brandIconURL;
        w.i("MicroMsg.AppMsgLogic", "add appbrand version and appbrand icon url : %d, %s", new Object[] { Integer.valueOf(parama.gkZ), parama.gla });
      }
    }
    do
    {
      for (;;)
      {
        GMTrace.o(832418349056L, 6202);
        return null;
        if (parama.type == 1)
        {
          parama.title = ((WXTextObject)paramWXMediaMessage).text;
          GMTrace.o(832418349056L, 6202);
          return null;
        }
        if (parama.type != 8) {
          break;
        }
        paramWXMediaMessage = (WXEmojiObject)paramWXMediaMessage;
        if (!bg.bq(paramWXMediaMessage.emojiData))
        {
          w.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.tC() + " fileData:" + paramWXMediaMessage.emojiData.length);
          parama.giv = paramWXMediaMessage.emojiData.length;
          parama = aW(paramWXMediaMessage.emojiData);
          GMTrace.o(832418349056L, 6202);
          return parama;
        }
        if (!bg.nm(paramWXMediaMessage.emojiPath))
        {
          parama.giv = com.tencent.mm.a.e.aY(paramWXMediaMessage.emojiPath);
          w.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.tC() + " read file:" + paramWXMediaMessage.emojiPath + " len:" + parama.giv);
          if (parama.giv > 0)
          {
            parama.giw = com.tencent.mm.a.e.bb(paramWXMediaMessage.emojiPath);
            parama = paramWXMediaMessage.emojiPath;
            GMTrace.o(832418349056L, 6202);
            return parama;
          }
          GMTrace.o(832418349056L, 6202);
          return null;
        }
        parama.gix = paramString;
      }
      if (parama.type == 15)
      {
        paramWXMediaMessage = (WXEmojiSharedObject)paramWXMediaMessage;
        parama.thumburl = paramWXMediaMessage.thumburl;
        parama.giZ = paramWXMediaMessage.packageflag;
        parama.giY = paramWXMediaMessage.packageid;
        parama.showType = 8;
        parama.url = paramWXMediaMessage.url;
        GMTrace.o(832418349056L, 6202);
        return null;
      }
      if (parama.type == 13)
      {
        paramWXMediaMessage = (WXEmojiSharedObject)paramWXMediaMessage;
        parama.thumburl = paramWXMediaMessage.thumburl;
        parama.giZ = paramWXMediaMessage.packageflag;
        parama.giY = paramWXMediaMessage.packageid;
        parama.showType = 8;
        parama.url = paramWXMediaMessage.url;
        GMTrace.o(832418349056L, 6202);
        return null;
      }
      if (parama.type == 25)
      {
        paramWXMediaMessage = (WXDesignerSharedObject)paramWXMediaMessage;
        parama.thumburl = paramWXMediaMessage.thumburl;
        parama.url = paramWXMediaMessage.url;
        parama.gkF = paramWXMediaMessage.designerUIN;
        parama.designerName = paramWXMediaMessage.designerName;
        parama.designerRediretctUrl = paramWXMediaMessage.designerRediretctUrl;
        parama.showType = 18;
        GMTrace.o(832418349056L, 6202);
        return null;
      }
    } while ((parama.type != 27) && (parama.type != 26));
    paramWXMediaMessage = (WXEmojiPageSharedObject)paramWXMediaMessage;
    parama.thumburl = paramWXMediaMessage.iconUrl;
    parama.url = paramWXMediaMessage.url;
    parama.tid = paramWXMediaMessage.tid;
    parama.gkG = paramWXMediaMessage.title;
    parama.desc = paramWXMediaMessage.desc;
    parama.iconUrl = paramWXMediaMessage.iconUrl;
    parama.secondUrl = paramWXMediaMessage.secondUrl;
    parama.pageType = paramWXMediaMessage.pageType;
    parama.showType = 20;
    GMTrace.o(832418349056L, 6202);
    return null;
  }
  
  public static int d(f.a parama)
  {
    GMTrace.i(17762508341248L, 132341);
    if (parama == null)
    {
      GMTrace.o(17762508341248L, 132341);
      return 49;
    }
    int i = parama.type;
    int j = parama.showType;
    int k = parama.giO;
    int m = parama.giP;
    int n = parama.gkk;
    w.d("MicroMsg.AppMsgLogic", "getLocalAppMsgType showType " + j + " atype " + i + ", itemShowType = " + k + ", c2cNewAAType = " + n);
    if ((k == 4) || (m != 0))
    {
      GMTrace.o(17762508341248L, 132341);
      return 318767153;
    }
    if (k == 5)
    {
      GMTrace.o(17762508341248L, 132341);
      return 486539313;
    }
    if (i == 2001)
    {
      if (j == 1)
      {
        GMTrace.o(17762508341248L, 132341);
        return 469762097;
      }
      if (n == 4)
      {
        GMTrace.o(17762508341248L, 132341);
        return 503316529;
      }
      GMTrace.o(17762508341248L, 132341);
      return 436207665;
    }
    switch (j)
    {
    default: 
      switch (i)
      {
      }
      break;
    }
    com.tencent.mm.x.a locala;
    do
    {
      GMTrace.o(17762508341248L, 132341);
      return 49;
      if (i == 21)
      {
        GMTrace.o(17762508341248L, 132341);
        return -1879048185;
      }
      GMTrace.o(17762508341248L, 132341);
      return 285212721;
      if (i == 21)
      {
        GMTrace.o(17762508341248L, 132341);
        return -1879048183;
      }
      GMTrace.o(17762508341248L, 132341);
      return 301989937;
      if (i == 21)
      {
        GMTrace.o(17762508341248L, 132341);
        return -1879048176;
      }
      GMTrace.o(17762508341248L, 132341);
      return -1879048189;
      if (i == 21)
      {
        GMTrace.o(17762508341248L, 132341);
        return -1879048183;
      }
      GMTrace.o(17762508341248L, 132341);
      return -1879048190;
      GMTrace.o(17762508341248L, 132341);
      return -1879048191;
      GMTrace.o(17762508341248L, 132341);
      return -1879048186;
      GMTrace.o(17762508341248L, 132341);
      return 268435505;
      GMTrace.o(17762508341248L, 132341);
      return 16777265;
      GMTrace.o(17762508341248L, 132341);
      return 1048625;
      GMTrace.o(17762508341248L, 132341);
      return 335544369;
      GMTrace.o(17762508341248L, 132341);
      return 402653233;
      GMTrace.o(17762508341248L, 132341);
      return 369098801;
      GMTrace.o(17762508341248L, 132341);
      return 452984881;
      GMTrace.o(17762508341248L, 132341);
      return -1879048186;
      GMTrace.o(17762508341248L, 132341);
      return 419430449;
      GMTrace.o(17762508341248L, 132341);
      return 520093745;
      locala = (com.tencent.mm.x.a)parama.n(com.tencent.mm.x.a.class);
    } while ((locala == null) || (!locala.gin) || ((parama.gkT != 2) && (parama.gkT != 3)));
    GMTrace.o(17762508341248L, 132341);
    return 553648177;
  }
  
  public static void es(long paramLong)
  {
    GMTrace.i(14907965702144L, 111073);
    b localb = an.afP().eq(paramLong);
    if (localb != null) {
      w.i("MicroMsg.AppMsgLogic", "summerapp deleteAttachInfoAndFile deleteFile[%b] deleteInfo[%b] msgInfoId[%d] mediaSvrId[%s] path[%s] stack[%s]", new Object[] { Boolean.valueOf(com.tencent.mm.loader.stub.b.deleteFile(localb.field_fileFullPath)), Boolean.valueOf(an.afP().a(localb, new String[] { "msgInfoId" })), Long.valueOf(localb.field_msgInfoId), localb.field_mediaSvrId, localb.field_fileFullPath, bg.bQW() });
    }
    GMTrace.o(14907965702144L, 111073);
  }
  
  public static void et(long paramLong)
  {
    GMTrace.i(830136647680L, 6185);
    Object localObject1 = an.afP();
    Object localObject2 = " update appattach set status = 198" + " , lastModifyTime = " + bg.Pu() + " where rowid = " + paramLong;
    ((c)localObject1).fTZ.eZ("appattach", (String)localObject2);
    ((c)localObject1).doNotify();
    localObject1 = new b();
    an.afP().b(paramLong, (com.tencent.mm.sdk.e.c)localObject1);
    if (((b)localObject1).field_msgInfoId <= 0L)
    {
      GMTrace.o(830136647680L, 6185);
      return;
    }
    at.AR();
    localObject2 = com.tencent.mm.y.c.yM().cM(((b)localObject1).field_msgInfoId);
    if (((ce)localObject2).field_msgId != ((b)localObject1).field_msgInfoId)
    {
      GMTrace.o(830136647680L, 6185);
      return;
    }
    ((au)localObject2).dB(5);
    at.AR();
    com.tencent.mm.y.c.yM().a(((ce)localObject2).field_msgId, (au)localObject2);
    GMTrace.o(830136647680L, 6185);
  }
  
  public static int yQ(int paramInt)
  {
    GMTrace.i(832955219968L, 6206);
    switch (paramInt)
    {
    default: 
      GMTrace.o(832955219968L, 6206);
      return paramInt;
    }
    GMTrace.o(832955219968L, 6206);
    return 49;
  }
  
  public static abstract interface a
  {
    public abstract void dR(int paramInt1, int paramInt2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\model\app\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */