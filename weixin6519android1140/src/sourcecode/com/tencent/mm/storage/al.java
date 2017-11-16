package com.tencent.mm.storage;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Map;

public final class al
{
  public String aeskey;
  public String eDW;
  public String eDs;
  public String eEa;
  public String eHW;
  public long eSf;
  public int fwu;
  public String fwv;
  public int gLK;
  public String hcn;
  public long hcs;
  public int height;
  public String id;
  public String mhI;
  public String thumbUrl;
  public int vAP;
  public int vAQ;
  public int vAR;
  public int vAS;
  public String vAT;
  public String vAU;
  public String vAV;
  public String vAW;
  public boolean vAX;
  public String vAY;
  public int width;
  
  public al()
  {
    GMTrace.i(1532498018304L, 11418);
    this.vAT = "";
    this.fwv = "";
    this.vAX = true;
    GMTrace.o(1532498018304L, 11418);
  }
  
  public static al a(Map<String, String> paramMap, String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(1532632236032L, 11419);
    if (paramMap == null)
    {
      GMTrace.o(1532632236032L, 11419);
      return null;
    }
    al localal = new al();
    localal.vAT = paramString2;
    localal.eDs = paramString1;
    localal.id = ((String)paramMap.get(".msg.emoji.$idbuffer"));
    localal.hcn = ((String)paramMap.get(".msg.emoji.$fromusername"));
    paramString1 = (String)paramMap.get(".msg.emoji.$androidmd5");
    localal.eDW = paramString1;
    if (paramString1 == null) {
      localal.eDW = ((String)paramMap.get(".msg.emoji.$md5"));
    }
    if (!bg.nm(localal.eDW)) {
      localal.eDW = localal.eDW.toLowerCase();
    }
    try
    {
      localal.vAP = Integer.valueOf((String)paramMap.get(".msg.emoji.$type")).intValue();
      if (paramMap.get(".msg.emoji.$androidlen") != null) {
        localal.vAQ = Integer.valueOf((String)paramMap.get(".msg.emoji.$androidlen")).intValue();
      }
      for (;;)
      {
        if (paramMap.get(".msg.gameext.$type") != null) {
          localal.vAR = Integer.valueOf((String)paramMap.get(".msg.gameext.$type")).intValue();
        }
        if (paramMap.get(".msg.gameext.$content") != null) {
          localal.vAS = Integer.valueOf((String)paramMap.get(".msg.gameext.$content")).intValue();
        }
        if (paramMap.get(".msg.emoji.$productid") != null) {
          localal.eEa = ((String)paramMap.get(".msg.emoji.$productid"));
        }
        if (paramMap.get(".msg.emoji.$cdnurl") != null) {
          localal.mhI = ((String)paramMap.get(".msg.emoji.$cdnurl"));
        }
        if (paramMap.get(".msg.emoji.$designerid") != null) {
          localal.vAU = ((String)paramMap.get(".msg.emoji.$designerid"));
        }
        if (paramMap.get(".msg.emoji.$thumburl") != null) {
          localal.thumbUrl = ((String)paramMap.get(".msg.emoji.$thumburl"));
        }
        if (paramMap.get(".msg.emoji.$encrypturl") != null) {
          localal.eHW = ((String)paramMap.get(".msg.emoji.$encrypturl"));
        }
        if (paramMap.get(".msg.emoji.$aeskey") != null) {
          localal.aeskey = ((String)paramMap.get(".msg.emoji.$aeskey"));
        }
        if (paramMap.get(".msg.emoji.$width") != null) {
          localal.width = Integer.valueOf((String)paramMap.get(".msg.emoji.$width")).intValue();
        }
        if (paramMap.get(".msg.emoji.$height") != null) {
          localal.height = Integer.valueOf((String)paramMap.get(".msg.emoji.$height")).intValue();
        }
        if (paramMap.get(".msg.emoji.$externurl") != null) {
          localal.vAV = ((String)paramMap.get(".msg.emoji.$externurl"));
        }
        if (paramMap.get(".msg.emoji.$externmd5") != null) {
          localal.vAW = ((String)paramMap.get(".msg.emoji.$externmd5"));
        }
        if (paramMap.get(".msg.emoji.$activityid") != null) {
          localal.vAY = ((String)paramMap.get(".msg.emoji.$activityid"));
        }
        if (!bg.nm(paramString3)) {
          localal.fwv = paramString3;
        }
        w.d("MicroMsg.emoji.EmojiMsgInfo", "parserEmojiXml id:%s  md5:%s  type:%d  len:%d  gameType:%d  gameContent:%d  productId:%s  cdnUrl:%s designerid:%s thumburl:%s encryptrul:%s width:%d height:%d externUrl:%s externMd5:%s", new Object[] { localal.id, localal.eDW, Integer.valueOf(localal.vAP), Integer.valueOf(localal.vAQ), Integer.valueOf(localal.vAR), Integer.valueOf(localal.vAS), localal.eEa, localal.mhI, localal.vAU, localal.thumbUrl, localal.eHW, Integer.valueOf(localal.width), Integer.valueOf(localal.height), localal.vAV, localal.vAW });
        GMTrace.o(1532632236032L, 11419);
        return localal;
        if (paramMap.get(".msg.emoji.$len") != null) {
          localal.vAQ = Integer.valueOf((String)paramMap.get(".msg.emoji.$len")).intValue();
        }
      }
      return null;
    }
    catch (Exception paramMap)
    {
      w.e("MicroMsg.emoji.EmojiMsgInfo", "exception:%s", new Object[] { bg.f(paramMap) });
      GMTrace.o(1532632236032L, 11419);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */