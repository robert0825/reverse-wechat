package com.tencent.mm.plugin.photoedit;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.ao.k;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.cf.b;
import com.tencent.mm.pluginsdk.model.e;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;

public class PhotoEditProxy
  extends com.tencent.mm.remoteservice.a
{
  public PhotoEditProxy(com.tencent.mm.remoteservice.d paramd)
  {
    super(paramd);
    GMTrace.i(19320776163328L, 143951);
    GMTrace.o(19320776163328L, 143951);
  }
  
  public int doFav(String paramString)
  {
    GMTrace.i(19320910381056L, 143952);
    int i = ((Integer)REMOTE_CALL("doFavInMM", new Object[] { paramString })).intValue();
    GMTrace.o(19320910381056L, 143952);
    return i;
  }
  
  @com.tencent.mm.remoteservice.f
  public int doFavInMM(String paramString)
  {
    GMTrace.i(19321984122880L, 143960);
    cf localcf = new cf();
    e.a(localcf, 2, paramString);
    localcf.eDv.eDC = 44;
    com.tencent.mm.sdk.b.a.vgX.m(localcf);
    w.i("MicroMsg.PhotoEditProxy", "[doFavInMM] path:%s", new Object[] { paramString });
    int i = localcf.eDw.ret;
    GMTrace.o(19321984122880L, 143960);
    return i;
  }
  
  public String getFullPath(String paramString)
  {
    GMTrace.i(19321447251968L, 143956);
    paramString = (String)REMOTE_CALL("getFullPathInMM", new Object[] { paramString });
    GMTrace.o(19321447251968L, 143956);
    return paramString;
  }
  
  @com.tencent.mm.remoteservice.f
  public String getFullPathInMM(String paramString)
  {
    GMTrace.i(19322118340608L, 143961);
    paramString = com.tencent.mm.ao.n.IZ().getFullPath(paramString);
    GMTrace.o(19322118340608L, 143961);
    return paramString;
  }
  
  public String getSelfUsername()
  {
    GMTrace.i(19321313034240L, 143955);
    String str = (String)REMOTE_CALL("getSelfUsernameInMM", new Object[0]);
    GMTrace.o(19321313034240L, 143955);
    return str;
  }
  
  @com.tencent.mm.remoteservice.f
  public String getSelfUsernameInMM()
  {
    GMTrace.i(19321715687424L, 143958);
    String str = q.zE();
    GMTrace.o(19321715687424L, 143958);
    return str;
  }
  
  public boolean isAutoSave()
  {
    GMTrace.i(19321178816512L, 143954);
    boolean bool = ((Boolean)REMOTE_CALL("isAutoSavePhotoInMM", new Object[0])).booleanValue();
    GMTrace.o(19321178816512L, 143954);
    return bool;
  }
  
  @com.tencent.mm.remoteservice.f
  public boolean isAutoSavePhotoInMM()
  {
    GMTrace.i(19321849905152L, 143959);
    at.AR();
    boolean bool = com.tencent.mm.y.c.xh().getBoolean(w.a.vwi, true);
    GMTrace.o(19321849905152L, 143959);
    return bool;
  }
  
  public void sendImage(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(19321044598784L, 143953);
    REMOTE_CALL("sendImageInMM", new Object[] { paramString1, paramString2, paramString3, paramString4 });
    GMTrace.o(19321044598784L, 143953);
  }
  
  @com.tencent.mm.remoteservice.f
  public void sendImageInMM(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    GMTrace.i(19321581469696L, 143957);
    paramString2 = new k(4, paramString3, paramString4, paramString2, 0, null, 0, "", "", true, R.g.aVk);
    at.wS().a(paramString2, 0);
    com.tencent.mm.plugin.messenger.a.d.aOe().cR(paramString1, paramString4);
    GMTrace.o(19321581469696L, 143957);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\photoedit\PhotoEditProxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */