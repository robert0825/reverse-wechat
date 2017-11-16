package com.tencent.mm.k;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class b
{
  public static int tV()
  {
    GMTrace.i(4100888461312L, 30554);
    int i = bg.getInt(g.ut().getValue("InputLimitSessionTextMsg"), 8192);
    GMTrace.o(4100888461312L, 30554);
    return i * 2;
  }
  
  public static int tW()
  {
    GMTrace.i(4101022679040L, 30555);
    int i = bg.getInt(g.ut().getValue("InputLimitSNSObjectText"), 2000);
    GMTrace.o(4101022679040L, 30555);
    return i * 2;
  }
  
  public static int tX()
  {
    GMTrace.i(4101156896768L, 30556);
    int i = bg.getInt(g.ut().getValue("SnsCommentMaxSize"), 1000);
    GMTrace.o(4101156896768L, 30556);
    return i * 2;
  }
  
  public static int tY()
  {
    GMTrace.i(4101291114496L, 30557);
    int i = bg.getInt(g.ut().getValue("InputLimitFavText"), 100000);
    GMTrace.o(4101291114496L, 30557);
    return i * 2;
  }
  
  public static int tZ()
  {
    GMTrace.i(4101425332224L, 30558);
    int i = bg.getInt(g.ut().getValue("InputLimitSendEmotionBufSize"), 1048576);
    GMTrace.o(4101425332224L, 30558);
    return i;
  }
  
  public static int ua()
  {
    GMTrace.i(4101559549952L, 30559);
    try
    {
      int i = bg.getInt(g.ut().getValue("InputLimitSendEmotionWidth"), 1024);
      GMTrace.o(4101559549952L, 30559);
      return i;
    }
    catch (Exception localException)
    {
      w.j("MicroMsg.BoundaryConfig", "getCustomEmojiMaxWidthAndHeight:%s", new Object[] { localException });
      GMTrace.o(4101559549952L, 30559);
    }
    return 1024;
  }
  
  public static int ub()
  {
    GMTrace.i(4101693767680L, 30560);
    try
    {
      int i = bg.getInt(g.ut().getValue("InputLimitSendAppMsgEmotionBufSize"), 5242880);
      GMTrace.o(4101693767680L, 30560);
      return i;
    }
    catch (Exception localException)
    {
      w.j("MicroMsg.BoundaryConfig", "getAppEmojiMsgMaxSize:%s", new Object[] { localException });
      GMTrace.o(4101693767680L, 30560);
    }
    return 5242880;
  }
  
  public static int uc()
  {
    GMTrace.i(4101827985408L, 30561);
    int i = bg.getInt(g.ut().getValue("InputLimitFavImageSize"), 26214400);
    GMTrace.o(4101827985408L, 30561);
    return i;
  }
  
  public static String ud()
  {
    GMTrace.i(4101962203136L, 30562);
    String str = g.ut().getValue("InputLimitForbiddenChar");
    GMTrace.o(4101962203136L, 30562);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\k\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */