package com.tencent.mm.plugin.exdevice.f.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.plugin.exdevice.f.b.a.a;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import java.io.ByteArrayOutputStream;

public final class c
  implements i.a
{
  String appName;
  String kBG;
  
  public c()
  {
    GMTrace.i(11187852935168L, 83356);
    this.kBG = null;
    this.appName = null;
    GMTrace.o(11187852935168L, 83356);
  }
  
  public final int a(String paramString, int paramInt, keep_ProgressInfo paramkeep_ProgressInfo, keep_SceneResult paramkeep_SceneResult, boolean paramBoolean)
  {
    GMTrace.i(11188255588352L, 83359);
    w.d("MicroMsg.ExdevicePictureUploader", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", new Object[] { paramString, Integer.valueOf(paramInt), paramkeep_ProgressInfo, paramkeep_SceneResult });
    if ((paramkeep_SceneResult != null) && (paramString.equals(this.kBG))) {
      if ((paramInt == 0) && (paramkeep_SceneResult.field_retCode == 0))
      {
        w.d("MicroMsg.ExdevicePictureUploader", "hy: transfer done, upload callback success");
        w.i("MicroMsg.ExdevicePictureUploader", "transfer done, mediaid=%s, completeInfo=%s", new Object[] { paramString, paramkeep_SceneResult.toString() });
        paramString = new a();
        paramString.field_championUrl = paramkeep_SceneResult.field_fileUrl;
        paramString.field_username = q.zE();
        b.wJ(paramString.field_championUrl);
        ad.atV().a(paramString, true);
        ad.atZ();
        paramkeep_ProgressInfo = paramString.field_championUrl;
        paramString = paramString.field_championMotto;
        at.wS().a(new m(paramkeep_ProgressInfo, paramString), 0);
      }
    }
    for (;;)
    {
      GMTrace.o(11188255588352L, 83359);
      return 0;
      w.w("MicroMsg.ExdevicePictureUploader", "hy: transfer done, fail");
      continue;
      if (paramkeep_ProgressInfo != null) {
        w.d("MicroMsg.ExdevicePictureUploader", "hy: upload progressing....");
      }
    }
  }
  
  public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
    GMTrace.i(11187987152896L, 83357);
    GMTrace.o(11187987152896L, 83357);
  }
  
  public final byte[] h(String paramString, byte[] paramArrayOfByte)
  {
    GMTrace.i(11188121370624L, 83358);
    GMTrace.o(11188121370624L, 83358);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\f\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */