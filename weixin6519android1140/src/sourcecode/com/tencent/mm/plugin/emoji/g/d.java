package com.tencent.mm.plugin.emoji.g;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public final class d
{
  public static ArrayList<EmojiGroupInfo> wo(String paramString)
  {
    GMTrace.i(11303145963520L, 84215);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.emoji.EmojiRecommendXMLParser", "[recommend emotion parser] parse xml faild. xml is null.");
      GMTrace.o(11303145963520L, 84215);
      return null;
    }
    Object localObject1 = DocumentBuilderFactory.newInstance();
    for (;;)
    {
      int i;
      EmojiGroupInfo localEmojiGroupInfo;
      int j;
      Object localObject2;
      try
      {
        paramString = ((DocumentBuilderFactory)localObject1).newDocumentBuilder().parse(new InputSource(new ByteArrayInputStream(paramString.getBytes())));
        paramString.normalize();
        paramString = paramString.getDocumentElement().getElementsByTagName("Emotion");
        if ((paramString != null) && (paramString.getLength() > 0))
        {
          localObject1 = new ArrayList();
          i = 0;
          if (i >= paramString.getLength()) {
            break label747;
          }
          localEmojiGroupInfo = new EmojiGroupInfo();
          NodeList localNodeList = paramString.item(i).getChildNodes();
          int k = localNodeList.getLength();
          j = 0;
          if (j >= k) {
            break label662;
          }
          localObject2 = localNodeList.item(j);
          if ((localObject2 != null) && (((Node)localObject2).getNodeName() != null) && (((Node)localObject2).getNodeName().equals("ProductID")))
          {
            localObject2 = ((Node)localObject2).getTextContent();
            w.d("MicroMsg.emoji.EmojiRecommendXMLParser", "[recommend emotion parser] productId:%s", new Object[] { localObject2 });
            localEmojiGroupInfo.field_productID = ((String)localObject2);
          }
          else if ((localObject2 != null) && (((Node)localObject2).getNodeName() != null) && (((Node)localObject2).getNodeName().equals("RecType")))
          {
            localObject2 = ((Node)localObject2).getTextContent();
            w.d("MicroMsg.emoji.EmojiRecommendXMLParser", "[recommend emotion parser] RecType:%s", new Object[] { localObject2 });
            localEmojiGroupInfo.field_recommandType = Integer.valueOf((String)localObject2).intValue();
          }
        }
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.emoji.EmojiRecommendXMLParser", "[parser] parseXML exception:%s", new Object[] { paramString.toString() });
        GMTrace.o(11303145963520L, 84215);
        return null;
      }
      if ((localObject2 != null) && (((Node)localObject2).getNodeName() != null) && (((Node)localObject2).getNodeName().equals("RecWord")))
      {
        localObject2 = ((Node)localObject2).getTextContent();
        w.d("MicroMsg.emoji.EmojiRecommendXMLParser", "[recommend emotion parser] recWord:%s", new Object[] { localObject2 });
        localEmojiGroupInfo.field_recommandWord = ((String)localObject2);
      }
      else if ((localObject2 != null) && (((Node)localObject2).getNodeName() != null) && (((Node)localObject2).getNodeName().equals("Name")))
      {
        localObject2 = ((Node)localObject2).getTextContent();
        w.d("MicroMsg.emoji.EmojiRecommendXMLParser", "[recommend emotion parser] Name:%s", new Object[] { localObject2 });
        localEmojiGroupInfo.field_packName = ((String)localObject2);
      }
      else if ((localObject2 != null) && (((Node)localObject2).getNodeName() != null) && (((Node)localObject2).getNodeName().equals("Panel")))
      {
        localObject2 = ((Node)localObject2).getTextContent();
        w.d("MicroMsg.emoji.EmojiRecommendXMLParser", "[recommend emotion parser] iconUrl:%s", new Object[] { localObject2 });
        localEmojiGroupInfo.field_packGrayIconUrl = ((String)localObject2);
      }
      else if ((localObject2 != null) && (((Node)localObject2).getNodeName() != null) && (((Node)localObject2).getNodeName().equals("Icon")))
      {
        localObject2 = ((Node)localObject2).getTextContent();
        w.d("MicroMsg.emoji.EmojiRecommendXMLParser", "[recommend emotion parser] BigIconUrl:%s", new Object[] { localObject2 });
        localEmojiGroupInfo.field_BigIconUrl = ((String)localObject2);
      }
      else if ((localObject2 != null) && (((Node)localObject2).getNodeName() != null) && (((Node)localObject2).getNodeName().equals("ButtonType")))
      {
        localObject2 = ((Node)localObject2).getTextContent();
        w.d("MicroMsg.emoji.EmojiRecommendXMLParser", "[recommend emotion parser] buttonType:%s", new Object[] { localObject2 });
        localEmojiGroupInfo.field_buttonType = Integer.valueOf((String)localObject2).intValue();
        break label758;
        label662:
        if (!bg.nm(localEmojiGroupInfo.field_productID))
        {
          localEmojiGroupInfo.field_recommand = 1;
          localEmojiGroupInfo.field_lastUseTime = System.currentTimeMillis();
          localEmojiGroupInfo.field_sort = 0;
          g.ork.i(12068, new Object[] { Integer.valueOf(1), localEmojiGroupInfo.field_productID, Integer.valueOf(localEmojiGroupInfo.field_recommandType) });
          ((ArrayList)localObject1).add(localEmojiGroupInfo);
        }
        i += 1;
        continue;
        label747:
        GMTrace.o(11303145963520L, 84215);
        return (ArrayList<EmojiGroupInfo>)localObject1;
      }
      label758:
      j += 1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\g\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */