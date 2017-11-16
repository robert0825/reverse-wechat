package com.tencent.mm.plugin.mmsight.model;

import android.media.MediaMetadataRetriever;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.protocal.c.anf;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;

public final class l
{
  public static boolean a(String paramString, VideoTransPara paramVideoTransPara, anf paramanf, d paramd)
  {
    GMTrace.i(18678812770304L, 139168);
    Object localObject = paramanf;
    try
    {
      boolean bool = bg.nm(paramString);
      if ((bool) || (paramVideoTransPara == null))
      {
        GMTrace.o(18678812770304L, 139168);
        return false;
      }
      anf localanf = paramanf;
      if (paramanf == null)
      {
        localObject = paramanf;
        localanf = new anf();
      }
      localObject = localanf;
      w.i("MicroMsg.SightSendVideoLogic", "check localCaptureVideo %s videoPath %s videoParams %s, finishPreSendProcess: %s", new Object[] { Boolean.valueOf(localanf.uBZ), paramString, paramVideoTransPara, Boolean.valueOf(localanf.uCd) });
      localObject = localanf;
      if (localanf.uCd)
      {
        localObject = localanf;
        w.i("MicroMsg.SightSendVideoLogic", "checkShouldRemuxing, already finish preSendProcess, videoPath: %s", new Object[] { paramString });
        GMTrace.o(18678812770304L, 139168);
        return false;
      }
      localObject = localanf;
      if (localanf.uBZ)
      {
        localObject = localanf;
        if (!bg.nm(paramString))
        {
          localObject = localanf;
          SightVideoJNI.tagMP4Dscp(paramString, com.tencent.mm.modelcontrol.d.Gv().getWeixinMeta());
          localObject = localanf;
          if (!bg.nm(localanf.uCc))
          {
            localObject = localanf;
            SightVideoJNI.tagMp4RecordInfo(paramString, localanf.uCc);
          }
          localObject = localanf;
          long l = bg.Pw();
          localObject = localanf;
          SightVideoJNI.optimizeMP4(paramString);
          localObject = localanf;
          w.i("MicroMsg.SightSendVideoLogic", "optimizeMP4 used %sms", new Object[] { Long.valueOf(bg.aI(l)) });
          localObject = localanf;
          paramd.aNY();
          localObject = localanf;
          paramanf = new MediaMetadataRetriever();
          localObject = localanf;
          paramanf.setDataSource(paramString);
          localObject = localanf;
          int i = bg.getInt(paramanf.extractMetadata(18), 0);
          localObject = localanf;
          int j = bg.getInt(paramanf.extractMetadata(19), 0);
          localObject = localanf;
          paramanf.release();
          localObject = localanf;
          w.i("MicroMsg.SightSendVideoLogic", "videopath %d %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
          localObject = localanf;
          i = Math.min(i, j);
          localObject = localanf;
          if (i > paramVideoTransPara.width)
          {
            localObject = localanf;
            if ((i <= paramVideoTransPara.width) || (i % 16 != 0)) {
              break label474;
            }
            localObject = localanf;
            if (Math.abs(i - paramVideoTransPara.width) >= 16) {
              break label474;
            }
          }
          localObject = localanf;
          bool = localanf.uBY;
          if (!bool) {
            break label454;
          }
          GMTrace.o(18678812770304L, 139168);
          return true;
        }
      }
      GMTrace.o(18678812770304L, 139168);
      return false;
      label454:
      localObject = localanf;
      localanf.uCd = true;
      GMTrace.o(18678812770304L, 139168);
      return false;
      label474:
      GMTrace.o(18678812770304L, 139168);
      return true;
    }
    catch (Exception paramVideoTransPara)
    {
      w.e("MicroMsg.SightSendVideoLogic", "checkShouldRemuxing error: %s %s", new Object[] { paramVideoTransPara.getMessage(), paramString });
      if (localObject != null) {
        ((anf)localObject).uCd = true;
      }
      GMTrace.o(18678812770304L, 139168);
    }
    return false;
  }
  
  public static int b(String paramString, VideoTransPara paramVideoTransPara, anf paramanf, d paramd)
  {
    GMTrace.i(18678946988032L, 139169);
    if ((paramanf == null) || (!paramanf.uBZ) || (!FileOp.aZ(paramString)))
    {
      GMTrace.o(18678946988032L, 139169);
      return -1;
    }
    if (paramanf.uCd) {
      w.i("MicroMsg.SightSendVideoLogic", "doRemuxingSendVideoMsg, already finish preSendProcess, videoPath: %s", new Object[] { paramString });
    }
    for (;;)
    {
      int i;
      int n;
      int i1;
      try
      {
        Object localObject = FileOp.kZ(paramString);
        if (((String)localObject).endsWith("/")) {
          break label744;
        }
        localObject = (String)localObject + "/";
        String str1 = new File(paramString).getName();
        i = str1.lastIndexOf('.');
        if (i > 0)
        {
          str1 = str1.substring(0, i);
          String str3 = (String)localObject + str1 + "_hd";
          String str2 = str3;
          if (paramString.endsWith(".mp4")) {
            str2 = str3 + ".mp4";
          }
          str3 = (String)localObject + str1 + "tempRemuxing.mp4";
          FileOp.o(paramString, str2);
          w.i("MicroMsg.SightSendVideoLogic", "doRemuxingSendVideoMsg, dir: %s, oldFileName: %s, hdFilePath: %s, remuxingOutputFile: %s extInfotrycount %d", new Object[] { localObject, str1, str2, str3, Integer.valueOf(paramanf.uCa) });
          localObject = new MediaMetadataRetriever();
          ((MediaMetadataRetriever)localObject).setDataSource(str2);
          n = bg.getInt(((MediaMetadataRetriever)localObject).extractMetadata(18), 0);
          i1 = bg.getInt(((MediaMetadataRetriever)localObject).extractMetadata(19), 0);
          i = Math.min(n, i1);
          j = paramVideoTransPara.width;
          if (i < j)
          {
            GMTrace.o(18678946988032L, 139169);
            return 0;
          }
          i = Math.min(n, i1);
          if (i <= paramVideoTransPara.width) {
            break label747;
          }
          if ((i > paramVideoTransPara.width) && (i % 16 == 0) && (Math.abs(i - paramVideoTransPara.width) < 16))
          {
            break label747;
            w.i("MicroMsg.SightSendVideoLogic", "start remuxing %s,  rawwith %s, rawheight %s, outputWidth: %s, outputHeight: %s videoParams: %s", new Object[] { paramString, Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(j), Integer.valueOf(m), paramVideoTransPara });
            long l = bg.Pw();
            i = SightVideoJNI.remuxing(str2, str3, j, m, paramVideoTransPara.videoBitrate, paramVideoTransPara.gBn, 8, paramVideoTransPara.gBm, 25.0F, 30.0F, null, 0, false);
            w.i("MicroMsg.SightSendVideoLogic", "doremuxing finish %s,  rawwith %s, rawheight %s, outputWidth: %s, outputHeight: %s duration: %s, used %sms", new Object[] { paramString, Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(j), Integer.valueOf(m), Integer.valueOf(i), Long.valueOf(bg.aI(l)) });
            FileOp.al(str3, paramString);
            l = bg.Pw();
            if (paramanf.uBZ)
            {
              SightVideoJNI.tagMP4Dscp(paramString, com.tencent.mm.modelcontrol.d.Gv().getWeixinMeta());
              if (!bg.nm(paramanf.uCc)) {
                SightVideoJNI.tagMp4RecordInfo(paramString, paramanf.uCc);
              }
              SightVideoJNI.optimizeMP4(paramString);
            }
            paramd.aNY();
            w.i("MicroMsg.SightSendVideoLogic", "tagMP4Dscp used %sms", new Object[] { Long.valueOf(bg.aI(l)) });
            GMTrace.o(18678946988032L, 139169);
            return i;
          }
          double d;
          if (n < i1)
          {
            i = paramVideoTransPara.width;
            d = 1.0D * n / i;
            j = (int)(i1 / d);
          }
          else
          {
            j = paramVideoTransPara.width;
            d = 1.0D * i1 / j;
            i = (int)(n / d);
          }
        }
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.SightSendVideoLogic", "doRemuxingSendVideoMsg error: %s", new Object[] { paramString.getMessage() });
        GMTrace.o(18678946988032L, 139169);
        return -1;
      }
      continue;
      label744:
      continue;
      label747:
      int m = i1;
      int j = n;
      continue;
      int k = j;
      if (j % 2 != 0) {
        k = j + 1;
      }
      j = i;
      m = k;
      if (i % 2 != 0)
      {
        j = i + 1;
        m = k;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\mmsight\model\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */