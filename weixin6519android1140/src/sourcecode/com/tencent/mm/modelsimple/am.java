package com.tencent.mm.modelsimple;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.loader.stub.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.io.File;

public final class am
{
  public static com.tencent.mm.ad.e fUd;
  public static boolean gVi;
  private static int gVj;
  private static long gVk;
  
  static
  {
    GMTrace.i(1360028237824L, 10133);
    fUd = null;
    gVi = false;
    gVj = 3;
    gVk = 0L;
    GMTrace.o(1360028237824L, 10133);
  }
  
  public static void run()
  {
    GMTrace.i(1359625584640L, 10130);
    if (gVi)
    {
      w.i("MicroMsg.PostTaskUploadHDHeadImg", "is uploading hdHeadImg now!");
      GMTrace.o(1359625584640L, 10130);
      return;
    }
    if ((gVk == 0L) || (bg.aI(gVk) > 180000L))
    {
      gVk = bg.Pw();
      gVj = 3;
    }
    if (gVj <= 0)
    {
      w.i("MicroMsg.PostTaskUploadHDHeadImg", "frequency limit");
      GMTrace.o(1359625584640L, 10130);
      return;
    }
    gVj -= 1;
    Object localObject = com.tencent.mm.compatible.util.e.fSg + "temp.avatar.hd";
    if (!new File((String)localObject).exists())
    {
      w.d("MicroMsg.PostTaskUploadHDHeadImg", "has uploaded HDHeadImg and delete it");
      GMTrace.o(1359625584640L, 10130);
      return;
    }
    if (fUd == null) {
      fUd = new com.tencent.mm.ad.e()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, k paramAnonymousk)
        {
          GMTrace.i(1368483954688L, 10196);
          w.i("MicroMsg.PostTaskUploadHDHeadImg", "onSceneEnd errType:%d, erCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0)) {
            b.deleteFile(this.gVl);
          }
          am.gVi = false;
          at.wS().b(157, am.fUd);
          GMTrace.o(1368483954688L, 10196);
        }
      };
    }
    at.wS().a(157, fUd);
    localObject = new l(1, (String)localObject);
    at.wS().a((k)localObject, 0);
    gVi = true;
    GMTrace.o(1359625584640L, 10130);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\modelsimple\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */