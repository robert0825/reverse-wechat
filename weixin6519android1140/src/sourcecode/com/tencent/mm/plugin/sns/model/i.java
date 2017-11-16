package com.tencent.mm.plugin.sns.model;

import android.graphics.Bitmap.CompressFormat;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.memory.n;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.storage.r;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public final class i
  extends h<String, Integer, Boolean>
{
  private String amf;
  private n gif;
  private String mDZ;
  private int prU;
  private String prV;
  private List<anu> prW;
  
  public i(String paramString1, String paramString2, List<anu> paramList)
  {
    GMTrace.i(8120440979456L, 60502);
    this.amf = "";
    this.gif = null;
    ae.bja().prz.add(paramString1);
    this.mDZ = paramString2;
    this.prV = ae.getAccSnsPath();
    this.prU = ae.bjl();
    this.prW = paramList;
    this.amf = paramString1;
    GMTrace.o(8120440979456L, 60502);
  }
  
  private boolean a(String paramString1, String paramString2, List<anu> paramList)
  {
    GMTrace.i(8120709414912L, 60504);
    w.i("MicroMsg.MutiImageLoader", "makeMutilMedia " + paramString1 + " " + paramString2);
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = paramList.iterator();
    int i = 0;
    String str1;
    String str3;
    String str2;
    if (localIterator.hasNext())
    {
      anu localanu = (anu)localIterator.next();
      str1 = com.tencent.mm.plugin.sns.data.i.f(localanu);
      str3 = com.tencent.mm.plugin.sns.data.i.e(localanu);
      str2 = am.dE(this.prV, localanu.mmR);
      if (!FileOp.aZ(str2 + str1)) {
        if (!FileOp.aZ(str2 + str3))
        {
          paramList = com.tencent.mm.plugin.sns.data.i.l(localanu);
          if (FileOp.aZ(str2 + paramList)) {
            break label465;
          }
          paramList = com.tencent.mm.plugin.sns.data.i.m(localanu);
        }
      }
    }
    label465:
    for (;;)
    {
      r.a(str2, paramList, str3, ae.bjm());
      r.b(str2, str3, str1, ae.bjl());
      paramList = com.tencent.mm.plugin.sns.data.i.GV(str2 + str1);
      if (paramList == null)
      {
        FileOp.deleteFile(str2 + str1);
        w.e("MicroMsg.MutiImageLoader", "userThumb decode fail !! " + str1);
        GMTrace.o(8120709414912L, 60504);
        return false;
      }
      localLinkedList.add(paramList);
      w.i("MicroMsg.MutiImageLoader", "getbitmap from bm " + paramList + " " + str2 + str1);
      i += 1;
      if (i >= 4) {
        try
        {
          paramString1 = am.dE(this.prV, paramString1);
          FileOp.la(paramString1);
          d.a(com.tencent.mm.plugin.sns.data.i.i(localLinkedList, this.prU), 100, Bitmap.CompressFormat.JPEG, paramString1 + paramString2, false);
          GMTrace.o(8120709414912L, 60504);
          return true;
        }
        catch (IOException paramString1)
        {
          w.printErrStackTrace("MicroMsg.MutiImageLoader", paramString1, "makeMutilMedia failed: " + paramString2, new Object[0]);
          GMTrace.o(8120709414912L, 60504);
          return false;
        }
      }
      break;
    }
  }
  
  public final com.tencent.mm.sdk.platformtools.ae biu()
  {
    GMTrace.i(8120575197184L, 60503);
    com.tencent.mm.sdk.platformtools.ae localae = ae.aCY();
    GMTrace.o(8120575197184L, 60503);
    return localae;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */