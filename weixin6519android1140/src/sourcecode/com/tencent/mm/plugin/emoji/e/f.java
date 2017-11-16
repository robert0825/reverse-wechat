package com.tencent.mm.plugin.emoji.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;

public final class f
{
  private static final com.tencent.mm.ao.a.a.c kiu;
  
  static
  {
    GMTrace.i(11550509236224L, 86058);
    c.a locala = new c.a();
    locala.gKA = true;
    locala.gKH = 1;
    locala.gKY = false;
    kiu = locala.Jn();
    GMTrace.o(11550509236224L, 86058);
  }
  
  public static com.tencent.mm.ao.a.a.c a(String paramString, int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(11549972365312L, 86054);
    if (!bg.nm(paramString))
    {
      c.a locala = new c.a();
      locala.gKC = true;
      locala.gKE = paramString;
      locala.gKJ = paramInt;
      locala.gKI = paramInt;
      locala.gLe = paramVarArgs;
      paramString = locala.Jn();
      GMTrace.o(11549972365312L, 86054);
      return paramString;
    }
    w.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
    GMTrace.o(11549972365312L, 86054);
    return null;
  }
  
  public static com.tencent.mm.ao.a.a.c aqy()
  {
    GMTrace.i(11549435494400L, 86050);
    Object localObject = new c.a();
    ((c.a)localObject).gKA = true;
    ((c.a)localObject).gKC = false;
    ((c.a)localObject).gKH = 3;
    localObject = ((c.a)localObject).Jn();
    GMTrace.o(11549435494400L, 86050);
    return (com.tencent.mm.ao.a.a.c)localObject;
  }
  
  public static com.tencent.mm.ao.a.a.c b(String paramString1, String paramString2, Object... paramVarArgs)
  {
    GMTrace.i(11549167058944L, 86048);
    at.AR();
    paramString1 = EmojiLogic.F(com.tencent.mm.y.c.zb(), paramString1, paramString2);
    if (!bg.nm(paramString1))
    {
      paramString2 = new c.a();
      paramString2.gKA = true;
      paramString2.gKC = true;
      paramString2.gKE = paramString1;
      paramString2.gLe = paramVarArgs;
      paramString1 = paramString2.Jn();
      GMTrace.o(11549167058944L, 86048);
      return paramString1;
    }
    w.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
    GMTrace.o(11549167058944L, 86048);
    return null;
  }
  
  public static com.tencent.mm.ao.a.a.c bQ(String paramString1, String paramString2)
  {
    GMTrace.i(11549032841216L, 86047);
    paramString1 = b(paramString1, paramString2, new Object[0]);
    GMTrace.o(11549032841216L, 86047);
    return paramString1;
  }
  
  public static com.tencent.mm.ao.a.a.c bR(String paramString1, String paramString2)
  {
    GMTrace.i(11550106583040L, 86055);
    at.AR();
    paramString1 = EmojiLogic.F(com.tencent.mm.y.c.zb(), paramString1, paramString2);
    if (!bg.nm(paramString1))
    {
      paramString2 = new c.a();
      paramString2.gKA = true;
      paramString2.gKC = true;
      paramString2.gKE = paramString1;
      paramString2.gKZ = true;
      paramString1 = paramString2.Jn();
      GMTrace.o(11550106583040L, 86055);
      return paramString1;
    }
    w.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
    GMTrace.o(11550106583040L, 86055);
    return null;
  }
  
  public static com.tencent.mm.ao.a.a.c bS(String paramString1, String paramString2)
  {
    GMTrace.i(17972693303296L, 133907);
    at.AR();
    paramString1 = EmojiLogic.F(com.tencent.mm.y.c.zb(), paramString1, paramString2);
    if (!bg.nm(paramString1))
    {
      paramString2 = new c.a();
      paramString2.gKA = true;
      paramString2.gKC = true;
      paramString2.gKE = paramString1;
      paramString2.gKZ = false;
      paramString1 = paramString2.Jn();
      GMTrace.o(17972693303296L, 133907);
      return paramString1;
    }
    w.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
    GMTrace.o(17972693303296L, 133907);
    return null;
  }
  
  public static com.tencent.mm.ao.a.a.c c(String paramString1, String paramString2, Object... paramVarArgs)
  {
    GMTrace.i(11549569712128L, 86051);
    at.AR();
    String str = com.tencent.mm.y.c.zo();
    at.AR();
    paramString1 = EmojiLogic.F(com.tencent.mm.y.c.zb(), paramString1, paramString2);
    if (!bg.nm(paramString1))
    {
      paramString2 = new c.a();
      paramString2.gKA = true;
      paramString2.gKC = true;
      paramString2.gKE = paramString1;
      paramString2.gKF = str;
      paramString2.gLe = paramVarArgs;
      paramString1 = paramString2.Jn();
      GMTrace.o(11549569712128L, 86051);
      return paramString1;
    }
    w.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
    GMTrace.o(11549569712128L, 86051);
    return null;
  }
  
  public static com.tencent.mm.ao.a.a.c g(String paramString1, String paramString2, Object... paramVarArgs)
  {
    GMTrace.i(11550240800768L, 86056);
    at.AR();
    paramString1 = EmojiLogic.F(com.tencent.mm.y.c.zb(), paramString1, paramString2);
    if (!bg.nm(paramString1))
    {
      paramString2 = new c.a();
      paramString2.gKA = false;
      paramString2.gKC = true;
      paramString2.gKE = paramString1;
      paramString2.gLe = paramVarArgs;
      paramString1 = paramString2.Jn();
      GMTrace.o(11550240800768L, 86056);
      return paramString1;
    }
    w.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
    GMTrace.o(11550240800768L, 86056);
    return null;
  }
  
  public static com.tencent.mm.ao.a.a.c g(String paramString, Object... paramVarArgs)
  {
    GMTrace.i(11549703929856L, 86052);
    if (!bg.nm(paramString))
    {
      c.a locala = new c.a();
      locala.gKC = true;
      locala.gKE = paramString;
      locala.gLe = paramVarArgs;
      paramString = locala.Jn();
      GMTrace.o(11549703929856L, 86052);
      return paramString;
    }
    w.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
    GMTrace.o(11549703929856L, 86052);
    return null;
  }
  
  public static com.tencent.mm.ao.a.a.c h(String paramString1, String paramString2, Object... paramVarArgs)
  {
    GMTrace.i(11550375018496L, 86057);
    at.AR();
    paramString1 = EmojiLogic.F(com.tencent.mm.y.c.zb(), paramString1, paramString2);
    if (!bg.nm(paramString1))
    {
      paramString2 = new c.a();
      paramString2.gKA = true;
      paramString2.gKC = true;
      paramString2.gKE = paramString1;
      paramString2.gLe = paramVarArgs;
      paramString1 = paramString2.Jn();
      GMTrace.o(11550375018496L, 86057);
      return paramString1;
    }
    w.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
    GMTrace.o(11550375018496L, 86057);
    return null;
  }
  
  public static com.tencent.mm.ao.a.a.c h(String paramString, Object... paramVarArgs)
  {
    GMTrace.i(11549838147584L, 86053);
    if (!bg.nm(paramString))
    {
      c.a locala = new c.a();
      locala.gKC = true;
      locala.gKE = paramString;
      locala.gLc = false;
      locala.gLe = paramVarArgs;
      paramString = locala.Jn();
      GMTrace.o(11549838147584L, 86053);
      return paramString;
    }
    w.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
    GMTrace.o(11549838147584L, 86053);
    return null;
  }
  
  public static com.tencent.mm.ao.a.a.c o(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(11549301276672L, 86049);
    at.AR();
    paramString1 = EmojiLogic.F(com.tencent.mm.y.c.zb(), paramString1, paramString2);
    if (!bg.nm(paramString1))
    {
      paramString2 = new c.a();
      paramString2.gKA = true;
      paramString2.gKC = true;
      paramString2.gKE = paramString1;
      paramString2.gKJ = paramInt;
      paramString2.gKI = paramInt;
      paramString1 = paramString2.Jn();
      GMTrace.o(11549301276672L, 86049);
      return paramString1;
    }
    w.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
    GMTrace.o(11549301276672L, 86049);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\e\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */