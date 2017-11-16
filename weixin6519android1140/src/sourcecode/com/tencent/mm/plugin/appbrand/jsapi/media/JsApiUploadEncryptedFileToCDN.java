package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnKeyListener;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelcdntran.g;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.network.ab;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.d.a.a;
import com.tencent.mm.plugin.appbrand.d.d.a;
import com.tencent.mm.plugin.appbrand.d.d.b;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;
import org.json.JSONObject;

public final class JsApiUploadEncryptedFileToCDN
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 194;
  public static final String NAME = "uploadEncryptedFileToCDN";
  
  public JsApiUploadEncryptedFileToCDN()
  {
    GMTrace.i(19789464469504L, 147443);
    GMTrace.o(19789464469504L, 147443);
  }
  
  public final void a(final j paramj, JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(19789598687232L, 147444);
    MMActivity localMMActivity = a(paramj);
    if (localMMActivity == null)
    {
      w.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fail,  pageContext is null");
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(19789598687232L, 147444);
      return;
    }
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fail,  data is null");
      paramj.v(paramInt, d("fail:data is null", null));
      GMTrace.o(19789598687232L, 147444);
      return;
    }
    String str1 = paramj.hyD;
    String str2 = paramJSONObject.optString("tempFilePath");
    boolean bool = paramJSONObject.optBoolean("isShowProgressTips", false);
    w.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "JsApiUploadEncryptedFileToCDN appId:%s, data:%s", new Object[] { str1, paramJSONObject.toString() });
    if (bg.nm(str2))
    {
      w.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fail,  tempFilePath is null");
      paramj.v(paramInt, d("fail:tempFilePath is null", null));
      GMTrace.o(19789598687232L, 147444);
      return;
    }
    Object localObject = com.tencent.mm.plugin.appbrand.appstorage.c.aJ(str1, str2);
    if (localObject == null)
    {
      w.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fail,  tempFilePath file is not exist");
      paramj.v(paramInt, d("fail:file doesn't exist", null));
      GMTrace.o(19789598687232L, 147444);
      return;
    }
    if (TextUtils.isEmpty(((AppBrandLocalMediaObject)localObject).gpy))
    {
      w.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fail, fileFullPath is null");
      paramj.v(paramInt, d("fail:fileFullPath is null", null));
      GMTrace.o(19789598687232L, 147444);
      return;
    }
    final JsApiUploadEncryptedMediaFileTask localJsApiUploadEncryptedMediaFileTask = new JsApiUploadEncryptedMediaFileTask();
    localJsApiUploadEncryptedMediaFileTask.appId = str1;
    localJsApiUploadEncryptedMediaFileTask.eHy = str2;
    localJsApiUploadEncryptedMediaFileTask.iif = bool;
    localJsApiUploadEncryptedMediaFileTask.iij = localMMActivity;
    localJsApiUploadEncryptedMediaFileTask.hYK = paramj;
    localJsApiUploadEncryptedMediaFileTask.mimeType = ((AppBrandLocalMediaObject)localObject).mimeType;
    localJsApiUploadEncryptedMediaFileTask.hYr = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19789061816320L, 147440);
        HashMap localHashMap = new HashMap();
        localHashMap.put("fileId", localJsApiUploadEncryptedMediaFileTask.eML);
        localHashMap.put("aesKey", localJsApiUploadEncryptedMediaFileTask.giJ);
        localHashMap.put("fileUrl", localJsApiUploadEncryptedMediaFileTask.fileUrl);
        localHashMap.put("fileLength", localJsApiUploadEncryptedMediaFileTask.hJt);
        w.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fileId:%s", new Object[] { localJsApiUploadEncryptedMediaFileTask.eML });
        if (bg.nm(localJsApiUploadEncryptedMediaFileTask.eML))
        {
          w.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN fail , return serverId is empty");
          paramj.v(paramInt, JsApiUploadEncryptedFileToCDN.this.d("fail", null));
        }
        for (;;)
        {
          localJsApiUploadEncryptedMediaFileTask.VN();
          GMTrace.o(19789061816320L, 147440);
          return;
          w.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "uploadEncryptedFileToCDN ok");
          paramj.v(paramInt, JsApiUploadEncryptedFileToCDN.this.d("ok", localHashMap));
        }
      }
    };
    if (!ab.bv(localMMActivity))
    {
      w.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "2G/3G/4G network available, do upload in mobile network and show the gprs confirm tips dialog");
      if ((!TextUtils.isEmpty(((AppBrandLocalMediaObject)localObject).mimeType)) && (((AppBrandLocalMediaObject)localObject).mimeType.contains("video"))) {}
      for (paramJSONObject = localMMActivity.getString(o.i.hGR);; paramJSONObject = localMMActivity.getString(o.i.hGL))
      {
        localObject = bg.eL(com.tencent.mm.a.e.aY(((AppBrandLocalMediaObject)localObject).gpy));
        h.a(localMMActivity, localMMActivity.getString(o.i.hGN, new Object[] { paramJSONObject, localObject }), localMMActivity.getString(o.i.cUG), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(19791880388608L, 147461);
            w.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "do confirm upload in 2G/3G/4G network");
            localJsApiUploadEncryptedMediaFileTask.VM();
            AppBrandMainProcessService.a(localJsApiUploadEncryptedMediaFileTask);
            GMTrace.o(19791880388608L, 147461);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(19789330251776L, 147442);
            w.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "do cancel upload in 2G/3G/4G network");
            paramj.v(paramInt, JsApiUploadEncryptedFileToCDN.this.d("cancel", null));
            localJsApiUploadEncryptedMediaFileTask.VN();
            GMTrace.o(19789330251776L, 147442);
          }
        });
        GMTrace.o(19789598687232L, 147444);
        return;
      }
    }
    w.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "wifi network available, do not show the gprs confirm dialog");
    localJsApiUploadEncryptedMediaFileTask.VM();
    AppBrandMainProcessService.a(localJsApiUploadEncryptedMediaFileTask);
    GMTrace.o(19789598687232L, 147444);
  }
  
  public static class JsApiUploadEncryptedMediaFileTask
    extends MainProcessTask
  {
    public static final Parcelable.Creator<JsApiUploadEncryptedMediaFileTask> CREATOR;
    public String appId;
    public String eHy;
    public String eML;
    public String fileUrl;
    public String giJ;
    public int hJt;
    j hYK;
    public Runnable hYr;
    public ProgressDialog htG;
    public boolean iif;
    public int iig;
    public int iih;
    public int iii;
    MMActivity iij;
    d.a iik;
    d.b iil;
    public String mimeType;
    
    static
    {
      GMTrace.i(19802617806848L, 147541);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19802617806848L, 147541);
    }
    
    public JsApiUploadEncryptedMediaFileTask()
    {
      GMTrace.i(19801544065024L, 147533);
      this.iig = 0;
      this.iih = 0;
      this.iii = 0;
      this.htG = null;
      GMTrace.o(19801544065024L, 147533);
    }
    
    public JsApiUploadEncryptedMediaFileTask(Parcel paramParcel)
    {
      GMTrace.i(19801678282752L, 147534);
      this.iig = 0;
      this.iih = 0;
      this.iii = 0;
      this.htG = null;
      f(paramParcel);
      GMTrace.o(19801678282752L, 147534);
    }
    
    public final void RY()
    {
      GMTrace.i(19801812500480L, 147535);
      w.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "runInMainProcess mainEvent:%d, clientEvent:%d", new Object[] { Integer.valueOf(this.iih), Integer.valueOf(this.iii) });
      if (this.iih == 1)
      {
        w.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "user cancel upload the file, remove callback");
        com.tencent.mm.plugin.appbrand.app.e.So().a(this.iik);
        com.tencent.mm.plugin.appbrand.app.e.So().a(this.iil);
        com.tencent.mm.plugin.appbrand.app.e.So();
        com.tencent.mm.plugin.appbrand.d.b.oK(this.eHy);
        this.iih = 0;
        this.iii = 1;
        VL();
        GMTrace.o(19801812500480L, 147535);
        return;
      }
      final AppBrandLocalMediaObject localAppBrandLocalMediaObject = com.tencent.mm.plugin.appbrand.appstorage.c.aJ(this.appId, this.eHy);
      if (localAppBrandLocalMediaObject == null)
      {
        w.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "getItemByLocalId return mediaObject is null, ");
        this.iii = 1;
        VL();
        GMTrace.o(19801812500480L, 147535);
        return;
      }
      Object localObject1 = new com.tencent.mm.plugin.appbrand.d.a();
      ((com.tencent.mm.plugin.appbrand.d.a)localObject1).eHy = localAppBrandLocalMediaObject.eHy;
      ((com.tencent.mm.plugin.appbrand.d.a)localObject1).hOo = localAppBrandLocalMediaObject.gpy;
      ((com.tencent.mm.plugin.appbrand.d.a)localObject1).hmS = localAppBrandLocalMediaObject.hmS;
      Object localObject2 = this.eHy;
      ((com.tencent.mm.plugin.appbrand.d.a)localObject1).mediaId = com.tencent.mm.modelcdntran.d.a("appbrandmediafile", bg.Pv(), (String)localObject2, (String)localObject2);
      com.tencent.mm.plugin.appbrand.app.e.Sn().a((com.tencent.mm.plugin.appbrand.d.a)localObject1);
      this.iik = new d.a()
      {
        public final void u(int paramAnonymousInt, String paramAnonymousString)
        {
          GMTrace.i(19799799234560L, 147520);
          w.d("MicroMsg.JsApiUploadEncryptedFileToCDN", "progress, percent:%d, localId:%s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousString });
          JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.iig = paramAnonymousInt;
          JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.iii = 3;
          JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.a(JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this);
          GMTrace.o(19799799234560L, 147520);
        }
      };
      this.iil = new d.b()
      {
        public final void b(boolean paramAnonymousBoolean, String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3)
        {
          GMTrace.i(19791611953152L, 147459);
          w.i("MicroMsg.JsApiUploadEncryptedFileToCDN", " on cdn finish,  is success : %s, mediaId : %s, localId : %s, mediaUrl : %s", new Object[] { Boolean.valueOf(paramAnonymousBoolean), paramAnonymousString2, paramAnonymousString1, paramAnonymousString3 });
          if ((!bg.nm(paramAnonymousString1)) && (paramAnonymousString1.equals(localAppBrandLocalMediaObject.eHy)))
          {
            com.tencent.mm.plugin.appbrand.app.e.So().a(JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.iik);
            com.tencent.mm.plugin.appbrand.app.e.So().a(JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.iil);
            com.tencent.mm.plugin.appbrand.app.e.So();
            com.tencent.mm.plugin.appbrand.d.b.oK(localAppBrandLocalMediaObject.eHy);
            if (paramAnonymousBoolean) {
              break label273;
            }
            w.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "upload encrypt file false");
            paramAnonymousString1 = com.tencent.mm.plugin.appbrand.app.e.Sn();
            paramAnonymousString2 = JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.eML;
            if (!bg.nm(paramAnonymousString2)) {
              break label291;
            }
            w.e("MicroMsg.AppbrandMediaCdnItemManager", "getItemByServerId error, media id is null or nil");
            label137:
            break label305;
            label138:
            paramAnonymousString1 = null;
            label140:
            if ((paramAnonymousString1 == null) || (paramAnonymousString1.hOq == null)) {
              break label343;
            }
            w.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "cdn info is valid");
            JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.giJ = paramAnonymousString1.hOq.field_aesKey;
            JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.eML = paramAnonymousString1.hOq.field_fileId;
            JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.fileUrl = paramAnonymousString1.hOq.field_fileUrl;
            JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.hJt = paramAnonymousString1.hOq.field_fileLength;
            w.d("MicroMsg.JsApiUploadEncryptedFileToCDN", "aesKey:%s, fileLength:%d", new Object[] { JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.giJ, Integer.valueOf(JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.hJt) });
          }
          for (;;)
          {
            JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.iii = 1;
            JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.b(JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this);
            GMTrace.o(19791611953152L, 147459);
            return;
            label273:
            JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.eML = paramAnonymousString2;
            w.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "upload encrypt file success");
            break;
            label291:
            paramAnonymousString3 = paramAnonymousString1.hOz.values().iterator();
            label305:
            if (!paramAnonymousString3.hasNext()) {
              break label138;
            }
            paramAnonymousString1 = (com.tencent.mm.plugin.appbrand.d.a)paramAnonymousString3.next();
            if (!bg.nl(paramAnonymousString1.hOp).equals(paramAnonymousString2)) {
              break label137;
            }
            break label140;
            label343:
            w.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "cdn info is null");
          }
        }
      };
      localObject1 = com.tencent.mm.plugin.appbrand.app.e.So();
      localObject2 = this.iik;
      if ((((com.tencent.mm.plugin.appbrand.d.b)localObject1).hOv != null) && (localObject2 != null) && (!((com.tencent.mm.plugin.appbrand.d.b)localObject1).hOv.contains(localObject2))) {
        ((com.tencent.mm.plugin.appbrand.d.b)localObject1).hOv.add(localObject2);
      }
      localObject1 = com.tencent.mm.plugin.appbrand.app.e.So();
      Object localObject3 = this.appId;
      localObject2 = localAppBrandLocalMediaObject.eHy;
      int i = com.tencent.mm.modelcdntran.b.gzg;
      d.b localb = this.iil;
      com.tencent.mm.plugin.appbrand.d.a locala = com.tencent.mm.plugin.appbrand.app.e.Sn().oM((String)localObject2);
      boolean bool;
      if (locala == null)
      {
        w.e("MicroMsg.AppbrandCdnService", "addUploadTask get webview file chooser item  by local id failed : %s", new Object[] { localObject2 });
        bool = false;
        w.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "addUploadTask: add cdn upload task result : %b", new Object[] { Boolean.valueOf(bool) });
        if (!bool)
        {
          w.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "addUploadTask fail");
          this.iii = 1;
          com.tencent.mm.plugin.appbrand.app.e.So().a(this.iik);
          com.tencent.mm.plugin.appbrand.app.e.So().a(this.iil);
          com.tencent.mm.plugin.appbrand.app.e.So();
          com.tencent.mm.plugin.appbrand.d.b.oK(localAppBrandLocalMediaObject.eHy);
          VL();
          GMTrace.o(19801812500480L, 147535);
        }
      }
      else
      {
        locala.appId = ((String)localObject3);
        if ((localb != null) && (((com.tencent.mm.plugin.appbrand.d.b)localObject1).hOu != null) && (localb != null) && (!((com.tencent.mm.plugin.appbrand.d.b)localObject1).hOu.contains(localb))) {
          ((com.tencent.mm.plugin.appbrand.d.b)localObject1).hOu.add(localb);
        }
        locala.hOr = true;
        localObject3 = new i();
        ((i)localObject3).gAB = ((com.tencent.mm.plugin.appbrand.d.b)localObject1).gIz;
        ((i)localObject3).eYr = true;
        ((i)localObject3).field_mediaId = locala.mediaId;
        ((i)localObject3).field_fullpath = locala.hOo;
        ((i)localObject3).field_fileType = i;
        ((i)localObject3).field_talker = "weixin";
        ((i)localObject3).field_priority = com.tencent.mm.modelcdntran.b.gzd;
        if (i == com.tencent.mm.modelcdntran.b.gzg) {}
        for (((i)localObject3).field_needStorage = true;; ((i)localObject3).field_needStorage = false)
        {
          ((i)localObject3).field_isStreamMedia = false;
          ((i)localObject3).field_appType = 0;
          ((i)localObject3).field_bzScene = 0;
          ((i)localObject3).field_force_aeskeycdn = true;
          ((i)localObject3).field_trysafecdn = false;
          bool = g.Gk().c((i)localObject3);
          w.i("MicroMsg.AppbrandCdnService", "summersafecdn add upload cdn task : %b, force_aeskeycdn: %b, trysafecdn: %b, localid : %s ", new Object[] { Boolean.valueOf(bool), Boolean.valueOf(((i)localObject3).field_force_aeskeycdn), Boolean.valueOf(((i)localObject3).field_trysafecdn), localObject2 });
          break;
        }
      }
      if (this.iif)
      {
        w.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "show the process dialog");
        this.iii = 2;
        VL();
      }
      GMTrace.o(19801812500480L, 147535);
    }
    
    public final void VK()
    {
      GMTrace.i(19801946718208L, 147536);
      if (this.iii == 0)
      {
        w.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "CLIENT_EVENT_INIT");
        GMTrace.o(19801946718208L, 147536);
        return;
      }
      if (this.iii == 1)
      {
        w.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "CLIENT_EVENT_FINISH");
        if (this.htG != null)
        {
          this.htG.dismiss();
          this.htG = null;
        }
        if (this.hYr != null)
        {
          this.hYr.run();
          GMTrace.o(19801946718208L, 147536);
        }
      }
      else
      {
        Object localObject;
        if (this.iii == 2)
        {
          w.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "CLIENT_EVENT_SHOW_DIALOG");
          localObject = this.iij;
          this.iij.getString(o.i.cUG);
          this.htG = h.a((Context)localObject, this.iij.getString(o.i.hGQ), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymousDialogInterface)
            {
              GMTrace.i(19786377461760L, 147420);
              w.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "user cancel uploading the media file");
              paramAnonymousDialogInterface.dismiss();
              JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.iih = 1;
              JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.iii = 1;
              AppBrandMainProcessService.a(JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this);
              GMTrace.o(19786377461760L, 147420);
            }
          });
          this.htG.setOnKeyListener(new DialogInterface.OnKeyListener()
          {
            public final boolean onKey(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
            {
              GMTrace.i(19792148824064L, 147463);
              if ((paramAnonymousInt == 4) && (paramAnonymousKeyEvent.getAction() == 1))
              {
                if ((!TextUtils.isEmpty(JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.mimeType)) && (JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.mimeType.contains("video"))) {}
                for (paramAnonymousDialogInterface = JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.iij.getString(o.i.hGR);; paramAnonymousDialogInterface = JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.iij.getString(o.i.hGL))
                {
                  h.a(JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.iij, true, JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.iij.getString(o.i.hGM, new Object[] { paramAnonymousDialogInterface }), "", JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.iij.getString(o.i.hGO), JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.iij.getString(o.i.hGP), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
                  {
                    public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                    {
                      GMTrace.i(19795101614080L, 147485);
                      w.e("MicroMsg.JsApiUploadEncryptedFileToCDN", "user cancel upload the media file");
                      JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.htG.cancel();
                      JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.iih = 1;
                      JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this.iii = 1;
                      AppBrandMainProcessService.a(JsApiUploadEncryptedFileToCDN.JsApiUploadEncryptedMediaFileTask.this);
                      GMTrace.o(19795101614080L, 147485);
                    }
                  }, new DialogInterface.OnClickListener()
                  {
                    public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                    {
                      GMTrace.i(19791343517696L, 147457);
                      w.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "user continue upload media file");
                      GMTrace.o(19791343517696L, 147457);
                    }
                  });
                  GMTrace.o(19792148824064L, 147463);
                  return true;
                }
              }
              GMTrace.o(19792148824064L, 147463);
              return false;
            }
          });
          GMTrace.o(19801946718208L, 147536);
          return;
        }
        if (this.iii == 3)
        {
          w.i("MicroMsg.JsApiUploadEncryptedFileToCDN", "CLIENT_EVENT_PROGRESS");
          localObject = new HashMap();
          ((Map)localObject).put("tempFilePath", this.eHy);
          ((Map)localObject).put("percent", Integer.valueOf(this.iig));
          localObject = new JSONObject((Map)localObject).toString();
          com.tencent.mm.plugin.appbrand.jsapi.e locale = new JsApiUploadEncryptedFileToCDN.a().a(this.hYK);
          locale.mData = ((String)localObject);
          locale.VR();
        }
      }
      GMTrace.o(19801946718208L, 147536);
    }
    
    public final void f(Parcel paramParcel)
    {
      boolean bool = true;
      GMTrace.i(19802080935936L, 147537);
      this.appId = paramParcel.readString();
      this.eHy = paramParcel.readString();
      this.eML = paramParcel.readString();
      this.giJ = paramParcel.readString();
      this.fileUrl = paramParcel.readString();
      this.hJt = paramParcel.readInt();
      if (paramParcel.readInt() == 1) {}
      for (;;)
      {
        this.iif = bool;
        this.iig = paramParcel.readInt();
        this.iii = paramParcel.readInt();
        this.iih = paramParcel.readInt();
        this.mimeType = paramParcel.readString();
        GMTrace.o(19802080935936L, 147537);
        return;
        bool = false;
      }
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(19802215153664L, 147538);
      paramParcel.writeString(this.appId);
      paramParcel.writeString(this.eHy);
      paramParcel.writeString(this.eML);
      paramParcel.writeString(this.giJ);
      paramParcel.writeString(this.fileUrl);
      paramParcel.writeInt(this.hJt);
      if (this.iif) {}
      for (paramInt = 1;; paramInt = 0)
      {
        paramParcel.writeInt(paramInt);
        paramParcel.writeInt(this.iig);
        paramParcel.writeInt(this.iii);
        paramParcel.writeInt(this.iih);
        paramParcel.writeString(this.mimeType);
        GMTrace.o(19802215153664L, 147538);
        return;
      }
    }
  }
  
  private static final class a
    extends com.tencent.mm.plugin.appbrand.jsapi.e
  {
    private static final int CTRL_INDEX = 196;
    private static final String NAME = "onUploadEncryptedFileToCDNProgress";
    
    public a()
    {
      GMTrace.i(19785840590848L, 147416);
      GMTrace.o(19785840590848L, 147416);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\media\JsApiUploadEncryptedFileToCDN.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */