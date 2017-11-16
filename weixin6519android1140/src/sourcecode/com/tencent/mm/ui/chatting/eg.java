package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ao.d;
import com.tencent.mm.ao.f;
import com.tencent.mm.ao.n;
import com.tencent.mm.br.a;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.au.b;
import com.tencent.mm.storage.x;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.q;
import com.tencent.wework.api.IWWAPI;
import com.tencent.wework.api.WWAPIFactory;
import com.tencent.wework.api.model.WWMediaConversation;
import com.tencent.wework.api.model.WWMediaFile;
import com.tencent.wework.api.model.WWMediaImage;
import com.tencent.wework.api.model.WWMediaLink;
import com.tencent.wework.api.model.WWMediaLocation;
import com.tencent.wework.api.model.WWMediaMergedConvs;
import com.tencent.wework.api.model.WWMediaMessage;
import com.tencent.wework.api.model.WWMediaMessage.WWMediaObject;
import com.tencent.wework.api.model.WWMediaText;
import com.tencent.wework.api.model.WWMediaVideo;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

public final class eg
{
  private static WWMediaMessage.WWMediaObject a(x paramx, List<au> paramList, boolean paramBoolean)
  {
    GMTrace.i(2188554272768L, 16306);
    WWMediaMergedConvs localWWMediaMergedConvs = new WWMediaMergedConvs();
    Object localObject2 = paramx.field_username;
    paramx = ab.getContext();
    if (paramBoolean) {
      paramx = paramx.getString(R.l.dQl);
    }
    for (;;)
    {
      localWWMediaMergedConvs.title = paramx;
      paramList = paramList.iterator();
      label51:
      Object localObject1;
      if (paramList.hasNext())
      {
        localObject1 = (au)paramList.next();
        localObject2 = new WWMediaConversation();
        if (((ce)localObject1).field_isSend == 1)
        {
          paramx = q.zE();
          label93:
          ((WWMediaConversation)localObject2).name = com.tencent.mm.y.r.fr(paramx);
        }
      }
      try
      {
        paramx = com.tencent.mm.ac.b.a(paramx, false, -1);
        ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
        paramx.compress(Bitmap.CompressFormat.JPEG, 100, localByteArrayOutputStream);
        ((WWMediaConversation)localObject2).ymD = localByteArrayOutputStream.toByteArray();
        localByteArrayOutputStream.close();
        ((WWMediaConversation)localObject2).date = ((ce)localObject1).field_createTime;
        ((WWMediaConversation)localObject2).ymE = d((au)localObject1, paramBoolean);
        if (!((WWMediaConversation)localObject2).checkArgs()) {
          break label51;
        }
        localWWMediaMergedConvs.ymG.add(localObject2);
        break label51;
        localObject1 = q.zG();
        localObject2 = com.tencent.mm.y.r.fr((String)localObject2);
        if (((String)localObject1).equals(localObject2))
        {
          paramx = paramx.getString(R.l.duv, new Object[] { localObject1 });
          continue;
        }
        paramx = paramx.getString(R.l.duu, new Object[] { localObject1, localObject2 });
        continue;
        if (!paramBoolean)
        {
          paramx = ((ce)localObject1).field_talker;
          break label93;
        }
        paramx = bc.gP(((ce)localObject1).field_content);
        break label93;
        GMTrace.o(2188554272768L, 16306);
        return localWWMediaMergedConvs;
      }
      catch (Exception paramx)
      {
        for (;;) {}
      }
    }
  }
  
  public static void a(Context paramContext, x paramx, List<au> paramList, boolean paramBoolean)
  {
    GMTrace.i(2188285837312L, 16304);
    IWWAPI localIWWAPI = WWAPIFactory.in(paramContext);
    if ((paramList.size() == 1) && (((au)paramList.get(0)).field_type != 48)) {}
    for (paramContext = d((au)paramList.get(0), paramBoolean);; paramContext = a(paramx, paramList, paramBoolean))
    {
      localIWWAPI.a(paramContext);
      GMTrace.o(2188285837312L, 16304);
      return;
    }
  }
  
  private static WWMediaMessage.WWMediaObject d(au paramau, boolean paramBoolean)
  {
    GMTrace.i(2188420055040L, 16305);
    int i = paramau.field_type;
    if (i == 1)
    {
      paramau = new WWMediaText(aa.q(paramau.field_content, paramau.field_isSend, paramBoolean));
      GMTrace.o(2188420055040L, 16305);
      return paramau;
    }
    if (i == 3) {
      if (paramau.field_msgId <= 0L) {
        break label415;
      }
    }
    label415:
    for (Object localObject1 = n.IZ().aq(paramau.field_msgId);; localObject1 = null)
    {
      Object localObject2;
      if (localObject1 != null)
      {
        localObject2 = localObject1;
        if (((d)localObject1).gGR > 0L) {}
      }
      else
      {
        localObject2 = localObject1;
        if (paramau.field_msgSvrId > 0L) {
          localObject2 = n.IZ().ap(paramau.field_msgSvrId);
        }
      }
      if (localObject2 == null)
      {
        GMTrace.o(2188420055040L, 16305);
        return null;
      }
      paramau = n.IZ().l(com.tencent.mm.ao.e.c((d)localObject2), "", "");
      localObject1 = new WWMediaImage();
      ((WWMediaImage)localObject1).filePath = paramau;
      w.i("MicroMsg.SendToWeWorkHelper", "send img2, path:%s", new Object[] { ((WWMediaImage)localObject1).filePath });
      GMTrace.o(2188420055040L, 16305);
      return (WWMediaMessage.WWMediaObject)localObject1;
      if (i == 43)
      {
        localObject1 = new WWMediaVideo();
        paramau = t.mw(paramau.field_imgPath);
        o.Nh();
        ((WWMediaVideo)localObject1).filePath = s.mk(paramau.getFileName());
        w.i("MicroMsg.SendToWeWorkHelper", "send video2, path:%s", new Object[] { ((WWMediaVideo)localObject1).filePath });
        GMTrace.o(2188420055040L, 16305);
        return (WWMediaMessage.WWMediaObject)localObject1;
      }
      if (i == 48)
      {
        localObject1 = new WWMediaLocation();
        paramau = aa.q(paramau.field_content, paramau.field_isSend, paramBoolean);
        at.AR();
        paramau = com.tencent.mm.y.c.yM().Co(paramau);
        ((WWMediaLocation)localObject1).title = paramau.mzo;
        ((WWMediaLocation)localObject1).gEy = paramau.label;
        ((WWMediaLocation)localObject1).longitude = paramau.mwI;
        ((WWMediaLocation)localObject1).latitude = paramau.mwH;
        ((WWMediaLocation)localObject1).ymF = paramau.eMn;
        GMTrace.o(2188420055040L, 16305);
        return (WWMediaMessage.WWMediaObject)localObject1;
      }
      if ((i == 49) || (i == 268435505))
      {
        paramau = e(paramau, paramBoolean);
        GMTrace.o(2188420055040L, 16305);
        return paramau;
      }
      w.e("MicroMsg.SendToWeWorkHelper", "unsupport msg type: %d", new Object[] { Integer.valueOf(i) });
      GMTrace.o(2188420055040L, 16305);
      return null;
    }
  }
  
  private static WWMediaMessage.WWMediaObject e(au paramau, boolean paramBoolean)
  {
    GMTrace.i(2188688490496L, 16307);
    Object localObject3 = paramau.field_content;
    Object localObject1 = localObject3;
    if (paramBoolean)
    {
      int i = paramau.field_content.indexOf(':');
      localObject1 = localObject3;
      if (i != -1) {
        localObject1 = paramau.field_content.substring(i + 1);
      }
    }
    if (localObject1 != null) {}
    Object localObject2;
    for (localObject1 = f.a.C((String)localObject1, paramau.field_reserved);; localObject2 = null)
    {
      if (localObject1 == null)
      {
        GMTrace.o(2188688490496L, 16307);
        return null;
      }
      switch (((f.a)localObject1).type)
      {
      case 3: 
      case 4: 
      default: 
        GMTrace.o(2188688490496L, 16307);
        return null;
      case 5: 
        localObject3 = new WWMediaLink();
        ((WWMediaLink)localObject3).webpageUrl = ((f.a)localObject1).url;
        ((WWMediaLink)localObject3).title = ((f.a)localObject1).title;
        ((WWMediaLink)localObject3).description = ((f.a)localObject1).description;
        localObject1 = n.IZ().a(paramau.field_imgPath, a.getDensity(null), false);
      }
      try
      {
        Object localObject4 = new ByteArrayOutputStream();
        ((Bitmap)localObject1).compress(Bitmap.CompressFormat.JPEG, 85, (OutputStream)localObject4);
        ((WWMediaMessage)localObject3).thumbData = ((ByteArrayOutputStream)localObject4).toByteArray();
        ((ByteArrayOutputStream)localObject4).close();
        try
        {
          paramau = n.IZ().a(paramau.field_imgPath, a.getDensity(null), false);
          localObject1 = new ByteArrayOutputStream();
          paramau.compress(Bitmap.CompressFormat.JPEG, 100, (OutputStream)localObject1);
          ((WWMediaLink)localObject3).thumbData = ((ByteArrayOutputStream)localObject1).toByteArray();
          ((ByteArrayOutputStream)localObject1).close();
          GMTrace.o(2188688490496L, 16307);
          return (WWMediaMessage.WWMediaObject)localObject3;
          if ((((f.a)localObject1).eAE != null) && (((f.a)localObject1).eAE.length() > 0))
          {
            localObject1 = an.afP().Op(((f.a)localObject1).eAE);
            if ((localObject1 != null) && (((com.tencent.mm.pluginsdk.model.app.b)localObject1).aDI()))
            {
              localObject1 = ((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_fileFullPath;
              if (!com.tencent.mm.a.e.aZ((String)localObject1))
              {
                w.i("MicroMsg.SendToWeWorkHelper", "Img not exist, bigImgPath: %s, msgId: %d, msgSvrId: %d", new Object[] { localObject1, Long.valueOf(paramau.field_msgId), Long.valueOf(paramau.field_msgSvrId) });
                GMTrace.o(2188688490496L, 16307);
                return null;
              }
              paramau = new WWMediaImage();
              paramau.filePath = ((String)localObject1);
              w.i("MicroMsg.SendToWeWorkHelper", "send img2, path:%s", new Object[] { paramau.filePath });
              GMTrace.o(2188688490496L, 16307);
              return paramau;
            }
          }
          GMTrace.o(2188688490496L, 16307);
          return null;
          localObject4 = l.OA(((f.a)localObject1).eAE);
          localObject3 = localObject4;
          if (localObject4 == null) {
            localObject3 = an.afP().eq(paramau.field_msgId);
          }
          paramau = new WWMediaFile();
          paramau.euR = ((f.a)localObject1).title;
          paramau.filePath = ((com.tencent.mm.pluginsdk.model.app.b)localObject3).field_fileFullPath;
          GMTrace.o(2188688490496L, 16307);
          return paramau;
        }
        catch (Exception paramau)
        {
          for (;;) {}
        }
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\eg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */