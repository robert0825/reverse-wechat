package com.tencent.mm.ui.chatting;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.i;
import com.tencent.mm.ac.n;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.modelappbrand.a.b.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.x.f.a;
import com.tencent.mm.x.k;
import com.tencent.mm.y.s;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;

public final class ac
{
  public static f.a a(String paramString, com.tencent.mm.x.l paraml)
  {
    GMTrace.i(19174210404352L, 142859);
    f.a locala = new f.a();
    locala.title = paraml.title;
    locala.description = paraml.glz;
    locala.type = 33;
    locala.gkR = paraml.glC;
    locala.gkQ = paraml.glD;
    locala.gkS = paraml.glG;
    locala.gkY = paraml.glF;
    locala.gkZ = paraml.glE;
    locala.gkU = "";
    locala.gkT = 2;
    locala.url = paraml.url;
    locala.gla = paraml.glI;
    locala.eTu = ("wxapp_" + paraml.glG + paraml.glD);
    locala.eTo = paraml.glC;
    locala.eTp = paraml.glJ;
    paraml = new com.tencent.mm.x.a();
    paraml.gin = false;
    paraml.gio = "";
    locala.a(paraml);
    if (bg.nm(locala.thumburl))
    {
      paramString = n.Di().ig(paramString);
      if (paramString != null) {
        locala.thumburl = paramString.Do();
      }
    }
    GMTrace.o(19174210404352L, 142859);
    return locala;
  }
  
  public static void b(String paramString1, f.a parama, String paramString2)
  {
    GMTrace.i(19174076186624L, 142858);
    for (;;)
    {
      try
      {
        byte[] arrayOfByte = new byte[0];
        Object localObject2 = null;
        Object localObject1 = localObject2;
        if (!bg.nm(paramString2)) {
          if (!paramString2.startsWith("http://"))
          {
            localObject1 = localObject2;
            if (!paramString2.startsWith("https://")) {}
          }
          else
          {
            localObject1 = b.CT().hx(paramString2);
          }
        }
        if ((localObject1 != null) && (!((Bitmap)localObject1).isRecycled()))
        {
          w.i("MicroMsg.ChattingEditModeSendToAppBrand", "thumb image is not null ");
          paramString2 = new ByteArrayOutputStream();
          ((Bitmap)localObject1).compress(Bitmap.CompressFormat.PNG, 100, paramString2);
          paramString2 = paramString2.toByteArray();
          if (s.eb(paramString1))
          {
            i = 1;
            com.tencent.mm.pluginsdk.model.app.l.a(parama, parama.gkS, parama.title, paramString1, null, paramString2);
            com.tencent.mm.plugin.report.service.g.ork.i(14127, new Object[] { parama.gkS, parama.gkR, parama.gkQ, parama.title, parama.description, "", parama.url, Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(i), paramString1 });
            GMTrace.o(19174076186624L, 142858);
          }
        }
        else
        {
          w.e("MicroMsg.ChattingEditModeSendToAppBrand", "thumb image is null");
          paramString2 = arrayOfByte;
          continue;
        }
        int i = 0;
      }
      catch (Exception paramString1)
      {
        w.printErrStackTrace("MicroMsg.ChattingEditModeSendToAppBrand", paramString1, "", new Object[0]);
        w.e("MicroMsg.ChattingEditModeSendToAppBrand", "retransmit sigle app msg error : %s", new Object[] { paramString1.getLocalizedMessage() });
        GMTrace.o(19174076186624L, 142858);
        return;
      }
    }
  }
  
  public static boolean g(au paramau, int paramInt)
  {
    GMTrace.i(19174344622080L, 142860);
    if (paramau == null)
    {
      GMTrace.o(19174344622080L, 142860);
      return false;
    }
    if (!paramau.bTs())
    {
      GMTrace.o(19174344622080L, 142860);
      return false;
    }
    paramau = ((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.biz.a.a.class)).tA(paramau.field_content).glr;
    if (!bg.cc(paramau))
    {
      int i;
      if (paramInt >= 0)
      {
        i = paramInt;
        if (paramInt < paramau.size()) {}
      }
      else
      {
        i = 0;
      }
      if (com.tencent.mm.x.h.eU(((com.tencent.mm.x.l)paramau.get(i)).glC))
      {
        GMTrace.o(19174344622080L, 142860);
        return true;
      }
    }
    GMTrace.o(19174344622080L, 142860);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */