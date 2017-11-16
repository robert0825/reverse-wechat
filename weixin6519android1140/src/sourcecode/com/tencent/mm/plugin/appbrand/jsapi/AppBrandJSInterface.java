package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiCreateAudioInstance;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiDestroyInstanceAudio;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiGetAudioState;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiGetBackgroundAudioState;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiGetMusicPlayerState;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateAudio;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateBackgroundAudio;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateRecorder;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiPausePlayVoice;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetAudioState;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartPlayVoice;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStopPlayVoice;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStopRecordVoice;
import com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize;
import com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin;
import com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData;
import com.tencent.mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect;
import com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiCheckBioEnrollment;
import com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiCheckIsSupportSoterAuthentication;
import com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChooseWeChatContact;
import com.tencent.mm.plugin.appbrand.jsapi.file.JsApiOpenDocument;
import com.tencent.mm.plugin.appbrand.jsapi.lbs.JsApiGetLocation;
import com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage;
import com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia;
import com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo;
import com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN;
import com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.JsApiLaunchMiniProgram;
import com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.JsApiNavigateToDevMiniProgram;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.permission.c.a;
import com.tencent.mm.plugin.appbrand.permission.c.b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class AppBrandJSInterface
{
  public Handler hTS;
  public c hXs;
  private Map<String, d> hXt;
  private int hXu;
  private ConcurrentHashMap<Integer, String> hXv;
  public boolean mRunning;
  
  public AppBrandJSInterface(com.tencent.mm.plugin.appbrand.j paramj)
  {
    GMTrace.i(10419859095552L, 77634);
    this.hXu = 0;
    this.hXv = new ConcurrentHashMap();
    this.hXs = paramj;
    this.mRunning = true;
    f.hXH = new HashMap();
    f.a(new s());
    f.a(new af());
    f.a(new bs());
    f.a(new t());
    f.a(new ai());
    f.a(new bt());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.e.b());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.e.k());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.e.a());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.e.e());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.e.i());
    f.a(new JsApiLogin());
    f.a(new JsApiAuthorize());
    f.a(new JsApiOperateWXData());
    f.a(new bq());
    f.a(new at());
    f.a(new bb());
    f.a(new as());
    f.a(new JsApiChooseImage());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.media.c());
    f.a(new JsApiChooseVideo());
    f.a(new JsApiStartRecordVoice());
    f.a(new JsApiStopRecordVoice());
    f.a(new JsApiStartPlayVoice());
    f.a(new JsApiPausePlayVoice());
    f.a(new JsApiStopPlayVoice());
    f.a(new JsApiGetLocation());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.lbs.d());
    f.a(new ac());
    f.a(new JsApiGetMusicPlayerState());
    f.a(new JsApiOperateMusicPlayer());
    f.a(new JsApiScanCode());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.f.d());
    f.a(new au());
    f.a(new bh());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.f.g());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.f.c());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.file.e());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.file.d());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.file.b());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.file.c());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.contact.b());
    f.a(new bw());
    f.a(new bu());
    f.a(new ak());
    f.a(new v());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.share.b());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.share.d());
    f.a(new aj());
    f.a(new bi());
    f.a(new bk());
    f.a(new bj());
    f.a(new bz());
    f.a(new bo());
    f.a(new ad());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.d.b());
    f.a(new w());
    f.a(new x());
    f.a(new be());
    f.a(new bf());
    f.a(new JsApiOpenDocument());
    f.a(new p());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.h.c());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.h.b());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.h.d());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.h.a());
    f.a(new z());
    f.a(new aq());
    f.a(new ag());
    f.a(new ah());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.lbs.b());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.media.b());
    f.a(new JsApiRefreshSession());
    f.a(new by());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.map.e());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.map.j());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.map.m());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.f.e());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.share.e());
    f.a(new m());
    f.a(new av());
    f.a(new JsApiMakeVoIPCall());
    f.a(new aa());
    f.a(new JsApiSetClipboardData());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.b.k());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.b.c());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.b.g());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.b.m());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.b.n());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.b.h());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.b.d());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.b.b());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.b.f());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.b.e());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.b.l());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.b.o());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.b.j());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.b.i());
    f.a(new JsApiLaunchMiniProgram());
    f.a(new ba());
    f.a(new JsApiChooseWeChatContact());
    f.a(new JsApiChooseMedia());
    f.a(new JsApiUploadEncryptedFileToCDN());
    f.a(new y());
    f.a(new ay());
    f.a(new cd());
    f.a(new JsApiGetBackgroundAudioState());
    f.a(new JsApiSetBackgroundAudioState());
    f.a(new JsApiOperateBackgroundAudio());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.share.f());
    f.a(new al());
    f.a(new az());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.f.f());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.contact.a());
    f.a(new JsApiOpenWeRunSetting());
    f.a(new JsApiUploadWeRunData());
    f.a(new n());
    f.a(new ae());
    f.a(new br());
    f.a(new cg());
    f.a(new ch());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.share.h());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.share.g());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.c.b());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.c.c());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.c.d());
    f.a(new JsApiCheckIsSupportFaceDetect());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.bio.face.b());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.bio.face.c());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.video.b());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.live.e());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.live.d());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.media.d());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.media.e());
    f.a(new JsApiGetSetting());
    f.a(new aw());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.share.c());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.i.d());
    f.a(new bn());
    f.a(new q());
    f.a(new ar());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.c());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.map.g());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.map.f());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.op_report.b());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.i.b());
    f.a(new bm());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.i.c());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.file.a());
    f.a(new ca());
    f.a(new bp());
    f.a(new JsApiCheckIsSupportSoterAuthentication());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.bio.soter.b());
    f.a(new r());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.e.d());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.e.h());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.e.c());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.e.g());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.e.f());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.e.j());
    f.a(new cf());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.camera.h());
    f.a(new bv());
    f.a(new JsApiOperateRecorder());
    f.a(new JsApiCreateAudioInstance());
    f.a(new JsApiSetAudioState());
    f.a(new JsApiGetAudioState());
    f.a(new JsApiOperateAudio());
    f.a(new JsApiDestroyInstanceAudio());
    f.a(new JsApiNavigateBackApplication());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.lbs.c());
    f.a(new JsApiCheckBioEnrollment());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.wifi.d());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.wifi.e());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.wifi.c());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.wifi.b());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.wifi.a());
    f.a(new JsApiNavigateToDevMiniProgram());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.nfc.d());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.nfc.e());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.nfc.c());
    f.a(new com.tencent.mm.plugin.appbrand.jsapi.nfc.b());
    this.hXt = f.hXH;
    VQ();
    GMTrace.o(10419859095552L, 77634);
  }
  
  public AppBrandJSInterface(AppBrandPageView paramAppBrandPageView)
  {
    GMTrace.i(10419993313280L, 77635);
    this.hXu = 0;
    this.hXv = new ConcurrentHashMap();
    this.hXs = paramAppBrandPageView;
    this.mRunning = true;
    f.hXI = new HashMap();
    f.b(new ax());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.map.i());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.map.k());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.map.n());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.d.e());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.d.b());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.d.f());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.d.c());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.d.g());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.d.d());
    f.b(new am());
    f.b(new bh());
    f.b(new bi());
    f.b(new bk());
    f.b(new bj());
    f.b(new bl());
    f.b(new bz());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.g.d());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.g.f());
    f.b(new ab());
    f.b(new ad());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.video.a());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.video.d());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.video.c());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.video.b());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.live.c());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.live.i());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.live.g());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.live.e());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.live.b());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.live.h());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.live.f());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.live.d());
    f.b(new v());
    f.b(new an());
    f.b(new bc());
    f.b(new cb());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.map.a());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.map.d());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.map.l());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.map.c());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.map.h());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.map.b());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.contact.c());
    f.b(new u());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.a.d());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.a.f());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.a.b());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.a.e());
    f.b(new cd());
    f.b(new ch());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.container.a());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.container.c());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.container.b());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.a.c());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.g.e());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.g.b());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.g.g());
    f.b(new ca());
    f.b(new ap());
    f.b(new ce());
    f.b(new bg());
    f.b(new ao());
    f.b(new cc());
    f.b(new bd());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.camera.f());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.camera.j());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.camera.i());
    f.b(new o());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.k.f());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.k.h());
    f.b(new com.tencent.mm.plugin.appbrand.jsapi.k.g());
    this.hXt = f.hXI;
    VQ();
    GMTrace.o(10419993313280L, 77635);
  }
  
  private static String A(String paramString1, String paramString2)
  {
    GMTrace.i(17689225461760L, 131795);
    HashMap localHashMap = new HashMap();
    localHashMap.put("errMsg", paramString1 + ":" + paramString2);
    paramString1 = new JSONObject(localHashMap).toString();
    GMTrace.o(17689225461760L, 131795);
    return paramString1;
  }
  
  private void VQ()
  {
    GMTrace.i(10420127531008L, 77636);
    HandlerThread localHandlerThread = new HandlerThread("AppBrandAsyncJSThread");
    localHandlerThread.start();
    this.hTS = new Handler(localHandlerThread.getLooper());
    GMTrace.o(10420127531008L, 77636);
  }
  
  private static JSONObject qe(String paramString)
  {
    GMTrace.i(10420798619648L, 77641);
    String str = paramString;
    try
    {
      if (com.tencent.mm.sdk.platformtools.bg.nm(paramString)) {
        str = "{}";
      }
      paramString = new JSONObject(str);
      GMTrace.o(10420798619648L, 77641);
      return paramString;
    }
    catch (Exception paramString)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.AppBrandJSInterface", paramString.getMessage());
      GMTrace.o(10420798619648L, 77641);
    }
    return null;
  }
  
  /* Error */
  public static int[] qf(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 891
    //   3: ldc_w 893
    //   6: invokestatic 40	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: new 895	org/json/JSONArray
    //   12: dup
    //   13: aload_0
    //   14: invokespecial 896	org/json/JSONArray:<init>	(Ljava/lang/String;)V
    //   17: astore_3
    //   18: aload_3
    //   19: invokevirtual 900	org/json/JSONArray:length	()I
    //   22: newarray <illegal type>
    //   24: astore_0
    //   25: iconst_0
    //   26: istore_1
    //   27: aload_0
    //   28: astore_2
    //   29: iload_1
    //   30: aload_3
    //   31: invokevirtual 900	org/json/JSONArray:length	()I
    //   34: if_icmpge +35 -> 69
    //   37: aload_0
    //   38: iload_1
    //   39: aload_3
    //   40: iload_1
    //   41: invokevirtual 904	org/json/JSONArray:getInt	(I)I
    //   44: iastore
    //   45: iload_1
    //   46: iconst_1
    //   47: iadd
    //   48: istore_1
    //   49: goto -22 -> 27
    //   52: astore_2
    //   53: iconst_0
    //   54: newarray <illegal type>
    //   56: astore_0
    //   57: ldc_w 879
    //   60: aload_2
    //   61: invokevirtual 882	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   64: invokestatic 888	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   67: aload_0
    //   68: astore_2
    //   69: ldc2_w 891
    //   72: ldc_w 893
    //   75: invokestatic 620	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   78: aload_2
    //   79: areturn
    //   80: astore_2
    //   81: goto -24 -> 57
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	84	0	paramString	String
    //   26	23	1	i	int
    //   28	1	2	str1	String
    //   52	9	2	localException1	Exception
    //   68	11	2	str2	String
    //   80	1	2	localException2	Exception
    //   17	23	3	localJSONArray	org.json.JSONArray
    // Exception table:
    //   from	to	target	type
    //   9	25	52	java/lang/Exception
    //   29	45	80	java/lang/Exception
  }
  
  public final String a(final String paramString1, final String paramString2, final int paramInt, final boolean paramBoolean)
  {
    GMTrace.i(17396765032448L, 129616);
    if (this.hXs.RV() == null)
    {
      paramString1 = A(paramString1, "fail:interrupted");
      GMTrace.o(17396765032448L, 129616);
      return paramString1;
    }
    final Object localObject = (d)this.hXt.get(paramString1);
    if (localObject == null) {
      paramString1 = A(paramString1, "fail:not supported");
    }
    for (;;)
    {
      if (paramString1 != null) {
        this.hXs.hXr.w(paramInt, paramString1);
      }
      if (!paramBoolean) {
        break label311;
      }
      if (!com.tencent.mm.sdk.platformtools.bg.nm(paramString1)) {
        break;
      }
      GMTrace.o(17396765032448L, 129616);
      return "{}";
      paramString1 = com.tencent.mm.plugin.appbrand.permission.c.k(this.hXs.RV()).a(this.hXs, (b)localObject, new c.b()
      {
        public final void a(c.a paramAnonymousa)
        {
          GMTrace.i(18841484656640L, 140380);
          if ((AppBrandJSInterface.this.hXs == null) || (!AppBrandJSInterface.this.hXs.isRunning()))
          {
            GMTrace.o(18841484656640L, 140380);
            return;
          }
          if (paramAnonymousa.code == 1)
          {
            AppBrandJSInterface.this.hTS.post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(10411134943232L, 77569);
                if ((AppBrandJSInterface.this.hXs == null) || (!AppBrandJSInterface.this.hXs.isRunning()))
                {
                  GMTrace.o(10411134943232L, 77569);
                  return;
                }
                AppBrandJSInterface.this.a(AppBrandJSInterface.3.this.hXA, AppBrandJSInterface.3.this.hXB, AppBrandJSInterface.3.this.fXx, AppBrandJSInterface.3.this.hXC);
                GMTrace.o(10411134943232L, 77569);
              }
            });
            GMTrace.o(18841484656640L, 140380);
            return;
          }
          AppBrandJSInterface.this.hXs.v(paramInt, localObject.d(paramAnonymousa.eCh, null));
          GMTrace.o(18841484656640L, 140380);
        }
      });
      if (3 == paramString1.code)
      {
        GMTrace.o(17396765032448L, 129616);
        return "";
      }
      if (paramString1.code != 1)
      {
        paramString1 = ((d)localObject).d(paramString1.eCh, null);
      }
      else
      {
        paramString2 = qe(paramString2);
        if (paramString2 == null)
        {
          paramString1 = ((d)localObject).d("fail:invalid data", null);
        }
        else if (paramBoolean)
        {
          paramString1 = (k)localObject;
          localObject = this.hXs;
          if ((localObject instanceof com.tencent.mm.plugin.appbrand.j))
          {
            paramString1.hXQ = Thread.currentThread();
            paramString1 = paramString1.a((com.tencent.mm.plugin.appbrand.j)localObject, paramString2);
          }
          else if ((localObject instanceof AppBrandPageView))
          {
            paramString1 = paramString1.a((AppBrandPageView)localObject);
          }
          else
          {
            paramString1 = "";
          }
        }
        else
        {
          paramString1 = null;
          ((a)localObject).a(this.hXs, paramString2, paramInt);
        }
      }
    }
    GMTrace.o(17396765032448L, 129616);
    return paramString1;
    label311:
    if (paramString1 != null) {
      this.hXs.v(paramInt, paramString1);
    }
    GMTrace.o(17396765032448L, 129616);
    return "";
  }
  
  public final void cleanup()
  {
    GMTrace.i(10420261748736L, 77637);
    this.hTS.getLooper().quit();
    this.mRunning = false;
    this.hXv.clear();
    GMTrace.o(10420261748736L, 77637);
  }
  
  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public String invokeHandler(final String paramString1, final String paramString2, final int paramInt)
  {
    GMTrace.i(10420530184192L, 77639);
    long l = System.currentTimeMillis();
    for (;;)
    {
      try
      {
        d locald = (d)this.hXt.get(paramString1);
        if (locald == null)
        {
          this.hXs.v(paramInt, A(paramString1, "fail:not supported"));
          GMTrace.o(10420530184192L, 77639);
          return "fail:not supported";
        }
        boolean bool = locald instanceof k;
        g localg = this.hXs.hXr;
        c localc = this.hXs;
        if (this.hXs.RV() == null)
        {
          localObject = "";
          localg.hXJ.put(Integer.valueOf(paramInt), new g.a(localc, locald, paramString2, System.currentTimeMillis(), (String)localObject));
          if (bool)
          {
            localObject = a(paramString1, paramString2, paramInt, true);
            if (com.tencent.mm.compatible.loader.a.a(l.hXS, locald.getClass())) {
              break label331;
            }
            paramInt = 1;
            if (paramInt != 0)
            {
              if (paramString2 != null) {
                continue;
              }
              paramInt = 0;
              com.tencent.mm.sdk.platformtools.w.i("MicroMsg.AppBrandJSInterface", "invokeHandler, api: %s, data size: %d, sync: %b, time: %d", new Object[] { paramString1, Integer.valueOf(paramInt), Boolean.valueOf(bool), Long.valueOf(System.currentTimeMillis() - l) });
            }
            GMTrace.o(10420530184192L, 77639);
            return (String)localObject;
          }
        }
        else
        {
          localObject = this.hXs.RV().hyJ;
          if ((localObject == null) || (((com.tencent.mm.plugin.appbrand.page.m)localObject).Zs() == null)) {
            break label323;
          }
          localObject = ((com.tencent.mm.plugin.appbrand.page.m)localObject).Zs().Zi();
          continue;
        }
        this.hTS.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(10322148589568L, 76906);
            if (!AppBrandJSInterface.this.mRunning)
            {
              GMTrace.o(10322148589568L, 76906);
              return;
            }
            AppBrandJSInterface.this.a(paramString1, paramString2, paramInt, false);
            GMTrace.o(10322148589568L, 76906);
          }
        });
        Object localObject = "";
        continue;
        paramInt = paramString2.length();
        continue;
        localObject = "";
      }
      catch (Exception paramString2)
      {
        com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.AppBrandJSInterface", paramString2, " Invoke Error %s", new Object[] { paramString1 });
        throw paramString2;
      }
      label323:
      continue;
      label331:
      paramInt = 0;
    }
  }
  
  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public boolean isDebugPackage()
  {
    GMTrace.i(18212674600960L, 135695);
    boolean bool = com.tencent.mm.sdk.a.b.bPq();
    GMTrace.o(18212674600960L, 135695);
    return bool;
  }
  
  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public void publishHandler(final String paramString1, final String paramString2, final String paramString3)
  {
    int i = 0;
    GMTrace.i(10420395966464L, 77638);
    this.hTS.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(10312216477696L, 76832);
        AppBrandJSInterface.this.hXs.a(paramString1, paramString2, AppBrandJSInterface.qf(paramString3));
        GMTrace.o(10312216477696L, 76832);
      }
    });
    if (paramString2 == null) {}
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.AppBrandJSInterface", "publishHandler, event: %s, data size: %d, data : %s", new Object[] { paramString1, Integer.valueOf(i), paramString2 });
      GMTrace.o(10420395966464L, 77638);
      return;
      i = paramString2.length();
    }
  }
  
  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public String retrieveEvent(int paramInt)
  {
    GMTrace.i(17396630814720L, 129615);
    String str = (String)this.hXv.get(Integer.valueOf(paramInt));
    this.hXv.remove(Integer.valueOf(paramInt));
    if (str == null)
    {
      GMTrace.o(17396630814720L, 129615);
      return "";
    }
    GMTrace.o(17396630814720L, 129615);
    return str;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\AppBrandJSInterface.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */