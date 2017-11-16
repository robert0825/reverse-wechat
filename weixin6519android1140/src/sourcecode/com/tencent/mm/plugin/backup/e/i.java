package com.tencent.mm.plugin.backup.e;

import android.graphics.Bitmap.CompressFormat;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.g;
import com.tencent.mm.ao.f;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.plugin.backup.a.h;
import com.tencent.mm.plugin.backup.g.a;
import com.tencent.mm.plugin.backup.g.c;
import com.tencent.mm.plugin.backup.h.u;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.azq;
import com.tencent.mm.protocal.c.ek;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.y.bc;
import java.io.File;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

public final class i
  implements e
{
  public i()
  {
    GMTrace.i(14816026558464L, 110388);
    GMTrace.o(14816026558464L, 110388);
  }
  
  private static String a(com.tencent.mm.ao.d paramd, au paramau)
  {
    GMTrace.i(16665412632576L, 124167);
    StringWriter localStringWriter = new StringWriter();
    try
    {
      XmlSerializer localXmlSerializer = XmlPullParserFactory.newInstance().newSerializer();
      localXmlSerializer.setOutput(localStringWriter);
      if (com.tencent.mm.plugin.backup.g.d.eb(paramau.field_talker)) {
        localStringWriter.write(bc.gP(paramau.field_content) + ":\n");
      }
      localXmlSerializer.startTag(null, "msg");
      localXmlSerializer.startTag(null, "img");
      Map localMap = bh.q(paramd.gHc, "msg");
      long l2;
      long l1;
      if (localMap != null)
      {
        localXmlSerializer.attribute(null, "aeskey", (String)localMap.get(".msg.img.$aeskey"));
        localXmlSerializer.attribute(null, "encryver", (String)localMap.get(".msg.img.$encryver"));
        localXmlSerializer.attribute(null, "cdnthumbaeskey", (String)localMap.get(".msg.img.$cdnthumbaeskey"));
        localXmlSerializer.attribute(null, "cdnthumburl", (String)localMap.get(".msg.img.$cdnthumburl"));
        localXmlSerializer.attribute(null, "cdnthumblength", bg.getLong((String)localMap.get(".msg.img.$cdnthumblength"), 10240L));
        localXmlSerializer.attribute(null, "cdnthumbheight", bg.getInt((String)localMap.get(".msg.img.$cdnthumbheight"), 0));
        localXmlSerializer.attribute(null, "cdnthumbwidth", bg.getInt((String)localMap.get(".msg.img.$cdnthumbwidth"), 0));
        localXmlSerializer.attribute(null, "cdnmidheight", bg.getInt((String)localMap.get(".msg.img.$cdnmidheight"), 0));
        localXmlSerializer.attribute(null, "cdnmidwidth", bg.getInt((String)localMap.get(".msg.img.$cdnmidwidth"), 0));
        localXmlSerializer.attribute(null, "cdnhdheight", bg.getInt((String)localMap.get(".msg.img.$cdnhdheight"), 0));
        localXmlSerializer.attribute(null, "cdnhdwidth", bg.getInt((String)localMap.get(".msg.img.$cdnhdwidth"), 0));
        if ((paramau.field_isSend != 1) || (paramd.gGV != 0)) {
          break label784;
        }
        localXmlSerializer.attribute(null, "cdnmidimgurl", (String)localMap.get(".msg.img.$cdnmidimgurl"));
        l2 = bg.getLong((String)localMap.get(".msg.img.$length"), 0L);
        paramau = new StringBuilder();
        l1 = l2;
        if (l2 == 0L) {
          l1 = com.tencent.mm.a.e.aY(a.afG().afH().IZ().l(paramd.gGS, "", ""));
        }
        localXmlSerializer.attribute(null, "length", l1);
      }
      for (;;)
      {
        localXmlSerializer.attribute(null, "md5", (String)localMap.get(".msg.img.$md5"));
        localXmlSerializer.endTag(null, "img");
        localXmlSerializer.endTag(null, "msg");
        localXmlSerializer.endDocument();
        localStringWriter.flush();
        localStringWriter.close();
        paramd = localStringWriter.getBuffer().toString();
        w.d("MicroMsg.MMBakItemImg", "parseContent xml:" + paramd);
        GMTrace.o(16665412632576L, 124167);
        return paramd;
        label784:
        localXmlSerializer.attribute(null, "cdnmidimgurl", (String)localMap.get(".msg.img.$cdnmidimgurl"));
        l2 = bg.getLong((String)localMap.get(".msg.img.$length"), 0L);
        paramau = new StringBuilder();
        l1 = l2;
        if (l2 == 0L) {
          l1 = com.tencent.mm.a.e.aY(a.afG().afH().IZ().l(paramd.gGS, "", ""));
        }
        localXmlSerializer.attribute(null, "length", l1);
        localXmlSerializer.attribute(null, "cdnbigimgurl", (String)localMap.get(".msg.img.$cdnbigimgurl"));
        localXmlSerializer.attribute(null, "hdlength", bg.getLong((String)localMap.get(".msg.img.$hdlength"), 0L));
      }
      return null;
    }
    catch (Exception paramd)
    {
      w.e("MicroMsg.MMBakItemImg", "packetImg xml error: " + paramd.toString());
      GMTrace.o(16665412632576L, 124167);
    }
  }
  
  public final int a(ek paramek, boolean paramBoolean1, au paramau, String paramString, LinkedList<u> paramLinkedList, HashMap<Long, a.c> paramHashMap, boolean paramBoolean2, long paramLong)
  {
    GMTrace.i(14816160776192L, 110389);
    int i;
    if (bg.nm(paramau.field_content))
    {
      i = 0;
      if (paramau.field_isSend == 1)
      {
        paramString = a.afG().afH().IZ().aq(paramau.field_msgId);
        if (paramString.gGR != 0L) {
          break label1002;
        }
      }
      paramString = a.afG().afH().IZ().ap(paramau.field_msgSvrId);
    }
    label495:
    label574:
    label582:
    label590:
    label600:
    label608:
    label911:
    label921:
    label931:
    label941:
    label951:
    label959:
    label966:
    label1002:
    for (;;)
    {
      paramHashMap = a.afG().afH().IZ().x(paramau.field_imgPath, true);
      Object localObject2;
      Object localObject1;
      int k;
      if (com.tencent.mm.a.e.aZ(paramHashMap))
      {
        j = i + b.a(new b.a(paramHashMap, paramek, paramLinkedList, 1, paramBoolean1, "_thumb", paramBoolean2));
        if (paramau.field_isSend != 1) {
          break label495;
        }
        localObject2 = "";
        str = a.afG().afH().IZ().l(paramString.gGS, "", "");
        localObject1 = localObject2;
        k = j;
        paramHashMap = paramString;
        if (paramString.II())
        {
          paramString = a.afG().afH().IZ().gr(paramString.gHb);
          localObject1 = localObject2;
          k = j;
          paramHashMap = paramString;
          if (paramString != null)
          {
            localObject2 = a.afG().afH().IZ().l(paramString.gGS, "", "");
            w.d("MicroMsg.MMBakItemImg", "hd bigImgPath " + (String)localObject2 + " " + com.tencent.mm.a.e.aY((String)localObject2));
            com.tencent.mm.a.e.aY((String)localObject2);
            localObject1 = localObject2;
            k = j;
            paramHashMap = paramString;
            if (com.tencent.mm.a.e.aZ((String)localObject2))
            {
              k = b.a(new b.a((String)localObject2, paramek, paramLinkedList, 3, paramBoolean1, "_hd", paramBoolean2)) + j;
              paramHashMap = paramString;
              localObject1 = localObject2;
            }
          }
        }
        com.tencent.mm.a.e.aY(str);
        i = k;
        localObject2 = paramHashMap;
        if (!bg.nm(str))
        {
          i = k;
          localObject2 = paramHashMap;
          if (!str.equals(localObject1))
          {
            w.d("MicroMsg.MMBakItemImg", "bigImgPath " + str + " " + com.tencent.mm.a.e.aY(str));
            i = k + b.a(new b.a(str, paramek, paramLinkedList, 2, paramBoolean1, paramBoolean2, null));
            localObject2 = paramHashMap;
          }
        }
      }
      do
      {
        paramau = a((com.tencent.mm.ao.d)localObject2, paramau);
        if (paramau != null) {
          break label966;
        }
        GMTrace.o(14816160776192L, 110389);
        return i;
        i = paramau.field_content.getBytes().length;
        break;
        GMTrace.o(14816160776192L, 110389);
        return -1;
        i = j;
        localObject2 = paramString;
      } while (!paramString.IH());
      String str = a.afG().afH().IZ().l(paramString.gGS, "", "");
      int m;
      if (paramString.II()) {
        if (paramString.II())
        {
          paramHashMap = a.afG().afH().IZ().gr(paramString.gHb);
          if (paramHashMap != null)
          {
            if (paramHashMap != null) {
              break label911;
            }
            i = -1;
            if (paramHashMap != null) {
              break label921;
            }
            k = -1;
            if (paramHashMap != null) {
              break label931;
            }
            localObject1 = "null";
            if (paramHashMap != null) {
              break label941;
            }
            m = -1;
            w.i("MicroMsg.MMBakItemImg", "hdinfo off:%d total:%d path:%s, compressType[%d]", new Object[] { Integer.valueOf(i), Integer.valueOf(k), localObject1, Integer.valueOf(m) });
            if ((paramHashMap == null) || (paramHashMap.gGV != 1)) {
              break label959;
            }
            if ((paramHashMap.equals(paramString)) || (paramHashMap.offset != paramHashMap.gsL)) {
              break label951;
            }
            paramHashMap = a.afG().afH().IZ().l(paramHashMap.gGS, "", "");
            w.d("MicroMsg.MMBakItemImg", "hdPath " + paramHashMap + " " + com.tencent.mm.a.e.aY(paramHashMap));
            j += b.a(new b.a(paramHashMap, paramek, paramLinkedList, 3, paramBoolean1, "_hd", paramBoolean2));
            com.tencent.mm.a.e.aY(paramHashMap);
          }
        }
      }
      for (;;)
      {
        i = j;
        localObject2 = paramString;
        if (!com.tencent.mm.a.e.aZ(str)) {
          break;
        }
        com.tencent.mm.a.e.aY(str);
        i = j;
        localObject2 = paramString;
        if (bg.nm(str)) {
          break;
        }
        i = j;
        localObject2 = paramString;
        if (str.equals(paramHashMap)) {
          break;
        }
        w.d("MicroMsg.MMBakItemImg", "path " + str + " " + com.tencent.mm.a.e.aY(str));
        i = j + b.a(new b.a(str, paramek, paramLinkedList, 2, paramBoolean1, paramBoolean2, null));
        localObject2 = paramString;
        break;
        paramHashMap = paramString;
        break label574;
        i = paramHashMap.offset;
        break label582;
        k = paramHashMap.gsL;
        break label590;
        localObject1 = paramHashMap.gGS;
        break label600;
        m = paramHashMap.gGV;
        break label608;
        paramHashMap.equals(paramString);
        paramHashMap = "";
      }
      paramek.tPY = new azq().Rq(paramau);
      int j = paramau.length();
      GMTrace.o(14816160776192L, 110389);
      return i + j;
    }
  }
  
  public final int a(String paramString, ek paramek, au paramau)
  {
    GMTrace.i(14816429211648L, 110391);
    if (paramek.tPY == null)
    {
      w.d("MicroMsg.MMBakItemImg", "bakitem.getContent() is null");
      GMTrace.o(14816429211648L, 110391);
      return 0;
    }
    String str1 = new String(bg.aq(paramek.tPY.uNR, ""));
    w.d("MicroMsg.MMBakItemImg", "msg" + paramek.tQd + " " + str1);
    int i;
    int j;
    label117:
    Object localObject1;
    label128:
    f localf;
    if (paramek.tTe == null)
    {
      i = 0;
      j = paramek.tTg;
      if (paramek.tTd != null) {
        break label647;
      }
      paramString = "";
      if (paramek.tTc != null) {
        break label658;
      }
      localObject1 = "";
      w.d("MicroMsg.MMBakItemImg", "bakitem:, buf:%d, BufferType:%d, MediaType%s, ids:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), paramString, localObject1 });
      paramString = null;
      paramau.setContent(str1);
      localf = a.afG().afH().IZ();
      if (paramau.field_isSend != 1) {
        break label670;
      }
      if (paramau.field_msgId != 0L) {
        paramString = localf.aq(paramau.field_msgId);
      }
      if ((paramString != null) && (paramString.gGR != 0L)) {
        break label1202;
      }
      paramString = localf.ap(paramau.field_msgSvrId);
    }
    label234:
    label647:
    label658:
    label670:
    label744:
    label1202:
    for (;;)
    {
      localObject1 = bh.q(str1, "msg");
      if ((localObject1 != null) && (bg.getLong((String)((Map)localObject1).get(".msg.img.$hdlength"), 0L) > 0L)) {}
      for (i = 1;; i = 0)
      {
        Object localObject3 = bg.aq(h.a(paramek, 3), "");
        if ((paramek.tTg == 3) && (paramek.tTe != null)) {
          com.tencent.mm.a.e.a(h.aer() + "backupMeida/" + h.ti((String)localObject3), (String)localObject3, paramek.tTe.uNP.tJp);
        }
        localObject1 = bg.aq(h.a(paramek, 2), "");
        if ((paramek.tTg == 2) && (paramek.tTe != null)) {
          com.tencent.mm.a.e.a(h.aer() + "backupMeida/" + h.ti((String)localObject1), (String)localObject1, paramek.tTe.uNP.tJp);
        }
        w.d("MicroMsg.MMBakItemImg", "hdName %s, imgName:%s", new Object[] { localObject3, localObject1 });
        if (bg.nm((String)localObject1)) {
          localObject1 = localObject3;
        }
        for (;;)
        {
          Object localObject2 = h.b(paramek, 1);
          Object localObject4;
          if (localObject2 == null)
          {
            w.i("MicroMsg.MMBakItemImg", "getThumbBuf is null and read from mediapath");
            localObject2 = h.th((String)localObject1);
            str2 = g.n((System.currentTimeMillis() + " ").getBytes());
            localObject4 = h.aer() + "backupMeida/" + h.ti(str2);
            str3 = (String)localObject4 + str2;
            localObject4 = new File((String)localObject4);
            if (!((File)localObject4).exists()) {
              ((File)localObject4).mkdirs();
            }
            j = com.tencent.mm.sdk.platformtools.d.RC(str3);
            if (j > 0)
            {
              if (com.tencent.mm.sdk.platformtools.d.a((String)localObject2, Bitmap.CompressFormat.JPEG, str3, j)) {
                break label744;
              }
              w.e("MicroMsg.MMBakItemImg", "createLongPictureThumbNail failed");
              GMTrace.o(14816429211648L, 110391);
              return -1;
              i = paramek.tTe.uNN;
              break;
              paramString = paramek.tTd.toString();
              break label117;
              localObject1 = paramek.tTc.toString();
              break label128;
              paramString = localf.ap(paramau.field_msgSvrId);
              break label234;
            }
            if (!com.tencent.mm.sdk.platformtools.d.a((String)localObject2, 120, 120, Bitmap.CompressFormat.JPEG, 90, str3))
            {
              w.e("MicroMsg.MMBakItemImg", "createThumbNail failed");
              GMTrace.o(14816429211648L, 110391);
              return -1;
            }
            w.d("MicroMsg.MMBakItemImg", "insert: thumbName = " + str2);
            localObject2 = com.tencent.mm.a.e.d(str3, 0, -1);
          }
          while (localObject2 == null)
          {
            w.e("MicroMsg.MMBakItemImg", "img buf is null");
            GMTrace.o(14816429211648L, 110391);
            return -1;
            w.i("MicroMsg.MMBakItemImg", "getThumbBuf len:%d", new Object[] { Integer.valueOf(localObject2.length) });
          }
          String str2 = localf.l((String)localObject3, "", "");
          String str3 = localf.l((String)localObject1, "", "");
          long l1 = 0L;
          if (paramString.gGR == 0L)
          {
            if (i != 0)
            {
              i = h.c(paramek, 3);
              l2 = localf.a((byte[])localObject2, paramek.tQd, true, (String)localObject3, i, str1, new PString(), new PInt(), new PInt());
              l1 = l2;
              if (!h.b(paramek, 3, str2))
              {
                w.e("MicroMsg.MMBakItemImg", "writeItem MMBAK_HD_IMG failed:%s", new Object[] { str2 });
                l1 = l2;
              }
            }
            j = h.c(paramek, 2);
            i = j;
            if (j <= 0) {
              i = h.c(paramek, 3);
            }
            paramString = new PString();
            localObject3 = new PInt();
            localObject4 = new PInt();
            long l2 = localf.a((byte[])localObject2, paramek.tQd, false, (String)localObject1, i, str1, paramString, (PInt)localObject3, (PInt)localObject4);
            if (!h.b(paramek, 2, str3)) {
              w.e("MicroMsg.MMBakItemImg", "writeItem MMBAK_IMG failed:%s", new Object[] { str2 });
            }
            if (l2 > 0L)
            {
              paramau.dc(paramString.value);
              paramau.dN(((PInt)localObject3).value);
              paramau.dO(((PInt)localObject4).value);
              if (l1 > 0L)
              {
                paramString = a.afG().afH().IZ().b(Long.valueOf(l2));
                paramString.gn((int)l1);
                a.afG().afH().IZ().a(Long.valueOf(l2), paramString);
              }
            }
          }
          for (;;)
          {
            com.tencent.mm.plugin.backup.g.d.i(paramau);
            GMTrace.o(14816429211648L, 110391);
            return 0;
            GMTrace.o(14816429211648L, 110391);
            return -1;
            paramek = paramString.gGU;
            if ((paramek != null) && (paramek.startsWith("THUMBNAIL_DIRPATH://"))) {
              paramau.dc(paramek);
            } else {
              paramau.dc("THUMBNAIL://" + paramString.gGR);
            }
          }
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\backup\e\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */