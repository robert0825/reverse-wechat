package com.tencent.mm.plugin.mmsight.model;

import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ao.n;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ba;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.io.Serializable;
import java.lang.reflect.Method;

public class CaptureMMProxy
  extends com.tencent.mm.remoteservice.a
{
  private static CaptureMMProxy mXf;
  private static String mXg;
  
  static
  {
    GMTrace.i(7335267270656L, 54652);
    mXg = "";
    GMTrace.o(7335267270656L, 54652);
  }
  
  public CaptureMMProxy(com.tencent.mm.remoteservice.d paramd)
  {
    super(paramd);
    GMTrace.i(7332448698368L, 54631);
    GMTrace.o(7332448698368L, 54631);
  }
  
  public static void createProxy(CaptureMMProxy paramCaptureMMProxy)
  {
    GMTrace.i(7332180262912L, 54629);
    mXf = paramCaptureMMProxy;
    GMTrace.o(7332180262912L, 54629);
  }
  
  public static CaptureMMProxy getInstance()
  {
    GMTrace.i(7332314480640L, 54630);
    CaptureMMProxy localCaptureMMProxy = mXf;
    GMTrace.o(7332314480640L, 54630);
    return localCaptureMMProxy;
  }
  
  public boolean checkUseMMVideoPlayer()
  {
    GMTrace.i(7333656657920L, 54640);
    Object localObject = REMOTE_CALL("checkUseMMVideoPlayerInMM", new Object[0]);
    if (localObject != null)
    {
      w.i("MicroMsg.CaptureMMProxy", "checkUseMMVideoPlayer[%b]", new Object[] { localObject });
      boolean bool = ((Boolean)localObject).booleanValue();
      GMTrace.o(7333656657920L, 54640);
      return bool;
    }
    GMTrace.o(7333656657920L, 54640);
    return true;
  }
  
  @com.tencent.mm.remoteservice.f
  public boolean checkUseMMVideoPlayerInMM()
  {
    GMTrace.i(7333925093376L, 54642);
    w.d("MicroMsg.CaptureMMProxy", "checkUseMMVideoPlayerInMM() called");
    com.tencent.mm.modelcontrol.d.Gv();
    boolean bool = com.tencent.mm.modelcontrol.d.GC();
    w.d("MicroMsg.CaptureMMProxy", "checkUseMMVideoPlayerInMM() returned: " + bool);
    GMTrace.o(7333925093376L, 54642);
    return bool;
  }
  
  public Object get(w.a parama, Object paramObject)
  {
    GMTrace.i(7332851351552L, 54634);
    w.i("MicroMsg.CaptureMMProxy", "get %s %s", new Object[] { parama, paramObject });
    Object localObject = REMOTE_CALL("getConfigStorage", new Object[] { parama, paramObject });
    w.i("MicroMsg.CaptureMMProxy", "get %s %s and get val %s", new Object[] { parama, paramObject, localObject });
    if (localObject == null)
    {
      GMTrace.o(7332851351552L, 54634);
      return paramObject;
    }
    GMTrace.o(7332851351552L, 54634);
    return localObject;
  }
  
  public String getAccVideoPath()
  {
    GMTrace.i(7332582916096L, 54632);
    String str = (String)REMOTE_CALL("getAccVideoPathInMM", new Object[0]);
    w.i("MicroMsg.CaptureMMProxy", "getAccVideoPathInMM " + str + " accVideoPath: " + mXg);
    if (!bg.nm(str)) {
      mXg = str;
    }
    if (!bg.nm(mXg))
    {
      str = mXg;
      GMTrace.o(7332582916096L, 54632);
      return str;
    }
    GMTrace.o(7332582916096L, 54632);
    return str;
  }
  
  @com.tencent.mm.remoteservice.f
  public String getAccVideoPathInMM()
  {
    GMTrace.i(7334059311104L, 54643);
    w.d("MicroMsg.CaptureMMProxy", "getAccVideoPathInMM");
    o.Ng();
    String str = o.getAccVideoPath();
    GMTrace.o(7334059311104L, 54643);
    return str;
  }
  
  public boolean getBoolean(w.a parama, boolean paramBoolean)
  {
    GMTrace.i(20852200439808L, 155361);
    w.i("MicroMsg.CaptureMMProxy", "getBoolean %s %s", new Object[] { parama, Boolean.valueOf(paramBoolean) });
    Object localObject = REMOTE_CALL("getConfigStorage", new Object[] { parama, Boolean.valueOf(paramBoolean) });
    w.i("MicroMsg.CaptureMMProxy", "getBoolean %s %s and get val %s", new Object[] { parama, Boolean.valueOf(paramBoolean), localObject });
    if (localObject == null)
    {
      GMTrace.o(20852200439808L, 155361);
      return paramBoolean;
    }
    paramBoolean = bg.getBoolean(localObject.toString(), paramBoolean);
    GMTrace.o(20852200439808L, 155361);
    return paramBoolean;
  }
  
  @com.tencent.mm.remoteservice.f
  public Object getConfigStorage(int paramInt, Object paramObject)
  {
    GMTrace.i(7334327746560L, 54645);
    w.a locala = ((w.a[])w.a.class.getEnumConstants())[paramInt];
    w.i("MicroMsg.CaptureMMProxy", "getConfigStorage, %s %s", new Object[] { locala, paramObject });
    h.xz();
    paramObject = h.xy().xh().get(locala, paramObject);
    GMTrace.o(7334327746560L, 54645);
    return paramObject;
  }
  
  public String getDeviceInfoConfig()
  {
    GMTrace.i(7333254004736L, 54637);
    String str = (String)REMOTE_CALL("getDeviceInfoConfigInMM", new Object[0]);
    w.i("MicroMsg.CaptureMMProxy", "getDeviceInfoConfig return: %s", new Object[] { str });
    GMTrace.o(7333254004736L, 54637);
    return str;
  }
  
  @com.tencent.mm.remoteservice.f
  public String getDeviceInfoConfigInMM()
  {
    GMTrace.i(7334596182016L, 54647);
    h.xz();
    String str = h.xy().xi().bUq();
    GMTrace.o(7334596182016L, 54647);
    return str;
  }
  
  public String getDynamicConfig(String paramString)
  {
    GMTrace.i(7333388222464L, 54638);
    String str = (String)REMOTE_CALL("getDynamicConfigInMM", new Object[] { paramString });
    w.i("MicroMsg.CaptureMMProxy", "getDynamicConfig, key: %s, value: %s", new Object[] { paramString, str });
    GMTrace.o(7333388222464L, 54638);
    return str;
  }
  
  @com.tencent.mm.remoteservice.f
  public String getDynamicConfigInMM(String paramString)
  {
    GMTrace.i(7334730399744L, 54648);
    paramString = ((com.tencent.mm.plugin.zero.b.a)h.h(com.tencent.mm.plugin.zero.b.a.class)).ut().getValue(paramString);
    GMTrace.o(7334730399744L, 54648);
    return paramString;
  }
  
  public int getInt(w.a parama, int paramInt)
  {
    GMTrace.i(20353447362560L, 151645);
    w.i("MicroMsg.CaptureMMProxy", "getInt %s %s", new Object[] { parama, Integer.valueOf(paramInt) });
    Object localObject = REMOTE_CALL("getConfigStorage", new Object[] { parama, Integer.valueOf(paramInt) });
    w.i("MicroMsg.CaptureMMProxy", "getInt %s %s and get val %s", new Object[] { parama, Integer.valueOf(paramInt), localObject });
    if (localObject == null)
    {
      GMTrace.o(20353447362560L, 151645);
      return paramInt;
    }
    paramInt = bg.getInt(localObject.toString(), paramInt);
    GMTrace.o(20353447362560L, 151645);
    return paramInt;
  }
  
  public VideoTransPara getSnsAlbumVideoTransPara()
  {
    GMTrace.i(7333119787008L, 54636);
    Object localObject = (Parcelable)REMOTE_CALL("getSnsAlbumVideoTransParaInMM", new Object[0]);
    w.d("MicroMsg.CaptureMMProxy", "getSnsAlbumVideoTransPara() returned: " + localObject);
    localObject = (VideoTransPara)localObject;
    GMTrace.o(7333119787008L, 54636);
    return (VideoTransPara)localObject;
  }
  
  @com.tencent.mm.remoteservice.f
  public VideoTransPara getSnsAlbumVideoTransParaInMM()
  {
    GMTrace.i(7333790875648L, 54641);
    w.d("MicroMsg.CaptureMMProxy", "getSnsAlbumVideoTransParaInMM() called");
    VideoTransPara localVideoTransPara = com.tencent.mm.modelcontrol.d.Gv().Gy();
    w.d("MicroMsg.CaptureMMProxy", "getVideoTransParaInMM() returned: " + localVideoTransPara);
    GMTrace.o(7333790875648L, 54641);
    return localVideoTransPara;
  }
  
  public String getSubCoreImageFullPath(String paramString)
  {
    GMTrace.i(7332717133824L, 54633);
    paramString = (String)REMOTE_CALL("getSubCoreImageFullPathInMM", new Object[] { paramString });
    w.i("MicroMsg.CaptureMMProxy", "getSubCoreImageFullPath " + paramString);
    GMTrace.o(7332717133824L, 54633);
    return paramString;
  }
  
  @com.tencent.mm.remoteservice.f
  public String getSubCoreImageFullPathInMM(String paramString)
  {
    GMTrace.i(7334193528832L, 54644);
    w.d("MicroMsg.CaptureMMProxy", "getSubCoreImageFullPathInMM, %s", new Object[] { paramString });
    paramString = n.IZ().getFullPath(paramString);
    GMTrace.o(7334193528832L, 54644);
    return paramString;
  }
  
  public byte[] getWeixinMeta()
  {
    GMTrace.i(7333522440192L, 54639);
    byte[] arrayOfByte = (byte[])REMOTE_CALL("getWeixinMetaDataInMM", new Object[0]);
    w.i("MicroMsg.CaptureMMProxy", "getWeixinMeta result: %s", new Object[] { arrayOfByte });
    GMTrace.o(7333522440192L, 54639);
    return arrayOfByte;
  }
  
  @com.tencent.mm.remoteservice.f
  public byte[] getWeixinMetaDataInMM()
  {
    GMTrace.i(7334864617472L, 54649);
    byte[] arrayOfByte = com.tencent.mm.modelcontrol.d.Gv().getWeixinMeta();
    GMTrace.o(7334864617472L, 54649);
    return arrayOfByte;
  }
  
  protected final Bundle objectsToBundle(Object... paramVarArgs)
  {
    GMTrace.i(7334998835200L, 54650);
    Bundle localBundle = new Bundle();
    int j = paramVarArgs.length;
    int i = 0;
    if (i < j)
    {
      if ((paramVarArgs[i] instanceof Bundle)) {
        localBundle.putBundle(String.valueOf(i), (Bundle)paramVarArgs[i]);
      }
      for (;;)
      {
        i += 1;
        break;
        if ((paramVarArgs[i] instanceof Parcelable))
        {
          localBundle.putParcelable(String.valueOf(i), (Parcelable)paramVarArgs[i]);
        }
        else if ((paramVarArgs[i] instanceof w.a))
        {
          w.i("MicroMsg.CaptureMMProxy", "objectsToBundle: %s", new Object[] { Integer.valueOf(((w.a)paramVarArgs[i]).ordinal()) });
          localBundle.putInt(String.valueOf(i), ((w.a)paramVarArgs[i]).ordinal());
        }
        else
        {
          localBundle.putSerializable(String.valueOf(i), (Serializable)paramVarArgs[i]);
        }
      }
    }
    GMTrace.o(7334998835200L, 54650);
    return localBundle;
  }
  
  public void onCallback(String paramString, Bundle paramBundle, boolean paramBoolean)
  {
    GMTrace.i(7335133052928L, 54651);
    w.i("MicroMsg.CaptureMMProxy", "class:%s, method:%s, clientCall:%B", new Object[] { getClass().getName(), paramString, Boolean.valueOf(paramBoolean) });
    Object localObject2 = null;
    for (;;)
    {
      int i;
      Object localObject1;
      try
      {
        Method[] arrayOfMethod = getClass().getMethods();
        int j = arrayOfMethod.length;
        i = 0;
        localObject1 = localObject2;
        if (i >= j) {
          break label240;
        }
        localObject1 = arrayOfMethod[i];
        if (!((Method)localObject1).getName().equalsIgnoreCase(paramString)) {
          break label257;
        }
      }
      catch (Exception paramString)
      {
        w.e("MicroMsg.CaptureMMProxy", "exception:%s", new Object[] { bg.f(paramString) });
        GMTrace.o(7335133052928L, 54651);
        return;
      }
      if (((Method)localObject1).isAnnotationPresent((Class)localObject2))
      {
        localObject2 = ((Method)localObject1).invoke(this, getArgs(paramBundle));
        if (((Method)localObject1).getReturnType() != Void.TYPE)
        {
          if ((localObject2 instanceof Parcelable))
          {
            paramBundle.putParcelable("result_key", (Parcelable)localObject2);
            GMTrace.o(7335133052928L, 54651);
            return;
          }
          if ("getConfigStorage".equals(paramString)) {
            w.i("MicroMsg.CaptureMMProxy", "put result as Serializable: %s", new Object[] { (Serializable)localObject2 });
          }
          paramBundle.putSerializable("result_key", (Serializable)localObject2);
        }
      }
      GMTrace.o(7335133052928L, 54651);
      return;
      label240:
      if (localObject1 != null) {
        if (paramBoolean)
        {
          localObject2 = com.tencent.mm.remoteservice.e.class;
          continue;
          label257:
          i += 1;
        }
        else
        {
          localObject2 = com.tencent.mm.remoteservice.f.class;
        }
      }
    }
  }
  
  public boolean set(w.a parama, Object paramObject)
  {
    GMTrace.i(7332985569280L, 54635);
    Boolean localBoolean = (Boolean)REMOTE_CALL("setConfigStorage", new Object[] { parama, paramObject });
    w.d("MicroMsg.CaptureMMProxy", "setConfigStorage, %s %s", new Object[] { parama, paramObject });
    boolean bool = localBoolean.booleanValue();
    GMTrace.o(7332985569280L, 54635);
    return bool;
  }
  
  @com.tencent.mm.remoteservice.f
  public boolean setConfigStorage(int paramInt, Object paramObject)
  {
    GMTrace.i(7334461964288L, 54646);
    w.a locala = ((w.a[])w.a.class.getEnumConstants())[paramInt];
    w.i("MicroMsg.CaptureMMProxy", "setConfigStorage, %s %s", new Object[] { locala, paramObject });
    h.xz();
    h.xy().xh().a(locala, paramObject);
    GMTrace.o(7334461964288L, 54646);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\model\CaptureMMProxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */