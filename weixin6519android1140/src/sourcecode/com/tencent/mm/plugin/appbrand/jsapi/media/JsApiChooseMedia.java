package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.v4.app.a.a;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalVideoObject;
import com.tencent.mm.plugin.appbrand.c.b;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessRequest;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.ProcessResult;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask.b;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.plugin.mmsight.SightCaptureResult;
import com.tencent.mm.plugin.mmsight.SightParams;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.plugin.sight.base.b;
import com.tencent.mm.pluginsdk.ui.tools.k;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.n;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.tools.l;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONStringer;

public final class JsApiChooseMedia
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 193;
  public static final String NAME = "chooseMedia";
  public static volatile boolean ihu;
  
  static
  {
    GMTrace.i(19773358342144L, 147323);
    ihu = false;
    GMTrace.o(19773358342144L, 147323);
  }
  
  public JsApiChooseMedia()
  {
    GMTrace.i(19773089906688L, 147321);
    GMTrace.o(19773089906688L, 147321);
  }
  
  public final void a(final com.tencent.mm.plugin.appbrand.j paramj, final JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(19773224124416L, 147322);
    if (ihu)
    {
      w.e("MicroMsg.JsApiChooseMedia", "chooseMedia sChoosingMedia is true, do not again");
      paramj.v(paramInt, d("cancel", null));
      GMTrace.o(19773224124416L, 147322);
      return;
    }
    MMActivity localMMActivity = a(paramj);
    if (localMMActivity == null)
    {
      w.e("MicroMsg.JsApiChooseMedia", "chooseMedia fail,  pageContext is null");
      paramj.v(paramInt, d("fail:page context is null", null));
      GMTrace.o(19773224124416L, 147322);
      return;
    }
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiChooseMedia", "chooseMedia fail,  data is null");
      paramj.v(paramInt, d("fail:data is null", null));
      GMTrace.o(19773224124416L, 147322);
      return;
    }
    w.i("MicroMsg.JsApiChooseMedia", "chooseMedia data:" + paramJSONObject.toString());
    Object localObject1 = "";
    Object localObject2;
    label226:
    Object localObject3;
    int j;
    int i;
    Object localObject4;
    label360:
    Object localObject5;
    int k;
    if ((paramJSONObject.optJSONArray("sourceType") != null) && (paramJSONObject.optJSONArray("sourceType").length() > 0))
    {
      localObject1 = paramJSONObject.optJSONArray("sourceType").toString();
      localObject2 = localObject1;
      if (bg.nm((String)localObject1)) {
        localObject2 = "camera|album";
      }
      localObject1 = "";
      if ((paramJSONObject.optJSONArray("mediaType") == null) || (paramJSONObject.optJSONArray("mediaType").length() <= 0)) {
        break label507;
      }
      localObject1 = paramJSONObject.optJSONArray("mediaType").toString();
      localObject3 = localObject1;
      if (bg.nm((String)localObject1)) {
        localObject3 = "video|image";
      }
      j = Math.min(paramJSONObject.optInt("maxDuration", 10), 10);
      if (j >= 3)
      {
        i = j;
        if (j <= 10) {}
      }
      else
      {
        w.e("MicroMsg.JsApiChooseMedia", "maxDuration is invalid");
        i = 10;
      }
      localObject1 = paramJSONObject.optString("camera");
      localObject4 = localObject1;
      if (bg.nm((String)localObject1)) {
        localObject4 = "back";
      }
      j = Math.min(paramJSONObject.optInt("count", 9), 9);
      localObject1 = "";
      if ((paramJSONObject.optJSONArray("sizeType") == null) || (paramJSONObject.optJSONArray("sizeType").length() <= 0)) {
        break label517;
      }
      localObject1 = paramJSONObject.optJSONArray("sizeType").toString();
      localObject5 = localObject1;
      if (bg.nm((String)localObject1)) {
        localObject5 = "original|compressed";
      }
      w.i("MicroMsg.JsApiChooseMedia", "chooseMedia sourceType:%s, mediaType:%s, maxDuration:%d, camera:%s, count:%d, sizeType:%s", new Object[] { localObject2, localObject3, Integer.valueOf(i), localObject4, Integer.valueOf(j), localObject5 });
      com.tencent.mm.plugin.appbrand.a.a(paramj.hyD, new a.a()
      {
        public final void onRequestPermissionsResult(int paramAnonymousInt, String[] paramAnonymousArrayOfString, int[] paramAnonymousArrayOfInt)
        {
          GMTrace.i(19786109026304L, 147418);
          if (paramAnonymousInt != 120)
          {
            w.e("MicroMsg.JsApiChooseMedia", "requestAudioPermission requestCode is not for choose media");
            GMTrace.o(19786109026304L, 147418);
            return;
          }
          if (paramAnonymousArrayOfInt[0] == 0)
          {
            w.i("MicroMsg.JsApiChooseMedia", "requestAudioPermission permission is grant for choose media");
            JsApiChooseMedia.this.a(paramj, paramJSONObject, paramInt);
            GMTrace.o(19786109026304L, 147418);
            return;
          }
          w.e("MicroMsg.JsApiChooseMedia", "requestAudioPermission sys perm denied for choose media");
          paramj.v(paramInt, JsApiChooseMedia.this.d("fail:system permission denied", null));
          GMTrace.o(19786109026304L, 147418);
        }
      });
      localObject1 = a(paramj);
      if (localObject1 != null) {
        break label527;
      }
      w.e("MicroMsg.JsApiChooseMedia", "chooseMedia fail, requestAudioPermission pageContext is null");
      paramj.v(paramInt, d("fail", null));
      k = 0;
    }
    label507:
    label517:
    label527:
    boolean bool;
    for (;;)
    {
      if (k != 0) {
        break label565;
      }
      w.e("MicroMsg.JsApiChooseMedia", "chooseMedia requestAudioPermission is fail");
      GMTrace.o(19773224124416L, 147322);
      return;
      w.e("MicroMsg.JsApiChooseMedia", "sourceType is invalid param");
      break;
      w.e("MicroMsg.JsApiChooseMedia", "mediaType is invalid param");
      break label226;
      w.e("MicroMsg.JsApiChooseMedia", "sizeType is invalid param");
      break label360;
      bool = com.tencent.mm.pluginsdk.h.a.a((Activity)localObject1, "android.permission.RECORD_AUDIO", 120, "", "");
      k = bool;
      if (bool)
      {
        com.tencent.mm.plugin.appbrand.a.nJ(paramj.hyD);
        k = bool;
      }
    }
    label565:
    com.tencent.mm.plugin.appbrand.a.a(paramj.hyD, new a.a()
    {
      public final void onRequestPermissionsResult(int paramAnonymousInt, String[] paramAnonymousArrayOfString, int[] paramAnonymousArrayOfInt)
      {
        GMTrace.i(19798993928192L, 147514);
        if (paramAnonymousInt != 119)
        {
          w.e("MicroMsg.JsApiChooseMedia", "requestCameraPermission requestCode is not for choose media");
          GMTrace.o(19798993928192L, 147514);
          return;
        }
        if (paramAnonymousArrayOfInt[0] == 0)
        {
          w.i("MicroMsg.JsApiChooseMedia", "requestCameraPermission permission is grant for choose media");
          JsApiChooseMedia.this.a(paramj, paramJSONObject, paramInt);
          GMTrace.o(19798993928192L, 147514);
          return;
        }
        w.e("MicroMsg.JsApiChooseMedia", "requestCameraPermission sys perm denied for choose media");
        paramj.v(paramInt, JsApiChooseMedia.this.d("fail:system permission denied", null));
        GMTrace.o(19798993928192L, 147514);
      }
    });
    paramJSONObject = a(paramj);
    if (paramJSONObject == null)
    {
      w.e("MicroMsg.JsApiChooseMedia", "chooseMedia fail, requestCameraPermission pageContext is null");
      paramj.v(paramInt, d("fail", null));
      k = 0;
    }
    while (k == 0)
    {
      w.e("MicroMsg.JsApiChooseMedia", "chooseMedia requestCameraPermission is fail");
      GMTrace.o(19773224124416L, 147322);
      return;
      bool = com.tencent.mm.pluginsdk.h.a.a(paramJSONObject, "android.permission.CAMERA", 119, "", "");
      k = bool;
      if (bool)
      {
        com.tencent.mm.plugin.appbrand.a.nJ(paramj.hyD);
        k = bool;
      }
    }
    w.i("MicroMsg.JsApiChooseMedia", "do chooseMedia");
    ihu = true;
    com.tencent.mm.plugin.appbrand.c.a(paramj.hyD, new c.b()
    {
      public final void onResume()
      {
        GMTrace.i(19773626777600L, 147325);
        w.i("MicroMsg.JsApiChooseMedia", "chooseMedia, onResume, remove listener");
        JsApiChooseMedia.ihu = false;
        com.tencent.mm.plugin.appbrand.c.b(paramj.hyD, this);
        GMTrace.o(19773626777600L, 147325);
      }
    });
    paramJSONObject = new ChooseRequest();
    paramJSONObject.appId = paramj.hyD;
    paramJSONObject.ihw = ((String)localObject2).contains("album");
    paramJSONObject.ihx = ((String)localObject2).contains("camera");
    paramJSONObject.ihy = ((String)localObject3).contains("image");
    paramJSONObject.ihz = ((String)localObject3).contains("video");
    if ((!((String)localObject4).contains("back")) && (((String)localObject4).contains("front"))) {}
    for (paramJSONObject.isFront = true;; paramJSONObject.isFront = false)
    {
      paramJSONObject.maxDuration = i;
      paramJSONObject.count = j;
      paramJSONObject.ihf = ((String)localObject5).contains("compressed");
      paramJSONObject.ihg = ((String)localObject5).contains("original");
      com.tencent.mm.plugin.appbrand.ipc.a.a(localMMActivity, paramJSONObject, new AppBrandProxyUIProcessTask.b() {});
      GMTrace.o(19773224124416L, 147322);
      return;
    }
  }
  
  private static final class ChooseRequest
    extends AppBrandProxyUIProcessTask.ProcessRequest
  {
    public static final Parcelable.Creator<ChooseRequest> CREATOR;
    String appId;
    int count;
    boolean ihf;
    boolean ihg;
    boolean ihw;
    boolean ihx;
    boolean ihy;
    boolean ihz;
    boolean isFront;
    int maxDuration;
    
    static
    {
      GMTrace.i(19787853856768L, 147431);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19787853856768L, 147431);
    }
    
    ChooseRequest()
    {
      GMTrace.i(19787585421312L, 147429);
      GMTrace.o(19787585421312L, 147429);
    }
    
    ChooseRequest(Parcel paramParcel)
    {
      GMTrace.i(19787719639040L, 147430);
      h(paramParcel);
      GMTrace.o(19787719639040L, 147430);
    }
    
    protected final boolean VG()
    {
      GMTrace.i(19787451203584L, 147428);
      GMTrace.o(19787451203584L, 147428);
      return true;
    }
    
    protected final String VH()
    {
      GMTrace.i(19786914332672L, 147424);
      GMTrace.o(19786914332672L, 147424);
      return "GalleryChooseMedia";
    }
    
    protected final Class<? extends AppBrandProxyUIProcessTask> VI()
    {
      GMTrace.i(19786780114944L, 147423);
      GMTrace.o(19786780114944L, 147423);
      return JsApiChooseMedia.a.class;
    }
    
    public final int describeContents()
    {
      GMTrace.i(19787182768128L, 147426);
      GMTrace.o(19787182768128L, 147426);
      return 0;
    }
    
    protected final void h(Parcel paramParcel)
    {
      boolean bool2 = true;
      GMTrace.i(19787048550400L, 147425);
      this.appId = paramParcel.readString();
      if (paramParcel.readByte() != 0)
      {
        bool1 = true;
        this.ihw = bool1;
        if (paramParcel.readByte() == 0) {
          break label146;
        }
        bool1 = true;
        label41:
        this.ihx = bool1;
        if (paramParcel.readByte() == 0) {
          break label151;
        }
        bool1 = true;
        label55:
        this.ihy = bool1;
        if (paramParcel.readByte() == 0) {
          break label156;
        }
        bool1 = true;
        label69:
        this.ihz = bool1;
        if (paramParcel.readByte() == 0) {
          break label161;
        }
        bool1 = true;
        label83:
        this.isFront = bool1;
        this.maxDuration = paramParcel.readInt();
        this.count = paramParcel.readInt();
        if (paramParcel.readByte() == 0) {
          break label166;
        }
        bool1 = true;
        label113:
        this.ihf = bool1;
        if (paramParcel.readByte() == 0) {
          break label171;
        }
      }
      label146:
      label151:
      label156:
      label161:
      label166:
      label171:
      for (boolean bool1 = bool2;; bool1 = false)
      {
        this.ihg = bool1;
        GMTrace.o(19787048550400L, 147425);
        return;
        bool1 = false;
        break;
        bool1 = false;
        break label41;
        bool1 = false;
        break label55;
        bool1 = false;
        break label69;
        bool1 = false;
        break label83;
        bool1 = false;
        break label113;
      }
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      byte b2 = 1;
      GMTrace.i(19787316985856L, 147427);
      paramParcel.writeString(this.appId);
      if (this.ihw)
      {
        b1 = 1;
        paramParcel.writeByte(b1);
        if (!this.ihx) {
          break label148;
        }
        b1 = 1;
        label42:
        paramParcel.writeByte(b1);
        if (!this.ihy) {
          break label153;
        }
        b1 = 1;
        label56:
        paramParcel.writeByte(b1);
        if (!this.ihz) {
          break label158;
        }
        b1 = 1;
        label70:
        paramParcel.writeByte(b1);
        if (!this.isFront) {
          break label163;
        }
        b1 = 1;
        label84:
        paramParcel.writeByte(b1);
        paramParcel.writeInt(this.maxDuration);
        paramParcel.writeInt(this.count);
        if (!this.ihf) {
          break label168;
        }
        b1 = 1;
        label114:
        paramParcel.writeByte(b1);
        if (!this.ihg) {
          break label173;
        }
      }
      label148:
      label153:
      label158:
      label163:
      label168:
      label173:
      for (byte b1 = b2;; b1 = 0)
      {
        paramParcel.writeByte(b1);
        GMTrace.o(19787316985856L, 147427);
        return;
        b1 = 0;
        break;
        b1 = 0;
        break label42;
        b1 = 0;
        break label56;
        b1 = 0;
        break label70;
        b1 = 0;
        break label84;
        b1 = 0;
        break label114;
      }
    }
  }
  
  private static final class ChooseResult
    extends AppBrandProxyUIProcessTask.ProcessResult
  {
    public static final Parcelable.Creator<ChooseResult> CREATOR;
    int aGY;
    String ihA;
    String type;
    
    static
    {
      GMTrace.i(19781008752640L, 147380);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(19781008752640L, 147380);
    }
    
    ChooseResult()
    {
      GMTrace.i(19780740317184L, 147378);
      GMTrace.o(19780740317184L, 147378);
    }
    
    ChooseResult(Parcel paramParcel)
    {
      GMTrace.i(19780874534912L, 147379);
      h(paramParcel);
      GMTrace.o(19780874534912L, 147379);
    }
    
    public final int describeContents()
    {
      GMTrace.i(19780471881728L, 147376);
      GMTrace.o(19780471881728L, 147376);
      return 0;
    }
    
    protected final void h(Parcel paramParcel)
    {
      GMTrace.i(19780337664000L, 147375);
      this.aGY = paramParcel.readInt();
      this.type = paramParcel.readString();
      this.ihA = paramParcel.readString();
      GMTrace.o(19780337664000L, 147375);
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(19780606099456L, 147377);
      paramParcel.writeInt(this.aGY);
      paramParcel.writeString(this.type);
      paramParcel.writeString(this.ihA);
      GMTrace.o(19780606099456L, 147377);
    }
  }
  
  private static final class a
    extends AppBrandProxyUIProcessTask
  {
    public JsApiChooseMedia.ChooseResult ihB;
    public JsApiChooseMedia.ChooseRequest ihC;
    public String ihD;
    private String ihE;
    private l ihF;
    int ihk;
    private r ihl;
    private DialogInterface.OnCancelListener ihm;
    
    private a()
    {
      GMTrace.i(19781545623552L, 147384);
      this.ihB = new JsApiChooseMedia.ChooseResult();
      GMTrace.o(19781545623552L, 147384);
    }
    
    private void WZ()
    {
      GMTrace.i(19782350929920L, 147390);
      this.ihm = new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(19795772702720L, 147490);
          w.e("MicroMsg.JsApiChooseMedia", "cancel show the progress dialog and finish progress");
          JsApiChooseMedia.a.this.ihB.aGY = 0;
          JsApiChooseMedia.a.l(JsApiChooseMedia.a.this, JsApiChooseMedia.a.this.ihB);
          GMTrace.o(19795772702720L, 147490);
        }
      };
      MMActivity localMMActivity = VD();
      int i = o.i.cUG;
      ab.getResources().getString(i);
      i = o.i.hEq;
      this.ihl = h.a(localMMActivity, ab.getResources().getString(i), true, this.ihm);
      GMTrace.o(19782350929920L, 147390);
    }
    
    public static String b(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      GMTrace.i(19783290454016L, 147397);
      if (bg.nm(paramString1))
      {
        w.e("MicroMsg.JsApiChooseMedia", "parseVideoItemToJson localId is null");
        GMTrace.o(19783290454016L, 147397);
        return "";
      }
      w.i("MicroMsg.JsApiChooseMedia", "parseVideoItemToJson()");
      JSONStringer localJSONStringer = new JSONStringer();
      try
      {
        localJSONStringer.array();
        localJSONStringer.object();
        localJSONStringer.key("tempFilePath");
        localJSONStringer.value(paramString1);
        localJSONStringer.key("thumbTempFilePath");
        localJSONStringer.value(paramString2);
        localJSONStringer.key("duration");
        localJSONStringer.value(String.valueOf(paramInt1));
        localJSONStringer.key("height");
        localJSONStringer.value(String.valueOf(paramInt2));
        localJSONStringer.key("width");
        localJSONStringer.value(String.valueOf(paramInt3));
        localJSONStringer.key("size");
        localJSONStringer.value(String.valueOf(paramInt4));
        localJSONStringer.endObject();
        localJSONStringer.endArray();
        paramString1 = localJSONStringer.toString();
        GMTrace.o(19783290454016L, 147397);
        return paramString1;
      }
      catch (Exception paramString1)
      {
        w.printErrStackTrace("MicroMsg.JsApiChooseMedia", paramString1, "", new Object[0]);
        GMTrace.o(19783290454016L, 147397);
      }
      return "";
    }
    
    public static String b(ArrayList<String> paramArrayList, ArrayList<Long> paramArrayList1)
    {
      GMTrace.i(19783156236288L, 147396);
      if ((paramArrayList == null) || (paramArrayList.size() == 0))
      {
        w.e("MicroMsg.JsApiChooseMedia", "parseImageItemToJson localIds is null");
        GMTrace.o(19783156236288L, 147396);
        return "";
      }
      w.i("MicroMsg.JsApiChooseMedia", "parseImageItemToJson()");
      JSONStringer localJSONStringer = new JSONStringer();
      try
      {
        localJSONStringer.array();
        int i = 0;
        while (i < paramArrayList.size())
        {
          localJSONStringer.object();
          String str = (String)paramArrayList.get(i);
          Long localLong = (Long)paramArrayList1.get(i);
          localJSONStringer.key("tempFilePath");
          localJSONStringer.value(str);
          localJSONStringer.key("size");
          localJSONStringer.value(String.valueOf(localLong.longValue()));
          localJSONStringer.endObject();
          i += 1;
        }
        localJSONStringer.endArray();
        paramArrayList = localJSONStringer.toString();
        GMTrace.o(19783156236288L, 147396);
        return paramArrayList;
      }
      catch (Exception paramArrayList)
      {
        w.printErrStackTrace("MicroMsg.JsApiChooseMedia", paramArrayList, "", new Object[0]);
        GMTrace.o(19783156236288L, 147396);
      }
      return "";
    }
    
    private static boolean qC(String paramString)
    {
      GMTrace.i(19783022018560L, 147395);
      if (!TextUtils.isEmpty(paramString))
      {
        File localFile = new File(paramString);
        w.i("MicroMsg.JsApiChooseMedia", "thumbFilePath:%s", new Object[] { paramString });
        if (localFile.exists())
        {
          w.i("MicroMsg.JsApiChooseMedia", "video thumb file is exist");
          GMTrace.o(19783022018560L, 147395);
          return true;
        }
        w.e("MicroMsg.JsApiChooseMedia", "video thumb file is not exist");
        GMTrace.o(19783022018560L, 147395);
        return false;
      }
      w.e("MicroMsg.JsApiChooseMedia", "video thumb file path is null");
      GMTrace.o(19783022018560L, 147395);
      return false;
    }
    
    public static String qz(String paramString)
    {
      GMTrace.i(19782485147648L, 147391);
      String str = com.tencent.mm.compatible.util.e.fRZ + "microMsg." + System.currentTimeMillis() + ".jpg";
      Bitmap localBitmap;
      try
      {
        localBitmap = MMBitmapFactory.decodeFile(paramString, 0);
        if (localBitmap == null)
        {
          w.e("MicroMsg.JsApiChooseMedia", "doCompressImage, decode bmp return null");
          GMTrace.o(19782485147648L, 147391);
          return null;
        }
      }
      catch (OutOfMemoryError paramString)
      {
        w.e("MicroMsg.JsApiChooseMedia", "doCompressImage, decode bmp oom");
        GMTrace.o(19782485147648L, 147391);
        return null;
      }
      long l = bg.Pv();
      int i = n.a(localBitmap, 70, str);
      w.i("MicroMsg.JsApiChooseMedia", "doCompressImage, ret = %d, cost = %d, %s (%d) -> %s (%d)", new Object[] { Integer.valueOf(i), Long.valueOf(bg.Pv() - l), paramString, Long.valueOf(new File(paramString).length()), str, Long.valueOf(new File(str).length()) });
      if (i == 1)
      {
        GMTrace.o(19782485147648L, 147391);
        return str;
      }
      GMTrace.o(19782485147648L, 147391);
      return paramString;
    }
    
    protected final void VF()
    {
      GMTrace.i(19781814059008L, 147386);
      super.VF();
      if (this.ihl != null)
      {
        this.ihl.dismiss();
        this.ihl = null;
      }
      if (this.ihF != null)
      {
        this.ihF.dismiss();
        this.ihF = null;
      }
      GMTrace.o(19781814059008L, 147386);
    }
    
    public final void WX()
    {
      GMTrace.i(19781948276736L, 147387);
      w.i("MicroMsg.JsApiChooseMedia", "chooseMediaFromCamera");
      int i = 0;
      Intent localIntent;
      String str1;
      int k;
      SightParams localSightParams;
      if ((this.ihC.ihz) && (this.ihC.ihy))
      {
        i = 0;
        localIntent = new Intent();
        str1 = "microMsg_" + System.currentTimeMillis();
        this.ihD = (com.tencent.mm.compatible.util.e.fRZ + "microMsg." + str1 + ".mp4");
        this.ihE = (com.tencent.mm.compatible.util.e.fRZ + "microMsg." + str1 + ".jpeg");
        k = this.ihC.maxDuration;
        localSightParams = new SightParams(3, 1);
        if (!this.ihC.isFront) {
          break label352;
        }
      }
      label352:
      for (int j = 1;; j = 2)
      {
        localSightParams.mWO = j;
        localSightParams.mode = i;
        if (localSightParams.mWP == null) {
          localSightParams.mWP = new VideoTransPara();
        }
        localSightParams.mWP.duration = k;
        String str2 = com.tencent.mm.compatible.util.e.fRZ + String.format("%s%d.%s", new Object[] { "capture", Long.valueOf(System.currentTimeMillis()), "jpg" });
        localSightParams.h(str1, this.ihD, this.ihE, str2);
        localIntent.putExtra("KEY_SIGHT_PARAMS", localSightParams);
        k.a(VD(), 7, localIntent, 3, i);
        GMTrace.o(19781948276736L, 147387);
        return;
        if (this.ihC.ihz)
        {
          i = 1;
          break;
        }
        if (!this.ihC.ihy) {
          break;
        }
        i = 2;
        break;
      }
    }
    
    public final void WY()
    {
      int i = 3;
      boolean bool = true;
      GMTrace.i(19782082494464L, 147388);
      w.i("MicroMsg.JsApiChooseMedia", "chooseMediaFromAlbum");
      Intent localIntent;
      if ((this.ihC.ihy) && (this.ihC.ihz))
      {
        localIntent = new Intent();
        localIntent.putExtra("key_can_select_video_and_pic", true);
        if (this.ihC.ihf) {
          break label140;
        }
      }
      for (;;)
      {
        localIntent.putExtra("key_send_raw_image", bool);
        k.a(VD(), 8, this.ihC.count, this.ihk, i, false, localIntent);
        GMTrace.o(19782082494464L, 147388);
        return;
        if (this.ihC.ihy)
        {
          i = 1;
          break;
        }
        if (!this.ihC.ihz) {
          break;
        }
        i = 2;
        break;
        label140:
        bool = false;
      }
    }
    
    public final String Xa()
    {
      GMTrace.i(19782753583104L, 147393);
      if (!TextUtils.isEmpty(this.ihE))
      {
        Object localObject = com.tencent.mm.plugin.appbrand.appstorage.c.c(this.ihC.appId, this.ihE, true);
        if ((localObject == null) || (bg.nm(((AppBrandLocalMediaObject)localObject).eHy)))
        {
          w.e("MicroMsg.JsApiChooseMedia", "addThumbItem error, localId is null");
          GMTrace.o(19782753583104L, 147393);
          return "";
        }
        localObject = ((AppBrandLocalMediaObject)localObject).eHy;
        GMTrace.o(19782753583104L, 147393);
        return (String)localObject;
      }
      GMTrace.o(19782753583104L, 147393);
      return "";
    }
    
    public final void a(int paramInt1, int paramInt2, Intent paramIntent)
    {
      GMTrace.i(19782216712192L, 147389);
      if (paramInt2 == 0)
      {
        w.e("MicroMsg.JsApiChooseMedia", "mmOnActivityResult resultCode is canceled");
        this.ihB.aGY = 0;
        a(this.ihB);
        GMTrace.o(19782216712192L, 147389);
        return;
      }
      if (-1 != paramInt2)
      {
        w.e("MicroMsg.JsApiChooseMedia", "mmOnActivityResult resultCode is not RESULT_OK");
        this.ihB.aGY = -2;
        a(this.ihB);
        GMTrace.o(19782216712192L, 147389);
        return;
      }
      switch (paramInt1)
      {
      }
      for (;;)
      {
        this.ihB.aGY = -2;
        a(this.ihB);
        GMTrace.o(19782216712192L, 147389);
        return;
        w.i("MicroMsg.JsApiChooseMedia", "REQUEST_CODE_TAKE_MEDIA_LOCAL");
        final Object localObject = paramIntent.getStringArrayListExtra("key_select_video_list");
        if ((localObject != null) && (((ArrayList)localObject).size() > 0))
        {
          this.ihD = ((String)((ArrayList)localObject).get(0));
          if (bg.nm(this.ihD))
          {
            w.e("MicroMsg.JsApiChooseMedia", "take media local, mVideoFilePath is  null, fail");
          }
          else
          {
            WZ();
            com.tencent.mm.plugin.appbrand.o.d.xB().A(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(19791075082240L, 147455);
                if (new File(JsApiChooseMedia.a.this.ihD).exists())
                {
                  w.i("MicroMsg.JsApiChooseMedia", "take media local, the mVideoFilePath file exist, success");
                  JsApiChooseMedia.a.this.ihB.aGY = -1;
                  JsApiChooseMedia.a.this.ihB.type = "video";
                  AppBrandLocalVideoObject localAppBrandLocalVideoObject = JsApiChooseMedia.a.this.qA(JsApiChooseMedia.a.this.ihD);
                  if (localAppBrandLocalVideoObject == null)
                  {
                    w.e("MicroMsg.JsApiChooseMedia", "addVideoItem fail ,mVideoFilePath is %s", new Object[] { JsApiChooseMedia.a.this.ihD });
                    JsApiChooseMedia.a.this.ihB.aGY = -2;
                    JsApiChooseMedia.a.b(JsApiChooseMedia.a.this, JsApiChooseMedia.a.this.ihB);
                    GMTrace.o(19791075082240L, 147455);
                    return;
                  }
                  JsApiChooseMedia.a.this.qB(JsApiChooseMedia.a.this.ihD);
                  String str = JsApiChooseMedia.a.this.Xa();
                  JsApiChooseMedia.a.this.ihB.ihA = JsApiChooseMedia.a.b(localAppBrandLocalVideoObject.eHy, str, localAppBrandLocalVideoObject.duration, localAppBrandLocalVideoObject.height, localAppBrandLocalVideoObject.width, localAppBrandLocalVideoObject.size);
                  JsApiChooseMedia.a.c(JsApiChooseMedia.a.this, JsApiChooseMedia.a.this.ihB);
                  GMTrace.o(19791075082240L, 147455);
                  return;
                }
                w.e("MicroMsg.JsApiChooseMedia", "take media local, mVideoFilePath is %s, the file not exist, fail", new Object[] { JsApiChooseMedia.a.this.ihD });
                JsApiChooseMedia.a.this.ihB.aGY = -2;
                JsApiChooseMedia.a.d(JsApiChooseMedia.a.this, JsApiChooseMedia.a.this.ihB);
                GMTrace.o(19791075082240L, 147455);
              }
            });
            GMTrace.o(19782216712192L, 147389);
          }
        }
        else
        {
          localObject = paramIntent.getStringArrayListExtra("CropImage_OutputPath_List");
          if ((localObject == null) || (((List)localObject).size() == 0))
          {
            w.e("MicroMsg.JsApiChooseMedia", "chosen is null,  fail");
            this.ihB.aGY = -2;
            a(this.ihB);
            GMTrace.o(19782216712192L, 147389);
            return;
          }
          boolean bool = paramIntent.getBooleanExtra("CropImage_Compress_Img", false);
          final int i = this.ihC.ihf;
          if (!this.ihC.ihg)
          {
            paramInt1 = 1;
            if (((paramInt1 & i) == 0) && (!(this.ihC.ihf & this.ihC.ihg & bool))) {
              break label457;
            }
          }
          label457:
          for (i = 1;; i = 0)
          {
            w.i("MicroMsg.JsApiChooseMedia", "onActivityResult, fromCamera = %b, canCompress = %b, canOriginal = %b, CropImageUI.KCompressImg = %b, doCompress = %b", new Object[] { Boolean.valueOf(false), Boolean.valueOf(this.ihC.ihf), Boolean.valueOf(this.ihC.ihg), Boolean.valueOf(bool), Boolean.valueOf(i) });
            if (i != 0) {
              WZ();
            }
            com.tencent.mm.plugin.appbrand.o.d.xB().A(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(19793356783616L, 147472);
                final ArrayList localArrayList1 = new ArrayList(localObject.size());
                final ArrayList localArrayList2 = new ArrayList(localObject.size());
                Iterator localIterator = localObject.iterator();
                while (localIterator.hasNext())
                {
                  Object localObject2 = (String)localIterator.next();
                  Object localObject1 = localObject2;
                  if (i) {
                    localObject1 = JsApiChooseMedia.a.qz((String)localObject2);
                  }
                  localObject2 = com.tencent.mm.plugin.appbrand.appstorage.c.c(JsApiChooseMedia.a.this.ihC.appId, (String)localObject1, i | false);
                  if (localObject2 != null)
                  {
                    localArrayList1.add(Long.valueOf(((AppBrandLocalMediaObject)localObject2).hmS));
                    localArrayList2.add(((AppBrandLocalMediaObject)localObject2).eHy);
                  }
                  else
                  {
                    w.e("MicroMsg.JsApiChooseMedia", "handle image from album, get null obj from path: %s", new Object[] { localObject1 });
                  }
                }
                if (localArrayList2.size() == 0)
                {
                  w.e("MicroMsg.JsApiChooseMedia", "handle image from album, get null obj");
                  JsApiChooseMedia.a.this.ihB.aGY = -2;
                  JsApiChooseMedia.a.e(JsApiChooseMedia.a.this, JsApiChooseMedia.a.this.ihB);
                  GMTrace.o(19793356783616L, 147472);
                  return;
                }
                af.t(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(19797114880000L, 147500);
                    w.i("MicroMsg.JsApiChooseMedia", "handle image from album is ok");
                    JsApiChooseMedia.a.this.ihB.aGY = -1;
                    JsApiChooseMedia.a.this.ihB.type = "image";
                    JsApiChooseMedia.a.this.ihB.ihA = JsApiChooseMedia.a.b(localArrayList2, localArrayList1);
                    JsApiChooseMedia.a.f(JsApiChooseMedia.a.this, JsApiChooseMedia.a.this.ihB);
                    GMTrace.o(19797114880000L, 147500);
                  }
                });
                GMTrace.o(19793356783616L, 147472);
              }
            });
            GMTrace.o(19782216712192L, 147389);
            return;
            paramInt1 = 0;
            break;
          }
          w.i("MicroMsg.JsApiChooseMedia", "REQUEST_CODE_TAKE_MEDIA_CAMERA");
          if (paramIntent != null)
          {
            w.i("MicroMsg.JsApiChooseMedia", "data is valid!");
            localObject = (SightCaptureResult)paramIntent.getParcelableExtra("key_req_result");
            if (localObject == null)
            {
              w.e("MicroMsg.JsApiChooseMedia", "sight capture result is null!");
              this.ihB.aGY = -2;
              a(this.ihB);
              GMTrace.o(19782216712192L, 147389);
              return;
            }
            if (((SightCaptureResult)localObject).mWF)
            {
              localObject = ((SightCaptureResult)localObject).mWN;
              if (bg.nm((String)localObject))
              {
                w.e("MicroMsg.JsApiChooseMedia", "picture_picturePath file is not exist! path:%s", new Object[] { localObject });
                this.ihB.aGY = -2;
                a(this.ihB);
                GMTrace.o(19782216712192L, 147389);
                return;
              }
              bool = paramIntent.getBooleanExtra("CropImage_Compress_Img", false);
              final int j = this.ihC.ihf;
              if (!this.ihC.ihg)
              {
                paramInt1 = 1;
                if (((paramInt1 & j) == 0) && (!(this.ihC.ihf & this.ihC.ihg & bool))) {
                  break label768;
                }
              }
              label768:
              for (j = 1;; j = 0)
              {
                w.d("MicroMsg.JsApiChooseMedia", "onActivityResult, fromCamera = %b, canCompress = %b, canOriginal = %b, CropImageUI.KCompressImg = %b, doCompress = %b", new Object[] { Boolean.valueOf(true), Boolean.valueOf(this.ihC.ihf), Boolean.valueOf(this.ihC.ihg), Boolean.valueOf(bool), Boolean.valueOf(j) });
                if (j != 0) {
                  WZ();
                }
                com.tencent.mm.plugin.appbrand.o.d.xB().A(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(19800201887744L, 147523);
                    if (j) {}
                    for (Object localObject = JsApiChooseMedia.a.qz(localObject);; localObject = localObject)
                    {
                      final ArrayList localArrayList1 = new ArrayList();
                      final ArrayList localArrayList2 = new ArrayList();
                      localObject = com.tencent.mm.plugin.appbrand.appstorage.c.c(JsApiChooseMedia.a.this.ihC.appId, (String)localObject, j | true);
                      if (localObject == null) {
                        break;
                      }
                      localArrayList1.add(Long.valueOf(((AppBrandLocalMediaObject)localObject).hmS));
                      localArrayList2.add(((AppBrandLocalMediaObject)localObject).eHy);
                      af.t(new Runnable()
                      {
                        public final void run()
                        {
                          GMTrace.i(19788793380864L, 147438);
                          w.i("MicroMsg.JsApiChooseMedia", "handle image from album is ok");
                          JsApiChooseMedia.a.this.ihB.aGY = -1;
                          JsApiChooseMedia.a.this.ihB.type = "image";
                          JsApiChooseMedia.a.this.ihB.ihA = JsApiChooseMedia.a.b(localArrayList2, localArrayList1);
                          JsApiChooseMedia.a.g(JsApiChooseMedia.a.this, JsApiChooseMedia.a.this.ihB);
                          GMTrace.o(19788793380864L, 147438);
                        }
                      });
                      GMTrace.o(19800201887744L, 147523);
                      return;
                    }
                    w.e("MicroMsg.JsApiChooseMedia", "handle image from mm-sight camera, get null obj from path: %s", new Object[] { localObject });
                    JsApiChooseMedia.a.this.ihB.aGY = -2;
                    JsApiChooseMedia.a.h(JsApiChooseMedia.a.this, JsApiChooseMedia.a.this.ihB);
                    GMTrace.o(19800201887744L, 147523);
                  }
                });
                GMTrace.o(19782216712192L, 147389);
                return;
                paramInt1 = 0;
                break;
              }
            }
            this.ihD = ((SightCaptureResult)localObject).mWH;
            if (bg.nm(this.ihD))
            {
              w.e("MicroMsg.JsApiChooseMedia", "mVideoFilePath is null");
            }
            else
            {
              w.i("MicroMsg.JsApiChooseMedia", "mVideoFilePath:%s", new Object[] { this.ihD });
              if ((!qC(this.ihE)) && (qC(((SightCaptureResult)localObject).mWI))) {
                this.ihE = ((SightCaptureResult)localObject).mWI;
              }
              WZ();
              com.tencent.mm.plugin.appbrand.o.d.xB().A(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(19788524945408L, 147436);
                  if (new File(JsApiChooseMedia.a.this.ihD).exists())
                  {
                    w.i("MicroMsg.JsApiChooseMedia", "take media camera, the mVideoFilePath file exist, success");
                    JsApiChooseMedia.a.this.ihB.aGY = -1;
                    JsApiChooseMedia.a.this.ihB.type = "video";
                    AppBrandLocalVideoObject localAppBrandLocalVideoObject = JsApiChooseMedia.a.this.qA(JsApiChooseMedia.a.this.ihD);
                    if (localAppBrandLocalVideoObject == null)
                    {
                      w.e("MicroMsg.JsApiChooseMedia", "addVideoItem fail ,mVideoFilePath is %s", new Object[] { JsApiChooseMedia.a.this.ihD });
                      JsApiChooseMedia.a.this.ihB.aGY = -2;
                      JsApiChooseMedia.a.i(JsApiChooseMedia.a.this, JsApiChooseMedia.a.this.ihB);
                      GMTrace.o(19788524945408L, 147436);
                      return;
                    }
                    JsApiChooseMedia.a.this.qB(JsApiChooseMedia.a.this.ihD);
                    String str = JsApiChooseMedia.a.this.Xa();
                    JsApiChooseMedia.a.this.ihB.ihA = JsApiChooseMedia.a.b(localAppBrandLocalVideoObject.eHy, str, localAppBrandLocalVideoObject.duration, localAppBrandLocalVideoObject.height, localAppBrandLocalVideoObject.width, localAppBrandLocalVideoObject.size);
                    JsApiChooseMedia.a.j(JsApiChooseMedia.a.this, JsApiChooseMedia.a.this.ihB);
                    GMTrace.o(19788524945408L, 147436);
                    return;
                  }
                  w.e("MicroMsg.JsApiChooseMedia", "take media camera, mVideoFilePath is %s, the file not exist, fail", new Object[] { JsApiChooseMedia.a.this.ihD });
                  JsApiChooseMedia.a.this.ihB.aGY = -2;
                  JsApiChooseMedia.a.k(JsApiChooseMedia.a.this, JsApiChooseMedia.a.this.ihB);
                  GMTrace.o(19788524945408L, 147436);
                }
              });
              GMTrace.o(19782216712192L, 147389);
            }
          }
          else
          {
            w.e("MicroMsg.JsApiChooseMedia", "data is null!");
          }
        }
      }
    }
    
    protected final void a(AppBrandProxyUIProcessTask.ProcessRequest paramProcessRequest)
    {
      GMTrace.i(19781679841280L, 147385);
      this.ihC = ((JsApiChooseMedia.ChooseRequest)paramProcessRequest);
      if ((this.ihC.ihf & this.ihC.ihg))
      {
        i = 8;
        this.ihk = i;
        if (bg.eD(VD()) <= 200L) {
          break label209;
        }
      }
      label209:
      for (int i = 1;; i = 0)
      {
        if (i == 0)
        {
          w.e("MicroMsg.JsApiChooseMedia", "memory is not enough!");
          paramProcessRequest = VD();
          i = o.i.hEp;
          u.makeText(paramProcessRequest, ab.getResources().getString(i), 1).show();
        }
        w.i("MicroMsg.JsApiChooseMedia", "goVideo");
        VD().vKC = this;
        if ((!this.ihC.ihw) || (!this.ihC.ihx)) {
          break label214;
        }
        this.ihF = new l(VD());
        this.ihF.b(null, new View.OnCreateContextMenuListener()new p.d
        {
          public final void onCreateContextMenu(ContextMenu paramAnonymousContextMenu, View paramAnonymousView, ContextMenu.ContextMenuInfo paramAnonymousContextMenuInfo)
          {
            GMTrace.i(19775774261248L, 147341);
            paramAnonymousContextMenu.add(0, 1, 0, JsApiChooseMedia.a.a(JsApiChooseMedia.a.this).getString(o.i.cSS));
            paramAnonymousContextMenu.add(0, 2, 1, JsApiChooseMedia.a.b(JsApiChooseMedia.a.this).getString(o.i.cSW));
            GMTrace.o(19775774261248L, 147341);
          }
        }, new p.d()
        {
          public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
          {
            GMTrace.i(19792819912704L, 147468);
            switch (paramAnonymousMenuItem.getItemId())
            {
            }
            for (;;)
            {
              GMTrace.o(19792819912704L, 147468);
              return;
              JsApiChooseMedia.a.this.WX();
              GMTrace.o(19792819912704L, 147468);
              return;
              JsApiChooseMedia.a.this.WY();
            }
          }
        });
        this.ihF.e(new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(19775505825792L, 147339);
            w.e("MicroMsg.JsApiChooseMedia", "cancel chooseMedia, and finish process!");
            JsApiChooseMedia.a.this.ihB.aGY = 0;
            JsApiChooseMedia.a.a(JsApiChooseMedia.a.this, JsApiChooseMedia.a.this.ihB);
            GMTrace.o(19775505825792L, 147339);
          }
        });
        this.ihF.bpI();
        GMTrace.o(19781679841280L, 147385);
        return;
        i = 7;
        break;
      }
      label214:
      if (this.ihC.ihw)
      {
        WY();
        GMTrace.o(19781679841280L, 147385);
        return;
      }
      if (this.ihC.ihx)
      {
        WX();
        GMTrace.o(19781679841280L, 147385);
        return;
      }
      this.ihB.aGY = -2;
      w.e("MicroMsg.JsApiChooseMedia", "parameter is invalid, fail and finish process");
      a(this.ihB);
      GMTrace.o(19781679841280L, 147385);
    }
    
    public final AppBrandLocalVideoObject qA(String paramString)
    {
      GMTrace.i(19782619365376L, 147392);
      boolean bool;
      try
      {
        bool = com.tencent.mm.plugin.a.c.np(paramString);
        w.i("MicroMsg.JsApiChooseMedia", "checkRemux, isMp4 = %b", new Object[] { Boolean.valueOf(bool) });
        i = 55536;
        if (!bool) {
          break label528;
        }
        i = SightVideoJNI.shouldRemuxing(paramString, 660, 500, 20971520, 300000.0D, 1000000);
        w.i("MicroMsg.JsApiChooseMedia", "checkRemux, ret = %d", new Object[] { Integer.valueOf(i) });
      }
      catch (Exception localException1)
      {
        try
        {
          for (;;)
          {
            localObject = new MediaMetadataRetriever();
            ((MediaMetadataRetriever)localObject).setDataSource(paramString);
            if (localObject != null) {
              break;
            }
            w.e("MicroMsg.JsApiChooseMedia", "addVideoItem, null meta data");
            GMTrace.o(19782619365376L, 147392);
            return null;
            i = 1;
            break label541;
            i = 1;
            continue;
            i = -50006;
            continue;
            i = -50002;
            continue;
            localObject = new int[2];
            com.tencent.mm.pluginsdk.model.j.b(paramString, (int[])localObject);
            i = localObject[0];
            j = localObject[1];
            localObject = com.tencent.mm.compatible.util.e.fRZ + "microMsg." + System.currentTimeMillis() + ".mp4";
            w.i("MicroMsg.JsApiChooseMedia", "remuxIfNeed [%s] to [%s], result %d, resolution:[%d, %d]", new Object[] { paramString, localObject, Integer.valueOf(SightVideoJNI.remuxing(paramString, (String)localObject, i, j, b.oRE, b.oRD, 8, 2, 25.0F, b.oRF, null, 0, false)), Integer.valueOf(i), Integer.valueOf(j) });
            paramString = (String)localObject;
            continue;
            localException1 = localException1;
            w.e("MicroMsg.JsApiChooseMedia", "addVideoItem, remux failed, exp = %s", new Object[] { bg.f(localException1) });
          }
        }
        catch (Exception localException2)
        {
          for (;;)
          {
            w.e("MicroMsg.JsApiChooseMedia", "addVideoItem, MetaDataRetriever setDataSource failed, e = %s", new Object[] { localException2 });
            localAppBrandLocalVideoObject = null;
          }
          i = bg.getInt(localAppBrandLocalVideoObject.extractMetadata(18), 0);
          j = bg.getInt(localAppBrandLocalVideoObject.extractMetadata(19), 0);
          k = bg.getInt(localAppBrandLocalVideoObject.extractMetadata(9), 0);
          localAppBrandLocalVideoObject.release();
          localAppBrandLocalVideoObject = com.tencent.mm.plugin.appbrand.appstorage.c.aG(this.ihC.appId, paramString);
          if (localAppBrandLocalVideoObject != null) {
            break label463;
          }
          w.e("MicroMsg.JsApiChooseMedia", "attachVideo error, return null");
          GMTrace.o(19782619365376L, 147392);
          return null;
          localAppBrandLocalVideoObject.duration = ((k + 500) / 1000);
          localAppBrandLocalVideoObject.width = i;
          localAppBrandLocalVideoObject.height = j;
          localAppBrandLocalVideoObject.size = com.tencent.mm.a.e.aY(paramString);
          w.i("MicroMsg.JsApiChooseMedia", "addVideoItem, return %s", new Object[] { localAppBrandLocalVideoObject });
          GMTrace.o(19782619365376L, 147392);
          return localAppBrandLocalVideoObject;
        }
      }
      int i = com.tencent.mm.a.e.aY(paramString);
      w.i("MicroMsg.JsApiChooseMedia", "fileLength = %d", new Object[] { Integer.valueOf(i) });
      if (i > 20971520) {
        i = -1;
      }
      for (;;)
      {
        w.e("MicroMsg.JsApiChooseMedia", "unknown check type");
        i = -50001;
        if (i != -50006) {}
        Object localObject;
        int j;
        AppBrandLocalVideoObject localAppBrandLocalVideoObject;
        int k;
        label463:
        label528:
        if ((i == -1) || (!bool)) {
          break;
        }
        label541:
        switch (i)
        {
        }
      }
    }
    
    public final void qB(String paramString)
    {
      Object localObject2 = null;
      GMTrace.i(19782887800832L, 147394);
      Object localObject1;
      if (!TextUtils.isEmpty(this.ihE))
      {
        localObject1 = new File(this.ihE);
        if ((localObject1 != null) && (((File)localObject1).exists())) {
          break label469;
        }
        w.e("MicroMsg.JsApiChooseMedia", "file == null or file not exist for path:%s!", new Object[] { this.ihE });
        String str = new File(paramString).getName();
        localObject1 = localObject2;
        if (!TextUtils.isEmpty(str))
        {
          localObject1 = localObject2;
          if (str.contains(".")) {
            localObject1 = str.substring(0, str.lastIndexOf("."));
          }
        }
        if (TextUtils.isEmpty((CharSequence)localObject1)) {
          break label315;
        }
        if ((com.tencent.mm.compatible.util.e.fRZ == null) || (!com.tencent.mm.compatible.util.e.fRZ.endsWith("/"))) {
          break label276;
        }
        this.ihE = (com.tencent.mm.compatible.util.e.fRZ + (String)localObject1 + ".jpeg");
      }
      for (;;)
      {
        if (!new File(this.ihE).exists())
        {
          w.i("MicroMsg.JsApiChooseMedia", "file not exist for path:%s!", new Object[] { this.ihE });
          w.i("MicroMsg.JsApiChooseMedia", "create new thumb path:%s!", new Object[] { this.ihE });
          paramString = ThumbnailUtils.createVideoThumbnail(paramString, 1);
          if (paramString == null)
          {
            w.e("MicroMsg.JsApiChooseMedia", "createVideoThumbnail bitmap fail for path:%s!", new Object[] { this.ihE });
            GMTrace.o(19782887800832L, 147394);
            return;
            w.e("MicroMsg.JsApiChooseMedia", "mThumbFilePath is empty!");
            localObject1 = null;
            break;
            label276:
            this.ihE = (com.tencent.mm.compatible.util.e.fRZ + "/" + (String)localObject1 + ".jpeg");
            continue;
            label315:
            localObject1 = "microMsg_" + System.currentTimeMillis();
            this.ihE = (com.tencent.mm.compatible.util.e.fRZ + (String)localObject1 + ".jpeg");
            continue;
          }
          paramString = ThumbnailUtils.extractThumbnail(paramString, 690, 400, 2);
          try
          {
            com.tencent.mm.sdk.platformtools.d.a(paramString, 30, Bitmap.CompressFormat.JPEG, this.ihE, true);
            GMTrace.o(19782887800832L, 147394);
            return;
          }
          catch (IOException paramString)
          {
            w.e("MicroMsg.JsApiChooseMedia", "saveBitmapToImage exist IOException:" + paramString.getMessage());
            GMTrace.o(19782887800832L, 147394);
            return;
          }
        }
      }
      w.i("MicroMsg.JsApiChooseMedia", "file is exist for path:%s!", new Object[] { this.ihE });
      GMTrace.o(19782887800832L, 147394);
      return;
      label469:
      w.i("MicroMsg.JsApiChooseMedia", "file is exist!, path:%s", new Object[] { this.ihE });
      GMTrace.o(19782887800832L, 147394);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\media\JsApiChooseMedia.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */