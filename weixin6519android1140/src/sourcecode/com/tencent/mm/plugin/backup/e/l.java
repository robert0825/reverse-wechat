package com.tencent.mm.plugin.backup.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelvoice.n;
import com.tencent.mm.plugin.backup.a.h;
import com.tencent.mm.plugin.backup.g.d;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.ek;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import java.io.File;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

public final class l
  implements e
{
  byte[] jah;
  byte[] jai;
  
  public l()
  {
    GMTrace.i(14813610639360L, 110370);
    this.jah = new byte[] { 35, 33, 65, 77, 82, 10, 2, 35, 33 };
    this.jai = new byte[] { 35, 33, 65, 77, 82, 10, 35, 33 };
    GMTrace.o(14813610639360L, 110370);
  }
  
  private static boolean d(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    GMTrace.i(14814013292544L, 110373);
    if (bg.bq(paramArrayOfByte2))
    {
      GMTrace.o(14814013292544L, 110373);
      return false;
    }
    int i = 0;
    while (i < paramArrayOfByte1.length)
    {
      if (paramArrayOfByte1[i] != paramArrayOfByte2[i])
      {
        GMTrace.o(14814013292544L, 110373);
        return false;
      }
      i += 1;
    }
    GMTrace.o(14814013292544L, 110373);
    return true;
  }
  
  private static String f(au paramau, int paramInt)
  {
    GMTrace.i(14814147510272L, 110374);
    if (bg.nm(paramau.field_content))
    {
      GMTrace.o(14814147510272L, 110374);
      return null;
    }
    n localn = new n(paramau.field_content);
    Object localObject2 = new StringWriter();
    try
    {
      XmlSerializer localXmlSerializer = XmlPullParserFactory.newInstance().newSerializer();
      localXmlSerializer.setOutput((Writer)localObject2);
      localXmlSerializer.startTag(null, "msg");
      localXmlSerializer.startTag(null, "voicemsg");
      localXmlSerializer.attribute(null, "length", String.valueOf(paramInt));
      localXmlSerializer.attribute(null, "endflag", "1");
      localXmlSerializer.attribute(null, "cancelflag", "0");
      localXmlSerializer.attribute(null, "voicelength", localn.time);
      if (!bg.nm(localn.hcn)) {
        localXmlSerializer.attribute(null, "fromusername", localn.hcn);
      }
      if (localn.hco) {}
      for (Object localObject1 = "1";; localObject1 = "0")
      {
        localXmlSerializer.attribute(null, "isPlayed", (String)localObject1);
        localXmlSerializer.endTag(null, "voicemsg");
        localXmlSerializer.endTag(null, "msg");
        localXmlSerializer.endDocument();
        ((StringWriter)localObject2).flush();
        ((StringWriter)localObject2).close();
        localObject2 = ((StringWriter)localObject2).getBuffer().toString();
        localObject1 = localObject2;
        if (d.eb(paramau.field_talker)) {
          localObject1 = localn.hcn + ":\n" + (String)localObject2;
        }
        w.i("MicroMsg.MMBakItemVoice", "parseContent xml:" + (String)localObject1);
        GMTrace.o(14814147510272L, 110374);
        return (String)localObject1;
      }
      return null;
    }
    catch (Exception paramau)
    {
      w.e("MicroMsg.MMBakItemVoice", "packetVoice xml error: " + paramau.toString());
      GMTrace.o(14814147510272L, 110374);
    }
  }
  
  public final int a(ek paramek, boolean paramBoolean1, au paramau, String paramString, LinkedList<com.tencent.mm.plugin.backup.h.u> paramLinkedList, HashMap<Long, a.c> paramHashMap, boolean paramBoolean2, long paramLong)
  {
    GMTrace.i(14813744857088L, 110371);
    paramString = d.tr(paramau.field_imgPath);
    if (bg.nm(paramString))
    {
      GMTrace.o(14813744857088L, 110371);
      return 0;
    }
    paramHashMap = new File(paramString);
    if (!paramHashMap.exists())
    {
      GMTrace.o(14813744857088L, 110371);
      return 0;
    }
    int i = (int)paramHashMap.length();
    if (paramBoolean1)
    {
      GMTrace.o(14813744857088L, 110371);
      return i;
    }
    int j = b.a(new b.a(paramString, paramek, paramLinkedList, 9, paramBoolean2, paramBoolean2, null));
    paramau = f(paramau, i);
    if (paramau == null)
    {
      GMTrace.o(14813744857088L, 110371);
      return 0;
    }
    paramek.tPY = new azq().Rq(paramau);
    j += paramau.length();
    if (i == 0)
    {
      GMTrace.o(14813744857088L, 110371);
      return j;
    }
    GMTrace.o(14813744857088L, 110371);
    return j;
  }
  
  public final int a(String paramString, ek paramek, au paramau)
  {
    GMTrace.i(14813879074816L, 110372);
    Object localObject = paramek.tPY.uNR;
    paramString = (String)localObject;
    int i;
    if (d.eb(paramek.tPW.uNR))
    {
      i = d.gO((String)localObject);
      if (i == -1)
      {
        paramString = (String)localObject;
        w.v("MicroMsg.MMBakItemVoice", "chatroom voicemsg, new content=" + paramString);
      }
    }
    else
    {
      paramString = bh.q(paramString, "msg");
      if (paramString == null) {
        break label329;
      }
    }
    try
    {
      i = h.aA((String)paramString.get(".msg.voicemsg.$voicelength"), 0);
      localObject = (String)paramString.get(".msg.voicemsg.$fromusername");
      if (h.aA((String)paramString.get(".msg.voicemsg.$isPlayed"), 1) != 1) {
        break label298;
      }
      bool = true;
      label137:
      paramau.setContent(n.b((String)localObject, i, bool));
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        boolean bool;
        label151:
        w.e("MicroMsg.MMBakItemVoice", "parsing voice msg xml failed");
        w.printErrStackTrace("MicroMsg.MMBakItemVoice", paramString, "", new Object[0]);
      }
    }
    paramString = com.tencent.mm.modelvoice.u.mU(paramek.tPW.uNR);
    paramau.dc(paramString);
    d.i(paramau);
    paramString = d.tr(paramString);
    if (paramek.tTg == 9)
    {
      paramau = paramek.tTe.uNP.tJp;
      if (d(this.jah, paramau))
      {
        localObject = new byte[paramau.length - 6];
        System.arraycopy(paramau, 6, localObject, 0, paramau.length - 6);
        paramek.tTf = (paramau.length - 6);
        paramek.tTe = new azp().be((byte[])localObject);
      }
    }
    for (;;)
    {
      if (paramString != null) {
        break label540;
      }
      GMTrace.o(14813879074816L, 110372);
      return 0;
      paramString = (String)localObject;
      if (i + 2 >= ((String)localObject).length()) {
        break;
      }
      paramString = ((String)localObject).substring(i + 2);
      break;
      label298:
      bool = false;
      break label137;
      label329:
      w.e("MicroMsg.MMBakItemVoice", "voicemsg paseXml failed:%s", new Object[] { paramek.tPY.uNR });
      paramau.setContent(paramek.tPY.uNR);
      break label151;
      if (d(this.jai, paramau))
      {
        localObject = new byte[paramau.length - 6];
        System.arraycopy(paramau, 6, localObject, 0, paramau.length - 6);
        paramek.tTf = (paramau.length - 6);
        paramek.tTe = new azp().be((byte[])localObject);
      }
      else
      {
        paramau = h.a(paramek, 9);
        if (!bg.nm(paramau))
        {
          paramau = h.th(paramau);
          if (com.tencent.mm.a.e.aZ(paramau))
          {
            localObject = com.tencent.mm.a.e.d(paramau, 0, 9);
            if (d(this.jah, (byte[])localObject))
            {
              localObject = com.tencent.mm.a.e.d(paramau, 6, -1);
              com.tencent.mm.loader.stub.b.deleteFile(paramau);
              com.tencent.mm.a.e.b(paramau, (byte[])localObject, localObject.length);
            }
            else if (d(this.jai, (byte[])localObject))
            {
              localObject = com.tencent.mm.a.e.d(paramau, 6, -1);
              com.tencent.mm.loader.stub.b.deleteFile(paramau);
              com.tencent.mm.a.e.b(paramau, (byte[])localObject, localObject.length);
            }
          }
        }
      }
    }
    label540:
    if (h.b(paramek, 9, paramString))
    {
      GMTrace.o(14813879074816L, 110372);
      return 0;
    }
    paramek = h.a(paramek, 9);
    if (paramek != null)
    {
      paramek = h.th(paramek);
      w.d("MicroMsg.MMBakItemVoice", "recover Frome Sdcard" + paramek);
      j.r(paramek, paramString, false);
    }
    GMTrace.o(14813879074816L, 110372);
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\e\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */