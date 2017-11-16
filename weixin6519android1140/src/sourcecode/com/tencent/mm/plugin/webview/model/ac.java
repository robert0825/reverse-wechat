package com.tencent.mm.plugin.webview.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.modelcdntran.c;
import com.tencent.mm.modelcdntran.g;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.i.a;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.protocal.c.amn;
import com.tencent.mm.protocal.c.amp;
import com.tencent.mm.protocal.c.amt;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.y.at;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

public final class ac
  implements e
{
  private i.a gIz;
  private Vector<c.b> hOu;
  private Vector<c.a> hOv;
  
  public ac()
  {
    GMTrace.i(12016781623296L, 89532);
    this.hOv = new Vector();
    this.hOu = new Vector();
    this.gIz = new i.a()
    {
      public final int a(String paramAnonymousString, int paramAnonymousInt, keep_ProgressInfo paramAnonymouskeep_ProgressInfo, keep_SceneResult paramAnonymouskeep_SceneResult, boolean paramAnonymousBoolean)
      {
        GMTrace.i(12019868631040L, 89555);
        Object localObject1;
        Object localObject2;
        if (paramAnonymouskeep_ProgressInfo == null)
        {
          localObject1 = "null";
          if (paramAnonymouskeep_SceneResult != null) {
            break label118;
          }
          localObject2 = "null";
          label25:
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.WebviewFileChooserCdnService", "on cdn callback mediaId = %s, startRet = %d, keep_ProgressInfo = %s, keep_SceneResult = %s", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymousInt), localObject1, localObject2 });
          localObject1 = com.tencent.mm.plugin.webview.modeltools.f.bCW();
          if (!bg.nm(paramAnonymousString)) {
            break label128;
          }
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.WebViewJSSDKFileItemManager", "getItemByMediaID error, media id is null or nil");
          label75:
          break label143;
          label76:
          localObject1 = null;
        }
        for (;;)
        {
          if (localObject1 != null) {
            break label183;
          }
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.WebviewFileChooserCdnService", "get item by media id failed, media is : %s", new Object[] { paramAnonymousString });
          GMTrace.o(12019868631040L, 89555);
          return 0;
          localObject1 = paramAnonymouskeep_ProgressInfo.toString();
          break;
          label118:
          localObject2 = paramAnonymouskeep_SceneResult.toString();
          break label25;
          label128:
          localObject2 = ((ad)localObject1).rEE.values().iterator();
          label143:
          if (!((Iterator)localObject2).hasNext()) {
            break label76;
          }
          localObject1 = (WebViewJSSDKFileItem)((Iterator)localObject2).next();
          if (!bg.nl(((WebViewJSSDKFileItem)localObject1).mediaId).equals(paramAnonymousString)) {
            break label75;
          }
        }
        label183:
        if (paramAnonymousInt == 44531)
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.WebviewFileChooserCdnService", "duplicate request, ignore this request, media id is %s", new Object[] { paramAnonymousString });
          GMTrace.o(12019868631040L, 89555);
          return 0;
        }
        if (paramAnonymousInt != 0)
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.WebviewFileChooserCdnService", "start failed : %d, media id is :%s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousString });
          ac.this.a(false, ((WebViewJSSDKFileItem)localObject1).eHy, ((WebViewJSSDKFileItem)localObject1).mediaId, null);
          GMTrace.o(12019868631040L, 89555);
          return 0;
        }
        if (paramAnonymouskeep_ProgressInfo != null)
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.WebviewFileChooserCdnService", "progressInfo : %s", new Object[] { paramAnonymouskeep_ProgressInfo.toString() });
          paramAnonymousInt = 0;
          if (paramAnonymouskeep_ProgressInfo.field_toltalLength > 0) {
            paramAnonymousInt = paramAnonymouskeep_ProgressInfo.field_finishedLength * 100 / paramAnonymouskeep_ProgressInfo.field_toltalLength;
          }
          int i;
          if (paramAnonymousInt < 0) {
            i = 0;
          }
          for (;;)
          {
            ac.this.b(((WebViewJSSDKFileItem)localObject1).hOr, ((WebViewJSSDKFileItem)localObject1).eGK, i, ((WebViewJSSDKFileItem)localObject1).eHy, ((WebViewJSSDKFileItem)localObject1).mediaId);
            GMTrace.o(12019868631040L, 89555);
            return 0;
            i = paramAnonymousInt;
            if (paramAnonymousInt > 100) {
              i = 100;
            }
          }
        }
        if (paramAnonymouskeep_SceneResult != null)
        {
          if (paramAnonymouskeep_SceneResult.field_retCode == 0) {
            break label449;
          }
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.WebviewFileChooserCdnService", "cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]", new Object[] { paramAnonymousString, Integer.valueOf(paramAnonymouskeep_SceneResult.field_retCode), paramAnonymouskeep_SceneResult });
          ac.this.a(false, ((WebViewJSSDKFileItem)localObject1).eHy, ((WebViewJSSDKFileItem)localObject1).mediaId, null);
        }
        for (;;)
        {
          GMTrace.o(12019868631040L, 89555);
          return 0;
          label449:
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.WebviewFileChooserCdnService", "cdn trans suceess, media id : %s", new Object[] { paramAnonymousString });
          if (localObject1 != null)
          {
            ((WebViewJSSDKFileItem)localObject1).b(paramAnonymouskeep_SceneResult);
            if ((((WebViewJSSDKFileItem)localObject1).hOr) && (((WebViewJSSDKFileItem)localObject1).hOt))
            {
              paramAnonymousString = ac.this;
              if (localObject1 == null)
              {
                com.tencent.mm.sdk.platformtools.w.e("MicroMsg.WebviewFileChooserCdnService", "uploadCdnInfo failed, item is null");
              }
              else
              {
                paramAnonymouskeep_ProgressInfo = new amn();
                paramAnonymouskeep_ProgressInfo.uBC = ((WebViewJSSDKFileItem)localObject1).rEC.field_aesKey;
                paramAnonymouskeep_ProgressInfo.ubJ = ((WebViewJSSDKFileItem)localObject1).rEC.field_fileLength;
                paramAnonymouskeep_ProgressInfo.uBB = ((WebViewJSSDKFileItem)localObject1).rEC.field_fileId;
                paramAnonymouskeep_ProgressInfo.type = ((WebViewJSSDKFileItem)localObject1).bCm();
                com.tencent.mm.sdk.platformtools.w.d("MicroMsg.WebviewFileChooserCdnService", "appId:%s, localId:%s, aes_key:%s， file_size:%d, fileId:%s", new Object[] { ((WebViewJSSDKFileItem)localObject1).appId, ((WebViewJSSDKFileItem)localObject1).eHy, paramAnonymouskeep_ProgressInfo.uBC, Integer.valueOf(paramAnonymouskeep_ProgressInfo.ubJ), paramAnonymouskeep_ProgressInfo.uBB });
                paramAnonymouskeep_ProgressInfo.uBD = ((WebViewJSSDKFileItem)localObject1).bCl();
                at.wS().a(1034, paramAnonymousString);
                paramAnonymousString = new w(((WebViewJSSDKFileItem)localObject1).appId, ((WebViewJSSDKFileItem)localObject1).eHy, paramAnonymouskeep_ProgressInfo);
                at.wS().a(paramAnonymousString, 0);
              }
            }
            else
            {
              ac.this.a(true, ((WebViewJSSDKFileItem)localObject1).eHy, ((WebViewJSSDKFileItem)localObject1).hOp, ((WebViewJSSDKFileItem)localObject1).rEC.field_fileUrl);
            }
          }
        }
      }
      
      public final void a(String paramAnonymousString, ByteArrayOutputStream paramAnonymousByteArrayOutputStream)
      {
        GMTrace.i(12019600195584L, 89553);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.WebviewFileChooserCdnService", "getCdnAuthInfo, mediaId = %s", new Object[] { paramAnonymousString });
        GMTrace.o(12019600195584L, 89553);
      }
      
      public final byte[] h(String paramAnonymousString, byte[] paramAnonymousArrayOfByte)
      {
        GMTrace.i(12019734413312L, 89554);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.WebviewFileChooserCdnService", "decodePrepareResponse, mediaId = %s", new Object[] { paramAnonymousString });
        GMTrace.o(12019734413312L, 89554);
        return null;
      }
    };
    GMTrace.o(12016781623296L, 89532);
  }
  
  public static boolean Lg(String paramString)
  {
    GMTrace.i(12017989582848L, 89541);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.WebviewFileChooserCdnService", "cancelDownloadTask get webview file chooser item  by local id : %s", new Object[] { paramString });
    boolean bool = g.Gk().jz(paramString);
    GMTrace.o(12017989582848L, 89541);
    return bool;
  }
  
  private void a(WebViewJSSDKFileItem paramWebViewJSSDKFileItem)
  {
    GMTrace.i(12017452711936L, 89537);
    i locali = new i();
    locali.gAB = this.gIz;
    locali.eYr = false;
    locali.field_mediaId = paramWebViewJSSDKFileItem.mediaId;
    locali.field_fullpath = paramWebViewJSSDKFileItem.hOo;
    locali.field_totalLen = paramWebViewJSSDKFileItem.rEC.field_fileLength;
    locali.field_fileType = com.tencent.mm.modelcdntran.b.MediaType_FILE;
    locali.field_fileId = paramWebViewJSSDKFileItem.rEC.field_fileId;
    locali.field_aesKey = paramWebViewJSSDKFileItem.rEC.field_aesKey;
    locali.field_priority = com.tencent.mm.modelcdntran.b.gzd;
    locali.field_needStorage = false;
    locali.field_isStreamMedia = false;
    boolean bool = g.Gk().b(locali, -1);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.WebviewFileChooserCdnService", "add download cdn task : %b, localid : %s", new Object[] { Boolean.valueOf(bool), paramWebViewJSSDKFileItem.hOp });
    if (!bool) {
      a(false, null, null, null);
    }
    GMTrace.o(12017452711936L, 89537);
  }
  
  public static boolean oK(String paramString)
  {
    GMTrace.i(12017855365120L, 89540);
    WebViewJSSDKFileItem localWebViewJSSDKFileItem = com.tencent.mm.plugin.webview.modeltools.f.bCW().Lk(paramString);
    if (localWebViewJSSDKFileItem == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.WebviewFileChooserCdnService", "cancelUploadTask get webview file chooser item  by local id failed : %s", new Object[] { paramString });
      GMTrace.o(12017855365120L, 89540);
      return false;
    }
    boolean bool = g.Gk().jy(localWebViewJSSDKFileItem.mediaId);
    GMTrace.o(12017855365120L, 89540);
    return bool;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(12018123800576L, 89542);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.WebviewFileChooserCdnService", "onSceneEnd, errType = %d, errCode = %d, funcType = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramk.getType()) });
    switch (paramk.getType())
    {
    }
    for (;;)
    {
      GMTrace.o(12018123800576L, 89542);
      return;
      at.wS().b(1034, this);
      Object localObject1 = (w)paramk;
      paramString = ((amt)((w)localObject1).fUa.gtD.gtK).uBE;
      paramk = ((w)localObject1).appId;
      localObject1 = ((w)localObject1).eHy;
      Object localObject2 = com.tencent.mm.plugin.webview.modeltools.f.bCW().Lk((String)localObject1);
      if (localObject2 == null) {}
      for (boolean bool = true;; bool = false)
      {
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.WebviewFileChooserCdnService", "get server server id : %s from server for appid : %s, localId = %s, item == null ? %b", new Object[] { paramString, paramk, localObject1, Boolean.valueOf(bool) });
        if ((paramInt1 != 0) || (paramInt2 != 0)) {
          break label275;
        }
        if ((bg.nm(paramk)) || (bg.nm(paramString)) || (localObject2 == null)) {
          break;
        }
        ((WebViewJSSDKFileItem)localObject2).hOp = paramString;
        b(true, ((WebViewJSSDKFileItem)localObject2).eGK, 100, ((WebViewJSSDKFileItem)localObject2).eHy, ((WebViewJSSDKFileItem)localObject2).hOp);
        a(true, ((WebViewJSSDKFileItem)localObject2).eHy, ((WebViewJSSDKFileItem)localObject2).hOp, ((WebViewJSSDKFileItem)localObject2).rEC.field_fileUrl);
        GMTrace.o(12018123800576L, 89542);
        return;
      }
      label275:
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.WebviewFileChooserCdnService", "upload cdn info failed");
      if (localObject2 != null)
      {
        a(false, ((WebViewJSSDKFileItem)localObject2).eHy, ((WebViewJSSDKFileItem)localObject2).mediaId, null);
        GMTrace.o(12018123800576L, 89542);
        return;
        at.wS().b(1035, this);
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          paramString = (f)paramk;
          paramk = paramString.appId;
          localObject1 = paramString.hOp;
          localObject2 = ((amp)paramString.fUa.gtD.gtK).uBF;
          if (localObject2 == null)
          {
            bool = true;
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.WebviewFileChooserCdnService", "appid = %s, serverId = %s, cdninfo == null ? %b", new Object[] { paramk, localObject1, Boolean.valueOf(bool) });
            if ((!bg.nm(paramk)) && (!bg.nm((String)localObject1)) && (localObject2 != null))
            {
              paramString = ((amn)localObject2).type;
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.WebviewFileChooserCdnService", "cdn info type = %s", new Object[] { paramString });
              if (!bg.nm(paramString))
              {
                if (!paramString.toLowerCase().equals("voice")) {
                  break label553;
                }
                paramString = WebViewJSSDKFileItem.Li(ai.Lr(paramk));
                label477:
                paramString.hOr = false;
                paramString.appId = paramk;
                paramString.hOp = ((String)localObject1);
                if (paramString.rEC == null) {
                  paramString.rEC = new WebViewJSSDKFileItem.a();
                }
                if (localObject2 != null) {
                  break label618;
                }
                com.tencent.mm.sdk.platformtools.w.e("MicroMsg.WebViewJSSDKFileItem", "jsapidcdn info is null");
              }
            }
          }
          for (;;)
          {
            com.tencent.mm.plugin.webview.modeltools.f.bCW().b(paramString);
            a(paramString);
            GMTrace.o(12018123800576L, 89542);
            return;
            bool = false;
            break;
            label553:
            if (paramString.toLowerCase().equals("video"))
            {
              paramString = WebViewJSSDKFileItem.Lj(ai.Ll(bg.Pv()));
              break label477;
            }
            paramString = WebViewJSSDKFileItem.Lh(ai.Ll(bg.Pv()));
            break label477;
            label618:
            paramString.rEC.field_aesKey = ((amn)localObject2).uBC;
            paramString.rEC.field_fileId = ((amn)localObject2).uBB;
            paramString.rEC.field_fileLength = ((amn)localObject2).ubJ;
          }
        }
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.WebviewFileChooserCdnService", "download cdn info failed");
        a(false, null, null, null);
      }
    }
  }
  
  public final void a(c.a parama)
  {
    GMTrace.i(16932774346752L, 126159);
    if ((this.hOv != null) && (parama != null) && (!this.hOv.contains(parama))) {
      this.hOv.add(parama);
    }
    GMTrace.o(16932774346752L, 126159);
  }
  
  public final void a(c.b paramb)
  {
    GMTrace.i(12016915841024L, 89533);
    if ((this.hOu != null) && (paramb != null)) {
      this.hOu.remove(paramb);
    }
    GMTrace.o(12016915841024L, 89533);
  }
  
  public final void a(boolean paramBoolean, String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(12017050058752L, 89534);
    if ((this.hOu != null) && (this.hOu.size() > 0))
    {
      Iterator localIterator = this.hOu.iterator();
      while (localIterator.hasNext()) {
        ((c.b)localIterator.next()).b(paramBoolean, paramString1, paramString2, paramString3);
      }
    }
    GMTrace.o(12017050058752L, 89534);
  }
  
  public final boolean a(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, c.b paramb)
  {
    GMTrace.i(12017586929664L, 89538);
    WebViewJSSDKFileItem localWebViewJSSDKFileItem = com.tencent.mm.plugin.webview.modeltools.f.bCW().Lk(paramString2);
    if (localWebViewJSSDKFileItem == null)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.WebviewFileChooserCdnService", "addUploadTask get webview file chooser item  by local id failed : %s", new Object[] { paramString2 });
      GMTrace.o(12017586929664L, 89538);
      return false;
    }
    localWebViewJSSDKFileItem.appId = paramString1;
    if (paramb != null) {
      this.hOu.add(paramb);
    }
    if (paramInt2 == 202) {
      localWebViewJSSDKFileItem.hOt = false;
    }
    localWebViewJSSDKFileItem.hOr = true;
    paramString1 = new i();
    paramString1.gAB = this.gIz;
    paramString1.eYr = true;
    paramString1.field_mediaId = localWebViewJSSDKFileItem.mediaId;
    paramString1.field_fullpath = localWebViewJSSDKFileItem.hOo;
    paramString1.field_fileType = paramInt1;
    paramString1.field_talker = "weixin";
    paramString1.field_priority = com.tencent.mm.modelcdntran.b.gzd;
    if (paramInt1 == com.tencent.mm.modelcdntran.b.gzg) {}
    for (paramString1.field_needStorage = true;; paramString1.field_needStorage = false)
    {
      paramString1.field_isStreamMedia = false;
      paramString1.field_appType = paramInt2;
      paramString1.field_bzScene = paramInt3;
      paramString1.field_force_aeskeycdn = true;
      paramString1.field_trysafecdn = false;
      boolean bool = g.Gk().c(paramString1);
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.WebviewFileChooserCdnService", "summersafecdn add upload cdn task : %b, force_aeskeycdn: %b, trysafecdn: %b, localid : %s ", new Object[] { Boolean.valueOf(bool), Boolean.valueOf(paramString1.field_force_aeskeycdn), Boolean.valueOf(paramString1.field_trysafecdn), paramString2 });
      GMTrace.o(12017586929664L, 89538);
      return bool;
    }
  }
  
  public final boolean a(String paramString1, String paramString2, c.b paramb)
  {
    GMTrace.i(12017318494208L, 89536);
    Object localObject = com.tencent.mm.plugin.webview.modeltools.f.bCW();
    if (bg.nm(paramString2))
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.WebViewJSSDKFileItemManager", "getItemByServerId error, media id is null or nil");
      break label116;
      label30:
      localObject = null;
    }
    for (;;)
    {
      if (localObject == null) {
        break label156;
      }
      ((WebViewJSSDKFileItem)localObject).appId = paramString1;
      com.tencent.mm.sdk.platformtools.w.i("MicroMsg.WebviewFileChooserCdnService", "the file item has alreay in local : appid : %s, serverId : %s, localId : %s", new Object[] { paramString1, paramString2, ((WebViewJSSDKFileItem)localObject).eHy });
      paramb.b(true, ((WebViewJSSDKFileItem)localObject).eHy, ((WebViewJSSDKFileItem)localObject).hOp, null);
      GMTrace.o(12017318494208L, 89536);
      return true;
      Iterator localIterator = ((ad)localObject).rEE.values().iterator();
      label116:
      if (!localIterator.hasNext()) {
        break label30;
      }
      localObject = (WebViewJSSDKFileItem)localIterator.next();
      if (!bg.nl(((WebViewJSSDKFileItem)localObject).hOp).equals(paramString2)) {
        break;
      }
    }
    label156:
    at.wS().a(1035, this);
    paramString1 = new f(paramString1, paramString2);
    at.wS().a(paramString1, 0);
    this.hOu.add(paramb);
    GMTrace.o(12017318494208L, 89536);
    return true;
  }
  
  public final void b(c.a parama)
  {
    GMTrace.i(16932908564480L, 126160);
    if ((this.hOv != null) && (parama != null)) {
      this.hOv.remove(parama);
    }
    GMTrace.o(16932908564480L, 126160);
  }
  
  public final void b(boolean paramBoolean, int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    GMTrace.i(12017184276480L, 89535);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.WebviewFileChooserCdnService", "notifyProgressCallback, upload : %b, mediaType : %d, percent : %d, localId : %s, mediaId : %s", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString1, paramString2 });
    if ((this.hOv != null) && (this.hOv.size() > 0))
    {
      Iterator localIterator = this.hOv.iterator();
      while (localIterator.hasNext()) {
        ((c.a)localIterator.next()).a(paramBoolean, paramInt1, paramInt2, paramString1, paramString2);
      }
    }
    GMTrace.o(12017184276480L, 89535);
  }
  
  public final boolean b(String paramString1, String paramString2, c.b paramb)
  {
    GMTrace.i(12017721147392L, 89539);
    boolean bool = a(paramString1, paramString2, com.tencent.mm.modelcdntran.b.MediaType_FILE, 0, 0, paramb);
    GMTrace.o(12017721147392L, 89539);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\model\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */